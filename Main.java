import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Start of Politcal Poll//
      System.out.println("Welcome to the offical Political Poll!"); Scanner scan = new Scanner(System.in);
        System.out.println("Who is the political party you are affiliated to? "); //Political Party Question//
        String pparty = scan.next();
        if(pparty == "democrat"){ //If,Else Statement for political party//
          