import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberAnalyzerTest {

    @Test
    public void testSmallSum() {
        NumberAnalyzer analyzer = new NumberAnalyzer();
        int[] numbers = {1, 3, 5};  // Không có số chẵn → sum = 0
        assertEquals("Small sum", analyzer.analyzeNumbers(numbers));
    }

    @Test
    public void testBigSum() {
        NumberAnalyzer analyzer = new NumberAnalyzer();
        int[] numbers = {50, 60};  // 50 + 60 = 110 > 100
        assertEquals("Big sum", analyzer.analyzeNumbers(numbers));
    }

    // Test case mở rộng cho statement coverage
    @Test
    public void testSumExactly100() {
        NumberAnalyzer analyzer = new NumberAnalyzer();
        int[] numbers = {20, 30, 50};  // sum = 100
        assertEquals("Small sum", analyzer.analyzeNumbers(numbers));
    }

    @Test
    public void testMixedEvenOdd() {
        NumberAnalyzer analyzer = new NumberAnalyzer();
        int[] numbers = {2, 3, 4};  // sum = 6
        assertEquals("Small sum", analyzer.analyzeNumbers(numbers));
    }

    // Các kiểm thử khác có thể được thêm vào như cần thiết
}
