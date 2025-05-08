public class NumberAnalyzer {
    public String analyzeNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {  // Vòng lặp
            if (number % 2 == 0) {     // Rẽ nhánh
                sum += number;
            }
        }
        if (sum > 100) {
            return "Big sum";
        } else {
            return "Small sum";
        }
    }
}
