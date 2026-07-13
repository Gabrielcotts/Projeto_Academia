package AtividadesGpt.Projetos.ProjetoAcademia.test;

import AtividadesGpt.Projetos.ProjetoAcademia.dominio.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno
                ("Gabriel   ", 21, 92.71, 1.82, "Mensal" );

      if (!aluno.validadorNome()){
              System.out.println("Nome precisa ser preenchido corretamente.");
      } else {
          aluno.imprimeDados();
          aluno.calcularIMC();
          aluno.verificadorIdade();
          aluno.aplicarDesconto();
      }
    }
}