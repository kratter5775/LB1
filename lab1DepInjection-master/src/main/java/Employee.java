import javax.inject.Inject;
import javax.inject.Named;

public class Employee {

    private People people;
    private Profession profession;
    private String tel;
    private String email;

    public Employee() {
    }

    @Inject
    public Employee(People people, Profession profession, @Named("tel") String tel, @Named("email") String email) {
        this.people = people;
        this.profession = profession;
        this.tel = tel;
        this.email = email;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "people=" + people +
                ", profession=" + profession +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
