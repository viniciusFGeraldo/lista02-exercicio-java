import java.util.Arrays;

public class Ex14 {
    public static void executar(){
        /*14. Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicione 
        o maior elemento na última posição do vetor. Nenhum número do vetor pode ser 
        apagado ou duplicado. Apresente o vetor atualizado na tela.*/

        int[] vetor = new int[5];
        int aux;

        for(int i = 0;i < vetor.length;i++){
            vetor[i] = Prompt.lerInteiro("Informe o valor do " + (i + 1) + "° vetor: ");
        }
        for(int i = 0;i < vetor.length - 1;i++){
            if(vetor[i] > vetor[i + 1]){
                aux = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = aux;
            }
        }
        Prompt.imprimir(Arrays.toString(vetor));
    }
}
