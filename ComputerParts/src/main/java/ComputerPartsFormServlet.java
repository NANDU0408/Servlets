import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "ComputerPartsForm",
        urlPatterns = "/parts",
        loadOnStartup = 1
)
public class ComputerPartsFormServlet extends HttpServlet {

    public ComputerPartsFormServlet() {
        System.out.println("Running ComputerPartsForm");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ComputerPartsForm is printing");

        String brand = request.getParameter("brand");
        String model = request.getParameter("model");
        String color = request.getParameter("color");
        String type = request.getParameter("type");
        String RAM = request.getParameter("RAM");
        String hardDisk = request.getParameter("hardDisk");
        String processor = request.getParameter("processor");
        String generation = request.getParameter("generation");
        String motherboard = request.getParameter("motherboard");
        String cacheSize = request.getParameter("cacheSize");
        double cost = Double.parseDouble(request.getParameter("cost"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        double totalCost = cost * quantity;

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter writer = response.getWriter();
        writer.println("<!DOCTYPE html>");
        writer.println("<html lang=\"en\">");
        writer.println("<head>");
        writer.println("<meta charset=\"UTF-8\">");
        writer.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        writer.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=yes\">\n" +
                "    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js\" integrity=\"sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r\" crossorigin=\"anonymous\"></script>\n" +
                "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js\" integrity=\"sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy\" crossorigin=\"anonymous\"></script>");
        writer.println("<title>Computer Parts Details</title>");
        writer.println("<link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">");
        writer.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
        writer.println("</head>");
        writer.println("<body>");

        writer.println("<nav class=\"navbar navbar-expand-lg navbar-light bg-light fixed-top\">");
        writer.println("    <div class=\"container-fluid\">");
        writer.println("        <a class=\"navbar-brand\" href=\"#\">");
        writer.println("            <img src=\"computerImg.avif\" alt=\"Logo\" style=\"width: 50px;\">");
        writer.println("            Shree Ram Narayan Computer Parts Co. Ltd.");
        writer.println("        </a>");
        writer.println("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">");
        writer.println("            <span class=\"navbar-toggler-icon\"></span>");
        writer.println("        </button>");
        writer.println("        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">");
        writer.println("            <ul class=\"navbar-nav ms-auto\">");
        writer.println("                <li class=\"nav-item\">");
        writer.println("                    <a class=\"nav-link\" href=\"index.html\">Home</a>");
        writer.println("                </li>");
        writer.println("                <li class=\"nav-item\">");
        writer.println("                    <a class=\"nav-link\" href=\"about.html\">About</a>");
        writer.println("                </li>");
        writer.println("                <li class=\"nav-item\">");
        writer.println("                    <a class=\"nav-link\" href=\"contactDetails.html\">Contact</a>");
        writer.println("                </li>");
        writer.println("                <li class=\"nav-item\">");
        writer.println("                    <a href=\"computerPart.html\" class=\"nav-link btn\">Computer-Parts</a>");
        writer.println("                </li>");
        writer.println("                <li class=\"nav-item\">");
        writer.println("                    <a href=\"tvRecharge.html\" class=\"nav-link btn\">TV-Recharge</a>");
        writer.println("                </li>");
        writer.println("            </ul>");
        writer.println("        </div>");
        writer.println("    </div>");
        writer.println("</nav>");

        writer.println("<br>");
        writer.println("<div class=\"mt-5\">");
        writer.println("<h2>Computer Parts Details</h2>");
        writer.println("<p><strong>Brand:</strong> " + brand + "</p>");
        writer.println("<p><strong>Model:</strong> " + model + "</p>");
        writer.println("<p><strong>Color:</strong> " + color + "</p>");
        writer.println("<p><strong>Type:</strong> " + type + "</p>");
        writer.println("<p><strong>RAM:</strong> " + RAM + "</p>");
        writer.println("<p><strong>Hard Disk:</strong> " + hardDisk + "</p>");
        writer.println("<p><strong>Processor:</strong> " + processor + "</p>");
        writer.println("<p><strong>Generation:</strong> " + generation + "</p>");
        writer.println("<p><strong>Motherboard:</strong> " + motherboard + "</p>");
        writer.println("<p><strong>Cache Size:</strong> " + cacheSize + "</p>");
        writer.println("<p><strong>Cost:</strong> $" + cost + "</p>");
        writer.println("<p><strong>Quantity:</strong> " + quantity + "</p>");
        writer.println("<p><strong>Total Cost:</strong> $" + totalCost + "</p>");
        writer.println("</body>");
        writer.println("</html>");
        writer.close();

        System.out.println("Service Request made by: " + request.getRemoteAddr());
    }
}