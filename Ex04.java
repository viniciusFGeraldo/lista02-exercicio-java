public class Ex04 {
    public static void executar(){
        /*4. Elabore um programa que leia um vetor de 5 números digitados pelo usuário e uma 
        variável de um número n qualquer, depois mostre na tela o índice dos elementos que 
        são inferiores a n */

        int[] vetor = new int[5];
        String resultado = "";

        Prompt.imprimir("Abaixo preciso que informe 5 Números,vamos lá: ");

        for(int i = 0;i < vetor.length;i++){
            vetor[i] = Prompt.lerInteiro("Informe o " + (i + 1) + "° número: ");
        }
        int n = Prompt.lerInteiro("Informe um número qualquer,esse decidirá tudo,então escolha bem: ");

        Prompt.imprimir("Boa escolha,agora vou te mostrar o resultado, ");
        Prompt.imprimir("Abaixo está os indices e o valores deles que eram menores do que o ultimo número que vc escolheu,confere ai: ");
        for(int i = 0;i < vetor.length;i++){
            if(vetor[i] < n){
                resultado += "Indice = " + i + " Valor " + vetor[i] + " - ";
            }
        }
        Prompt.imprimir(resultado);
    }    
}
