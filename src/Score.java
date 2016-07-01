/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author natha
 */
import java.util.Random;
import java.util.ArrayList;
public class Score implements Comparable<Score>{
        private Random random = new Random();
        private int Score;
        
        public Score(int seed, int threshold) {
            this.Score = random.nextInt(seed)+threshold;
        }
        
        public int getScore() {
            return this.Score;
        }
        
        public ArrayList<Score> makeJudgesScores () {
            ArrayList<Score> mJS = new ArrayList<Score>();
            for (int i = 0; i < 5; i++) {
                mJS.add(new Score(10,10));
            }
            return mJS;
        }
        
        @Override
        public int compareTo(Score aScore) {
            if (aScore.getScore()>this.Score) {
                return 1;
            } else if (aScore.getScore()<this.Score) {
                return -1;
            } else {
                return 0;
            }
        }
}
