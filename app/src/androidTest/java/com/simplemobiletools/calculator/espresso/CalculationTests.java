package com.simplemobiletools.calculator.espresso;

import android.support.test.runner.AndroidJUnit4;

import com.simplemobiletools.calculator.espresso.screens.CalculatorScreen;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
public class CalculationTests {

    @Test
    public void addDigits() {
        CalculatorScreen calculatorScreen = new CalculatorScreen();

        calculatorScreen
                .start()
                .clearResultScreen()
                .pressNumber("1")
                .pressNumber("2")
                .pressNumber("3")
                .pressNumber("4")
                .pressNumber("5")
                .pressNumber("6")
                .pressNumber("7")
                .pressNumber("8")
                .pressNumber("9")
                .pressNumber("0")
                .verifyResultScreen("1,234,567,890");
    }

    @Test
    public void additionTest() {
        CalculatorScreen calculatorScreen = new CalculatorScreen();

        calculatorScreen
                .start()
                .clearResultScreen()
                .pressOperation("-")
                .pressNumber("2")
                .pressOperation("+")
                .pressNumber("2")
                .pressOperation(".")
                .pressNumber("5")
                .pressEqual()
                .verifyFormulaScreen("-2+2.5")
                .verifyResultScreen("0.5");
    }

    @Test
    public void subtractionTest() {
        CalculatorScreen calculatorScreen = new CalculatorScreen();

        calculatorScreen
                .start()
                .clearResultScreen()
                .pressNumber("2")
                .pressOperation("-")
                .pressNumber("0")
                .pressOperation(".")
                .pressNumber("5")
                .pressEqual()
                .verifyFormulaScreen("2-0.5")
                .verifyResultScreen("1.5");
    }

    @Test
    public void multiplyTest() {
        CalculatorScreen calculatorScreen = new CalculatorScreen();

        calculatorScreen
                .start()
                .clearResultScreen()
                .pressNumber("2")
                .pressOperation("*")
                .pressNumber("3")
                .pressEqual()
                .verifyFormulaScreen("2*3")
                .verifyResultScreen("6");
    }


    @Test
    public void divisionTest() {
        CalculatorScreen calculatorScreen = new CalculatorScreen();

        calculatorScreen
                .start()
                .clearResultScreen()
                .pressNumber("8")
                .pressOperation("÷")
                .pressNumber("2")
                .pressEqual()
                .verifyFormulaScreen("8/2")
                .verifyResultScreen("4");
    }

    @Test
    public void divisionByZeroTest() {
        CalculatorScreen calculatorScreen = new CalculatorScreen();

        calculatorScreen
                .start()
                .clearResultScreen()
                .pressNumber("8")
                .pressOperation("÷")
                .pressNumber("0")
                .pressEqual()
                .verifyFormulaScreen("8/0")
                .verifyResultScreen("0");
    }

    @Test
    public void percentTest() {
        CalculatorScreen calculatorScreen = new CalculatorScreen();

        calculatorScreen
                .start()
                .clearResultScreen()
                .pressNumber("1")
                .pressNumber("0")
                .pressOperation("%")
                .pressNumber("5")
                .pressNumber("0")
                .pressEqual()
                .verifyFormulaScreen("10%50")
                .verifyResultScreen("5");
    }

    @Test
    public void powerTest() {
        CalculatorScreen calculatorScreen = new CalculatorScreen();

        calculatorScreen
                .start()
                .clearResultScreen()
                .pressNumber("2")
                .pressOperation("^")
                .pressNumber("4")
                .pressEqual()
                .verifyFormulaScreen("2^4")
                .verifyResultScreen("16");
    }

    @Test
    public void rootTest() {
        CalculatorScreen calculatorScreen = new CalculatorScreen();

        calculatorScreen
                .start()
                .clearResultScreen()
                .pressNumber("9")
                .pressOperation("√")
                .verifyFormulaScreen("√9")
                .verifyResultScreen("3");
    }

    @Test
    public void clearTest() {
        CalculatorScreen calculatorScreen = new CalculatorScreen();

        calculatorScreen
                .start()
                .clearResultScreen()
                .pressNumber("9")
                .clearResultScreen()
                .verifyFormulaScreen("")
                .verifyResultScreen("0");
    }

}
