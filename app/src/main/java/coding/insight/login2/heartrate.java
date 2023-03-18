package coding.insight.login2;//package coding.insight.login2;
//import static java.lang.Thread.sleep;
//
//import android.os.AsyncTask;
//import android.os.Bundle;
//import android.widget.ImageView;
//import android.widget.TextView;
//import androidx.appcompat.app.AppCompatActivity;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//
//import java.io.IOException;
//
//public class heartrate extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_heartrate);
//        Content dw =new Content();
//        dw.execute();
//        Content d2 =new Content();
//        d2.execute();
//    }
//    private class Content extends AsyncTask<Void, Void, Void> {
//        TextView txt = (TextView) findViewById(R.id.text);
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
//
//        }
//
//        @Override
//        protected Void doInBackground(Void... voids) {
//            org.jsoup.nodes.Document document =null;
//            for(int i=0;i<10;i++){
//            try{
//                sleep(10000);
//            document=Jsoup.connect("https://catjam.yoonicode.com/widget?id=hGppkADZwDYstAuSD42GExnYvLG2").get();
//        }
//            catch (Exception e){
//                e.printStackTrace();
//            }
//            org.jsoup.select.Elements elements =document.getElementsByTag("p");
//            txt.setText(document.text());}
//            return null;
//        }
//
//        @Override
//        protected void onPostExecute(Void aVoid) {
//            super.onPostExecute(aVoid);
//        }
//    }
//}

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class heartrate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heartrate);

        // Find the WebView by its unique ID
        WebView webView = findViewById(R.id.web);

        // loading http://www.google.com url in the WebView.
        webView.loadUrl("https://catjam.yoonicode.com/widget/?id=hGppkADZwDYstAuSD42GExnYvLG2");
        String url="https://catjam.yoonicode.com/widget/?id=hGppkADZwDYstAuSD42GExnYvLG2";
        // this will enable the javascript.
        webView.getSettings().setJavaScriptEnabled(true);
        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.

        webView.setWebViewClient(new WebViewClient(){
        @Override
        public void onPageFinished(final WebView view, String url) {
            super.onPageFinished(view, url);
            view.loadUrl("javascript:(function() { " +
                    "document.getElementById('img-container').style.display='none';})()");
        }});
    }


    
}