package com.bhatt.peek.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.creativelabs.androidexperiments.typecompass.R;

import butterknife.InjectView;

/**
 * Created by root on 8/23/15.
 */
public class BaseViewContainer extends FrameLayout {



    @InjectView(R.id.direction_detail) TextView directionDetailText;

    public BaseViewContainer(Context context) {
        super(context);
    }

    public BaseViewContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

}
