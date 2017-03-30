package com.casper.test.kid02;

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

public class wordKid02 extends AppCompatActivity {

    private TextView text;
    private Button _btnPrevious,_btnHome,_btnFamily;
    private ImageView btnImage;
    private int number=0,vWidth=120,vHeight=60;
    private String[] strUrl={"https://www.youtube.com/watch?v=CfYmsU0xbf4&list=PLEY_M7xVVeAtlOPTXOfXvV66uC2jSwfTO","https://www.youtube.com/watch?v=o9HWwlEbGdk&list=PLEY_M7xVVeAtlOPTXOfXvV66uC2jSwfTO&index=2",
                            "https://www.youtube.com/watch?v=EYPZnp_TUjk&list=PLEY_M7xVVeAtlOPTXOfXvV66uC2jSwfTO&index=3","https://www.youtube.com/watch?v=1oV-RPWl-zU&list=PLEY_M7xVVeAtlOPTXOfXvV66uC2jSwfTO&index=4",
                            "https://www.youtube.com/watch?v=O5NB4bcPWIk&index=5&list=PLEY_M7xVVeAtlOPTXOfXvV66uC2jSwfTO","https://www.youtube.com/watch?v=vVTAOvZV1HM&list=PLEY_M7xVVeAtlOPTXOfXvV66uC2jSwfTO&index=6",
                            "https://www.youtube.com/watch?v=0X2FK_LdxOY&index=7&list=PLEY_M7xVVeAtlOPTXOfXvV66uC2jSwfTO","https://www.youtube.com/watch?v=0X2FK_LdxOY&index=7&list=PLEY_M7xVVeAtlOPTXOfXvV66uC2jSwfTO",
                            "https://www.youtube.com/watch?v=J0psQBmNnFI&index=9&list=PLEY_M7xVVeAtlOPTXOfXvV66uC2jSwfTO","https://www.youtube.com/watch?v=ms2KXm0ad10&list=PLEY_M7xVVeAtlOPTXOfXvV66uC2jSwfTO&index=10",
                            "https://www.youtube.com/watch?v=Rvx_mbn8RBQ&index=11&list=PLEY_M7xVVeAtlOPTXOfXvV66uC2jSwfTO"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_kid02);

        text =(TextView)findViewById(R.id.textViewKid02);
        text.setOnTouchListener(new ZoomListenter());

        btnImage =(ImageView) findViewById(R.id.btnWordKid02View);
        btnImage.setImageResource(R.drawable.youtube);
        btnImage.getLayoutParams().width=vWidth;
        btnImage.getLayoutParams().height=vHeight;
        btnImage.setOnClickListener(btnListener);

        _btnPrevious=(Button)findViewById(R.id.btnWordKid02Previous);
        _btnHome=(Button)findViewById(R.id.btnWordKid02Home);
        _btnPrevious.setOnClickListener(btnListener);
        _btnHome.setOnClickListener(btnListener);

        _btnFamily=(Button)findViewById(R.id.btnWordKid02Family);
        _btnFamily.setOnClickListener(btnListener);

        _btnHome.setEnabled(true);
        Intent intent = getIntent();
        number = intent.getIntExtra("Number", 1);
        int ser=intent.getIntExtra("Search",1);
        if(ser==2){
            _btnHome.setEnabled(false);
        }
        if(number==1){
            text.setText("在這美麗的時刻 我們相聚在一起\n神的愛擁抱著我們 神的靈充滿這地\n當稱謝進入祂的門 當讚美進入祂的院\n擊鼓跳舞揚聲歡呼 凡有氣息都要讚美祂\n\n讓讚美從四處響起 讓音符在空中飛舞\n讓我們的心向神敞開\n讓讚美從四處響起 讓音符在空中飛舞\n讓我們的心向神敞開");
        }
        else if(number==2){
            text.setText("我們是祢的百姓 主祢是我們的神\n用讚美打開城門 來預備祢救恩的道路\n\n呼喊吧 神的百姓呼喊吧\n耶和華 已將這城交給我們\n讓讚美的聲音不停息\n如同大水 淹沒仇敵\n\n呼喊吧 神的百姓呼喊吧\n耶和華 已將這城交給我們\n讓禱告的聲音不歇息\n直到我們 看見復興");
        }
        else if(number==3){
            text.setText("如同朝露中的小草 藍天中的小鳥\n我整顆心被幸福圍繞\n哦 我慈愛的天父 認識祢真好\n祢賜的福份 別處找不著\n祢使我拋開一切煩惱\n喜樂充滿在心頭燃燒\n\n認識祢真好 認識祢真好\n今生今世 我不再尋找\n哦 主啊 認識祢真好 認識祢真好\n只願分分秒秒 在祢慈愛的懷抱");
        }
        else if(number==4){
            text.setText("你和我是天父愛的創造\n每個人有最美的夢想\n一路上彼此照亮 扶持擁抱\n\n我們的愛讓世界不一樣\n我們愛 因神先愛我們\n雖你我不一樣 我們一路唱\n走往祝福的方向\n\n我們愛 因神先愛我們\n心再堅強也不要獨自飛翔\n只要微笑 只要原諒\n有你愛的地方 就是天堂");
        }
        else if(number==5){
            text.setText("小小花園裡 紅橙黃藍綠\n每朵小花都美麗\n微風輕飄逸 藍天同歡喜\n在天父的花園裡\n你我同是寶貝 在這花園裡\n園丁細心呵護 不讓你傷心\n刮風或下雨 應許從不離開你\n天父的小花成長在祂手裡\n\n別擔心 你的成長在祂手裡");
        }
        else if(number==6){
            text.setText("這世界有個千年不變道理\n那就是 天父愛你\n在世上沒有任何的逼迫患難\n能使我們與神的愛隔絕\n你是否願意同為神的兒女\n一生讓天父愛你\n在世上沒有任何的困苦愁煩\n能使我們與神的愛隔絕");
        }
        else if(number==7){
            text.setText("天父我愛祢\n用我全心全意 天父我愛祢\n祢醫治我的心 祢滋潤我靈\n喔 天父我愛祢\n歡唱 天父我愛祢\n用我全心全意天父我愛祢\n天父祢是我最愛 我愛祢\n我愛祢 我的天父 我愛祢 我的主\n我愛祢 我的天父 我愛祢 我的主");
        }
        else if(number==8){
            text.setText("真父母 我感謝祢\n祢的身體 為我而捨\n帶我出黑暗 進入光明國度\n使我再次能看見\n\n真父母 我感謝祢\n祢的寶血 為我而流\n寶貴十架上 醫治恩典湧流\n使我完全得自由\n\n寶貴十架的大能賜我生命\n真父母我俯伏敬拜祢\n寶貴十架的救恩是祢所立的約\n祢的愛永遠不會改變");
        }
        else if(number==9){
            text.setText("願主的恩惠慈愛 與你同在\n願主的靈 時時圍繞\n恩典降下 賜福與你\n平安喜樂 天天充滿你\n\n願主的恩惠慈愛 與你同在\n願主的靈 時時圍繞\n恩典降下 賜福與你\n平安喜樂 天天充滿你\n\n賜福與你 賜福與你\n平安喜樂 天天充滿你\n賜福與你 賜福與你\n平安喜樂 天天充滿你");
        }
        else if(number==10){
            text.setText("耶和華是我牧者 我必不致缺乏\n使我躺臥青草地 在安歇的水邊\n祂使我靈魂甦醒 引我走正義路\n我雖過死陰幽谷 也必不怕遭害\n\n在我敵人面前 為我擺設筵席\n祢用油膏我的頭 使我福杯滿溢\n一生一世有恩惠 有慈愛跟隨我\n我要住在祢殿中 直到永永遠遠\n\n嘿嘿喲 嘿嘿喲 主祢與我同在\n祢的杖和祢的竿 時時都安慰我\n嘿嘿喲 嘿嘿喲 有慈愛跟隨我\n我要住在祢殿中 直到永永遠遠");
        }
        else if(number==11){
            text.setText("在祢寶座前 我獻上我的敬拜\n我高舉雙手 揚聲敬拜\n願救恩 歸與寶座上的神\n\n在祢寶座前 眾天使俯伏敬拜\n讓萬國萬邦 在天上說\n願救恩 歸與寶座上的神\n\n哈利路亞 哈利路亞\n哈利路亞 哈利路亞\n救恩 榮耀 都歸與我們的神\n哈利路亞 哈利路亞\n哈利路亞 哈利路亞\n頌讚 權能 都歸與我們的神\n直到永永遠遠");
        }
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btnWordKid02View:
                    Uri uri= Uri.parse(strUrl[number-1]);
                    Intent i=new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(i);
                    break;
                case R.id.btnWordKid02Previous:
                    finish();
                    break;
                case R.id.btnWordKid02Family:
                    Intent family=new Intent();
                    family.setClass(wordKid02.this, FamilyArticle.class);
                    startActivity(family);
                    break;
                case R.id.btnWordKid02Home:
                    finish();
                    menuKid02.instance.finish();
                    break;
            }
        }
    };
}
