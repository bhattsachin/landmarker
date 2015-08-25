package com.bhatt.peek;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.creativelabs.androidexperiments.typecompass.R;
import com.bhatt.peek.widget.BaseViewContainer;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by root on 8/23/15.
 */
public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.direction_view)
    BaseViewContainer baseViewContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
    }

    private void initViews() {
        ButterKnife.inject(this);

    }


}
