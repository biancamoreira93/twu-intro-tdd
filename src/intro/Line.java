package intro;

/**
 * Created by bmoreira on 4/7/17.
 */
public class Line {
    //Remove duplicates - I commented with the purpose of showing the process of refactoring and
    //pointing out if it's ok
//    public String printAsterisk() {
//        return "*;
//    }

    public String printSpace() {
        return " ";
    }

    public String goToNewLine() {
        return "\n";
    }

    public String printAGivenNumberOfAsterisks(int givenNumber) {
        String asteriskString = "";

        for (int index=0; index < givenNumber; index++){
            asteriskString += "*";
        }

        return asteriskString;
    }
}
