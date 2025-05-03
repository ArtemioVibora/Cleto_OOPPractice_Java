import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Guest extends Person {
    private String purposeOfVisit;

    public static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    public static BufferedReader reader = new BufferedReader(inputStreamReader);

    public static Prompter prompt = new Prompter();

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setNationality(String nationality) {
        super.setNationality(nationality);
    }

    @Override
    public void setMotherLanguage(String motherLanguage) {
        super.setMotherLanguage(motherLanguage);
    }

    public void setPurposeOfVisit(String purposeOfVisit) {
        this.purposeOfVisit = purposeOfVisit;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getNationality() {
        return super.getNationality();
    }

    @Override
    public String getMotherLanguage() {
        return super.getMotherLanguage();
    }

    public String getPurposeOfVisit() {
        return purposeOfVisit;
    }

    @Override
    public void enterDetails() throws Exception {
        super.enterDetails();
        purposeOfVisit = prompt.promptPurposeOfVisit();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Purpose of Visit: " + purposeOfVisit);
    }
}
