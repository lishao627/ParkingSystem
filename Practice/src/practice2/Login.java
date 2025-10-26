package practice2;

public class Login {
    public static void main(String[] args) {
        Login lo =new Login();
        lo.showUI();

    }
    public void showUI(){
        javax.swing.JFrame jf=new javax.swing.JFrame();
        jf.setTitle("QQ登录界面");
        jf.setSize(400,500);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
    java.awt.FlowLayout flow=new java.awt.FlowLayout();
    jf.setLayout(flow);
    javax.swing.ImageIcon icon=new javax.swing.ImageIcon();
    }
}
