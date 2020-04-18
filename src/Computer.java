import java.util.Arrays;

public class Computer {

    // obowiązkowe pola
    private String motherboard; // płyta główna
    private Processor processor; // "i5", "i7", "intel", "amd"
    private Ram[] ramSlots = new Ram[4]; // ilość ramu

    // dodatkowe pola
    private int hd; // wielkość dysku w GB
    private String monitor; // nazwa preducenta
    private String printer; // nazwa drukarki

    public Computer(String motherboard, Processor processor, Ram ramSlot1,
                    Ram ramSlot2, Ram ramSlot3, Ram ramSlot4) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.ramSlots[0] = ramSlot1;
        this.ramSlots[1] = ramSlot2;
        this.ramSlots[2] = ramSlot3;
        this.ramSlots[3] = ramSlot4;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "motherboard='" + motherboard + '\'' +
                ", processor=" + processor +
                ", ramSlots=" + Arrays.toString(ramSlots) +
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

    public void setRamSlot(Ram ram){
        int dataWrittenFlag = 0;
        for(Ram slot : ramSlots) {
            if (slot.getName() == "FreeSlot") {
                slot.setName(ram.getName());
                slot.setSize(ram.getSize());
                slot.setClockSpeed(ram.getClockSpeed());
                dataWrittenFlag = 1;
                break;
            }
        }
        if(dataWrittenFlag == 0){
            Arrays.sort(ramSlots);
            for (Ram slot : ramSlots) {
                if (slot.getSize() < ram.getSize()
                        || (slot.getSize() == ram.getSize() && slot.getClockSpeed()
                        < ram.getClockSpeed())) {
                    slot.setName(ram.getName());
                    slot.setSize(ram.getSize());
                    slot.setClockSpeed(ram.getClockSpeed());
                    dataWrittenFlag = 1;
                    break;
                }
            }
        }
        if(dataWrittenFlag == 0){
            System.out.println("All slots are full or with better properties.");
        }

    }
}
