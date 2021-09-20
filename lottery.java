import java.util.Random;
import java.util.Scanner;

public class lottery {
    
    public static void main(String[] args){

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 a 10: ");
        int userNum = numberScanner.nextInt();
        Random rnd= new Random();
        int winningNum = rnd.nextInt(10) + 1;
        System.out.println("Seu número: " + userNum);
        System.out.println("O Número vencedor é: " + winningNum);

        if (userNum == winningNum){
            System.out.println("Parabéns, você venceu!");
        } else{
            System.out.println("Que pena, tente de novo!");
        }

    }
}
