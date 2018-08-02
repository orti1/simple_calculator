package com.simplemobiletools.calculator.espresso.screens;

import android.support.test.rule.ActivityTestRule;
import com.simplemobiletools.calculator.activities.MainActivity;
import com.simplemobiletools.calculator.R;
import com.simplemobiletools.calculator.espresso.helpers.ActionHelper;
import org.junit.Rule;

public class CalculatorScreen {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityRule = new ActivityTestRule<>(MainActivity.class,true,false);

    public CalculatorScreen start(){
        mainActivityRule.launchActivity(null);
        return this;
    }

    public CalculatorScreen clearResultScreen(){
        ActionHelper.longPress("C");
        return this;
    }

    public CalculatorScreen pressNumber(String number){
        ActionHelper.press(number);
        return this;
    }

    public CalculatorScreen pressOperation(String operator){
        ActionHelper.press(operator);
        return this;
    }

    public CalculatorScreen pressEqual(){
        ActionHelper.press(R.id.btn_equals);
        return this;
    }

    public CalculatorScreen verifyButtonIsDisplayed(String text){
        ActionHelper.verifyElementPresent(text);
        return this;
    }

    public CalculatorScreen verifyFormulaScreen(String text){
        ActionHelper.checkFormula(text);
        return this;
    }

    public CalculatorScreen verifyResultScreen(String text){
        ActionHelper.checkResult(text);
        return this;
    }
}
