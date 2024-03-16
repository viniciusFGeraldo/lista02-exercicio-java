import java.util.Arrays;

public class Ex07 {
    public static void executar(){
        /*7. Faça um programa que leia dois vetores de 5 elementos cada e verifique se eles 
        são iguais ou não. Para serem iguais, todos os elementos dos dois vetores devem 
        coincidir. */

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        for(int i = 0;i < vetor1.length;i++){
            vetor1[i] = Prompt.lerInteiro("Informe o " + (i + 1) + "° valor do vetor1: ");
        }

        for(int i = 0;i < vetor2.length;i++){
            vetor2[i] = Prompt.lerInteiro("Informe o " + (i + 1) + "° valor do vetor2: ");
        }

        Arrays.sort(vetor1);
        Arrays.sort(vetor2);

        boolean saoIguais = Arrays.equals(vetor1, vetor2);

        if (saoIguais) {
            System.out.println("Os vetores são iguais (independentemente da ordem).");
        } else {
            System.out.println("Os vetores são diferentes.");
        }

    }
}