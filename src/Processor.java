public class Processor {
    private String name; // nazwa procesora
    private int cores; // liczba rdzeni
    private int clockSpeed;

    public Processor(String name, int cores, int clockSpeed){
        this.name = name;
        this.cores = cores;
        this.clockSpeed = clockSpeed;
    }

    public String getName() {
        return name;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "name='" + name + '\'' +
                ", cores=" + cores +
                '}';
    }
}
