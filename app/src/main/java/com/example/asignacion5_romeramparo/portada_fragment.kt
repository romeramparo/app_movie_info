package com.example.asignacion5_romeramparo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView

class portada_fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_portada_fragment, container, false)

        val webview: WebView = view.findViewById(R.id.webview)
        val video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/u3V5KDHRQvk?si=vCjoHNkH8UDurbMr\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"

        webview.loadData(video, "text/html", "utf-8")
        webview.settings.javaScriptEnabled = true
        webview.webChromeClient = WebChromeClient()

        return view
    }
}
