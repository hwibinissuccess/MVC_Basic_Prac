package hwibin.prac.calculator_oop;

import hwibin.prac.calculator_oop.calculate.PositiveNumber;

import java.util.Arrays;

public enum ArithmeticOperator {
    ADDITION("+"){
        @Override
        public int artithmeticCalculate(int operand1, int operand2) {
            return operand1+operand2;
        }
    }, SUBTRACTION("-"){
        @Override
        public int artithmeticCalculate(int operand1, int operand2) {
            return operand1-operand2;
        }
    }, MULTIPLICATION("*"){
        @Override
        public int artithmeticCalculate(int operand1, int operand2) {
            return operand1*operand2;
        }
    }, DIVISION("/"){
        @Override
        public int artithmeticCalculate(int operand1, int operand2) {
            return operand1/operand2;
        }
    };

    private final String operator;

    ArithmeticOperator(String operator) {
        this.operator = operator;
    }

    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {
        ArithmeticOperator arithmeticOperator = Arrays.stream(values())
                .filter(v -> v.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));

        return arithmeticOperator.artithmeticCalculate(operand1.toInt(), operand2.toInt());

    }

    public abstract int artithmeticCalculate(final int operand1, final int operand2);

}
