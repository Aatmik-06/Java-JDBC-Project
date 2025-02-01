/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.demo.controller;

import com.task.bean.EmpBean;
import com.task.dao.EmpDAO;
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
public class FindByEmpNoController extends HttpServlet {

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
            out.println("<title>Servlet FindByEmpNoController</title>");
            out.println("</head>");
            out.println("<body>");
            int r= 0;
            int empno = Integer.parseInt(request.getParameter("empNo"));
            
            EmpDAO ed = new EmpDAO();
            EmpBean eb = ed.findbyid(empno);
            
            out.println("<div style='display: flex; flex-direction: column; justify-content: center;align-items: center; '> ");
            out.println("<table border='5' align='center' style='padding:3px'>");
            out.print("<h1 align='center'>All Employees</h1");
            out.println("<tr style='padding: 5px;'><th>Employee ID</th>");
            out.println("<th style='padding: 5px;'>Name</th>");
            out.println("<th style='padding: 5px;'>Job</th>");
            out.println("<th style='padding: 5px;'>Comm</th>");
            out.println("<th style='padding: 5px;'>Department no</th>");
            out.println("<th style='padding: 5px;'>Mgr no</th>");
            out.println("<th style='padding: 5px;'>Salary</th>");
            
            out.println("<tr style='padding: 5px;'>");
            out.println("<td style='padding: 5px;'>" + eb.getEmpno() + "</td>");
            out.println("<td style='padding: 5px;'>" + eb.getEmpName() + "</td>");
            out.println("<td style='padding: 5px;'>" + eb.getJob() + "</td>");
            out.println("<td style='padding: 5px;'>" + eb.getComm() + "</td>");
            out.println("<td style='padding: 5px;'>" + eb.getDeptno() + "</td>");
            out.println("<td style='padding: 5px;'>" + eb.getMgr() + "</td>");
            out.println("<td style='padding: 5px;'>" + eb.getSalary() + "</td>");
            out.println("<td style='padding: 5px;'> <a href='DeleteEmp?empno="+eb.getEmpno()+"'> Delete </a></td>");
            out.println("<td style='padding: 5px;'> <a href='EditEmp?empno="+eb.getEmpno()+"'> Edit </a></td>");
            out.println("</tr>");
            out.println(" <table/>");
             
            out.println("<h2><a href='index' style='text-decoration: none'>Go To Home Page</a> </h2>");
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
