import java.util.Random;
import java.util.Scanner;

public class lottery {
    
    public static void main(String[] args){

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Number of 1 to 10: ");
        int userNum = numberScanner.nextInt();
        Random rnd= new Random();
        int winningNum = rnd.nextInt(10) + 1;
        System.out.println("Your numbrer: " + userNum);
        System.out.println("The winner number: " + winningNum);

        if (userNum == winningNum){
            System.out.println("Congratulations, you win!");
        } else{
            System.out.println("Oh no, try again to be a winner!");
        }

    }
}
