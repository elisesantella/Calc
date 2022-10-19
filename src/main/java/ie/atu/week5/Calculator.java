package ie.atu.week5;

public class Calculator {
    private int total;

    public Calculator(){
        total = 0;
    }

    public int add(int one, int two){
        //Scanner inputs = new Scanner(System.in);
        //System.out.println(" Enter value 1: \n");
        //int valueOne = inputs.nextInt();
        //System.out.println(" Enter value 2: \n");
        // int valueTwo = inputs.nextInt();

        //int total = valueOne + valueTwo;
        // System.out.println("The total of the two values together is: " + total);
        total = one + two;
        return total;
    }
}
