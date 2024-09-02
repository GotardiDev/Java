import java.util.Random;
import java.util.Scanner;

public class ProjetoAdivinhe {
    public static void main(String[] args) {
        Scanner mensagem = new Scanner(System.in);

        int Secreto = new Random().nextInt(10);
        int Chute = 0;
        int ContadorDeTentativas = 0;

        while (ContadorDeTentativas < 5) {
            System.out.println("Digite um CHUTE: ");
            Chute = mensagem.nextInt();
            ContadorDeTentativas++;

            if (Chute==Secreto) {
                System.out.println("Parabens voce acertou o numero secreto");
                break;
            } else if (Chute < Secreto) {
                System.out.println("O numero gerado foi maior  ");
            } else {
                System.out.println("O numero gerado foi menor ");
            }

        }
        if (ContadorDeTentativas == 5 && Chute != Secreto) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + Secreto);
        }
    }
}







