package AtividadesGpt.Projetos.ProjetoAcademia.dominio;

import java.util.Scanner;

public class PlanoAcademia {

        Scanner scanner = new Scanner(System.in);

        public void escolherPlano(){
            System.out.println(" ");

            System.out.println("1 - Mensal");
            System.out.println("2 - Trimestral");
            System.out.println("3 - Semestral");
            System.out.println("4 - Anual");
            System.out.println("5 - Voltar ao menu inicial");
            System.out.println("\n Escolha uma das opções acima: ");
            int opcaoPlano = scanner.nextInt();

            switch (opcaoPlano){
                case 1:
                    System.out.println("Você escolheu o plano mensal");
                    break;
                case 2:
                    System.out.println("Você escolheu o plano trimestral");
                    break;
                case 3:
                    System.out.println("Você escolheu o plano semestral");
                    break;
                case 4:
                    System.out.println("Você escolheu o plano anual");
                    break;
                case 5:
                    System.out.println("Você escolheu retornar ao menu inicial");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
        }
    }
}
