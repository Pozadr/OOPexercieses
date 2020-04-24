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
        Computer my1stPc = new Computer(
                "MSI MPG X570 Gaming Plus ",
                new Processor("AMD Hiperduper X899", 100, 3500),
                new Ram("HYPERX 3200", 16000, 16),
                new Ram("FreeSlot", 0, 0),
                new Ram("HYPERX 3200", 1600, 8),
                new Ram("Test",3200, 2),
                new HardDrive("Sandisk Plus 1", 480, 535,
                        445),
                new HardDrive("Sandisk Plus 2", 256, 530,
                        400),
                new HardDrive("FreeSlot", 0, 0,
                        0));

        my1stPc.setHardDriveSlot(new HardDrive("Test Hard Drive",
                999, 999,999));

        my1stPc.setMonitor(new Monitor("Monitor LG 27GL850-B", 27,
                "OLED"));
        my1stPc.setPrinter(new Printer("Brother DCP 7055", "600x600",true));
        System.out.println(my1stPc.toString());
        //my1stPc.setRamSlot(new Ram("SuperRam",1500, 9999));
        //System.out.println(my1stPc.toString());

    }
}
