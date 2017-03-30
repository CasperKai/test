package com.casper.test.streamOfPraise17;

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

public class word17 extends AppCompatActivity {
    private TextView text17;
    private Button _btnPrevious,_btnHome,_btnFamily;
    private ImageView btnWord17Image;
    private int number=0,vWidth=120,vHeight=60;
    private String[] strUrl={"https://www.youtube.com/watch?v=OVUPLFLdmpE", "https://www.youtube.com/watch?v=TaHTuEZmQ60&index=2&list=PLEY_M7xVVeAuPWas-SROSisCncEjlLDOm",
                            "https://www.youtube.com/watch?v=_CoGIo0-mTM&index=3&list=PLEY_M7xVVeAuPWas-SROSisCncEjlLDOm", "https://www.youtube.com/watch?v=z_HqOFsr210&index=4&list=PLEY_M7xVVeAuPWas-SROSisCncEjlLDOm",
                            "https://www.youtube.com/watch?v=PO0-QmW54kI&index=5&list=PLEY_M7xVVeAuPWas-SROSisCncEjlLDOm", "https://www.youtube.com/watch?v=Y-cpcDSf_z4&index=6&list=PLEY_M7xVVeAuPWas-SROSisCncEjlLDOm",
                            "https://www.youtube.com/watch?v=dfVQ2nbrPnM&index=7&list=PLEY_M7xVVeAuPWas-SROSisCncEjlLDOm", "https://www.youtube.com/watch?v=WxrAYIaLQOk&index=8&list=PLEY_M7xVVeAuPWas-SROSisCncEjlLDOm",
                            "https://www.youtube.com/watch?v=57AbvGHEnCk&index=9&list=PLEY_M7xVVeAuPWas-SROSisCncEjlLDOm", "https://www.youtube.com/watch?v=gmqXgffoVrI&index=10&list=PLEY_M7xVVeAuPWas-SROSisCncEjlLDOm",
                            "https://www.youtube.com/watch?v=_HbJH_x-OaE&index=11&list=PLEY_M7xVVeAuPWas-SROSisCncEjlLDOm", "https://www.youtube.com/watch?v=8xGdaxTpAYA&index=12&list=PLEY_M7xVVeAuPWas-SROSisCncEjlLDOm",
                            "https://www.youtube.com/watch?v=XvND3uisjho&index=13&list=PLEY_M7xVVeAuPWas-SROSisCncEjlLDOm", "https://www.youtube.com/watch?v=fZV8lYNjWCw&index=14&list=PLEY_M7xVVeAuPWas-SROSisCncEjlLDOm"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word17);
        text17 =(TextView)findViewById(R.id.textView17);
        text17.setOnTouchListener(new ZoomListenter());

        btnWord17Image =(ImageView) findViewById(R.id.btnWord17View);
        btnWord17Image.setImageResource(R.drawable.youtube);
        btnWord17Image.getLayoutParams().width=vWidth;
        btnWord17Image.getLayoutParams().height=vHeight;
        btnWord17Image.setOnClickListener(btnListener);

        _btnPrevious=(Button)findViewById(R.id.btnWord17Previous);
        _btnHome=(Button)findViewById(R.id.btnWord17Home);
        _btnFamily=(Button)findViewById(R.id.btnWord17Family);
        _btnPrevious.setOnClickListener(btnListener);
        _btnHome.setOnClickListener(btnListener);
        _btnFamily.setOnClickListener(btnListener);



        _btnHome.setEnabled(true);
        Intent intent = getIntent();
        number = intent.getIntExtra("Number", 1);
        int ser=intent.getIntExtra("Search",1);
        if(ser==2){
            _btnHome.setEnabled(false);
        }
        if(number==1){
            text17.setText("將天敞開　祢的榮耀降下來\n將天敞開　祢的同在降下來\n將天敞開　祢的榮耀降下來 \n萬國讚嘆祢　祢是榮耀君王\n\n天上地下　合一敬拜\n歡呼耶穌基督 \n聖潔羔羊　榮耀歸於祢 \n天上地下　在永恆裡敬拜 \n哈利路亞　哈利路亞\n\n神就在這裡　我們歡迎祢\n讓一切焦點轉向祢\n神就在這裡　我們歡迎祢\n寶座前敬拜不停息");
        }
        else if(number==2){
            text17.setText("耶和華 祢大榮耀降臨\n在地上如天上的敬拜\n祢是我們的神 我們是祢子民\n因祢榮耀 我不住敬拜\n\n我受造 是為了敬拜祢\n我受造 是為了榮耀祢\n祢是我們的神 祢與我們同住\n因祢榮耀 我不住敬拜\n\n聖哉 聖哉 聖哉 昔在今在永在\n榮耀 榮耀 榮耀 配得頌讚愛戴\n聖哉 聖哉 聖哉 全地向祢跪拜\n尊貴榮耀都歸寶座羔羊\n\n日日夜夜 不停獻上\n禱告如香 不停升起\n日日夜夜 不停獻上\n讚美獻祭 永不斷續");
        }
        else if(number==3){
            text17.setText("聖哉 聖哉\n主神全能者 道途義哉誠哉\n聖哉 聖哉 萬有都讚美祢\n\n主耶和華 祢奇妙作為流傳萬代\n祢的美德從地極到地極 無人能及\n天使天軍屈膝 萬民也要興起\n將榮耀歸祢聖名\n\n祢的慈愛高及諸天\n祢的誠實上達穹蒼\n祢是公義的主 與和平的君王\n祢配得所有頌揚");
        }
        else if(number==4){
            text17.setText("開我的眼睛 讓我看見祢\n祢榮美彰顯吸引我心\n開我的耳朵 讓我聽見祢\n每句話都讓我更愛祢\n\n活著為要敬拜祢 活著為要全心來愛祢\n俯伏在祢榮耀中 祢的榮美 無人能及\n活著為要敬拜祢 活著為要全心來愛祢\n永遠住在祢殿中 昔在今在永在的主\n我愛祢\n\n喔 我愛祢 喔 全心敬拜祢\n日夜不停歌唱 哈利路亞 我愛祢\n喔 我愛祢 喔 全心敬拜祢\n日夜不停歌唱 哈利路亞 我愛祢\n我愛祢\n\n活著為要敬拜祢");
        }
        else if(number==5){
            text17.setText("期待那一天 親眼見祢面\n永遠不分離 在新耶路撒冷\n城內有一道 生命水的河\n黃金的街道 有神榮耀光照\n\n看哪 神的帳幕在人間\n親自與我們同在\n我們作祂子民 與祂同住\n看哪 神的帳幕在人間\n擦去一切的眼淚\n不再有傷悲 因一切都更新\n\n不再有死亡 也不再有悲哀\n沒有哭號疼痛 以前的事都過去了\n這是我渴慕 這是我等待\n永永遠遠 與祢同作王\n期待那一天 親眼見祢面\n永遠不分離 在新耶路撒冷");
        }
        else if(number==6){
            text17.setText("將來的國度\n不再有悲傷和淚水\n直到那日\n當堅定 當剛強\n\n萬物屈膝來敬拜萬王之王\n萬物揚聲歌頌敬拜祂\n\n一同起舞\n向復活的君王唱首愛的詩歌\n一同起舞\n向榮美的耶穌唱首愛的詩歌\n我愛祢");
        }
        else if(number==7){
            text17.setText("謙卑的君王 榮耀的君王\n祢甘心卑微順服\n捨命在十架上\n謙卑的君王 榮耀的君王\n我得醫治  因祢鞭傷\n無盡恩典  我心感恩\n\n十架的愛  何等奇妙\n超乎我所求所想\n洗淨我罪  脫離污穢\n穿上公義潔白衣裳\n\n十架的愛  何等奇妙\n我生命從此不再一樣\n帶我重回天父懷抱\n在永恆裡我不停歌唱\n十架的愛");
        }
        else if(number==8){
            text17.setText("每當我 拿起這餅\n我記念祢 親愛耶穌\n十架上 祢換回我生命\n使我回到 天父面前\n\n每當我 拿起這杯\n我感謝祢 我的耶穌\n祢寶血 洗淨我的罪\n使我永遠 與罪隔離\n\n謝謝祢為我死在十架上\n破碎的生命得以完全\n我感恩 我敬拜\n得醫治 得自由\n都因祢那救贖的恩典\n\n永遠與罪隔離\n永遠與罪隔離\n被贖教會 洗得清潔\n永遠與罪隔離");
        }
        else if(number==9){
            text17.setText("願你平安 喔 耶路撒冷\n愛你的人必然興旺\n願你平安 喔 耶路撒冷\n願你興旺 城中平安\n\n為著我的家和我所愛\n我舉手祈求\n願主平安 在你中間\n為著神的殿和神所愛\n我舉手祈求\n願主賜福 在你中間\n\n願你平安 時時平\n願你平安 喔 耶路撒冷\n願你平安 時時平安\n願你平安 喔 耶路撒冷");
        }
        else if(number==10){
            text17.setText("耶穌基督是至寶\n是生命中的美好\n十字架是我的榮耀\n一生都跟隨快跑\n\n我要順服  因為我愛祢\n無論何處  到哪裡都忠心\n世界萬物  都丟棄看作糞土\n為要得著耶穌基督\n\n我要順服  因為我愛祢\n無論何處  到哪裡都忠心\n一生活出  基督福音的託付\n獻給耶穌  我所有的全部");
        }
        else if(number==11){
            text17.setText("祢從未離開過我\n祢恩典直到永久\n祢應許都要成就\n祢信實永遠不朽\n\n唯有祢是我倚靠\n唯有祢是我榮耀\n一生一世要住在神的殿中\n\n我的口要充滿感謝\n我的嘴唇要充滿讚美神的話\n誰能像我的神 愛我直到永遠\n在祢能力中我展翅上騰\n\n我的口要充滿感謝\n我的嘴唇要充滿讚美神的話\n誰能像我的神 將我放在心上\n在祢懷抱中  我自由地歌唱");
        }
        else if(number==12){
            text17.setText("神已揀選我們 神已預備我們\n帶著神的愛 宣告盼望在這世代\n領受這大使命 側耳謙卑聆聽\n跟隨祂腳步 將福音傳到世界地極\n\n就是這個時刻 帶著主愛走遍世界各地\n我們所踏之地 萬民都要歸向祢\n就是這個時刻 帶著主光照亮黑暗之地\n大聲宣告耶穌是主 萬國都敬拜祢\n\n就是這個時刻   不再遲疑\n就是這個時刻   勇敢前去\n就是這個時刻   不再遲疑\n就是這個時刻   勇敢前去\n以生命見證   耶穌祂活著");
        }
        else if(number==13){
            text17.setText("在創世以前 天父祂已經愛我\n創造我  認識我  揀選我\n差派獨生子耶穌基督 為我捨命\n從此進入永恆愛的約定\n\n我宣告我宣告  我已得自由\n基督福音是大能 要賜給我生命\n我宣告我宣告  我已得自由\n基督福音是大能 要賜給我能力\n恩典已經來到 救贖真光已照耀\n我宣告  在基督裡我自由\n\n定罪已過去 控告已過去\n基督的寶血大有能力\n罪已得赦免\n舊事已過都變成新\n全新的生命因耶穌的名");
        }
        else if(number==14){
            text17.setText("來！一起來參與神國度計畫\n熱情踏出信心步伐\n來！充滿大信心我們要宣告\n這是個恩典的世代\n\n靠著耶穌 世界要改變\n主已復活 再無黑暗懼怕\n我的生命 有聖靈的印記\n求主將祂 恩膏賜下\n\n按照祢榮耀 永恆計畫\n將祢的愛傳遍天下\n祢聖潔國度 沒有邊界\n哈利路亞 同心高舉十架");
        }
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btnWord17View:
                    Uri uri= Uri.parse(strUrl[number-1]);
                    Intent i=new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(i);
                    break;
                case R.id.btnWord17Previous:
                    finish();
                    break;
                case R.id.btnWord17Family:
                    Intent family=new Intent();
                    family.setClass(word17.this, FamilyArticle.class);
                    startActivity(family);
                    break;
                case R.id.btnWord17Home:
                    finish();
                    menu17.instance.finish();
                    break;
            }
        }
    };

}
