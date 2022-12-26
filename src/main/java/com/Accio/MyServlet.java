package com.Accio;

import org.jetbrains.annotations.NotNull;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet")
//This is servlet(Mini Server)
public class MyServlet extends HttpServlet
{
    //this will handle request
    protected void doGet(HttpServletRequest request, @NotNull HttpServletResponse response) throws IOException
    {
        //set content type of response
        response.setContentType("text/html");
        //get writer to write content in response
        PrintWriter out = response.getWriter();
        //write content
        out.println("<h3>This is my Servlet<h3>");
    }
}
