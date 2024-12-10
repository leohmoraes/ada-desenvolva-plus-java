import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        double somaNota = 0; //somatorio de notas

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos da turma:");
        int totalAlunos = Integer.parseInt(entrada.nextLine()); //formata a entrada para int

        Aluno[] alunos = new Aluno[totalAlunos]; //instancia a classe Aluno, composta de nome e nota

        for (int index = 0; index < totalAlunos; index++) { 
            
            System.out.printf("Informe o nome do Aluno %d: ", index+1);
            String inputAluno = entrada.nextLine();

            System.out.printf("Informe a nota do Aluno %d: ",index+1);
            Double inputNota = Double.parseDouble(entrada.nextLine());

            alunos[index] = new Aluno(inputAluno, inputNota);

            somaNota += inputNota;
        }

        Double mediaAlunos =  somaNota / totalAlunos;
        System.out.println("");
        System.out.printf("A nota média da turma é %.2f.",mediaAlunos);
        System.out.println("");

        System.out.println("Alunos aprovados:");

        for (int i = 0; i < totalAlunos; i++) {
            if (alunos[i].nota > mediaAlunos) {
                System.out.println("- " + alunos[i].nome);
            }
        }

        entrada.close();

    }
}

class Aluno {
    String nome;
    Double nota;
    
    public Aluno(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }
}