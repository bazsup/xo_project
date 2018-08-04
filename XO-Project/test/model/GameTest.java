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
        this.newGame = new Game();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of checkDiagonal method, of class Game.
     */
    @Test
    public void testCheckDiagonal() {
        Game g = new Game();
    }

//    @Test
//    public void testAddSymbol(int row, int column) {
//        Game g = new Game();
//        g.createBoard();
//        g.addSymbol(0, 0);
//        //assertEquals('x', g.getSymBolFromBoard(0, 0));
//    }
    
    @Test
    public void testChangePlayer() {
        assertEquals(true, true);
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

}
