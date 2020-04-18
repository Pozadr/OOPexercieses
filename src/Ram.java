public class Ram implements Comparable<Ram> {

    private String name;
    private int size;
    private int clockSpeed;

    public Ram(String name, int size, int clockSpeed){
        this.name = name;
        this.size = size;
        this.clockSpeed = clockSpeed;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", clockSpeed=" + clockSpeed +
                '}';
    }

    @Override
    public int compareTo(Ram compareRam) {
        // ascending order
        // if size is equal than compare with clock speed
        if(this.getSize() - compareRam.getSize() == 0){
            return this.getClockSpeed() - compareRam.getClockSpeed();
        }
        else{
            return this.getSize() - compareRam.getSize();
        }
    }
}
