//Author: Logan Markley
//Description: BlackJack Game
//Date Last Edited: 4/20/18
//Current Steps Completed: ALL

import java.text.*;
import java.util.*;
public class Markley_BlackJack_DONE
{
    static Scanner s = new Scanner(System.in);
    static Random r=new Random(); 

    static String name;
    static int money;
    static int bet;
    static int dealerpoints;
    static int userpoints;


    public static void main (String args[]) //checks users name
    {     
        System.out.println("What is your name?");
        try  {name = s.nextLine(); } 
        catch (Exception e)
        {
            System.out.println("Something went wrong.  Try Again");
            main(null);
        }
        money();
    }
    
    public static void money ()//sees how much money the user has
    {
        System.out.println();
        System.out.println("How much money do you have?");
        try {money = s.nextInt(); }
        catch (Exception e)
        {
            System.out.println("Something went wrong. Try Again");
            s.nextLine();
            money();
        }
        System.out.println();
        bet();
    }
    
    public static void bet()//sees what the user bets
    {
        System.out.println("How much would you like to bet??");
        try  {bet = s.nextInt(); } 
        catch (Exception e)
        {
            System.out.println("Something went wrong.  Try Again");
            s.nextLine();
            bet();
        }
        System.out.println();

        if (bet > money) //this if statement checks to see if the user bet more than they have
        {
            System.out.println("You can't bet more than you have, try again");
            bet(); //sends the user to bet again
        }

        dealerfirst();
    }

    public static void dealerfirst()//chooses the dealers first card
    {

        int suitdealerRANDOM = r.nextInt(4) +1; //randomly chooses the dealers card suit 
        String suitdealer = "";
        int facedealerRANDOM = r.nextInt(13) +1; //randomly chooses the dealers card face
        String facedealer = "";

        if (facedealerRANDOM == 1) //these if statements check to see what card face the dealer gets
        {
            facedealer = "2";
            dealerpoints = dealerpoints + 2;
        }
        if (facedealerRANDOM == 2)
        {
            facedealer = "3";
            dealerpoints = dealerpoints + 3;
        }
        if (facedealerRANDOM == 3)
        {
            facedealer = "4";
            dealerpoints = dealerpoints + 4;
        }
        if (facedealerRANDOM == 4)
        {
            facedealer = "5";
            dealerpoints = dealerpoints + 5;
        }
        if (facedealerRANDOM == 5)
        {
            facedealer = "6";
            dealerpoints = dealerpoints + 6;
        }
        if (facedealerRANDOM == 6)
        {
            facedealer = "7";
            dealerpoints = dealerpoints + 7;
        }
        if (facedealerRANDOM == 7)
        {
            facedealer = "8";
            dealerpoints = dealerpoints + 8;
        }
        if (facedealerRANDOM == 8)
        {
            facedealer = "9";
            dealerpoints = dealerpoints + 9;
        }
        if (facedealerRANDOM == 9)
        {
            facedealer = "10";
            dealerpoints = dealerpoints + 10;
        }
        if (facedealerRANDOM == 10)
        {
            facedealer = "Jack";
            dealerpoints = dealerpoints + 10;
        }
        if (facedealerRANDOM == 11)
        {
            facedealer = "Queen";
            dealerpoints = dealerpoints + 10;
        }
        if (facedealerRANDOM == 12)
        {
            facedealer = "King";
            dealerpoints = dealerpoints + 10;
        }
        if (facedealerRANDOM == 13)
        {
            facedealer = "Ace (11)";
            dealerpoints = dealerpoints + 11;
        }

        if (suitdealerRANDOM == 1)
        {
            suitdealer = "Hearts";
        }
        if (suitdealerRANDOM == 2)
        {
            suitdealer = "Diamonds";
        }
        if (suitdealerRANDOM == 3)
        {
            suitdealer = "Clubs";
        }
        if (suitdealerRANDOM == 4)
        {
            suitdealer = "Spades";
        }

        System.out.println();
        System.out.println("The dealers first card is " + facedealer+ " of "+suitdealer);
        System.out.println("The dealer currently has "+dealerpoints+" points");
        System.out.println();
        System.out.println("------------------------------------------");

        playerfirst();
    }

    public static void playerfirst() //chooses the players first two cards
    {

        int suitplayerRANDOM = r.nextInt(4) +1; //randomly chooses the players card suit 
        String suitplayer = "";
        int faceplayerRANDOM = r.nextInt(13) +1; //randomly chooses the players card face
        String faceplayer = "";
        if (faceplayerRANDOM == 1) //these if statements check to see what card face the player gets
        {
            faceplayer = "2";
            userpoints = userpoints + 2;
        }
        if (faceplayerRANDOM == 2)
        {
            faceplayer = "3";
            userpoints = userpoints + 3;
        }
        if (faceplayerRANDOM == 3)
        {
            faceplayer = "4";
            userpoints = userpoints + 4;
        }
        if (faceplayerRANDOM == 4)
        {
            faceplayer = "5";
            userpoints = userpoints + 5;
        }
        if (faceplayerRANDOM == 5)
        {
            faceplayer = "6";
            userpoints = userpoints + 6;
        }
        if (faceplayerRANDOM == 6)
        {
            faceplayer = "7";
            userpoints = userpoints + 7;
        }
        if (faceplayerRANDOM == 7)
        {
            faceplayer = "8";
            userpoints = userpoints + 8;
        }
        if (faceplayerRANDOM == 8)
        {
            faceplayer = "9";
            userpoints = userpoints + 9;
        }
        if (faceplayerRANDOM == 9)
        {
            faceplayer = "10";
            userpoints = userpoints + 10;
        }
        if (faceplayerRANDOM == 10)
        {
            faceplayer = "Jack";
            userpoints = userpoints + 10;
        }
        if (faceplayerRANDOM == 11)
        {
            faceplayer = "Queen";
            userpoints = userpoints + 10;
        }
        if (faceplayerRANDOM == 12)
        {
            faceplayer = "King";
            userpoints = userpoints + 10;
        }
        if (faceplayerRANDOM == 13)
        {
            faceplayer = "Ace (11)";
            userpoints = userpoints + 11;
        }

        if (suitplayerRANDOM == 1)
        {
            suitplayer = "Hearts";
        }
        if (suitplayerRANDOM == 2)
        {
            suitplayer = "Diamonds";
        }
        if (suitplayerRANDOM == 3)
        {
            suitplayer = "Clubs";
        }
        if (suitplayerRANDOM == 4)
        {
            suitplayer = "Spades";
        }

        try {
            Thread.sleep(1500);                 //this is a 1.5 second delay
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println();
        System.out.println("Your first card is a "+faceplayer+ " of " +suitplayer);
        System.out.println("You now have "+userpoints+" points");

        int suitplayerRANDOM2 = r.nextInt(4) +1; //randomly chooses the players second card suit 
        String suitplayer2 = "";
        int faceplayerRANDOM2 = r.nextInt(13) +1; //randomly chooses the players second card face
        String faceplayer2 = "";
        if (faceplayerRANDOM2 == 1) //these if statements check to see what card face the player gets
        {
            faceplayer2 = "2";
            userpoints = userpoints + 2;
        }
        if (faceplayerRANDOM2 == 2)
        {
            faceplayer2 = "3";
            userpoints = userpoints + 3;
        }
        if (faceplayerRANDOM2 == 3)
        {
            faceplayer2 = "4";
            userpoints = userpoints + 4;
        }
        if (faceplayerRANDOM2 == 4)
        {
            faceplayer2 = "5";
            userpoints = userpoints + 5;
        }
        if (faceplayerRANDOM2 == 5)
        {
            faceplayer2 = "6";
            userpoints = userpoints + 6;
        }
        if (faceplayerRANDOM2 == 6)
        {
            faceplayer2 = "7";
            userpoints = userpoints + 7;
        }
        if (faceplayerRANDOM2 == 7)
        {
            faceplayer2 = "8";
            userpoints = userpoints + 8;
        }
        if (faceplayerRANDOM2 == 8)
        {
            faceplayer2 = "9";
            userpoints = userpoints + 9;
        }
        if (faceplayerRANDOM2 == 9)
        {
            faceplayer2 = "10";
            userpoints = userpoints + 10;
        }
        if (faceplayerRANDOM2 == 10)
        {
            faceplayer2 = "Jack";
            userpoints = userpoints + 10;
        }
        if (faceplayerRANDOM2 == 11)
        {
            faceplayer2 = "Queen";
            userpoints = userpoints + 10;
        }
        if (faceplayerRANDOM2 == 12)
        {
            faceplayer2 = "King";
            userpoints = userpoints + 10;
        }
        if (faceplayerRANDOM2 == 13)
        {
            faceplayer2 = "Ace (11)";
            userpoints = userpoints + 11;
        }

        if (suitplayerRANDOM2 == 1)
        {
            suitplayer2 = "Hearts";
        }
        if (suitplayerRANDOM2 == 2)
        {
            suitplayer2 = "Diamonds";
        }
        if (suitplayerRANDOM2 == 3)
        {
            suitplayer2 = "Clubs";
        }
        if (suitplayerRANDOM2 == 4)
        {
            suitplayer2 = "Spades";
        }

        try {
            Thread.sleep(1500);                 //this is a 1.5 second delay
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println();
        System.out.println("Your second card is a "+faceplayer2+ " of " +suitplayer2);
        System.out.println("You now have "+userpoints+" points");
        
        if (userpoints == 21)
        {
            System.out.println("BLACKJACK!!!");
            System.out.println("YOU RECEIVE DOUBLE YOUR BET!!!");
            again();
        }
        playerhit();

    }

    public static void playerhit () //this method's purpose is purely for when the player wants to draw more cards(hit)
    {
        int hit = 0;
        System.out.println("Would you like to hit? (1=yes)");
        try  {hit = s.nextInt(); } 
        catch (Exception e)
        {
            System.out.println("Something went wrong.  Try Again");
            s.nextLine();
            playerhit();
        }
        if (hit != 1)
        {
            dealerhit();
        }
        if (hit == 1 && userpoints < 21)
        {
            int faceplayerRANDO = r.nextInt(13)+1;
            String faceplaye = "";
            int suitplayerRANDO = r.nextInt(4)+1;
            String suitplaye = "";
            if (faceplayerRANDO == 1) //these if statements check to see what card face the player gets
            {
                faceplaye = "2";
                userpoints = userpoints + 2;
            }
            if (faceplayerRANDO == 2)
            {
                faceplaye = "3";
                userpoints = userpoints + 3;
            }
            if (faceplayerRANDO == 3)
            {
                faceplaye = "4";
                userpoints = userpoints + 4;
            }
            if (faceplayerRANDO == 4)
            {
                faceplaye = "5";
                userpoints = userpoints + 5;
            }
            if (faceplayerRANDO == 5)
            {
                faceplaye = "6";
                userpoints = userpoints + 6;
            }
            if (faceplayerRANDO == 6)
            {
                faceplaye = "7";
                userpoints = userpoints + 7;
            }
            if (faceplayerRANDO == 7)
            {
                faceplaye = "8";
                userpoints = userpoints + 8;
            }
            if (faceplayerRANDO == 8)
            {
                faceplaye = "9";
                userpoints = userpoints + 9;
            }
            if (faceplayerRANDO == 9)
            {
                faceplaye = "10";
                userpoints = userpoints + 10;
            }
            if (faceplayerRANDO == 10)
            {
                faceplaye = "Jack";
                userpoints = userpoints + 10;
            }
            if (faceplayerRANDO == 11)
            {
                faceplaye = "Queen";
                userpoints = userpoints + 10;
            }
            if (faceplayerRANDO == 12)
            {
                faceplaye = "King";
                userpoints = userpoints + 10;
            }
            if (faceplayerRANDO == 13)
            {
                faceplaye = "Ace (11)";
                userpoints = userpoints + 11;
            }

            if (suitplayerRANDO == 1)
            {
                suitplaye = "Hearts";
            }
            if (suitplayerRANDO == 2)
            {
                suitplaye = "Diamonds";
            }
            if (suitplayerRANDO == 3)
            {
                suitplaye = "Clubs";
            }
            if (suitplayerRANDO == 4)
            {
                suitplaye = "Spades";
            }
            System.out.println();
            System.out.println("Your second card is a "+faceplaye+ " of " +suitplaye);
            System.out.println("You now have "+userpoints+" points");
            if (userpoints < 21)
            {
                playerhit();
            }
            if (userpoints > 21)
            {
                System.out.println("BUST!!! YOU LOSE!!!");
                money=money-bet;
                again();
            }
        }

    }

    public static void dealerhit ()//this method is purely for when the dealer has to draw cards to get 17 or higher
    {
        while (dealerpoints < 17)
        {
            try {
                Thread.sleep(1500);                 //this is a 1.5 second delay
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            } 
            int facedealerRANDO = r.nextInt(13)+1;
            String facedeale = "";
            int suitdealerRANDO = r.nextInt(4)+1;
            String suitdeale = "";
            if (facedealerRANDO == 1) //these if statements check to see what card face the dealer gets
            {
                facedeale = "2";
                dealerpoints = dealerpoints + 2;
            }
            if (facedealerRANDO == 2)
            {
                facedeale = "3";
                dealerpoints = dealerpoints + 3;
            }
            if (facedealerRANDO == 3)
            {
                facedeale = "4";
                dealerpoints = dealerpoints + 4;
            }
            if (facedealerRANDO == 4)
            {
                facedeale = "5";
                dealerpoints = dealerpoints + 5;
            }
            if (facedealerRANDO == 5)
            {
                facedeale = "6";
                dealerpoints = dealerpoints + 6;
            }
            if (facedealerRANDO == 6)
            {
                facedeale = "7";
                dealerpoints = dealerpoints + 7;
            }
            if (facedealerRANDO == 7)
            {
                facedeale = "8";
                dealerpoints = dealerpoints + 8;
            }
            if (facedealerRANDO == 8)
            {
                facedeale = "9";
                dealerpoints = dealerpoints + 9;
            }
            if (facedealerRANDO == 9)
            {
                facedeale = "10";
                dealerpoints = dealerpoints + 10;
            }
            if (facedealerRANDO == 10)
            {
                facedeale = "Jack";
                dealerpoints = dealerpoints + 10;
            }
            if (facedealerRANDO == 11)
            {
                facedeale = "Queen";
                dealerpoints = dealerpoints + 10;
            }
            if (facedealerRANDO == 12)
            {
                facedeale = "King";
                dealerpoints = dealerpoints + 10;
            }
            if (facedealerRANDO == 13)
            {
                facedeale = "Ace (11)";
                dealerpoints = dealerpoints + 11;
            }

            if (suitdealerRANDO == 1)
            {
                suitdeale = "Hearts";
            }
            if (suitdealerRANDO == 2)
            {
                suitdeale = "Diamonds";
            }
            if (suitdealerRANDO == 3)
            {
                suitdeale = "Clubs";
            }
            if (suitdealerRANDO == 4)
            {
                suitdeale = "Spades";
            }

            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println();
            System.out.println("The dealers card is " + facedeale+ " of "+suitdeale);
            System.out.println("The dealer currently has "+dealerpoints+" points");
            System.out.println();
            System.out.println("------------------------------------------");

            if (dealerpoints > 21)
            {
                System.out.println("The dealer has lost!!! YOU WIN $"+bet+"!!!");
                money = money +bet;
                
                again();
            }
        }
        checkwinner();
    }

    public static void checkwinner() //this method is to check to see who won 
    {
        if (userpoints > dealerpoints)
        {
            System.out.println("YOU WON $"+bet+"!!!");
            System.out.println("You had "+userpoints+" points while the dealer had "+dealerpoints+" points!");
            System.out.println("You beat the dealer by "+(userpoints-dealerpoints)+" point(s)!");
            money = money+bet;
        }
        if (dealerpoints > userpoints)
        {
            System.out.println("YOU LOST $"+bet+"!!!");
            System.out.println("You had "+userpoints+" points while the dealer had "+dealerpoints+" points!");
            System.out.println("You lost to the dealer by "+(dealerpoints-userpoints)+" point(s)!");
            money = money-bet;
        }
        if (dealerpoints == userpoints)
        {
            System.out.println("YOU TIED!!!");
            System.out.println("You and the dealer both obtained "+userpoints+" points!");
            
        }
        again();
    }

    public static void again ()//this method is to see if user wants to play again
    {
        int again = 0;
        System.out.println(name+",you have $"+money);
        System.out.println("Would you like to play again? (1=yes)");
        try  {again = s.nextInt(); } 
        catch (Exception e)
        {
            System.out.println("Something went wrong.  Try Again");
            s.nextLine();
            again();
        }

        if (again != 1)
        {
            System.out.println("You stopped playing with $"+money);
            System.out.println("THANKS FOR PLAYING!!!");
            System.exit(0);
        }
        if (again == 1)
        {
            dealerpoints = 0;
            userpoints = 0;
            System.out.println(name+",you currently have $"+money);
            bet();
        }

    }

}