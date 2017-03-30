package com.casper.test.jesus2013;

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

public class wordJesus2013 extends AppCompatActivity {
    private TextView text2013;
    private Button _btnPrevious,_btnHome,_btnFamily;
    private ImageView btnWord2013Image;
    private int number=0,vWidth=120,vHeight=60;
    private String[] strUrl={"https://www.youtube.com/watch?v=SQmec3_RtzI","https://www.youtube.com/watch?v=brYruwOfwDo",
                            "https://www.youtube.com/watch?v=FS6LiNSFfpE","https://www.youtube.com/watch?v=Pin90DY2g0w",
                            "https://www.youtube.com/watch?v=S_vmBxffjR4","https://www.youtube.com/watch?v=2Cc_QbR5Utw",
                            "https://www.youtube.com/watch?v=V1rzO8kGGjU","https://www.google.com",
                            "https://www.youtube.com/watch?v=PbfM1C4V-1g","https://www.youtube.com/watch?v=drbvaVjOZYs",
                            "https://www.youtube.com/watch?v=MXmilJSrZOw","https://www.youtube.com/watch?v=VcYqOskDMOo",
                            "https://www.youtube.com/watch?v=GRWzOxmrFsI"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_jesus2013);

        text2013 =(TextView)findViewById(R.id.textView2013);
        text2013.setOnTouchListener(new ZoomListenter());

        _btnPrevious=(Button)findViewById(R.id.btnJesus2013Previous);
        _btnHome=(Button)findViewById(R.id.btnJesus2013Home);
        btnWord2013Image =(ImageView) findViewById(R.id.btnWord2013View);
        btnWord2013Image.setImageResource(R.drawable.youtube);
        btnWord2013Image.getLayoutParams().width=vWidth;
        btnWord2013Image.getLayoutParams().height=vHeight;
        btnWord2013Image.setOnClickListener(btnListener);
        _btnPrevious.setOnClickListener(btnListener);
        _btnHome.setOnClickListener(btnListener);

        _btnFamily=(Button)findViewById(R.id.btnJesus2013Family);
        _btnFamily.setOnClickListener(btnListener);

        _btnHome.setEnabled(true);
        Intent intent = getIntent();
        number = intent.getIntExtra("Number", 1);
        int ser=intent.getIntExtra("Search",1);
        if(ser==2){
            _btnHome.setEnabled(false);
        }

        if(number==1){
            text2013.setText("因你瞎眼看見 因你啞巴歌唱\n因你死人復活 因你萬民頌讚\n因你黑暗遁逃 我全心呼喊\n我自由 (我自由)\n\n我自由奔跑 (我自由奔跑)\n我自由跳舞 (我自由跳舞)\n我自由為你而活 (我自由為你而活)\n我自由 (我自由) 我自由 (我自由)\n\n因你國度降臨 因你得勝有餘\n因你不再懼怕 因你付上代價\n因你永遠掌權 你使我全心歌唱\n我自由\n\n我跳舞鎖鏈就鬆開 (x2)\nWe’ll Dance Dance Dance (x2) \n鎖鏈就鬆開 (鎖鏈就鬆開)");
        }
        else if(number==2){
            text2013.setText("你成就萬事 \n被擄得釋放 疾病得醫治\n你成就萬事 \n破碎被恢復 瞎眼得看見\n\n群山都震動在你寶座前\n全地都慶賀你的榮耀彰顯\n\n再做一次 再做一次 \n超過我所想所求\n再做一次 再做一次\n我相信還有更多\n再做一次\n\n再做一次 再做一次\n耶穌 Whoa");
        }
        else if(number==3){
            text2013.setText("你是無父者的天父 無依靠的堅固磐石\n在你裡面不會震動 你知道我們的光景\n你使這地轉化更新 你是盼望永不止息\n\n主你愛超乎世上的一切 無人能與你相比\n\nOpen The Sky 你天堂降臨\n復興的火點燃在全地\n鎖鏈斷開你釋放我心\n掌權在我的生命(充滿我的靈)\n\n你是無家者的居所 無防衛的堅固盾牌\n你是我的山寨高臺 你看透我心的深處\n所有破碎被你恢復 一切都更新到起初\n\nOpen The Sky 澆灌你憐憫\n從罪惡中拯救我生命\n驚嘆站立在你榮耀裡\n掌權在我的生命(充滿我的靈)");
        }
        else if(number==4){
            text2013.setText("超過我所面對的高山 勝過死亡陰間的挑戰\n跨過所有變動和艱難 你愛不變 存到永遠\n\n你愛不失敗 永不放棄 永遠不會離開\n\n你的愛一直都在追趕著我\n滲透我靈魂超過所想所求\n我永遠不再害怕孤單承受\n你愛不變 存到永遠\n\n或生或死\n我深知我都隱藏在你愛的大能中 \n我得赦免\n再沒有任何事能讓我與你愛隔絕");
        }
        else if(number==5){
            text2013.setText("What does it sound like\nWhen you sing heaven’s song\n當唱天堂的歌 聽來會是怎樣 \nWhat does it feel like\nWhen heaven comes down\n當天堂降下 感覺會是怎樣\nWhat does it look like\nWhen God is all around \n當神四面環繞 看來會是怎樣\nLet it come\n降下來\n\nThis is what it sounds like \nWhen you sing heaven’s song\n當唱天堂的歌 聽來就是這樣 \nThis is what it feel like\nWhen heaven comes down\n當天堂降下 感覺就是這樣 \nThis is what it looks like\nWhen God is all around \n當神四面環繞 看來就是這樣 \nLet it come\n降下來");
        }
        else if(number==6){
            text2013.setText("這世上有誰能夠像你\n你的愛與榮美無止盡\n世上無一事物能相比\n唯有耶穌你能滿足我心\n\n你同在如天堂降臨\n你同在如天堂降臨\n\n主你是我生命的至寶\n我軟弱時你充滿憐憫\n從一切錯誤當中拯救我\n賜給我未來的新生命\n\n你同在如天堂降臨\n你同在如天堂降臨\n如天堂降臨\n\n喔耶穌 喔耶穌\n你同在如天堂降臨\n\n我願用一生年日等待\n直到那日與你面對面\n世上無一事物能相比\n唯有耶穌你能\n滿足我心");
        }
        else if(number==7){
            text2013.setText("你愛已佔據我心 \n完全屬於你 完全屬於你\n主我只想要與你\n永遠在一起 永遠在一起\n\n讓我更靠近你 更深的經歷你\n我要觸摸你心 我要更多有你\n你愛是何等甘甜 超過所有一切\n我要觸摸你心 我要更多有你\n\nWhoa你愛是何等偉大\nWhoa你是何等愛我");
        }
        else if(number==8){
            text2013.setText("我們 是被呼召來改變世界\nHey you 別再沉睡要及早醒起\n今天 聖靈要澆灌凡有血氣\n不靠才能 而是聖靈\n\n我要醫治一切凡有疾病的\n我要宣告受壓制的得自由\n我要釋放屬天超自然能力\n若上帝幫助我 就沒有人能抵擋我 oh oh\n\n我們 要宣告神的國度降臨\nHey you 準備好就要大步前進\n今天 聖靈要澆灌凡有血氣\n不靠才能 而是聖靈\n\n因你我不再懷疑\n有信心就跨出去");
        }
        else if(number==9){
            text2013.setText("這世代正需要更新思想到來\n這世代正需要神百姓站出來\n這世代正需要天國復興的到來\n這世代正需要生命榮耀重返\n\n興起禱告的烈火 建立敬拜的祭壇\n進入神呼召道路 迎接耶穌再來\n\nAsia For JESUS\n要建立大能的教會\nAsia For JESUS\n是完成使命的大軍隊\nAsia For JESUS\n宣告神掌管了一切\n我們要一起走到世界的終點\n\n(RAP)\nAiyo 這是Asia for JESUS\n我們像戰士努力著\n站在堅固的磐石上\nWe do it like JESUS, do it like JESUS\n了解天父的心大使命\n不管困難逼迫我們走到地極去\n這福音是神的大能\n要救一切相信的百姓\nUh這是rock and rap\n聽我發聲 順服權柄兩代結合這才大聲\n打開天堂大門看見愛和希望就在我們周圍發生\nchyeah 這是關鍵的豐收時刻\n成為天國使者絕對值得\n跟隨約書亞let the King Jehovah\n帶領他的軍隊進入Asia\n\nWe are we are the army of God\n燃燒燃燒來得著這地");
        }
        else if(number==10){
            text2013.setText("再沒有更大的愛 我要敬拜\n你彰顯極深的恩典 我要敬拜\n\n我活著要一生宣揚\n\n找到愛 在我救主的懷中\n有盼望 死亡已被打敗\n任何事 都不能讓我與你隔絕\n天父的愛\n\n再沒有 任何事能讓我與天父的愛隔絕 \n(不能讓我與天父的愛隔絕)\n\n享受我們的讚美 我要敬拜\n來宣告你名和生命 我要敬拜\n\n天國在見證 不變的真理\n我知我是誰 我屬於你\n我心得醫治 眼睛被開啟\n我知我是誰 我屬於你 (我屬於你)");
        }
        else if(number==11){
            text2013.setText("我的主我來到你面前將一切獻上\n世界上所有的讚美我都願意放下\n因為我需要的就只有你我主我王\n唯有你是尊貴聖潔的全能真神\n\n你是配得 你是配得\n你配得所有讚美\n你是配得 你是配得\n你配得所有敬拜\n\n你應許你必定會靠近只要呼求你\n你的手所做的一切事都如此神奇\n在這個世界上沒有人能與你相比\n我高舉我雙手稱頌我主你聖名");
        }
        else if(number==12){
            text2013.setText("I hear the Lord passing by\nThis could be my day of visitation\nHave mercy on me Lord\nHear my cry of desperation\nI hear the Lord passing by\n\n我聽見主走過來\n今天會是他造訪的日子\n主啊 求你憐憫我\n聽見我 迫切的呼求\n我聽見主走過來\n\n我靈魂體 深深渴慕你\n一生年日 讓我能看見 \n你的榮耀降臨\n\n我期待的時刻 我唯一的機會\n我願意放下我一切 只要飛奔到你身邊\n我期待的時刻 我唯一的機會\n我要看見你 我要觸摸你\n我要抓緊你 更多認識你\n主我要跟隨你 主我要跟隨你\n我盼望都在於你 我需要都在於你\n你是我的神蹟");
        }
        else if(number==13){
            text2013.setText("主你從不曾走遠 有時幾乎以為\n你只住在聖經中\n也許吧是我遠了 遠到某個距離\n剛好無法看見你\n\n高於一切的生活 是怎樣\n好想知道 你的愛真有那麼寬廣\n想起我的承諾 想起你總保守\n想起我們成為一家人的時候\n\n幾千公里的距離 你都不會放棄\n你像慈父般耐心的等候 等著我回應\n幾千公里 無法阻止你那深愛我的心\n不管世界盡頭 或家門口\n我會發現祢守候著我\n\n我以為我已躲得太久\n早已不配得你來愛我\n為什麼\n有人會願意為了我承受\n所有的苦痛 為此刻的我");
        }

    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btnWord2013View:
                    Uri uri= Uri.parse(strUrl[number-1]);
                    Intent i=new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(i);
                    break;
                case R.id.btnJesus2013Previous:
                    finish();
                    break;
                case R.id.btnJesus2013Family:
                    Intent family=new Intent();
                    family.setClass(wordJesus2013.this, FamilyArticle.class);
                    startActivity(family);
                    break;
                case R.id.btnJesus2013Home:
                    finish();
                    menuJesus2013.instance.finish();
                    break;
            }
        }
    };

}
