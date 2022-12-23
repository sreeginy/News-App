package com.example.newsapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.newsapi.Models.NewsHeadlines;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class DetailsActivity extends AppCompatActivity {

    NewsHeadlines headlines,url;
    TextView txt_title,txt_author, txt_time, txt_details, txt_content;
    ImageView img_news;
    Button btnRead;

    Toolbar toolbar;
    WebView webView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

//        toolbar = findViewById(R.id.toolbar);
//        webView = findViewById(R.id.webview);
//
//        setSupportActionBar(toolbar);
//
//        //Intent intent= getIntent();
//
//        //String url1 = String.valueOf(url);
//        url = (NewsHeadlines) getIntent().getSerializableExtra("url");
//
//        webView.setWebViewClient(new WebViewClient());
//        webView.loadUrl(String.valueOf(url));



        txt_title =findViewById(R.id.text_detail_title);
        txt_author = findViewById(R.id.text_detail_author);
        txt_time = findViewById(R.id.text_detail_time);
        txt_details = findViewById(R.id.text_detail_detail);
        txt_content = findViewById(R.id.text_detail_content);
        img_news = findViewById(R.id.img_detail_news);
        //btnRead = findViewById(R.id.btnRead);

        headlines = (NewsHeadlines) getIntent().getSerializableExtra("data");
//        url = (NewsHeadlines) getIntent().getSerializableExtra("url");

        if (headlines.getTitle() != null){
            txt_title.setText(headlines.getTitle());
        }
        if (headlines.getAuthor() != null){
            txt_author.setText(headlines.getAuthor());
        }

        txt_time.setText(headlines.getPublishedAt());
        txt_details.setText(headlines.getDescription());
        txt_content.setText(headlines.getContent());
        Picasso.get().load(headlines.getUrlToImage()).placeholder(R.drawable.ic_launcher_background).into(img_news);


    }

    }

