import java.util.Scanner;
import java.util.Random;


class Game{
    public int random;
    public int user;  
    public int noOFguesses;
    
    Scanner sc = new Scanner(System.in);
    Random rc = new Random();


    public void RandomNumberGenerator(){
        random = rc.nextInt(10)+1;
    
    }

    public void TakeUserInput(){

        System.out.println( "  ");
        System.out.println("Please Enter a number ( between 0 to 10 ) : ");
         user = sc.nextInt();
         noOFguesses++;
    }



    public boolean IsCorrectNumber(){
    
        if(user > random){
            System.out.println("Entered Number is Greater than Random Number ");
            return false;

        }else if(user < random){
            System.out.println("Entered Number is Smaller than Random Number");
            return false;

        }else{
            System.out.println("You guessed the correct number in " + noOFguesses +" attempts ");
            return true;
        }
        }


    


}


public class guessthenumber{
    public static void main(String[] args) {
        
        Game user1 = new Game();
        user1.RandomNumberGenerator();
        boolean guesscorrectly = false;
       
        while(!guesscorrectly ){
            user1.TakeUserInput();
            guesscorrectly = user1.IsCorrectNumber();
        }
       
        // user1.getguess();
        
    }
}