public class Teacher extends Person{
    private String subject;
    private String title;

    Teacher (String forename, String surname, String phoneNumber, String house, String subject, String title) {
        super(forename,surname,phoneNumber,house);
        this.subject = subject;
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }
    public String getTitle() {
        return title;
    }
}
