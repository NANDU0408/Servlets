import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "gymRegForm",
        urlPatterns = "/gymReg",
        loadOnStartup = 1
)
public class GymRegForm extends HttpServlet {

    public GymRegForm() {
        System.out.println("Running GymMembershipForm");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GymMembershipForm is printing");

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String phoneNumber = req.getParameter("phoneNumber");
        String gender = req.getParameter("gender");
        String membershipType = req.getParameter("membershipType");

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter writer = resp.getWriter();
        writer.println("<!DOCTYPE html>");
        writer.println("<html lang=\"en\">");
        writer.println("<head>");
        writer.println("<meta charset=\"UTF-8\">");
        writer.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        writer.println("<title>Gym Membership Application Details</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h2>Gym Membership Application Details</h2>");
        writer.println("<p><strong>First Name:</strong> " + firstName + "</p>");
        writer.println("<p><strong>Last Name:</strong> " + lastName + "</p>");
        writer.println("<p><strong>Email:</strong> " + email + "</p>");
        writer.println("<p><strong>Phone Number:</strong> " + phoneNumber + "</p>");
        writer.println("<p><strong>Gender:</strong> " + gender + "</p>");
        writer.println("<p><strong>Membership Type:</strong> " + membershipType + "</p>");
        writer.println("</body>");
        writer.println("</html>");

        writer.close();

        System.out.println("Service Request is made by: " + req.getRemoteAddr());
    }
}