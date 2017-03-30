package com.casper.test.jesus2012;

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

public class wordJesus2012 extends AppCompatActivity {

    private TextView text2012;
    private Button _btnPrevious,_btnHome,_btnFamily;
    private ImageView btnWord2012Image;
    private int number=0,vWidth=120,vHeight=60;
    private String[] strUrl={"https://www.google.com","https://www.youtube.com/watch?v=OIZkm6s4LyE&index=1&list=RDOIZkm6s4LyE",
                            "https://www.youtube.com/watch?v=1qLmST5eNRU","https://www.youtube.com/watch?v=V6T8EfvEXJo",
                            "https://www.youtube.com/watch?v=ZQCtiLUSddE","https://www.youtube.com/watch?v=3vEMZzezL7k",
                            "https://www.youtube.com/watch?v=6o0let6kJ2M","https://www.youtube.com/watch?v=cKff5z9T8gw",
                            "https://www.youtube.com/watch?v=U8oHbcrWLnc","https://www.youtube.com/watch?v=yotxA84LViQ",
                            "https://www.youtube.com/watch?v=U8oHbcrWLnc","https://www.youtube.com/watch?v=14FA6HEzqlo",
                            "https://www.youtube.com/watch?v=IfByL2X20Vo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_jesus2012);

        text2012 =(TextView)findViewById(R.id.textView2012);
        text2012.setOnTouchListener(new ZoomListenter());

        _btnPrevious=(Button)findViewById(R.id.btnJesus2012Previous);
        _btnHome=(Button)findViewById(R.id.btnJesus2012Home);
        btnWord2012Image =(ImageView) findViewById(R.id.btnWord2012View);
        btnWord2012Image.setImageResource(R.drawable.youtube);
        btnWord2012Image.getLayoutParams().width=_btnHome.getWidth();
        btnWord2012Image.getLayoutParams().height=_btnHome.getHeight();
        btnWord2012Image.setOnClickListener(btnListener);
        _btnPrevious.setOnClickListener(btnListener);
        _btnHome.setOnClickListener(btnListener);

        _btnFamily=(Button)findViewById(R.id.btnJesus2012Family);
        _btnFamily.setOnClickListener(btnListener);

        _btnHome.setEnabled(true);
        Intent intent = getIntent();
        number = intent.getIntExtra("Number", 1);
        int ser=intent.getIntExtra("Search",1);
        if(ser==2){
            _btnHome.setEnabled(false);
        }
        //第一首只有背景音樂
        if(number==1){
            text2012.setText("");
        }
        else if(number==2){
            text2012.setText("喔主 你賜我新生命\n擁有全新盼望\n得著完全的自由\n你的自由在我心\n你贖回我生命\n全因耶穌基督寶血\n我們來到你面前\n全心來敬拜\n\n有你萬事都可能\n你榮耀掌權\n\n我們高聲唱 全地都宣揚\n同心高舉全能君王\n你榮耀掌權\n主你大能叫一切都更新\n\n我們已得釋放 不再受到綑綁\n你是一切所需 願世界看見\n我為主發光");
        }
        else if(number==3){
            text2012.setText("我要全心稱頌我的主\n你拯救我使我得完全\n主唯有你能讓我心喜樂\n我要全心稱頌我的主\n\n我要宣揚你無比大愛\n讓我能進入你光明同在\n主唯有你能讓我心喜樂\n我要宣揚你無比大愛\n\n聖潔歸我主我心高聲唱\n全能神愛子我靈呼求你\n配得神羔羊一生敬拜你\n我要全心稱頌我的主\n\n我全心讚美全能尊貴神\n唯有你配得耶穌");
        }
        else if(number==4){
            text2012.setText("和散那歸於至高神\n我們高舉大君王\n\n和散那\n來高舉耶穌(我們全心來高舉耶穌)\n\n耶穌 來高舉耶穌\n我們全心高舉耶穌\n\n耶穌 耶穌\n來高舉耶穌");
        }
        else if(number==5){
            text2012.setText("我們是屬你的百姓\n同心聚集只為敬拜你\n願我們禱告 在你的座前升起\n我們宣告耶穌是主\n你掌權在我們的城市\n你國度降臨\n在這地顯你能力 我們呼求你\n主耶穌 我們要宣告\n\n我的城市 為著耶穌的榮耀\n求你彰顯 你榮耀同在\n來尊崇你聖名 高舉在全地\n喔耶穌 我主 \n我的城市 為著耶穌的榮耀\n求你彰顯 你榮耀同在\n我們同心呼求 憑信心宣告\n我的城市 屬於主耶穌\n\n我們同心呼求 為摯愛的城市\n讓我們轉離我們的惡行\n尋求你的榮面\n向你屈膝敬拜 \n向你屈膝敬拜");
        }
        else if(number==6){
            text2012.setText("純潔的心 這是我渴慕\n一顆緊跟隨著你的心\n謹記你的話語\n好讓罪不可進入\n永遠讓你來掌管\n一顆專注的心\n一顆憐憫的心\n得著你的喜悅\n讓這馨香的敬拜\n直升到你面前");
        }
        else if(number==7){
            text2012.setText("我知道你用你的愛無條件愛我\n完全赦免了我曾經犯的過錯\n我渴望新的生命能單單為你活\n用我的心 用我的靈 就只想對你說\n\n你的愛拯救了我 你的愛醫治了我\n你的愛潔淨了我 而黑暗恐懼無法躲\n你的愛恢復了我 你的愛淹沒了我\n你的愛是如此寬闊的包圍我\n\n我已經屬你 你已經屬我 我已經屬你");
        }
        else if(number==8){
            text2012.setText("我的力量我的救贖主\n我要愛你到永遠\n\n凡等候你 盼望於你的 必不致羞愧\n你就是那最堅固的磐石\n你聖名超乎一切其他的名\n\n哈利路亞 \n\n你超越一切\n無人能像你 \n你超越一切\nBeautiful Beautiful Beautiful\n無人能像你\nBeautiful Beautiful Beautiful");
        }
        else if(number==9){
            text2012.setText("主你是我的避難所 \n你愛將我緊緊的擁抱\n使我甦醒你愛裡 \n我願成為你的居所\n我要愛你要永遠堅定的愛你 \n親近你\n\n主我願讓你來擁有我的心 \n不再用力堅持倚靠我自己\n願你每句話語 都成為我命定\n改變我生命一步一步與你更靠近\n(走進你心意)\n\n沒有人能像你\n用愛滿足我心 \n你是我的唯一");
        }
        else if(number==10){
            text2012.setText("不論我逃到哪裡去 你都看顧\n不論我犯了什麼錯 你接納我\n你擦去我眼淚 跌倒你扶持我\n我的生命 因著你恩典完全\n\n不論我要往哪裡去 你都同行\n不論我無助或軟弱 你不離棄\n你擦去我眼淚 跌倒你扶持我\n我的生命 因著你恩典完全\n\n你是我天父 供應我\n你是我的拯救 你慈愛擁抱我\n環繞我 永遠不離開我\n天父我敬拜你 天父我敬拜你\n\n你愛為我存在\n你愛為我存在\n你的愛直到永遠");
        }
        else if(number==11){
            text2012.setText("沒有人像你一樣愛我\n沒有人像你一樣愛我\n沒有人像你一樣愛我 喔你愛我 \n\n沒有人像你一樣愛我\n我只需要張開我雙手\n你的憐憫恩典 \n你的慈愛寬容 環繞我\n\n不能沒有 不能沒有你\n我可以失去一切 但不能沒有你\n在你裡面 活在你裡面 我一無所缺\n\n耶穌是我最親密的朋友\n他渴望能與我(面對面) \n能與我(面對面)\n\n你何等愛我 在我心上 \n你刻下了愛的記號\n你所給我的 是能觸摸的愛 \n能觸摸的同在");
        }
        else if(number==12){
            text2012.setText("主聖靈輕輕呼喚著我的姓名\n黑暗中 你愛牽引著我\n喔我神 我的心單單渴慕敬拜你\n天使圍繞 帶領我看見你\n\n十架上擔當我罪和羞愧\n忍受鞭傷交換我生命\n恩典之流 恢復我得潔淨\n與我同在 使我堅定\n\n主的愛穿越高山直到地極\n賜下恩惠陽光在這地\n恩典之流 敬畏中我站立\n慈愛憐憫 淹沒我的心\n\n此生充滿主恩典 因你寶血信實完全\n我渴望見你榮面 述說你奇妙榮美");
        }
        else if(number==13){
            text2012.setText("喔主感謝你創造這土地 以永恆話語\n賜下無限生命 用恩典的馨香氣息\n祝福這地 讓我們全心跟隨你帶領\n喔主 感謝你創造這土地\n以慈愛澆灌 以喜樂耕耘\n用無數的白晝黑夜 孕育這地\n順服的心情 感恩的心情\n現在都只願 以基督的心為心\n\n主求你充滿我們 來醫治這地\n痛苦疾病要過去 神蹟在運行\n主求你充滿我們 來轉化這地\n黑暗權勢要離去 主求你充滿我們\n來醫治這地 全地看見你榮耀 \n你復興降臨\n\n主求你充滿我們 來轉化這地\n全地尊榮你聖名 為你而站立\n一生祝福永不停息 \n世代因你愛延續 呼求你");
        }
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btnWord2012View:
                    Uri uri= Uri.parse(strUrl[number-1]);
                    Intent i=new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(i);
                    break;
                case R.id.btnJesus2012Previous:
                    finish();
                    break;
                case R.id.btnJesus2012Family:
                    Intent family=new Intent();
                    family.setClass(wordJesus2012.this, FamilyArticle.class);
                    startActivity(family);
                    break;
                case R.id.btnJesus2012Home:
                    finish();
                    menuJesus2012.instance.finish();
                    break;
            }
        }
    };

}
