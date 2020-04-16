public class Computer {

    // obowiązkowe pola
    private String motherboard; // płyta główna
    private Processor processor; // "i5", "i7", "intel", "amd"
    private int ram; // ilość ramu

    // dodatkowe pola
    private int hd; // wielkość dysku w GB
    private String monitor; // nazwa preducenta
    private String printer; // nazwa drukarki

    public Computer(String motherboard, Processor processor, int ram) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "motherboard='" + motherboard + '\'' +
                ", processor='" + processor.toString() + '\'' +
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
