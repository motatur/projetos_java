import java.util.Scanner;

public class controle_precos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] precos = new double[5];

        for (int i = 0; i < precos.length; i++) {

            System.out.print("Digite o preço " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
        }

        double maior = precos[0];
        double menor = precos[0];

        for (int i = 0; i < precos.length; i++) {

            if (precos[i] > maior) {
                maior = precos[i];
            }

            if (precos[i] < menor) {
                menor = precos[i];
            }
        }

        System.out.println("\nMaior preço: " + maior);
        System.out.println("Menor preço: " + menor);

        sc.close();
    }
}