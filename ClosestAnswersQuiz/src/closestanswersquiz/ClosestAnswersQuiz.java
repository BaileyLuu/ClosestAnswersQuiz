/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closestanswersquiz;

import java.util.Scanner;


/**
 *
 * @author baileyluu
 */
public class ClosestAnswersQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("\t\tWelcome to Closest Answers Quiz!\n");
        System.out.println("This is a two-player game and there will be questions which players have to guess. The person with the the closest answer will earn a point! Whoever has the most points wins! \n");
        System.out.print("Player 1\'s name: ");
        Scanner sc = new Scanner(System.in);
        String player1 = sc.nextLine();
        System.out.print("Player 2\'s name: ");
        String player2 = sc.nextLine();
        System.out.println("\nPlayer 1 is " + player1 + "\t\nPlayer 2 is " + player2);
        int player1Ans = 0;
        int player2Ans = 0;
        String [] questions = {
            "1. Including the antenna on the top, how many metres tall is the Eiffel Tower?", 
            "2. How many languages in the world?",
            "3. How many words are there in Herman Melville’s book ‘Moby Dick’?",
            "4. When did the umbrella academy come out? (Just the year)",
            "5. In what year was DNA discovered?",
            "6. How many seconds in a day?",
            "7. When did Google start? (Just the year)",
            "8. How many metres high is Mount Snowdon?",
            "9. How many words are there in the King James Bible?",
            "10. How many stars are there in the US flag?", 
            "11. What is the running time in minutes of the 1995 American computer-animated film Toy Story?", 
            "12. How high is the Burj Khalifa, the tallest building in the world?",
            "13. What percentage of Earth's surface is covered in water?",
            "14. When did Major League Hacking became a Certified B Corporation?",
            "15. How many episodes of Friends were made?"};
            
        int answers [] = {324, 7000, 212758, 2019, 1953, 86400, 1998, 1085, 783137, 50, 81, 828, 71, 2016, 236};
        int numOfQuestions = 0;
        int player1Difference;
        int player2Difference;
        int player1Points = 0;
        int player2Points = 0;
        int sentinel = 0;
        while(numOfQuestions < questions.length && sentinel == 0){
            System.out.println("\n"+ questions[numOfQuestions] + "\n");
            System.out.print(player1 + "\'s answer: ");
            player1Ans = sc.nextInt();
            System.out.print(player2 + "\'s answer: ");
            player2Ans = sc.nextInt();
            player1Difference = (answers[numOfQuestions] - player1Ans);
            player2Difference = (answers[numOfQuestions] - player2Ans);
            if(player1Difference < 0 ){
                player1Difference = -player1Difference;
            }else if (player2Difference < 0){
                player2Difference = -player2Difference;
                
            }
            if(player1Difference < player2Difference){
                player1Points++;
                 System.out.println(player1 + " earn 1 point!");
            }else{
                player2Points++;
                System.out.println(player2 + " earn 1 point!");
            }
//            System.out.print("\nWould both players like to continue? (Y or N): ");
//            String response = sc.next();
//            if(response.equals('N')){
//                sentinel = -1;
//            
//            }else{
//                numOfQuestions++;
//            }
            numOfQuestions++;
            
            
        }
        System.out.println("\n" + player1 + "\'s Points: " + player1Points);
        System.out.println(player2 + "\'s Points: " + player2Points);
        if(player1Points > player2Points){
            System.out.println("\n" + player1 + " is the winner!");
        }else if (player2Points > player1Points){
            System.out.println("\n" + player2 + " is the winner!");
        }else{
            System.out.println("Both are tied!");
        }
    
    }
    
}
