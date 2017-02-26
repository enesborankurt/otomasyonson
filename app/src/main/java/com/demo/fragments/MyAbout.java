package com.demo.fragments;

import com.ikik.otomasyon.R;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.VideoView;

public class MyAbout extends Fragment {
	private WebView webview;
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		
		View v = inflater.inflate(R.layout.fragment_about, container, false);
		webview = (WebView) v.findViewById(R.id.IletWebView);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl("http://2kotomasyon.com/iletisim/");

		return v;

	}
}
