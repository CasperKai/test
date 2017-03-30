package com.casper.test.streamOfPraise20;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.casper.test.R;
import com.casper.test.ZoomListenter;

public class word20 extends AppCompatActivity {
    private TextView text20;
    private Button _btnPrevious,_btnHome;
    private ImageView btnWord20Image;
    private int number=0,vWidth=120,vHeight=60;
    private String[] strUrl={"https://www.youtube.com/watch?v=hvZUyRbBudo&index=1&list=PLEY_M7xVVeAsOVtuRmG3wKcdarXTkqm42","https://www.youtube.com/watch?v=HUBC6SN5BXw&index=2&list=PLEY_M7xVVeAsOVtuRmG3wKcdarXTkqm42",
                            "https://www.youtube.com/watch?v=OFJT8hCvqiw&index=3&list=PLEY_M7xVVeAsOVtuRmG3wKcdarXTkqm42","https://www.youtube.com/watch?v=XpmU73jYhrE&index=4&list=PLEY_M7xVVeAsOVtuRmG3wKcdarXTkqm42",
                            "https://www.youtube.com/watch?v=-KHFjWkfXAQ&index=5&list=PLEY_M7xVVeAsOVtuRmG3wKcdarXTkqm42","https://www.youtube.com/watch?v=PG_J_0gsMXA&index=6&list=PLEY_M7xVVeAsOVtuRmG3wKcdarXTkqm42",
                            "https://www.youtube.com/watch?v=jIg4jptBArY&index=7&list=PLEY_M7xVVeAsOVtuRmG3wKcdarXTkqm42","https://www.youtube.com/watch?v=WC6bCBSgNtQ&index=8&list=PLEY_M7xVVeAsOVtuRmG3wKcdarXTkqm42",
                            "https://www.youtube.com/watch?v=AW6aFoCCaIg&index=9&list=PLEY_M7xVVeAsOVtuRmG3wKcdarXTkqm42","https://www.youtube.com/watch?v=EX742-NmARg&index=10&list=PLEY_M7xVVeAsOVtuRmG3wKcdarXTkqm42",
                            "https://www.youtube.com/watch?v=ZNl6CHWHsaE&index=11&list=PLEY_M7xVVeAsOVtuRmG3wKcdarXTkqm42","https://www.youtube.com/watch?v=O8Rb-3oQDfM&index=13&list=PLEY_M7xVVeAsOVtuRmG3wKcdarXTkqm42",
                            "https://www.youtube.com/watch?v=fpOboLMrCDE&index=14&list=PLEY_M7xVVeAsOVtuRmG3wKcdarXTkqm42","https://www.youtube.com/watch?v=hNO5l4mjDHc&index=15&list=PLEY_M7xVVeAsOVtuRmG3wKcdarXTkqm42",
                            "https://www.youtube.com/watch?v=fo8fIMZYZyw&index=16&list=PLEY_M7xVVeAsOVtuRmG3wKcdarXTkqm42","https://www.youtube.com/watch?v=9vwNwKicN98&index=17&list=PLEY_M7xVVeAsOVtuRmG3wKcdarXTkqm42",
                            "https://www.youtube.com/watch?v=4j8AZAwBiXo&index=18&list=PLEY_M7xVVeAsOVtuRmG3wKcdarXTkqm42","https://www.youtube.com/watch?v=5QmE9psO71g&index=19&list=PLEY_M7xVVeAsOVtuRmG3wKcdarXTkqm42"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word20);

        text20 =(TextView)findViewById(R.id.textView20);
        text20.setOnTouchListener(new ZoomListenter());

        btnWord20Image =(ImageView) findViewById(R.id.btnWord20View);
        btnWord20Image.setImageResource(R.drawable.youtube);
        btnWord20Image.getLayoutParams().width=vWidth;
        btnWord20Image.getLayoutParams().height=vHeight;
        btnWord20Image.setOnClickListener(btnListener);

        _btnPrevious=(Button)findViewById(R.id.btnWord20Previous);
        _btnHome=(Button)findViewById(R.id.btnWord20Home);
        _btnPrevious.setOnClickListener(btnListener);
        _btnHome.setOnClickListener(btnListener);

        _btnHome.setEnabled(true);
        Intent intent = getIntent();
        number = intent.getIntExtra("Number", 1);
        int ser=intent.getIntExtra("Search",1);
        if(ser==2){
            _btnHome.setEnabled(false);
        }
        if(number==1){
            text20.setText("我相信愛能改變世界\n愛能讓世界微笑起來\n你我的付出就像隧道盡頭的陽光\n畫出無限的希望\n\n給夢想一雙翅膀\n用神的愛來澆灌\n讓你我來搭樑\n給夢想一雙翅膀\n勾勒出愛的線條\n盡情付出　看見滿足的微笑");
        }
        else if(number==2){
            text20.setText("祢是做新事的神\n我要向祢唱新歌\n恩典憐憫每天都是新的\n新酒新皮袋每天要賜下\n\n新的事　新的事將要成就\n新的恩膏　新的恩寵\n我們要　我們要唱新歌\n稱讚我們神為高\n新的事　新的事將要成就\n新的恩典　新的盼望\n我們要　我們要唱新歌\n充滿神的榮耀");
        }
        else if(number==3){
            text20.setText("有敬拜的聲音發出\n從最高的山到海洋深處\n神的兒女要唱一首新歌\n我們神要做新事\n\n舊的事都已經過去\n在基督裡一切都要更新\n新的眼界 新的異象\n新的故事 新的方向\n\n全地都要渴望呼喊\n榮耀的主我願祢來\n天要敞開恩膏傾倒下來\n神國度的榮耀彰顯\n\n全地都要渴望呼喊\n榮耀的主我願祢來\n聖靈引領看見新的異象\n祢要做新的事在我們中間");
        }
        else if(number==4){
            text20.setText("開我的眼睛　讓我看到天使天軍\n仇敵的攻擊　我要更堅定信靠祢\n祢是我力量　祢是我永遠的拯救\n祢的右手施展能力　顯出榮耀\n\n只要有祢在我左右　我必不懼怕\n靠著祢的聖靈　祢的應許　永遠不放棄\n只要有祢在我左右　我必不懼怕\n神啊　誰能像祢\n至聖至榮　可頌可畏　施行奇事\n\n誰能控告　誰能敵擋\n我是神所揀選的　我是神所揀選的\n誰能控告　誰能敵擋\n我是神所揀選的　我是神所揀選的");
        }
        else if(number==5){
            text20.setText("眾人所望　明亮晨星\n披戴著一切榮美輝煌\n有溫柔有憐憫\n天地所有權柄　屬於我們愛戴的王\n\n高舉至高的名　耶穌基督　榮美君王\n帶著世上權柄　將來我們要與祂作王\n高唱哈利路亞　耶穌基督是彌賽亞\n祂是聖潔唯一　榮光顯明　我們愛戴的王");
        }
        else if(number==6){
            text20.setText("將祢的光照亮在我們身上\n讓我們在祢面前毫無隱藏\n打開我們的心　我要看見\n祢的國度就在這裡彰顯\n\n在祢光中我得見光\n在祢裡面有豐盛盼望\n榮耀榮耀榮耀榮耀　聖潔大君王\n\n榮耀天父　天父　天父　天父母\n歡迎祢在我們中間\n榮耀天父　天父　天父　天父母\n祢是配得榮耀　大君王");
        }
        else if(number==7){
            text20.setText("安靜讓平安入我心\n深深知道祢是我的神\n風浪讓我靈更堅定\n在我身旁祢使風浪平息\n\n我不害怕　我仍然要敬拜\n祢陪我走向應許之處\n充滿盼望　我一生要敬拜\n生命滿有祢的印記");
        }
        else if(number==8){
            text20.setText("每個狂風暴雨裡　祢同在在那裡\n每個難處低谷裡　祢恩典在那裡\n每個傷心失望裡　祢愛我愛到底\n在祢愛的光中　我得著能力\n\n我愛祢　用盡我全心全意全力\n榮耀高舉祢的名　我跟隨不懷疑\n我愛祢　用盡我全心全意全力\n在這愛的路程裡　我奔跑不放棄\n\n四面受敵　卻不被困住\n心裡作難　卻不至失望\n至暫至輕的苦楚要成就\n極重無比永遠的榮耀");
        }
        else if(number==9){
            text20.setText("我屬於祢　祢是我永遠的福分\n只想日夜在祢殿中獻上敬拜\n定睛在祢的榮美　世上一切變暗淡\n除祢以外　我還能有誰\n\n能不能　就讓我留在祢的同在裡\n能不能　賜我力量讓我更多愛祢\n我哪都不想去　只想日夜在祢殿中\n獻上敬拜　全心全意來愛祢");
        }
        else if(number==10){
            text20.setText("壓傷的蘆葦祂不折斷\n將殘的蠟燭祂不吹熄\n一生的年歲在祂手裡\n平安喜樂都陪伴我\n平安喜樂都陪伴我\n\n醫治我　我必得痊癒\n萬軍之耶和華　全能的主\n醫治我　我必得痊癒\n如鷹展翅上騰　奔跑走天路");
        }
        else if(number==11){
            text20.setText("找一個地方　輕輕閉上眼睛\n祢的話祢應許浮上心頭\n我的心渴慕祢　我的靈仰望祢\n靠近祢我心必得安息\n\nI want to go to a place.　與祢相遇\n徜徉在祢懷裡寧靜\nI want to go to a place.　聽祢聲音\n享受在充滿愛的同在裡\n\n祢的愛　祢的溫暖\n安靜我的心　安慰我的靈\n祢的愛　祢的溫暖\n安靜我的心　安慰我的靈");
        }
        else if(number==12){
            text20.setText("放下一切憂傷和羞愧\n放下一切痛苦和纏累\n主我來到祢施恩座前\n放下一切憂傷和痛悔\n放下一切重擔和憂慮\n緊緊抓住祢　唯一的主\n\n盼望在於祢　恩典在於祢\n全新的生命在於祢\n盼望在於祢　恩典在於祢\n全新的生命在於祢\n\n舊事已過都變成新\n我已被救贖\n舊事已過都變成新\n我已被救贖");
        }
        else if(number==13){
            text20.setText("哈利路亞　哈利路亞\n前來敬拜永遠的君王\n哈利路亞　哈利路亞\n大聲宣告主榮耀降臨\n\n榮耀尊貴　能力權柄歸於祢\n祢是我的救主　我的救贖\n榮耀尊貴　能力權柄歸於祢\n祢是配得　祢是配得\n祢是配得我的敬拜\n\n榮耀尊貴　美麗無比\n神的兒子　天父我的主\n榮耀尊貴　美麗無比\n神的兒子　天父我的主");
        }
        else if(number==14){
            text20.setText("跟著音樂節拍　雙手也舉起來\n不論你是什麼年代　一起來大聲敬拜\n我們同聲呼求　敬拜讓世界震動\n宣告我已得自由　將一切鎖鏈掙脫\n\n哈利哈利哈利哈利路亞\n宣告敬拜翻轉這個世代\n哈利哈利哈利哈利路亞\n宣告敬拜震動這個世代");
        }
        else if(number==15){
            text20.setText("打破這香膏在祢腳前\n破碎我自己與祢面對面\n我每口呼吸　我心渴望體貼祢靈\n我生命只為祢\n\n傾倒我所有　願祢旨意成就\n生命每分每秒毫無保留\n能傾倒我所有　是我今生所求\n從今以後永不回頭\n\n我的過去　我的未來\n全然傾倒在祢腳前\n我的過去　我的未來\n全然傾倒給祢");
        }
        else if(number==16){
            text20.setText("三百六十五天　每一天都溫暖\n祢的呼喚　祢的擁抱　從不間斷\n三百六十五天　每一天都新鮮\n祢的話語　祢的恩典　顯明祢就是愛\n\n我用一生回應祢犧牲的愛\n我用一生沈浸祢的同在\n我用一生堅定相信永恆的應許\n我等候祢愛的主降臨");
        }
        else if(number==17){
            text20.setText("世界的灰暗需要燦爛的色彩\n冷漠生命缺溫暖關懷\n顫抖的雙手等待扶持的力量\n迷失的心在尋找方向\n\n人來人往有誰能停下來\n真心付出捨己的愛\n天父請祢來安慰受傷心靈\n使沉睡的世代再次甦醒\n\n求祢軟化我心　跟隨祢的旨意\n安靜聆聽祢的聲音\n看見人的需要　日夜守望祈禱\n帶人重回祢的懷抱\n\n每天專注於祢　求開啟我雙眼\n靠著聖靈述說祢奇妙恩典\n我是祢的器皿　為祢作光作鹽\n使人得著祢愛的擁抱");
        }
        else if(number==18){
            text20.setText("在神的國度裡　有權柄和能力\n不憑血氣　不憑勢力\n單單倚靠主聖靈\n在神的國度裡　屬神的子民\n不分語言　在祢面前將榮耀歸與祢\n\n願祢國度降臨在這地\n同心高舉天父母的聖名\n願祢聖靈彰顯在這地\n施行神蹟　醫治能力\n我們佇立在祢的同在裡\n\n我們是祢揀選子民　帶著天國使命\n靠著聖靈宣揚天父的能力\n我們是祢天國子民　願祢帶來復興\n再次甦醒　看見祢國度降臨");
        }
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btnWord20View:
                    Uri uri= Uri.parse(strUrl[number-1]);
                    Intent i=new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(i);
                    break;
                case R.id.btnWord20Previous:
                    finish();
                    break;
                case R.id.btnWord20Home:
                    finish();
                    menu20.instance.finish();
                    break;
            }
        }
    };

}
