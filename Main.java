import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Start of Politcal Poll//
      System.out.println("Welcome to the offical Political Poll!"); Scanner scan = new Scanner(System.in);
        System.out.println("Who is the political party you are affiliated to? "); //Political Party Question//
        String pparty = scan.next();
        if(pparty == "Democrat"){ //If,Else Statement for political party//System.out.println("You are a democrat!");
        System.out.println("Democrat");
        }else{
          System.out.println("Republican!");
 
        }
 //Scanner for poll questions!//
  System.out.println("What's your government name?"); //Taking in voter information//
        String name = scan.next();
        name += scan.nextLine();//Use code if more than one word//
      Scanner number = new Scanner(System.in);
 
        System.out.println("Which canidate is better? Trump or Biden"); //Presidental Canidate Question//
        String canidates = scan.next();
 
        if(canidates == "Trump"){//if,else statement wether Trump or Biden//
          for(int i = 0; i<5; i++){ //Loop can work for Biden and Trump//
            System.out.println("Donald Trump!");
          }
          }else
          for(int i = 0; i<1; i++){
            System.out.println("Joe Biden!");
          }
      
      Scanner percentage = new Scanner(System.in);
      
      System.out.println("What would you score the canidate out of 100?");
        int grade = scan.nextInt();
        if(grade >= 90 && grade <= 100) {
          System.out.println("I would accpet this as a passing rating for the president!");
        }
        else if(grade >= 0 && grade < 89) {
          System.out.println("This is an unacceptable rating!");
        }
        int a = 0;
        while(a < 50){
          System.out.println(a);
          a++;
        }
        System.out.println("50 states to vote in!");
        for(int b = 0; b < 0; a++){
          System.out.println(a);
        }
        System.out.println("Congrats! You can now vote in any state!");
        //this will shows if the weather is good enough to go vote
        boolean sunny = true;
        boolean cold = true;
        int temperature = 71;
        if (sunny || temperature > 60 && !cold)
          System.out.println("It is good weather to cast your vote!");
        else if (!sunny || temperature > 75 && cold)
        {
            System.out.println("It is not good weather to go and cast your vote too!");
        }
      }
      }
      
    
  
 
       
          
       