package com.demo.fragments;

import com.ikik.otomasyon.R;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MySettings extends Fragment {


	Button facebook;
	Button twitter;
	Button youtube;
	Button google;
	@Override
	public View onCreateView(LayoutInflater inflater,
							 @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

		View v = inflater.inflate(R.layout.fragment_settings, container, false);

		facebook = (Button)v.findViewById(R.id.button3);
		facebook.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent facebookIntent = openFacebook(getActivity());
				startActivity(facebookIntent);

			}
		});


		twitter = (Button)v.findViewById(R.id.button4);
		twitter.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent twitterIntnet = openTwitter(getActivity());
				startActivity(twitterIntnet);

			}
		});

		youtube = (Button)v.findViewById(R.id.button5);
		youtube.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent youtubeIntent = openYoutube(getActivity());
				startActivity(youtubeIntent);

			}
		});

		google = (Button)v.findViewById(R.id.button6);
		google.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent googleIntent = openGoogle(getActivity());
				startActivity(googleIntent);

			}
		});
		return v;


	}


	public static Intent openFacebook(Context context) {

		try {
			context.getPackageManager()
					.getPackageInfo("com.facebook.katana", 0);
			return new Intent(Intent.ACTION_VIEW,
					Uri.parse("fb://page/415719472103671"));
		} catch (Exception e){

			return new Intent(Intent.ACTION_VIEW,
					Uri.parse("https://www.facebook.com/2k-Otomasyon-415719472103671"));
		}


	}


	public static Intent openTwitter(Context context) {

		try {
			context.getPackageManager()
					.getPackageInfo("com.twitter.android", 0);
			return new Intent(Intent.ACTION_VIEW,
					Uri.parse("twitter://user?user_id=833404631510286337"));
		} catch (Exception e){

			return new Intent(Intent.ACTION_VIEW,
					Uri.parse("https://twitter.com/2kotomasyon"));
		}


	}

	public static Intent openYoutube(Context context) {

		try {
			context.getPackageManager()
					.getPackageInfo("com.google.android.youtube", 0);
			return new Intent(Intent.ACTION_VIEW,
					Uri.parse("https://www.youtube.com/channel/UCY7xC__4aJrrc5rOFD-VuPQ"));
		} catch (Exception e){

			return new Intent(Intent.ACTION_VIEW,
					Uri.parse("https://www.youtube.com/channel/UCY7xC__4aJrrc5rOFD-VuPQ"));
		}


	}

	public static Intent openGoogle(Context context) {

		try {
			context.getPackageManager()
					.getPackageInfo("com.google.android.google", 0);
			return new Intent(Intent.ACTION_VIEW,
					Uri.parse("https://plus.google.com/u/1/107908793055209328395?hl"));
		} catch (Exception e){

			return new Intent(Intent.ACTION_VIEW,
					Uri.parse("https://plus.google.com/u/1/107908793055209328395?hl"));
		}


	}


}
