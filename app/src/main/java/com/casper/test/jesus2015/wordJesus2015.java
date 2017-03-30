package com.casper.test.jesus2015;

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

public class wordJesus2015 extends AppCompatActivity {
    private TextView text2015;
    private Button _btnPrevious,_btnHome,_btnFamily;
    private ImageView btnWord2015Image;
    private int number=0,vWidth=120,vHeight=60;
    private String[] strUrl={"https://www.youtube.com/watch?v=a2jrJliUvAs&list=PLbFuQdPlCwZle2kPKgJUhwEvday6U8Dl2","https://www.youtube.com/watch?v=LKj5h7e6Y9I&index=2&list=PLbFuQdPlCwZle2kPKgJUhwEvday6U8Dl2",
                            "https://www.youtube.com/watch?v=pa1DhSSMXnc&index=3&list=PLbFuQdPlCwZle2kPKgJUhwEvday6U8Dl2","https://www.youtube.com/watch?v=zVRcHZRzr-U&index=4&list=PLbFuQdPlCwZle2kPKgJUhwEvday6U8Dl2",
                            "https://www.youtube.com/watch?v=HncQkgvU2VY","https://www.youtube.com/watch?v=3H75UnYyZHQ&list=PLbFuQdPlCwZle2kPKgJUhwEvday6U8Dl2&index=5",
                            "https://www.youtube.com/watch?v=om0IXFMLNaI&list=PLbFuQdPlCwZle2kPKgJUhwEvday6U8Dl2&index=6","https://www.youtube.com/watch?v=jEX-fH02u5I&index=8&list=PLbFuQdPlCwZle2kPKgJUhwEvday6U8Dl2",
                            "https://www.youtube.com/watch?v=I7GgawnJpZo&index=7&list=PLbFuQdPlCwZle2kPKgJUhwEvday6U8Dl2","https://www.youtube.com/watch?v=TDqL2FR41Wk"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_jesus2015);

        text2015 =(TextView)findViewById(R.id.textView2015);
        text2015.setOnTouchListener(new ZoomListenter());

        _btnPrevious=(Button)findViewById(R.id.btnJesus2015Previous);
        _btnHome=(Button)findViewById(R.id.btnJesus2015Home);
        btnWord2015Image =(ImageView) findViewById(R.id.btnWord2015View);
        btnWord2015Image.setImageResource(R.drawable.youtube);
        btnWord2015Image.getLayoutParams().width=vWidth;
        btnWord2015Image.getLayoutParams().height=vHeight;
        btnWord2015Image.setOnClickListener(btnListener);
        _btnPrevious.setOnClickListener(btnListener);
        _btnHome.setOnClickListener(btnListener);

        _btnFamily=(Button)findViewById(R.id.btnJesus2015Family);
        _btnFamily.setOnClickListener(btnListener);

        _btnHome.setEnabled(true);
        Intent intent = getIntent();
        number = intent.getIntExtra("Number", 1);
        int ser=intent.getIntExtra("Search",1);
        if(ser==2){
            _btnHome.setEnabled(false);
        }

        if(number==1){
            text2015.setText("軟弱的你賜能力 失喪的你找尋\n" + "犯罪的你已赦免 空虛的你安慰\n" + "\n" + "沒有人能與你相比\n" + "我放下自己來跟隨你\n" + "我用生命來尊崇你\n" + "\n" + "你是我天父 你都看顧我\n" + "這世界因你而有 眾百姓都來尊崇\n" + "天父的國度 降下你憐憫\n" + "你慈愛永不止息 讓我進到你懷裡\n" + "\n" + "貧窮的你賜祝福 失落的你扶持\n" + "疲乏的你賜剛強 哀傷的你擁抱\n" + "\n" + "頌讚榮耀 智慧感謝\n" + "尊貴權能 都歸給你\n" + "\n" + "天父的國度 你永遠掌權 \n" + "這世界因你而有 我們聚集來尊崇\n" + "天父的國度 降下你憐憫 \n" + "你慈愛永不止息 讓我進到你懷裡");
        }
        else if(number==2){
            text2015.setText("我渴望成為好土 讓你話語進入\n" + "我渴望成為好土　\n" + "結出三十 六十 一百倍的果實\n" + "\n" + "我要與你 同釘十架\n" + "雖選擇死去　反找到生命\n" + "\n" + "願我的生活方式能見證你是永活的主\n" + "\n" + "我一生要使你得榮耀 woo\n" + "\n" + "若想活得更像你　唯一的路徑　\n" + "就是選擇死去　讓老我死去\n" + "\n" + "若我的生命要結果子 我深知我就必需先 \n" + "向著自己死去要死去\n" + "\n" + "現在放下得安息如今老我已死去\n" + "\n" + "我心被造是為默想你 我眼被造是為能仰望你\n" + "我心被造要愛你尊崇你 我口被造只為給你榮耀\n" + "\n" + "如今我已興起 生命不再妥協\n" + "內心更深渴慕你");
        }
        else if(number==3){
            text2015.setText("榮耀神 你何等榮美 在全地上\n" + "奇妙主 你何等榮耀 憐憫恩典君王\n" + "\n" + "耶穌 超乎萬名 我們揚聲讚美 你\n" + "耶穌 慈愛救主 我們舉雙手敬拜\n" + "\n" + "聖潔 聖潔 全能真神\n" + "你名何等榮耀 \n" + "讚美直到永遠\n" + "信實救主 堅固磐石\n" + "你名何等尊貴 \n" + "我敬拜直到永遠\n" + "\n" + "頌讚與尊貴 榮耀和權能\n" + "都歸給你到永遠");
        }
        else if(number==4){
            text2015.setText("我要側耳 來傾聽 你的聲音\n" + "我要抬頭 仰望 你的榮面\n" + "我要尋求 你對我榮耀心意\n" + "主我到你面前\n" + "\n" + "我要獻上我的一切\n" + "完全奉獻在你腳前\n" + "竭力追求 敬拜屈膝\n" + "我心切切尋求你");
        }
        else if(number==5){
            text2015.setText("我們敬拜你 我們仰望你\n" + "你是我們的神 你是我們的盼望\n" + "\n" + "你醫治我的心 你恢復這世代\n" + "你擁抱每個感到軟弱\n" + "快要凋零的心\n" + "我困難你能挪開 愛此刻正在運行\n" + "我感覺時刻已經來到\n" + "你要成就大事\n" + "\n" + "大山小山你都能夠挪開\n" + "我的盼望你是我的力量\n" + "你的慈愛永遠不會離開\n" + "\n" + "你翻轉我的困境 一切因你而更新\n" + "我感覺時刻已經來到\n" + "你要成就美好事");
        }
        else if(number==6){
            text2015.setText("你是我靈魂的高臺 我生命中的避難處\n" + "在愛中找到你同在 主我敬拜\n" + "\n" + "我降服在你的腳前 感受你甜蜜的同在\n" + "渴望永遠不要離開 生命真光 是你的愛\n" + "\n" + "我的生命 獻上當作活祭 \n" + "我願一生 跟隨你的心意\n" + "我的渴望 我的全心 將所有獻上給你\n" + "我的盼望 單單來自於你 \n" + "有你同在 生命得以堅定\n" + "獻上自己 作你器皿 只願榮耀你聖名");
        }
        else if(number==7){
            text2015.setText("有一個盼望燃燒在我心 日日夜夜賜我生命力量\n" + "每當我見到一絲上帝的榮光 驅走內心迷茫\n" + "在基督裡 罪得赦免 在基督裡 盼望永遠\n" + "一生至高呼召和內心喜悅 唯遵從主旨意\n" + "\n" + "有一個盼望托住疲憊心 在沮喪中深深安撫我靈\n" + "當環境推我落入最深的低谷 卻反而遇見你\n" + "今日苦難 明日恐懼 在耳邊主說要剛強\n" + "在主永恆懷抱裡得安息 你同在是我家\n" + "\n" + "這盼望經得起時間考驗 使我越過一切引誘試煉\n" + "有朝一日將親自目睹你的面 何等榮美聖潔\n" + "當悲傷患難都終結 當願望都因主實現\n" + "難言的喜樂充滿在我心 我終於到家了");
        }
        else if(number==8){
            text2015.setText("你的軟弱祂都知道 祂能體會你的需要\n" + "祂定的日子 你尚未度一日\n" + "都已記在祂冊上\n" + "所以你要專心仰望 專心尋求就必尋見\n" + "儘管把挫折 憑信心交給祂\n" + "讓祂為你來成就一切\n" + "\n" + "祂必不讓你雙腳動搖 保護你的也從不停歇\n" + "當你向山舉目 你的幫助\n" + "將從造天地的耶和華而來\n" + "保護你的就是耶和華 白天黑夜都不必懼怕\n" + "不管你出你入 你的幫助\n" + "從今時直到永永遠遠 都在你的身旁\n" + "\n" + "你求告祂 祂就應允你 \n" + "專心愛祂 祂必搭救你\n" + "在急難中 祂與你同行 讓祂幫助你\n" + "祂要差派使者保護你 祂要用手一生托著你\n" + "祂要讓你享長久生命 讓祂幫助你");
        }
        else if(number==9){
            text2015.setText("空氣裡瀰漫著一種香氣\n" + "是你正在這裡\n" + "我感受這香氣在延續\n" + "你那未完待續的愛情\n" + "\n" + "伊甸園裡我看見你在那裏\n" + "等候著我回去\n" + "你微笑著說我單屬於你\n" + "我想這就是你給的愛情\n" + "\n" + "你的香氣 如同你的聖名 將被萬民高舉\n" + "你的氣息 就像你的聖靈 醫治你的百姓\n" + "你的香氣 如同你的愛情 恢復枯竭心靈\n" + "你的氣息 就像你的同在 充滿奇妙的愛\n" + "\n" + "耶穌香氣 正在蔓延 生命甦醒\n" + "耶穌香氣 正在興起 醫治全地\n" + "我知道是你 是你");
        }
        else if(number==10){
            text2015.setText("每當我迷失 等待救贖\n在絕望低谷 你引領我道路\n" + "心中安靜的居所 我有平穩江河湧流\n" + "\n" + "我坐在谷底 心卻歡喜\n有一種盼望 使我靈甦醒\n" + "心中安靜的居所 我有平穩江河湧流\n" + "\n" + "當黑暗過去 終迎向光明\n你微小的聲音 不斷吸引我靠近\n" + "平安在這裡 從不曾遠離\n最美好的事情 是有你同行\n" + "\n" + "我坐在谷底 心卻歡喜\n有一種盼望 使我靈甦醒\n" + "心中安靜的居所 我有平穩江河湧流");
        }
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
            public void onClick(View v){
                switch (v.getId()){
                    case R.id.btnWord2015View:
                        Uri uri= Uri.parse(strUrl[number-1]);
                        Intent i=new Intent(Intent.ACTION_VIEW,uri);
                        startActivity(i);
                        break;
                    case R.id.btnJesus2015Previous:
                        finish();
                        break;
                    case R.id.btnJesus2015Family:
                        Intent family=new Intent();
                        family.setClass(wordJesus2015.this, FamilyArticle.class);
                        startActivity(family);
                        break;
                    case R.id.btnJesus2015Home:
                        finish();
                        menuJesus2015.instance.finish();
                        break;
                }
            }
        };

}
