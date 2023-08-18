public class Student extends Person{
    private String tutorClass;
    private String candiditeNumber;

    Student (String forename, String surname, String phoneNumber, String house, String tutorClass, String candidateNumber) {
        super(forename,surname,phoneNumber,house);
        this.tutorClass = tutorClass;
        this.candiditeNumber = candidateNumber;
    }

    public String getTutorClass() {
        return tutorClass;
    }
    public String getCandidteNumber() {
        return candiditeNumber;
    }
}
