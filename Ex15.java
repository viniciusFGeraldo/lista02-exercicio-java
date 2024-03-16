import java.util.Arrays;

public class Ex15 {
    public static void executar(){
        /*15. Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de 
        acordo com a seguinte regra: com exceção do 1º número, só é permitido armazenar 
        um número se ele for maior que o anterior. Ex.: se o primeiro valor lido for 5, o próximo 
        valor lido só poderá ser maior que 5 */

        int[] vetor = new int[5];

        vetor[0] = Prompt.lerInteiro("Informe o 1° valor do vetor: ");

        for(int i = 1;i < vetor.length;i++){
            int num = Prompt.lerInteiro("Informe o " + (i + 1) + "° valor do vetor: ");
            if(num < vetor[0]){
                i--;
            }else{
                vetor[i] = num;
            }
        }
        Prompt.imprimir(Arrays.toString(vetor)); 
    }    
}
