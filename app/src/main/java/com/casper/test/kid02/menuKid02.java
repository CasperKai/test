package com.casper.test.kid02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.casper.test.R;

public class menuKid02 extends AppCompatActivity {


    private Button btn0201, btn0202, btn0203, btn0204, btn0205, btn0206, btn0207, btn0208, btn0209, btn0210,btn0211;
    private Button _btnBack;
    public static menuKid02 instance = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_kid02);

        instance = this;

        _btnBack = (Button) findViewById(R.id.btnMenuKid02Previous);
        btn0201 = (Button) findViewById(R.id.kid0201讓讚美飛揚);
        btn0202 = (Button) findViewById(R.id.kid0202看見復興);
        btn0203 = (Button) findViewById(R.id.kid0203認識你真好);
        btn0204 = (Button) findViewById(R.id.kid0204我們愛);
        btn0205 = (Button) findViewById(R.id.kid0205天父的花園);
        btn0206 = (Button) findViewById(R.id.kid0206耶穌愛你);
        btn0207 = (Button) findViewById(R.id.kid0207耶穌我愛祢);
        btn0208 = (Button) findViewById(R.id.kid0208寶貴十架);
        btn0209 = (Button) findViewById(R.id.kid0209賜福於你);
        btn0210 = (Button) findViewById(R.id.kid0210耶和華是我牧者);
        btn0211 = (Button) findViewById(R.id.kid0211在祢寶座前);

        _btnBack.setOnClickListener(btnListener);
        btn0201.setOnClickListener(btnListener);
        btn0202.setOnClickListener(btnListener);
        btn0203.setOnClickListener(btnListener);
        btn0204.setOnClickListener(btnListener);
        btn0205.setOnClickListener(btnListener);
        btn0206.setOnClickListener(btnListener);
        btn0207.setOnClickListener(btnListener);
        btn0208.setOnClickListener(btnListener);
        btn0209.setOnClickListener(btnListener);
        btn0210.setOnClickListener(btnListener);
        btn0211.setOnClickListener(btnListener);
    }

    private Button.OnClickListener btnListener = new Button.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.kid0201讓讚美飛揚:
                    Intent intent = new Intent();
                    intent.setClass(menuKid02.this, wordKid02.class);
                    intent.putExtra("Number", 1);
                    startActivity(intent);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0202看見復興:
                    Intent intent2 = new Intent();
                    intent2.setClass(menuKid02.this, wordKid02.class);
                    intent2.putExtra("Number", 2);
                    startActivity(intent2);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0203認識你真好:
                    Intent intent3 = new Intent();
                    intent3.setClass(menuKid02.this, wordKid02.class);
                    intent3.putExtra("Number", 3);
                    startActivity(intent3);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0204我們愛:
                    Intent intent4 = new Intent();
                    intent4.setClass(menuKid02.this, wordKid02.class);
                    intent4.putExtra("Number", 4);
                    startActivity(intent4);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0205天父的花園:
                    Intent intent5 = new Intent();
                    intent5.setClass(menuKid02.this, wordKid02.class);
                    intent5.putExtra("Number", 5);
                    startActivity(intent5);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0206耶穌愛你:
                    Intent intent6 = new Intent();
                    intent6.setClass(menuKid02.this, wordKid02.class);
                    intent6.putExtra("Number", 6);
                    startActivity(intent6);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0207耶穌我愛祢:
                    Intent intent7 = new Intent();
                    intent7.setClass(menuKid02.this, wordKid02.class);
                    intent7.putExtra("Number", 7);
                    startActivity(intent7);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0208寶貴十架:
                    Intent intent8 = new Intent();
                    intent8.setClass(menuKid02.this, wordKid02.class);
                    intent8.putExtra("Number", 8);
                    startActivity(intent8);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0209賜福於你:
                    Intent intent9 = new Intent();
                    intent9.setClass(menuKid02.this, wordKid02.class);
                    intent9.putExtra("Number", 9);
                    startActivity(intent9);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0210耶和華是我牧者:
                    Intent intent10 = new Intent();
                    intent10.setClass(menuKid02.this, wordKid02.class);
                    intent10.putExtra("Number", 10);
                    startActivity(intent10);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0211在祢寶座前:
                    Intent intent11 = new Intent();
                    intent11.setClass(menuKid02.this, wordKid02.class);
                    intent11.putExtra("Number", 11);
                    startActivity(intent11);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.btnMenuKid02Previous:
                    finish();
                    break;
            }
        }
    };
}
