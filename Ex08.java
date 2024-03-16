import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex08 {
    public static void executar(){
        /*8. Dados dois vetores A e B de 5 elementos cada, criar um vetor C que representa a 
        concatenação de A e B, ou seja, C contém os elementos de A seguidos dos elementos 
        de B. */

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10];
        int index = 0;

        for(int i = 0;i < A.length;i++){
            A[i] = Prompt.lerInteiro("Informe o " + (i + 1) + "° valor de A: ");
        }

        for(int i = 0;i < B.length;i++){
            B[i] = Prompt.lerInteiro("Informe o " + (i + 1) + "° valor de B: ");
        }

        for(int elemento : A){
            C[index] = elemento;
            index++;
        }
        for (int elemento : B) {
            C[index] = elemento;
            index++;
        }

        Prompt.imprimir("A concatenação resultou em: " + Arrays.toString(C));

    }    
}
