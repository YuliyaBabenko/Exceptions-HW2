import java.util.Arrays;

public class Task2 {

    public void resultCodeTask2(int[] intArray, int d, int index) {
        try {
            double catchedRes1 = (double) intArray[index] / d;
            if (d == 0) {
                throw new MyDivideByZeroException();
            }
            System.out.printf("catchedRes1 = " + catchedRes1);
        } catch (NullPointerException e) {
            System.out.println("У вас NullPointerException: " + e + "\n>>> " + Arrays.toString(e.getStackTrace()));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(new MyDivideByZeroException());
        }
    }
}
