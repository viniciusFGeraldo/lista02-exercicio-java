public class Ex02 {
    public static void executar(){
        /*2. Escreva um algoritmo que leia em um vetor uma sequência finita de números 
        digitados pelo usuário e, logo após, mostre o número de cada posição do vetor e se 
        ele é positivo, negativo ou zero.*/

        int[] vetor = new int[5];

        for(int i = 0;i < vetor.length;i++){
            vetor[i] = Prompt.lerInteiro("Informe o " + (i +1) + "° valor: ");
        }
        for(int i = 0;i < vetor.length;i++){
            if(vetor[i] < 0){
                Prompt.imprimir("A posição " + i + " tem valor " + vetor[i] + " e tem valor NEGATIVO.");
            }else if(vetor[i] == 0){
                Prompt.imprimir("A posição " + i + " tem valor " + vetor[i] + " e tem valor NULO.");
            }else if(vetor[i] > 0){
                Prompt.imprimir("A posição " + i + " tem valor " + vetor[i] + " e tem valor POSITIVO.");
            }
        }
    }
}
    

