public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */
    public static String getScore(int pointsPlayer1, int pointsPlayer2) {
        String score = "";

        if (isTie(pointsPlayer1, pointsPlayer2)) {
            return  getTieScores(pointsPlayer1);
        }
        else if (isAdvantajeOrWin(pointsPlayer1, pointsPlayer2))
        {
            return  getAdvantajeOrWinScores(pointsPlayer1, pointsPlayer2);
        }
        else
        {
            return  getRegularScores(pointsPlayer1, pointsPlayer2);

        }

    }

    private static String getRegularScores(int pointsPlayer1, int pointsPlayer2) {
        String score="";
        int tempScore;

        String[] regularScores = {"Love","Fifteen","Thirty","Forty"};

        for (int i = 1; i<3; i++)
        {
            if (i==1) tempScore = pointsPlayer1;
            else { score +="-"; tempScore = pointsPlayer2;}
            score += regularScores[tempScore];
        }
        return score;
    }

    private static String getAdvantajeOrWinScores(int pointsPlayer1, int pointsPlayer2) {
        String score;
        int minusResult = pointsPlayer1 - pointsPlayer2;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private static boolean isAdvantajeOrWin(int pointsPlayer1, int pointsPlayer2) {
        return pointsPlayer1 >= 4 || pointsPlayer2 >= 4;
    }

    private static String getTieScores(int pointsPlayers) {

        String[] tieScores ={"Love-All","Fifteen-All","Thirty-All","Forty-All"};


        if (pointsPlayers>=0 && pointsPlayers<=3) return tieScores[pointsPlayers];


        return  "Deuce";
    }

    private static boolean isTie(int pointsPlayer1, int pointsPlayer2) {
        return pointsPlayer1 == pointsPlayer2;
    }
}