package Model;

public class Dish {
    private String name;
    private int id;
    private int rank;
    private String dateEaten;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getDateEaten() {
        return dateEaten;
    }

    public void setDateEaten(String dateEaten) {
        this.dateEaten = dateEaten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
