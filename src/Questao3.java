
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas pessoas irão saborear a pizza?");
        int totalPessoas = Integer.parseInt(entrada.nextLine()); //formata a entrada para int

        System.out.println("Quantas fatias tem a pizza?");
        int totalFatias = Integer.parseInt(entrada.nextLine()); //formata a entrada para int

        int fatiasQueSobram = totalFatias%totalPessoas;
        System.out.println("Quantidade de fatias que sobram: " +fatiasQueSobram);

        if(fatiasQueSobram != 0) {
            int fatiasQueFaltam = totalPessoas - fatiasQueSobram;
            System.out.println("Quantidade de fatias que faltam para não ter brigas: " +fatiasQueFaltam);
        } else {
            System.out.println("Não faltam fatias, exceto se todos querem mais!");
        }
        entrada.close();

    }
}

// class Aluno {
//     String nome;
//     Double nota;
    
//     public Aluno(String nome, Double nota) {
//         this.nome = nome;
//         this.nota = nota;
//     }
// }
