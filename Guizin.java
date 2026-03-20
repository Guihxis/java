import java.util.Scanner;
public class Guizin {
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("======CALCULADORA========");
        System.out.println("Informe o primeiro numero");
       float primeiroNumero = scanner.nextFloat();
        System.out.println("Qual sera a operacao");
        String operacao = scanner.nextLine();
         System.out.println("Informe o segundo numero");
         float segundoNumero = scanner.nextFloat();
        System.out.println(primeiroNumero+operacao+segundoNumero);
       scanner.close();
    }
    
}
