package com.sheatouk.selmy.temperatureconverter;

import android.content.Context;
import android.support.test.filters.SmallTest;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.io.FileOutputStream;

import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by pc on 27/04/2017.
 */

public class WriteConfigurationUtilTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();
    @Mock
    Context context;

    @Mock
    FileOutputStream fileOutputStream;


    @Test
    @SmallTest
    public void writeShouldWriteTwiceToFileSystem() {
        try {
            when(context.openFileOutput(anyString(), anyInt())).thenReturn(fileOutputStream);
            WriteConfigurationUtil.writeConfiguration(context);
            verify(context, times(1)).openFileOutput(anyString(), anyInt());
            verify(fileOutputStream, atLeast(2)).write(any(byte[].class));

        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}