package intro;

/**
 * Created by bmoreira on 4/10/17.
 */
public class FizzBuzz {

    public String printFizzBuzz(int givenNumber) {

        String returnFizzBuzz = "";

        for (int i=1; i <= givenNumber; i++){

            if (isFizzBuzz(i)){
                returnFizzBuzz += "FizzBuzz\n";
            }else if (isFizz(i)){
                returnFizzBuzz += "Fizz\n";
            }else if (isBuzz(i)){
                returnFizzBuzz += "Buzz\n";
            }else{
                returnFizzBuzz += i + "\n";
            }
        }
        return returnFizzBuzz;
    }

    private boolean isFizz(int givenNumber) {
        if (givenNumber%3 == 0){
            return true;
        }
        return false;
    }

    private boolean isBuzz(int givenNumber) {
        if (givenNumber%5 == 0){
            return true;
        }
        return false;
    }

    private boolean isFizzBuzz(int givenNumber) {
        if (isBuzz(givenNumber) && isFizz(givenNumber)){
            return true;
        }
        return false;
    }

}
