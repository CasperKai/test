package com.casper.test.kid05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.casper.test.R;

public class menuKid05 extends AppCompatActivity {

    private Button btn01, btn02, btn03, btn04, btn05, btn06, btn07, btn08, btn09, btn10;
    private Button _btnBack;
    public static menuKid05 instance = null;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_kid05);

        instance = this;

        _btnBack = (Button) findViewById(R.id.btnMenuKid05Previous);
        btn01 = (Button) findViewById(R.id.kid0501新造的人);
        btn02 = (Button) findViewById(R.id.kid0502歡呼);
        btn03 = (Button) findViewById(R.id.kid0503恩典之路);
        btn04 = (Button) findViewById(R.id.kid0504回家);
        btn05 = (Button) findViewById(R.id.kid0505相信有愛就有奇蹟);
        btn06 = (Button) findViewById(R.id.kid0506齊來讚美);
        btn07 = (Button) findViewById(R.id.kid0507耶和華沙龍);
        btn08 = (Button) findViewById(R.id.kid0508耶穌的名);
        btn09 = (Button) findViewById(R.id.kid0509歌頌);
        btn10 = (Button) findViewById(R.id.kid0510祢的愛長闊高深);

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
        
    }

    private Button.OnClickListener btnListener = new Button.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.kid0501新造的人:
                    Intent intent = new Intent();
                    intent.setClass(menuKid05.this, wordKid05.class);
                    intent.putExtra("Number", 1);
                    startActivity(intent);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0502歡呼:
                    Intent intent2 = new Intent();
                    intent2.setClass(menuKid05.this, wordKid05.class);
                    intent2.putExtra("Number", 2);
                    startActivity(intent2);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0503恩典之路:
                    Intent intent3 = new Intent();
                    intent3.setClass(menuKid05.this, wordKid05.class);
                    intent3.putExtra("Number", 3);
                    startActivity(intent3);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0504回家:
                    Intent intent4 = new Intent();
                    intent4.setClass(menuKid05.this, wordKid05.class);
                    intent4.putExtra("Number", 4);
                    startActivity(intent4);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0505相信有愛就有奇蹟:
                    Intent intent5 = new Intent();
                    intent5.setClass(menuKid05.this, wordKid05.class);
                    intent5.putExtra("Number", 5);
                    startActivity(intent5);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0506齊來讚美:
                    Intent intent6 = new Intent();
                    intent6.setClass(menuKid05.this, wordKid05.class);
                    intent6.putExtra("Number", 6);
                    startActivity(intent6);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0507耶和華沙龍:
                    Intent intent7 = new Intent();
                    intent7.setClass(menuKid05.this, wordKid05.class);
                    intent7.putExtra("Number", 7);
                    startActivity(intent7);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0508耶穌的名:
                    Intent intent8 = new Intent();
                    intent8.setClass(menuKid05.this, wordKid05.class);
                    intent8.putExtra("Number", 8);
                    startActivity(intent8);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0509歌頌:
                    Intent intent9 = new Intent();
                    intent9.setClass(menuKid05.this, wordKid05.class);
                    intent9.putExtra("Number", 9);
                    startActivity(intent9);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0510祢的愛長闊高深:
                    Intent intent10 = new Intent();
                    intent10.setClass(menuKid05.this, wordKid05.class);
                    intent10.putExtra("Number", 10);
                    startActivity(intent10);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.btnMenuKid05Previous:
                    finish();
                    break;
            }
        }
    };
    
}
