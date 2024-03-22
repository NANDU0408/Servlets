import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "DeathCertForm",
        urlPatterns = "/deathForm",
        loadOnStartup = 1
)
public class DeathCertForm extends HttpServlet {

    public DeathCertForm() {
        System.out.println("Running DeathCertForm");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("DeathCertForm is printing");
        String firstName = req.getParameter("fname");
        String lastName = req.getParameter("lname");
        String birthDate = req.getParameter("bdate");
        String deathDate = req.getParameter("ddate");
        String causeOfDeath = req.getParameter("COD");
        String placeOfDeath = req.getParameter("POD");
        String cityOfDeath = req.getParameter("CIOD");
        String countryOfDeath = req.getParameter("COOD");
        String witnessName = req.getParameter("WName");
        String relationToDeceased = req.getParameter("ROD");

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter writer = resp.getWriter();
        writer.println("<!DOCTYPE html>");
        writer.println("<html lang=\"en\">");
        writer.println("<head>");
        writer.println("<meta charset=\"UTF-8\">");
        writer.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        writer.println("<title>Death Certificate Details</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h2>Death Certificate Details</h2>");
        writer.println("<p><strong>Deceased First Name:</strong> " + firstName + "</p>");
        writer.println("<p><strong>Deceased Last Name:</strong> " + lastName + "</p>");
        writer.println("<p><strong>Date of Birth:</strong> " + birthDate + "</p>");
        writer.println("<p><strong>Date of Death:</strong> " + deathDate + "</p>");
        writer.println("<p><strong>Cause of Death:</strong> " + causeOfDeath + "</p>");
        writer.println("<p><strong>Place of Death:</strong> " + placeOfDeath + "</p>");
        writer.println("<p><strong>City of Death:</strong> " + cityOfDeath + "</p>");
        writer.println("<p><strong>Country of Death:</strong> " + countryOfDeath + "</p>");
        writer.println("<p><strong>Witness Name:</strong> " + witnessName + "</p>");
        writer.println("<p><strong>Relation to Deceased:</strong> " + relationToDeceased + "</p>");
        writer.println("</body>");
        writer.println("</html>");

        writer.close();

        System.out.println("Service Request is made by: " + req.getRemoteAddr());
    }
}