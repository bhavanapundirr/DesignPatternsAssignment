package net.media.training.designpattern.state;

public class InputFirstOperandState implements CalculatorState{
    private StringBuilder firstOperand = new StringBuilder();

    @Override
    public void inputDigit(int digit) {
        firstOperand.append(digit);
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
