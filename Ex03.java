public class Ex03 {
    public static void executar(){
        /*3. Faça um programa que leia em um vetor uma sequência finita de números digitados 
        pelo usuário. Crie um segundo vetor que armazene o dobro de cada número do 
        primeiro vetor e depois apresente os valores deste vetor.*/

        int[] vetor = new int[5];
        int[] vetDobro = new int[5];
        String resultado = "";

        for(int i = 0;i < vetor.length;i++){
            vetor[i] = Prompt.lerInteiro("Informe o " + (i + 1) + "° valor: ");
            vetDobro[i] = vetor[i] * 2;
        }

        for(int i = 0;i < vetor.length;i++){
            resultado += vetDobro[i] + " ";
        }
        Prompt.imprimir(resultado);
    }
}
