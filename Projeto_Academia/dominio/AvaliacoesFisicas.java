package AtividadesGpt.Projetos.ProjetoAcademia.dominio;

public class AvaliacoesFisicas {
    private double[] avaliacoes = new double[5];

    public void registrarAvaliacoes(double a, double b, double c, double d, double e) {

        this.avaliacoes[0] = a;
        this.avaliacoes[1] = b;
        this.avaliacoes[2] = c;
        this.avaliacoes[3] = d;
        this.avaliacoes[4] = e;
    }

    public double maiorAvaliacao() {
        double maior = this.avaliacoes[0];
        for (double avaliacao : avaliacoes) {
            if (avaliacao > maior) {
                maior = avaliacao;
            }
        }
        return maior;
    }

    public double menorAvaliacao() {
        double menor = avaliacoes[0];

        for (double avaliacao : avaliacoes) {
            if (menor > avaliacao) {
                menor = avaliacao;
            }
        }
        return menor;
    }

    public double mediaAvaliacao() {
        double soma = 0;

        for (double avaliacoe : avaliacoes) {
            soma += avaliacoe; 
        }
        double media = soma/avaliacoes.length;

        return media;
    }

    public boolean validarAvaliacoes() {
        for (double nota : this.avaliacoes) {
            if (nota < 0 || nota > 10) {
                return false;
            }
        }
        return true;
    }

    public void imprimeAvaliacoes(){

        System.out.println("---Avaliações físicas---\n");

        System.out.println("Maior avaliação física: " + this.maiorAvaliacao());
        System.out.println("Menor avaliação física: " + this.menorAvaliacao());
        System.out.println("Avaliação física média: " + this.mediaAvaliacao());

    }

    public double[] getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(double[] avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}