package com.casper.test.kid01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.casper.test.R;

public class menuKid01 extends AppCompatActivity {

    private Button btn0101, btn0102, btn0103, btn0104, btn0105, btn0106, btn0107, btn0108, btn0109, btn0110;
    private Button _btnBack;
    public static menuKid01 instance = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_kid01);

        instance = this;

        _btnBack = (Button) findViewById(R.id.btnMenuKid01Previous);
        btn0101 = (Button) findViewById(R.id.kid0101滿有能力);
        btn0102 = (Button) findViewById(R.id.kid0102雲上太陽);
        btn0103 = (Button) findViewById(R.id.kid0103小小的夢想);
        btn0104 = (Button) findViewById(R.id.kid0104最深愛的主);
        btn0105 = (Button) findViewById(R.id.kid0105天天讚美);
        btn0106 = (Button) findViewById(R.id.kid0106主的喜樂是我力量);
        btn0107 = (Button) findViewById(R.id.kid0107ShakyShakyTime);
        btn0108 = (Button) findViewById(R.id.kid0108讚美之泉);
        btn0109 = (Button) findViewById(R.id.kid0109我要向高山舉目);
        btn0110 = (Button) findViewById(R.id.kid0110晚安曲);

        _btnBack.setOnClickListener(btnListener);
        btn0101.setOnClickListener(btnListener);
        btn0102.setOnClickListener(btnListener);
        btn0103.setOnClickListener(btnListener);
        btn0104.setOnClickListener(btnListener);
        btn0105.setOnClickListener(btnListener);
        btn0106.setOnClickListener(btnListener);
        btn0107.setOnClickListener(btnListener);
        btn0108.setOnClickListener(btnListener);
        btn0109.setOnClickListener(btnListener);
        btn0110.setOnClickListener(btnListener);

    }

    private Button.OnClickListener btnListener = new Button.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.kid0101滿有能力:
                    Intent intent = new Intent();
                    intent.setClass(menuKid01.this, wordKid01.class);
                    intent.putExtra("Number", 1);
                    startActivity(intent);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0102雲上太陽:
                    Intent intent2 = new Intent();
                    intent2.setClass(menuKid01.this, wordKid01.class);
                    intent2.putExtra("Number", 2);
                    startActivity(intent2);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0103小小的夢想:
                    Intent intent3 = new Intent();
                    intent3.setClass(menuKid01.this, wordKid01.class);
                    intent3.putExtra("Number", 3);
                    startActivity(intent3);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0104最深愛的主:
                    Intent intent4 = new Intent();
                    intent4.setClass(menuKid01.this, wordKid01.class);
                    intent4.putExtra("Number", 4);
                    startActivity(intent4);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0105天天讚美:
                    Intent intent5 = new Intent();
                    intent5.setClass(menuKid01.this, wordKid01.class);
                    intent5.putExtra("Number", 5);
                    startActivity(intent5);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0106主的喜樂是我力量:
                    Intent intent6 = new Intent();
                    intent6.setClass(menuKid01.this, wordKid01.class);
                    intent6.putExtra("Number", 6);
                    startActivity(intent6);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0107ShakyShakyTime:
                    Intent intent7 = new Intent();
                    intent7.setClass(menuKid01.this, wordKid01.class);
                    intent7.putExtra("Number", 7);
                    startActivity(intent7);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0108讚美之泉:
                    Intent intent8 = new Intent();
                    intent8.setClass(menuKid01.this, wordKid01.class);
                    intent8.putExtra("Number", 8);
                    startActivity(intent8);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0109我要向高山舉目:
                    Intent intent9 = new Intent();
                    intent9.setClass(menuKid01.this, wordKid01.class);
                    intent9.putExtra("Number", 9);
                    startActivity(intent9);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.kid0110晚安曲:
                    Intent intent10 = new Intent();
                    intent10.setClass(menuKid01.this, wordKid01.class);
                    intent10.putExtra("Number", 10);
                    startActivity(intent10);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.btnMenuKid01Previous:
                    finish();
                    break;
            }
        }
    };

}
