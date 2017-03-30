package com.casper.test.streamOfPraise18;

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

public class word18 extends AppCompatActivity {
    private TextView text18;
    private ImageView btnWord18Image;
    private Button _btnPrevious,_btnHome;
    private int number=0,vWidth=120,vHeight=60;
    private String[] strUrl={"https://www.youtube.com/watch?v=ZJWZQyLzDRQ&index=1&list=PLEY_M7xVVeAvcKPemsjneNmHcRN3AixBS", "https://www.youtube.com/watch?v=a1kgmTurEJo&index=2&list=PLEY_M7xVVeAvcKPemsjneNmHcRN3AixBS",
                            "https://www.youtube.com/watch?v=te2M8oWej80&index=3&list=PLEY_M7xVVeAvcKPemsjneNmHcRN3AixBS", "https://www.youtube.com/watch?v=B09ZuXe8Iok&index=4&list=PLEY_M7xVVeAvcKPemsjneNmHcRN3AixBS",
                            "https://www.youtube.com/watch?v=jHpqPOc9TCA&index=5&list=PLEY_M7xVVeAvcKPemsjneNmHcRN3AixBS", "https://www.youtube.com/watch?v=HREh-xnIQSg&index=6&list=PLEY_M7xVVeAvcKPemsjneNmHcRN3AixBS",
                            "https://www.youtube.com/watch?v=Kt8wU0COPTI&index=7&list=PLEY_M7xVVeAvcKPemsjneNmHcRN3AixBS", "https://www.youtube.com/watch?v=PrO_sNIJKU4&index=8&list=PLEY_M7xVVeAvcKPemsjneNmHcRN3AixBS",
                            "https://www.youtube.com/watch?v=pLl0rSQ4oR4&index=9&list=PLEY_M7xVVeAvcKPemsjneNmHcRN3AixBS", "https://www.youtube.com/watch?v=RCMQ6S7QoCI&index=10&list=PLEY_M7xVVeAvcKPemsjneNmHcRN3AixBS",
                            "https://www.youtube.com/watch?v=C5LthpoS0ck&index=11&list=PLEY_M7xVVeAvcKPemsjneNmHcRN3AixBS", "https://www.youtube.com/watch?v=fOOeufJyFXw&index=12&list=PLEY_M7xVVeAvcKPemsjneNmHcRN3AixBS",
                            "https://www.youtube.com/watch?v=FbpeAZTLwzo&index=13&list=PLEY_M7xVVeAvcKPemsjneNmHcRN3AixBS", "https://www.youtube.com/watch?v=mPcKQnEQKuQ&index=14&list=PLEY_M7xVVeAvcKPemsjneNmHcRN3AixBS"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word18);
        text18 =(TextView)findViewById(R.id.textView18);
        text18.setOnTouchListener(new ZoomListenter());

        btnWord18Image =(ImageView) findViewById(R.id.btnWord18View);
        btnWord18Image.setImageResource(R.drawable.youtube);
        btnWord18Image.getLayoutParams().width=vWidth;
        btnWord18Image.getLayoutParams().height=vHeight;
        btnWord18Image.setOnClickListener(btnListener);

        _btnPrevious=(Button)findViewById(R.id.btnWord18Previous);
        _btnHome=(Button)findViewById(R.id.btnWord18Home);
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
            text18.setText("當我們合一敬拜和禱告\n神就開始動工在我們當中\n神的意念高過我們的意念\n祂的道路遠超過我們的\n\n從心合一 同心合意\n當我們放下自己心意\n為大使命獻上自己\n從心合一 同心合意 \n讓我們先求神國和義 \n不分彼此同心向前行\n\n向這世界為主發光 \n合一尋求神國度藍圖 \n不在乎自己 體貼神心意 \n使用我們走遍世界各地");
        }
        else if(number==2){
            text18.setText("天父的愛 比海洋還要深\n比眾山還要高 比生命更美好\n天父的愛 沒有人能代替\n找到絕不放棄 耶穌我的唯一\n\n有一種真實的愛\n它永遠不更改\n有一種奇妙的愛\n從天降下來\n滿足我心裡一切的渴慕\n這就是天父的愛\n\n天父的愛 永遠不更改\n深刻的愛 將我心填滿\n天父的愛 從天降下來\n與我相遇 擁我在祂懷\n\n天父的愛 永遠不更改\n深刻的愛 超越一切所愛\n天父的愛 一直都存在\n我只要祢深刻的愛");
        }
        else if(number==3){
            text18.setText("親愛天父 我感謝祢來到這世界\n給我昐望 給我一個永恆的家\n親愛天父 輕聲喚我回到祂面前\n不再流浪 我看到了家的光\n\n回家  回家 回到永恆愛的家\n喜樂充滿我的心\n我不住讚美\n回家  回家 回到永恆愛的家\n天父張開愛的雙臂\n我一生屬於祂");
        }
        else if(number==4){
            text18.setText("我要像一棵樹按時結果\n栽在溪水旁\n喜愛袮的話語 晝夜思想\n這是有福的\n袮就像葡萄樹 我是枝子\n常在祢裡面\n愛我疼我的天父\n我是袮孩子\n\n永遠不分離 哦 永遠不分離\n世上沒有任何事能使袮愛隔絕\n永遠不分離 哦 永遠不分離\n留心聽祢 側耳聽祢\n我是有福的\n\n像一棵樹永不枯乾\n常在祢裡面");
        }
        else if(number==5){
            text18.setText("多麼豐富無條件的愛\n無法測度一直都存在\n這就是天父祢的愛\n陪伴我永不離開\n心不再寂寞因為我是祢最愛\n\n祢的愛高過星宿海洋\n祢的愛大過我所想像\n祢對我的愛永遠都不會更改\n祢的愛勝過黑暗死亡\n祢的愛溫暖就像太陽\n祢對我的愛不會因時間更改\n\n這是祢的愛\n\n不管是現在的事 還是那將來的事\n都不能隔絕祢對我的愛\n不管是現在的事 還是那將來的事\n都不能隔絕祢的愛");
        }
        else if(number==6){
            text18.setText("早晨起來抓住神的應許\n用祢話語來宣告\n我的生命完全屬於祢\n這是耶和華所定的日子\n喜樂充滿在我心\n祢行大事在生命裡\n\n喔 喔 今天是個新的一天\n我要站起來 我要高聲唱\n宣告天地父母是我君王\n勇敢地去面對 喜樂地去相信\n享受在祢恩典的每一分鐘\n\n今天的我要更多愛祢\n憑著祢豐盛慈愛應許\n眼光專注永恆國度\n用心聆聽聖靈的聲音\n今天的我要抵擋仇敵\n主祢已使我得勝有餘\n穿上祢所賜的軍裝\n靠著主的大能大力剛強站立");
        }
        else if(number==7){
            text18.setText("大山小山都要來讚美\n太陽月亮星星來讚美\n海洋與河流 齊來讚美耶和華\n大山小山都要來讚美\n太陽月亮星星來讚美\n萬物要歌唱 齊來讚美耶和華\n\n哈利路亞 我要唱\n哈利路亞 我要跳\n哈利路亞 我要大聲歡呼讚美\n哈利路亞 我要唱\n哈利路亞 我要跳\n哈利路亞 我要大聲歡呼讚美\n\n我要專心專心來愛祂\n將我的心的心獻給祂\n將我每一天 化做喜樂的詩歌\n我要專心專心敬拜祂\n我要歡呼歡呼讚美祂\n將我每一天 化做喜樂的詩歌");
        }
        else if(number==8){
            text18.setText("我有喜樂在我心 我有喜樂在我心\n我有喜樂在我心 主的喜樂無人能奪去\nI've got joy, joy in my heart.\nI've got joy, joy in my heart\nI've got joy, joy in my heart.\nAnd the devil cannot take it away!\n\n我有喜樂在我心 我有喜樂在我心\n我有喜樂在我心 主的喜樂無人能奪去\n我有平安在我心 我有平安在我心\n我有平安在我心 主的平安無人能奪去\n\n我要唱新歌 讚美天父 唱新歌 讚美耶穌\n唱新歌 讚美天父 主的喜樂無人能奪去\n\n我要向前跑 向主奔跑 向前跑 向主奔跑\n向前跑 向主奔跑 在天父裡我已得自由\n我要來跳舞 為主跳舞 來跳舞 為主跳舞\n來跳舞 為主跳舞 主的喜樂無人能奪去\n\n我要來歡呼 大聲歡呼 來歡呼 大聲歡呼\n來歡呼 大聲歡呼 在天父裡我已得自由\n\nI wanna shout, shout, shout, shout it out\nShout, shout, shout, shout it out\nShout, shout, shout, shout it out\n'Cause I have the victory!");
        }
        else if(number==9){
            text18.setText("在祢寶座前 有一道生命水流\n我們進前來 謙卑等候領受\n在你同在中 有滿足的喜樂\n聖靈請祢來 自由運行這地\n\n聖靈的江河流啊流 自由永流在這地\n在我的裡面 生命活水不停息\n聖靈的江河 自由永流無到盡\n我們歡迎祢 聖靈我們愛祢");
        }
        else if(number==10){
            text18.setText("萬軍耶和華\n祢的居所何等可愛\n我羨慕渴想祢的院宇\n我心腸肉體向祢呼籲\n\n帶我進入祢的同在\n我不滿足 只停留現在\n帶我進入祢的同在\n我心渴慕 祢永恆的愛\n\n願你的榮耀 從天降下來\n燃燒每顆愛慕祢的心\n願你的榮耀 從天降下來\n充滿這地與我們相遇");
        }
        else if(number==11){
            text18.setText("我尋求祢 我尋求祢\n謙卑自己 屈膝在至聖所裡\n我尋求祢 從心深處呼喊\n我活著為要日夜不停尋求祢\n\n願祢降臨 彰顯自己\n開我眼睛 看見祢無比的美麗\n願祢降臨 大能的榮耀在這裡\n與祢相遇 進入那更深之地");
        }
        else if(number==12){
            text18.setText("站在破口中 為這世代呼求\n流淚如河 傾心如水\n祈求不疲倦\n\n我們的呼求 要震動這世代\n靠著聖靈 禱告的火\n來焚燒我們\n\n願祢興起禱告的大軍\n按著祢的心意舉手代求\n站在祢的應許中 宣告祢國度降臨\n\n願祢興起守望的大軍\n帶著信心堅定抵擋仇敵\n用祢的話語爭戰 宣告祢國度降臨\n\n大聲哭求 永不放棄\n清晨夜晚 徹夜守望\n向祢求耶利米的心\n大聲哭求 永不放棄\n清晨夜晚 徹夜守望\n將祢心意釋放這世代");
        }
        else if(number==13){
            text18.setText("耶和華 祢時時幫助我\n在我裡面 沒有懷疑懼怕\n耶和華 祢慈愛扶助我\n祢安慰我 就使我歡樂\n\n耶和華作了我的高臺\n耶和華作了我投靠的磐石\n我遭難的日子 因為有祢\n得享平安\n\n耶和華作了我的高臺\n耶和華作了我投靠的磐石\n祢必不丟棄我 不離棄我\n耶和華作了我的高臺");
        }
        else if(number==14){
            text18.setText("在天上我有個美麗的家\n有親愛家人和愛我的天父\n親愛的天父已為我預備\n天上的家\n\n在天上我有個美麗的家\n有我的朋友和愛我的天父\n黃金的街道充滿笑聲\n再沒有悲傷\n\n將來有一天\n我要回到天上美麗的家\n請不要悲傷 不要哭泣\n天父在我身旁\n只要相信祂 將來在天上\n我們要一起唱\n哈利路亞 哈利路亞");
        }
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btnWord18View:
                    Uri uri= Uri.parse(strUrl[number-1]);
                    Intent i=new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(i);
                    break;
                case R.id.btnWord18Previous:
                    finish();
                    break;
                case R.id.btnWord18Home:
                    finish();
                    menu18.instance.finish();
                    break;
            }
        }
    };

}
