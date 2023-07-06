public class Task3 {

    public void printDivide(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            throw new MyDivideByZeroException();
        }
    }

    public void changeArray(int[] abc, int index, int value) {
        try {
            abc[index] = value;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b);
    }

}
