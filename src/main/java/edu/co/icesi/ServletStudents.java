package edu.co.icesi;

import edu.co.icesi.model.Student;
import edu.co.icesi.service.StudentService;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/students")
public class ServletStudents extends HttpServlet {

    private StudentService studentService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        studentService = Application.getContext()
                .getBean("studentService", StudentService.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Estudiantes registrados<h1>");

        resp.getWriter().println("<ul>");
        for (Student student : studentService.getStudents()) {
            resp.getWriter().println("<li>" + student + "</li>");
        }
        resp.getWriter().println("</ul>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO: leer code, name, program y courseId del request.
        // TODO: registrar al estudiante e inscribirlo directamente en el curso con id = courseId.
        // Lo resolvemos en clase.

        String id = req.getParameter("id");
        String code = req.getParameter("code");
        String name = req.getParameter("name");
        String program = req.getParameter("program");
        String courseId = req.getParameter("courseId");

        System.out.println(code);

        //llamar al service con la info recolectada

        Student student = new Student();

        student.setId(Integer.parseInt(id));
        student.setCode(code);
        student.setName(name);
        student.setProgram(program);
        student.setCourseId(Integer.parseInt(courseId));
        studentService.addStudent(student);




    }
}
