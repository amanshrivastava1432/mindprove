package in.mindprove.home;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class HomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<!DOCTYPE html>");
        out.print("<html lang='en'>");
        out.print("<head>");
        out.print("<meta charset='UTF-8'>");
        out.print("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.print("<title>User Registration</title>");
        out.print("<style>");
        out.print("body { background-image: url('World.jpg'); background-size: cover; }");
        out.print("header { text-align: center; padding: 20px; }");
        out.print("nav li { display: inline; margin: 0 20px; list-style-type: none; }");
        out.print("nav a { text-decoration: none; color: white; font-weight: bold; }");
        out.print("h1 { text-align: center; background: black; color: white; }");
        out.print("fieldset { width: 300px; margin: auto; width: 30%; }");
        out.print("label { display: block; margin-top: 10px; color: red; }");
        out.print("input { display: block; width: 100%; padding: 11px; border-radius: 14px; }");
        out.print("button { margin-top: 10px; padding: 10px; width: 48%; border-radius: 115px; background: black; color: white; font-size: 20px; cursor: pointer; }");
        out.print("</style>");
        out.print("</head>");
        out.print("<body>");
        
        out.print("<header>");
        out.print("<nav>");
        out.print("<ul>");
        out.print("<li><a href='Home'>HOME</a></li>");
        out.print("<li><a href='Registration'>REGISTRATION</a></li>");
        out.print("<li><a href='AboutUs'>ABOUT US</a></li>");
        out.print("<li><a href='ContactUs'>CONTACT US</a></li>");
        out.print("</ul>");
        out.print("</nav>");
        out.print("</header>");
        
        out.print("<h1>User Registration</h1>");
        out.print("<hr>");
        out.print("<form action='/CollegeManagementSystem/StudentData'>");
        out.print("<fieldset>");
        out.print("<label for='firstName'>First Name:</label>");
        out.print("<input type='text' id='firstName' name='FirstName' placeholder='Enter your first name' required>");
        out.print("<label for='lastName'>Last Name:</label>");
        out.print("<input type='text' id='lastName' name='LastName' placeholder='Enter your last name' required>");
        out.print("<label for='emailID'>Email ID:</label>");
        out.print("<input type='email' id='emailID' name='EmailID' placeholder='abc@example.com' required>");
        out.print("<label for='password'>Password:</label>");
        out.print("<input type='password' id='password' name='Password' placeholder='Enter your password' required>");
        out.print("<label for='gender'>Gender:</label>");
        out.print("<input type='text' id='gender' name='Gender' placeholder='Enter your gender' required>");
        out.print("<button type='reset'>Reset</button>");
        out.print("<button type='submit'>Submit</button>");
        out.print("</fieldset>");
        out.print("</form>");
        out.print("<hr>");
        out.print("<footer><b>&copy; MindProove Technology Pvt Ltd</b></footer>");
        
        out.print("</body>");
        out.print("</html>");
    }
}