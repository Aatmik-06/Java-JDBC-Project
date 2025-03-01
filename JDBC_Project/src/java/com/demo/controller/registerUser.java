/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.demo.controller;

import com.task.bean.UsersBean;
import com.task.dao.UsersDAO;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author adi18
 */
public class registerUser extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registerUser</title>");
            out.println("</head>");
            out.println("<body>");
            
            int uid = Integer.parseInt(request.getParameter("uid"));
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String mobile = request.getParameter("mobile");
            String userName = request.getParameter("un");
            String password = request.getParameter("ps");

            //step2: Print Data
            out.println("<h1>UID " + uid + "</h1>");
            out.println("<h1>NAME " + name + "</h1>");
            out.println("<h1>Email " + email+ "</h1>");
            out.println("<h1>Mobile " +mobile + "</h1>");
            out.println("<h1>UserName" + userName + "</h1>");
            out.println("<h1>Password " + password + "</h1>");
            //step3: Create an Object of UsersBean
            UsersBean ub=new UsersBean();
            //step4: set data into bean
            ub.setEmail(email);
            ub.setMobile(mobile);
            ub.setName(name);
            ub.setPassword(password);
            ub.setUid(uid);
            ub.setUserName(userName);
            //step5: Create an Object of UsersDAO
            UsersDAO ud=new UsersDAO();
            int r=ud.registerUser(ub);
            if(r>0){
                out.println("<h1><font color='green'>User Registration Success</font></h1>");
                RequestDispatcher rd = request.getRequestDispatcher("index.html");
            }else{
                   out.println("<h1><font color='red'>User Registration Fail</font></h1>");
            }
            out.println("</body>");
            out.println("</html>");
        }
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
