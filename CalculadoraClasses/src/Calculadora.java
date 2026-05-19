public class Calculadora {
    private int numero1;
    private int numero2;

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public int soma(){
        return numero1 + numero2;

    }
    public int subtracao(){
       if (numero1 > numero2) {
        return numero1 - numero2;
        
       }else{
        return numero2 - numero1;
       }

    }
    public int multiplicacao(){
        return numero1 * numero2;

    }
   public int divisao() {
    if (numero2 == 0) {
        System.out.println("Erro:. divisão por zero.");
        return 0;
    }
    return numero1 / numero2;
}
}