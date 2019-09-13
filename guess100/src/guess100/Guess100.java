package guess100;
import java.util.*;
import java.io.*;

public class Guess100 {

static BufferedReader r=new BufferedReader(new InputStreamReader(System.in));	
static int rndnum = 0;
static int tries = 0;
static int number;



public static int generateRndNumber() {
	Random rnd = new Random();
  rndnum = rnd.nextInt(101);
	return rndnum;
}


////Refactored Code
//public static boolean guessLess(int number) {
//	if(number < 100) {
//		System.out.println("Sorry, this number is not within range");
//	}
//	
//	return (number <100);
//			
//}
//public static boolean guessGreat(int number) {
//	if(number > 1) {
//		System.out.println("Sorry, this number is not within range");
//	}
//	
//	return (number > 1);
//			
//}
//
//public static boolean lowerUpperQ(String ignoreCase) {
//	
//	if(ignoreCase == "q" || ignoreCase == "Q") {
//		System.out.println("Case ignored");
//	}
//	
//	return true; 
//}
//



public static boolean guessWithinrange(int number) {
	
	if ( number>100 || number<1 ) {

	    System.out.println(" Sorry! You have to enter a number between 1-100! \n");

	    guess();
	}
	tries++;
    return true;	
}




public static void guess(){

	generateRndNumber();

boolean game=true;

while (game){

try{

String userGuess= r.readLine();

    if (userGuess.equalsIgnoreCase("q")) { 

    System.out.println("You Lost! You took "+tries+" attempts. My number was "+rndnum+".");

    System.exit(0);}
    
number = Integer.parseInt(userGuess);




 if (number==rndnum){

    System.out.println("So Slow!!!  You took "+tries+" attempts to guess my number! My number was "+rndnum+".");

    game = false;}

    else if ( number>rndnum){

    System.out.println("Go Lower!");}

    else if ( number<rndnum){

    System.out.println("Go Higher!");}

} 

//end try

    catch(Exception ioe2){

    System.out.println("Sorry, You have to enter a number NOT a character! \n");

    guess();}

} //end while

} //end guess


public static void main (String []args){
//start the game
	System.out.println("Welcome Human, I'm thinking of a number between 1 - 100 : Enter your guess (or q to quit) :P:");
guess();
}  // end main


} //end 












