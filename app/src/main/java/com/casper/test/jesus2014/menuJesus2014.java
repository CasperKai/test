package com.casper.test.jesus2014;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.casper.test.R;

public class menuJesus2014 extends AppCompatActivity {

    private Button btn01, btn02,btn03,btn04,btn05,btn06,btn07,btn08,btn09,btn10,btn11,btn12;
    private Button _btnBack;
    public static menuJesus2014 instance=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_jesus2014);


        instance=this;

        _btnBack=(Button)findViewById(R.id.btnMenuJesus2014Previous);
        btn01 =(Button)findViewById(R.id.jesus1401堅強的愛);
        btn02 =(Button)findViewById(R.id.jesus1402國度屬於你);
        btn03= (Button)findViewById(R.id.jesus1403你聖名);
        btn04= (Button)findViewById(R.id.jesus1404SpiritBreakOut);
        btn05= (Button)findViewById(R.id.jesus1405用你雙手擁抱我);
        btn06= (Button)findViewById(R.id.jesus1406我要愛慕你);
        btn07= (Button)findViewById(R.id.jesus1407神偉大的舞池);
        btn08= (Button)findViewById(R.id.jesus1408甦醒);
        btn09= (Button)findViewById(R.id.jesus1409耶穌基督);
        btn10= (Button)findViewById(R.id.jesus1410敬拜的心);
        btn11= (Button)findViewById(R.id.jesus1411進城曲);
        btn12= (Button)findViewById(R.id.jesus1412就是現在);

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

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.jesus1401堅強的愛:
                    Intent intent =new Intent();
                    intent.setClass(menuJesus2014.this,wordJesus2014.class);
                    intent.putExtra("Number",1);
                    startActivity(intent);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1402國度屬於你:
                    Intent intent2 =new Intent();
                    intent2.setClass(menuJesus2014.this,wordJesus2014.class);
                    intent2.putExtra("Number",2);
                    startActivity(intent2);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1403你聖名:
                    Intent intent3 =new Intent();
                    intent3.setClass(menuJesus2014.this,wordJesus2014.class);
                    intent3.putExtra("Number",3);
                    startActivity(intent3);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1404SpiritBreakOut:
                    Intent intent4 =new Intent();
                    intent4.setClass(menuJesus2014.this,wordJesus2014.class);
                    intent4.putExtra("Number",4);
                    startActivity(intent4);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1405用你雙手擁抱我:
                    Intent intent5 =new Intent();
                    intent5.setClass(menuJesus2014.this,wordJesus2014.class);
                    intent5.putExtra("Number",5);
                    startActivity(intent5);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1406我要愛慕你:
                    Intent intent6 =new Intent();
                    intent6.setClass(menuJesus2014.this,wordJesus2014.class);
                    intent6.putExtra("Number",6);
                    startActivity(intent6);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1407神偉大的舞池:
                    Intent intent7 =new Intent();
                    intent7.setClass(menuJesus2014.this,wordJesus2014.class);
                    intent7.putExtra("Number",7);
                    startActivity(intent7);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1408甦醒:
                    Intent intent8 =new Intent();
                    intent8.setClass(menuJesus2014.this,wordJesus2014.class);
                    intent8.putExtra("Number",8);
                    startActivity(intent8);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1409耶穌基督:
                    Intent intent9 =new Intent();
                    intent9.setClass(menuJesus2014.this,wordJesus2014.class);
                    intent9.putExtra("Number",9);
                    startActivity(intent9);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1410敬拜的心:
                    Intent intent10 =new Intent();
                    intent10.setClass(menuJesus2014.this,wordJesus2014.class);
                    intent10.putExtra("Number",10);
                    startActivity(intent10);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1411進城曲:
                    Intent intent11 =new Intent();
                    intent11.setClass(menuJesus2014.this,wordJesus2014.class);
                    intent11.putExtra("Number",11);
                    startActivity(intent11);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1412就是現在:
                    Intent intent12 =new Intent();
                    intent12.setClass(menuJesus2014.this,wordJesus2014.class);
                    intent12.putExtra("Number",12);
                    startActivity(intent12);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.btnMenuJesus2014Previous:
                    finish();
                    break;
            }
        }
    };
    
}
