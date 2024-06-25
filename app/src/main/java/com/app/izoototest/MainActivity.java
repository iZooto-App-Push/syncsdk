package com.app.izoototest;

import android.annotation.SuppressLint;

import android.os.Build;
import android.os.Bundle;

import android.webkit.WebView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.izooto.iZooto;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pulse);

        CoordinatorLayout layout = findViewById(R.id.coordinator);
        iZooto.enablePulse(this, layout, true);
//        webView = findViewById(R.id.webview);
//        WebSettings webSettings = webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        webSettings.setDomStorageEnabled(true);
//        webSettings.setLoadsImagesAutomatically(true);
//        webSettings.setMediaPlaybackRequiresUserGesture(false);
//        webView.setWebChromeClient(new WebChromeClient());
//       // webView.loadUrl("https://www.asomiyapratidin.in/");
//        webView.setWebViewClient(new WebViewClient() {
//            @Override
//            public boolean shouldOverrideUrlLoading(@NonNull WebView view, @NonNull WebResourceRequest request) {
//                // Handle the URL loading here
//                String url = request.getUrl().toString();
//                Log.e("First","3"+url);
//
//                // Example: Handle specific URL scheme or domain
//                if (url.startsWith("http://") || url.startsWith("https://")) {
//                    Intent intent = new Intent(Intent.ACTION_VIEW, request.getUrl());
//                    Log.e("First","4");
//
//                    // If the URL cannot be opened, return early.
//                    try {
//                        MainActivity.this.startActivity(intent);
//                    } catch (ActivityNotFoundException exception) {
//                        Log.d("TAG", "Failed to load URL with scheme:" + request.getUrl().getScheme());
//                    }
//                    return true;
//                } else {
//                    // Handle other URLs (e.g., custom scheme)
//                    // You might want to open them in a different way, e.g., with an Intent
//                    return true;
//                }
//            }
//
//            @Override
//            public boolean shouldOverrideUrlLoading(@NonNull WebView view, @NonNull String url) {
//                // This method is deprecated, but still needed for older devices
//                return true;//shouldOverrideUrlLoading(view, new WebResourceRequest.Builder().url(Uri.parse(url)).build());
//            }
//        });
//
//        // Load the initial URL or HTML file
//         webView.loadUrl("https://devsdk.izooto.com/ad.html");
//    }
//    }
    }
}





