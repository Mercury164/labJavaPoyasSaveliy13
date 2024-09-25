//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main2 {
    public Main2() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.print("Введите x: ");
        int x = in.nextInt();
        double Smaller = Math.min(a, b);
        double Bigger = Math.max(a, b);
        double chisl = Bigger - Math.pow(2.0, (double)x) * Smaller;
        double znam = Math.sin(2.0) + Bigger / Smaller;
        double d = chisl / znam;
        System.out.print("Min num: " + Smaller + "\n");
        System.out.print("Max num: " + Bigger + "\n");
        System.out.print("d = " + d + "\n");
    }
}
