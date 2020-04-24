public class Printer {
    private String name;
    private int resolution;
    private boolean colorful;

    public Printer(String name,int resolution, boolean colorful){
        this.name = name;
        this.resolution = resolution;
        this.colorful = colorful;
    }

    public String getName() {
        return name;
    }

    public int getResolution() {
        return resolution;
    }
    // getter for boolean variable
    public boolean isColorful() {
        return colorful;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColorful(boolean colorful) {
        this.colorful = colorful;
    }
}

