package net.media.training.designpattern.state;

public class OperatorSelectedState implements CalculatorState{
    private String operator;

    @Override
    public void inputDigit(int digit) {
    }

    @Override
    public void inputOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public void clear() {
        operator = null;
    }

    @Override
    public void calculate() {
    }
}
