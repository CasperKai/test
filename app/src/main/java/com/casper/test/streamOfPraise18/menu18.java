package com.casper.test.streamOfPraise18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.casper.test.R;

public class menu18 extends AppCompatActivity {
    private Button btn1801, btn1802,btn1803,btn1804,btn1805,btn1806,btn1807,btn1808,btn1809,btn1810,btn1811,btn1812,btn1813,btn1814;
    private Button _btnBack;
    public static menu18 instance=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu18);

        instance=this;

        _btnBack=(Button)findViewById(R.id.btnMenu18Previous);
        btn1801 =(Button)findViewById(R.id.song1801從心合一);
        btn1802 =(Button)findViewById(R.id.song1802深刻的愛);
        btn1803= (Button)findViewById(R.id.song1803回家);
        btn1804= (Button)findViewById(R.id.song1804永遠不分離);
        btn1805= (Button)findViewById(R.id.song1805是祢的愛);
        btn1806= (Button)findViewById(R.id.song1806新的一天);
        btn1807= (Button)findViewById(R.id.song1807齊來讚美);
        btn1808= (Button)findViewById(R.id.song1808我有喜樂);
        btn1809= (Button)findViewById(R.id.song1809聖靈的江河);
        btn1810= (Button)findViewById(R.id.song1810帶我進入祢的同在);
        btn1811= (Button)findViewById(R.id.song1811願祢降臨);
        btn1812= (Button)findViewById(R.id.song1812禱告的大軍);
        btn1813= (Button)findViewById(R.id.song1813耶和華作了我的高臺);
        btn1814= (Button)findViewById(R.id.song1814天上的家);

        _btnBack.setOnClickListener(btnListener);
        btn1801.setOnClickListener(btnListener);
        btn1802.setOnClickListener(btnListener);
        btn1803.setOnClickListener(btnListener);
        btn1804.setOnClickListener(btnListener);
        btn1805.setOnClickListener(btnListener);
        btn1806.setOnClickListener(btnListener);
        btn1807.setOnClickListener(btnListener);
        btn1808.setOnClickListener(btnListener);
        btn1809.setOnClickListener(btnListener);
        btn1810.setOnClickListener(btnListener);
        btn1811.setOnClickListener(btnListener);
        btn1812.setOnClickListener(btnListener);
        btn1813.setOnClickListener(btnListener);
        btn1814.setOnClickListener(btnListener);
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.song1801從心合一:
                    Intent intent =new Intent();
                    intent.setClass(menu18.this,word18.class);
                    intent.putExtra("Number",1);
                    startActivity(intent);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1802深刻的愛:
                    Intent intent2 =new Intent();
                    intent2.setClass(menu18.this,word18.class);
                    intent2.putExtra("Number",2);
                    startActivity(intent2);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1803回家:
                    Intent intent3 =new Intent();
                    intent3.setClass(menu18.this,word18.class);
                    intent3.putExtra("Number",3);
                    startActivity(intent3);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1804永遠不分離:
                    Intent intent4 =new Intent();
                    intent4.setClass(menu18.this,word18.class);
                    intent4.putExtra("Number",4);
                    startActivity(intent4);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1805是祢的愛:
                    Intent intent5 =new Intent();
                    intent5.setClass(menu18.this,word18.class);
                    intent5.putExtra("Number",5);
                    startActivity(intent5);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1806新的一天:
                    Intent intent6 =new Intent();
                    intent6.setClass(menu18.this,word18.class);
                    intent6.putExtra("Number",6);
                    startActivity(intent6);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1807齊來讚美:
                    Intent intent7 =new Intent();
                    intent7.setClass(menu18.this,word18.class);
                    intent7.putExtra("Number",7);
                    startActivity(intent7);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1808我有喜樂:
                    Intent intent8 =new Intent();
                    intent8.setClass(menu18.this,word18.class);
                    intent8.putExtra("Number",8);
                    startActivity(intent8);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1809聖靈的江河:
                    Intent intent9 =new Intent();
                    intent9.setClass(menu18.this,word18.class);
                    intent9.putExtra("Number",9);
                    startActivity(intent9);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1810帶我進入祢的同在:
                    Intent intent10 =new Intent();
                    intent10.setClass(menu18.this,word18.class);
                    intent10.putExtra("Number",10);
                    startActivity(intent10);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1811願祢降臨:
                    Intent intent11 =new Intent();
                    intent11.setClass(menu18.this,word18.class);
                    intent11.putExtra("Number",11);
                    startActivity(intent11);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1812禱告的大軍:
                    Intent intent12 =new Intent();
                    intent12.setClass(menu18.this,word18.class);
                    intent12.putExtra("Number",12);
                    startActivity(intent12);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1813耶和華作了我的高臺:
                    Intent intent13 =new Intent();
                    intent13.setClass(menu18.this,word18.class);
                    intent13.putExtra("Number",13);
                    startActivity(intent13);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1814天上的家:
                    Intent intent14 =new Intent();
                    intent14.setClass(menu18.this,word18.class);
                    intent14.putExtra("Number",14);
                    startActivity(intent14);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.btnMenu18Previous:
                    finish();
                    break;
            }
        }
    };
}
