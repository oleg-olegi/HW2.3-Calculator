package pro.sky.java.course2.calculator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String showSum(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.getSum(num1, num2);
    }

    @GetMapping("/minus")
    public String showSubtraction(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.getSubtraction(num1, num2);
    }

    @GetMapping("/multiply")
    public String showMultiplication(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.getMultiplication(num1, num2);
    }

    @GetMapping("/divide")
    public ResponseEntity<String> showDivision(int num1, int num2) {
        float result = calculatorService.getDivision(num1, num2);
        return ResponseEntity.ok(num1 + " / " + num2 + " = " + result);
    }
}

