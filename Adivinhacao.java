import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random  aleatorio = new Random();

        int numeroSecreto = aleatorio.nextInt(100) + 1;
        int tentativa;
        int tentativas = 0;
        int erros = 0;

        System.out.println("Seja bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar um numero de 1 a 100.");

        do { 
            System.out.println("Digite um numero: ");
            tentativa = teclado.nextInt();
            tentativas++;


        
        if (tentativa < numeroSecreto) {
            System.out.println("O numero secreto é maior");
            erros ++;
            
        } else if (tentativa > numeroSecreto) {
            System.out.println("O numero secreto é menor");
            erros ++;
        }else {
            System.out.println("Parabens, voce acertou !");
            System.out.println("Numero de tentativas: " + tentativas);
            System.out.println("ERROS: " + erros);
        }
        } while (tentativa != numeroSecreto);
      
        teclado.close();
    
    }
}
