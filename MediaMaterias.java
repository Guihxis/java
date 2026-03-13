import java.util.Scanner;

public class MediaMaterias {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá aluno, digite seu nome");
        String nome = scanner.nextLine();
        System.out.println("Digite sua nota da prova matematica");
        float notaProva = scanner.nextFloat();
        System.out.println("Digite a nota de caderno de matematica");
        float notaCaderno = scanner.nextFloat();
        System.out.println("Digite a nota do trabalho de matematica");
         float notaTrabalho = scanner.nextFloat();
        float resultado = notaCaderno+notaProva+notaTrabalho;
        float media = resultado/3;

        if (media >=5) {System.out.println(nome+" sua média é "+media+" você está aprovado!");
            
        } else {System.out.println(nome+" sua média é "+media+" você está reprovado!");
            
        }


     scanner.close();
    }
}