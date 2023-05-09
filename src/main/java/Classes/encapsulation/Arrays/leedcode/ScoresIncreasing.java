package Classes.encapsulation.Arrays.leedcode;

public class ScoresIncreasing {



    public boolean scoresIncreasing(int[] scores) {
        int sum = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (sum <= scores[i]) sum = scores[i];
            else return false;
        }
        return true;

    }
// -4 , ************ 49 , 50

}
