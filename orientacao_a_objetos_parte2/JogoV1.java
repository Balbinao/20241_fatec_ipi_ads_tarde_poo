public class JogoV1 {
     public static void main(String[] args) {
          //garbage collector

          // Java 10+: operador de inferencia de tipo
          var p = new Personagem();
          p.nome = "Luis";
          p.cacar();
          System.out.println(p.toString());
          System.out.println("*********************");
          p.comer();
          System.out.println(p);
          System.out.println("*********************");
          p.dormir();
          System.out.println(p);
          System.out.println("*********************");
          p.cacar();
          System.out.println(p);
          System.out.println("*********************");
          p.comer();
          System.out.println(p);
          System.out.println("*********************");
          p.dormir();
          System.out.println(p);
          System.out.println("*********************");
     }
}
