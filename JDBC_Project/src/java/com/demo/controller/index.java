/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.demo.controller;

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
public class index extends HttpServlet {

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
            out.println("<title>Servlet EmpAddController</title>");
            out.println("</head>");
            out.println("<body>");

            out.println("<body>");
            out.println("<div >");
            out.println("<h1>JDBC Project</h1>");
            out.println("</div>");
            out.println("<div >");
            out.println("<div >");
            out.println("<div >");
            out.println("<form action='addEmp'>   <button> Add Employee </button> </form>");
            out.println("<form action='viewEmpController'>  <button>View All Employee</button></form>    ");
            out.println("<form action='FindByEmpNo'>  <button> Find By Employee Number</button></form>");
            out.println("<form action='FindByDeptNo'>  <button> Find By Employee Department Number</button></form>");
            out.println("<form action='FindByJob'>  <button> Find By Employee Job</button></form> ");
            out.println("<form action='SortBySalaryAscendingController'>  <button>  Sort Employee By Salary In Ascending Order</button></form>");
            out.println("<form action='SortBySalaryDescendingController'> <button>  Sort Employee By Salary In Descending Order</button></form>");
            out.println("<form action='SortByNameAscendingController'>  <button> Sort Employee By Name In Ascending Order</button></form>");
            out.println("<form action='SortByNameDescendingController1'>  <button> Sort Employee By Name In Descending Order</button></form>");
            out.println("</div>");
            out.println("</div>");

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
