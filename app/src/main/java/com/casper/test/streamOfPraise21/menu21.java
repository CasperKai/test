package com.casper.test.streamOfPraise21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.casper.test.R;
import com.casper.test.streamOfPraise19.word19;

public class menu21 extends AppCompatActivity {
    private Button btn2101, btn2102,btn2103,btn2104,btn2105,btn2106,btn2107,btn2108,btn2109,btn2110,btn2111,btn2112;
    private Button _btnBack;
    public static menu21 instance=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu21);

        instance=this;

        _btnBack=(Button)findViewById(R.id.btnMenu21Previous);
        btn2101 =(Button)findViewById(R.id.song2101我要看見);
        btn2102 =(Button)findViewById(R.id.song2102每一天我需要祢);
        btn2103= (Button)findViewById(R.id.song2103讓我得見祢的榮面);
        btn2104= (Button)findViewById(R.id.song2104獻上尊榮);
        btn2105= (Button)findViewById(R.id.song2105更深之處);
        btn2106= (Button)findViewById(R.id.song2106近前來);
        btn2107= (Button)findViewById(R.id.song2107行神蹟的神);
        btn2108= (Button)findViewById(R.id.song2108這是耶和華所定日子);
        btn2109= (Button)findViewById(R.id.song2109這世代要呼求祢);
        btn2110= (Button)findViewById(R.id.song2110在至高之處);
        btn2111= (Button)findViewById(R.id.song2111為愛而生);
        btn2112= (Button)findViewById(R.id.song2112祢必成就美好事);

        _btnBack.setOnClickListener(btnListener);
        btn2101.setOnClickListener(btnListener);
        btn2102.setOnClickListener(btnListener);
        btn2103.setOnClickListener(btnListener);
        btn2104.setOnClickListener(btnListener);
        btn2105.setOnClickListener(btnListener);
        btn2106.setOnClickListener(btnListener);
        btn2107.setOnClickListener(btnListener);
        btn2108.setOnClickListener(btnListener);
        btn2109.setOnClickListener(btnListener);
        btn2110.setOnClickListener(btnListener);
        btn2111.setOnClickListener(btnListener);
        btn2112.setOnClickListener(btnListener);
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.song2101我要看見:
                    Intent intent =new Intent();
                    intent.setClass(menu21.this,word21.class);
                    intent.putExtra("Number",1);
                    startActivity(intent);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2102每一天我需要祢:
                    Intent intent2 =new Intent();
                    intent2.setClass(menu21.this,word21.class);
                    intent2.putExtra("Number",2);
                    startActivity(intent2);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2103讓我得見祢的榮面:
                    Intent intent3 =new Intent();
                    intent3.setClass(menu21.this,word21.class);
                    intent3.putExtra("Number",3);
                    startActivity(intent3);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2104獻上尊榮:
                    Intent intent4 =new Intent();
                    intent4.setClass(menu21.this,word21.class);
                    intent4.putExtra("Number",4);
                    startActivity(intent4);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2105更深之處:
                    Intent intent5 =new Intent();
                    intent5.setClass(menu21.this,word21.class);
                    intent5.putExtra("Number",5);
                    startActivity(intent5);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2106近前來:
                    Intent intent6 =new Intent();
                    intent6.setClass(menu21.this,word21.class);
                    intent6.putExtra("Number",6);
                    startActivity(intent6);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2107行神蹟的神:
                    Intent intent7 =new Intent();
                    intent7.setClass(menu21.this,word21.class);
                    intent7.putExtra("Number",7);
                    startActivity(intent7);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2108這是耶和華所定日子:
                    Intent intent8 =new Intent();
                    intent8.setClass(menu21.this,word21.class);
                    intent8.putExtra("Number",8);
                    startActivity(intent8);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2109這世代要呼求祢:
                    Intent intent9 =new Intent();
                    intent9.setClass(menu21.this,word21.class);
                    intent9.putExtra("Number",9);
                    startActivity(intent9);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2110在至高之處:
                    Intent intent10 =new Intent();
                    intent10.setClass(menu21.this,word21.class);
                    intent10.putExtra("Number",10);
                    startActivity(intent10);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2111為愛而生:
                    Intent intent11 =new Intent();
                    intent11.setClass(menu21.this,word21.class);
                    intent11.putExtra("Number",11);
                    startActivity(intent11);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2112祢必成就美好事:
                    Intent intent12 =new Intent();
                    intent12.setClass(menu21.this,word21.class);
                    intent12.putExtra("Number",12);
                    startActivity(intent12);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.btnMenu21Previous:
                    finish();
                    break;
            }
        }
    };
}
