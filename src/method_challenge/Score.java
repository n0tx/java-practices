package method_challenge;

public class Score {

    public void displayHighScorePosition(String playerName, int rank) {
        System.out.println("Si " + playerName + " mendapatkan rangking: " + rank);
    }

    public int calculateHighScorePosition(int score) {
        int result = 0;
        if (score >= 1000) {
            result = 1;
        } else if (score >= 500 && score < 1000) {
            result = 2;
        } else if (score >= 100 && score < 500) {
            result = 3;
        } else {
            result = 4;
        }
        return result;
    }

}
