package jdbc;

public class Baldai {

    private int id;
    private String name;
    private double kaina;
    private int svoris;

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    public int getSvoris() {
        return svoris;
    }

    public void setSvoris(int svoris) {
        this.svoris = svoris;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
