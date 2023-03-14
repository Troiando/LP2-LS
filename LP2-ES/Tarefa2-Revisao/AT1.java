import java.util.Scanner;

public class AT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f,c;
            System.out.print("Digite a temperatura em Fahrenheit: ");
            f = sc.nextDouble();
            c = (5.0 / 9.0) * (f - 32.0);
            System.out.printf("Graus Fahrenheit "+ f + " ,graus Celsius "+ c);
            sc.close();
    }
}