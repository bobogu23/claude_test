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

        System.out.println("Hello, World!");
        subtract();
    }

    public static void subtract() {
        int num1 = 10;
        int num2 = 5;
        int result = num1 - num2;
        System.out.println(num1 + "-" + num2 + "=" + result);
        
    }
}
