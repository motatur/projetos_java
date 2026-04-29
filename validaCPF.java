import java.util.Scanner;

public class validaCPF {

    public static boolean validarCPF(String cpf) {

        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("\\D", "");

        // Verifica tamanho
        if (cpf.length() != 11) return false;

        // Verifica se todos os dígitos são iguais
        if (cpf.matches("(\\d)\\1{10}")) return false;

        try {
            // Cálculo do 1º dígito verificador
            int soma = 0;
            for (int i = 0; i < 9; i++) {
                soma += (cpf.charAt(i) - '0') * (10 - i);
            }

            int resto = soma % 11;
            int dig1 = (resto < 2) ? 0 : 11 - resto;

            // Cálculo do 2º dígito verificador
            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += (cpf.charAt(i) - '0') * (11 - i);
            }

            resto = soma % 11;
            int dig2 = (resto < 2) ? 0 : 11 - resto;

            // Verifica se os dígitos calculados são iguais aos informados
            return dig1 == (cpf.charAt(9) - '0') &&
                   dig2 == (cpf.charAt(10) - '0');

        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();

        if (validarCPF(cpf)) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido!");
        }

        sc.close();
    }
}