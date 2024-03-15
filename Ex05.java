public class Ex05 {
    public static void executar(){
        /*5. Elabore um programa que leia 5 números do teclado e os armazene em um vetor. 
        Em seguida, leia um número n qualquer e apresente na tela a quantidade de vezes 
        que o número n aparece no vetor. */

        int[] vetor = new int[5];
        int qtdN = 0;

        for(int i = 0;i < vetor.length;i++){
            vetor[i] = Prompt.lerInteiro("Informe o " + (i + 1) + "° valor: ");
        }
        int n = Prompt.lerInteiro("Informe um número,escolha bem pois ele é muito importante: ");

        for(int i = 0;i < vetor.length;i++){
            if(vetor[i] == n){
                qtdN++;
            }
        }
        Prompt.imprimir("o valor de N apareceu no vetor " + qtdN + " vezes.");
    }
}
