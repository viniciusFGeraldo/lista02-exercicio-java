public class Ex12 {
    public static void executar(){
        /*12. Elabore um programa que leia um vetor de 12 elementos apresente na tela o 
        produto dos elementos pares positivos (desconsiderar o zero). Exemplo: {0, 5, 8, 1, -
        6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 3840*/

        int[] vetor = new int[12];
        int resultado = 1;

        for(int i = 0;i < vetor.length;i++){
            vetor[i] = Prompt.lerInteiro("Informe o velor do " + (i + 1) + "° valor do vetor: ");
        }
        for(int i = 0;i < vetor.length;i++){
            if(vetor[i] > 0 && vetor[i] % 2 == 0){
                resultado *= vetor[i]; 
            }
        }
        Prompt.imprimir(resultado);
    }
}
