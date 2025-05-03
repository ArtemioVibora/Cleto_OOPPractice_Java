public class Person {
    private String name;
    private String nationality;
    private int age;
    private String motherLanguage;

    public static Prompter prompt = new Prompter();

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMotherLanguage(String motherLanguage) {
        this.motherLanguage = motherLanguage;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }

    public String getMotherLanguage() {
        return motherLanguage;
    }

    public void enterDetails() throws Exception
    {
        name = prompt.promptName();
        age = prompt.promptAge();
        nationality = prompt.promptNationality();
        motherLanguage = prompt.promptMotherLanguage();
    }

    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
        System.out.println("Mother Language: " + motherLanguage);
    }
}
