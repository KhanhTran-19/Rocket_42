public class Question1 {
    public static void main(String[] args){
        try {
            float result = divide(7, 0);
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }
        finally {
            System.out.println("divide completed!");
        }
    }

    public static float divide(int a, int b){
        return a/b;
    }
}
