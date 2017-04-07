package intro;

/**
 * Created by bmoreira on 4/7/17.
 */
public class Triangle {

    public String shouldPrintRightTriangle() {
        int givenNumber = 3;
        String triangleString = "";
        for (int firstIndex=0; firstIndex < givenNumber; firstIndex++){
            for (int secondIndex=0; secondIndex <= firstIndex; secondIndex++){
                triangleString += "*";
            }
            triangleString += "\n";
        }
        return triangleString;
    }

    public String shouldPrintACenteredTriangle(int givenNumber) {
        String triangleString = "";

        int asterisksTotalNumbers = givenNumber+(givenNumber-1);

        int currentSpacesTotal = asterisksTotalNumbers-1;
        int edgesSpaces;
        int currentTotalAsteriks;

        for (int firstIndex=1; firstIndex <= givenNumber; firstIndex++){

            edgesSpaces = currentSpacesTotal/2;
            currentTotalAsteriks = asterisksTotalNumbers-currentSpacesTotal;

            for (int secondIndex=1; secondIndex <= edgesSpaces; secondIndex++){
                triangleString += " ";
            }

            for (int thirdIndex=1; thirdIndex <= currentTotalAsteriks; thirdIndex++){
                triangleString += "*";
            }

            for (int fourthIndex=1; fourthIndex <= edgesSpaces; fourthIndex++){
                triangleString += " ";
            }
            triangleString += "\n";

            currentSpacesTotal =  currentSpacesTotal-2;
        }

        return triangleString;
    }

    public String shouldPrintACenteredTriangleInverse(int givenNumber, boolean putAdditionalSpace) {
        String triangleString = "";

        int asterisksTotalNumbers = givenNumber+(givenNumber-1);

        int currentSpacesTotal = 0;
        int edgesSpaces;
        int currentTotalAsteriks;

        for (int firstIndex=givenNumber; firstIndex >= 1; firstIndex--){

            if (putAdditionalSpace == true){
                triangleString += " ";
            }


            edgesSpaces = currentSpacesTotal/2;
            currentTotalAsteriks = asterisksTotalNumbers-currentSpacesTotal;

            for (int secondIndex=1; secondIndex <= edgesSpaces; secondIndex++){
                triangleString += " ";
            }

            for (int thirdIndex=1; thirdIndex <= currentTotalAsteriks; thirdIndex++){
                triangleString += "*";
            }

            for (int fourthIndex=1; fourthIndex <= edgesSpaces; fourthIndex++){
                triangleString += " ";
            }
            triangleString += "\n";

            currentSpacesTotal =  currentSpacesTotal+2;
        }

        return triangleString;
    }
}
