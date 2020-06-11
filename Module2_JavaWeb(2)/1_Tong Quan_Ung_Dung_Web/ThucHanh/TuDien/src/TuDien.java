import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TuDien",urlPatterns = "/translate")
public class TuDien extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dictionary= new HashMap<>();
          dictionary.put("hello","xin chào");
          dictionary.put("one","số một");
          dictionary.put("two","số hai");
          dictionary.put("three","số ba");
          dictionary.put("four","số bốn");

          String search =request.getParameter("txtSearch");

        PrintWriter writer=response.getWriter();
        writer.println("<html>");

        String result=dictionary.get(search);
        if (result != null){
            writer.println("<h3> Word : "+search +"</h3>");
            writer.println("<h3>Result : "+result+"</h3>");
        }else {
            writer.println("Not found");
        }

        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dictionary= new HashMap<>();
        dictionary.put("hello","xin chào");
        dictionary.put("one","số một");
        dictionary.put("two","số hai");
        dictionary.put("three","số ba");
        dictionary.put("four","số bốn");

        String search =request.getParameter("txtSearch");

        PrintWriter writer=response.getWriter();
        writer.println("<html>");

        String result=dictionary.get(search);
        if (result != null){
            writer.println("<h3> Word : "+search +"</h3>");
            writer.println("<h3>Result : "+result+"</h3>");
        }else {
            writer.println("Not found");
        }

        writer.println("</html>");
    }
}
