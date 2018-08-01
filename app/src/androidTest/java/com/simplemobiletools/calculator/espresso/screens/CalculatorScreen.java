package com.simplemobiletools.calculator.espresso.screens;


import android.support.test.rule.ActivityTestRule;
import android.widget.Button;

import com.simplemobiletools.calculator.activities.MainActivity;
import com.simplemobiletools.calculator.R;
import com.simplemobiletools.calculator.espresso.helpers.ActionHelper;
import org.junit.Rule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.CoreMatchers.allOf;

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

    public CalculatorScreen pressNumber(int number){
        ActionHelper.press(String.valueOf(number));
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
        onView(allOf(isAssignableFrom(Button.class), withText(text)))
                .check(matches(isDisplayed()));

        return this;
    }

    public CalculatorScreen verifyFormulaScreen(String text){
        onView(withId(R.id.formula))
                .check(matches(withText(text)));

        return this;
    }

    public CalculatorScreen verifyResultScreen(String text){
        onView(withId(R.id.result))
                .check(matches(withText(text)));

        return this;
    }
}
