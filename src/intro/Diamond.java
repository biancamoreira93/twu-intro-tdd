package intro;


import com.sun.tools.javac.util.StringUtils;

/**
 * Created by bmoreira on 4/7/17.
 */
public class Diamond {

    public String printADiamond(int givenNumber, String givenName) {
        Triangle triangle = new Triangle();

        String diamondString = "";

        if (givenName == null){
            diamondString = triangle.printACenteredTriangle(givenNumber);
            diamondString += triangle.printACenteredTriangleInverse(givenNumber-1, true);
        }else{
            diamondString = triangle.printACenteredTriangle(givenNumber);
            diamondString += givenName + "\n";
            diamondString += triangle.printACenteredTriangleInverse(givenNumber, false);
        }

        return diamondString;
    }
}
