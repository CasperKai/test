package com.casper.test.streamOfPraise19;

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

public class word19 extends AppCompatActivity {
    private TextView text19;
    private ImageView btnWord19Image;
    private Button _btnPrevious,_btnHome;
    private int number=0,vWidth=120,vHeight=60;
    private String[] strUrl={"https://www.youtube.com/watch?v=61tcxSdsVjw&list=PLEY_M7xVVeAsgIIa3oXTc_dXamk25Jxmn&index=1","https://www.youtube.com/watch?v=a5X4uawExEA&index=2&list=PLEY_M7xVVeAsgIIa3oXTc_dXamk25Jxmn",
                            "https://www.youtube.com/watch?v=ADg-yNGjPVA&list=PLEY_M7xVVeAsgIIa3oXTc_dXamk25Jxmn&index=3","https://www.youtube.com/watch?v=QwNYhuoEADc&index=4&list=PLEY_M7xVVeAsgIIa3oXTc_dXamk25Jxmn",
                            "https://www.youtube.com/watch?v=poD9Qz5W1qE&list=PLEY_M7xVVeAsgIIa3oXTc_dXamk25Jxmn&index=5","https://www.youtube.com/watch?v=_1qAkP0M87I&index=6&list=PLEY_M7xVVeAsgIIa3oXTc_dXamk25Jxmn",
                            "https://www.youtube.com/watch?v=0bUQQBx4n3w&index=7&list=PLEY_M7xVVeAsgIIa3oXTc_dXamk25Jxmn","https://www.youtube.com/watch?v=u4_BDnIWAhs&index=8&list=PLEY_M7xVVeAsgIIa3oXTc_dXamk25Jxmn",
                            "https://www.youtube.com/watch?v=WA8MqGNWRTQ&index=9&list=PLEY_M7xVVeAsgIIa3oXTc_dXamk25Jxmn","https://www.youtube.com/watch?v=ToCWOT18ELU&index=10&list=PLEY_M7xVVeAsgIIa3oXTc_dXamk25Jxmn",
                            "https://www.youtube.com/watch?v=YeyxGH1ENtQ&list=PLEY_M7xVVeAsgIIa3oXTc_dXamk25Jxmn&index=11","https://www.youtube.com/watch?v=za0aGWW7kTU&list=PLEY_M7xVVeAsgIIa3oXTc_dXamk25Jxmn&index=12",
                            "https://www.youtube.com/watch?v=FTeiWLE3TRI&index=13&list=PLEY_M7xVVeAsgIIa3oXTc_dXamk25Jxmn","https://www.youtube.com/watch?v=Zx1AMuYdykw&list=PLEY_M7xVVeAsgIIa3oXTc_dXamk25Jxmn&index=14"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word19);

        text19 =(TextView)findViewById(R.id.textView19);
        text19.setOnTouchListener(new ZoomListenter());

        btnWord19Image =(ImageView) findViewById(R.id.btnWord19View);
        btnWord19Image.setImageResource(R.drawable.youtube);
        btnWord19Image.getLayoutParams().width=vWidth;
        btnWord19Image.getLayoutParams().height=vHeight;
        btnWord19Image.setOnClickListener(btnListener);

        _btnPrevious=(Button)findViewById(R.id.btnWord19Previous);
        _btnHome=(Button)findViewById(R.id.btnWord19Home);
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
            text19.setText("哈利路亞 哈利路亞\n這裡有榮耀\n哈利路亞 哈利路亞\n這裡有醫治湧流\n哈利路亞 哈利路亞\n這裡有光明自由\n敬拜聲音如眾水湧流\n永活的主祢在這裡\n\n祢是起初的 末後的\n昔在今在永在的主\n全心敬拜祢 大聲歡呼\n羔羊被高舉\n公義的日頭 如光照耀\n萬國讚嘆祢的榮美\n聖潔公義主 明亮晨星\n昔在 今在 永在的君王");
        }
        else if(number==2){
            text19.setText("宇宙的中心 天父\n世界的中心 天父\n萬物都本於祢\n屬於祢 歸於祢\n祢是榮耀君王\n\n我們歡迎 君王降臨\n渴望看見 祢的彰顯\n呼求祢來翻轉 震動這土地\n復興我們聖潔的熱情\n我們歡迎 君王降臨\n同心高舉 祢聖潔的名\n呼求天窗打開 春雨不停息\n我們呼喊歡迎君王降臨\n\n大大張口 大大充滿\n恩膏如雨 澆灌這地\n眼未看見 耳未聽見\n渴慕更多 看見祢的榮面");
        }
        else if(number==3){
            text19.setText("主祢拯救我\n在大水混亂之中\n主祢保守我\n與仇敵爭戰時候\n主祢醫治我\n在疾病痛苦之中\n主祢應允我\n在呼求祢的時候\n\n哈利路亞 [哈利路亞]\n我要發出極大的聲音\n[我要發出極大的聲音]\n哈利路亞 [哈利路亞]\n我要擊鼓跳舞來讚美祢\n[我要擊鼓跳舞來讚美祢]\n哈利路亞 [哈利路亞]\n我要大聲大聲來敬拜祢\n[我要大聲大聲來敬拜祢]\n哈利路亞 [哈利路亞]\n我要跳舞跳舞來讚美祢\n[我要跳舞跳舞來讚美祢]\n\n喜樂油代替悲哀\n讚美衣代替憂傷\n祢賜華冠於我們\n在生命中做王");
        }
        else if(number==4){
            text19.setText("主求祢完全地來充滿我\n聖靈來澆灌我的心\n使我更多愛祢\n深深地來愛祢\n獻上一切為祢\n\n更多充滿 更多澆灌\n倒空自己與祢來交換\n更多充滿 更多澆灌\n願我心為祢掌管");
        }
        else if(number==5){
            text19.setText("要將榮耀能力 歸給耶和華\n祂名所當得的 榮耀歸給祂\n不分種族國家 齊聲來頌揚\n在寶座前高舉雙手\n\n從這代到那代\n萬民不停頌讚\n從地極到地極\n萬民歡然獻祭\n從列國到列邦\n齊尊崇祢為王\n高唱哈利路亞\n齊敬拜彌賽亞");
        }
        else if(number==6){
            text19.setText("每一天渴望與祢在愛中相遇\n再一次將自己完全地獻給祢\n唯有祢是我的喜樂和力量\n我甘願捨棄一切跟隨祢\n\n每一天渴望與祢在愛中相遇\n再一次降服在祢大能榮耀裡\n唯有祢是我的良人和恩友\n我願意一生敬拜榮耀祢\n\n將我全人獻上當作活祭\n以清潔的心\n單單事奉祢\n願祢旨意成全在我的生命裡\n求聖靈更新\n掌管我一生\n\n潔淨我 吸引我 快跑跟隨祢\n在愛中遇見祢\n潔淨我 吸引我 快跑跟隨祢\n榮耀中敬拜祢");
        }
        else if(number==7){
            text19.setText("以馬內利 神與我們同在\n榮美君王 我心向祢歌唱\n以馬內利 風雨中有盼望\n榮耀同在 平靜安詳\n\n榮耀榮耀榮耀\n榮耀榮耀榮耀\n祢的大能無人能及\n聖哉聖哉聖哉\n聖哉聖哉聖哉\n暴風雨中單單仰望祢\n\n榮耀榮耀榮耀\n榮耀榮耀榮耀\n祢的榮美無人能及\n聖哉聖哉聖哉\n聖哉聖哉聖哉\n榮耀光中單單仰望祢");
        }
        else if(number==8){
            text19.setText("有ㄧ位真神 祂名字叫天父\n祂來到這世界上\n為要救贖你\n生命的意義\n盡在這福音裡\n只要你開口呼喊 天父\n\n天父是生命\n一切問題的解答\n天父是生命\n一切黑暗的亮光\n將憂傷變為喜樂\n將懼怕變為力量\n天父是永恆唯一的盼望");
        }
        else if(number==9){
            text19.setText("我的心憂傷痛悔\n搖泏閣驚惶\n多多捆綁重擔\n我不堪得祢的疼\n主祢疼我作寶貝\n不曾放棄我\n互我永遠惦祢面前\n不免閣著驚\n\n主祢的疼\n釋放我的心安慰我\n無論死或活 坎坷或開闊\n絕無什麼會當拆散\n主祢的疼\n引導我的路保護我\n從今到永遠 堅持無變換\n絕無什麼會當拆散\n主祢的疼");
        }
        else if(number==10){
            text19.setText("我能用什麼報答祢恩典\n世上的一切\n無法換取祢的愛\n白白地得來 無止盡赦免\n盡在寶血和十架\n\n謝謝祢洗淨我的罪\n謝謝祢醫治我傷悲\n謝謝祢擦乾我的眼淚\n挪去後悔釋放我的纏累\n\n謝謝祢洗淨我的罪\n謝謝祢醫治我傷悲\n謝謝祢用生命將我贖回\n我是天父永遠最愛寶貝");
        }
        else if(number==11){
            text19.setText("一起張開眼睛 看看這世界\n最美的美景 在真誠笑容裡\n一起付出真心 關愛這世界\n最美的足跡 在愛的道路裡\n\n一同向世界展望\n愛因為你而閃亮\n讓我們共享生命的亮光\n一同向世界展望\n幸福因你而延長\n讓我們共享未來的希望\n\n大手牽著小手\n同心攜手出發\n期待有一天\n處處開滿生命的花\n大手牽著小手\n分享微笑盼望\n期待那一天再也沒有\n飢餓和悲傷\n\n看見需要 就停下腳步\n使受傷的心得著安撫\n求神賜下 勇敢憐憫的心\n使我的擁抱溫暖像陽光");
        }
        else if(number==12){
            text19.setText("我們是耶和華大能的軍隊\n真理來束腰 信德是籐牌\n我們是耶和華大能的軍隊\n救恩是頭盔 有聖靈寶劍\n\n帶著聖靈印記 滿有能力\n帶著屬天權柄 勝過一切仇敵\n用信心行神蹟\n\n讓我們興起 興起為主來發光\n快跑 將福音傳到萬邦\n興起 興起為主來發光\n同心為主剛強");
        }
        else if(number==13){
            text19.setText("我向祢唱首愛的歌\n祢是我心所求\n我全心尋求祢我主\n我心唯一愛慕\n\n唯有祢照亮我每一天\n單單順服尋求祢面\n唯有祢是我最好朋友\n我真愛祢主到永遠\n\n我心屬於祢\n祢也屬我\n我心唯一愛慕");
        }
        else if(number==14){
            text19.setText("當我不明白 事情的由來\n信心不足的時候 求主幫助\n生命在於祢 萬事皆屬祢\n信心動搖的時候 我要信靠\n\n我相信祢的意念\n高過我的意念\n萬事互相效力\n叫愛神的人得益處\n我相信祢的道路\n高過我的道路\n我甘願謙卑 順服\n\n我相信祢的應許\n倚靠祢的恩典\n我甘願謙卑 順服");
        }
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btnWord19View:
                    Uri uri= Uri.parse(strUrl[number-1]);
                    Intent i=new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(i);
                    break;
                case R.id.btnWord19Previous:
                    finish();
                    break;
                case R.id.btnWord19Home:
                    finish();
                    menu19.instance.finish();
                    break;
            }
        }
    };


}
