package com.simplemobiletools.calculator.espresso.screens;

import android.support.test.rule.ActivityTestRule;
import com.simplemobiletools.calculator.R;
import com.simplemobiletools.calculator.activities.SettingsActivity;
import com.simplemobiletools.calculator.espresso.helpers.ActionHelper;
import org.junit.Rule;

public class SettingsScreen {
    @Rule
    public ActivityTestRule<SettingsActivity> settingsActivityRule = new ActivityTestRule<>(SettingsActivity.class,true,false);

    public SettingsScreen start(){
        settingsActivityRule.launchActivity(null);
        return this;
    }

    public SettingsScreen switchOnAvoidShowingWhatsNew(){
        ActionHelper.setToggleOn(R.id.settings_avoid_whats_new);
        return this;
    }

    public SettingsScreen switchOnVibrateOnButtonPress(){
        ActionHelper.setToggleOn(R.id.settings_vibrate);
        return this;
    }

    public SettingsScreen switchOnPreventPhoneFromSleeping(){
        ActionHelper.setToggleOn(R.id.settings_prevent_phone_from_sleeping);
        return this;
    }

    public SettingsScreen verifyAvoidShowingWhatsNewIsOn(){
        ActionHelper.verifyToggleOn(R.id.settings_avoid_whats_new);
        return this;
    }

    public SettingsScreen verifyVibrateOnButtonPressIsOn(){
        ActionHelper.verifyToggleOn(R.id.settings_vibrate);
        return this;
    }

    public SettingsScreen verifyPreventPhoneFromSleepingIsOn(){
        ActionHelper.verifyToggleOn(R.id.settings_prevent_phone_from_sleeping);
        return this;
    }
}
