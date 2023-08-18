public class Main {
    public static void main(String[] args) {
        Student student = new Student("Michael" , "Murdoch", "39284213", "cockburn", "6C1", "120800345");
        Teacher teacher = new Teacher("Tom" , "Hendry", "07419139000", "cockburn", "Computing", "The Goat");

        System.out.println(student.getForename());
        System.out.println(student.getSurname());
        System.out.println(student.getPhoneNumber());
        System.out.println(student.getHouse());
        System.out.println(student.getTutorClass());
        System.out.println(student.getCandidteNumber());

        System.out.println();

        System.out.println(teacher.getForename());
        System.out.println(teacher.getSurname());
        System.out.println(teacher.getPhoneNumber());
        System.out.println(teacher.getHouse());
        System.out.println(teacher.getSubject());
        System.out.println(teacher.getTitle());

    }
}
