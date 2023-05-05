import java.util.Scanner;

public class Player{

    String name;

    public Player(){

        System.out.println("Enter Player Name: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        name = input;

        System.out.println("\n" + "The Game Has Started!");
    }

}
