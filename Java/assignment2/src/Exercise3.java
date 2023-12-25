public class Exercise3 {
    public static void Question1() {
        Integer int_salary = 5000;
        float float_salary = int_salary.floatValue();
        System.out.printf("Luong: %.2f%n", float_salary);
    }

    public static int Question2() {
        String str = "1234567";
        int strValue = Integer.parseInt(str);
        return strValue;
    }

    public static int Question3() {
        String value = "1234567";
        Integer num = Integer.valueOf(value);
        return num.intValue();
    }
}
