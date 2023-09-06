package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String sayWelcomeToCalc() {
        return "Добро пожаловать в клькулятор";
    }

    @GetMapping("/plus")
    public String showSum(int num1, int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.getSum(num1, num2);
    }

    @GetMapping("/minus")
    public String showSubtraction(int num1, int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.getSubtraction(num1, num2);
    }

    @GetMapping("/multiply")
    public String showMultiplication(int num1, int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.getMultiplication(num1, num2);
    }

    @GetMapping("/divide")
    public String showDivision(int num1, int num2) {
        return num1 + " / " + num2 + " = " + calculatorService.getDivision(num1, num2);
    }
}
