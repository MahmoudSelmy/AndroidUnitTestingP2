package com.sheatouk.selmy.temperatureconverter;

import android.content.pm.PackageInfo;
import android.support.test.filters.MediumTest;
import android.test.ApplicationTestCase;

/**
 * Created by pc on 27/04/2017.
 */
@MediumTest
public class ApplicationTest extends ApplicationTestCase<MyMockApplication> {

    private MyMockApplication application;

    public ApplicationTest() {
        super(MyMockApplication.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        createApplication();
        application = getApplication();
    }

    public void testCorrectVersion() throws Exception {
        PackageInfo info = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        assertNotNull(info);
       // MoreAsserts.assertMatchesRegex("\\d\\.\\d", info.versionName);
    }

}