import dagger.Component;

@Component(modules = InjectModule.class)
public interface InjectComponent {

    Company buildCompany();

}
