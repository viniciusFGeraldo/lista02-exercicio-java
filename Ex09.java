import java.util.Arrays;

public class Ex09 {
    public static void executar(){
        /*9. Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C 
        de acordo com as seguintes regras:
        a. Os elementos das posições pares de C são os elementos das posições pares de A;
        b. Os elementos das posições ímpares de C são os elementos das posições ímpares de B; */

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];

        for(int i = 0;i < A.length;i++){
            A[i] = Prompt.lerInteiro("Informe o " + (i + 1) + "° valor de A: ");
        }

        for(int i = 0;i < B.length;i++){
            B[i] = Prompt.lerInteiro("Informe o " + (i + 1) + "° valor de B: ");
        }
        for(int i = 0;i < C.length;i++){
            if(i % 2 == 0){
                C[i] = A[i];
            }else{
                C[i] = B[i];
            }
        }
        Prompt.imprimir(Arrays.toString(C));
    }
}
