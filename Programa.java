public class Programa {
    public static void main(String[] args) {
        Integer num = Prompt.lerInteiro("Informe qual exercicio deseja executar(1 AO 15): ");

        switch (num) {
            case 1:
                Prompt.separador();
                Ex01.executar();
                break;
            case 2:
                Prompt.separador();
                Ex02.executar(); 
                break;
            case 3:
                Prompt.separador();
                Ex03.executar(); 
                break;
            case 4:
                Prompt.separador();
                Ex04.executar(); 
                break;
            case 5:
                Prompt.separador();
                Ex05.executar(); 
                break;
            case 6:
                Prompt.separador();
                Ex06.executar(); 
                break;
            case 7:
                Prompt.separador();
                Ex07.executar(); 
                break;
            case 8:
                Prompt.separador();
                Ex08.executar(); 
                break;
            case 9:
                Prompt.separador();
                Ex09.executar(); 
                break;
            case 10:
                Prompt.separador();
                Ex10.executar(); 
                break;
            case 11:
                Prompt.separador();
                Ex11.executar(); 
                break;
            case 12:
                Prompt.separador();
                Ex12.executar(); 
                break;
            case 13:
                Prompt.separador();
                Ex13.executar(); 
                break;
            case 14:
                Prompt.separador();
                Ex14.executar(); 
                break;
            case 15:
                Prompt.separador();
                Ex15.executar(); 
                break;
            default:
                Prompt.separador();
                Prompt.imprimir("Valor inválido.");
                break;
        }
    }
}
