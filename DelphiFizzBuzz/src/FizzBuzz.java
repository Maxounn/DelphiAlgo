import java.util.Map;

public class FizzBuzz {
    public static void fizzBuzzGen(int iterations, Map<Integer, String> conditions) {
        for (int i = 1; i <= iterations; i++) {
            StringBuilder consoleOutput = new StringBuilder();

        for (Map.Entry<Integer, String> entry : conditions.entrySet()) {
            if(i % entry.getKey() == 0) {
                consoleOutput.append(entry.getValue());
            }
        }
            System.out.println(consoleOutput.isEmpty() ? i : consoleOutput.toString());
        }

    }
}
