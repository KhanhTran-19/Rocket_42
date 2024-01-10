public class Question4 {
    String[] departments = {"Department 1", "Department 2", "Department 3"};

    public void getIndex(int index) {
        if (index >= 0 && index < departments.length) {
            System.out.println("Department: " + departments[index]);
        } else {
            System.out.println("Cannot find department.");
        }
    }
}
