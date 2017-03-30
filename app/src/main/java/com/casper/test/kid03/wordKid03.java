package com.casper.test.kid03;

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

public class wordKid03 extends AppCompatActivity {

    private TextView text;
    private Button _btnPrevious,_btnHome,_btnFamily;
    private ImageView btnImage;
    private int number=0,vWidth=120,vHeight=60;
    private String[] strUrl={"https://www.youtube.com/watch?v=LcUE6el-sNI&list=PLEY_M7xVVeAuwG-p87wvUVznWyAVFHcuS","https://www.youtube.com/watch?v=EC4XmMxon-8&list=PLEY_M7xVVeAuwG-p87wvUVznWyAVFHcuS&index=2",
                            "https://www.youtube.com/watch?v=P8R9_oEFgdg&index=3&list=PLEY_M7xVVeAuwG-p87wvUVznWyAVFHcuS","https://www.youtube.com/watch?v=YtkQSVvN1Pc&index=4&list=PLEY_M7xVVeAuwG-p87wvUVznWyAVFHcuS",
                            "https://www.youtube.com/watch?v=V8D84ve4ihk&list=PLEY_M7xVVeAuwG-p87wvUVznWyAVFHcuS&index=5","https://www.youtube.com/watch?v=9xeughY5i00&list=PLEY_M7xVVeAuwG-p87wvUVznWyAVFHcuS&index=6",
                            "https://www.youtube.com/watch?v=UelRIB-uj3s&index=7&list=PLEY_M7xVVeAuwG-p87wvUVznWyAVFHcuS","https://www.youtube.com/watch?v=ITEVD3c7h-4&list=PLEY_M7xVVeAuwG-p87wvUVznWyAVFHcuS&index=8",
                            "https://www.youtube.com/watch?v=TcdKH-qYLYg&index=9&list=PLEY_M7xVVeAuwG-p87wvUVznWyAVFHcuS","https://www.youtube.com/watch?v=jMYWTe2mUfI&list=PLEY_M7xVVeAuwG-p87wvUVznWyAVFHcuS&index=10",
                            "https://www.youtube.com/watch?v=Evb-sXAlb34&index=11&list=PLEY_M7xVVeAuwG-p87wvUVznWyAVFHcuS"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_kid03);

        text =(TextView)findViewById(R.id.textViewKid03);
        text.setOnTouchListener(new ZoomListenter());

        btnImage =(ImageView) findViewById(R.id.btnWordKid03View);
        btnImage.setImageResource(R.drawable.youtube);
        btnImage.getLayoutParams().width=vWidth;
        btnImage.getLayoutParams().height=vHeight;
        btnImage.setOnClickListener(btnListener);

        _btnPrevious=(Button)findViewById(R.id.btnWordKid03Previous);
        _btnHome=(Button)findViewById(R.id.btnWordKid03Home);
        _btnPrevious.setOnClickListener(btnListener);
        _btnHome.setOnClickListener(btnListener);

        _btnFamily=(Button)findViewById(R.id.btnWordKid03Family);
        _btnFamily.setOnClickListener(btnListener);

        _btnHome.setEnabled(true);
        Intent intent = getIntent();
        number = intent.getIntExtra("Number", 1);
        int ser=intent.getIntExtra("Search",1);
        if(ser==2){
            _btnHome.setEnabled(false);
        }
        if(number==1){
            text.setText("如果你想知道 愛在哪裡\n愛就在你我的周圍\n如果你想知道 愛在哪裡\n愛就在每個笑臉上\n\n如果你想知道 愛在哪裡\n愛就在成長生命中\n如果你想知道 愛在哪裡\n愛就在父母的心裡\n\n愛在哪裡 愛在哪裡\n愛就在神的愛子裡\n愛從何來 愛從何來\n愛它是從神而來");
        }
        else if(number==2){
            text.setText("我們是光明之子 聖靈在我們的心間\n撒下喜樂的種子 讓我一天又一天\n享受天父所賜的恩典\n\n我們是光明之子 天父在我們的心間\n撒下信心的種子 讓我一遍又一遍\n衝破黑暗的種種考驗\n\n陽光為我們綻放笑臉\n黑暗已經離我們好遠\n笑聲與歌聲響徹天邊\n讓我們向整個世界\n讓我們向整個世界\n宣告我們是光明之子");
        }
        else if(number==3){
            text.setText("有一位神 有權能創造宇宙萬物\n也有溫柔雙手安慰受傷靈魂\n有一位神 有權柄審判一切罪惡\n也有慈悲體貼人的軟弱\n\n有一位神 我們的神\n唯一的神 名叫耶和華\n有權威榮光 有恩典慈愛\n是昔在今在永在的神\n\n有一位神 有權能創造宇宙萬物\n也有溫柔雙手安慰受傷靈魂\n有一位神 高坐在榮耀的寶座\n卻死在十架挽救人墮落");
        }
        else if(number==4){
            text.setText("主 我來尋求祢的面\n求祢充滿我 來充滿我\n主 我渴慕祢的同在\n求祢潔淨我 來充滿我\n\n耶穌 耶穌 耶穌 耶穌\n祢的寶血洗淨我\n耶穌 耶穌 耶穌 耶穌\n祢以恩典 為我冠冕");
        }
        else if(number==5){
            text.setText("親愛的 要記得爸爸教的\n要記得媽媽的說\n常常繫在你心上 掛在你項上\n行走時它引導你 躺臥時它保守你\n早晨睜開眼睛時 它必與你談論\n\n神的話就是光 照亮你所行的路\n神的話就是光 照亮你所行的路 走向生命之道\n\n我一定要記得爸爸教的\n要記得媽媽說的\n常常繫在我心上 掛在我項上\n行走時它引導我 躺臥時它保守我\n\n祢的話就是光 照亮我所行的路\n祢的話就是光 照亮我所行的路\n走向生命之道");
        }
        else if(number==6){
            text.setText("媽媽的愛是犧牲的愛\n爸爸的愛是堅定的愛\n你們讓我學習長大\n讓我夢想飛翔\n\n媽媽的愛是我的翅膀\n爸爸的愛是我的雙臂\n你們教我學習付出\n教我要愛天父\n\n我一步一步向前走 謝謝你們的愛\n回頭看著你們笑容 用愛擁抱這世界\n我一步一步向前走 帶著感恩的心\n願對天父愛不改變\n一生服事 榮耀主");
        }
        else if(number==7){
            text.setText("祢的慈愛 不動搖\n祢的愛是長闊高深\n祢的應許 不更改\n我一生歌頌祢大愛\n\n祢的慈愛不動搖\n祢的愛是長闊高深\n祢的應許不更改\n我一生歌頌祢大愛");
        }
        else if(number==8){
            text.setText("十字架 是我的榮耀\n十字架 是我的盼望\n十字架 使我能面對明天 喔十字架\n\n十字架 使我得救贖\n十字架 使我得醫治\n十字架 使我不再蒙羞愧 喔十字架\n\n是祢先愛了我 在我愛祢之前\n祢為我死在十架 耶穌 耶穌祢好愛我\n耶穌祢愛我 祢真的好愛我 祢好愛我\n耶穌祢愛我 祢真的好愛我 祢好愛我");
        }
        else if(number==9){
            text.setText("親愛主 雖然仇敵圍困\n我心深願靠祢話語得站穩\n我要宣告 進入豐盛\n宣告耶和華的禧年\n全地當甦醒 回轉來到 主寶座前\n我要宣告 咒詛離去\n貧窮不再轄制我們\n全地當彰顯祢榮耀無比的權能\n\n站起來 stand up\n神的子民不要起餒\n生命會有困難\n無非是考驗我們 教導我們\n努力勇敢往前 信心不要動搖\n神的子民別再煩惱\n雖然還是會有賊仔來\n靠著天父得勝 仇敵亂跑\n依靠祂我們得勝 小偷別跑");
        }
        else if(number==10){
            text.setText("主祢充滿在這地 我要屈膝敬拜祢\n我心單單屬祢\n我從心深處呼求 要得見祢的面 喔主\n祢是我的一切\n\n我高舉雙手 來尊崇祢\n我高聲歌頌 主我愛祢\n主祢榮耀 如雲彩圍繞\n我俯伏來敬拜祢");
        }
        else if(number==11){
            text.setText("我要彈琴歌唱稱頌祢的名\n因為祢大作為真奇妙\n全地啊 當揚聲述說祢的榮耀\n全新來讚美祢\n\n來擊鼓跳舞 彈各樣樂器\n來拍掌 穹蒼起唱和\n見證榮耀大君王已降臨\n宣告主已得勝\n\n喔 哈利路亞 哈利路 讚美主\n哈利路亞 哈利路 讚美主\n哈利路亞 主我稱頌祢\n哈利路亞 祢已得勝");
        }
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btnWordKid03View:
                    Uri uri= Uri.parse(strUrl[number-1]);
                    Intent i=new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(i);
                    break;
                case R.id.btnWordKid03Previous:
                    finish();
                    break;
                case R.id.btnWordKid03Family:
                    Intent family=new Intent();
                    family.setClass(wordKid03.this, FamilyArticle.class);
                    startActivity(family);
                    break;
                case R.id.btnWordKid03Home:
                    finish();
                    menuKid03.instance.finish();
                    break;
            }
        }
    };
}
