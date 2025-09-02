import java.util.LinkedHashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Map<Integer, String> conditions = new LinkedHashMap<>();
        conditions.put(3, "Fizz");
        conditions.put(7, "Buss");

        FizzBuzz.fizzBuzzGen(100, conditions);
    }


}
