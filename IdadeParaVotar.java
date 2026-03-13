import java.util.Scanner;

public class IdadeParaVotar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();
        System.out.println("Olá "+nome+", agora digite sua idade!");
        int idade = scanner.nextInt(); 
        
        if (idade >=18) {System.out.println(nome+" Você tem "+idade+" anos, então pode votar!");
            
        } else {System.out.println(nome+" Você tem "+idade+" anos, então não pode votar!");
            
        }   
        

 scanner.close();
}
}