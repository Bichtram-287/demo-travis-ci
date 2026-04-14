import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.multiply(3, 5));
    }

    @Test
    public void testDivision() {
        Calculator calc = new Calculator();
        assertEquals(2.5, calc.divide(5, 2));
    }

    @Test
    public void testDivisionByZero() {
        Calculator calc = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
        assertEquals("Lỗi nghiêm trọng: Không thể chia cho 0!", exception.getMessage());
    }


    @Test
    public void testFactorial() {
        Calculator calc = new Calculator();


        assertEquals(120, calc.factorial(5), "Kiểm thử: 5! phải bằng 120");


        assertEquals(1, calc.factorial(0), "Kiểm thử: 0! phải bằng 1");


        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.factorial(-3));
        assertEquals("Lỗi: Không có giai thừa cho số âm!", exception.getMessage());
    }
}