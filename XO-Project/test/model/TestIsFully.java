package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author top
 */
public class TestIsFully {
    
    
    @Test
    public void ทดสอบเมธอดisFully(){
        
        char board[][] = new char[3][3];
        
        board[0][0]='X';
        board[0][1]='X';
        board[0][2]='X';
        
        board[1][0]='X';
        board[1][1]='X';
        board[1][2]='Y';
        
        board[2][0]='X';
        board[2][1]='X';
        board[2][2]='Y';
        
        
        Game g = new Game();
        
        //assertFalse("บอร์ดยังว่าง", g.isFully(board));
        assertEquals(true, g.isFully(board));
       // assertEquals();
    }
    
   
}
