public class TesteCalculadora {
  public static void main(String[] args) {
    System.out.println("A cpoisa começa aqui: ");
    Calculadora calc = new Calculadora();
    int soma = calc.somar(7,8);
    soma = soma + calc.somar(15, 17);

    int mult = calc.multiplicar(2,3);
    mult = mult * calc.multiplicar(4, 5);

    int sub = calc.subtrair (7, 8);
    sub = sub - calc.subtrair (8,7);

    int divi = calc.dividir (7,8);
    divi = divi / calc.dividir(9,6);

    System.out.println(soma);
    System.out.println(mult);
    System.out.println(sub);
    System.out.println(divi);
    System.out.println("Até mais");
  }
}
