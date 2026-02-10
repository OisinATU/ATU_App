package atu.ie.s2lab2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {
    /* I need to send 2 numbers and select the type of calculation I want to make.
    * I must receive the result of the operation*/
    /*Here I'm going to receive the https requests and send the data to the calculator class*/

    private Calculator calculator;

    public RequestController(Calculator calculator) {
        this.calculator = calculator;
    }
    @GetMapping("/calculate/")
    public double calculate(
            @RequestParam double firstNumber,
            @RequestParam double secondNumber,
            @RequestParam String operator) {
        if (operator.equals("+")) return calculator.add(firstNumber, secondNumber);
    throw new IllegalArgumentException("Invalid operator");
    }

}
