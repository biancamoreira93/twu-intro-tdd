package intro;

/**
 * Created by bmoreira on 4/7/17.
 */
public class Exercise {
    public boolean exerciseOnePrint(){
        String exercisePrinting = "";
        Line line = new Line();
        exercisePrinting = line.shouldPrintAGivenNumberOfAsterisks(1);

        if (!exercisePrinting.isEmpty() || exercisePrinting!= null){
            System.out.println("Exercício 1:\n "+ exercisePrinting + "\n----------");
            return true;
        }

        return false;

    }
}
