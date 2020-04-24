import java.util.Arrays;

public class Computer {

    // obowiązkowe pola
    private String motherboard; // płyta główna
    private Processor processor; // "i5", "i7", "intel", "amd"
    private Ram[] ramSlots = new Ram[4]; // ilość ramu
    private HardDrive[] hardDriveSlots = new HardDrive[3];

    // dodatkowe pola
    private Monitor monitor; // nazwa preducenta
    private Printer printer; // nazwa drukarki

    public Computer(String motherboard, Processor processor, Ram ramSlot1,
                    Ram ramSlot2, Ram ramSlot3, Ram ramSlot4, HardDrive hdSlot1,
                    HardDrive hdSlot2, HardDrive hdSlot3) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.ramSlots[0] = ramSlot1;
        this.ramSlots[1] = ramSlot2;
        this.ramSlots[2] = ramSlot3;
        this.ramSlots[3] = ramSlot4;
        this.hardDriveSlots[0] = hdSlot1;
        this.hardDriveSlots[1] = hdSlot2;
        this.hardDriveSlots[2] = hdSlot3;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    // change free slot or worse than input one
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

    // change free slot or worse than input one
    public void setHardDriveSlot(HardDrive newHardDrive){
        int dataWrittenFlag = 0;
        for(HardDrive hd : hardDriveSlots) {
            if (hd.getName() == "FreeSlot") {
                hd.setName(newHardDrive.getName());
                hd.setSize(newHardDrive.getSize());
                hd.setReadSpeed(newHardDrive.getReadSpeed());
                hd.setWriteSpeed(newHardDrive.getWriteSpeed());
                dataWrittenFlag = 1;
                break;
            }
        }
        if(dataWrittenFlag == 0){
            Arrays.sort(hardDriveSlots);
            for(HardDrive hd : hardDriveSlots){
                if (hd.getSize() < newHardDrive.getSize()
                        || (hd.getSize() == newHardDrive.getSize() && hd.getReadSpeed()
                        < newHardDrive.getReadSpeed()
                        || (hd.getSize() == newHardDrive.getSize()
                        && hd.getReadSpeed()
                        == newHardDrive.getReadSpeed() && hd.getWriteSpeed()
                        < newHardDrive.getWriteSpeed()))) {
                    hd.setName(newHardDrive.getName());
                    hd.setSize(newHardDrive.getSize());
                    hd.setReadSpeed(newHardDrive.getReadSpeed());
                    hd.setWriteSpeed(newHardDrive.getWriteSpeed());
                    dataWrittenFlag = 1;
                    break;
                }
            }
        }
        if(dataWrittenFlag == 0){
            System.out.println("All slots are full or with better properties.");
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "motherboard='" + motherboard + '\'' +
                ", processor=" + processor +
                ", ramSlots=" + Arrays.toString(ramSlots) +
                ", hardDriveSlots=" + Arrays.toString(hardDriveSlots) +
                ", monitor=" + monitor +
                ", printer=" + printer +
                '}';
    }
}
