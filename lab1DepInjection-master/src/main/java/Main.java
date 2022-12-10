public class Main {
    public static void main(String[] args) {

        InjectComponent injectComponent;
        injectComponent = DaggerInjectComponent.create();

        Company company = injectComponent.buildCompany();

        System.out.println(company.getPersonnel().getEmployee().getPeople().getName() + '\n'
                + company.getPersonnel().getEmployee().getProfession()
                );


    }
}
