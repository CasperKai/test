package com.casper.test.kid07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.casper.test.R;

public class menuKid07 extends AppCompatActivity {


    private Button btn01, btn02, btn03, btn04, btn05, btn06, btn07, btn08, btn09, btn10,btn11,btn12,btn13;
    private Button _btnBack;
    public static menuKid07 instance = null;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_kid07);

        instance = this;

        _btnBack = (Button) findViewById(R.id.btnMenuKid07Previous);
        btn01 = (Button) findViewById(R.id.kid0701彩虹);
        btn02 = (Button) findViewById(R.id.kid0702DontWorry);
        btn03 = (Button) findViewById(R.id.kid0703耶穌是我的好朋友);
        btn04 = (Button) findViewById(R.id.kid0704靠主得勝);
        btn05 = (Button) findViewById(R.id.kid0705愛我的天父);
        btn06 = (Button) findViewById(R.id.kid0706聖靈的江河);
        btn07 = (Button) findViewById(R.id.kid0707新的一天);
        btn08 = (Button) findViewById(R.id.kid0708只要有祢在我左右);
        btn09 = (Button) findViewById(R.id.kid0709新的事將要成就);
        btn10 = (Button) findViewById(R.id.kid0710我對祢的愛永不變);
        btn11 = (Button) findViewById(R.id.kid0711我們歡迎君王降臨);
        btn12 = (Button) findViewById(R.id.kid0712榮耀的呼召);
        btn13 = (Button) findViewById(R.id.kid0713差遣我);

        _btnBack.setOnClickListener(btnListener);
        btn01.setOnClickListener(btnListener);
        btn02.setOnClickListener(btnListener);
        btn03.setOnClickListener(btnListener);
        btn04.setOnClickListener(btnListener);
        btn05.setOnClickListener(btnListener);
        btn06.setOnClickListener(btnListener);
        btn07.setOnClickListener(btnListener);
        btn08.setOnClickListener(btnListener);
        btn09.setOnClickListener(btnListener);
        btn10.setOnClickListener(btnListener);
        btn11.setOnClickListener(btnListener);
        btn12.setOnClickListener(btnListener);
        btn13.setOnClickListener(btnListener);
    }

    private Button.OnClickListener btnListener = new Button.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.kid0701彩虹:
                    Intent intent = new Intent();
                    intent.setClass(menuKid07.this, wordKid07.class);
                    intent.putExtra("Number", 1);
                    startActivity(intent);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0702DontWorry:
                    Intent intent2 = new Intent();
                    intent2.setClass(menuKid07.this, wordKid07.class);
                    intent2.putExtra("Number", 2);
                    startActivity(intent2);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0703耶穌是我的好朋友:
                    Intent intent3 = new Intent();
                    intent3.setClass(menuKid07.this, wordKid07.class);
                    intent3.putExtra("Number", 3);
                    startActivity(intent3);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0704靠主得勝:
                    Intent intent4 = new Intent();
                    intent4.setClass(menuKid07.this, wordKid07.class);
                    intent4.putExtra("Number", 4);
                    startActivity(intent4);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0705愛我的天父:
                    Intent intent5 = new Intent();
                    intent5.setClass(menuKid07.this, wordKid07.class);
                    intent5.putExtra("Number", 5);
                    startActivity(intent5);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0706聖靈的江河:
                    Intent intent6 = new Intent();
                    intent6.setClass(menuKid07.this, wordKid07.class);
                    intent6.putExtra("Number", 6);
                    startActivity(intent6);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0707新的一天:
                    Intent intent7 = new Intent();
                    intent7.setClass(menuKid07.this, wordKid07.class);
                    intent7.putExtra("Number", 7);
                    startActivity(intent7);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0708只要有祢在我左右:
                    Intent intent8 = new Intent();
                    intent8.setClass(menuKid07.this, wordKid07.class);
                    intent8.putExtra("Number", 8);
                    startActivity(intent8);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0709新的事將要成就:
                    Intent intent9 = new Intent();
                    intent9.setClass(menuKid07.this, wordKid07.class);
                    intent9.putExtra("Number", 9);
                    startActivity(intent9);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0710我對祢的愛永不變:
                    Intent intent10 = new Intent();
                    intent10.setClass(menuKid07.this, wordKid07.class);
                    intent10.putExtra("Number", 10);
                    startActivity(intent10);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0711我們歡迎君王降臨:
                    Intent intent11 = new Intent();
                    intent11.setClass(menuKid07.this, wordKid07.class);
                    intent11.putExtra("Number", 11);
                    startActivity(intent11);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0712榮耀的呼召:
                    Intent intent12 = new Intent();
                    intent12.setClass(menuKid07.this, wordKid07.class);
                    intent12.putExtra("Number", 12);
                    startActivity(intent12);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0713差遣我:
                    Intent intent13 = new Intent();
                    intent13.setClass(menuKid07.this, wordKid07.class);
                    intent13.putExtra("Number", 13);
                    startActivity(intent13);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.btnMenuKid07Previous:
                    finish();
                    break;
            }
        }
    };
}
