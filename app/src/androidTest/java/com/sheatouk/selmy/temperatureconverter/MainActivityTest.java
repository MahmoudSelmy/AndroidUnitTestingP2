package com.sheatouk.selmy.temperatureconverter;

import android.support.test.filters.MediumTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.notNullValue;

/**
 * Created by pc on 27/04/2017.
 */
@MediumTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<Main2Activity> rule  = new  ActivityTestRule<>(Main2Activity.class);

    @Test
    public void ensureListViewIsPresent() throws Exception {
        Main2Activity activity = rule.getActivity();
        View viewById = activity.findViewById(R.id.list);
        assertThat(viewById,notNullValue());
        assertThat(viewById,instanceOf(ListView.class));
        ListView listView = (ListView) viewById;
        ListAdapter adapter = listView.getAdapter();
        assertThat(adapter, instanceOf(ArrayAdapter.class));
        assertThat(adapter.getCount(), greaterThan(7));

    }
}
