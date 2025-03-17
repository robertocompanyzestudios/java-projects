public class XorSwap {
    public static void main(String[] args) {
        int x = 8, y=10;

        System.out.println("x=" + x + " y=" + y);

        //xor swap
        x = y ^ x;
        y = y ^ x;
        x = y ^ x;


        System.out.println("x=" + x + " y=" + y);

    }
}
