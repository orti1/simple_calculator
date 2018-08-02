package com.simplemobiletools.calculator.espresso;

import android.support.test.runner.AndroidJUnit4;

import com.simplemobiletools.calculator.espresso.screens.SettingsScreen;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class SettingsTests {

    @Test
    public void toggleAvoidWhatsNew() {
        SettingsScreen settingsScreen = new SettingsScreen();

        settingsScreen
                .start()
                .switchOnAvoidShowingWhatsNew()
                .verifyAvoidShowingWhatsNewIsOn();
    }

    @Test
    public void toggleVibrateOnButtonPress() {
        SettingsScreen settingsScreen = new SettingsScreen();

        settingsScreen
                .start()
                .switchOnVibrateOnButtonPress()
                .verifyVibrateOnButtonPressIsOn();
    }

    @Test
    public void togglePreventPhoneFromSleeping() {
        SettingsScreen settingsScreen = new SettingsScreen();

        settingsScreen
                .start()
                .switchOnPreventPhoneFromSleeping()
                .verifyPreventPhoneFromSleepingIsOn();
    }
}
