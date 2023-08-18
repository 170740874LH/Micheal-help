/**
 * Person
 */
public class Person {
    private String forename;
    private String surname;
    private String phoneNumber;
    private String house;
    Person (String forename, String surname, String phoneNumber, String house) {
        this.forename = forename;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.house = house;
    }
    public String getForename() {
        return forename;
    }
    public String getSurname() {
        return surname;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getHouse() {
        return house;
    }

}