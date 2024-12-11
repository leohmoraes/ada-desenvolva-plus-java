import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o número para confirmar se ele é um número primo:");
        int numeroInformado = Integer.parseInt(entrada.nextLine()); //formata a entrada para int

        boolean ehNumeroPrimo = true;
        
        if (numeroInformado <= 1) {
            ehNumeroPrimo = false;
        } else {
            for (int i = 2; i <= numeroInformado/2; i++) {
                if (numeroInformado % i == 0) {
                    ehNumeroPrimo = false;
                    break;
                }
            }
        }
        
        if (ehNumeroPrimo) {
            System.out.printf("%d, é um número primo!", numeroInformado);
        } else {
            System.out.printf("%d, não é um número primo!", numeroInformado);
        }
        System.out.println("");        

        entrada.close();
    }
}
