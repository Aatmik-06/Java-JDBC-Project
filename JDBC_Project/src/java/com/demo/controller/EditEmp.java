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
public class EditEmp extends HttpServlet {

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
            out.println("<title>Servlet EditEmp</title>");
            out.println("</head>");
            out.println("<body>");
            
            int empno = Integer.parseInt(request.getParameter("empno"));
            EmpDAO sd = new EmpDAO();
            EmpBean sb = sd.findbyid(empno);
            
            out.println("<div style='display: flex; flex-direction: column; justify-content: center;align-items: center; '> ");
            out.println("<Form action='EditEmpController' style='display: flex;justify-content: center;flex-direction: column;width: 350px;'>");
            out.println("<h1>Add Employee Form</h1>");
            
            out.println("<label for='empNo'>Employee Number</label>");
            out.println("<input type='number' value='" + sb.getEmpno()+ "' name='empNo' placeholder='Enter employee number'style='width: 300px; padding: 5px; margin-bottom: 10px;'>");
            
            out.println("<label for='empName'>Employee Name</label>");
            out.println("<input type='text' value='" + sb.getEmpName()+ "' name='empName' placeholder='Enter employee name'style='width: 300px; padding: 5px; margin-bottom: 10px;'>");
            
            out.println("<label for='job'>Job</label> ");
            out.println("<input type='text' value='" + sb.getJob()+ "' name='job' placeholder='Enter job title'style='width: 300px; padding: 5px; margin-bottom: 10px;'>");
            
            out.println("<label for='mgr'>MGR</label> ");
            out.println("<input type='number' value='" + sb.getMgr()+ "' name='mgr' placeholder='Enter mgr no.'style='width: 300px; padding: 5px; margin-bottom: 10px;'>");
            
            out.println("<label for='hiredate'>Hiredate</label> ");
            out.println("<input type='date' value='" + sb.getHireDate()+ "' name='hiredate'style='width: 300px; padding: 5px;'>");
            
            out.println("<label for='salary'>Salary</label> ");
            out.println("<input type='number' value='" + sb.getSalary()+ "' name='salary' placeholder='Enter salary'style='width: 300px; padding: 5px; margin-bottom: 10px;'>");
            
            out.println("<label for='comm'>Comm</label> ");  
            out.println("<input type='number' value='" + sb.getComm()+ "' name='comm' placeholder='Enter Comm' style='width: 300px; padding: 5px; margin-bottom: 10px;'>");
            
            out.println("<label for='deptNo'>Department Number</label> ");
            out.println("<input type='number' value='" + sb.getDeptno()+ "' name='deptNo' placeholder='Enter department number'style='width: 300px; padding: 5px; margin-bottom: 10px;'>");
            
            out.println("<input type='submit' name='submit' value='Update Employee' style='width: 315px; padding: 5px;'/>");
       
            
            out.println("</Form>");
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
