import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        int consumoKmLitro = 12; //km por litro
        int distanciaViagem = 360; //km totais

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor do litro do Combustível (ex: 6.01):");
        Double valorCombustivel = Double.parseDouble(entrada.nextLine());

        double totalConsumo = getConsumo(distanciaViagem, consumoKmLitro);
        double totalGasto = getGastoTotal(totalConsumo, valorCombustivel);

        System.out.println("");
        System.out.printf("O consumo total da viagem será de %.2f litros.",totalConsumo);
        System.out.println("");
        System.out.printf("O gasto total da viagem será de %.2f.", totalGasto);
        System.out.println("");

        entrada.close();

    }

    static double getConsumo(int distanciaViagem, int consumoKmLitro) {
        return (double) distanciaViagem / consumoKmLitro;
    }

    static double getGastoTotal( double totalConsumo, double valorCombustivel) {
        return (double) totalConsumo * valorCombustivel;
    }
}