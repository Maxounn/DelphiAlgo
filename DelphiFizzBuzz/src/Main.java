//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        fizzBuzzGen(3, 5, 100);
    }

    public static void fizzBuzzGen(int firstNumber, int secondNumber, int iterations) {
        for (int i = 1; i <= iterations; i++) {
            boolean modByFirstNr = (i % firstNumber == 0);
            boolean modBySecondNr = (i % secondNumber == 0);

            if(modByFirstNr && modBySecondNr){
                System.out.println("FizzBuzz");
            }
            else if(modByFirstNr){
                System.out.println("Fizz");
            }
            else if(modBySecondNr){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
