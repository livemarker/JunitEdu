package lesson2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator=new Calculator(10,20);
    private int firstNumber;
    private int secondNumber;

    @BeforeEach
    public void setUp(){
        firstNumber=100;
        secondNumber=200;
        calculator.setFirstNumber(firstNumber);
        calculator.setSecondNumber(secondNumber);
    }
    @Test
    public void shouldCreateCalculatorWithSetUPValues(){
        assertEquals(firstNumber,100);
        assertEquals(secondNumber,200);
    }

    @Test
    public void shouldCreateCalculatorInstance(){
        assertNotNull(calculator);
    }

    @Test
    void calculateSum() {
        assertEquals(300,calculator.calculateSum());
    }
}