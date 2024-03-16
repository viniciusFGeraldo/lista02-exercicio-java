import java.util.Arrays;

public class Ex11 {
    public static void executar(){
        /*11. Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteiros 
        de tamanho igual a 5. Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 + 
        8*9 = 140 */

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int resultado = 0;

        for(int i = 0;i < vetor1.length;i++){
            vetor1[i] = Prompt.lerInteiro("Informe o " + (i + 1) + "° valor do vetor1: ");
        }

        for(int i = 0;i < vetor2.length;i++){
            vetor2[i] = Prompt.lerInteiro("Informe o " + (i + 1) + "° valor do vetor2: ");
        }

        for(int i = 0;i < vetor1.length;i++){
            resultado += (vetor1[i] * vetor2[i]);
        }

        Prompt.imprimir(resultado);
    }
}
