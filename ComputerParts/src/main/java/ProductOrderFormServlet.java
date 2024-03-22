import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "productOrderFormServlet",
        urlPatterns = "/submit_order",
        loadOnStartup = 1
)
public class ProductOrderFormServlet extends HttpServlet {

    public ProductOrderFormServlet() {
        System.out.println("Running ProductOrderFormServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ProductOrderFormServlet is printing");

        String customerID = request.getParameter("customerID");
        String product = request.getParameter("product");
        String quantity = request.getParameter("quantity");
        String shipping = request.getParameter("shipping");
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String paymentMethod = request.getParameter("paymentMethod");
        String acceptTerms = request.getParameter("acceptTerms");

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
        writer.println("<title>Product Order Confirmation</title>");
        writer.println("<link href=\"bootstrap.css\" rel=\"stylesheet\">");
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
        writer.println("                    <a class=\"nav-link\" href=\"computerPart.html\">Computer-Parts</a>");
        writer.println("                </li>");
        writer.println("                <li class=\"nav-item\">");
        writer.println("                    <a class=\"nav-link\" href=\"tvRecharge.html\">TV-Recharge</a>");
        writer.println("                </li>");
        writer.println("            </ul>");
        writer.println("        </div>");
        writer.println("    </div>");
        writer.println("</nav>");

        writer.println("<div class=\"container mt-5\">");
        writer.println("    <div class=\"row justify-content-center\">");
        writer.println("        <div class=\"col-md-6\">");
        writer.println("            <h2 class=\"text-center mb-4 mt-4\">Product Order Confirmation</h2>");
        writer.println("            <p><strong>Customer ID:</strong> " + customerID + "</p>");
        writer.println("            <p><strong>Product:</strong> " + product + "</p>");
        writer.println("            <p><strong>Quantity:</strong> " + quantity + "</p>");
        writer.println("            <p><strong>Shipping Method:</strong> " + shipping + "</p>");
        writer.println("            <p><strong>Full Name:</strong> " + fullName + "</p>");
        writer.println("            <p><strong>Email:</strong> " + email + "</p>");
        writer.println("            <p><strong>Payment Method:</strong> " + paymentMethod + "</p>");
        writer.println("            <p><strong>Accept Terms:</strong> " + acceptTerms + "</p>");
        writer.println("        </div>");
        writer.println("    </div>");
        writer.println("</div>");

        writer.println("</body>");
        writer.println("</html>");
        writer.close();

        System.out.println("Service Request made by: " + request.getRemoteAddr());
    }
}