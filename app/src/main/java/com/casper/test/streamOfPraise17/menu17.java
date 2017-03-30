package com.casper.test.streamOfPraise17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.casper.test.R;

public class menu17 extends AppCompatActivity {

    private Button btn1701, btn1702,btn1703,btn1704,btn1705,btn1706,btn1707,btn1708,btn1709,btn1710,btn1711,btn1712,btn1713,btn1714;
    private Button _btnBack;
    public static menu17 instance=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu17);

        instance=this;

        _btnBack=(Button)findViewById(R.id.btnMenu17Previous);
        btn1701 =(Button)findViewById(R.id.song1701將天敞開);
        btn1702 =(Button)findViewById(R.id.song1702日日夜夜);
        btn1703= (Button)findViewById(R.id.song1703配得頌揚);
        btn1704= (Button)findViewById(R.id.song1704活著為要敬拜祢);
        btn1705= (Button)findViewById(R.id.song1705新耶路撒冷);
        btn1706= (Button)findViewById(R.id.song1706一同起舞);
        btn1707= (Button)findViewById(R.id.song1707十架的愛);
        btn1708= (Button)findViewById(R.id.song1708救贖的恩典);
        btn1709= (Button)findViewById(R.id.song1709為耶路撒冷祈禱);
        btn1710= (Button)findViewById(R.id.song1710我要順服);
        btn1711= (Button)findViewById(R.id.song1711自由地歌唱);
        btn1712= (Button)findViewById(R.id.song1712就是這個時刻);
        btn1713= (Button)findViewById(R.id.song1713我已得自由);
        btn1714= (Button)findViewById(R.id.song1714同心高舉十架);


        _btnBack.setOnClickListener(btnListener);
        btn1701.setOnClickListener(btnListener);
        btn1702.setOnClickListener(btnListener);
        btn1703.setOnClickListener(btnListener);
        btn1704.setOnClickListener(btnListener);
        btn1705.setOnClickListener(btnListener);
        btn1706.setOnClickListener(btnListener);
        btn1707.setOnClickListener(btnListener);
        btn1708.setOnClickListener(btnListener);
        btn1709.setOnClickListener(btnListener);
        btn1710.setOnClickListener(btnListener);
        btn1711.setOnClickListener(btnListener);
        btn1712.setOnClickListener(btnListener);
        btn1713.setOnClickListener(btnListener);
        btn1714.setOnClickListener(btnListener);
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.song1701將天敞開:
                    Intent intent =new Intent();
                    intent.setClass(menu17.this,word17.class);
                    intent.putExtra("Number",1);
                    startActivity(intent);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1702日日夜夜:
                    Intent intent2 =new Intent();
                    intent2.setClass(menu17.this,word17.class);
                    intent2.putExtra("Number",2);
                    startActivity(intent2);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1703配得頌揚:
                    Intent intent3 =new Intent();
                    intent3.setClass(menu17.this,word17.class);
                    intent3.putExtra("Number",3);
                    startActivity(intent3);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1704活著為要敬拜祢:
                    Intent intent4 =new Intent();
                    intent4.setClass(menu17.this,word17.class);
                    intent4.putExtra("Number",4);
                    startActivity(intent4);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1705新耶路撒冷:
                    Intent intent5 =new Intent();
                    intent5.setClass(menu17.this,word17.class);
                    intent5.putExtra("Number",5);
                    startActivity(intent5);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1706一同起舞:
                    Intent intent6 =new Intent();
                    intent6.setClass(menu17.this,word17.class);
                    intent6.putExtra("Number",6);
                    startActivity(intent6);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1707十架的愛:
                    Intent intent7 =new Intent();
                    intent7.setClass(menu17.this,word17.class);
                    intent7.putExtra("Number",7);
                    startActivity(intent7);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1708救贖的恩典:
                    Intent intent8 =new Intent();
                    intent8.setClass(menu17.this,word17.class);
                    intent8.putExtra("Number",8);
                    startActivity(intent8);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1709為耶路撒冷祈禱:
                    Intent intent9 =new Intent();
                    intent9.setClass(menu17.this,word17.class);
                    intent9.putExtra("Number",9);
                    startActivity(intent9);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1710我要順服:
                    Intent intent10 =new Intent();
                    intent10.setClass(menu17.this,word17.class);
                    intent10.putExtra("Number",10);
                    startActivity(intent10);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1711自由地歌唱:
                    Intent intent11 =new Intent();
                    intent11.setClass(menu17.this,word17.class);
                    intent11.putExtra("Number",11);
                    startActivity(intent11);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1712就是這個時刻:
                    Intent intent12 =new Intent();
                    intent12.setClass(menu17.this,word17.class);
                    intent12.putExtra("Number",12);
                    startActivity(intent12);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1713我已得自由:
                    Intent intent13 =new Intent();
                    intent13.setClass(menu17.this,word17.class);
                    intent13.putExtra("Number",13);
                    startActivity(intent13);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.song1714同心高舉十架:
                    Intent intent14 =new Intent();
                    intent14.setClass(menu17.this,word17.class);
                    intent14.putExtra("Number",14);
                    startActivity(intent14);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.btnMenu17Previous:
                    finish();
                    break;
            }
        }
    };

}
