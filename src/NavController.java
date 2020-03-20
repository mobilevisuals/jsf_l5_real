import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Random;

@Named(value = "navcontroller")
@SessionScoped

public class NavController implements Serializable {

    private boolean logged;

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }


    public void randomize()

    {
        Random rand=new Random();
        logged=rand.nextBoolean();

    }

}
