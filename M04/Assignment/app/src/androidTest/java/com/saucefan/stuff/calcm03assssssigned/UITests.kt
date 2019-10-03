package com.saucefan.stuff.calcm03assssssigned

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.FixMethodOrder
import org.junit.Ignore
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters

class UITests {



}
@RunWith(AndroidJUnit4::class)
@LargeTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class NumPadTests {

    @Rule
    @JvmField
    var activityScenarioRule =ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun number9Test() {
        val correctDisplay ="9"


        onView(withId(R.id.btn_nine))
            .perform(click())

        onView(withId(R.id.tv_display))
            .check(matches(withText(correctDisplay)))
    }
}