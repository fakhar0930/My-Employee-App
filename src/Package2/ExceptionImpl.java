package Package2;

public class ExceptionImpl {

    public static double divide(int numerator, int denominator) throws ArrayIndexException {
        if (denominator == 0) {
            throw new ArrayIndexException("Cannot divide by zero!");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        int i=10;
        int j=0;

        try {
            divide(i,j);
        } catch (ArrayIndexException e){
            System.out.println("Error: " +e.getMessage());
        }
    }
}
