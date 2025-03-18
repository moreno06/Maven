import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("test")  // URL sarà http://localhost:8080/api/test/{name}
public class Test {
    @GET
    @Path("{name}")
    public String test(@PathParam("name") String name) {
        return "Ciao " + name.toUpperCase();
    }
}