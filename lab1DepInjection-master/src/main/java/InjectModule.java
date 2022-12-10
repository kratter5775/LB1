import dagger.Module;
import dagger.Provides;

import javax.inject.Named;

@Module
public class InjectModule {

    private String namePeople = "Sasha";
    private int age = 25;
    private String gender = "Male";

    private String nameProfession = "Manager";

    private String tel = "095 756 43 54";
    private String email = "sashamanager@gmail.com";

    public String getNamePeople() {
        return namePeople;
    }

    public void setNamePeople(String namePeople) {
        this.namePeople = namePeople;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNameProfession() {
        return nameProfession;
    }

    public void setNameProfession(String nameProfession) {
        this.nameProfession = nameProfession;
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

    @Provides
    @Named("peopleName")
    public String providePeopleName(){
        return namePeople;
    }

    @Provides
    @Named("age")
    public int provideAge(){
        return age;
    }

    @Provides
    @Named("gender")
    public String provideGender(){
        return gender;
    }

    @Provides
    @Named("professionName")
    public String provideProfessionName(){
        return nameProfession;
    }

    @Provides
    @Named("tel")
    public String provideTel(){
        return tel;
    }

    @Provides
    @Named("email")
    public String provideEmail(){
        return email;
    }

}
