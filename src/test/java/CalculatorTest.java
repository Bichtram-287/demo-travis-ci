import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3), "Kiểm thử phép cộng thất bại!");
        assertEquals(-1, calc.add(-4, 3), "Kiểm thử phép cộng số âm thất bại!");
    }

    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.subtract(5, 3), "Kiểm thử phép trừ thất bại!");
    }

    @Test
    public void testMultiplication() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.multiply(3, 5), "Kiểm thử phép nhân thất bại!");
    }

    @Test
    public void testDivision() {
        Calculator calc = new Calculator();
        assertEquals(2.5, calc.divide(5, 2), "Kiểm thử phép chia thất bại!");
    }

    @Test
    public void testDivisionByZero() {
        Calculator calc = new Calculator();
        // Kiểm tra xem hệ thống có bắt được lỗi chia cho 0 không
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(5, 0);
        });
        assertEquals("Lỗi nghiêm trọng: Không thể chia cho 0!", exception.getMessage());
    }
}