package net.media.training.designpattern.state;

public class CalculatorContext {
    private CalculatorState currentState;

    public CalculatorContext() {
        currentState = new InputFirstOperandState();
    }

    public void setState(CalculatorState state) {
        this.currentState = state;
    }

    public void inputDigit(int digit) {
        currentState.inputDigit(digit);
    }

    public void inputOperator(String operator) {
        currentState.inputOperator(operator);
    }

    public void clear() {
        currentState.clear();
    }

    public void calculate() {
        currentState.calculate();
    }
}
