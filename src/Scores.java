/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 *
 * @author natha
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Scores {
    private ArrayList<Score> judgesScores = new ArrayList<Score>();
    private Score jumpDistance;
    private Jumper jumper;
    
    public Scores (Score jumpDistance, ArrayList<Score> judgesScores, Jumper jumper) {
        this.jumpDistance = jumpDistance;
        this.judgesScores = judgesScores;
        this.jumper = jumper;
    }
    
    public Score scoreJumpDistance () {
        return this.jumpDistance;
    }
    
    public String getJumpDistance () {
        return "    length: " + this.jumpDistance.getScore();
    }
    
    public String getJudgesScore () {
        String output = "[";
        int i = 1;
        for (Score js : this.judgesScores) {
            if (i<this.judgesScores.size()) {
                output += js.getScore() + ", ";
            } else {
                output += js.getScore() + "]";
            }
            i++;
        }
        return output;
    }
    
    public String showJudgesScore () {
        return "    judge votes: " + getJudgesScore();
    }
    
    public int reduceJudgesScores () {
        List<Score> jScores = this.judgesScores;
        Collections.sort(jScores);
        int total = 0;
        for (int i = 1; i < jScores.size()-1; i++) {
            total += jScores.get(i).getScore();
        }
        return total;
    }
    
    public int createFinalScore () {
        return this.reduceJudgesScores() + this.scoreJumpDistance().getScore();
    }
}
