/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi.calculator;

import org.springframework.stereotype.Service;

/**
 *
 * @author sebastianbolewicz
 */
@Service
public class CalculatorService {
    
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double calculate(double x, double y, String operation) {
        switch(operation) {
            case "+":
                return add(x, y);
            case "-":
                return subtract(x, y);
            case "*":
                return multiply(x, y);
        }
        throw new IllegalArgumentException("Nieznana operacja: " + operation);
    }
    
}
