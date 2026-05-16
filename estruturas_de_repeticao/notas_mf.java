import java.util.Scanner;
public class notas_mf {
public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    for(int aluno = 1; aluno <= 4; aluno++) {

        System.out.println("Digite a primeira nota: ");
        float nota1 = sc.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float nota2 = sc.nextFloat();

        System.out.println("Digite a terceira nota: ");
        float nota3 = sc.nextFloat();

        System.out.println("Digite a quarta nota: ");
        float nota4 = sc.nextFloat();

        float media = (nota1+nota2+nota3+nota4) / 4;

        if(media>=7){
            System.out.println("Aprovado!!");
        } else if(media >= 5 && media < 7) {
            System.out.println("Você está de recuperação.");
        } else if(media<5){
            System.out.println("Você está reprovado.");         
}
}
sc.close();
}
}