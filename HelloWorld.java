public class HelloWorld {
    public static void main(String[] args) {
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
