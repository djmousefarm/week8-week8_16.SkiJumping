import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        Scanner reader = new Scanner (System.in);
        System.out.println("Kumpula ski jumping week");
        System.out.println();
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        UI ui = new UI (reader);
        ui.getParticipants();
        System.out.println();
        ui.commands();
        
    }
}
