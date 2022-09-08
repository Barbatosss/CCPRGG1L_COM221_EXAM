public class Student {
    String surname;
    String firstName;
    String middleInitial;
    String dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;
    String amIawesome;

    public Student(String srm, String fsn, String mi, String bday, boolean Iw){
        surname = srm;
        firstName = fsn;
        middleInitial = mi;
        dateOfBirth = bday;
        iAmAwesome = Iw;

        System.out.println("Hi Im " + surname + firstName + middleInitial + "\n" + "born on " + dateOfBirth + "\n" + "IamAwesome " + Iw);
        

    }
    
    public void sayMyStudentNumber(){
        System.out.println("My student number is " + studentNumber);
    }
    public void sayMyEmailAddress(){
        System.out.println("My student Email adress is " + studentEmailAddress);
    }
    public void sayamIawesome(){
        System.out.println("am I awesome? " + amIawesome);
    }
}
