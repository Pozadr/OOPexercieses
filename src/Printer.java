public class Printer {
    private String name;
    private String resolution;
    private boolean colorful;

    public Printer(String name, String resolution, boolean colorful){
        this.name = name;
        this.resolution = resolution;
        this.colorful = colorful;
    }

    public String getName() {
        return name;
    }

    public String getResolution() {
        return resolution;
    }
    // getter for boolean variable
    public boolean isColorful() {
        return colorful;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColorful(boolean colorful) {
        this.colorful = colorful;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "name='" + name + '\'' +
                ", resolution=" + resolution +
                ", colorful=" + colorful +
                '}';
    }
}

