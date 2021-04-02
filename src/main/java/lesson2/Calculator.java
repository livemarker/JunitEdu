package lesson2;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    public Calculator(){}
    public Calculator(int firstNumber,int secondNumber){
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
    public int calculateSum() {
        return firstNumber+secondNumber;
    }
}
