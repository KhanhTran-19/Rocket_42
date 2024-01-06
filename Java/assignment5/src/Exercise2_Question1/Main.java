package Exercise2_Question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyen Van A", 0));
        students.add(new Student(2, "Nguyen Van B", 0));
        students.add(new Student(3, "Nguyen Van C", 0));
        students.add(new Student(4, "Nguyen Van D", 0));
        students.add(new Student(5, "Nguyen Van E", 0));
        students.add(new Student(6, "Nguyen Van F", 0));
        students.add(new Student(7, "Nguyen Van G", 0));
        students.add(new Student(8, "Nguyen Van H", 0));
        students.add(new Student(9, "Nguyen Van I", 0));
        students.add(new Student(10, "Nguyen Van J", 0));

        Random random = new Random();
        for (Student student : students) {
            int group = random.nextInt(3) + 1;
            student.setGroup(group);
        }

        System.out.println("Diem danh ca lop:");
        for (Student student : students) {
            student.diemDanh();
        }

        System.out.println("Nhom 1 dang hoc bai:");
        for (Student student : students) {
            if (student.getGroup() == 1) {
                student.hocBai();
            }
        }

        System.out.println("Nhom 2 dang don ve sinh:");
        for (Student student : students) {
            if (student.getGroup() == 2) {
                student.diDonVeSinh();
            }
        }
    }
}
