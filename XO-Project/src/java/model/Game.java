/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
<<<<<<< HEAD
 * @author bank2
 */
public class Game {

    char board[][];
    char currentPlayer;
    
    Player player1;
    Player player2;

    public boolean checkDiagonal() {
        boolean result = false;
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            result = true;
        } else if ((board[0][2] == board[1][1] && board[0][2] == board[2][0])) {
            result = true;
        }
        return result;
    }
    public void createBoard(){
        board = new char[3][3];
    }
    
    public void checkHorizontal() {
        
    }

}
