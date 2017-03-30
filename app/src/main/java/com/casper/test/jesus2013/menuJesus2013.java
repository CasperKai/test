package com.casper.test.jesus2013;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.casper.test.R;

public class menuJesus2013 extends AppCompatActivity {

    private Button btn01, btn02,btn03,btn04,btn05,btn06,btn07,btn08,btn09,btn10,btn11,btn12,btn13;
    private Button _btnBack;
    public static menuJesus2013 instance=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_jesus2013);

        instance=this;

        _btnBack=(Button)findViewById(R.id.btnMenuJesus2013Previous);
        btn01 =(Button)findViewById(R.id.jesus1301我自由);
        btn02 =(Button)findViewById(R.id.jesus1302再做一次);
        btn03= (Button)findViewById(R.id.jesus1303打開天門);
        btn04= (Button)findViewById(R.id.jesus1304你愛不變);
        btn05= (Button)findViewById(R.id.jesus1305天堂的歌);
        btn06= (Button)findViewById(R.id.jesus1306你同在如天堂降臨);
        btn07= (Button)findViewById(R.id.jesus1307更靠近);
        btn08= (Button)findViewById(R.id.jesus1308超自然能力);
        btn09= (Button)findViewById(R.id.jesus1309亞洲為耶穌);
        btn10= (Button)findViewById(R.id.jesus1310天父的愛);
        btn11= (Button)findViewById(R.id.jesus1311你是配得);
        btn12= (Button)findViewById(R.id.jesus1312我聽見主走過來);
        btn13= (Button)findViewById(R.id.jesus1313幾千公里);
        
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
        btn13.setOnClickListener(btnListener);
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.jesus1301我自由:
                    Intent intent =new Intent();
                    intent.setClass(menuJesus2013.this,wordJesus2013.class);
                    intent.putExtra("Number",1);
                    startActivity(intent);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1302再做一次:
                    Intent intent2 =new Intent();
                    intent2.setClass(menuJesus2013.this,wordJesus2013.class);
                    intent2.putExtra("Number",2);
                    startActivity(intent2);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1303打開天門:
                    Intent intent3 =new Intent();
                    intent3.setClass(menuJesus2013.this,wordJesus2013.class);
                    intent3.putExtra("Number",3);
                    startActivity(intent3);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1304你愛不變:
                    Intent intent4 =new Intent();
                    intent4.setClass(menuJesus2013.this,wordJesus2013.class);
                    intent4.putExtra("Number",4);
                    startActivity(intent4);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1305天堂的歌:
                    Intent intent5 =new Intent();
                    intent5.setClass(menuJesus2013.this,wordJesus2013.class);
                    intent5.putExtra("Number",5);
                    startActivity(intent5);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1306你同在如天堂降臨:
                    Intent intent6 =new Intent();
                    intent6.setClass(menuJesus2013.this,wordJesus2013.class);
                    intent6.putExtra("Number",6);
                    startActivity(intent6);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1307更靠近:
                    Intent intent7 =new Intent();
                    intent7.setClass(menuJesus2013.this,wordJesus2013.class);
                    intent7.putExtra("Number",7);
                    startActivity(intent7);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1308超自然能力:
                    Intent intent8 =new Intent();
                    intent8.setClass(menuJesus2013.this,wordJesus2013.class);
                    intent8.putExtra("Number",8);
                    startActivity(intent8);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1309亞洲為耶穌:
                    Intent intent9 =new Intent();
                    intent9.setClass(menuJesus2013.this,wordJesus2013.class);
                    intent9.putExtra("Number",9);
                    startActivity(intent9);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1310天父的愛:
                    Intent intent10 =new Intent();
                    intent10.setClass(menuJesus2013.this,wordJesus2013.class);
                    intent10.putExtra("Number",10);
                    startActivity(intent10);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1311你是配得:
                    Intent intent11 =new Intent();
                    intent11.setClass(menuJesus2013.this,wordJesus2013.class);
                    intent11.putExtra("Number",11);
                    startActivity(intent11);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1312我聽見主走過來:
                    Intent intent12 =new Intent();
                    intent12.setClass(menuJesus2013.this,wordJesus2013.class);
                    intent12.putExtra("Number",12);
                    startActivity(intent12);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.jesus1313幾千公里:
                    Intent intent13 =new Intent();
                    intent13.setClass(menuJesus2013.this,wordJesus2013.class);
                    intent13.putExtra("Number",13);
                    startActivity(intent13);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.btnMenuJesus2013Previous:
                    finish();
                    break;
            }
        }
    };
    
}
