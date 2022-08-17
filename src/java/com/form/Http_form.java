
package com.form;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class Http_form extends HttpServlet
{

   
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException ,IOException
    {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h2> hii  welcome to register servlet</h2>");
        String name = req.getParameter("user_name");
        String password = req.getParameter("user_password");
        String email = req.getParameter("user_email");
        String gender = req.getParameter("user_gender");
        String course = req.getParameter("user_course");
        String condition = req.getParameter("condition");
        if(condition != null){
        if(condition.equals("checked"))
        {
           out.println("<h2>name :"+name+"</h2>");
           out.println("<h2>password :"+password+"</h2>");
           out.println("<h2>email :"+email+"</h2>");
           out.println("<h2>gender :"+gender+"</h2>");
           out.println("<h2>course :"+course+"</h2>");
           
           RequestDispatcher rd = req.getRequestDispatcher("success");
           rd.forward(req, resp);
           
        }
        else{
            out.println("<h1> you have not checked terms and conditions </h1>");
        }
                
    
    }
    else{
    out.println("<h1> you have not checked terms and conditions </h1>");
    // include output of index.html
    //get the object of requestdDispatcher
    
    RequestDispatcher rd = req.getRequestDispatcher("index.html");
    rd.include(req, resp);
}
}
}
