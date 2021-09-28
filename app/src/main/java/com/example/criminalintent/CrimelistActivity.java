package com.example.criminalintent;

import androidx.fragment.app.Fragment;

public class CrimelistActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimelistFragment();
    }
}
