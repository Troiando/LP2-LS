import java.util.Scanner;

    public class AT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro termo da PA: ");
        double priTermo = sc.nextDouble();

        System.out.print("Digite a razão da PA: ");
        double razao = sc.nextDouble();

        System.out.print("Digite o número N do termo que deseja calcular: ");
        int n = sc.nextInt();

        double nTermo = priTermo + (n - 1) * razao;

        System.out.printf("O d-ésimo termo da PA é "+ nTermo);
 
        sc.close();
    }
}