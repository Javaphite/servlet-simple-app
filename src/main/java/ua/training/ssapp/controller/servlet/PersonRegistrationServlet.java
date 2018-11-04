package ua.training.ssapp.controller.servlet;

import ua.training.ssapp.model.Person;
import ua.training.ssapp.model.PersonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registerPerson")
public class PersonRegistrationServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                throws ServletException, IOException {
            req.getRequestDispatcher("/WEB-INF/registerPerson.jsp").forward(req, resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp)
                throws ServletException, IOException {
            String firstName = req.getParameter("firstName");
            String lastName = req.getParameter("lastName");
            String company = req.getParameter("company");
            String accessLevel = req.getParameter("accessLevel");

            PersonService service = PersonService.getInstance();
            service.addPerson(new Person(service.generateId(), firstName, lastName, company, accessLevel));

            resp.sendRedirect(req.getContextPath() + "/");
        }
}
