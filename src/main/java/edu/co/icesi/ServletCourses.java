package edu.co.icesi;

import edu.co.icesi.model.Course;
import edu.co.icesi.service.CourseService;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/courses")
public class ServletCourses extends HttpServlet {

    private CourseService courseService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        courseService = Application.getContext()
                .getBean("courseService", CourseService.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Cursos registrados<h1>");

        resp.getWriter().println("<ul>");
        for (Course course : courseService.getCourses()) {
            resp.getWriter().println("<li>" + course + "</li>");
        }
        resp.getWriter().println("</ul>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String professorName = req.getParameter("professorName");
        String schedule = req.getParameter("schedule");
        System.out.println("doPost: " + id + " - " + name);

        Course course = new Course(id, name, professorName, schedule);
        courseService.addCourse(course);
        resp.getWriter().println("Curso registrado: " + course);
    }
}
