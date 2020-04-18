public class HardDrive implements Comparable<HardDrive> {

    private String name;
    private int size;
    private int readSpeed;
    private int writeSpeed;

    public HardDrive(String name, int size, int readSpeed, int writeSpeed){
        this.name = name;
        this.size = size;
        this.readSpeed = readSpeed;
        this.writeSpeed = writeSpeed;

    }

    public int getReadSpeed() {
        return readSpeed;
    }

    public int getWriteSpeed() {
        return writeSpeed;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setReadSpeed(int readSpeed) {
        this.readSpeed = readSpeed;
    }

    public void setWriteSpeed(int writeSpeed) {
        this.writeSpeed = writeSpeed;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", readSpeed=" + readSpeed +
                ", writeSpeed=" + writeSpeed +
                '}';
    }

    @Override
    public int compareTo(HardDrive compareHardDrive) {
        if(this.getSize() - compareHardDrive.getSize() == 0) {
            if (this.getReadSpeed() - compareHardDrive.getReadSpeed() == 0) {
                return this.getWriteSpeed() - compareHardDrive.getWriteSpeed();
            } else {
                return this.getReadSpeed() - compareHardDrive.getReadSpeed();

            }
        }
        else{
            return this.getSize() - compareHardDrive.getSize();
        }
    }
}
