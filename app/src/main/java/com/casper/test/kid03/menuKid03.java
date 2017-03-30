package com.casper.test.kid03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.casper.test.R;

public class menuKid03 extends AppCompatActivity {

    private Button btn01, btn02, btn03, btn04, btn05, btn06, btn07, btn08, btn09, btn10,btn11;
    private Button _btnBack;
    public static menuKid03 instance = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_kid03);

        instance = this;

        _btnBack = (Button) findViewById(R.id.btnMenuKid03Previous);
        btn01 = (Button) findViewById(R.id.kid0301如果你想知道);
        btn02 = (Button) findViewById(R.id.kid0302我們是光明之子);
        btn03 = (Button) findViewById(R.id.kid0303有一位神);
        btn04 = (Button) findViewById(R.id.kid0304求主充滿我);
        btn05 = (Button) findViewById(R.id.kid0305親愛的要記得);
        btn06 = (Button) findViewById(R.id.kid0306爸爸媽媽的愛);
        btn07 = (Button) findViewById(R.id.kid0307祢的慈愛);
        btn08 = (Button) findViewById(R.id.kid0308喔十字架);
        btn09 = (Button) findViewById(R.id.kid0309進入豐盛);
        btn10 = (Button) findViewById(R.id.kid0310祢的同在);
        btn11 = (Button) findViewById(R.id.kid0311彈琴歌唱讚美祢);

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
                case R.id.kid0301如果你想知道:
                    Intent intent = new Intent();
                    intent.setClass(menuKid03.this, wordKid03.class);
                    intent.putExtra("Number", 1);
                    startActivity(intent);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0302我們是光明之子:
                    Intent intent2 = new Intent();
                    intent2.setClass(menuKid03.this, wordKid03.class);
                    intent2.putExtra("Number", 2);
                    startActivity(intent2);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0303有一位神:
                    Intent intent3 = new Intent();
                    intent3.setClass(menuKid03.this, wordKid03.class);
                    intent3.putExtra("Number", 3);
                    startActivity(intent3);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0304求主充滿我:
                    Intent intent4 = new Intent();
                    intent4.setClass(menuKid03.this, wordKid03.class);
                    intent4.putExtra("Number", 4);
                    startActivity(intent4);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0305親愛的要記得:
                    Intent intent5 = new Intent();
                    intent5.setClass(menuKid03.this, wordKid03.class);
                    intent5.putExtra("Number", 5);
                    startActivity(intent5);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0306爸爸媽媽的愛:
                    Intent intent6 = new Intent();
                    intent6.setClass(menuKid03.this, wordKid03.class);
                    intent6.putExtra("Number", 6);
                    startActivity(intent6);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0307祢的慈愛:
                    Intent intent7 = new Intent();
                    intent7.setClass(menuKid03.this, wordKid03.class);
                    intent7.putExtra("Number", 7);
                    startActivity(intent7);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0308喔十字架:
                    Intent intent8 = new Intent();
                    intent8.setClass(menuKid03.this, wordKid03.class);
                    intent8.putExtra("Number", 8);
                    startActivity(intent8);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0309進入豐盛:
                    Intent intent9 = new Intent();
                    intent9.setClass(menuKid03.this, wordKid03.class);
                    intent9.putExtra("Number", 9);
                    startActivity(intent9);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0310祢的同在:
                    Intent intent10 = new Intent();
                    intent10.setClass(menuKid03.this, wordKid03.class);
                    intent10.putExtra("Number", 10);
                    startActivity(intent10);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0311彈琴歌唱讚美祢:
                    Intent intent11 = new Intent();
                    intent11.setClass(menuKid03.this, wordKid03.class);
                    intent11.putExtra("Number", 11);
                    startActivity(intent11);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.btnMenuKid03Previous:
                    finish();
                    break;
            }
        }
    };
}
