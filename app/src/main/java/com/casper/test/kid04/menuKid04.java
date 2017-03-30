package com.casper.test.kid04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.casper.test.R;

public class menuKid04 extends AppCompatActivity {

    private Button btn01, btn02, btn03, btn04, btn05, btn06, btn07, btn08, btn09, btn10,btn11;
    private Button _btnBack;
    public static menuKid04 instance = null;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_kid04);

        instance = this;

        _btnBack = (Button) findViewById(R.id.btnMenuKid04Previous);
        btn01 = (Button) findViewById(R.id.kid0401讓愛走動);
        btn02 = (Button) findViewById(R.id.kid0402何等有福);
        btn03 = (Button) findViewById(R.id.kid0403把冷漠變成愛);
        btn04 = (Button) findViewById(R.id.kid0404多麼奇妙);
        btn05 = (Button) findViewById(R.id.kid0405有人在等你);
        btn06 = (Button) findViewById(R.id.kid0406耶穌我的耶穌);
        btn07 = (Button) findViewById(R.id.kid0407注目看耶穌);
        btn08 = (Button) findViewById(R.id.kid0408深深愛祢);
        btn09 = (Button) findViewById(R.id.kid0409愛可以再更多一點點);
        btn10 = (Button) findViewById(R.id.kid0410專心仰望耶穌);
        btn11 = (Button) findViewById(R.id.kid0411將天敞開);

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
        
    }

    private Button.OnClickListener btnListener = new Button.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.kid0401讓愛走動:
                    Intent intent = new Intent();
                    intent.setClass(menuKid04.this, wordKid04.class);
                    intent.putExtra("Number", 1);
                    startActivity(intent);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0402何等有福:
                    Intent intent2 = new Intent();
                    intent2.setClass(menuKid04.this, wordKid04.class);
                    intent2.putExtra("Number", 2);
                    startActivity(intent2);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0403把冷漠變成愛:
                    Intent intent3 = new Intent();
                    intent3.setClass(menuKid04.this, wordKid04.class);
                    intent3.putExtra("Number", 3);
                    startActivity(intent3);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0404多麼奇妙:
                    Intent intent4 = new Intent();
                    intent4.setClass(menuKid04.this, wordKid04.class);
                    intent4.putExtra("Number", 4);
                    startActivity(intent4);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0405有人在等你:
                    Intent intent5 = new Intent();
                    intent5.setClass(menuKid04.this, wordKid04.class);
                    intent5.putExtra("Number", 5);
                    startActivity(intent5);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0406耶穌我的耶穌:
                    Intent intent6 = new Intent();
                    intent6.setClass(menuKid04.this, wordKid04.class);
                    intent6.putExtra("Number", 6);
                    startActivity(intent6);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0407注目看耶穌:
                    Intent intent7 = new Intent();
                    intent7.setClass(menuKid04.this, wordKid04.class);
                    intent7.putExtra("Number", 7);
                    startActivity(intent7);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0408深深愛祢:
                    Intent intent8 = new Intent();
                    intent8.setClass(menuKid04.this, wordKid04.class);
                    intent8.putExtra("Number", 8);
                    startActivity(intent8);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0409愛可以再更多一點點:
                    Intent intent9 = new Intent();
                    intent9.setClass(menuKid04.this, wordKid04.class);
                    intent9.putExtra("Number", 9);
                    startActivity(intent9);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0410專心仰望耶穌:
                    Intent intent10 = new Intent();
                    intent10.setClass(menuKid04.this, wordKid04.class);
                    intent10.putExtra("Number", 10);
                    startActivity(intent10);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0411將天敞開:
                    Intent intent11 = new Intent();
                    intent11.setClass(menuKid04.this, wordKid04.class);
                    intent11.putExtra("Number", 11);
                    startActivity(intent11);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.btnMenuKid04Previous:
                    finish();
                    break;
            }
        }
    };
}
