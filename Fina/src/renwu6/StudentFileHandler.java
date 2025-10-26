package renwu6;

import java.io.*;
import java.util.*;

public class StudentFileHandler {//建立学生系统文件
    private static final String FILE_PATH = "students.txt";//定义了一个全局的、不能改的、只属于这个类的字符串变量FILE_PATH，存的是“students.txt”这个文件名或路径

    public void save(List<Student> students) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (Student s : students) {
                pw.println(s.toString());
            }
        } catch (IOException e) {//输入输出异常
            System.out.println("? 文件保存失败：" + e.getMessage());
        }
    }

    public List<Student> load() {
        List<Student> students = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) return students;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                students.add(Student.fromString(line));//   把一行字符串转换成学生对象，然后加入学生集合里
            }
        } catch (IOException e) {
            System.out.println("? 文件加载失败：" + e.getMessage());
        }
        return students;
    }
}

