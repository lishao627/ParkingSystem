package renwu6;
import java.util.*;

public class StudentManager {//增删查找更改
    private List<Student> students = new ArrayList<>();

    public boolean addStudent(Student student) {
        if (findById(student.getId()) != null) {
            return false;
        }
        students.add(student);
        return true;
    }

    public boolean deleteStudent(String id) {
        return students.removeIf(s -> s.getId().equals(id));
    }//判断ID是否相等

    public Student findById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id))
                return s;
        }
        return null;
    }

    public List<Student> findByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.toString().contains(name))
                result.add(s);
        }
        return result;
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public boolean updateStudent(Student updated) {
        Student existing = findById(updated.getId());
        if (existing == null) return false;
        students.remove(existing);
        students.add(updated);
        return true;
    }

    public void setStudents(List<Student> studentList) {
        this.students = studentList;
    }
}

