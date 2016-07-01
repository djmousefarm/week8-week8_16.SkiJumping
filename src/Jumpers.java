/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author natha
 */

import java.util.ArrayList;
public class Jumpers {
    private ArrayList<Jumper> jumpers;
    
    public Jumpers () {
        this.jumpers = new ArrayList<Jumper>();
    }
    
    public ArrayList<Jumper> getJumpers() {
        return this.jumpers;
    }
    
    public void add (String name) {
        Jumper jumper = new Jumper(name);
        jumpers.add(jumper);
    }
    
    public void showJumpers() {
        int count = 1;
        for (Jumper jumper : jumpers) {
            System.out.println("  " + count + ". " + jumper.getName() + " (" + 
                    jumper.getScore() + " points)");
            count++;
        }
    }
    
    
}
