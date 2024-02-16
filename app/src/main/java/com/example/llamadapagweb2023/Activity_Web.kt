package com.example.llamadapagweb2023

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class Activity_Web : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        val miWebView : WebView = findViewById(R.id.webView)
        // Configurar el webView
        miWebView.webChromeClient = object : WebChromeClient(){
        }
        miWebView.webViewClient = object : WebViewClient(){
        }
        val settings: WebSettings = miWebView.settings
        settings.javaScriptEnabled = true
        //webView.loadUrl("https://www.facebook.com/Conalep-Zihuatanejo140021416141026/")
        miWebView.loadUrl("https://www.youtube.com/channel/UCLtqsUWMUrxowJ1k6bXZ4Gg")
        //miWebView.loadUrl("https://www.instagram.com/danniilo123/")

    }
}