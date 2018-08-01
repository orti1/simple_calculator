package com.simplemobiletools.calculator.espresso;

import android.support.test.runner.AndroidJUnit4;
import com.simplemobiletools.calculator.espresso.screens.CalculatorScreen;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class InitialStateTests {

    @Test
    public void start_FormulaScreenShouldBeEmpty(){

        CalculatorScreen calculatorScreen = new CalculatorScreen();

        calculatorScreen
                .start()
                .verifyFormulaScreen("");
    }

    @Test
    public void start_ResultScreenShouldBeEmpty(){

        CalculatorScreen calculatorScreen = new CalculatorScreen();

        calculatorScreen
                .start()
                .verifyResultScreen("0");
    }

    @Test
    public void toStartApp_NumberButtonsShouldBeDisplayed(){
        CalculatorScreen calculatorScreen = new CalculatorScreen();

        calculatorScreen
                .start();

        for(int i=0; i<10; i++){
            calculatorScreen.verifyButtonIsDisplayed(String.valueOf(i));
        }
    }

    @Test
    public void toStartApp_OperationsButtonsShouldBeDisplayed(){
        CalculatorScreen calculatorScreen = new CalculatorScreen();

        calculatorScreen
                .start()
                .verifyButtonIsDisplayed("+")
                .verifyButtonIsDisplayed("-")
                .verifyButtonIsDisplayed("*")
                .verifyButtonIsDisplayed("÷")
                .verifyButtonIsDisplayed("%")
                .verifyButtonIsDisplayed("^")
                .verifyButtonIsDisplayed("√");
    }

    @Test
    public void toStartApp_ClearButtonShouldBeDisplayed(){
        CalculatorScreen calculatorScreen = new CalculatorScreen();

        calculatorScreen
                .start()
                .verifyButtonIsDisplayed("C");
    }

    @Test
    public void ToStartApp_DotButtonShouldBeDisplayed(){
        CalculatorScreen calculatorScreen = new CalculatorScreen();

        calculatorScreen
                .start()
                .verifyButtonIsDisplayed(".");
    }

    @Test
    public void ToStartApp_EqualButtonShouldBeDisplayed(){
        CalculatorScreen calculatorScreen = new CalculatorScreen();

        calculatorScreen
                .start()
                .verifyButtonIsDisplayed("=");
    }
}