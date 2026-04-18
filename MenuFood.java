import java.util.Scanner;
public class MenuFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. South Indian\n2. Chinese\n3. Italian");
        int ch = sc.nextInt();
        switch(ch) {
            case 1: System.out.println("You chose South Indian"); break;
            case 2: System.out.println("You chose Chinese"); break;
            case 3: System.out.println("You chose Italian"); break;
            default: System.out.println("Invalid choice");
        }
    }
}