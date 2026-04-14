public class Calculator {

    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Lỗi nghiêm trọng: Không thể chia cho 0!");
        }
        return (double) a / b;
    }


    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Lỗi: Không có giai thừa cho số âm!");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}