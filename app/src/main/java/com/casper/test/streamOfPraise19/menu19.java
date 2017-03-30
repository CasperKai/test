package com.casper.test.streamOfPraise19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.casper.test.R;

public class menu19 extends AppCompatActivity {
    private Button btn1901, btn1902,btn1903,btn1904,btn1905,btn1906,btn1907,btn1908,btn1909,btn1910,btn1911,btn1912,btn1913,btn1914;
    private Button _btnBack;
    public static menu19 instance=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu19);

        instance=this;

        _btnBack=(Button)findViewById(R.id.btnMenu19Previous);
        btn1901 =(Button)findViewById(R.id.song1901這裡有榮耀);
        btn1902 =(Button)findViewById(R.id.song1902我們歡迎君王降臨);
        btn1903= (Button)findViewById(R.id.song1903極大的聲音);
        btn1904= (Button)findViewById(R.id.song1904更多充滿);
        btn1905= (Button)findViewById(R.id.song1905從這代到那代);
        btn1906= (Button)findViewById(R.id.song1906愛中相遇);
        btn1907= (Button)findViewById(R.id.song1907以馬內利);
        btn1908= (Button)findViewById(R.id.song1908永恆唯一的盼望);
        btn1909= (Button)findViewById(R.id.song1909主祢的疼);
        btn1910= (Button)findViewById(R.id.song1910謝謝祢);
        btn1911= (Button)findViewById(R.id.song1911大手牽著小手);
        btn1912= (Button)findViewById(R.id.song1912耶和華大能的軍隊);
        btn1913= (Button)findViewById(R.id.song1913我心唯一愛慕);
        btn1914= (Button)findViewById(R.id.song1914順服);

        _btnBack.setOnClickListener(btnListener);
        btn1901.setOnClickListener(btnListener);
        btn1902.setOnClickListener(btnListener);
        btn1903.setOnClickListener(btnListener);
        btn1904.setOnClickListener(btnListener);
        btn1905.setOnClickListener(btnListener);
        btn1906.setOnClickListener(btnListener);
        btn1907.setOnClickListener(btnListener);
        btn1908.setOnClickListener(btnListener);
        btn1909.setOnClickListener(btnListener);
        btn1910.setOnClickListener(btnListener);
        btn1911.setOnClickListener(btnListener);
        btn1912.setOnClickListener(btnListener);
        btn1913.setOnClickListener(btnListener);
        btn1914.setOnClickListener(btnListener);
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.song1901這裡有榮耀:
                    Intent intent =new Intent();
                    intent.setClass(menu19.this,word19.class);
                    intent.putExtra("Number",1);
                    startActivity(intent);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1902我們歡迎君王降臨:
                    Intent intent2 =new Intent();
                    intent2.setClass(menu19.this,word19.class);
                    intent2.putExtra("Number",2);
                    startActivity(intent2);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1903極大的聲音:
                    Intent intent3 =new Intent();
                    intent3.setClass(menu19.this,word19.class);
                    intent3.putExtra("Number",3);
                    startActivity(intent3);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1904更多充滿:
                    Intent intent4 =new Intent();
                    intent4.setClass(menu19.this,word19.class);
                    intent4.putExtra("Number",4);
                    startActivity(intent4);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1905從這代到那代:
                    Intent intent5 =new Intent();
                    intent5.setClass(menu19.this,word19.class);
                    intent5.putExtra("Number",5);
                    startActivity(intent5);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1906愛中相遇:
                    Intent intent6 =new Intent();
                    intent6.setClass(menu19.this,word19.class);
                    intent6.putExtra("Number",6);
                    startActivity(intent6);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1907以馬內利:
                    Intent intent7 =new Intent();
                    intent7.setClass(menu19.this,word19.class);
                    intent7.putExtra("Number",7);
                    startActivity(intent7);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1908永恆唯一的盼望:
                    Intent intent8 =new Intent();
                    intent8.setClass(menu19.this,word19.class);
                    intent8.putExtra("Number",8);
                    startActivity(intent8);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1909主祢的疼:
                    Intent intent9 =new Intent();
                    intent9.setClass(menu19.this,word19.class);
                    intent9.putExtra("Number",9);
                    startActivity(intent9);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1910謝謝祢:
                    Intent intent10 =new Intent();
                    intent10.setClass(menu19.this,word19.class);
                    intent10.putExtra("Number",10);
                    startActivity(intent10);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1911大手牽著小手:
                    Intent intent11 =new Intent();
                    intent11.setClass(menu19.this,word19.class);
                    intent11.putExtra("Number",11);
                    startActivity(intent11);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1912耶和華大能的軍隊:
                    Intent intent12 =new Intent();
                    intent12.setClass(menu19.this,word19.class);
                    intent12.putExtra("Number",12);
                    startActivity(intent12);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1913我心唯一愛慕:
                    Intent intent13 =new Intent();
                    intent13.setClass(menu19.this,word19.class);
                    intent13.putExtra("Number",13);
                    startActivity(intent13);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1914順服:
                    Intent intent14 =new Intent();
                    intent14.setClass(menu19.this,word19.class);
                    intent14.putExtra("Number",14);
                    startActivity(intent14);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.btnMenu19Previous:
                    finish();
                    break;
            }
        }
    };
}
