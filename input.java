import java.util.Scanner;
 
public class Receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        System.out.print("Enter unit price ($): ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
 
        final double VAT = 0.10;
        double subtotal = price * qty;
        double total = subtotal * (1 + VAT);
 
        System.out.printf("%-10s %s%n", "Product:", name);
        System.out.printf("%-10s %.2f%n", "Subtotal:", subtotal);
        System.out.printf("%-10s %.2f%n", "Total:", total);
        sc.close();
    }
}
