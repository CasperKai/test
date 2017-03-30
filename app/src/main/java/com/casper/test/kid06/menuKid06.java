package com.casper.test.kid06;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.casper.test.R;

public class menuKid06 extends AppCompatActivity {

    private Button btn01, btn02, btn03, btn04, btn05, btn06, btn07, btn08, btn09, btn10,btn11,btn12;
    private Button _btnBack;
    public static menuKid06 instance = null;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_kid06);

        instance = this;

        _btnBack = (Button) findViewById(R.id.btnMenuKid06Previous);
        btn01 = (Button) findViewById(R.id.kid0601讚美的孩子最喜樂);
        btn02 = (Button) findViewById(R.id.kid0602我有喜樂);
        btn03 = (Button) findViewById(R.id.kid0603保護我的是耶和華);
        btn04 = (Button) findViewById(R.id.kid0604喜樂自由);
        btn05 = (Button) findViewById(R.id.kid0605這裡有榮耀);
        btn06 = (Button) findViewById(R.id.kid0606震動天地);
        btn07 = (Button) findViewById(R.id.kid0607主祢是我力量);
        btn08 = (Button) findViewById(R.id.kid0608何等恩典);
        btn09 = (Button) findViewById(R.id.kid0609永遠愛祢);
        btn10 = (Button) findViewById(R.id.kid0610愛我願意);
        btn11 = (Button) findViewById(R.id.kid0611我已得自由);
        btn12 = (Button) findViewById(R.id.kid0612我的家要榮耀主);
        
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
    }

    private Button.OnClickListener btnListener = new Button.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.kid0601讚美的孩子最喜樂:
                    Intent intent = new Intent();
                    intent.setClass(menuKid06.this, wordKid06.class);
                    intent.putExtra("Number", 1);
                    startActivity(intent);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0602我有喜樂:
                    Intent intent2 = new Intent();
                    intent2.setClass(menuKid06.this, wordKid06.class);
                    intent2.putExtra("Number", 2);
                    startActivity(intent2);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0603保護我的是耶和華:
                    Intent intent3 = new Intent();
                    intent3.setClass(menuKid06.this, wordKid06.class);
                    intent3.putExtra("Number", 3);
                    startActivity(intent3);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0604喜樂自由:
                    Intent intent4 = new Intent();
                    intent4.setClass(menuKid06.this, wordKid06.class);
                    intent4.putExtra("Number", 4);
                    startActivity(intent4);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0605這裡有榮耀:
                    Intent intent5 = new Intent();
                    intent5.setClass(menuKid06.this, wordKid06.class);
                    intent5.putExtra("Number", 5);
                    startActivity(intent5);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0606震動天地:
                    Intent intent6 = new Intent();
                    intent6.setClass(menuKid06.this, wordKid06.class);
                    intent6.putExtra("Number", 6);
                    startActivity(intent6);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0607主祢是我力量:
                    Intent intent7 = new Intent();
                    intent7.setClass(menuKid06.this, wordKid06.class);
                    intent7.putExtra("Number", 7);
                    startActivity(intent7);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0608何等恩典:
                    Intent intent8 = new Intent();
                    intent8.setClass(menuKid06.this, wordKid06.class);
                    intent8.putExtra("Number", 8);
                    startActivity(intent8);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0609永遠愛祢:
                    Intent intent9 = new Intent();
                    intent9.setClass(menuKid06.this, wordKid06.class);
                    intent9.putExtra("Number", 9);
                    startActivity(intent9);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0610愛我願意:
                    Intent intent10 = new Intent();
                    intent10.setClass(menuKid06.this, wordKid06.class);
                    intent10.putExtra("Number", 10);
                    startActivity(intent10);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0611我已得自由:
                    Intent intent11 = new Intent();
                    intent11.setClass(menuKid06.this, wordKid06.class);
                    intent11.putExtra("Number", 11);
                    startActivity(intent11);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0612我的家要榮耀主:
                    Intent intent12 = new Intent();
                    intent12.setClass(menuKid06.this, wordKid06.class);
                    intent12.putExtra("Number", 12);
                    startActivity(intent12);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.btnMenuKid06Previous:
                    finish();
                    break;
            }
        }
    };
}
