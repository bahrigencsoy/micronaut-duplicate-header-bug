package micronaut.duplicate.header.bug;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.net.URI;
import java.net.URISyntaxException;

@Controller
public class HomeController {

    @Get
    public HttpResponse<Void> index() throws URISyntaxException {
        return HttpResponse.seeOther(new URI("https://google.com"));
    }
}
