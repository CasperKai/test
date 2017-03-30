package com.casper.test.kid04;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.casper.test.FamilyArticle;
import com.casper.test.R;
import com.casper.test.ZoomListenter;

public class wordKid04 extends AppCompatActivity {

    private TextView text;
    private Button _btnPrevious,_btnHome,_btnFamily;
    private ImageView btnImage;
    private int number=0,vWidth=120,vHeight=60;
    private String[] strUrl={"https://www.youtube.com/watch?v=kY8kf55dY4A&list=PLEY_M7xVVeAsALusHdc_dD3joKgT9DPoO","https://www.youtube.com/watch?v=-2vXU9SzhrA&index=2&list=PLEY_M7xVVeAsALusHdc_dD3joKgT9DPoO",
                            "https://www.youtube.com/watch?v=z20HqCe2iMk&list=PLEY_M7xVVeAsALusHdc_dD3joKgT9DPoO&index=3","https://www.youtube.com/watch?v=kzSxscrubgU&list=PLEY_M7xVVeAsALusHdc_dD3joKgT9DPoO&index=4",
                            "https://www.youtube.com/watch?v=LQljulrZp00&index=5&list=PLEY_M7xVVeAsALusHdc_dD3joKgT9DPoO","https://www.youtube.com/watch?v=EFPSI9rrR7A&index=6&list=PLEY_M7xVVeAsALusHdc_dD3joKgT9DPoO",
                            "https://www.youtube.com/watch?v=rFydOaBd304&list=PLEY_M7xVVeAsALusHdc_dD3joKgT9DPoO&index=7","https://www.youtube.com/watch?v=Ay1Yj84-hhU&list=PLEY_M7xVVeAsALusHdc_dD3joKgT9DPoO&index=8",
                            "https://www.youtube.com/watch?v=9SPKO3OCMpU&index=9&list=PLEY_M7xVVeAsALusHdc_dD3joKgT9DPoO","https://www.youtube.com/watch?v=kJi8K0kPEF0&list=PLEY_M7xVVeAsALusHdc_dD3joKgT9DPoO&index=10",
                            "https://www.youtube.com/watch?v=2A751qHmNak&index=11&list=PLEY_M7xVVeAsALusHdc_dD3joKgT9DPoO"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_kid04);

        text =(TextView)findViewById(R.id.textViewKid04);
        text.setOnTouchListener(new ZoomListenter());

        btnImage =(ImageView) findViewById(R.id.btnWordKid04View);
        btnImage.setImageResource(R.drawable.youtube);
        btnImage.getLayoutParams().width=vWidth;
        btnImage.getLayoutParams().height=vHeight;
        btnImage.setOnClickListener(btnListener);

        _btnPrevious=(Button)findViewById(R.id.btnWordKid04Previous);
        _btnHome=(Button)findViewById(R.id.btnWordKid04Home);
        _btnPrevious.setOnClickListener(btnListener);
        _btnHome.setOnClickListener(btnListener);

        _btnFamily=(Button)findViewById(R.id.btnWordKid04Family);
        _btnFamily.setOnClickListener(btnListener);

        _btnHome.setEnabled(true);
        Intent intent = getIntent();
        number = intent.getIntExtra("Number", 1);
        int ser=intent.getIntExtra("Search",1);
        if(ser==2){
            _btnHome.setEnabled(false);
        }
        if(number==1){
            text.setText("啦啦啦啦 啦啦啦啦 啦啦啦啦 啦啦啦啦\n\n走過傷心 走過淚水\n讓每一顆心 再次飛起來\n用你的心 伸出你手\n讓每個靈魂 再次活過來\n\n讓愛走動 讓你的愛化成希望的種子\n隨風揚起 編織美麗的夢\n讓愛走動 讓你的愛化成溫暖的擁抱\n綻放陽光 編織神所造的夢");
        }
        else if(number==2){
            text.setText("有人靠車 有人靠馬\n我卻依靠耶和華神的名\n有人靠車 有人靠馬\n我卻宣告耶和華神的名\n\n哈利路亞 哈利路亞\n在天父裡得勝又得勝\n哈利路亞 哈利路亞\n披上讚美衣歡呼喜樂\n\n投靠祢名 何等有福\n祢的恩惠如盾牌護衛\n投靠祢名 何等有福\n信靠祢的必不至羞愧");
        }
        else if(number==3){
            text.setText("你的眼是否被太多美麗的事物迷惑\n你的心是否被太多紛雜的世俗綁鎖\n分些關懷 給角落中受傷的靈魂\n分些愛給那些 不起眼的面孔\n\n以天父的心為心 以祂的眼看世界\n你身邊的人需要你我把冷漠變成愛\n以天父的心為心 以祂的眼看世界\n這世界需要你我把冷漠變成愛");
        }
        else if(number==4){
            text.setText("當我抬起頭觀看天空\n看見神的大榮耀\n當我睜開眼 眾星辰在天\n看見神的大作為\n\n在每一天 齊歌頌神美好\n在每一夜 彰顯神的大智慧\n\n多麼奇妙 多麼美好 祢手所造\n萬物都看見 祢造這美麗的世界\n多麼奇妙 多麼美好 祢手所造\n我與眾天使 一齊來讚美祢的名\n萬物歌頌祢奇妙大尊榮\n萬民都要看見祢大作為\n讚美的聲音響徹在這全地");
        }
        else if(number==5){
            text.setText("寒冷黑夜已過去\n今天太陽依然昇起\n不安的情緒要完全被挪去\n用微笑擁抱這新的一天\n雖然不知前方路\n抬起頭我迎向陽光\n滿懷著盼望 翻越過這山嶺\n有人在等我 祂永遠愛我\n\n雖然看不到 但是我相信\n我有滿滿的愛環繞我\n不再難過失望 勇敢踏出步伐\n迎向新的這一天 喔\n\n天地將會成過去\n有一應許永不改變\n\n滿懷著盼望 牽起手一同行\n有人在等你 祂永遠愛祢");
        }
        else if(number==6){
            text.setText("我的神 我要永遠在祢的懷裡\n愛慕祢 屈膝在祢面前單單敬拜祢\n我渴慕祢 我敬拜祢\n我的主 我深愛的唯一\n天父 哦天父\n我靈最深渴慕\n天父 哦天父\n祢醫治我心深處");
        }
        else if(number==7){
            text.setText("凡勞苦重擔 當親近耶穌\n必享安息 必得滿足\n凡飢渴慕義 來尋求耶穌\n必享甘泉 必得飽足\n\n注目看耶穌 定晴看耶穌\n聖潔公義主 十架上耶穌\n注目看耶穌 定晴看耶穌\n謙卑親近主 跟著祂同步\n跟著祂同步");
        }
        else if(number==8){
            text.setText("我生命中最渴望的一件事\n切慕祢單單尋求祢\n用我全心全意 用我全力愛祢\n敬拜祢讓祢榮耀充滿全地\n\n深深愛祢 天父 深深愛祢 天父\n我愛祢超越生命中一切\n深深愛祢 天父 深深愛祢 天父\n哦我愛祢 天父");
        }
        else if(number==9){
            text.setText("我可以擁有全世界 卻沒有愛\n我可以明白所有事 卻還是空白\n我可以用信心移山 卻還是孤單\n這世界沒有了愛 一切仍是黑白\n\n不要埋藏在心裡 把愛說出來\n不要默默在一旁 把愛活出來\n\n喔愛 可以再更多一點點\n不怕被傷害 把靈魂鎖起來\n\n愛 可以再更多一點點\n從天父來的愛 把懼怕挪開\n發現幸福在轉角與你相遇\n一瞬間 這世界變得好美");
        }
        else if(number==10){
            text.setText("既然有這麼多的見證人\n像雲彩圍繞著我們\n就應該放下各樣重擔\n脫下纏累我們的罪\n\n既然有這麼多的見證人\n像雲彩圍繞著我們\n以堅忍的心向前奔跑\n那擺在我們前面的路程\n\n讓我們專心 專心仰望天父\n那信心的創始完成者\n以合一的心並存忍耐\n奔跑我們前面的路程\n\n讓我們專心 專心依靠天父\n曠野中的安慰引領者\n以喜樂的心並存盼望\n奔跑我們前面的路程");
        }
        else if(number==11){
            text.setText("將天敞開　祢的榮耀降下來\n將天敞開　祢的同在降下來\n將天敞開　祢的榮耀降下來 \n萬國讚嘆祢　祢是榮耀君王\n\n天上地下　合一敬拜\n歡呼耶穌基督 \n聖潔羔羊　榮耀歸於祢 \n天上地下　在永恆裡敬拜 \n哈利路亞　哈利路亞\n\n神就在這裡　我們歡迎祢\n讓一切焦點轉向祢\n神就在這裡　我們歡迎祢\n寶座前敬拜不停息");
        }
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btnWordKid04View:
                    Uri uri= Uri.parse(strUrl[number-1]);
                    Intent i=new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(i);
                    break;
                case R.id.btnWordKid04Previous:
                    finish();
                    break;
                case R.id.btnWordKid04Family:
                    Intent family=new Intent();
                    family.setClass(wordKid04.this, FamilyArticle.class);
                    startActivity(family);
                    break;
                case R.id.btnWordKid04Home:
                    finish();
                    menuKid04.instance.finish();
                    break;
            }
        }
    };

}
