public abstract class Title {
    String title;
    String literatureType;
    static final double RATE = 0.067574;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    public abstract double calculatePoints();

    public double calculateRoyalty() {
        return calculatePoints() * RATE;
    }

    protected double convertLiteratureType() {
        return switch(literatureType.toUpperCase()) {
            case "BI", "TE" -> 3.0;
            case "LYRIK" -> 6.0;
            case "SKØN" -> 1.7;
            case "FAG" -> 1.0;
            default -> throw new IllegalArgumentException("Unknown literatureType: " + literatureType);
        };
    }
}
