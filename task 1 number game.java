package Game;
import java.util.random;
import java.util.Scanner;

public class NumberGame{
    static int maxAttemts=5,countAttempt=0;
    public static void main(String[] args){
        NumberGame numberGame=new NumberGame();
        while(countAttempt<maxAttemts) {
            numberGame.matchNumber();

        }
    }
    public int matchNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter guessed number:");
        int guessedNumber=sc.nextInt();
        int generatedNumber= generatedRandomNumber(100);

        if(generatedNumber==guessedNumber){
            System.out.println("gues is correct");
            System.out.println("your score: (Attempts taken to guess correct number):" + ++countAttempt);
            System.exit(0);

        }else if(guessedNumber>generatedNumber){
            System.out.println("guessed number is too high");

        }else{
            System.out.println("guessed number is too low");

        }
        System.out.println("guessed number is:" + generatedNumber+"&Generated number is:"+guessedNumber);
        System.out.println("Attempt number:" + +=countAttempt);
        System.out.println("*************");
        return countAttempt;

    }
    public int generatedRandomNumber(int maxNumber){
        Random random=new Random();
        return random.nextInt(maxNumber);
    }

}
