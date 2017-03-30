package com.casper.test.jesus2015;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.casper.test.R;

public class menuJesus2015 extends AppCompatActivity {
    private Button btn01, btn02,btn03,btn04,btn05,btn06,btn07,btn08,btn09,btn10;
    private Button _btnBack;
    public static menuJesus2015 instance=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_jesus2015);
        instance=this;

        _btnBack=(Button)findViewById(R.id.btnMenuJesus2015Previous);
        btn01 =(Button)findViewById(R.id.jesus1501天父的國度);
        btn02 =(Button)findViewById(R.id.jesus1502好土);
        btn03= (Button)findViewById(R.id.jesus1503直到永遠);
        btn04= (Button)findViewById(R.id.jesus1504竭力追求);
        btn05= (Button)findViewById(R.id.jesus1505我們敬拜你);
        btn06= (Button)findViewById(R.id.jesus1506器皿);
        btn07= (Button)findViewById(R.id.jesus1507有一個盼望);
        btn08= (Button)findViewById(R.id.jesus1508祂是你的幫助);
        btn09= (Button)findViewById(R.id.jesus1509你的香氣);
        btn10= (Button)findViewById(R.id.jesus1510安靜居所);

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

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.jesus1501天父的國度:
                    Intent intent =new Intent();
                    intent.setClass(menuJesus2015.this,wordJesus2015.class);
                    intent.putExtra("Number",1);
                    startActivity(intent);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1502好土:
                    Intent intent2 =new Intent();
                    intent2.setClass(menuJesus2015.this,wordJesus2015.class);
                    intent2.putExtra("Number",2);
                    startActivity(intent2);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1503直到永遠:
                    Intent intent3 =new Intent();
                    intent3.setClass(menuJesus2015.this,wordJesus2015.class);
                    intent3.putExtra("Number",3);
                    startActivity(intent3);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1504竭力追求:
                    Intent intent4 =new Intent();
                    intent4.setClass(menuJesus2015.this,wordJesus2015.class);
                    intent4.putExtra("Number",4);
                    startActivity(intent4);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1505我們敬拜你:
                    Intent intent5 =new Intent();
                    intent5.setClass(menuJesus2015.this,wordJesus2015.class);
                    intent5.putExtra("Number",5);
                    startActivity(intent5);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1506器皿:
                    Intent intent6 =new Intent();
                    intent6.setClass(menuJesus2015.this,wordJesus2015.class);
                    intent6.putExtra("Number",6);
                    startActivity(intent6);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1507有一個盼望:
                    Intent intent7 =new Intent();
                    intent7.setClass(menuJesus2015.this,wordJesus2015.class);
                    intent7.putExtra("Number",7);
                    startActivity(intent7);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1508祂是你的幫助:
                    Intent intent8 =new Intent();
                    intent8.setClass(menuJesus2015.this,wordJesus2015.class);
                    intent8.putExtra("Number",8);
                    startActivity(intent8);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1509你的香氣:
                    Intent intent9 =new Intent();
                    intent9.setClass(menuJesus2015.this,wordJesus2015.class);
                    intent9.putExtra("Number",9);
                    startActivity(intent9);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1510安靜居所:
                    Intent intent10 =new Intent();
                    intent10.setClass(menuJesus2015.this,wordJesus2015.class);
                    intent10.putExtra("Number",10);
                    startActivity(intent10);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.btnMenuJesus2015Previous:
                    finish();
                    break;
            }
        }
    };

}
