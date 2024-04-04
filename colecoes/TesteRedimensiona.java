public class TesteRedimensiona {
    public static void main(String[] args) {
        var redimensiona = new VetorDinamico(6);
        int i;

        //enchendo o vetor
        for (i = 0; i <15; i++){
            //chamando o método adicionar para adicionar elementos no vetor
            redimensiona.adicionar(i);
            System.out.println("\nElemento adicionado: " + i);
            System.out.println("Valor atual: " + redimensiona.Cap());
            System.out.println("Quantitade total: " + redimensiona.Qtde() +"\n");

            
        }

        System.out.println("\nValor final: " + redimensiona.Cap());
        System.out.println("Quantidade final: " + redimensiona.Qtde());
        
    }
}
