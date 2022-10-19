package ie.atu.week5;

public class Calculator {
    private int total;

    public Calculator(){
        total = 0;
    }

    public int add(int one, int two){
        total = one + two;
        return total;
    }

    public int subtract(int one, int two)
    {
        total = one - two;
        return total;
    }

    public int multiply(int one, int two){
        total = one * two;
        return total;
    }

    public int divide(int one, int two){
        total = one / two;
        return total;
    }
}
