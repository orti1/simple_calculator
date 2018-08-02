package com.simplemobiletools.calculator.espresso.helpers;

import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.view.View;
import android.widget.Button;
import android.widget.Checkable;
import com.simplemobiletools.calculator.R;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.longClick;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.isA;

public class ActionHelper {

    /** Asserts if result screen contains desired string.
     *  @param desired text to be matched
     */
    public static void checkResult(String desired) {
        onView(withId(R.id.result))
                .check(matches(withText(desired)));
    }

    /** Asserts if formula screen contains desired string.
     *  @param desired text to be matched
     */
    public static void checkFormula(String desired) {
        onView(withId(R.id.formula))
                .check(matches(withText(desired)));
    }

    /** Verify if element is present.
     *  @param desired button text to match element
     */
    public static void verifyElementPresent(String desired) {
        onView(allOf(isAssignableFrom(Button.class), withText(desired)))
                .check(matches(isDisplayed()));
    }

    /** Verify if element is present.
     *  @param id element locator
     */
    public static void verifyElementDisplayed(int id) {
        onView(withId(id))
                .check(matches(isDisplayed()));
    }

    /** Verify if element include specific text.
     *  @param id element locator
     *  @param desired text to be matched
     */
    public static void verifyText(int id, String desired) {
        onView(withId(id))
                .check(matches(withText(desired)));
    }

    /** Verify if toggle button is on.
     *  @param id element locator
     */
    public static void verifyToggleOn(int id) {
        onView(withId(id))
                .check(matches(isChecked()));
    }

    /** Press button
     *  @param button button text to match element
     */
    public static void press(String button) {
        onView(withText(button))
                .perform(click());
    }

    /** Press digit
     *  @param id element locator
     */
    public static void press(int id) {
        onView(withId(id))
                .perform(click());
    }

    /** Long press button
     *  @param button button text to match element
     */
    public static void longPress(String button) {
        onView(withText(button))
                .perform(longClick());
    }

    /** Turn toggle button on
     *  @param checked desired checked state
     */
    public static ViewAction setChecked(final boolean checked) {
        return new ViewAction() {
            @Override
            public BaseMatcher<View> getConstraints() {
                return new BaseMatcher<View>() {
                    @Override
                    public boolean matches(Object item) {
                        return isA(Checkable.class).matches(item);
                    }

                    @Override
                    public void describeMismatch(Object item, Description mismatchDescription) {}

                    @Override
                    public void describeTo(Description description) {}
                };
            }

            @Override
            public String getDescription() {
                return null;
            }

            @Override
            public void perform(UiController uiController, View view) {
                Checkable checkableView = (Checkable) view;
                checkableView.setChecked(checked);
            }
        };
    }

    /** Set toggle to checked state
     *  @param id element locator
     */
    public static void setToggleOn(int id) {
        onView(withId(id))
                .perform(scrollTo(), setChecked(true));
    }

}
