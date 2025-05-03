public class Student extends Person {

    private int studentID;
    private String schoolName;
    private String section;
    private String fatherName;
    private String motherName;
    private double GWA;

    public static Prompter prompt = new Prompter();

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public void setGWA(double GWA) {
        this.GWA = GWA;
    }

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

    public int getStudentID() {
        return studentID;
    }

    public String getSection() {
        return section;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public double getGWA() {
        return GWA;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
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

    @Override
    public void enterDetails() throws Exception {
        super.enterDetails();
        studentID = prompt.promptStudentID();
        schoolName = prompt.promptSchoolName();
        section = prompt.promptSection();
        GWA = prompt.promptGWA();
        fatherName = prompt.promptFatherName();
        motherName = prompt.promptMotherName();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Student ID: " + studentID);
        System.out.println("School Name: " + schoolName);
        System.out.println("Section: " + section);
        System.out.printf("GWA: %.2f\n", GWA);
        System.out.println("Father name: " + fatherName);
        System.out.println("Mother name: " + motherName);

    }
}
