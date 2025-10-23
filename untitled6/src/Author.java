import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public double calculateRoyalties() {
        double total = 0.0;
        for (Title t : titles) {
            total += t.calculateRoyalty();
        }
            return Math.round(total * 100.0) / 100.0; //returnerer værdien efter at have rykket kommaet to gange til højre, afrunder og flytter det så to gange tilbage, så det ender på to decimaler
    }

    public String getName() {
        return name;
    }
}
