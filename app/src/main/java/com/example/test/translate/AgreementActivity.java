package com.example.test.translate;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

public class AgreementActivity extends AppCompatActivity {
    TextView textView;
    String content="<h1>Heading 1</h1>\n" +
            "        <h2>Heading 2</h2>\n" +
            "        <p>This is some html. Look, here\\'s an <u>underline</u>.</p>\n" +
            "        <p>Look, this is <em>emphasized.</em> And here\\'s some <b>bold</b>.</p>\n" +
            "        <p>Here are UL list items:\n" +
            "        <ul>\n" +
            "        <li>One</li>\n" +
            "        <li>Two</li>\n" +
            "        <li>Three</li>\n" +
            "        </ul>\n" +
            "        <p>Here are OL list items:\n" +
            "        <ol>\n" +
            "        <li>One</li>\n" +
            "        <li>Two</li>\n" +
            "        <li>Three</li>\n" +
            "        </ol>";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreement);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textView.setText(Html.fromHtml(content, Html.FROM_HTML_MODE_LEGACY));
        } else
            textView.setText(Html.fromHtml(content));

    }

}
