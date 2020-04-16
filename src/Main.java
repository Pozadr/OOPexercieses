public class Main {
    public static void main(String[] args) {
        Person adrian = new Person("Adrian", "Kowalski",
                "men", 29, "22222222555");
        System.out.println("Did " + adrian.getName() + " reach retirement age?");
        System.out.println("Age: " + adrian.getAge() + ". Answer: "
                + adrian.hasReachedRetirementAge());

        Person adam = new Person("Adam", "Nowak",
                "men", 70, "245782222555");
        System.out.println("Did " + adam.getName() + " reach retirement age?");
        System.out.println("Age: " + adam.getAge() + ". Answer: "
                + adam.hasReachedRetirementAge());

        Person kasia = new Person("Kasia", "Adamczyk",
                "women", 60, "25437822225788");
        System.out.println("Did " + kasia.getName() + " reach retirement age?");
        System.out.println("Age: " + kasia.getAge() + ". Answer: "
                + kasia.hasReachedRetirementAge());
    }
}
