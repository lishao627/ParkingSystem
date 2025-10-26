package vehicle;
import javax.swing.*;
import java.awt.*;
import java.time.format.DateTimeFormatter;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.ArrayList;
public class ParkingGUI extends JFrame {
    private final ParkingLot parkingLot = new ParkingLot(6);
    private final JTextField plateInput = new JTextField(10);
    private final JComboBox<String> typeSelect = new JComboBox<>(new String[]{"小轿车", "货车", "电动车"});
    private final DefaultTableModel tableModel;
    private final JTable statusTable;
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd HH:mm");

    public ParkingGUI() {
        setTitle("智能停车场系统");
        setSize(700, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 顶部操作区
        JPanel controlPanel = new JPanel(new GridBagLayout());
        controlPanel.setBorder(new TitledBorder("车辆操作区"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0; gbc.gridy = 0;
        controlPanel.add(new JLabel("车牌号:"), gbc);
        gbc.gridx = 1;
        controlPanel.add(plateInput, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        controlPanel.add(new JLabel("车型:"), gbc);
        gbc.gridx = 1;
        controlPanel.add(typeSelect, gbc);

        JButton parkButton = new JButton("入场");
        JButton releaseButton = new JButton("出场");
        JButton refreshButton = new JButton("刷新状态");

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0));
        btnPanel.add(parkButton);
        btnPanel.add(releaseButton);
        btnPanel.add(refreshButton);

        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2;
        controlPanel.add(btnPanel, gbc);

        add(controlPanel, BorderLayout.NORTH);

        // 中间状态显示区，用表格
        String[] columns = {"车位号", "状态", "车牌号", "车型", "入场时间"};
        tableModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) { return false; }
        };
        statusTable = new JTable(tableModel);
        statusTable.setRowHeight(28);
        statusTable.getTableHeader().setReorderingAllowed(false);
        add(new JScrollPane(statusTable), BorderLayout.CENTER);

        // 底部提示
        JLabel footerLabel = new JLabel("欢迎使用智能停车场系统 ");
        footerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        footerLabel.setFont(new Font("微软雅黑", Font.BOLD, 14));
        add(footerLabel, BorderLayout.SOUTH);

        // 按钮事件

        parkButton.addActionListener(e -> {
            String plate = plateInput.getText().trim();
            if (plate.isEmpty()) {
                JOptionPane.showMessageDialog(this, "车牌号不能为空！", "输入错误", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String type = (String) typeSelect.getSelectedItem();
            Vehicle v;
            switch (type) {
                case "小轿车": v = new Car(plate); break;
                case "货车": v = new Truck(plate); break;
                case "电动车": v = new ElectricCar(plate); break;
                default:
                    JOptionPane.showMessageDialog(this, "未知车型！", "错误", JOptionPane.ERROR_MESSAGE);
                    return;
            }
            boolean success = parkingLot.parkVehicle(v);
            if (success) {
                JOptionPane.showMessageDialog(this, "车辆入场成功！", "成功", JOptionPane.INFORMATION_MESSAGE);
                plateInput.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "停车场已满，无法入场", "失败", JOptionPane.WARNING_MESSAGE);
            }
            refreshStatusTable();
        });

        releaseButton.addActionListener(e -> {
            String plate = plateInput.getText().trim();
            if (plate.isEmpty()) {
                JOptionPane.showMessageDialog(this, "请输入车牌号！", "输入错误", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Vehicle v = parkingLot.releaseVehicle(plate);
            if (v != null) {
                LocalDateTime outTime = LocalDateTime.now();
                double fee = v.calculateFee(outTime);
                String info = String.format("车辆【%s】出场成功！\n停车时间：%s - %s\n停车费用：%.2f元",
                        v.getPlateNumber(),
                        v.getInTime().format(dtf),
                        outTime.format(dtf),
                        fee);
                JOptionPane.showMessageDialog(this, info, "结算信息", JOptionPane.INFORMATION_MESSAGE);
                plateInput.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "未找到该车牌车辆！", "失败", JOptionPane.WARNING_MESSAGE);
            }
            refreshStatusTable();
        });

        refreshButton.addActionListener(e -> refreshStatusTable());

        refreshStatusTable();
    }

    // 刷新表格状态
    private void refreshStatusTable() {
        tableModel.setRowCount(0);
        for (ParkingSpot spot : parkingLot.getSpots()) {
            String status = spot.isOccupied() ? "已占用" : "空闲";
            String plate = "";
            String type = "";
            String inTime = "";
            if (spot.isOccupied()) {
                Vehicle v = spot.getParkedVehicle(); 
                plate = v.getPlateNumber();
                type = v.getType();
                inTime = v.getInTime().format(dtf);
            }
            tableModel.addRow(new Object[]{spot.getSpotNumber(), status, plate, type, inTime});
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ParkingGUI gui = new ParkingGUI();
            gui.setVisible(true);
        });
    }
}
