public class HelloWorld {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static String formatAddition(int num1, int num2, int result) {
        return String.format("%d+%d=%d", num1, num2, result);
    }

    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println(formatAddition(5, 3, result));
    }
}
