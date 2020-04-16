public class Computer {

    // obowiązkowe pola
    private String motherboard; // płyta główna
    private String processor; // "i5", "i7", "intel", "amd"
    private int cores; // liczba rdzeni
    private int ram; // ilość ramu
    // dodatkowe pola
    private int hd; // wielkość dysku w GB
    private String monitor; // nazwa preducenta
    private String printer; // nazwa drukarki

    public Computer(String motherboard, String processor, int cores, int ram) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.cores = cores;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "motherboard='" + motherboard + '\'' +
                ", processor='" + processor + '\'' +
                ", cores=" + cores +
                ", ram=" + ram +
                ", hd=" + hd +
                ", monitor='" + monitor + '\'' +
                ", printer='" + printer + '\'' +
                '}';
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public void setPrinter(String printer) {
        this.printer = printer;
    }
}
