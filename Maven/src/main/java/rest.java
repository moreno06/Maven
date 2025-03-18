import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class rest extends ResourceConfig {
    public rest() {
        packages("");
    }
}