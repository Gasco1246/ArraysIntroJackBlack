/*
 Gavin Scott
 To play a blackjack style game
 October 29th
 */

package jackblack;

/**
 *
 * @author gasco1246
 */
import java.util.Scanner;

public class JackBlack {

    /**
     * @param args the command line arguments
     */ 
    
    
    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
        int[] card = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,10,10,10,10,10,10,10};
        int cardNum = (int)Math.round(Math.random()*50+1);
        int userInput;
        int score = 0;
        String userInputStr;
        boolean play = true;
        final int OPPONENT = (int)Math.random()*(21-12)+12;
        System.out.println("Here are your cards");
        
       
            
        for(int i = 0;i<2;i++){
            
            if(cardNum>0 && cardNum<=4){
                System.out.println("You got an ace.  Type 1 or 11?");
                userInput = keyInput.nextInt();
                if(userInput == 11){
                    score = score +11;
                    System.out.println("Score: "+score);
                    cardNum = (int)Math.round(Math.random()*51+0);
                }else{
                    score= score +1 ;
                    System.out.println("Score: "+score);
                    cardNum = (int)Math.round(Math.random()*51+0);
                }


            }else{
                System.out.println(card[cardNum]);
                score = score + card[cardNum];
                System.out.println("Score: "+score);
                cardNum = (int)Math.round(Math.random()*50+1);
                

            }
            if(score > 21){
                System.out.println("Game Over");
            }
            if(score == 21){
                System.out.println("You Win");
            }
        }
        
        
        do{
            System.out.println("Do you want another card");
            System.out.println("Type y for another and n to stop");
            userInputStr = keyInput.nextLine();
            switch(userInputStr){
                case "y": case "Y":
                    if(cardNum>0 && cardNum<=4){
                    System.out.println("You got an ace.  Type 1 or 11?");
                    userInput = keyInput.nextInt();
                    if(userInput == 11){
                        score = score +11;
                        System.out.println("Score: "+score);
                        cardNum = (int)Math.round(Math.random()*51+0);
                    }else{
                        score= score +1 ;
                        System.out.println("Score: "+score);
                        cardNum = (int)Math.round(Math.random()*51+0);
                    }


                    }else{
                    System.out.println(card[cardNum]);
                    score = score + card[cardNum];
                    System.out.println("Score: "+score);
                    cardNum = (int)Math.round(Math.random()*51+0);


                    }
                    if(score > 21){
                    System.out.println("Game Over");
                    play = false;
                    }
                    if(score == 21){
                    System.out.println("YOU WIN");
                    play = false;
                    }
                    break;
                case "n": case "N":
                    System.out.println("Ok your score is: "+score);
                    System.out.println("Opponent score is: "+OPPONENT);
                    if(OPPONENT >= score){
                        System.out.println("Opponent wins");
                    }
                    else{
                        System.out.println("You win");
                    }    
                    play = false;
                    break;
            }
        }while(play == true);
    }
}
        
    

              
            
        
      
        
    
    
