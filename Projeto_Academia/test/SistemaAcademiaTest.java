package AtividadesGpt.Projetos.ProjetoAcademia.test;

import AtividadesGpt.Projetos.ProjetoAcademia.dominio.Aluno;
import AtividadesGpt.Projetos.ProjetoAcademia.dominio.AvaliacoesFisicas;
import AtividadesGpt.Projetos.ProjetoAcademia.dominio.PlanoAcademia;

import java.util.Scanner;

public class SistemaAcademiaTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        AvaliacoesFisicas avaliacoesFisicas = new AvaliacoesFisicas();
        PlanoAcademia planoAcademia = new PlanoAcademia();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu ---\n");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Mostrar dados do aluno");
            System.out.println("3 - Calcular IMC");
            System.out.println("4 - Aplicar desconto na mensalidade");
            System.out.println("5 - Cadastrar avaliações físicas");
            System.out.println("6 - Mostrar relatório das avaliações");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0) {
                System.out.println("Atendimento encerrado.");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite seu nome: ");

                    aluno.setNome(scanner.nextLine());
                    if (!aluno.validadorNome()) {
                        System.out.println("Nome inválido!");
                        break;
                    }

                    System.out.println("Digite sua idade: ");
                    aluno.setIdade(scanner.nextInt());
                    aluno.verificadorIdade();

                    System.out.println("Digite seu peso: ");
                    aluno.setPeso(scanner.nextDouble());

                    System.out.println("Digite sua altura: ");
                    aluno.setAltura(scanner.nextDouble());
                    scanner.nextLine();

                    System.out.println("Digite o plano que deseja cadastrar: ");
                    planoAcademia.escolherPlano();
                    break;
                case 2:
                    aluno.imprimeDados();
                    break;
                case 3:
                    aluno.calcularIMC();
                    break;
                case 4:
                    aluno.aplicarDesconto();
                    break;
                case 5:
                    System.out.println("Digite suas avaliações físicas: ");
                    double[] notasDigitadas = new double[5];
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Avaliação " + (i + 1) + ": ");
                        notasDigitadas[i] = scanner.nextDouble();
                    }
                    scanner.nextLine();

                    avaliacoesFisicas.registrarAvaliacoes(notasDigitadas[0], notasDigitadas[1], notasDigitadas[2], notasDigitadas[3], notasDigitadas[4]);

                    if (avaliacoesFisicas.validarAvaliacoes()) {
                        System.out.println("Avaliações cadastradas com sucesso!");
                    } else {
                        System.out.println("Erro: As notas precisam ser entre 0 e 10!");
                    }
                    break;
                case 6:

                    avaliacoesFisicas.imprimeAvaliacoes();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        scanner.close();
    }
}