package com.simplemobiletools.calculator.espresso.helpers;

import com.simplemobiletools.calculator.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.longClick;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class ActionHelper {

    /** Asserts if result screen contains desired string. */
    public static void checkResult(String desired) {
        onView(withId(R.id.result))
                .check(matches(withText(desired)));
    }

    /** Asserts if formula screen contains desired string. */
    public static void checkFormula(String desired) {
        onView(withId(R.id.formula))
                .check(matches(withText(desired)));
    }

    /** Press button
     *  @param button {@link String} with the button locator
     */
    public static void press(String button) {
        onView(withText(button))
                .perform(click());
    }

    /** Press digit
     *  @param id {@link int} with the button locator
     */
    public static void press(int id) {
        onView(withId(id))
                .perform(click());
    }

    /** Long press button
     *  @param button {@link String} with the button locator
     */
    public static void longPress(String button) {
        onView(withText(button))
                .perform(longClick());
    }

}
