package com.example.demo.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="helloServlet",urlPatterns = "/hello")
public class hello extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("helloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);
        String username = request.getParameter("username");
        System.out.println("username = " + username);

        response.setContentType("text/plain"); //header 정보에 들어감
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("hello"+username);
    }
}

