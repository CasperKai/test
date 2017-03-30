package com.casper.test.streamOfPraise20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.casper.test.R;
import com.casper.test.streamOfPraise19.word19;

public class menu20 extends AppCompatActivity {
    private Button btn2001, btn2002,btn2003,btn2004,btn2005,btn2006,btn2007,btn2008,btn2009,btn2010,btn2011,btn2012,btn2013,btn2014,btn2015,btn2016,btn2017,btn2018;
    private Button _btnBack;
    public static menu20 instance=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu20);

        instance=this;

        _btnBack=(Button)findViewById(R.id.btnMenu20Previous);
        btn2001 =(Button)findViewById(R.id.song2001給夢想一雙翅膀);
        btn2002 =(Button)findViewById(R.id.song2002新的事將要成就);
        btn2003= (Button)findViewById(R.id.song2003新的異象新的方向);
        btn2004= (Button)findViewById(R.id.song2004只要有祢在我左右);
        btn2005= (Button)findViewById(R.id.song2005我們愛戴的王);
        btn2006= (Button)findViewById(R.id.song2006榮耀大君王);
        btn2007= (Button)findViewById(R.id.song2007安靜);
        btn2008= (Button)findViewById(R.id.song2008奔跑不放棄);
        btn2009= (Button)findViewById(R.id.song2009能不能);
        btn2010= (Button)findViewById(R.id.song2010醫治我);
        btn2011= (Button)findViewById(R.id.song2011找一個地方);
        btn2012= (Button)findViewById(R.id.song2012全新的生命);
        btn2013= (Button)findViewById(R.id.song2013前來敬拜);
        btn2014= (Button)findViewById(R.id.song2014敬拜讓世界震動);
        btn2015= (Button)findViewById(R.id.song2015傾倒);
        btn2016= (Button)findViewById(R.id.song2016365天);
        btn2017= (Button)findViewById(R.id.song2017祢的器皿);
        btn2018= (Button)findViewById(R.id.song2018願祢國度降臨);

        _btnBack.setOnClickListener(btnListener);
        btn2001.setOnClickListener(btnListener);
        btn2002.setOnClickListener(btnListener);
        btn2003.setOnClickListener(btnListener);
        btn2004.setOnClickListener(btnListener);
        btn2005.setOnClickListener(btnListener);
        btn2006.setOnClickListener(btnListener);
        btn2007.setOnClickListener(btnListener);
        btn2008.setOnClickListener(btnListener);
        btn2009.setOnClickListener(btnListener);
        btn2010.setOnClickListener(btnListener);
        btn2011.setOnClickListener(btnListener);
        btn2012.setOnClickListener(btnListener);
        btn2013.setOnClickListener(btnListener);
        btn2014.setOnClickListener(btnListener);
        btn2015.setOnClickListener(btnListener);
        btn2016.setOnClickListener(btnListener);
        btn2017.setOnClickListener(btnListener);
        btn2018.setOnClickListener(btnListener);
    }
    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.song2001給夢想一雙翅膀:
                    Intent intent =new Intent();
                    intent.setClass(menu20.this,word20.class);
                    intent.putExtra("Number",1);
                    startActivity(intent);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2002新的事將要成就:
                    Intent intent2 =new Intent();
                    intent2.setClass(menu20.this,word20.class);
                    intent2.putExtra("Number",2);
                    startActivity(intent2);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2003新的異象新的方向:
                    Intent intent3 =new Intent();
                    intent3.setClass(menu20.this,word20.class);
                    intent3.putExtra("Number",3);
                    startActivity(intent3);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2004只要有祢在我左右:
                    Intent intent4 =new Intent();
                    intent4.setClass(menu20.this,word20.class);
                    intent4.putExtra("Number",4);
                    startActivity(intent4);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2005我們愛戴的王:
                    Intent intent5 =new Intent();
                    intent5.setClass(menu20.this,word20.class);
                    intent5.putExtra("Number",5);
                    startActivity(intent5);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2006榮耀大君王:
                    Intent intent6 =new Intent();
                    intent6.setClass(menu20.this,word20.class);
                    intent6.putExtra("Number",6);
                    startActivity(intent6);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2007安靜:
                    Intent intent7 =new Intent();
                    intent7.setClass(menu20.this,word20.class);
                    intent7.putExtra("Number",7);
                    startActivity(intent7);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2008奔跑不放棄:
                    Intent intent8 =new Intent();
                    intent8.setClass(menu20.this,word20.class);
                    intent8.putExtra("Number",8);
                    startActivity(intent8);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2009能不能:
                    Intent intent9 =new Intent();
                    intent9.setClass(menu20.this,word20.class);
                    intent9.putExtra("Number",9);
                    startActivity(intent9);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2010醫治我:
                    Intent intent10 =new Intent();
                    intent10.setClass(menu20.this,word20.class);
                    intent10.putExtra("Number",10);
                    startActivity(intent10);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2011找一個地方:
                    Intent intent11 =new Intent();
                    intent11.setClass(menu20.this,word20.class);
                    intent11.putExtra("Number",11);
                    startActivity(intent11);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2012全新的生命:
                    Intent intent12 =new Intent();
                    intent12.setClass(menu20.this,word20.class);
                    intent12.putExtra("Number",12);
                    startActivity(intent12);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2013前來敬拜:
                    Intent intent13 =new Intent();
                    intent13.setClass(menu20.this,word20.class);
                    intent13.putExtra("Number",13);
                    startActivity(intent13);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2014敬拜讓世界震動:
                    Intent intent14 =new Intent();
                    intent14.setClass(menu20.this,word20.class);
                    intent14.putExtra("Number",14);
                    startActivity(intent14);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2015傾倒:
                    Intent intent15 =new Intent();
                    intent15.setClass(menu20.this,word20.class);
                    intent15.putExtra("Number",15);
                    startActivity(intent15);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2016365天:
                    Intent intent16 =new Intent();
                    intent16.setClass(menu20.this,word20.class);
                    intent16.putExtra("Number",16);
                    startActivity(intent16);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2017祢的器皿:
                    Intent intent17 =new Intent();
                    intent17.setClass(menu20.this,word20.class);
                    intent17.putExtra("Number",17);
                    startActivity(intent17);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song2018願祢國度降臨:
                    Intent intent18 =new Intent();
                    intent18.setClass(menu20.this,word20.class);
                    intent18.putExtra("Number",18);
                    startActivity(intent18);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.btnMenu20Previous:
                    finish();
                    break;
            }
        }
    };
}
