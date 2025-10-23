public class AudioBook extends Title {
    private int durationInMinutes;
    private int copies;

    public AudioBook(String title, String literatureType, int durationInMinutes, int copies) {
        super(title, literatureType);
        this.copies = copies;
        this.durationInMinutes = durationInMinutes;
    }

    @Override //her nedarves den abstrakte klasse, altså idéen bliver gjort til virkelighed så at sige
    public double calculatePoints() {
        return(durationInMinutes * 0.5) * convertLiteratureType() * copies;
    }
}
