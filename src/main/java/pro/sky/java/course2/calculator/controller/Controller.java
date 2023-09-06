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
}
