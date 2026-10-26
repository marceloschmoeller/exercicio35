
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int quantidade = 5;
        int vetor[] = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o valor (" + i + "):");
            vetor[i] = Integer.parseInt(leitor.nextLine());
        }
        int soma = 0;
        for (int i = 0; i < quantidade; i++) {
            soma = soma + vetor[i];
        }
        double media = soma/quantidade;
        
        System.out.println("A media é: " + media);
        System.out.println("A soma é: " + soma);
    }
}
