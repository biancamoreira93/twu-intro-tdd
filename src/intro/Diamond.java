package intro;


import com.sun.tools.javac.util.StringUtils;

/**
 * Created by bmoreira on 4/7/17.
 */
public class Diamond {
    //Refactoring to remove duplicates
//    public String shouldPrintADiamond(int givenNumber) {
//        Triangle triangle = new Triangle();
//
//        String diamondString = "";
//        diamondString = triangle.shouldPrintACenteredTriangle(givenNumber);
//        diamondString += triangle.shouldPrintACenteredTriangleInverse(givenNumber-1, true);
//
//        return diamondString;
//    }

    public String shouldPrintADiamond(int givenNumber, String givenName) {
        Triangle triangle = new Triangle();

        String diamondString = "";

        if (givenName.isEmpty() || givenName==null){
            diamondString = triangle.shouldPrintACenteredTriangle(givenNumber);
            diamondString += triangle.shouldPrintACenteredTriangleInverse(givenNumber-1, true);
        }else{
            diamondString = triangle.shouldPrintACenteredTriangle(givenNumber);
            diamondString += givenName + "\n";
            diamondString += triangle.shouldPrintACenteredTriangleInverse(givenNumber, false);
        }

        return diamondString;
    }
}
