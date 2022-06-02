package com.example.secondjavaproject.servletTest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "setvletApplication", urlPatterns = "/hello")
public class SetvletApplication extends HttpServlet{
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        // 단축키 : soutv
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        // 쿼리 파라미터 사용
        String username = request.getParameter("username");
        System.out.println("username = " + username);

        // 응답 찍어보기
        // setContentType : 단순문자
        response.setContentType("text/plain");
        // setCharacterEncoding : 인코딩 정보
        response.setCharacterEncoding("utf-8");
        // getWriter().write : http 바디에 메시지가 들어감
        response.getWriter().write("hello " + username);
    }
}
