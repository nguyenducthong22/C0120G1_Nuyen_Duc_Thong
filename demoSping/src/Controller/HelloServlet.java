package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
@Controller
public class HelloServlet extends javax.servlet.http.HttpServlet {
    @GetMapping("/")
    public String getIndex(Model model){
        return "index";
    }
}

