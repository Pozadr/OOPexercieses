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

        // check method ageDifferenceBetweenTwoPeople()
        System.out.println("Age difference between " + adrian.getName()
                + " : " + kasia.getName() + " is "
                + Person.ageDifferenceBetweenTwoPeople(adrian, kasia));

        System.out.println("\n----- Computer Class -----");
        Computer my1stPc = new Computer("MSI MPG X570 Gaming Plus ",
                "Procesor AMD Ryzen 5 3600 ", 6, 16);
        my1stPc.setMonitor("Monitor LG 27GL850-B");
        my1stPc.setHd(240);
        my1stPc.setPrinter("Brother DCP 7055");
        System.out.println(my1stPc.toString());

    }
}
