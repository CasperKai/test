package com.casper.test.jesus2014;

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

public class wordJesus2014 extends AppCompatActivity {
    private TextView text2014;
    private Button _btnPrevious,_btnHome,_btnFamily;
    private ImageView btnWord2014Image;
    private int number=0,vWidth=120,vHeight=60;
    private String[] strUrl={"https://www.youtube.com/watch?v=HxSY1b_QNPY&list=PLsksQwX2io8RQFZ-wRxJs-Q0C9C2pQbbY&index=2","https://www.youtube.com/watch?v=5OI4vbg7cas&index=7&list=PLsksQwX2io8RQFZ-wRxJs-Q0C9C2pQbbY",
                            "https://www.youtube.com/watch?v=GvHDkmCdl3M&index=4&list=PLsksQwX2io8RQFZ-wRxJs-Q0C9C2pQbbY","https://www.youtube.com/watch?v=yiwS80LpYbM&index=6&list=PLsksQwX2io8RQFZ-wRxJs-Q0C9C2pQbbY",
                            "https://www.youtube.com/watch?v=RvHpXz3jPoY","https://www.youtube.com/watch?v=QyMmAcjyJYY",
                            "https://www.youtube.com/watch?v=MAk36fUSSVU&index=3&list=PLsksQwX2io8RQFZ-wRxJs-Q0C9C2pQbbY","https://www.youtube.com/watch?v=unArffT_8Ho&index=8&list=PLsksQwX2io8RQFZ-wRxJs-Q0C9C2pQbbY",
                            "https://www.youtube.com/watch?v=IvjBZiQl648&list=PLsksQwX2io8RQFZ-wRxJs-Q0C9C2pQbbY&index=5","https://www.youtube.com/watch?v=NxHX_1OUzZo",
                            "https://www.youtube.com/watch?v=zbue0YDh9Ss","https://www.youtube.com/watch?v=u60hjD-OlqA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_jesus2014);

        text2014 =(TextView)findViewById(R.id.textView2014);
        text2014.setOnTouchListener(new ZoomListenter());

        _btnPrevious=(Button)findViewById(R.id.btnJesus2014Previous);
        _btnHome=(Button)findViewById(R.id.btnJesus2014Home);
        btnWord2014Image =(ImageView) findViewById(R.id.btnWord2014View);
        btnWord2014Image.setImageResource(R.drawable.youtube);
        btnWord2014Image.getLayoutParams().width=vWidth;
        btnWord2014Image.getLayoutParams().height=vHeight;
        btnWord2014Image.setOnClickListener(btnListener);
        _btnPrevious.setOnClickListener(btnListener);
        _btnHome.setOnClickListener(btnListener);

        _btnFamily=(Button)findViewById(R.id.btnJesus2014Family);
        _btnFamily.setOnClickListener(btnListener);

        _btnHome.setEnabled(true);
        Intent intent = getIntent();
        number = intent.getIntExtra("Number", 1);
        int ser=intent.getIntExtra("Search",1);
        if(ser==2){
            _btnHome.setEnabled(false);
        }

        if(number==1){
            text2014.setText("無論或死或生或天使\n執政掌權現在或將來\n或高處低處任何受造物\n都不能將我與你愛隔絕\n\nOh oh oh...Oh oh oh...\n\n主你的愛情 刻在我心版上\n眾水不能熄滅 海不能淹沒\n主你的愛情 堅強勝過死亡\n都不能將我與你愛隔絕\n\n我知道故事結局\n我終將從曠野出來\n是靠著我心所愛\n\n你愛最高 你愛最寬廣\n你愛最深 你愛無止盡\n\nIt is Your strong love\nYour strong love");
        }
        else if(number==2){
            text2014.setText("國度屬於你 一切權能 \n一切榮耀永遠屬於你\n天地都要跪拜 因你奇妙聖名\n\n天堂門打開 死亡不再\n一切榮耀永遠屬於你\n沒有人能阻擋 你名充滿能力\n\n萬王之王\n全地都揚聲歌唱 永恆的上帝\nYou are wonderful \nYou are wonderful\n\n讓全地歡唱 來讚美你\n上帝直到永遠 光照大地\n因為你奇妙聖名\n因為 榮耀屬於你\n上帝直到永遠 榮耀屬於你");
        }
        else if(number==3){
            text2014.setText("你聖名 使群山搖晃震動\n你聖名 使海洋波濤洶湧\n因你名 天使跪拜\n你百姓歡欣 呼喊你聖名\n\n全地的救主 我們呼喊 你聖名\n不住的讚美 充滿諸天 到地極\nYahweh Yahweh\n我真愛呼喊你聖名\n\n你聖名 使清晨充滿榮光\n你聖名 讓萬物讚嘆宣揚\n因你名 天使跪拜\n你百姓歡欣 呼喊你聖名\n\n無人能與你相比\n我們讚美 讚美\n沒有人能像你 (耶穌唯有你)\n我高舉 你聖名");
        }
        else if(number==4){
            text2014.setText("阿爸父 諸天呼喊你聖名\n大聲唱 讓讚美充滿這地\n你聽見嗎 天堂正在入侵全地\n天堂正在入侵全地\n\nSpirit Break Out 城牆倒塌\nSpirit Break Out 天堂降下\n\n大君王 我們高舉你聖名\n你榮耀 從天震動到地心\n大復興 我要看到你國降臨\n我要看到你國降臨");
        }
        else if(number==5){
            text2014.setText("凡勞苦重擔的 都到這裡來\n疲憊受壓制的 祂要來恢復\n放手來到我主耶穌的腳前\n卸下這一切 就讓祂來掌權\n\n就是現在 來觸摸我\n讓我的心 被滿足\n用你雙手 來擁抱我\n在你懷中 不放手\n\n讓我奔向你懷中 \n跳進你的愛裡\n因你必按照我本相來愛我接納我");
        }
        else if(number==6){
            text2014.setText("耶穌 我要愛慕你\n我要愛慕你 傾倒我的生命\n你是我唯一所求 讓我心單單渴慕你\n\n我心滿溢 我心滿溢\n對你的愛和思念無止盡\n讓我走向 你的身旁 貼近你\n主啊 我渴慕尋求你");
        }
        else if(number==7){
            text2014.setText("我要回到一開始\n當你找到我\n我要回到你的心\n我降服於你\n讓我 獻上一切所有\n\n我要回到一開始\n你釋放我自由\n我要感受你心\n讓心跳合一\n讓我 獻上一切所有\n\n你永不停止愛我\n不管離你有多遠\n你永不會放棄我\n整個天國宣告\n未來從此開始\n\nI feel alive\nI come alive\nI am alive \nOn God's great dance floor");
        }
        else if(number==8){
            text2014.setText("黎明之際 盼望興起\n我仰望你 宣告你名\n讓我與你 心跳合一\n就在這裡 與你同行\n\n在我眼中有火 被你點燃\n不羈的愛 燃燒起來\n永恆的光 街頭綻放\n你突破黑夜衝出來\n\n你的愛一直都在\n永遠不會離開\n為了我 而存在\n要點燃這個世代\n\n你讓我甦醒 讓我甦醒\n你的愛充滿我心\n你的愛 你的愛 你的愛\n到永遠 (我知道)");
        }
        else if(number==9){
            text2014.setText("我願全心榮耀耶穌 \n放棄倚靠我自己的驕傲\n你的祝福無法測度 \n靠你能力我能勝過世界\n\n而我不再看我所有成就 如同手中珍寶\n一切獎賞都不能夠 與你的恩典相比\n\n耶穌基督 我的倚靠\n你的十字架是我永遠的榮耀\n生命每個氣息 都是屬於你\n我的源頭 我的盼望\n是你我主\n\n我願全心榮耀耶穌 \n因你恩典使我得新生命\n你的憐憫觸摸我心 \n你慈愛為我的軟弱效力\n\n而我這一生別無所求 只願更認識你\n所有成就都不能夠 與我的主榮耀相比");
        }
        else if(number==10){
            text2014.setText("我獻上一顆敬拜的心\n指的就是我全所有\n每個呼吸每個決定都為了你\n直到你再來那一天\n\n無論要付什麼代價\n你說敬拜不可虛假\n只要祭物是來自我心靈主你就悅納\n無論要付什麼代價\n當我再次說我愛你\n我會真誠發自我內心\n\n心與心 心與心 深淵與深淵響應\n被火煉 被潔淨 按你所是的敬拜你");
        }
        else if(number==11){
            text2014.setText("找不到什麼雄糾俊馬\n只有行囊 你坐在一隻小小驢駒上\n看不見什麼悲傷預言 \n只有歡唱 迎接大君王 \n他們說 當你憐憫彎腰 沙地一畫\n那些手 放下石頭 放了她 \n他們說 惡人罪有應得\n決不原諒 你卻擁抱他 \n\n沈默捨下冠冕衣裳 \n擁抱失喪 他們曾擁你作王 \n一轉眼 你挺起胸膛\n堅決激昂 鮮血換花香\n\n你是亮光 耀眼綻放 自由鐘聲徹響\n當我軟弱 成為我力量\n世界的真光 全地盼望\n\n沈默捨下冠冕衣裳 擁抱失喪\n堅守十字路決不退讓 \n心滄桑 你閉口不言\n一肩收藏 救贖的重量\n\n萬里晴朗 耀眼光芒 自由鐘聲徹響 \n當我軟弱 成為我力量 \n愛如同豔陽 群花綻放");
        }
        else if(number==12){
            text2014.setText("他的恩膏已膏在我們身上\n使我們有能力\n叫我們要成就比他更大\n更榮耀的事情\n他的靈要澆灌凡有血氣的人\n被恢復敬拜你\n讓每個人都能經歷他的生命\n\n(It's ) Now Now Now\n被虜的要得釋放\nNow Now Now\n瞎眼的就要看見\nNow Now Now\n鎖鏈要完全斷開\n(Now Now Now 生命要完全自由)\n不是未來就是現在\n他的國度已來到\n(It's Now)\n\n因著他的生命我們得勝\n(不再被捆綁)");
        }


    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btnWord2014View:
                    Uri uri= Uri.parse(strUrl[number-1]);
                    Intent i=new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(i);
                    break;
                case R.id.btnJesus2014Previous:
                    finish();
                    break;
                case R.id.btnJesus2014Family:
                    Intent family=new Intent();
                    family.setClass(wordJesus2014.this, FamilyArticle.class);
                    startActivity(family);
                    break;
                case R.id.btnJesus2014Home:
                    finish();
                    menuJesus2014.instance.finish();
                    break;
            }
        }
    };

}
