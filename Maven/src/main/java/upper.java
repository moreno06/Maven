import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * 
 * @author Stefano Lenzi &lt;stefano@lenzi.pro&gt;
 * 
 */
@Path("uppercase")
public class upper {
	@GET
	@Path("{word}")
	public String test(@PathParam("word") String name) {
		return "Ciao " + name.toUpperCase();
	}
}