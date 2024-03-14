public class LivroDeNotas{
  //variavel de instancia(objeto)
  private String nomeDisciplina;

  // //construtor padrão: lista de parametros vazia
  LivroDeNotas(String nomeDisciplina){
    this.nomeDisciplina = nomeDisciplina;
  }

  public void exibirMensagem(){
    System.out.printf("Bem vindo ao livro de notas de %s",
     this.nomeDisciplina);
  }
  //setter
  // public void setNomeDisciplina(String n){
  //   if (nomeDisciplina.length() >=3)
  //     nomeDisciplina = n;
  // }

  //getter
  public String getNomeDisciplina(){
    return this.nomeDisciplina;
  }
}