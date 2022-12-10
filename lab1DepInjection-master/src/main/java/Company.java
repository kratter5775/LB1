import javax.inject.Inject;

public class Company {

    private Personnel personnel;

    public Company() {
    }

    @Inject
    public Company(Personnel personnel) {
        this.personnel = personnel;
    }

    public Personnel getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Personnel personnel) {
        this.personnel = personnel;
    }

    @Override
    public String toString() {
        return "Company{" +
                "personnel=" + personnel +
                '}';
    }
}
