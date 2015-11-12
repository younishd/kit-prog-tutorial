public class MagicProgram {
    public static void main(String args[]) {
        int firstNumber = 1;
        int firstResult = fortyTwo(firstNumber);
        System.out.println("firstNumber = " + firstNumber);
        System.out.println("firstResult = " + firstResult);

        Number secondNumber  = new Number(1);
        Number secondResult = fortyTwo(secondNumber);
        System.out.println("secondNumber = " + secondNumber.getValue());
        System.out.println("secondResult = " + secondResult.getValue());
    }

    public static int fortyTwo(int n) {
        n = 42;
        return n;
    }

    public static Number fortyTwo(Number n) {
        n.setValue(42);
        return n;
    }
}
