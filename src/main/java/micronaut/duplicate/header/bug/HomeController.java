package micronaut.duplicate.header.bug;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HomeController {

    @Get
    public String index() {
        return "Hello there";
    }
}
