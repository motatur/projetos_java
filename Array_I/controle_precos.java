import java.util.Scanner;
public class controle_precos{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double[] precos = new double[5];
    for (int i = 0; i < precos.length; i++) {

        System.out.print("Digite o preço " + (i + 1) + ": ");
        precos[i] = sc.nextDouble();
        }



    sc.close();
}
    
}