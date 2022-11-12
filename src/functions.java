
import java.util.Scanner;

public class functions {
    public static int printTheAverage(int a, int b, int c){
        int sum = a + b + c;
        return sum / 3;
    }

    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int finalNumber = printTheAverage(a, b, c);
        System.out.println(finalNumber);
    }
}