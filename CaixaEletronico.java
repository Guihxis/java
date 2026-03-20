import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tentativasParaLogar = 0;

        double saldoDaConta = 1000;
        int opcao = 0;

    //Sistema de registro
        String usuario = "";
        String confirmacaoSenha = "";
        String senha = "";
        boolean senhaValida = false;

        while (!senhaValida){
        System.out.println("=======Registro==========");
        System.out.println("Digite o nome de usuario");
        usuario = scanner.nextLine();
        System.out.println("Crie sua senha");
        senha = scanner.nextLine();
        System.out.println("Confirme a senha");
        confirmacaoSenha = scanner.nextLine();


        if (senha.equals(confirmacaoSenha)) {
            System.out.println("Senha criada com sucesso");
            senhaValida = true;
        }else{
            System.out.println("As senhas nao sao iguais. Tente novamente");
        }

        }
        
    //LOGIN
        boolean loginLiberado = false;
        while (tentativasParaLogar < 3 && !loginLiberado) {
        System.out.println("==========Login============");
        System.out.println("Digite o Usuario");
        String usuarioDigitado = scanner.nextLine();
        System.out.println("Digite sua senha");
        String senhaDigitada = scanner.nextLine();

         if (usuarioDigitado.equals(usuario) && senhaDigitada.equals(senha)) {
            System.out.println("Acesso liberado");
            loginLiberado = true;
             }else{
                loginLiberado = false;
                tentativasParaLogar++;
                System.out.println("Login invalido tente novamente " +(3 - tentativasParaLogar));
             }
   }
       
   
   
      if (loginLiberado) {
        while (opcao != 4) {
            System.out.println("=====> Caixa Eletronico <=====");
            System.out.println("1. Ver o saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.println("===============================");

            opcao = scanner.nextInt();
            scanner.nextLine();
        

            if (opcao == 1) {
                System.out.println("Seu saldo atual é " + saldoDaConta + " R$");

            } else if (opcao == 2) {
                System.out.println("Quanto voce deseja depositar?");
                double deposito = scanner.nextDouble();
                scanner.nextLine();

                if (deposito > 0) {
                    saldoDaConta += deposito;
                    System.out.println("Depósito realizado!");
                } else {
                    System.out.println("Valor inválido!");
                }

            } else if (opcao == 3) {
                System.out.println("Quanto você deseja sacar?");
                double saque = scanner.nextDouble();
                scanner.nextLine();

                if (saque > 0 && saque <= saldoDaConta) {
                    saldoDaConta -= saque;
                    System.out.println("Saque realizado!");
                } else {
                    System.out.println("Saldo insuficiente ou valor inválido!");
                }

            } else if (opcao == 4) {
                System.out.println("Obrigado por usar o caixa eletrônico.");

            } else {
                System.out.println("Opção inválida!");
            }
        }
         } else {
              System.out.println("Acesso bloqueado!");
        

        
         }
         scanner.close();
    }
}