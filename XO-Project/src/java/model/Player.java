/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author wdrdr
 */
public class Player {
    int score  = 90;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    public void increaseScore(){
        this.score++;

    }
    
    public void resetScore(){
        this.score = 0;
    }
   
}
