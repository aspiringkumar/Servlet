
package com.form;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class Success_form extends HttpServlet 
{
    @Override
    public void doPost(HttpServletRequest req , HttpServletResponse resp )throws ServletException , IOException
    {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>wollaaa ...you have successfully registered </h1>");
    }
}
