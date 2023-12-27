public class Exercise4 {
    public static class Student {
        private int id;
        private String name;
        private String hometown;
        private double diem_hoc_luc;

        public Student(String name, String hometown) {
            this.name = name;
            this.hometown = hometown;
            this.diem_hoc_luc = 0;
        }

        public void setGpa(double diem_hoc_luc) {
            this.diem_hoc_luc = diem_hoc_luc;
        }

        public void addGpa(double diem_hoc_luc) {
            this.diem_hoc_luc += diem_hoc_luc;
        }

        public void printInfo() {
            System.out.println("Ten: " + name);
            if (diem_hoc_luc < 4.0) {
                System.out.println("Diem hoc luc: Yeu");
            } else if (diem_hoc_luc >= 4.0 && diem_hoc_luc < 6.0) {
                System.out.println("Diem hoc luc: Trung binh");
            } else if (diem_hoc_luc >= 6.0 && diem_hoc_luc < 8.0) {
                System.out.println("Diem hoc luc: Kha");
            } else {
                System.out.println("Diem hoc luc: Gioi");
            }
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Axx", "HCM");
        student.setGpa(7.5);
        student.printInfo();

        student.addGpa(1.5);
        student.printInfo();
    }
}
