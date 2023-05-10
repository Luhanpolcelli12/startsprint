package startspring.IndexControler;

import org.springframework.stereotype.Controller;

@Controller
public class IndexControler {
    
    public String home() {
        return "index.jsp";
    }
}
