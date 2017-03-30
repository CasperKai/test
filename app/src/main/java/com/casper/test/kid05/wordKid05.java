package com.casper.test.kid05;

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

public class wordKid05 extends AppCompatActivity {

    private TextView text;
    private Button _btnPrevious,_btnHome,_btnFamily;
    private ImageView btnImage;
    private int number=0,vWidth=120,vHeight=60;
    private String[] strUrl={"https://www.youtube.com/watch?v=fEVVhP7olsM&list=PLEY_M7xVVeAvm0ig-DvtQijs6yeHm2ZZt","https://www.youtube.com/watch?v=yUbvLvCeCzc&list=PLEY_M7xVVeAvm0ig-DvtQijs6yeHm2ZZt&index=2",
                            "https://www.youtube.com/watch?v=q60uEz34wGU&list=PLEY_M7xVVeAvm0ig-DvtQijs6yeHm2ZZt&index=3","https://www.youtube.com/watch?v=00YgNt5umYI&index=4&list=PLEY_M7xVVeAvm0ig-DvtQijs6yeHm2ZZt",
                            "https://www.youtube.com/watch?v=shduQ9uUPy0&index=5&list=PLEY_M7xVVeAvm0ig-DvtQijs6yeHm2ZZt","https://www.youtube.com/watch?v=sGxpbzu8Ldc&list=PLEY_M7xVVeAvm0ig-DvtQijs6yeHm2ZZt&index=6",
                            "https://www.youtube.com/watch?v=bTvrus33vPM&index=7&list=PLEY_M7xVVeAvm0ig-DvtQijs6yeHm2ZZt","https://www.youtube.com/watch?v=5SHUgLzCT6o&index=8&list=PLEY_M7xVVeAvm0ig-DvtQijs6yeHm2ZZt",
                            "https://www.youtube.com/watch?v=8B53GS4qIjw&list=PLEY_M7xVVeAvm0ig-DvtQijs6yeHm2ZZt&index=9","https://www.youtube.com/watch?v=j8U7CB0CSxw&index=10&list=PLEY_M7xVVeAvm0ig-DvtQijs6yeHm2ZZt"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_kid05);

        text =(TextView)findViewById(R.id.textViewKid05);
        text.setOnTouchListener(new ZoomListenter());

        btnImage =(ImageView) findViewById(R.id.btnWordKid05View);
        btnImage.setImageResource(R.drawable.youtube);
        btnImage.getLayoutParams().width=vWidth;
        btnImage.getLayoutParams().height=vHeight;
        btnImage.setOnClickListener(btnListener);

        _btnPrevious=(Button)findViewById(R.id.btnWordKid05Previous);
        _btnHome=(Button)findViewById(R.id.btnWordKid05Home);
        _btnPrevious.setOnClickListener(btnListener);
        _btnHome.setOnClickListener(btnListener);

        _btnFamily=(Button)findViewById(R.id.btnWordKid05Family);
        _btnFamily.setOnClickListener(btnListener);

        _btnHome.setEnabled(true);
        Intent intent = getIntent();
        number = intent.getIntExtra("Number", 1);
        int ser=intent.getIntExtra("Search",1);
        if(ser==2){
            _btnHome.setEnabled(false);
        }
        if(number==1){
            text.setText("飛越時空的領域 聆聽靈魂的吶喊\n穿過天之涯 越過地之極\n卸下漂泊的心情 奔向永恆的生命\n真理在我心 哦 真愛在我心\n將展開嶄新的航行\n主的權能將是我雙翼\n\n看哪看哪 一切都更新\n聽哪聽哪 天使為我歡呼\n真理帶我 進入那自由之地\n從今天起 從此刻起\n我是新造 我是新造的人");
        }
        else if(number==2){
            text.setText("我因投靠耶和華 滿有喜樂\n我因信靠耶和華 大聲歡呼\n一同來嘗嘗主恩 知祂美善\n祂以恩惠如盾牌圍繞我們\n\n滿有喜樂 大聲歡呼\n神的子民當向神歡呼\n滿有盼望 大聲歡呼\n神的子民當歡欣跳舞\n\n敬畏祂必要得福\n敬畏祂 一無所缺\n得勝詩歌環繞我\n時時環繞我");
        }
        else if(number==3){
            text.setText("祢是我的主 引我走正義路\n高山或低谷 都是祢在保護\n萬人中唯獨 祢愛我認識我\n永遠不變的應許 這一生 都是祝福\n\n一步又一步 這是恩典之路\n祢愛 祢手 將我緊緊抓住\n一步又一步 這是盼望之路\n祢愛 祢手 牽引我走這人生路");
        }
        else if(number==4){
            text.setText("親愛天父 我感謝祢來到這世界\n給我盼望 給我一個永恆的家\n親愛天父 輕聲喚我回到祂面前\n不再流浪 我看到家的光\n\n回家 回家 回到永恆愛的家\n喜樂充滿我的心 我不住讚美\n\n回家 回家 回到永恆愛的家\n天父張開愛的雙臂 我一生屬於祂");
        }
        else if(number==5){
            text.setText("黑夜將過去 未來不再遲疑\n牽起我的手 祢給我勇氣\n曙光漸顯明 點亮前方路\n我展翅高飛 祢給我信心\n只要相信 相信就有奇蹟\n揮動信心的翅膀 隨著夢想起飛\n\n相信有愛 就有奇蹟\n不輕言放棄 只要打開眼睛\n手牽手一起 就不孤寂\n\n相信有愛 就有奇蹟\n雖然逆著風 祢給我勇氣\n飛往那佳美之地\n\n只要相信 相信就有奇蹟\n揮動信心的翅膀 隨著夢想起飛");
        }
        else if(number==6){
            text.setText("大山小山都要來讚美 太陽月亮星星來讚美\n海洋與河流 齊來讚美耶和華\n大山小山都要來讚美 太陽月亮星星來讚美\n萬物要歌唱 齊來讚美耶和華\n\n哈利路亞 我要唱 哈利路亞 我要跳\n哈利路亞 我要大聲歡呼讚美\n哈利路亞 我要唱 哈利路亞 我要跳\n哈利路亞 我要大聲歡呼讚美\n\n我要專心專心來愛祂 將我的心的心獻給祂\n將我每一天化做喜樂的詩歌\n我要專心專心敬拜祂 我要歡呼歡呼讚美祂\n將我每一天化做喜樂的詩歌");
        }
        else if(number==7){
            text.setText("耶和華沙龍 我的平安\n耶和華拉法 我的醫治者\n耶和華尼西 我的得勝\n耶和華以勒 祂必為我預備\n\n主祢的名 帶有能力\n宣告祢的名 戰勝仇敵\n主祢的名 無人能及\n聖潔與公義滿有權柄");
        }
        else if(number==8){
            text.setText("能力 權柄 智慧 公義\n遠超過全世界\n\n耶穌的名 超乎萬名\n榮耀尊貴 都歸於祢\n萬膝要跪拜 萬口要承認\n耶穌我敬拜祢到永遠\n\n耶穌 神的愛子\n耶穌 榮耀君王\n萬有俯伏在祢腳前\n世間的救贖主");
        }
        else if(number==9){
            text.setText("祢用真理和亮光 引導我回到祢的殿中\n我就走到祢的祭壇到我最喜樂的神面前\n當我定晴仰望祢 我的心不再憂悶煩躁\n我要稱頌讚美祢\n祢是我的救主我幫助\n\n神啊 我的神啊 我要彈琴歌頌祢\n神啊 我的神啊 我要彈琴歌頌祢聖名\n神啊 我的神啊 我要彈琴歌頌祢\n神啊 我的神啊 我要彈琴歌頌祢聖名");
        }
        else if(number==10){
            text.setText("祢的愛長闊高深\n祢的信實永不改變\n平安喜樂與我同在\n祢應許我得安慰\n\n哈利路亞 哈利路亞\n我敬畏 我等候祢\n哈利路亞 哈利路亞\n我的主 我讚美祢");
        }
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btnWordKid05View:
                    Uri uri= Uri.parse(strUrl[number-1]);
                    Intent i=new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(i);
                    break;
                case R.id.btnWordKid05Previous:
                    finish();
                    break;
                case R.id.btnWordKid05Family:
                    Intent family=new Intent();
                    family.setClass(wordKid05.this, FamilyArticle.class);
                    startActivity(family);
                    break;
                case R.id.btnWordKid05Home:
                    finish();
                    menuKid05.instance.finish();
                    break;
            }
        }
    };
}
