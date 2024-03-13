
package com.example.asignacion5_romeramparo.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.widget.Button
import com.example.asignacion5_romeramparo.MomentosFragment
import com.example.asignacion5_romeramparo.R

class momento2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_momento2)


        val webview: WebView = findViewById(R.id.web_view_momento1)
        val video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/_R-mfs83BwE\" frameborder=\"0\" allowfullscreen></iframe>\n"
        webview.loadData(video, "text/html", "utf-8")
        webview.settings.javaScriptEnabled = true
        webview.webChromeClient = WebChromeClient()

        val btn: Button = findViewById(R.id.btn_regresar_momento2)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, MomentosFragment::class.java)
            startActivity(intent)
        }
    }
}