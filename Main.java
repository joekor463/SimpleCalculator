public class Main {
    public static void main(String arg[]) {
        SimpleCalculator calculator = new SimpleCalculator ();
        calculator.setFirstNumber ( 4.0 );
        calculator.setSecondNumber ( 3 );
        System.out.println ( "add= " + calculator.getAdditionResult () );
        System.out.println ( "subtract= " + calculator.getSubtractionResult () );
        calculator.setFirstNumber ( 5.5 );
        calculator.setSecondNumber ( 3 );
        System.out.println ( "multiply= " + calculator.getMultiplicationResult () );
        System.out.println ( "divide= " + calculator.getDivisionResult () );
    }
}
