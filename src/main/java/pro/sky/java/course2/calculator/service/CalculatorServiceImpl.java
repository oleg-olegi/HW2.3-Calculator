package pro.sky.java.course2.calculator.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int getSum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int getSubtraction(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int getMultiplication(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public float getDivision(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на ноль недопустимо");
        } else {
            return (float) num1 / num2;
        }
    }
}
