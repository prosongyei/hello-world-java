import java.util.Scanner;
 
public class Pitfall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();               // consume the leftover Enter
        System.out.print("Enter full name: ");
        String name = sc.nextLine();
        System.out.println(name + " is " + age + " years old.");
    }
}
