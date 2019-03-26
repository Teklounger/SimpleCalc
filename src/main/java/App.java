public class App{

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        Input in = new Input();

        String input;
        float x,y,result = 0;
        boolean check = true;

        System.out.println("ANUJAN's SIMPLE CALCULATOR");

        String[] operators = {"+", "-", "*", "/"};
        while(check){
            System.out.print("> ");
            input = in.getInput();
            for (String operator : operators) {
                if (input.contains(operator)) {
                    int indexOperator = input.indexOf(operator);
                    x = Input.parseInput(input.substring(0, indexOperator));
                    y = Input.parseInput(input.substring(indexOperator + 1));

                    if ("+".equals(operator)) {
                        result = calculator.addition(x, y);
                    } else if ("-".equals(operator)) {
                        result = calculator.subtraction(x, y);
                    } else if ("*".equals(operator)) {
                        result = calculator.multiplication(x, y);
                    } else if ("/".equals(operator)) {
                        result = calculator.division(x, y);
                    } else {
                        System.out.println("ERROR");
                    }
                    System.out.println(result);
                }
                if (input.equals("exit") || input.equals("0")) {
                    System.out.println("EXIT SUCCESSFULL");
                    check = false;
                    break;
                }
            }
        }
    }
}