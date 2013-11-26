package com.nebula.smoothie.adquotes;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.actionbarsherlock.app.SherlockFragmentActivity;

public class QuoteActivity extends SherlockFragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quote);
		FragmentManager manager = getSupportFragmentManager();
		FragmentTransaction ft = manager.beginTransaction();
		ft.replace(R.id.flQuote, new QuoteFragment());
		// or ft.add(R.id.your_placeholder, new FooFragment());
		ft.commit();
	}

}
