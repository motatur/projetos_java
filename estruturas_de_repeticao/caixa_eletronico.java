import java.util.Scanner;
public class caixa_eletronico {
Scanner sc = new Scanner(System.in);
public static void main (String[]args){
    Scanner sc = new Scanner(System.in);

    int senhaCorreta = 4321;
    int tentativas = 0; // aqui o contador começa em 0
    boolean acessoGarantido = false;

    while (tentativas < 3) {
        System.out.println("Digite sua senha: (3 tentativas)");
        int senhadigitada = sc.nextInt();

        if(senhaCorreta==senhadigitada){
            System.out.println("Acesso liberado.");
            acessoGarantido = true;
            break;
        } else {
            tentativas++;
            System.out.println("Senha incorreta. 1/" + tentativas + " de 3 tentativas");
        }
    }
    if(!acessoGarantido){
        System.out.println("Acesso bloqueado");

}
sc.close();
}
}