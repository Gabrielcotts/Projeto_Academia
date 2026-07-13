package AtividadesGpt.Projetos.ProjetoAcademia.test;

import AtividadesGpt.Projetos.ProjetoAcademia.dominio.AvaliacoesFisicas;

public class AvaliacoesFisicasTest {
    public static void main(String[] args) {
        AvaliacoesFisicas avaliacoesFisicas = new AvaliacoesFisicas();

        avaliacoesFisicas.registrarAvaliacoes(-5.7, 6.2, 6.7, 7.1, 8.4);

        if (avaliacoesFisicas.validarAvaliacoes()) {
            avaliacoesFisicas.imprimeAvaliacoes();
        } else {
            System.out.println("Erro: As avaliações devem ser entre 0 e 10 (não podem ser negativas).");
        }
    }
}