package ie.atu.week5;

public class Counter {
    private int countValue;

    public Counter(){
        countValue = 0;
    }
    public int Increment() {
        countValue++;
        return countValue;
    }
}
