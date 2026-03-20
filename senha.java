import java.util.Scanner;

public class senha {
public static void main(String[] args) {

     Scanner conta = new Scanner (System.in);

        String usuario = "";
        String usuarioSalvo = usuario;
        String senha = "";
        String confirmacaoSenha = "";
        boolean senhaValida = false;

        while (!senhaValida){

            System.out.println("Digite o nome de usuario");
            String registroUsuario = conta.nextLine();
            usuario = registroUsuario;
    
        System.out.println("Crie sua senha");
        senha = conta.nextLine();
        System.out.println("Confirme a senha");
        confirmacaoSenha = conta.nextLine();

        if (senha.equals(confirmacaoSenha)) {
            System.out.println("Senha criada com sucesso");
            senhaValida = true;
        }else{
            System.out.println("As sebhas nao sao iguais. Tente novamente");
        }

        }
        conta.close();
   }
    
}
