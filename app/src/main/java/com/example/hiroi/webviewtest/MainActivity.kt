package com.example.hiroi.webviewtest

import android.media.MediaPlayer
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.VideoView
import android.webkit.WebChromeClient.CustomViewCallback
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import com.example.hiroi.webviewtest.R.id.webView
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {

    private val myWebView: WebView by lazy {
        findViewById<WebView>(R.id.webView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        myVideoView.setVideoURI(Uri.parse("https://www.vidsplay.com/wp-content/uploads/2017/05/usflag.mp4"))
//
//        myVideoView.start()

        myWebView.settings.mediaPlaybackRequiresUserGesture = false; //API level 17より対応
        myWebView.settings.loadWithOverviewMode = true;
        myWebView.settings.useWideViewPort = false;
        myWebView.settings.allowContentAccess = true;
        myWebView.settings.domStorageEnabled = true;
        myWebView.settings.allowFileAccess = true;
        myWebView.settings.allowFileAccessFromFileURLs = true;
        myWebView.settings.allowUniversalAccessFromFileURLs = true;
        myWebView.settings.blockNetworkImage = false;
        myWebView.settings.blockNetworkLoads = false;
        myWebView.settings.domStorageEnabled = true;
        myWebView.settings.javaScriptEnabled = true;


//        val html = "<!DOCTYPE html><html><head><title>サンプル1</title><meta charset=‘UTF-8’></head><body><video src='https://www.vidsplay.com/wp-content/uploads/2017/05/usflag.mp4' autoplay playsinline preload='auto'/></body></html>";
//        val url = "https://dev.classmethod.jp/tool/http-live-streaming/"
//        val url = "http://10.0.2.2:8080/index4.html"


//        myWebView.
//        myWebView .webViewClient = WebViewClient()
        myWebView.loadUrl("http://10.0.38.237:3030/index.android.html")
//        myWebView .loadData(html, "text/html", null)

//        myWebView.loadDataWithBaseURL(url, null, "text/html", "utf-8", null)
//        myWebView.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
//        myWebView.settings.mediaPlaybackRequiresUserGesture = false; //API level 17より対応
//        myWebView.settings.loadWithOverviewMode = true;
//        myWebView.settings.useWideViewPort = true
//        val html = "<html>\n" +
//                "  <head>\n" +
//                "    <title>HLS livestreaming</title>\n" +
//                "    <link href=\"https://vjs.zencdn.net/6.6.3/video-js.css\" rel=\"stylesheet\">\n" +
//                "  </head>\n" +
//                "  <body>\n" +
//                "  TESTダヨ！！" +
//                "    <script src=\"https://cdn.jsdelivr.net/hls.js/latest/hls.min.js\"></script>\n" +
//                "    <video muted=\"muted\" id=\"video\"></video>\n" +
//                "    <script>\n" +
//                "      if(Hls.isSupported()) {\n" +
//                "        var video = document.getElementById('video');\n" +
//                "        var hls = new Hls();\n" +
//                "        hls.loadSource('https://media.ads-platform.jp/video/40263d893ae54f24a540c8bc460f5953/video/40263d893ae54f24a540c8bc460f5953.m3u8');\n" +
//                "        hls.attachMedia(video);\n" +
//                "        hls.on(Hls.Events.MANIFEST_PARSED,function() {\n" +
//                "          video.play();\n" +
//                "      });\n" +
//                "     }\n" +
//                "    </script>\n" +
//                "  </body>\n" +
//                "</html>\n";

//        myWebView.webChromeClient = object: WebChromeClient(){
//            override fun onShowCustomView(view: View, callback: CustomViewCallback) {
//                super.onShowCustomView(view, callback)
//            }
//
//            override fun onHideCustomView() {
//                super.onHideCustomView()
//            }
//        }
//
//        myWebView.webViewClient = object: WebViewClient(){
//
//        }

//                class WebChromeClient() = (object : WebChromeClient() {
//
//            fun onShowCustomView(view: View, callback: CustomViewCallback) {
//                super.onShowCustomView(view, callback)
//            }
//
//            override fun onHideCustomView() {
//                super.onHideCustomView()
//            }
//        })
//        val html = "<!DOCTYPE html>\n" +
//                "<html>\n" +
//                "\n" +
//                "<head>\n" +
//                "    <title>サンプル1</title>\n" +
//                "    <meta charset=‘UTF-8’>\n" +
//                "</head>\n" +
//                "\n" +
//                "<body>\n" +
//                "    <div id='image_test' style='position: absolute; z-index: 10; display: block' height='500px'>\n" +
//                "        <image width='300' src='https://s3-ap-northeast-1.amazonaws.com/kaku-staging-transcoder/movs/video-dest/naruto-ia-01/pre_load_image/naruto-ia-01-thumbs-00001.png'></image>\n" +
//                "    </div>\n" +
//                "    <div height='500px'>\n" +
//                "        <video onloadeddata='statusLoaded()' onplay='statusPlay()' ontimeupdate='hide()' oncanplaythrough='startVideo()'\n" +
//                "            poster='https://s3-ap-northeast-1.amazonaws.com/kaku-staging-transcoder/movs/video-dest/naruto-ia-01/pre_load_image/naruto-ia-01-thumbs-00001.png'\n" +
//                "            id='video_test' width='300' src='https://s3-ap-northeast-1.amazonaws.com/kaku-staging-transcoder/movs/video-dest/naruto-ia-01/video/naruto-ia-01.m3u8'\n" +
//                "            muted autoplay playsinline preload='auto'></video>\n" +
//                "    </div>\n" +
//                "    <div style='position: absolute; z-index: 10; display: none' >\n" +
//                "        //https://s3-ap-northeast-1.amazonaws.com/kaku-staging-transcoder/movs/video-src/daigo2-ia-01.mp4\n" +
//                "        //https://s3-ap-northeast-1.amazonaws.com/kaku-staging-transcoder/movs/video-dest/daigo-ia-02/video/daigo-ia-02.m3u8\n" +
//                "        TESTダヨ<input type='button' value='controlsを消す' onClick='deleteControls()'></input><br>\n" +
//                "        TESTダヨ2<input type='button' value='再生開始' onClick='startVideo()'></input><br>\n" +
//                "        TESTダヨ3<input type='button' value='画像を隠す' onClick='hide()'></input><br>\n" +
//                "        TESTダヨ4<input type='button' value='COUNT UP' onClick='countup()'></input><br>\n" +
//                "        <input id='counter' value='1'></input><br>\n" +
//                "        LOADED <input id='status_loaded' value=''></input><br>\n" +
//                "        PLAYED <input id='status_play' value=''></input><br>\n" +
//                "        PLAYING <input id='status_playing' value=''></input><br>\n" +
//                "        HIDE <input id='status_hide' value=''></input><br>\n" +
//                "    </div>\n" +
//                "    <script>\n" +
//                "        function deleteControls() {\n" +
//                "            var vid = document.getElementById('video_test');\n" +
//                "            vid.controls = !vid.controls\n" +
//                "        }\n" +
//                "        function startVideo() {\n" +
//                "            var vid = document.getElementById('video_test');\n" +
//                "            vid.play();\n" +
//                "        }\n" +
//                "        function hide() {\n" +
//                "            var vid = document.getElementById('video_test');\n" +
//                "            if (vid.currentTime > 0.0001) {\n" +
//                "                var img = document.getElementById('image_test');\n" +
//                "                statusHide();\n" +
//                "                img.style.display = 'none';\n" +
//                "            }\n" +
//                "        }\n" +
//                "        function countup() {\n" +
//                "            var counter = document.getElementById('counter');\n" +
//                "            counter.value = counter.value + 1;\n" +
//                "        }\n" +
//                "        function statusLoaded() {\n" +
//                "            var a = document.getElementById('status_loaded');\n" +
//                "            var now = new Date();\n" +
//                "            a.value = now.getMilliseconds()\n" +
//                "        }\n" +
//                "        function statusPlay() {\n" +
//                "            var a = document.getElementById('status_play');\n" +
//                "            var now = new Date();\n" +
//                "            a.value = now.getMilliseconds()\n" +
//                "        }\n" +
//                "        function statusPlaying() {\n" +
//                "            var a = document.getElementById('status_playing');\n" +
//                "            var now = new Date();\n" +
//                "            a.value = now.getMilliseconds()\n" +
//                "        }\n" +
//                "        function statusHide() {\n" +
//                "            var a = document.getElementById('status_hide');\n" +
//                "            var now = new Date();\n" +
//                "            a.value = now.getMilliseconds()\n" +
//                "        }\n" +
//                "    </script>\n" +
//                "</body>\n" +
//                "\n" +
//                "</html>";
////        val html = "<html><head><body><script>function a(){var a=document.getElementById('text_input_test'); a.value='TESTDAYO';}</script><input type='text' id='text_input_test' value='input'/><input type='button' value='CLICK ME' onClick='a()'/></body></head></html>"
//        myWebView.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }


}
