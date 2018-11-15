package com.example.test.translate;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.webkit.WebView;
import android.widget.TextView;

public class AgreementActivity extends AppCompatActivity {
    String content="<h1>User agreement for Yandex\n" +
            "    Services</h1>\n" +
            "        <p><i>This document is a translation of User Agreement for\n</p>\n" +
            "           <a href=\"https://yandex.ru/legal/ruls/?lang=ru.\" > https://yandex.ru/legal/ruls/?lang=ru.</a>\n"+
            "         <h1>1.General Provisions\n </h1>\n"+
            "        <p><p>1.1 Yandex LLC(hereinafter - \"Yandex\") offers\n" +
            "    Internet users(hereinafter - the \"User\") the\n" +
            "    opportnity of this User Agreement </p>.</p>\n";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreement);
        TextView textView = (TextView) findViewById(R.id.agreement);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textView.setText(Html.fromHtml(content, Html.FROM_HTML_MODE_LEGACY));
        } else
            textView.setText(Html.fromHtml(content));

    }

}
