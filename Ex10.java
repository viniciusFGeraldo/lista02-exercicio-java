import java.util.Arrays;

public class Ex10 {
    public static void executar(){
        /*10. Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, copie 
        os elementos de A em B de forma invertida. Ou seja, o primeiro elemento de A é o 
        último elemento de B, o segundo elemento de A é o penúltimo elemento de B, e assim 
        por diante. */

        int[] A = new int[5];
        int[] B = new int[5];

        for(int i = 0;i < A.length;i++){
            A[i] = Prompt.lerInteiro("Informe o " + (i + 1) + "° valor de A: ");
        }
        for(int i = 0;i < A.length;i++){
            B[B.length - i - 1] = A[i];
        }

        Prompt.imprimir(Arrays.toString(B));
    }
    
}
