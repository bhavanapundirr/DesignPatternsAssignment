package net.media.training.designpattern.state;

public interface CalculatorState {
    void inputDigit(int digit);
    void inputOperator(String operator);
    void clear();
    void calculate();
}
