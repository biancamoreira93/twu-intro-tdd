package intro;

/**
 * Created by bmoreira on 4/10/17.
 */
public class FizzBuzz {


    public boolean isFizz(int givenNumber) {
        if (givenNumber%3 == 0){
            return true;
        }
        return false;
    }

    public boolean isBuzz(int givenNumber) {
        if (givenNumber%5 == 0){
            return true;
        }
        return false;
    }

    public boolean isFizzBuzz(int givenNumber) {
        if (isBuzz(givenNumber) && isFizz(givenNumber)){
            return true;
        }
        return false;
    }
}
