package com.casper.test.kid01;

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


public class wordKid01 extends AppCompatActivity {

    private TextView text;
    private Button _btnPrevious,_btnHome,_btnFamily;
    private ImageView btnImage;
    private int number=0,vWidth=120,vHeight=60;
    private String[] strUrl={"https://www.youtube.com/watch?v=QJnf12apEYk&index=1&list=PLEY_M7xVVeAvuApsLoYYw843NRM8XdfIn","https://www.youtube.com/watch?v=szDR9OjzaQQ&index=2&list=PLEY_M7xVVeAvuApsLoYYw843NRM8XdfIn",
                            "https://www.youtube.com/watch?v=LYl1c75JUkk&list=PLEY_M7xVVeAvuApsLoYYw843NRM8XdfIn&index=3","https://www.youtube.com/watch?v=waBUq-oLdrc&index=4&list=PLEY_M7xVVeAvuApsLoYYw843NRM8XdfIn",
                            "https://www.youtube.com/watch?v=sBYlCEmJluw&index=5&list=PLEY_M7xVVeAvuApsLoYYw843NRM8XdfIn","https://www.youtube.com/watch?v=jgspW0pOSng&list=PLEY_M7xVVeAvuApsLoYYw843NRM8XdfIn&index=6",
                            "https://www.youtube.com/watch?v=O8hAuNkkF18&index=7&list=PLEY_M7xVVeAvuApsLoYYw843NRM8XdfIn","https://www.youtube.com/watch?v=2obXxUOg8H8&list=PLEY_M7xVVeAvuApsLoYYw843NRM8XdfIn&index=8",
                            "https://www.youtube.com/watch?v=bhS0D7Gd-Ek&list=PLEY_M7xVVeAvuApsLoYYw843NRM8XdfIn&index=9","https://www.youtube.com/watch?v=PkrUXCm8OLE&index=10&list=PLEY_M7xVVeAvuApsLoYYw843NRM8XdfIn"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_kid01);

        text =(TextView)findViewById(R.id.textViewKid01);
        text.setOnTouchListener(new ZoomListenter());

        btnImage =(ImageView) findViewById(R.id.btnWordKid01View);
        btnImage.setImageResource(R.drawable.youtube);
        btnImage.getLayoutParams().width=vWidth;
        btnImage.getLayoutParams().height=vHeight;
        btnImage.setOnClickListener(btnListener);

        _btnPrevious=(Button)findViewById(R.id.btnWordKid01Previous);
        _btnHome=(Button)findViewById(R.id.btnWordKid01Home);
        _btnPrevious.setOnClickListener(btnListener);
        _btnHome.setOnClickListener(btnListener);

        _btnFamily=(Button)findViewById(R.id.btnWordKid01Family);
        _btnFamily.setOnClickListener(btnListener);

        _btnHome.setEnabled(true);
        Intent intent = getIntent();
        number = intent.getIntExtra("Number", 1);
        int ser=intent.getIntExtra("Search",1);
        if(ser==2){
            _btnHome.setEnabled(false);
        }
        if(number==1){
            text.setText("我的盼望 就在天父懷抱裡\n在你裡面 滿有平安\n生命泉源 就在天父懷抱裡\n有主在我裡面活著\n我宣告在我裡面的 比世上一切更有能力\n我不屬這世界 我高舉天父的名\n我宣告在我裡面有 活水湧流滿有能力\n有天父在我裡面活著 我勇敢站立\n\n有主在我裡面 沒有懼怕能戰勝仇敵\n有主在我裡面 沒有懼怕還得勝有餘");
        }
        else if(number==2){
            text.setText("無論是住在 美麗的高山\n或是躺臥在 陰暗的幽谷\n當你抬起頭 你將會發現\n主已為你我而預備\n雲上太陽它總不改變\n雖然小雨灑在臉上\n雲上太陽它總不改變\n哈 它不改變");
        }
        else if(number==3){
            text.setText("藍天是白雲最美的故鄉\n大地是小草成長的地方\n海洋是河流安歇的暖房\n夢想是未來幸福天堂\n\n小小的夢想能成就大事\n只有仰望天父的力量\n小小的夢想能改變世界\n帶來明天的盼望\n\n真父母是我們的力量\n同心來為主傳揚來發光\n前面的道路全然交給祂\n祂必同在使我們剛強");
        }
        else if(number==4){
            text.setText("奇妙恩典 奇妙作為\n唯有祢 唯有祢 掌管一切\n奇妙君王 奇妙作為\n唯有祢 唯有祢 時時同在\n\n愛祢 愛祢 愛祢 愛祢\n祢是我這一生最深愛的主\n愛祢 愛祢 愛祢 愛祢\n祢是我這一切 永遠的依靠");
        }
        else if(number==5){
            text.setText("我要天天讚美我的主\n祂是我最好的朋友\n沒有心事不能對祂說\n每天讚美每天喜樂\n啦啦啦啦啦啦啦啦啦啦\n啦啦啦啦啦啦啦啦啦\n啦啦啦啦啦啦啦啦啦啦\n啦啦啦啦啦啦啦啦啦\n我要天天禱告我的主\n祂是我力量的來源\n在祂沒有什麼難成的事\n每天禱告每天得力");
        }
        else if(number==6){
            text.setText("主的喜樂是我力量\n祢的救恩是我盼望\n雖然橄欖樹不效力\n也許葡萄樹不結果\n我仍因救我的神歡欣快樂\n\n我要讚美 無論得時或不得時\n我要讚美 每天從日出到日落\n我心堅定於祢 每天讚美不停\n我要讚美 跳舞讚美\n我要讚美 自由讚美\n大聲歡呼 祢是永遠 得勝君王");
        }
        else if(number==7){
            text.setText("一起來shaky shaky time before the Lord\n一起來shaky shaky time before the Lord\n謝謝愛我的阿爸父 我要向祂大聲歡呼\n一起來shaky shaky time before the Lord\n當我難過傷心 一個人哭泣\n天父是我安慰\n當我快要放棄 祂叫煩惱 go away\n使我能大聲唱");
        }
        else if(number==8){
            text.setText("從天父而來的愛和恩典\n把我們冰冷的心溶解\n讓我們獻出每個音符\n把它化為讚美之泉\n讓我們張開口 舉起手\n向永生之主稱謝\n使讚美之泉流入\n每個人的心間");
        }
        else if(number==9){
            text.setText("我要向高山舉目 我的幫助從何來\n我的幫助從造天地的耶和華而來\n我要向高山舉目 我的幫助從何來\n我的幫助從造天地的耶和華而來\n哈利路亞 哈利路亞\n哈利路亞 哈利路\n哈利路亞 哈利路亞\n哈利路亞 哈利路\n我的幫助從造天地的耶和華而來");
        }
        else if(number==10){
            text.setText("星星快樂閃爍 月亮高掛天空\n快快進入夢鄉 讓夢想飛翔\n願創造宇宙萬物的天父賜你平安\n我讚美祢天父 我讚美祢天父\n牽著祢的手 心安靜交托\n輕輕閉上雙眼 在夢裡讚美\n感謝天父日日夜夜看顧我 不離開我\nGood night, my baby.\nGood night, 我的寶貝");
        }
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btnWordKid01View:
                    Uri uri= Uri.parse(strUrl[number-1]);
                    Intent i=new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(i);
                    break;
                case R.id.btnWordKid01Previous:
                    finish();
                    break;
                case R.id.btnWordKid01Family:
                    Intent family=new Intent();
                    family.setClass(wordKid01.this, FamilyArticle.class);
                    startActivity(family);
                    break;
                case R.id.btnWordKid01Home:
                    finish();
                    menuKid01.instance.finish();
                    break;
            }
        }
    };

}
