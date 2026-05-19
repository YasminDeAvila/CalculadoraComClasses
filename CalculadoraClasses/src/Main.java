import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculadora cal = new Calculadora();

        String opcao;
         while (true) {

            System.out.println("Escolha a opção:");
            System.out.println(" '+' - Soma de 2 números inteiros. ");
            System.out.println("'-' - Diferença entre 2 números (maior pelo menor). ");
            System.out.println("'*'' - Produto entre 2 números. ");
            System.out.println("'/'' - Divisão entre 2 números.");
            System.out.println(" 'S' ou 's' - Sair. ");

            opcao = sc.next().toLowerCase();

             if (opcao.equals("s")) {
                System.out.println("Até mais");
                break;
            }

            if (!
                (opcao.equals("+") || opcao.equals("-") ||
                  opcao.equals("*") || opcao.equals("/"))
                ) 
                  {

                System.out.println("Opção inválida, tente novamente.");
                continue;
            }


            //pedir dois numeros e guardar no objeto
            System.out.println("Digite o primeiro número: ");
            cal.setNumero1(sc.nextInt());


            System.out.println("Digite o segundo número: ");
            cal.setNumero2(sc.nextInt());

            switch (opcao) {
                case "+":{
                    System.out.println("Resultado -> " + cal.soma());
                }
        
                    break;
                case "-":{
                    System.out.println("Resultado -> " + cal.subtracao());
                }
                    
                    break;
                case "*":{
                    System.out.println("Resultado -> " + cal.multiplicacao());
                }
                    
                    break;
                case "/":{
                    System.out.println("Resultado -> " + cal.divisao());
                }
                    
                    break;
              
        
            }
        }  
        sc.close();
        }
       
}
