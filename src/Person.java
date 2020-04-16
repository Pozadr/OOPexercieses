public class Person {
    private String name;
    private String surname;
    private String gender;
    private int age;
    private  String pesel;

    // dodać walidację tworzenia obiektu
    public Person(String name, String surname, String gender, int age, String pesel){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean hasReachedRetirementAge(){
        if(gender.equals("women") && this.age >= 60){
            return true;
        }
        else if(gender.equals("men") && this.age >= 65){
            return true;
        }
        else{
            return false;
        }
    }

}
