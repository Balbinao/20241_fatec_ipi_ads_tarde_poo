public class TesteLivroDeNotasV2{
  public static void main(String[] args) {
    //inferencia de tipo (Java 10+)
    var meuLivro = new LivroDeNotas("POO");
    //meuLivro.nomeDisciplina = "POO";
    //meuLivro.setNomeDisciplina("POO");
    System.out.println(meuLivro.getNomeDisciplina());
  }
}