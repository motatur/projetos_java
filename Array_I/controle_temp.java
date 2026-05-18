import java.util.ArrayList;
import java.util.Scanner;

public class controle_temp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Double> celsius = new ArrayList<>();
        ArrayList<Double> fahrenheit = new ArrayList<>();

        double somaCelsius = 0;
        double somaFahrenheit = 0;

        while (true) {

            System.out.print("Digite a temperatura em Celsius (ou 'sair'): ");
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            double tempC = Double.parseDouble(entrada);

            double tempF = (tempC * 9 / 5) + 32;

            celsius.add(tempC);
            fahrenheit.add(tempF);

            somaCelsius += tempC;
            somaFahrenheit += tempF;
        }

        double mediaCelsius = somaCelsius / celsius.size();
        double mediaFahrenheit = somaFahrenheit / fahrenheit.size();

        System.out.println("\nTemperaturas em Celsius:");

        for (double temp : celsius) {
            System.out.println(temp);
        }

        System.out.println("\nTemperaturas em Fahrenheit:");

        for (double temp : fahrenheit) {
            System.out.println(temp);
        }

        System.out.println("\nMédia Celsius: " + mediaCelsius);
        System.out.println("Média Fahrenheit: " + mediaFahrenheit);

        sc.close();
    }
}