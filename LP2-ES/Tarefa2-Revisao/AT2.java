import java.util.Scanner;

    public class AT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a pressão: ");
        double pressao = sc.nextDouble();

        System.out.print("Digite o volume: ");
        double vol = sc.nextDouble();

        System.out.print("Digite a temperatura C°: ");
        double temp = sc.nextDouble();

        double massa = (pressao * vol) / (0.37 * (temp + 273.15));

        System.out.printf("A massa de ar do pneu é de " + massa);

        sc.close();
    }
}