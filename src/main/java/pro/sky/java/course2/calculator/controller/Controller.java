package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/calculator")
    public String sayWelcomeToCalc() {
        return "Добро пожаловать в клькулятор";
    }

    @GetMapping("/calculator/plus")
    public String showSum(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @GetMapping("/calculator/minus")
    public String showSubtraction(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @GetMapping("/calculator/multiply")
    public String showMultiplication(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @GetMapping("/calculator/divide")
    public String showDivision(int num1, int num2) {
        return num1 + " / " + num2 + " = " + ((float)num1 / num2);
    }
}
