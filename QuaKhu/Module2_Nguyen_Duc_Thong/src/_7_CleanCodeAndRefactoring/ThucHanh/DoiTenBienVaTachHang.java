package _7_CleanCodeAndRefactoring.ThucHanh;

public class DoiTenBienVaTachHang {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char DIVISION = '/';
    public static final char MUTIPLICATION = '*';

    public static int calculate(int firstOperator, int secondOperator, char Operator) {
        switch (Operator) {
            case ADDITION:
                return firstOperator + secondOperator;
            case SUBTRACTION:
                return firstOperator - secondOperator;
            case MUTIPLICATION:
                return firstOperator * secondOperator;
            case DIVISION:
                if (secondOperator != 0)
                    return firstOperator / secondOperator;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
