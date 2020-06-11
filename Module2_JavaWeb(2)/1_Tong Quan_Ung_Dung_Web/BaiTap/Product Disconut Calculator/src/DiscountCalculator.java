import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalculator ",urlPatterns = "/calculator")
public class DiscountCalculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        float price =Float.parseFloat(request.getParameter("price"));
        float discount =Float.parseFloat(request.getParameter("discount"));

       double discountAmount =  price*discount*0.1;

        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<h2> Name product    : "+name +"</h2>");
        writer.println("<h2> Discount Amount :  "+discountAmount +"</h2>");
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
