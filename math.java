public class math {
    public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        math math = new math();
        int result = math.add(5, 7);
        System.out.println("Sum: " + result);
    }
}
