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
    // get
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    //display
    public void displayHowManyYearsToRetirement(){
        System.out.println("Did " + getName() + " reach retirement age?");
        if(hasReachedRetirementAge()){
            System.out.println("Age: " + getAge() + ". Yes\n");
        }
        else{
            System.out.println("No, " + howManyYearsToRetirement()
                    + " left to retirement\n");
        }
    }

    //other
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

    public int howManyYearsToRetirement(){
        if(gender.equals("women")){
            return 60 - this.age;
        }
        else if(gender.equals("men")){
            return 65 - this.age;
        }
        else return 0;
    }

    static public int ageDiferenceBetweenTwoPeople(Person first, Person second){
        return Math.abs(first.getAge() - second.getAge());
    }

}
