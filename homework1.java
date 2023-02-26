package java_seminar1;
import java.util.Scanner;
public class homework1 {
    public static void main(String[] args) {
        int n = InputConsole();
        double t = calc_triangle(n);
        System.out.println(t);
    }
    public static int InputConsole () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N -");
        int t = sc.nextInt();
        return t;
    }
    public static double calc_triangle(int n) {
        double t;
        t=0.5*n*(n+1);
        return t;
    }
}
