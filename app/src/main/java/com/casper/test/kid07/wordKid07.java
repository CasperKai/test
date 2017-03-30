package com.casper.test.kid07;

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

public class wordKid07 extends AppCompatActivity {

    private TextView text;
    private Button _btnPrevious,_btnHome,_btnFamily;
    private ImageView btnImage;
    private int number=0,vWidth=120,vHeight=60;
    private String[] strUrl={"https://www.youtube.com/watch?v=Y-rqm2r3KzU&list=PLEY_M7xVVeAtdcO_b7YlKp5-6XwZY_WEQ","https://www.youtube.com/watch?v=_c6ra9A5Ndo&index=2&list=PLEY_M7xVVeAtdcO_b7YlKp5-6XwZY_WEQ",
                            "https://www.youtube.com/watch?v=nMwvEGcjLB4&list=PLEY_M7xVVeAtdcO_b7YlKp5-6XwZY_WEQ&index=3","https://www.youtube.com/watch?v=GdTZm0qZ3io&index=4&list=PLEY_M7xVVeAtdcO_b7YlKp5-6XwZY_WEQ",
                            "https://www.youtube.com/watch?v=OWLGZ9Q-co8&index=5&list=PLEY_M7xVVeAtdcO_b7YlKp5-6XwZY_WEQ","https://www.youtube.com/watch?v=AxuGP6I2kuM&list=PLEY_M7xVVeAtdcO_b7YlKp5-6XwZY_WEQ&index=6",
                            "https://www.youtube.com/watch?v=PjzutOwFo6s&list=PLEY_M7xVVeAtdcO_b7YlKp5-6XwZY_WEQ&index=7","https://www.youtube.com/watch?v=2tDYjG4e3aA&index=8&list=PLEY_M7xVVeAtdcO_b7YlKp5-6XwZY_WEQ",
                            "https://www.youtube.com/watch?v=rtWUm20DW3M&list=PLEY_M7xVVeAtdcO_b7YlKp5-6XwZY_WEQ&index=9","https://www.youtube.com/watch?v=l-73jMaWwvY&list=PLEY_M7xVVeAtdcO_b7YlKp5-6XwZY_WEQ&index=10",
                            "https://www.youtube.com/watch?v=CGs_awTvu7Y&index=11&list=PLEY_M7xVVeAtdcO_b7YlKp5-6XwZY_WEQ","https://www.youtube.com/watch?v=pLsP6KZKtpQ&index=12&list=PLEY_M7xVVeAtdcO_b7YlKp5-6XwZY_WEQ",
                            "https://www.youtube.com/watch?v=bcW-OUSbQJI&index=13&list=PLEY_M7xVVeAtdcO_b7YlKp5-6XwZY_WEQ"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_kid07);

        text =(TextView)findViewById(R.id.textViewKid07);
        text.setOnTouchListener(new ZoomListenter());

        btnImage =(ImageView) findViewById(R.id.btnWordKid07View);
        btnImage.setImageResource(R.drawable.youtube);
        btnImage.getLayoutParams().width=vWidth;
        btnImage.getLayoutParams().height=vHeight;
        btnImage.setOnClickListener(btnListener);

        _btnPrevious=(Button)findViewById(R.id.btnWordKid07Previous);
        _btnHome=(Button)findViewById(R.id.btnWordKid07Home);
        _btnPrevious.setOnClickListener(btnListener);
        _btnHome.setOnClickListener(btnListener);

        _btnFamily=(Button)findViewById(R.id.btnWordKid07Family);
        _btnFamily.setOnClickListener(btnListener);

        _btnHome.setEnabled(true);
        Intent intent = getIntent();
        number = intent.getIntExtra("Number", 1);
        int ser=intent.getIntExtra("Search",1);
        if(ser==2){
            _btnHome.setEnabled(false);
        }
        if(number==1) {
            text.setText("紅橙黃綠藍靛紫\n是祢微笑的樣子\n\n告訴我 祢是愛\n愛的約定不更改\n\n一二三四五六七\n謝謝天父的應許\n\n告訴我 祢同在\n恩典隨著我\n\n彩虹 彩虹 彎彎彩虹告訴我\n天父爸爸就是愛 祢用笑臉幫助我\n\n彩虹 彩虹 彎彎彩虹告訴我\n祢永遠保護我 以愛環繞我");
        }
        else if(number==2) {
            text.setText("他們從不擔心或憂慮\n好溫暖的太陽升起\n天空落下的小小雨滴\n豐豐富富什麼都不缺\n\n感謝神 賜給我衣服\n感謝神 桌上還有食物\n明天憂慮交給我天父\n感謝神 光照亮我家\n感謝神 我們彼此相愛\n當喜樂因我擁有一切\n\nDon't Worry 天父祂好愛你\n天父祂愛你超過一切想像\nDon't Worry 天父祂好愛你\n天父祂看顧你\n這一生都與你同行");
        }
        else if(number==3) {
            text.setText("耶穌是我的好朋友\n好朋友花時間在一起\n好朋友一同彼此聆聽\n耶穌是我的好朋友\n\n耶穌是我的好朋友\n好朋友一定幫助我\n好朋友一同笑哈哈\n耶穌是我的好朋友\n\n耶穌是好朋友 我相信祢的應許\n為了我 祢捨命\n做我的朋友");
        }
        else if(number==4) {
            text.setText("我要靠主得勝 靠主得勝\n靠主得勝 哈利路亞\n每個應許都是 Yes Amen\n有主我必得勝\n\n我要常常喜樂 常常喜樂\n常常喜樂 哈利路亞\n喜樂油在我心 哈哈哈哈\n煩惱都不見了\n\n今天是主所定日子 我在其中必歡喜\n早晨起來大聲歡呼Woo Yeah\nYes Amen Yes Amen\n有主我必得勝\n\n今天是主所定日子 我在其中必歡喜\n早晨起來大聲歡呼Woo Yeah\n喜樂油在我心 哈哈哈哈哈哈哈\n煩惱都不見了");
        }
        else if(number==5) {
            text.setText("我有一位愛我的天父\n他造我就是為了愛我\n不論高矮或胖瘦\n未來成就是如何\n他仍然比任何人都愛我\n\n祂永遠不離開我\n祂永遠不放棄我\n祂因我歡欣快樂\n祂永遠不停止愛我\n\n祢永遠不離開我\n祢永遠不放棄我\n祢因我歡欣快樂\n祢永遠不停止愛我");
        }
        else if(number==6) {
            text.setText("在祢寶座前 有一道生命水流\n我們進前來 謙卑等候領受\n在祢同在中 有滿足的喜樂\n聖靈請祢來 自由運行這地\n\n聖靈的江河流啊流 自由湧流在這地\n在我的裡面 生命活水不停息\n聖靈的江河 自由湧流到無盡\n我們歡迎祢 聖靈我們愛祢");
        }
        else if(number==7) {
            text.setText("早晨起來抓住神的應許\n用祢話語來宣告 我的生命完全屬於祢\n這是耶和華所定的日子 喜樂充滿在我心\n祢行大事在生命裡\n\n喔 喔 今天是個新的一天\n我要站起來 我要高聲唱\n宣告天地父母是我君王\n勇敢地 去面對 喜樂地 去相信\n享受在祢恩典的每一分鐘\n\n今天的我要更多愛祢\n憑著祢豐盛慈愛應許\n眼光專注永恆國度\n用心聆聽聖靈的聲音\n\n今天的我要抵擋仇敵\n主祢已使我得勝有餘\n穿上祢所賜的軍裝\n靠著主的大能大力 剛強站立");
        }
        else if(number==8) {
            text.setText("開我的眼睛 讓我看到天使天軍\n仇敵的攻擊 我要更堅定信靠祢\n祢是我力量 祢是我永遠的拯救\n祢的右手施展能力 顯出榮耀\n\n只要有祢在我左右 我必不懼怕\n靠著祢的聖靈 祢的應許 永遠不放棄\n只要有祢在我左右 我必不懼怕\n神啊 誰能像祢 至聖至榮\n可頌可畏 施行奇事");
        }
        else if(number==9) {
            text.setText("祢是做新事的神\n我要向祢唱新歌\n恩典憐憫每天都是新的\n新酒新皮袋每天都要賜下\n\n新的事 新的事將要成就\n新的恩膏 新的恩寵\n我們要 我們要唱新歌\n稱讚我們神為高\n\n新的事 新的事將要成就\n新的恩典 新的盼望\n我們要 我們要唱新歌\n充滿神的榮耀");
        }
        else if(number==10) {
            text.setText("祢開了我的耳我的眼\n我的嘴將稱頌祢到永遠\n祢的意念高過我的思念\n如同天高過地\n\n全地都要來讚美祢\n我跪拜祢面前稱頌祢\n山雖動搖 地雖改變\n我對祢的愛永不變");
        }
        else if(number==11) {
            text.setText("宇宙的中心 天父\n世界的中心 天父\n萬物都本於祢 屬於祢 歸與祢\n祢是榮耀君王\n\n我們歡迎 君王降臨\n渴望看見 祢的彰顯\n呼求祢來翻轉 震動這土地\n復興我們聖潔的熱情\n\n我們歡迎 君王降臨\n同心高舉 祢聖潔的名\n呼求天窗打開 春雨不停息\n我們呼喊歡迎君王降臨\n\n大大張口 大大充滿\n恩膏如雨 澆灌這地\n眼未看見 耳未聽見\n渴慕更多看見祢的榮面");
        }
        else if(number==12) {
            text.setText("將自己獻上當作活祭\n作主聖潔貴重的器皿\n祢豐富恩惠必充足澆灌我\n使我瓦器裡充滿莫大能力\n\n高舉雙手讚美祢我主\n全心全人都給祢耶穌\n一生意義 活出榮耀的呼召\n勇敢地向著標竿直跑\n\n跟隨耶穌 愛我的主\n我愛祢 耶穌\n跟隨耶穌 愛我的主\n我愛祢 耶穌");
        }
        else if(number==13) {
            text.setText("主告訴我 如何獻上我的生命\n帶希望入人群中\n主告訴我 如何付出我的關懷\n將溫暖帶入世界\n\n我看到靈魂中的憂傷\n孤獨中人的心在角落顫抖\n差遣我 差遣我 我願付出我所有\n差遣我 到需要祢的人群中\n充滿我 充滿我 用祢愛來充滿我\n再一次 緊握他們的手");
        }
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btnWordKid07View:
                    Uri uri= Uri.parse(strUrl[number-1]);
                    Intent i=new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(i);
                    break;
                case R.id.btnWordKid07Previous:
                    finish();
                    break;
                case R.id.btnWordKid07Family:
                    Intent family=new Intent();
                    family.setClass(wordKid07.this, FamilyArticle.class);
                    startActivity(family);
                    break;
                case R.id.btnWordKid07Home:
                    finish();
                    menuKid07.instance.finish();
                    break;
            }
        }
    };

}
