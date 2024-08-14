package in.mindprove.home;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentData")
public class StudentData extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String firstName = request.getParameter("FirstName");
        String lastName = request.getParameter("LastName");
        String emailID = request.getParameter("EmailID");
        String password = request.getParameter("Password");
        String gender = request.getParameter("Gender");

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "root");

            String sql = "INSERT INTO studentdata (FirstName, LastName, EmailID, Password, Gender) VALUES (?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);

            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, emailID);
            ps.setString(4, password);
            ps.setString(5, gender);

            int rowsAffected = ps.executeUpdate();

            PrintWriter out = response.getWriter();
            if(rowsAffected > 0) {
                out.println("<html><body><h1>Registration Successful</h1></body></html>");
            } else {
                out.println("<html><body><h1>Registration Failed</h1></body></html>");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            response.getWriter().println("Error: MySQL Driver not found.");
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("Error: Database operation failed.");
        } finally {
            if (ps != null) try { ps.close(); } catch (SQLException e) { e.printStackTrace(); }
            if (conn != null) try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
}
