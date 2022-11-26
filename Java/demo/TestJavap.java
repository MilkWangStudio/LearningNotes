public class TestJavap {

    public static int add(int a, int b) {
        int r = a + b;
        return r;
    }

    public static void main(String[] args) {
        int r = add(15, 16);
        System.out.println(r);
    }

}