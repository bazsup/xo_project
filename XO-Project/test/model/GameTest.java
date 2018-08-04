/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import model.Game;

/**
 *
 * @author bank2
 */
public class GameTest {

    Game newGame;

    public GameTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of checkDiagonal method, of class Game.
     */
    @Test
    public void testCheckDiagonalLeftToRight() {
        Game g = new Game();
        g.addSymbol(0, 0);
        g.addSymbol(1, 1);
        g.addSymbol(2, 2);
        assertEquals(true, g.checkDiagonal());
    }
    public void testCheckDiagonalRightToLeft() {
        Game g = new Game();
        g.addSymbol(0, 2);
        g.addSymbol(1, 1);
        g.addSymbol(2, 0);
        assertEquals(true, g.checkDiagonal());
    }

    @Test
    public void testAddSymbol() {
        Game g = new Game();
        g.addSymbol(0, 0);
        assertEquals('x', g.getSymBolFromBoard(0, 0));
    }

    @Test
    public void testChangePlayer() {
        Game game = new Game();
        assertEquals(game.currentPlayer, 'x');

        game.changePlayer();
        assertEquals(game.currentPlayer, 'o');

        game.changePlayer();
        assertEquals(game.currentPlayer, 'x');
    }

    @Test
    public void checkSymbolVertical_column1_shouldbeTrue() {
      Game game = new Game();
      game.addSymbol(0, 0);
      game.addSymbol(1, 0);
      game.addSymbol(2, 0);
      char symbol = game.getCurrentPlayer();
      boolean actual = game.checkVertical(symbol);
      assertTrue(actual);
    @Test
    public void testCheckHorizontal() {
        Game game = new Game();
        //X ชนะ
//        game.addSymbol(0, 0); //x
//        game.addSymbol(1, 1);  //o
//        game.addSymbol(0, 1); //x
//        game.addSymbol(2, 1); //o
//        game.addSymbol(0, 2); //x

        //0 ชนะ
        game.addSymbol(0, 0); //x
        game.addSymbol(1, 1);  //o
        game.addSymbol(2, 0); //x
        game.addSymbol(1, 0); //o
        game.addSymbol(0, 1); //x
        game.addSymbol(1, 2);

        assertEquals(true, game.checkHorizontal());
    }
    
    @Test
    public void checkSymbolVertical_column2_shouldbeTrue() {
      Game game = new Game();
      game.addSymbol(0, 1);
      game.addSymbol(1, 1);
      game.addSymbol(2, 1);
      char symbol = game.getCurrentPlayer();
      boolean actual = game.checkVertical(symbol);
      assertTrue(actual);
    }
    
    @Test
    public void checkSymbolVertical_column3_shouldbeTrue() {
      Game game = new Game();
      game.addSymbol(0, 2);
      game.addSymbol(1, 2);
      game.addSymbol(2, 2);
      char symbol = game.getCurrentPlayer();
      boolean actual = game.checkVertical(symbol);
      assertTrue(actual);
    }
    
    @Test
    public void checkSymbolVertical_case4_shouldbeFalse() {
      Game game = new Game();
      game.addSymbol(0, 2);
      game.addSymbol(1, 0);
      game.addSymbol(1, 1);
      char symbol = game.getCurrentPlayer();
      boolean actual = game.checkVertical(symbol);
      assertFalse(actual);
    }

    @Test
    public void testPlayer1WinAndIncreaseScore() {
        Game game = new Game();
        //X ชนะ
        game.addSymbol(0, 0); //x
        game.addSymbol(1, 1);  //o
        game.addSymbol(0, 1); //x
        game.addSymbol(2, 1); //o
        game.addSymbol(0, 2); //x
        
        assertEquals(1, game.player1.getScore());
    }

}
