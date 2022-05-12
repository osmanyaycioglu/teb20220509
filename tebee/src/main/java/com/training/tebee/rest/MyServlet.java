package com.training.tebee.rest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest reqParam,
                         HttpServletResponse respParam) throws ServletException, IOException {
        String parameterLoc = reqParam.getParameter("name");
        respParam.getWriter()
                 .append("Merhaba " + parameterLoc);
        respParam.addHeader("Content-Type",
                            "text/plain");
    }

}
