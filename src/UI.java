/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author natha
 */
import java.util.Scanner;
public class UI {
    private Scanner reader = new Scanner (System.in);
    private Jumpers jumpers = new Jumpers();
    private int round;
    
    public UI (Scanner reader) {
        this.reader = reader;
        this.round = 0;
    }
    
    public void getParticipants() {
        while(true) {
            System.out.print("Participant Name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                System.out.println();
                System.out.println("The tournament begins!");
                System.out.println();
                return;
            } else {
                jumpers.add(name);
            }
        }
    }
    
    public void commands() {
        while(true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit:");
            String command = reader.nextLine();
            if (command.equalsIgnoreCase("JUMP")) {
                jumping();
            } else {
                quit();
            }
        }
    }
    
    public void jumping() {
        round++;
        System.out.println();
        System.out.println(); // This needs to output the round value
        System.out.println();
        System.out.println("Jumping order:");
        jumpers.showJumpers();
        // put the jumping method here
        System.out.println();
        System.out.println("Results of round " + round);// + round); // where round is the round value again!
        // put the part that reports the jump results in here
        System.out.println();
        scoring();
    }
    
    public void scoring() {
        for (Jumper jumper : jumpers.getJumpers()) {
            Score mJS = new Score(10,10);
            Scores jumperScore = new Scores(new Score(60,60),mJS.makeJudgesScores(),jumper);
            System.out.println(jumperScore.getJumpDistance());
            System.out.println(jumperScore.showJudgesScore());
            jumper.setScore(jumperScore.createFinalScore());
        }
        System.out.println();
    }
    
    public void quit() {
        System.out.println();/*"Thanks!\n" +
"\n" +
"Tournament results:\n" +
"Position    Name\n" +
"1           Mikael (388 points)\n" +
"            jump lengths: 95 m, 96 m, 63 m\n" +
"2           Mika (387 points)\n" +
"            jump lengths: 112 m, 61 m, 88 m");*/
    }
}
