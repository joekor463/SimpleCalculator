public class SimpleCalculator {
    double firstNumber;
    double secondNumber;

    public double getfirstNumber(){
        return firstNumber;
    }

    public double getsecondNumber(){
        return secondNumber;
    }

    public double setFirstNumber(double number){
        firstNumber = number;
        return firstNumber;
    }

    public double setSecondNumber(double number){
        secondNumber = number;
        return secondNumber;
    }

    public double getAdditionResult(){
        double rezult = firstNumber + secondNumber;
        return rezult;
    }

    public double getSubtractionResult(){
        double rezult = firstNumber - secondNumber;
        return rezult;
    }

    public double getMultiplicationResult(){
        double rezult = firstNumber * secondNumber;
        return rezult;
    }

    public double getDivisionResult(){
        double rezult = firstNumber / secondNumber;
        if (secondNumber == 0) return 0;
        return rezult;
    }

}

