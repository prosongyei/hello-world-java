public class Casting {
    public static void main(String[] args) {
        int qty = 7;
        double d = qty;                 // widening: automatic
        System.out.println("d = " + d);
 
        double price = 9.99;
        int whole = (int) price;        // narrowing: explicit
        System.out.println("whole = " + whole);
 
        int total = 7, people = 2;
        System.out.println(total / people);            // 3
        System.out.println((double) total / people);   // 3.5
 
        byte b = (byte) 200;            // overflow!
        System.out.println("b = " + b);
 
        int n = Integer.parseInt("125");    // String -> int
        String s = String.valueOf(3.14);    // double -> String
        System.out.println(n + 1 + " / " + s);
    }
}