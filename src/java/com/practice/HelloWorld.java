package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloWorld extends HttpServlet{
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
//      out.print("<h1>Welcome to Register Servlet</h1>");
        
        String name = request.getParameter("user_name");        
        String email = request.getParameter("user_email");
        String password = request.getParameter("user_password");
        String gender = request.getParameter("user_gender");
        String course = request.getParameter("user_courses");
        String cond = request.getParameter("condition");
        
        
        if(cond!=null){
//        if(cond.equals("checked")){
            out.println("<h2>Name : "+name+" </h2>");            
            out.println("<h2>Email : "+email+" </h2>");
            out.println("<h2>Password : "+password+" </h2>");
            out.println("<h2>Gender : "+gender+" </h2>");
            out.println("<h2>Course : "+course+" </h2>");
            out.println("<h2>cond : "+cond+" </h2>");
//        }
//        else{
//            out.println("<h1>You have not accepted terms and conditions</h1>");
//     }
        
        
    }
    else{
            out.println("<h1>You have not accepted terms and conditions</h1>");
   
            // Request Dispatcher -> I want to include inde.html page on error
            
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            rd.include(request, response);
        
        }  
  }
}
    