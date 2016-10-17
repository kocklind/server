/**
 * Created by madsgade on 17/10/2016.
 */
import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
@Path("/hashing")
public class TesterEndpoint {
    Gson gson;
    Digester hash;

    public TesterEndpoint() {
        gson = new Gson();
        hash = new Digester();
    }

    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")

    public String hashWithSalt() { return Digester.hashWithSalt("what"); }


    @Path("/getit")
    @GET
    @Produces("text/plain")
    public String getit() {
        return "Got it!";
    }
}