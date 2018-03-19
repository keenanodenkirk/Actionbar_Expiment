package com.example.keenanodenkirk14.actionbarexperiment;

import android.app.ActionBar;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String TAB_KEY_INDEX = "tab_key";
    private Fragment breakfastFragment;
    private Fragment lunchFragment;
    private Fragment dinnerFragment;
    private Fragment snackFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setDisplayShowTitleEnabled(false);

        ActionBar.Tab breakfastTab = actionBar.newTab().setText(getString(R.string.ui_tabname_breakfast));
        ActionBar.Tab lunchTab = actionBar.newTab().setText(getString(R.string.ui_tabname_lunch));
        ActionBar.Tab dinnerTab = actionBar.newTab().setText(getString(R.string.ui_tabname_dinner));
        ActionBar.Tab snackTab = actionBar.newTab().setText(getString(R.string.ui_tabname_snack));

        breakfastFragment = new BreakfastFragment();
        snackFragment = new SnackFragment();
        dinnerFragment = new DinnerFragment();
        lunchFragment = new LunchFragment();
    }
}
