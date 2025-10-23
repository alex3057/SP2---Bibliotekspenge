public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        Author alexander = new Author("Alexander Ree");

        alexander.addTitle(new PrintedBook("Dødens pølse", "SKØN", 957, 666));
        alexander.addTitle(new PrintedBook("Lær at fatte Java", "FAG", 3, 1337));
        alexander.addTitle(new AudioBook("Forskellige lyde af tis der rammer vandoverflader", "LYRIK", 1440, 43200));

        double payout = alexander.calculateRoyalties();
        System.out.println(alexander.getName() + ": " + String.format("%.2f", payout) + "kr"); //tallet formatteres som tekst for at sikre, at Java ikke alligevel får udskrevet mere end to decimaler grundet den måde data bliver læst i RAM på, hvilket kan være matematisk ukorrekt for et menneske, men er mere korrekt i binær forståelse.
    }
}