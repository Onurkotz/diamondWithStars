import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many line do you want?: ");
        int line = input.nextInt();

        for (int i = 1; i <= line; i++) {
            for (int space = 1; space <= line - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * i) - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 1; i <= line; i++) {
            for (int space = 1; space <=i ; space ++) {
                System.out.print(" ");
            }
            for (int star = ((2*line)-1); star >= ((2 * i) + 1); star --) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
