package com.demo.inner.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.ikik.otomasyon.R;

public class Tab5Fragment extends Fragment {
    private WebView webview;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.tab5fragment, container, false);
        webview = (WebView) v.findViewById(R.id.PanoWebView);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("http://2kotomasyon.com/2017/02/19/pano-sistemleri/");

        return v;
    }
}