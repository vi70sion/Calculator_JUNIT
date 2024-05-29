
import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {


    @Test
    public void incrementIntA_WithOne (){
        //Setup
        int a = 5;
        Calculator calculator = new Calculator();
        //Assert
        assertEquals(6, calculator.increment(a));
    }

    @Test
    public void incrementIntA_WithOneNegativeNumber (){
        //Setup
        int a = -5;
        Calculator calculator = new Calculator();
        //Assert
        assertEquals(-4, calculator.increment(a));
    }

    @Test
    public void Sum2Plus3EqualTo5 (){
        //Setup
        int a = 2, b = 3;
        Calculator calculator = new Calculator();
        //Assert
        assertEquals( 5, calculator.Sum(a,b));
    }

    @Test
    public void Sum0Plus0EqualTo0 (){
        //Setup
        int a = 0, b = 0;
        Calculator calculator = new Calculator();
        //Assert
        assertEquals( 0, calculator.Sum(a,b));
    }

    @Test
    public void Subtract2Minus2EqualTo0 (){
        //Setup
        int a = 2, b = 2;
        Calculator calculator = new Calculator();
        //Assert
        assertEquals( 0, calculator.Subtract(a,b));
    }

    @Test
    public void Subtract0Minus5EqualTo5 (){
        //Setup
        int a = 0, b = -5;
        Calculator calculator = new Calculator();
        //Assert
        assertEquals( 5, calculator.Subtract(a,b));
    }

    @Test
    public void MutliplyMinus4Minus5EqualTo20 (){
        //Setup
        int a = -4, b = -5;
        Calculator calculator = new Calculator();
        //Assert
        assertEquals( 20, calculator.Mutliply(a,b));
    }

    @Test
    public void Mutliply4With0EqualTo0 (){
        //Setup
        int a = 4, b = 0;
        Calculator calculator = new Calculator();
        //Assert
        assertEquals( 0, calculator.Mutliply(a,b));
    }

    @Test
    public void Divide4With2EqualTo2 (){
        //Setup
        int a = 4, b = 2;
        Calculator calculator = new Calculator();
        //Assert
        assertEquals( 2, calculator.divide(a,b));
    }

    @Test
    public void Divide4With0EqualTo0 (){
        //Setup
        int a = 4, b = 0;
        Calculator calculator = new Calculator();
        //Assert
        assertEquals( 0, calculator.divide(a,b));
    }

}
