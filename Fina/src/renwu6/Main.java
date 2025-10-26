package renwu6;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            StudentManager manager = new StudentManager();
            StudentFileHandler fileHandler = new StudentFileHandler();

            manager.setStudents(fileHandler.load());//加载学生信息然后将其放进学生管理系统里面

            while (true) {
                System.out.println("\n====== 学生信息管理系统 ======");
                System.out.println("1. 添加学生信息");
                System.out.println("2. 删除学生信息");
                System.out.println("3. 查询学生信息");
                System.out.println("4. 修改学生信息");
                System.out.println("5. 显示所有学生信息");
                System.out.println("0. 退出");
                System.out.print("选择操作：");
                int choice = sc.nextInt();
                sc.nextLine(); // 清除换行

                switch (choice) {
                    case 1 -> {
                        System.out.print("学号：");
                        String id = sc.nextLine();
                        if (manager.findById(id) != null) {
                            System.out.println("? 学号已存在！");
                            break;
                        }
                        System.out.print("姓名："); String name = sc.nextLine();
                        System.out.print("年龄："); int age = sc.nextInt(); sc.nextLine();
                        System.out.print("性别："); String gender = sc.nextLine();
                        System.out.print("专业："); String major = sc.nextLine();
                        System.out.print("年级："); String grade = sc.nextLine();
                        System.out.print("班级："); String className = sc.nextLine();
                        System.out.print("辅导员："); String counselor = sc.nextLine();
                        System.out.print("家庭地址："); String address = sc.nextLine();

                        Student s = new Student(id, name, age, gender, major, grade, className, counselor, address);
                        manager.addStudent(s);
                        System.out.println("? 添加成功！");
                    }
                    case 2 -> {
                        System.out.print("输入学号删除学生：");
                        String id = sc.nextLine();
                        if (manager.deleteStudent(id)) {
                            System.out.println("? 删除成功！");
                        } else {
                            System.out.println("? 未找到该学生！");
                        }
                    }
                    case 3 -> {
                        System.out.println("1. 按学号查找  2. 按姓名模糊查找");
                        int option = sc.nextInt(); sc.nextLine();
                        if (option == 1) {
                            System.out.print("输入学号：");
                            String id = sc.nextLine();
                            Student s = manager.findById(id);
                            System.out.println(s != null ? s : "? 未找到！");
                        } else {
                            System.out.print("输入姓名关键词：");
                            String keyword = sc.nextLine();
                            manager.findByName(keyword).forEach(System.out::println);//.forEach(System.out::println)   遍历上一步返回的集合，逐个打印每个符合条件的对象信息。

                        }
                    }
                    case 4 -> {
                        System.out.print("输入要修改的学生学号：");
                        String id = sc.nextLine();
                        Student s = manager.findById(id);
                        if (s == null) {
                            System.out.println("? 学生不存在！");
                            break;
                        }
                        System.out.print("新姓名："); String name = sc.nextLine();
                        System.out.print("新年龄："); int age = sc.nextInt(); sc.nextLine();
                        System.out.print("新性别："); String gender = sc.nextLine();
                        System.out.print("新专业："); String major = sc.nextLine();
                        System.out.print("新年级："); String grade = sc.nextLine();
                        System.out.print("新班级："); String className = sc.nextLine();
                        System.out.print("新辅导员："); String counselor = sc.nextLine();
                        System.out.print("新家庭地址："); String address = sc.nextLine();

                        Student updated = new Student(id, name, age, gender, major, grade, className, counselor, address);
                        manager.updateStudent(updated);
                        System.out.println("? 修改成功！");
                    }
                    case 5 -> {
                        manager.getAllStudents().forEach(System.out::println);
                    }
                    case 0 -> {
                        fileHandler.save(manager.getAllStudents());
                        System.out.println("? 已保存所有数据，再见！");
                        return;
                    }
                    default -> System.out.println("? 无效的选项！");
                }
            }
        }
    }

