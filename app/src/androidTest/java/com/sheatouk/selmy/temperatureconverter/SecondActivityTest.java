package com.sheatouk.selmy.temperatureconverter;

import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.MediumTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by pc on 27/04/2017.
 */
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.notNullValue;
@MediumTest
@RunWith(AndroidJUnit4.class)
public class SecondActivityTest {
    @Rule
    public ActivityTestRule<Main2Activity> rule  = new  ActivityTestRule<Main2Activity>(Main2Activity.class)
    {
        @Override
        protected Intent getActivityIntent() {
            InstrumentationRegistry.getTargetContext();
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.putExtra("MYKEY", "Hello");
            return intent;
        }
    };

    @Test
    public void ensureIntentDataIsDisplayed() throws Exception {
        Main2Activity activity = rule.getActivity();
        View viewById = activity.findViewById(R.id.txt);
        assertThat(viewById,notNullValue());
        assertThat(viewById, instanceOf(TextView.class));
        TextView textView = (TextView) viewById;
        assertThat(textView.getText().toString(),is("Hello"));
    }
}
