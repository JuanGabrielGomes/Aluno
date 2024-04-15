package aluno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);

        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1-Cadastrar alunos");
            System.out.println("2-Cadastar notas");
            System.out.println("3-Calcular médias");
            System.out.println("4-Informar situações");
            System.out.println("5-Informar dados de um aluno");
            System.out.println("6-Alterar nota");
            System.out.println("7-Sair");
            System.out.println("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do aluno: ");
                    String nome = scanner.next();
                    System.out.println("Digite a matrícula do aluno: ");
                    int matricula = scanner.nextInt();
                    a1.setNome(nome);
                    a1.setMatricula(matricula);
                    break;
                case 2:
                    System.out.println("Digite a matrícula do aluno: ");
                    int matriculaNota = scanner.nextInt();
                    if (a1.buscarAluno(matriculaNota)) {
                        System.out.println("Digite a nota 1: ");
                        float nota1 = scanner.nextFloat();
                        System.out.println("Digite a nota 2: ");
                        float nota2 = scanner.nextFloat();
                        System.out.println("Digite a nota 3: ");
                        float nota3 = scanner.nextFloat();
                        a1.setNotas(nota1, nota2, nota3);
                    }
                    break;
                case 3:
                    a1.calcularMedia();
                    break;
                case 4:
                    System.out.println("Situação do aluno: " + a1.getSituacao());
                    break;
                case 5:
                    System.out.println("Digite a matrícula do aluno: ");
                    int matriculaAluno = scanner.nextInt();
                    if (a1.buscarAluno(matriculaAluno)) {
                        System.out.println("Nome: " + a1.getNome());
                        System.out.println("Nota 1: " + a1.getNota1());
                        System.out.println("Nota 2: " + a1.getNota2());
                        System.out.println("Nota 3: " + a1.getNota3());
                        System.out.println("Média: " + a1.getMedia());
                        System.out.println("Situação: " + a1.getSituacao());
                    }
                    break;
                case 6:
                    System.out.println("Digite a matrícula do aluno: ");
                    int matriculaNotaAlterar = scanner.nextInt();
                    System.out.println("Digite o código da nota que deseja alterar: ");
                    int codNota = scanner.nextInt();
                    System.out.println("Digite o novo valor da nota: ");
                    float novoValorNota = scanner.nextFloat();
                    String mensagem = a1.alterarNota(codNota, novoValorNota);
                    System.out.println(mensagem);
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 7);
    }
}