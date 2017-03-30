package com.casper.test.streamOfPraise21;

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

public class word21 extends AppCompatActivity {
    private TextView text21;
    private ImageView btnWord21Image;
    private Button _btnPrevious,_btnHome;
    private int number=0,vWidth=120,vHeight=60;
    private String[] strUrl={"https://www.youtube.com/watch?v=1VOBEx3m7Ro&list=PLEY_M7xVVeAuABi1hSSalRMJ1UNzGBIBE","https://www.youtube.com/watch?v=aCrjhEkNcpc&index=5&list=PLEY_M7xVVeAuABi1hSSalRMJ1UNzGBIBE",
                            "https://www.youtube.com/watch?v=jvI7dY6Mz-0&list=PLEY_M7xVVeAuABi1hSSalRMJ1UNzGBIBE&index=6","https://www.youtube.com/watch?v=fJ3xrwudlCc&index=11&list=PLEY_M7xVVeAuABi1hSSalRMJ1UNzGBIBE",
                            "https://www.youtube.com/watch?v=08YrvyT5HHs&index=14&list=PLEY_M7xVVeAuABi1hSSalRMJ1UNzGBIBE","https://www.youtube.com/watch?v=WedXepD_pY8&index=19&list=PLEY_M7xVVeAuABi1hSSalRMJ1UNzGBIBE",
                            "https://www.youtube.com/watch?v=XYTtbthM4KI&index=21&list=PLEY_M7xVVeAuABi1hSSalRMJ1UNzGBIBE","https://www.youtube.com/watch?v=Cxg_FSZaMvA",
                            "https://www.youtube.com/watch?v=lZ-s10eaSug&index=3&list=PLEY_M7xVVeAuABi1hSSalRMJ1UNzGBIBE","https://www.youtube.com/watch?v=qzAi1ITmooQ&index=9&list=PLEY_M7xVVeAuABi1hSSalRMJ1UNzGBIBE",
                            "https://www.youtube.com/watch?v=hSYtcWLUcI8&index=2&list=PLEY_M7xVVeAuABi1hSSalRMJ1UNzGBIBE","https://www.youtube.com/watch?v=cpTM95V7HNE&list=PLEY_M7xVVeAuABi1hSSalRMJ1UNzGBIBE&index=10"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word21);

        text21 =(TextView)findViewById(R.id.textView21);
        text21.setOnTouchListener(new ZoomListenter());

        btnWord21Image =(ImageView) findViewById(R.id.btnWord21View);
        btnWord21Image.setImageResource(R.drawable.youtube);
        btnWord21Image.getLayoutParams().width=vWidth;
        btnWord21Image.getLayoutParams().height=vHeight;
        btnWord21Image.setOnClickListener(btnListener);

        _btnPrevious=(Button)findViewById(R.id.btnWord21Previous);
        _btnHome=(Button)findViewById(R.id.btnWord21Home);
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
            text21.setText("求祢降下同在\n在祢子民的敬拜中\n求祢顯出榮耀\n在祢子民的讚美中\n\n我要看見 我要看見\n如同摩西看見祢的榮耀\n我要看見 我要看見\n這世代要看見祢榮耀\n\n我們呼求祢的名\n求祢恩待我們\n我們宣告祢的名\n求祢憐憫我們\n求祢與我們同行\n使我們得安息\n在祢眼前蒙恩");
        }
        else if(number==2){
            text21.setText("讓我坦然無懼來到施恩座前\n用心靈誠實尋求祢\n親愛的天父我何等地需要祢\n需要更多祢的同在\n在我生命\n\n每一天 我需要祢\n祢話語如甘霖\n每時刻 我需要祢\n聖靈如雨降臨\n\n這是我的禱告\n願我生命單單歸榮耀給祢天父\n這是我的呼求\n每天都更愛祢\n永不失去起初愛你的心");
        }
        else if(number==3){
            text21.setText("我的靈安靜在祢面前\n深知道祢就在這裡\n我的靈降服在祢面前\n知道祢是我的神\n\n讓我得見祢的榮面\n彰顯祢心意使我看見\n我要在這裡見到祢\n定意要見祢的榮耀\n\n讓我得見祢的榮面\n回應祢心意與祢相連\n我要在這裡敬拜祢\n定意要見祢的榮耀\n\n榮耀同在充滿在這裡\n羔羊寶座設立在這裡\n榮耀同在充滿在這裡\n羔羊寶座設立在這裡");
        }
        else if(number==4){
            text21.setText("天地父母 榮耀父神彰顯\n救贖真光萬國的盼望\n祢的國度 寶座存到永遠\n唯有祢配得所有頌讚\n\n獻上尊榮 尊榮\n給天父母 在萬民之上\n獻上敬拜 敬拜\n願祢崇高在全地之上\n\n日出之地 到日落之處\n唯有祢名 被尊崇為大\n最小部落 到最大國家\n凡有氣息都歸榮耀給祢");
        }
        else if(number==5){
            text21.setText("高舉我的雙手 聖靈來充滿我\n更深地渴求主 認識祢更多\n進入水深之處 我心炙熱燃燒\n只為愛祢 傾倒一切敬拜祢\n\n帶我進入 更深之處\n帶我進入 祢心意深處\n帶我走向 更高之處\n完全獻上 聆聽祢聲音 來愛祢\n\n從前耳聞有祢 現在親眼見祢\n渴望在祢同在裡 更多親近\n從前耳聞有祢 現在親眼見祢\n渴望在祢同在裡 更多與祢親近");
        }
        else if(number==6){
            text21.setText("若你渴了 來我這裡\n若你累了 來我這裡\n卸下一切 來我這裡\n我必使你 得著安息\n近前來 放下重擔\n我已為你 付出所有\n近前來 聽我聲音\n我必使你 得著安息 得著安息\n\n主我渴了 到祢這裡\n主我累了 到祢這裡\n卸下一切 到祢這裡\n祢必使我 得著安息\n近前來 放下重擔\n祢已為我 付出所有\n近前來 聽祢聲音\n祢必使我 得著安息 得著安息\n\n天父 天父 天父 我需要祢(x2)");
        }
        else if(number==7){
            text21.setText("祢是行神蹟的神\n絕望中賜下盼望\n瞎眼看見疾病都醫治\n在祢沒有不可能的事\n祢是行神蹟的神\n絕望中賜下盼望\n在祢沒有轉動的影兒\n每個應許都實在阿住\n\n所以我要 要歡呼\n一遍一遍不停來歡呼\n直到耶利哥的城牆\n一片片倒塌\n所以我要 要相信\n一遍一遍不停來宣告\n直到每個大能應許\n都完全成就 成就");
        }
        else if(number==8){
            text21.setText("這是耶和華所定日子\n神的兒女當歡呼喜樂\n耶和華已戰勝仇敵 戰勝仇敵\n全地大聲歡呼(x2)\n\n耶和華是我力量\n我心中一切的盼望\n耶和華是我的詩歌\n又是我的拯救\n神子民行走全地\n報好消息宣告祢的名\n高舉得勝的旌旗\n我們稱謝祢 祢是我神");
        }
        else if(number==9){
            text21.setText("主我屬於祢 求祢差遣 我就跟隨\n祢說話 我就順服\n勇敢愛 祢所愛的\n我們屬於祢 求主開啟 我們眼睛\n每世代 向祢呼求\n祢教我 如何爭戰\n讓我們不分彼此\n眾教會 同心呼求\n\n這世代 要呼求祢\n呼求祢的愛降臨\n高舉起 代禱雙手\n我們心 與祢合一\n這世代 要呼求祢\n呼求祢的愛降臨\n破口中 勇敢站立\n祢旨意 成就這地\n\n緊緊跟隨 緊緊跟隨\n緊緊跟隨祢心意\n永不放棄 永不放棄\n直到祢的國降臨");
        }
        else if(number==10){
            text21.setText("在至高之處 我獻上感恩\n在至高之處 我舉手敬拜\n天使天軍 同聲讚美天父\n最大的榮耀 都歸與祢\n\n在至高之處 榮耀歸與神\n在地上平安 歸與祂所喜悅的人\n哈利路亞 哈利路亞\n祢配得最大的榮耀");
        }
        else if(number==11){
            text21.setText("有一個夢想 在我心頭\n一路上不該 有人獨自停留\n只要你願意 小小亮光\n能在黑暗裡照亮\n為所愛的發出聲音\n唱一首歌讓世界傾聽\n手握著手就有溫暖\n活得精彩都是因為愛\n\n為愛而生 為愛而活\n為愛去付出擁抱不放手\n為愛流淚 為愛而笑\n為愛我願意一路同行\n愛裡沒有孤單 沒有懼怕\n放下自己 多走一里路\n單單相信 沒有保留\n因為愛裡滿有奇蹟\n\n愛將不可能 變為可能\n能傳遞愛 為愛活過 就是值得");
        }
        else if(number==12){
            text21.setText("耶和華有恩惠不輕易發怒\n滿有憐憫慈愛到萬代\n張開雙手 使萬物得飽足\n信靠祢我什麼都不缺\n\n我的心要單單倚靠祢\n我的口要大聲讚美祢\n祢必成就美好事在我生命\n我要永遠稱頌祢的名");
        }
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btnWord21View:
                    Uri uri= Uri.parse(strUrl[number-1]);
                    Intent i=new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(i);
                    break;
                case R.id.btnWord21Home:
                    finish();
                    menu21.instance.finish();
                    break;
                case R.id.btnWord21Previous:
                    finish();
                    break;
            }
        }
    };

}
