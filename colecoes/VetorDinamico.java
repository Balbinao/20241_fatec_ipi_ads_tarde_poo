import java.util.Arrays;

public class VetorDinamico {
  //variáveis de instância (cada instância ou objeto tem a sua cópia)
  private int qtde;
  private int cap;
  private int [] elementos;
  //variável de classe (todas as instâncias compartilham este mesmo valor)
  private static final int CAP_MINIMA = 4;
  VetorDinamico(){
    cap = CAP_MINIMA;
    qtde = 0;
    elementos = new int[CAP_MINIMA];
  }

  VetorDinamico(int capMinima){
    double aux = capMinima;
    while (aux >= 2)
      aux /= 2;
    cap = aux == 1 && capMinima > 3 ? capMinima : CAP_MINIMA;

    //inicilizando o vetor para que ele ja tenha uma capacidade calculada
    elementos = new int[cap];
  }

  //terminar esse método
  void adicionar(int elemento){
  //se estiver cheio, redimensionar antes de adicionar
    if (estaCheio()){
      redimensionar();
    }
    elementos[qtde] = elemento;
    qtde++;
  }

  //escrever esse aqui também
  boolean estaCheio(){
    //decidir se o vetor está cheio ou não olhando para cap e qtde
    return qtde == cap;
  }

  //escrever esse método
  private void redimensionar(){
    //alocar um vetor com o dobro da capacidade atual chamado auxiliar
    int dobroCapaci = cap * 2;
    int [] aux = new int[dobroCapaci];

    //copiar todo mundo do vetor elementos para o vetor auxiliar
    for (int i = 0; i < qtde; i ++){
      aux[i] = elementos[i];
    }
    //ajustar a capacidade para que ela tenha o valor novo, dobrado
    cap = dobroCapaci;

    //ajustar o ponteiro elementos para que ele aponte para o novo vetor
    elementos = aux;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("");
    sb.append("Qtde: ").append(qtde);
    sb.append("\n");
    sb.append("Cap: ").append(cap);
    sb.append("\n");
    sb.append(qtde >0 ? "Elementos: ":"");
    for (int i = 0; i< qtde; i++) {
      sb.append(elementos[i]).append(" ");
    }
    return sb.toString();
  }

  void adicionarSemRepetir(int elemento){
    if(!existe(elemento)) adicionar(elemento); 
  }
  boolean existe(int e) {
    for(int i = 0; i < qtde; i++)
      if(e == elementos[i])
        return true;
      return false;
    
  }

  int tamanho() {
    return qtde;
  }

  int [] getElementos(){
    return Arrays.copyOf(elementos, cap);
    //return elementos;
  }

  void removerFinal (){
    if (!estaVazio()){
      qtde--;
    }
  }

  boolean estaVazio(){
    return qtde == 0;
  }

  boolean estaUmQuartoCheio() {
    if (qtde == cap/4)
      return true;
    return false;
  }

  void reduzirTamanho(){
    int [] aux = new int [cap/2];
    for (int i = 0; i < qtde; i++){
      
    }
  }


  int Qtde(){
    return qtde;
  }

  int Cap(){
    return cap;
  }
}