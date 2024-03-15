public class Ex06 {
    public static void executar(){
        /*6. Elabore um programa que leia um vetor com 5 notas de um aluno e um outro vetor 
        com 5 pesos e calcule a média ponderada do aluno. 
        Média ponderada =
        nota1 * peso1 + nota2 * peso2 + nota3 * peso3
        peso1 + peso2 + peso3
        Ex.: notas: 7.5, 9.2 pesos: 6, 4. Média ponderada: (7.5 * 6 + 9.2 * 4) / (6 + 4) */

        double[] notas = new double[5];
        double[] pesos = new double[5];

        for(int i = 0;i < notas.length;i++){
            notas[i] = Prompt.lerDecimal("Informe o valor da " + (i + 1) + "° nota: ");
        }
        for(int i = 0;i < pesos.length;i++){
            pesos[i] = Prompt.lerDecimal("Informe o valor do " + (i + 1) + "° peso: ");
        }

        double media = ((notas[0] * pesos[0]) + (notas[1] * pesos[1]) + (notas[2] * pesos[2]) + (notas[3] * pesos[3]) + (notas[4] * pesos[4])) / (pesos[0] + pesos[1] + pesos[2] + pesos[3] + pesos[4]);
        Prompt.imprimir("Média ponderada = " + media);
    }
}
