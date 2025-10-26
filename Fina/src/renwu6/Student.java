package renwu6;

public class Student {
    private String id;
    private String name;
    private int age;
    private String gender;
    private String major;
    private String grade;
    private String className;
    private String counselor;
    private String address;

    public Student(String id, String name, int age, String gender,
                   String major, String grade, String className,
                   String counselor, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.major = major;
        this.grade = grade;
        this.className = className;
        this.counselor = counselor;
        this.address = address;
    }


    @Override
    public String toString() {
        return id + "," + name + "," + age + "," + gender + "," +
                major + "," + grade + "," + className + "," +
                counselor + "," + address;
    }

    public static Student fromString(String data) {
        String[] parts = data.split(",");
        return new Student(
                parts[0], parts[1], Integer.parseInt(parts[2]), parts[3],
                parts[4], parts[5], parts[6], parts[7], parts[8]
        );
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

}

