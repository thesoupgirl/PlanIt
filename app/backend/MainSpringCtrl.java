import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainSpringCtrl {

      @RequestMapping(method = RequestMethod.GET)
        public String getIndexPage() {
            return "index";
        }

      @RequestMapping(method = RequestMethod.GET)
        public String getRegisterPage() {
            return "register";
        }

      @RequestMapping(method = RequestMethod.GET)
        public String getLoginPage() {
            return "login";
        }

}
