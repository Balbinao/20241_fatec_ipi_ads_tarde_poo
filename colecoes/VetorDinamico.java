public class VetorDinamico {
    //variaveis de instancia (cada instancia ou objeto tem a sua copia)
    private int qtde;
    private int cap;
    private int [] elementos;

    // variavel de classe (todas as instancias compartilham esse mesmo valor)

    private static final int CAP_MINIMA = 4;
    VetorDinamico(){
        cap = CAP_MINIMA;
        qtde = 0;
        elementos = new int [CAP_MINIMA];
    }

    VetorDinamico(int capMinima){
        double aux = capMinima;
        while(aux >= 2)
            aux /= 2;
        cap = aux == 1 && capMinima > 3 ? CAP_MINIMA : capMinima; 
        
    }
    //terminanr esse metodo
    void adicionar(int elemento){
        elementos[qtde] = elemento;
        qtde++;
        // se estiver cheio, redimensionar antes de adicionar
    }
    //escrever esse aqui tambem
boolean estaCheio(){

    //decidir se o vetor esta cheio ou nao olhando para cap e qtde
}

    //escrever ess método
    void redimensionar(){
        //alocar um vetor com o dobro da capacidade atuar chamado auxiliar

        // copiar todo mund do vetor elementos para o vetor auxiliar

        //ajustar a capacidade para que ela tenha o valor novo, dobrado

        //ajustar o ponteiro elementos para que ele aponte para o novo vetor
    }
}


