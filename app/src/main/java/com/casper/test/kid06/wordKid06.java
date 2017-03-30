package com.casper.test.kid06;

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

public class wordKid06 extends AppCompatActivity {

    private TextView text;
    private Button _btnPrevious,_btnHome,_btnFamily;
    private ImageView btnImage;
    private int number=0,vWidth=120,vHeight=60;
    private String[] strUrl={"https://www.youtube.com/watch?v=NkT3Gl5w5Es&index=1&list=PLEY_M7xVVeAv_mfMLcQGtUsz1vnPXJ20O","https://www.youtube.com/watch?v=r2foQEjep4Q&list=PLEY_M7xVVeAv_mfMLcQGtUsz1vnPXJ20O&index=2",
                            "https://www.youtube.com/watch?v=NxaKgYq8zHI&index=3&list=PLEY_M7xVVeAv_mfMLcQGtUsz1vnPXJ20O","https://www.youtube.com/watch?v=1bGCbPUgDF0&index=4&list=PLEY_M7xVVeAv_mfMLcQGtUsz1vnPXJ20O",
                            "https://www.youtube.com/watch?v=Pc5Tll93_O4&list=PLEY_M7xVVeAv_mfMLcQGtUsz1vnPXJ20O&index=5","https://www.youtube.com/watch?v=W0fBEy3CmdM&index=6&list=PLEY_M7xVVeAv_mfMLcQGtUsz1vnPXJ20O",
                            "https://www.youtube.com/watch?v=4Of5ajwoCxQ&index=7&list=PLEY_M7xVVeAv_mfMLcQGtUsz1vnPXJ20O","https://www.youtube.com/watch?v=ojl1FeL-gYA&index=8&list=PLEY_M7xVVeAv_mfMLcQGtUsz1vnPXJ20O",
                            "https://www.youtube.com/watch?v=5Cwzjm5jvgk&list=PLEY_M7xVVeAv_mfMLcQGtUsz1vnPXJ20O&index=9","https://www.youtube.com/watch?v=yZxy0brHnWY&index=10&list=PLEY_M7xVVeAv_mfMLcQGtUsz1vnPXJ20O",
                            "https://www.youtube.com/watch?v=egYCVnagI68&index=11&list=PLEY_M7xVVeAv_mfMLcQGtUsz1vnPXJ20O","https://www.youtube.com/watch?v=gjJ40YxGGAo&list=PLEY_M7xVVeAv_mfMLcQGtUsz1vnPXJ20O&index=12"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_kid06);

        text =(TextView)findViewById(R.id.textViewKid06);
        text.setOnTouchListener(new ZoomListenter());

        btnImage =(ImageView) findViewById(R.id.btnWordKid06View);
        btnImage.setImageResource(R.drawable.youtube);
        btnImage.getLayoutParams().width=vWidth;
        btnImage.getLayoutParams().height=vHeight;
        btnImage.setOnClickListener(btnListener);

        _btnPrevious=(Button)findViewById(R.id.btnWordKid06Previous);
        _btnHome=(Button)findViewById(R.id.btnWordKid06Home);
        _btnPrevious.setOnClickListener(btnListener);
        _btnHome.setOnClickListener(btnListener);

        _btnFamily=(Button)findViewById(R.id.btnWordKid06Family);
        _btnFamily.setOnClickListener(btnListener);

        _btnHome.setEnabled(true);
        Intent intent = getIntent();
        number = intent.getIntExtra("Number", 1);
        int ser=intent.getIntExtra("Search",1);
        if(ser==2){
            _btnHome.setEnabled(false);
        }
        if(number==1) {
            text.setText("天父爸爸祢愛我 我要天天讚美祢\n大聲歡呼感謝祢 天天來愛祢\n耶穌是我好朋友 我要天天讚美祢\n困難來了不害怕 天天來愛祢\n\n啦啦啦啦啦啦 啦啦啦 啦啦啦啦啦啦 啦啦啦\n讚美的孩子最喜樂\n啦啦啦啦啦啦 啦啦啦 啦啦啦啦啦啦 啦啦啦\n讚美的孩子最喜樂");
        }
        else if(number==2) {
            text.setText("我有喜樂在我心 我有喜樂在我心\n我有喜樂在我心 主的喜樂無人能奪去\n我有平安在我心 我有平安在我心\n我有平安在我心 主的平安無人能奪去\n\n我要唱新歌 讚美天父 唱新歌 讚美天父\n唱新歌 讚美天父 主的喜樂無人能奪去\n\n我要向前跑 向主奔跑 向前跑 向主奔跑\n向前跑 向主奔跑 在天父裡我已得自由\n\n我要來跳舞 為主跳舞 來跳舞 為主跳舞\n來跳舞 為主跳舞主的喜樂無人能奪去\n\n我要來歡呼 大聲歡呼 來歡呼 大聲歡呼\n來歡呼 大聲歡呼 在天父裡我已得自由");
        }
        else if(number==3) {
            text.setText("保護我的是耶和華\n耶和華在我的右邊蔭庇我\n白天太陽不能傷我\n夜裡月亮也不能害我\n\n祂會保護我 脫離一切災害\n祂會保護我腳步堅定\n祂會保護我 時時刻刻保護我\n我出我入從現在到永遠");
        }
        else if(number==4) {
            text.setText("大聲讚美 熱情地敬拜 高舉雙手 榮耀祢的名\n大聲讚美 熱情地敬拜 祢已成就 一切的大事\n\nNothing is holding us down now\n天父賜自由 就真自由\n向世界宣告 我得自由\n\nI got the joy.I got the freedom.\n對祢的愛 我無法隱藏\n大聲宣告 祢的愛充滿我 oh\n\nI got the joy.I got the freedom\n對祢的愛 我無法隱藏\n大聲宣告 祢已成就大事\n大聲歡呼宣告 高舉雙手宣告");
        }
        else if(number==5) {
            text.setText("哈利路亞 哈利路亞 這裡有榮耀\n哈利路亞 哈利路亞 這裡有醫治湧流\n哈利路亞 哈利路亞 這裡有光明自由\n敬拜聲音如眾水湧流 永活的主祢在這裡\n\n祢是起初的 末後的 昔在今在永在的主\n全心敬拜祢 大聲歡呼 羔羊被高舉\n公義的日頭 如光照耀 萬國讚嘆祢的榮美\n聖潔公義主 明亮晨星 昔在 今在 永在的君王");
        }
        else if(number==6) {
            text.setText("哈利路亞 我們歡呼\n哈利路亞 我們慶賀主祢戰勝黑暗權勢\n哈利路亞 我們歡呼\n哈利路亞 我們慶賀主祢得勝祢已復活\n\n祢要震動天地 祢必震動滄海旱地\n\n因萬國萬邦全都屬於祢\n祢使聖殿充滿榮耀 榮耀大過榮耀\n祢必賜平安 必賜福這地");
        }
        else if(number==7) {
            text.setText("我的詩歌 我的拯救\n祢是我患難中隨時的幫助\n眾山怎樣圍繞耶路撒冷\n祢必圍繞我到永遠\n\n主祢是我力量 主祢是我高臺\n堅固磐石我信靠祢必不動搖\n主祢是我力量 主祢是避難所\n我的盼望只在乎祢");
        }
        else if(number==8) {
            text.setText("以真誠的心 降服在祢面前\n開我心眼使我看見\n以感恩的心 領受生命活水\n從祢而來的溫柔謙卑\n\n何等恩典 祢竟然在乎我\n何等恩典 祢寶血為我流\n何等恩典 祢以尊貴榮耀為我冠冕\n我的嘴 必充滿讚美\n\n祢已挪去 我所有枷鎖\n祢已挪去 我所有重擔\n祢已挪去 我所有傷悲\n祢的名配得所有頌讚");
        }
        else if(number==9) {
            text.setText("耶穌我心渴慕祢\n耶穌我心所愛\n在生命中 祢是唯一\n無人與祢相比\n我願更深愛祢 喔主\n更多愛祢 深深愛祢\n我願更深愛祢 喔主\n唯一的愛 耶穌");
        }
        else if(number==10) {
            text.setText("十字架上的光芒 溫柔又慈祥\n帶著主愛的力量 向著我照亮\n我的心不再隱藏 完全的擺上\n願主愛來澆灌我 在愛中得自由釋放\n\n我願意降服 我願意降服\n在祢愛的懷抱中 我願意降服\n祢是我的主 祢是我的主\n永遠在祢懷抱中 祢是我\n祢是我的主");
        }
        else if(number==11) {
            text.setText("差派獨生子耶穌基督為我捨命\n從此進入永恆愛的約定\n\n我宣告 我宣告 我已得自由\n基督福音是大能\n要賜給我生命\n\n我宣告 我宣告 我已得自由\n基督福音是大能\n要賜給我能力\n\n恩典已經來到 救贖真光已照耀\n我宣告 在基督裡我自由\n\n定罪已過去 控告已過去\n基督的寶血大有能力\n罪已得赦免 舊事已過都變成新\n全新的生命 因耶穌的名");
        }
        else if(number==12) {
            text.setText("我的家要榮耀主 遵守話語為生命\n建立禱告的祭壇 充滿讚美的聲音\n我的家要敬拜主 樂意侍奉耶和華\n活出基督的生命 充滿感恩的聲音\n\n哈利路亞 天天讚美\n主必賜福 必恩寵\n賞賜健康喜樂\n\n哈利路亞 天天得勝\n主必賜福 必保守\n我和我的全家 都要侍奉耶和華");
        }
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btnWordKid06View:
                    Uri uri= Uri.parse(strUrl[number-1]);
                    Intent i=new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(i);
                    break;
                case R.id.btnWordKid06Previous:
                    finish();
                    break;
                case R.id.btnWordKid06Family:
                    Intent family=new Intent();
                    family.setClass(wordKid06.this, FamilyArticle.class);
                    startActivity(family);
                    break;
                case R.id.btnWordKid06Home:
                    finish();
                    menuKid06.instance.finish();
                    break;
            }
        }
    };
}
