package hwibin.prac.webprogram_calculator.calculator.tobe;


import hwibin.prac.webprogram_calculator.calculator.domain.PositiveNumber;

public interface ArithmeticOperator {
    boolean supports(String operator);
    int calculate(final PositiveNumber operand1, final PositiveNumber operand2);
}