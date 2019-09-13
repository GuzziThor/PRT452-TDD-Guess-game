package guess100;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class tests {
	
	
	//Testing if the random number is between 1 and 100
	@Test
	void rndnumWithinRange() {
		 new Guess100();
	// setup
     int numbertest = Guess100.generateRndNumber();
     //assert
     assertTrue(numbertest >= 1 && numbertest <= 100);
     
	}
	
	
	@Test
	void guessWithinrange() {
		 new Guess100();
	// setup
		 int number = 50;
     boolean numbertest = Guess100.guessWithinrange(number);
     //assert
     assertTrue(numbertest);
     
	}
	
	
//	
//	//Testing if the number guessed is greater than 100
//	@Test
//     void guessgreater() {
//       // setup
//		 int number = 99;
//        
//        // execute
//        boolean actual = Guess100.guessLess(number);
//        
//        // assert
//        assertTrue(actual);
//    }
//	
//	
//	//Testing if the number guessed is greater than 1
//	@Test
//    void guessLesser() {
//      // setup
//		 int number = 2;
//       
//       // execute
//       boolean actual = Guess100.guessGreat(number);
//       
//       // assert
//       assertTrue(actual);
//   }
//	
//
//	//Testing ignore case for letter q
//	@Test
//    void ignoreCase() {
//      // setup
//		 String ignoreCase = "Q";
//       
//       // execute
//       Boolean actual = Guess100.lowerUpperQ(ignoreCase);
//       
//       // assert
//       assertTrue(actual);
//   }
//	
	
}








































