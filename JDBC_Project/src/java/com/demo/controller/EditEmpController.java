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
public class EditEmpController extends HttpServlet {

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
            out.println("<title>Servlet EditEmpController</title>");
            out.println("</head>");
            out.println("<body>");
            
            int empNo = Integer.parseInt(request.getParameter("empNo"));
            String name = request.getParameter("empName");
            String job = request.getParameter("job");
            int mgr = Integer.parseInt(request.getParameter("mgr"));
            String hireDate = request.getParameter("hiredate");
            double salary = Double.parseDouble(request.getParameter("salary"));
            double comm = Double.parseDouble(request.getParameter("comm"));
            int deptNo = Integer.parseInt(request.getParameter("deptNo"));
            
            EmpBean eb = new EmpBean();
            eb.setComm(comm);
            eb.setDeptno(deptNo);
            eb.setEmpName(name);
            eb.setEmpno(empNo);
            eb.setHireDate(hireDate);
            eb.setJob(job);
            eb.setMgr(mgr);
            eb.setSalary(salary);
            
            EmpDAO ed = new EmpDAO();
            
           
            int r = ed.updateEmp(eb); 
              if(r>0){
            response.sendRedirect("viewEmpController");
            }
            else{
              out.println("<h1><font color='red'>Employee Not Updated</font></h1>");
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
