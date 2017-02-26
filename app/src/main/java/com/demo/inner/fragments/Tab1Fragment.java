package com.demo.inner.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.ikik.otomasyon.R;

public class Tab1Fragment extends Fragment {
	ViewPager viewPager;
	ViewPagerAdapter adapter;
	private WebView webview;
	private String[] images = {

			"http://2kotomasyon.com/wp-content/uploads/2017/02/2-300x169.png",
			"http://2kotomasyon.com/wp-content/uploads/2017/02/22-300x169.png",
			"http://2kotomasyon.com/wp-content/uploads/2017/02/1-1-300x169.png",
			"http://2kotomasyon.com/wp-content/uploads/2017/02/RES4-300x169.jpg"
	};
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

		View v = inflater.inflate(R.layout.tab1fragment, container, false);
		//webview = (WebView) v.findViewById(R.id.IsitmaWebView);
		//webview.getSettings().setJavaScriptEnabled(true);
		//webview.loadUrl("http://2kotomasyon.com/2017/02/19/isinma-sistemleri/");

		viewPager = (ViewPager)v.findViewById(R.id.viewPager);
		adapter = new ViewPagerAdapter(getActivity(),images);
		viewPager.setAdapter(adapter);

		return v;

	}
}
