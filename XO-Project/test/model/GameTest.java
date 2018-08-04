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

    @Test
    public void testAddSymbol(int row, int column) {
        Game g = new Game();
        g.createBoard();
        g.addSymbol(0, 0);
        //assertEquals('x', g.getSymBolFromBoard(0, 0));
    }
    
    @Test
    public void testChangePlayer() {
        assertEquals(true, true);
    }
    

    public void testCheckHorizontal() {

    }

}
