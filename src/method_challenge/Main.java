package method_challenge;

public class Main {
    public static void main(String[] args) {
        Score score = new Score();
        int rank = score.calculateHighScorePosition(300);
        score.displayHighScorePosition("Riki", rank);
    }
}
