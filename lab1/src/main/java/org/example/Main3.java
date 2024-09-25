import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = in.nextDouble();
        double y; double f;

        if (x<=0){
            y = 1-Math.pow(9,x+1);
            f = Math.exp(Math.tan(2*x+1));
        }
        else if (x>0 && x<=3) {
            y = 1+ Math.pow(3,x);
            f = Math.pow(x,2)-Math.sin(4*x);

        }
        else{
            y = (1/Math.tan(2*x+1));
            f = Math.pow(x,0.4);
        }

        System.out.println("Y = "+y);
        System.out.println("F = "+f);


    }

}
