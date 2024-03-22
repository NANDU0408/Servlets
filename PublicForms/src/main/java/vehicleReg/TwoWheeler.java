package vehicleReg;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "twoWheeler",
        urlPatterns = "/twoWheelerReg",
        loadOnStartup = 1
)
public class TwoWheeler extends HttpServlet {

    public TwoWheeler() {
        System.out.println("Running TwoWheelerRegForm");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("TwoWheelerRegForm is processing the request");

        String vehicleMake = req.getParameter("vehicleName");
        String vehicleModel = req.getParameter("vehicleModel");
        int year = Integer.parseInt(req.getParameter("year"));
        String color = req.getParameter("color");
        String transmission = req.getParameter("transmission");
        String fuelType = req.getParameter("fuelType");
        String licensePlate = req.getParameter("licensePlate");
        String ownerFirstName = req.getParameter("ownerFirstName");
        String ownerLastName = req.getParameter("ownerLastName");
        String ownerEmail = req.getParameter("ownerEmail");
        String ownerPhoneNumber = req.getParameter("ownerPhoneNumber");
        String manufacturer = req.getParameter("manufacturer");
        String engineNumber = req.getParameter("engineNumber");
        String chassisNumber = req.getParameter("chassisNumber");
        String registrationDate = req.getParameter("registrationDate");

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter writer = resp.getWriter();
        writer.println("<!DOCTYPE html>");
        writer.println("<html lang=\"en\">");
        writer.println("<head>");
        writer.println("<meta charset=\"UTF-8\">");
        writer.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        writer.println("<title>Four-Wheeler Registration Details</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h2>Four-Wheeler Registration Details</h2>");
        writer.println("<p><strong>Vehicle Make:</strong> " + vehicleMake + "</p>");
        writer.println("<p><strong>Vehicle Model:</strong> " + vehicleModel + "</p>");
        writer.println("<p><strong>Year:</strong> " + year + "</p>");
        writer.println("<p><strong>Color:</strong> " + color + "</p>");
        writer.println("<p><strong>Transmission Type:</strong> " + transmission + "</p>");
        writer.println("<p><strong>Fuel Type:</strong> " + fuelType + "</p>");
        writer.println("<p><strong>License Plate:</strong> " + licensePlate + "</p>");
        writer.println("<p><strong>Owner First Name:</strong> " + ownerFirstName + "</p>");
        writer.println("<p><strong>Owner Last Name:</strong> " + ownerLastName + "</p>");
        writer.println("<p><strong>Owner Email:</strong> " + ownerEmail + "</p>");
        writer.println("<p><strong>Owner Phone Number:</strong> " + ownerPhoneNumber + "</p>");
        writer.println("<p><strong>Manufacturer:</strong> " + manufacturer + "</p>");
        writer.println("<p><strong>Engine Number:</strong> " + engineNumber + "</p>");
        writer.println("<p><strong>Chassis Number:</strong> " + chassisNumber + "</p>");
        writer.println("<p><strong>Registration Date:</strong> " + registrationDate + "</p>");
        writer.println("</body>");
        writer.println("</html>");

        writer.close();

        System.out.println("Service Request is made by: " + req.getRemoteAddr());
    }
}