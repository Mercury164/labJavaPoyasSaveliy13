import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        int x = in.nextInt();
        int y = in.nextInt();

        double Smaller = Math.min(x, y);
        double SquareRoot = Math.sqrt(Smaller);
        System.out.println("Min num is: "+Smaller);
        System.out.println("Square root of min num is: "+SquareRoot);

    }
}