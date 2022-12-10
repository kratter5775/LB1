import javax.inject.Inject;
import javax.inject.Named;

public class Profession {

    private String name;

    public Profession() {
    }

    @Inject
    public Profession(@Named("professionName") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Profession{" +
                "name='" + name + '\'' +
                '}';
    }
}
