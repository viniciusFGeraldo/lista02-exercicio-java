public class Ex01 {
    public static void executar(){
        /*1. Construa um programa que leia em um vetor uma sequência de 5 números digitados 
        pelo usuário, calcule a média e apresente na tela quais valores são menores, iguais 
        ou superiores à média. */

        int[] numeros = new int[5];
        int[] menores = new int[5];
        int[] iguais = new int[5];
        int[] superiores = new int[5];
        int soma = 0;

        for(int i = 0;i < numeros.length;i++){
            numeros[i] = Prompt.lerInteiro("Informe o " + (i + 1) + "° valor: ");
        }

        for(int i = 0;i < numeros.length;i++){
            soma += numeros[i];
        }

        float media = soma / 5;

        for(int i = 0;i < numeros.length;i++){
            if(numeros[i] < media){
                menores[i] = numeros[i];
            }
            if(numeros[i] == media){
                iguais[i] = numeros[i];
            }
            if(numeros[i] > media){
                superiores[i] = numeros[i];
            }
        }
        Prompt.imprimir("Os valores MENORES do que a média são: ");
        String resultado = "";
        for(int i = 0;i < menores.length;i++){
            if(menores[i] != 0){
                resultado += menores[i] + "-";
            }
        }
        Prompt.imprimir(resultado);

        Prompt.imprimir("Os valores IGUAIS a média são: ");
        String resultado2 = "";
        for(int i = 0;i < iguais.length;i++){
            if(iguais[i] != 0){
                resultado2 += iguais[i] + "-";
            }
        }
        Prompt.imprimir(resultado2);

        Prompt.imprimir("Os valores SUPERIORES a média são: ");
        String resultado3 = "";
        for(int i = 0;i < superiores.length;i++){
            if(superiores[i] != 0){
                resultado3 += superiores[i] + "-";
            }
        }
        Prompt.imprimir(resultado3);
        
    }
    
}
