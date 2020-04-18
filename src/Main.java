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
        /*
        Test test = new Test();
        System.out.println(test.changeLetters("ATTGC"));
        System.out.println(test.changeLetters("GTAT"));
        */

        System.out.println("\n----- Computer Class -----");
        Computer my1stPc = new Computer("MSI MPG X570 Gaming Plus ",
                new Processor("AMD Hiperduper X899", 100, 3500),
                new Ram("HYPERX 3200", 3200, 16),
                new Ram("FreeSlot", 3200, 5),
                new Ram("HYPERX 3200", 3200, 8),
                new Ram("Test",3200, 2));
        my1stPc.setMonitor("Monitor LG 27GL850-B");
        my1stPc.setHd(240);
        my1stPc.setPrinter("Brother DCP 7055");
        System.out.println(my1stPc.toString());
        my1stPc.setRamSlot(new Ram("SuperRam",1500, 9999));
        System.out.println(my1stPc.toString());

    }
}
