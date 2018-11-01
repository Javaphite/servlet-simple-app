package ua.training.ssapp.servlet;

import ua.training.ssapp.model.PersonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class SimpleAppBaseServlet extends HttpServlet {

    static final PersonService SERVICE = new PersonService(); // TODO: replace with request for singleton

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("participants", SERVICE.getParticipantsList());
        req.getRequestDispatcher("welcome.jsp").forward(req, resp);
    }
}
