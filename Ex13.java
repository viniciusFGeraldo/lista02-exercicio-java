import java.util.Arrays;

public class Ex13 {
    public static void executar(){
        /*13. Elabore um algoritmo que receba um número n e retorne um vetor com os n 
        primeiros termos da sequência de Fibonacci. Exemplo: n = 8, vetor = {1, 1, 2, 3, 5, 8, 
        13, 21} */
        int n;
        int a = 0;
        int b = 1;

        
        n = Prompt.lerInteiro("Digite um número: ");
        int[] vetor = new int[n];

        for(int i = 0;i < n;i++){
            vetor[i] = a;
            a = b;
            b = vetor[i] + a;
        }
        
        Prompt.imprimir(Arrays.toString(vetor));
    }
}
