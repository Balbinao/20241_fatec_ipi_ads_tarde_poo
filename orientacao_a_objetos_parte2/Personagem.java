public class Personagem{
    //variaveis de instancia
    String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;
    //esse é o construtor padrão
    //criado automaticamente pelo compilador, ainda que não seja escrito explicitamente
    Personagem(){

    }

    //contrutor personalizado
    //o que viabiliza a sua existencia é a sobrecarga de construtores
    Personagem(int energia, int fome, int sono){
        if (energia >= 0 && energia <= 10){
            this.energia = energia;
        }if (fome >= 0 && fome <= 10){
            this.fome = fome;
        }if(sono >= 0 && sono <= 10){
            this.sono = sono;
        }
    }
    void cacar (){
        if( energia >= 2){
            System.out.printf("%s esta cacando...\n", nome);
            energia -= 2; //energia = energia - 2
        }else{
            System.out.printf("%s sem energia para cacar...\n", nome);
        }
        fome = Math.min(fome + 1, 10);
        sono = sono < 10 ? sono + 1 : 10;
    }
    void comer(){
        //se tiver fome
        //comer e reduzir o valor de fome de 1
        //aumentar o valor de energia de 1
        //caso contrario
        //so vai avisar que esta sem fome
        switch(fome){
            case 0:
                System.out.printf("%s sem fome....\n", nome);
                break;
            default:
                System.out.printf("%s esta comendo...\n", nome);
                --fome;
                energia = (energia == 10 ? energia : energia + 1);
        }
            
    }
    void dormir(){
        if( sono > 0){
            System.out.printf("%s esta dormindo...\n", nome);
            sono -=1;
            energia = Math.min(energia + 1, 10);

        }else{
            System.out.printf("%s sem sono...\n", nome);
            
        }
    }
    public String toString(){
        return String.format("%s:(e%d f%d s%d)", nome, energia, fome, sono); 
    }
}