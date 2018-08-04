/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Game;

/**
 *
 * @author wdrdr
 */
public class GameServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String input_row = request.getParameter("row");
        String input_col = request.getParameter("col");
        HttpSession session = request.getSession(true);
        if(session.getAttribute("game") == null){
            session.setAttribute("game", new Game());
        }
        System.out.println("im here");
        Game game = (Game)session.getAttribute("game");
        
        if (input_row != null || input_col != null) {
            try {
            int row = Integer.parseInt(input_row);
            int col = Integer.parseInt(input_col);
            request.getSession().setAttribute("message", "row : "+row+" column : "+col);
            game.addSymbol(row, col);

            } catch (Exception e) {
                request.getSession().setAttribute("message", "กรุณาตอบใหม่ ");
            }
            System.out.println("Hiii");
        }
        System.out.println(game.checkDiagonal() || game.checkHorizontal() || game.checkVertical());
        if (game.checkDiagonal() || game.checkHorizontal() || game.checkVertical()){
            System.out.println(game);
            System.out.println(game.getCurrentPlayer());
            System.out.println(game.getPlayer1());
            game.addScore(game.getCurrentPlayer());
            
        }
        
        session.setAttribute("board", game.getBoard());

        

        request.getRequestDispatcher("/index.jsp").forward(request, response);
//            response.sendRedirect("/index.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
