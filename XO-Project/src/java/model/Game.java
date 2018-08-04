/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author bank2
 */
public class Game {

    Player player1;
    Player player2;
    
    // char พื้นฐานเป็น 0
    char board[][];
    char currentPlayer = 'x';

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(char currentPlayer) {
        this.currentPlayer = currentPlayer;
    }


    public Game() {
        this.player1 = new Player();
        this.player2 = new Player();
        createBoard();
    }

    public void createBoard() {
        board = new char[3][3];
    }

    public boolean checkDiagonal() {
        boolean result = false;
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            result = true;
        } else if ((board[0][2] == board[1][1] && board[0][2] == board[2][0])) {
            result = true;
        }
        return result;
    }

    public boolean addSymbol(int row, int column){
        boolean result = false;
        if (board[row][column] == 0) {
            board[row][column] = currentPlayer;
            result = true;
        }
        return result;
    }
    public char getSymBolFromBoard(int row, int column){
        return board[row][column];
    }

    public boolean checkHorizontal() {
        boolean result = false;
        if ( board[0][0] == board[0][1] & board[0][1] ==board[0][2] ) {
            result = true;
        }else if( board[1][0] == board[1][1] & board[1][1] ==board[1][2]){
            result = true;
        }else if( board[2][0] == board[2][1] & board[2][1] ==board[2][2]){
            result = true;
        }
        return result;
    }

    public void changePlayer() {
        if (currentPlayer == 'o') {
            setCurrentPlayer('x');
        } else {
            setCurrentPlayer('o');
        }
    }


  public boolean checkVertical(char symbol) {
    if(board[0][0] == symbol &&
      board[1][0] == symbol &&
      board[2][0] == symbol
    ){
      return true;
    } else if (board[0][1] == symbol &&
      board[1][1] == symbol &&
      board[2][1] == symbol) {
      return true;
    } else if (board[0][2] == symbol &&
      board[1][2] == symbol &&
      board[2][2] == symbol) {
      return true;
    }
    return false;
  }

}
