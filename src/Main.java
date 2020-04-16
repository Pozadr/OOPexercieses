public class Main {
    public static void main(String[] args) {
        Person adrian = new Person("Adrian", "Kowalski",
                "men", 29, "22222222555");
        adrian.displayHowManyYearsToRetirement();


        Person adam = new Person("Adam", "Nowak",
                "men", 70, "245782222555");
        adam.displayHowManyYearsToRetirement();


        Person kasia = new Person("Kasia", "Adamczyk",
                "women", 60, "25437822225788");
        kasia.displayHowManyYearsToRetirement();

        System.out.println("Age difference between " + adrian.getName()
                + " : " + kasia.getName() + " is "
                + Person.ageDiferenceBetweenTwoPeople(adrian, kasia));
    }
}
