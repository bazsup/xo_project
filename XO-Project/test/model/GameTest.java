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
    public void testCheckDiagonal() {
        Game g = new Game();
        g.addSymbol(0, 0);
        g.addSymbol(1, 1);
        g.addSymbol(2, 2);
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
    public void testCheckHorizontal() {
        Game game = new Game();
        game.addSymbol(0, 0); //x
        game.addSymbol(0, 1);  //
        game.addSymbol(0, 2);
        game.addSymbol(0, 0);
        assertEquals(true, game.checkHorizontal());
    }

}
