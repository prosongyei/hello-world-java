public class Format {
    public static void main(String[] args) {
        String item = "Keyboard";
        int qty = 3;
        double price = 24.5;
 
        System.out.printf("Item: %s%n", item);
        System.out.printf("Qty : %d pcs%n", qty);
        System.out.printf("Unit: $%.2f%n", price);
        System.out.printf("|%10s|%-10s|%n", "right", "left");
        System.out.printf("|%05d|%,.2f|%n", 42, 1234567.891);
 
        String line = String.format("%s x %d = $%.2f", item, qty, qty * price);
        System.out.println(line);
    }
}
