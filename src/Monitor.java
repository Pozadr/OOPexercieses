public class Monitor {
    private String name;
    private int screenDiagonal;
    private String technology;

    public Monitor(String name, int screenDiagonal, String technology){
        this.name = name;
        this.screenDiagonal = screenDiagonal;
        this.technology = technology;
    }

    public int getScreenDiagonal() {
        return screenDiagonal;
    }

    public String getName() {
        return name;
    }

    public String getTechnology() {
        return technology;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScreenDiagonal(int screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "name='" + name + '\'' +
                ", screenDiagonal=" + screenDiagonal +
                ", technology='" + technology + '\'' +
                '}';
    }
}
