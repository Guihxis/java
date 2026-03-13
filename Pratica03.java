import java.util.Scanner;

public class Pratica03{
public static void main(String[] args){

     Scanner scanner = new Scanner(System.in);
    
    float saldoDaConta = 0;
    int opcao = 0;

    while (opcao != 4){

    System.out.println("=====> Caixa Eletronico <=====");
    System.out.println("1. Ver o saldo");
    System.out.println("2. Depositar");
    System.out.println("3. Sacar");
    System.out.println("4. Sair");
    System.out.println("===============================");

     opcao = scanner.nextInt();

    if ( opcao == 1 ) {System.out.println("Seu saldo atual é "+saldoDaConta+"R$");} 
    if ( opcao == 2 ) { System.out.println("Quanto voce deseja depositar?");
    float deposito = scanner.nextFloat();
    saldoDaConta = saldoDaConta + deposito;
    System.out.println("Você depositou "+deposito+"R$. Seu saldo atual é "+saldoDaConta+"R$");
                      }
    if (opcao == 3) {System.out.println("Quanto você deseja sacar?");
    float saque = scanner.nextFloat();
    if ( saque <= saldoDaConta) { saldoDaConta = saldoDaConta - saque;
        System.out.println("Você sacou "+saque+"R$, seu novo saldo é " +saldoDaConta+ "R$");
        } else {
            System.out.println("Saldo insuficiente!");
        }
                    } 
        if (opcao == 4){System.out.println("Obrigado por usar o caixa eletrônico.");}
     }
      scanner.close();
  }
}




