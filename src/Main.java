public class Main {

    /**

     * metodo para devolver la puntuacion de tenis

     */

    public static String getScore(int pointsPlayer1, int pointsPlayer2) {



        if (isTie(pointsPlayer1, pointsPlayer2)) {

            return getTieScores(pointsPlayer1);

        }


        else if (isAdvantage(pointsPlayer1, pointsPlayer2))

        {
            int minusResult = pointsPlayer1 - pointsPlayer2;

            if (minusResult==1) return "Advantage player1";

            else return "Advantage player2";

        }

        else if (isWin(pointsPlayer1, pointsPlayer2))

        {
            return getWinScores(pointsPlayer1, pointsPlayer2);

        }

        else

        {
            return getRegularScores(pointsPlayer1, pointsPlayer2);

        }
    }

    private static String getWinScores(int pointsPlayer1, int pointsPlayer2) {
        String score;

        int minusResult = pointsPlayer1 - pointsPlayer2;

        if (minusResult>=2) score = "Win for player1";

        else score ="Win for player2";

        return score;
    }

    private static boolean isWin(int pointsPlayer1, int pointsPlayer2) {


        return pointsPlayer1 >= 4 || pointsPlayer2 >= 4;


    }




    private static String getAdvantageScores(int pointsPlayer1, int pointsPlayer2) {

        int minusResult = pointsPlayer1 - pointsPlayer2;

        if (minusResult==1) return "Advantage player1";

        else return "Advantage player2";

    }
    private static boolean isAdvantage(int pointsPlayer1, int pointsPlayer2) {



        return (pointsPlayer1 >= 4 || pointsPlayer2 >= 4) && (pointsPlayer1 - pointsPlayer2 == 1 || pointsPlayer1 - pointsPlayer2 == -1);


    }



    private static String getRegularScores(int pointsPlayer1, int pointsPlayer2) {

        String[] regularScores = {"Love","Fifteen","Thirty","Forty"};

        return regularScores [pointsPlayer1] + '-' + regularScores[pointsPlayer2];
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
