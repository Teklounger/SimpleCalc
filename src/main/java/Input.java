import java.util.Scanner;

class Input{
    private Scanner s = new Scanner(System.in);

    String getInput(){
        String str = s.next();
        return str.replaceAll(" ","");
    }

    static float parseInput(String s){
        try{
            return Float.parseFloat(s);
        } catch (NumberFormatException e){
            System.err.println("Not a number!");
            throw new RuntimeException();
        }
    }
}