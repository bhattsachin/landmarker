package com.bhatt.peek;

import android.app.Application;
import android.util.Log;

import com.google.creativelabs.androidexperiments.typecompass.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by root on 8/23/15.
 */
public class PeekApplication extends Application{

        private static final String TAG = PeekApplication.class.getSimpleName();

        @Override
        public void onCreate() {
            super.onCreate();

            Log.d(TAG, "main entry");

            CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                            .setDefaultFontPath("fonts/texgyreheros-bold.otf")
                            .setFontAttrId(R.attr.fontPath)
                            .build()
            );
        }
    }