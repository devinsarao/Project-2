import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Start of Politcal Poll//
      System.out.println("Welcome to the offical Political Poll!"); Scanner scan = new Scanner(System.in);
        System.out.println("Who is the political party you are affiliated to? "); //Political Party Question//
        String pparty = scan.next();
        if(pparty == "democrat"){ //If,Else Statement for political party//System.out.println("You are a democrat!");
        }else{
          System.out.println("You are a republican!");
 
        }
 //Scanner for poll questions!//
      Scanner scan = new Scanner(System.in);
  System.out.println("What's your government name?"); //Taking in voter information//
        String name = scan.next();
        name += scan.nextLine();//Use code if more than one word//
      Scanner number = new Scanner(System.in);
 
        System.out.println("Which canidate is better? Trump or Biden"); //Presidental Canidate Question//
        String canidates = scan.next();
 
        