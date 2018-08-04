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
    int tie = 0;

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }
    
    

    public int getTie() {
        return tie;
    }

    public void setTie(int tie) {
        this.tie = tie;
    }
    
    public void resetScoreTie(){
        this.tie = 0;
    }
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
    
    public boolean isFully(char board[][]){
        for (int row = 0; row <3 ; row++) {
            for (int col = 0; col < 3; col++) {
                if(board[row][col]==0){
                    return false;
                }
            }
        }
        return true;
    }
    
    public void resetScore(){
        
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

    public boolean addSymbol(int row, int column) {
        System.out.println(currentPlayer);
        boolean result = false;
        if (board[row][column] == 0) {
            board[row][column] = currentPlayer;
            result = true;
        }
        // ต้องนำมาเช็คก่อนเพื่อเพิ่มคะแนนให้แก่ผู้เล่นตรงนี้ในระบบ ก่อนที่จะเปลีย่นผู้เล่น !!!
        changePlayer();
        return result;
    }

    public char getSymBolFromBoard(int row, int column) {
        return board[row][column];
    }

    public boolean checkHorizontal() {
        boolean result = false;
        if (board[0][0] == board[0][1] & board[0][1] == board[0][2]) {
            result = true;
        } else if (board[1][0] == board[1][1] & board[1][1] == board[1][2]) {
            result = true;
        } else if (board[2][0] == board[2][1] & board[2][1] == board[2][2]) {
            result = true;
        }

        //ถ้าชนะจะบวกคะแนนให้ผู้เล่นคนนั้น
        if (result == true) {
            System.out.println("I'm " + currentPlayer + " Win !!!");
            addScoreToPlayerWhoWin();
            //ชนะเพิ่มคะแนนจบแล้วก็ล้าง
            createBoard();
        }
        return result;
    }

    public void addScoreToPlayerWhoWin() {
        if (this.currentPlayer == 'x') {
            this.player1.increaseScore();
        } else {
            this.player2.increaseScore();
        }
    }

    public void changePlayer() {

        if (this.currentPlayer == 'x') {
            this.setCurrentPlayer('o');
        } else {
            this.setCurrentPlayer('x');
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

    // Servelet
    public static void main(String[] args) {
        Game game = new Game();
        //X ชนะ
        game.addSymbol(0, 0); //x
        game.addSymbol(1, 1);  //o
        game.addSymbol(0, 1); //x
        game.addSymbol(2, 1); //o
        game.addSymbol(0, 2); //x
        game.checkHorizontal();
    }
    return false;
  }

}
