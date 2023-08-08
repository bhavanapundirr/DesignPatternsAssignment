package net.media.training.designpattern.state;

public class InputSecondOperandState implements CalculatorState{
    private StringBuilder secondOperand = new StringBuilder();

    @Override
    public void inputDigit(int digit) {
        secondOperand.append(digit);
    }

    @Override
    public void inputOperator(String operator) {
    }

    @Override
    public void clear() {
    }

    @Override
    public void calculate() {
    }
}
