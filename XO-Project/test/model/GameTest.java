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

/**
 *
 * @author bank2
 */
public class GameTest {

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
    public void testAddSymbol(int row, int column) {
        Game g = new Game();
        g.addSymbol(0, 0);
        assertEquals('x', g.getSymBolFromBoard(0, 0));
    }

    public void testCheckHorizontal() {

    }

}
