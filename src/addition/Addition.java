package addition;

public class Addition {
    private int Number1;
    private int Number2;

    public int getNumber1() {
        return Number1;
    }

    public void setNumber1(int number1) {
        Number1 = number1;
    }

    public int getNumber2() {
        return Number2;
    }

    public void setNumber2(int number2) {
        Number2 = number2;
    }
    public int Addition(){
        return Number1 + Number2;
    }
}
