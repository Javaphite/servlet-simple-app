package ua.training.ssapp.controller.servlet;

import ua.training.ssapp.model.PersonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class SimpleAppBaseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("participants", PersonService.getInstance().getParticipantsList());
        req.getRequestDispatcher("/WEB-INF/welcome.jsp").forward(req, resp);
    }
}
