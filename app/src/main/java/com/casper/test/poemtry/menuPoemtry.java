package com.casper.test.poemtry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.casper.test.R;

import java.util.Locale;

public class menuPoemtry extends AppCompatActivity {
    private Button btn001,btn002,btn003,btn004,btn005,btn006,btn007,btn008,btn009,btn010;
    private Button btn011,btn012,btn013,btn014,btn015,btn016,btn017,btn018,btn019,btn020;
    private Button btn021,btn022,btn023,btn024,btn025,btn026,btn027,btn028,btn029,btn030;
    private Button btn031,btn032,btn033,btn034,btn035,btn036,btn037,btn038,btn039,btn040;
    private Button btn041,btn042,btn043,btn044,btn045,btn046,btn047,btn048,btn049,btn050;
    private Button btn051,btn052,btn053,btn054,btn055,btn056,btn057,btn058,btn059,btn060;
    private Button btn061,btn062,btn063,btn064,btn065,btn066,btn067,btn068,btn069,btn070;
    private Button btn071,btn072,btn073,btn074,btn075,btn076,btn077,btn078,btn079,btn080;
    private Button btn081,btn082,btn083,btn084,btn085,btn086,btn087,btn088,btn089,btn090;
    private Button _btnBack;
    public static menuPoemtry instance=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_poemtry);
        instance=this;
        _btnBack=(Button)findViewById(R.id.btnMenuPoemtryPrevious);
        btn001=(Button)findViewById(R.id.poem001相信有愛就有奇蹟);
        btn002=(Button)findViewById(R.id.poem002愛可以再更多一點點);
        btn003=(Button)findViewById(R.id.poem003為愛合一禱告);
        btn004=(Button)findViewById(R.id.poem004掌上明珠);
        btn005=(Button)findViewById(R.id.poem005禱告);
        btn006=(Button)findViewById(R.id.poem006雲上太陽);
        btn007=(Button)findViewById(R.id.poem007把冷漠變成愛);
        btn008=(Button)findViewById(R.id.poem008讚美之泉);
        btn009=(Button)findViewById(R.id.poem009常常喜樂);
        btn010=(Button)findViewById(R.id.poem010主我跟祢走);
        btn011=(Button)findViewById(R.id.poem011凡事都能做);
        btn012=(Button)findViewById(R.id.poem012轉化);
        btn013=(Button)findViewById(R.id.poem013喜樂泉源);
        btn014=(Button)findViewById(R.id.poem014煉淨我);
        btn015=(Button)findViewById(R.id.poem015恩典夠用);
        btn016=(Button)findViewById(R.id.poem016認定你);
        btn017=(Button)findViewById(R.id.poem017揀選);
        btn018=(Button)findViewById(R.id.poem018齊為此地呼求);
        btn019=(Button)findViewById(R.id.poem019看見復興);
        btn020=(Button)findViewById(R.id.poem020讓愛走動);
        btn021=(Button)findViewById(R.id.poem021生命之花);
        btn022=(Button)findViewById(R.id.poem022我需要有你在我生命中);
        btn023=(Button)findViewById(R.id.poem023這一生最美的祝福);
        btn024=(Button)findViewById(R.id.poem024奇異恩典);
        btn025=(Button)findViewById(R.id.poem025勇敢走出去);
        btn026=(Button)findViewById(R.id.poem026滿有能力);
        btn027=(Button)findViewById(R.id.poem027不要放棄);
        btn028=(Button)findViewById(R.id.poem028主禱文);
        btn029=(Button)findViewById(R.id.poem029再一次);
        btn030=(Button)findViewById(R.id.poem030單單只為你);
        btn031=(Button)findViewById(R.id.poem031認識你真好);
        btn032=(Button)findViewById(R.id.poem032阿爸天父);
        btn033=(Button)findViewById(R.id.poem033邁向新生命);
        btn034=(Button)findViewById(R.id.poem034恩典之路);
        btn035=(Button)findViewById(R.id.poem035展開清晨的翅膀);
        btn036=(Button)findViewById(R.id.poem036最珍貴的角落);
        btn037=(Button)findViewById(R.id.poem037寶貴十架);
        btn038=(Button)findViewById(R.id.poem038得釋放);
        btn039=(Button)findViewById(R.id.poem039我要全心讚美);
        btn040=(Button)findViewById(R.id.poem040我們愛讓世界不一樣);
        btn041=(Button)findViewById(R.id.poem041你愛永不變);
        btn042=(Button)findViewById(R.id.poem042住在你裡面);
        btn043=(Button)findViewById(R.id.poem043這世代);
        btn044=(Button)findViewById(R.id.poem044就是這個時刻);
        btn045=(Button)findViewById(R.id.poem045主我到你面前);
        btn046=(Button)findViewById(R.id.poem046何等恩典);
        btn047=(Button)findViewById(R.id.poem047永遠);
        btn048=(Button)findViewById(R.id.poem048賜福與你);
        btn049=(Button)findViewById(R.id.poem049請改變我);
        btn050=(Button)findViewById(R.id.poem050不能隔絕神的愛);
        btn051=(Button)findViewById(R.id.poem051腳步);
        btn052=(Button)findViewById(R.id.poem052翻轉地球);
        btn053=(Button)findViewById(R.id.poem053叫我抬起頭的神);
        btn054=(Button)findViewById(R.id.poem054如果);
        btn055=(Button)findViewById(R.id.poem055成為神蹟的器皿);
        btn056=(Button)findViewById(R.id.poem056豐盛的應許);
        btn057=(Button)findViewById(R.id.poem057我要一心稱謝你);
        btn058=(Button)findViewById(R.id.poem058經歷你的大愛);
        btn059=(Button)findViewById(R.id.poem059讓愛飛翔);
        btn060=(Button)findViewById(R.id.poem060你是配得);
        btn061=(Button)findViewById(R.id.poem061尊貴全能神);
        btn062=(Button)findViewById(R.id.poem062一生跟隨你);
        btn063=(Button)findViewById(R.id.poem063救贖的恩典);
        btn064=(Button)findViewById(R.id.poem064願讚美充滿);
        btn065=(Button)findViewById(R.id.poem065求賜復興之火);
        btn066=(Button)findViewById(R.id.poem066從破碎到自由);
        btn067=(Button)findViewById(R.id.poem067我獻上感謝);
        btn068=(Button)findViewById(R.id.poem068安靜);
        btn069=(Button)findViewById(R.id.poem069每天的禱告);
        btn070=(Button)findViewById(R.id.poem070如鷹展翅上騰);
        btn071=(Button)findViewById(R.id.poem071凡事都有可能);
        btn072=(Button)findViewById(R.id.poem072你愛不變);
        btn073=(Button)findViewById(R.id.poem073神偉大的舞池);
        btn074=(Button)findViewById(R.id.poem074堅強的愛);
        btn075=(Button)findViewById(R.id.poem075主你永遠與我同在);
        btn076=(Button)findViewById(R.id.poem076甦醒);
        btn077=(Button)findViewById(R.id.poem077差遣我);
        btn078=(Button)findViewById(R.id.poem078傾聽我的心);
        btn079=(Button)findViewById(R.id.poem079如果你想知道);
        btn080=(Button)findViewById(R.id.poem080讓讚美飛揚);
        btn081=(Button)findViewById(R.id.poem081新造的人);
        btn082=(Button)findViewById(R.id.poem082神的孩子);
        btn083=(Button)findViewById(R.id.poem083幸福);
        btn084=(Button)findViewById(R.id.poem084活出愛);
        btn085=(Button)findViewById(R.id.poem085讓我);
        btn086=(Button)findViewById(R.id.poem086更好的你);
        btn087=(Button)findViewById(R.id.poem087謙卑);
        btn088=(Button)findViewById(R.id.poem088讚美中遇見你);
        btn089=(Button)findViewById(R.id.poem089永遠的依靠);
        btn090=(Button)findViewById(R.id.poem090YouRaiseMeUp);

        _btnBack.setOnClickListener(btnListener);
        btn001.setOnClickListener(btnListener);
        btn002.setOnClickListener(btnListener);
        btn003.setOnClickListener(btnListener);
        btn004.setOnClickListener(btnListener);
        btn005.setOnClickListener(btnListener);
        btn006.setOnClickListener(btnListener);
        btn007.setOnClickListener(btnListener);
        btn008.setOnClickListener(btnListener);
        btn009.setOnClickListener(btnListener);
        btn010.setOnClickListener(btnListener);
        btn011.setOnClickListener(btnListener);
        btn012.setOnClickListener(btnListener);
        btn013.setOnClickListener(btnListener);
        btn014.setOnClickListener(btnListener);
        btn015.setOnClickListener(btnListener);
        btn016.setOnClickListener(btnListener);
        btn017.setOnClickListener(btnListener);
        btn018.setOnClickListener(btnListener);
        btn019.setOnClickListener(btnListener);
        btn020.setOnClickListener(btnListener);
        btn021.setOnClickListener(btnListener);
        btn022.setOnClickListener(btnListener);
        btn023.setOnClickListener(btnListener);
        btn024.setOnClickListener(btnListener);
        btn025.setOnClickListener(btnListener);
        btn026.setOnClickListener(btnListener);
        btn027.setOnClickListener(btnListener);
        btn028.setOnClickListener(btnListener);
        btn029.setOnClickListener(btnListener);
        btn030.setOnClickListener(btnListener);
        btn031.setOnClickListener(btnListener);
        btn032.setOnClickListener(btnListener);
        btn033.setOnClickListener(btnListener);
        btn034.setOnClickListener(btnListener);
        btn035.setOnClickListener(btnListener);
        btn036.setOnClickListener(btnListener);
        btn037.setOnClickListener(btnListener);
        btn038.setOnClickListener(btnListener);
        btn039.setOnClickListener(btnListener);
        btn040.setOnClickListener(btnListener);
        btn041.setOnClickListener(btnListener);
        btn042.setOnClickListener(btnListener);
        btn043.setOnClickListener(btnListener);
        btn044.setOnClickListener(btnListener);
        btn045.setOnClickListener(btnListener);
        btn046.setOnClickListener(btnListener);
        btn047.setOnClickListener(btnListener);
        btn048.setOnClickListener(btnListener);
        btn049.setOnClickListener(btnListener);
        btn050.setOnClickListener(btnListener);
        btn051.setOnClickListener(btnListener);
        btn052.setOnClickListener(btnListener);
        btn053.setOnClickListener(btnListener);
        btn054.setOnClickListener(btnListener);
        btn055.setOnClickListener(btnListener);
        btn056.setOnClickListener(btnListener);
        btn057.setOnClickListener(btnListener);
        btn058.setOnClickListener(btnListener);
        btn059.setOnClickListener(btnListener);
        btn060.setOnClickListener(btnListener);
        btn061.setOnClickListener(btnListener);
        btn062.setOnClickListener(btnListener);
        btn063.setOnClickListener(btnListener);
        btn064.setOnClickListener(btnListener);
        btn065.setOnClickListener(btnListener);
        btn066.setOnClickListener(btnListener);
        btn067.setOnClickListener(btnListener);
        btn068.setOnClickListener(btnListener);
        btn069.setOnClickListener(btnListener);
        btn070.setOnClickListener(btnListener);
        btn071.setOnClickListener(btnListener);
        btn072.setOnClickListener(btnListener);
        btn073.setOnClickListener(btnListener);
        btn074.setOnClickListener(btnListener);
        btn075.setOnClickListener(btnListener);
        btn076.setOnClickListener(btnListener);
        btn077.setOnClickListener(btnListener);
        btn078.setOnClickListener(btnListener);
        btn079.setOnClickListener(btnListener);
        btn080.setOnClickListener(btnListener);
        btn081.setOnClickListener(btnListener);
        btn082.setOnClickListener(btnListener);
        btn083.setOnClickListener(btnListener);
        btn084.setOnClickListener(btnListener);
        btn085.setOnClickListener(btnListener);
        btn086.setOnClickListener(btnListener);
        btn087.setOnClickListener(btnListener);
        btn088.setOnClickListener(btnListener);
        btn089.setOnClickListener(btnListener);
        btn090.setOnClickListener(btnListener);

        /*for(int i=1;i<9;i++){
            String idName="btn0"+String.format(Locale.getDefault(),"%02d",i);
            int resID = getResources().getIdentifier(idName,"id",getPackageName());
            Button bo = (Button)findViewById(resID);
            //(bo).setOnClickListener(btnListener);
        }*/

    }
    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.poem001相信有愛就有奇蹟:
                    Intent intent =new Intent();
                    intent.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent.putExtra("Number",1);
                    startActivity(intent);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem002愛可以再更多一點點:
                    Intent intent2 =new Intent();
                    intent2.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent2.putExtra("Number",2);
                    startActivity(intent2);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem003為愛合一禱告:
                    Intent intent3 =new Intent();
                    intent3.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent3.putExtra("Number",3);
                    startActivity(intent3);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem004掌上明珠:
                    Intent intent4 =new Intent();
                    intent4.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent4.putExtra("Number",4);
                    startActivity(intent4);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem005禱告:
                    Intent intent5 =new Intent();
                    intent5.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent5.putExtra("Number",5);
                    startActivity(intent5);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem006雲上太陽:
                    Intent intent6 =new Intent();
                    intent6.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent6.putExtra("Number",6);
                    startActivity(intent6);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem007把冷漠變成愛:
                    Intent intent7 =new Intent();
                    intent7.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent7.putExtra("Number",7);
                    startActivity(intent7);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem008讚美之泉:
                    Intent intent8 =new Intent();
                    intent8.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent8.putExtra("Number",8);
                    startActivity(intent8);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem009常常喜樂:
                    Intent intent9 =new Intent();
                    intent9.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent9.putExtra("Number",9);
                    startActivity(intent9);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem010主我跟祢走:
                    Intent intent10 =new Intent();
                    intent10.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent10.putExtra("Number",10);
                    startActivity(intent10);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem011凡事都能做:
                    Intent intent11 =new Intent();
                    intent11.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent11.putExtra("Number",11);
                    startActivity(intent11);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem012轉化:
                    Intent intent12 =new Intent();
                    intent12.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent12.putExtra("Number",12);
                    startActivity(intent12);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem013喜樂泉源:
                    Intent intent13 =new Intent();
                    intent13.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent13.putExtra("Number",13);
                    startActivity(intent13);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem014煉淨我:
                    Intent intent14 =new Intent();
                    intent14.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent14.putExtra("Number",14);
                    startActivity(intent14);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem015恩典夠用:
                    Intent intent15 =new Intent();
                    intent15.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent15.putExtra("Number",15);
                    startActivity(intent15);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem016認定你:
                    Intent intent16 =new Intent();
                    intent16.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent16.putExtra("Number",16);
                    startActivity(intent16);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem017揀選:
                    Intent intent17 =new Intent();
                    intent17.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent17.putExtra("Number",17);
                    startActivity(intent17);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem018齊為此地呼求:
                    Intent intent18 =new Intent();
                    intent18.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent18.putExtra("Number",18);
                    startActivity(intent18);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem019看見復興:
                    Intent intent19 =new Intent();
                    intent19.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent19.putExtra("Number",19);
                    startActivity(intent19);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem020讓愛走動:
                    Intent intent20 =new Intent();
                    intent20.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent20.putExtra("Number",20);
                    startActivity(intent20);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem021生命之花:
                    Intent intent21 =new Intent();
                    intent21.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent21.putExtra("Number",21);
                    startActivity(intent21);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem022我需要有你在我生命中:
                    Intent intent22 =new Intent();
                    intent22.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent22.putExtra("Number",22);
                    startActivity(intent22);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem023這一生最美的祝福:
                    Intent intent23 =new Intent();
                    intent23.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent23.putExtra("Number",23);
                    startActivity(intent23);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem024奇異恩典:
                    Intent intent24 =new Intent();
                    intent24.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent24.putExtra("Number",24);
                    startActivity(intent24);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem025勇敢走出去:
                    Intent intent25 =new Intent();
                    intent25.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent25.putExtra("Number",25);
                    startActivity(intent25);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem026滿有能力:
                    Intent intent26 =new Intent();
                    intent26.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent26.putExtra("Number",26);
                    startActivity(intent26);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem027不要放棄:
                    Intent intent27 =new Intent();
                    intent27.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent27.putExtra("Number",27);
                    startActivity(intent27);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem028主禱文:
                    Intent intent28 =new Intent();
                    intent28.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent28.putExtra("Number",28);
                    startActivity(intent28);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem029再一次:
                    Intent intent29 =new Intent();
                    intent29.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent29.putExtra("Number",29);
                    startActivity(intent29);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem030單單只為你:
                    Intent intent30 =new Intent();
                    intent30.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent30.putExtra("Number",30);
                    startActivity(intent30);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem031認識你真好:
                    Intent intent31 =new Intent();
                    intent31.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent31.putExtra("Number",31);
                    startActivity(intent31);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem032阿爸天父:
                    Intent intent32 =new Intent();
                    intent32.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent32.putExtra("Number",32);
                    startActivity(intent32);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem033邁向新生命:
                    Intent intent33 =new Intent();
                    intent33.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent33.putExtra("Number",33);
                    startActivity(intent33);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem034恩典之路:
                    Intent intent34 =new Intent();
                    intent34.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent34.putExtra("Number",34);
                    startActivity(intent34);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem035展開清晨的翅膀:
                    Intent intent35 =new Intent();
                    intent35.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent35.putExtra("Number",35);
                    startActivity(intent35);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem036最珍貴的角落:
                    Intent intent36 =new Intent();
                    intent36.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent36.putExtra("Number",36);
                    startActivity(intent36);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem037寶貴十架:
                    Intent intent37 =new Intent();
                    intent37.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent37.putExtra("Number",37);
                    startActivity(intent37);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem038得釋放:
                    Intent intent38 =new Intent();
                    intent38.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent38.putExtra("Number",38);
                    startActivity(intent38);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem039我要全心讚美:
                    Intent intent39 =new Intent();
                    intent39.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent39.putExtra("Number",39);
                    startActivity(intent39);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem040我們愛讓世界不一樣:
                    Intent intent40 =new Intent();
                    intent40.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent40.putExtra("Number",40);
                    startActivity(intent40);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem041你愛永不變:
                    Intent intent41 =new Intent();
                    intent41.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent41.putExtra("Number",41);
                    startActivity(intent41);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem042住在你裡面:
                    Intent intent42 =new Intent();
                    intent42.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent42.putExtra("Number",42);
                    startActivity(intent42);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem043這世代:
                    Intent intent43 =new Intent();
                    intent43.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent43.putExtra("Number",43);
                    startActivity(intent43);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem044就是這個時刻:
                    Intent intent44 =new Intent();
                    intent44.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent44.putExtra("Number",44);
                    startActivity(intent44);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem045主我到你面前:
                    Intent intent45 =new Intent();
                    intent45.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent45.putExtra("Number",45);
                    startActivity(intent45);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem046何等恩典:
                    Intent intent46 =new Intent();
                    intent46.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent46.putExtra("Number",46);
                    startActivity(intent46);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem047永遠:
                    Intent intent47 =new Intent();
                    intent47.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent47.putExtra("Number",47);
                    startActivity(intent47);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem048賜福與你:
                    Intent intent48 =new Intent();
                    intent48.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent48.putExtra("Number",48);
                    startActivity(intent48);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem049請改變我:
                    Intent intent49 =new Intent();
                    intent49.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent49.putExtra("Number",49);
                    startActivity(intent49);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem050不能隔絕神的愛:
                    Intent intent50 =new Intent();
                    intent50.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent50.putExtra("Number",50);
                    startActivity(intent50);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem051腳步:
                    Intent intent51 =new Intent();
                    intent51.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent51.putExtra("Number",51);
                    startActivity(intent51);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem052翻轉地球:
                    Intent intent52 =new Intent();
                    intent52.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent52.putExtra("Number",52);
                    startActivity(intent52);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem053叫我抬起頭的神:
                    Intent intent53 =new Intent();
                    intent53.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent53.putExtra("Number",53);
                    startActivity(intent53);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem054如果:
                    Intent intent54 =new Intent();
                    intent54.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent54.putExtra("Number",54);
                    startActivity(intent54);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem055成為神蹟的器皿:
                    Intent intent55 =new Intent();
                    intent55.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent55.putExtra("Number",55);
                    startActivity(intent55);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem056豐盛的應許:
                    Intent intent56 =new Intent();
                    intent56.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent56.putExtra("Number",56);
                    startActivity(intent56);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem057我要一心稱謝你:
                    Intent intent57 =new Intent();
                    intent57.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent57.putExtra("Number",57);
                    startActivity(intent57);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem058經歷你的大愛:
                    Intent intent58 =new Intent();
                    intent58.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent58.putExtra("Number",58);
                    startActivity(intent58);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem059讓愛飛翔:
                    Intent intent59 =new Intent();
                    intent59.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent59.putExtra("Number",59);
                    startActivity(intent59);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem060你是配得:
                    Intent intent60 =new Intent();
                    intent60.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent60.putExtra("Number",60);
                    startActivity(intent60);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem061尊貴全能神:
                    Intent intent61 =new Intent();
                    intent61.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent61.putExtra("Number",61);
                    startActivity(intent61);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem062一生跟隨你:
                    Intent intent62 =new Intent();
                    intent62.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent62.putExtra("Number",62);
                    startActivity(intent62);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem063救贖的恩典:
                    Intent intent63 =new Intent();
                    intent63.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent63.putExtra("Number",63);
                    startActivity(intent63);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem064願讚美充滿:
                    Intent intent64 =new Intent();
                    intent64.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent64.putExtra("Number",64);
                    startActivity(intent64);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem065求賜復興之火:
                    Intent intent65 =new Intent();
                    intent65.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent65.putExtra("Number",65);
                    startActivity(intent65);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem066從破碎到自由:
                    Intent intent66 =new Intent();
                    intent66.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent66.putExtra("Number",66);
                    startActivity(intent66);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem067我獻上感謝:
                    Intent intent67 =new Intent();
                    intent67.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent67.putExtra("Number",67);
                    startActivity(intent67);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem068安靜:
                    Intent intent68 =new Intent();
                    intent68.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent68.putExtra("Number",68);
                    startActivity(intent68);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem069每天的禱告:
                    Intent intent69 =new Intent();
                    intent69.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent69.putExtra("Number",69);
                    startActivity(intent69);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem070如鷹展翅上騰:
                    Intent intent70 =new Intent();
                    intent70.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent70.putExtra("Number",70);
                    startActivity(intent70);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem071凡事都有可能:
                    Intent intent71 =new Intent();
                    intent71.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent71.putExtra("Number",71);
                    startActivity(intent71);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem072你愛不變:
                    Intent intent72 =new Intent();
                    intent72.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent72.putExtra("Number",72);
                    startActivity(intent72);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem073神偉大的舞池:
                    Intent intent73 =new Intent();
                    intent73.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent73.putExtra("Number",73);
                    startActivity(intent73);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem074堅強的愛:
                    Intent intent74 =new Intent();
                    intent74.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent74.putExtra("Number",74);
                    startActivity(intent74);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem075主你永遠與我同在:
                    Intent intent75 =new Intent();
                    intent75.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent75.putExtra("Number",75);
                    startActivity(intent75);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem076甦醒:
                    Intent intent76 =new Intent();
                    intent76.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent76.putExtra("Number",76);
                    startActivity(intent76);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem077差遣我:
                    Intent intent77 =new Intent();
                    intent77.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent77.putExtra("Number",77);
                    startActivity(intent77);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem078傾聽我的心:
                    Intent intent78 =new Intent();
                    intent78.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent78.putExtra("Number",78);
                    startActivity(intent78);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem079如果你想知道:
                    Intent intent79 =new Intent();
                    intent79.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent79.putExtra("Number",79);
                    startActivity(intent79);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem080讓讚美飛揚:
                    Intent intent80 =new Intent();
                    intent80.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent80.putExtra("Number",80);
                    startActivity(intent80);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem081新造的人:
                    Intent intent81 =new Intent();
                    intent81.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent81.putExtra("Number",81);
                    startActivity(intent81);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem082神的孩子:
                    Intent intent82 =new Intent();
                    intent82.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent82.putExtra("Number",82);
                    startActivity(intent82);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem083幸福:
                    Intent intent83 =new Intent();
                    intent83.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent83.putExtra("Number",83);
                    startActivity(intent83);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem084活出愛:
                    Intent intent84 =new Intent();
                    intent84.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent84.putExtra("Number",84);
                    startActivity(intent84);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem085讓我:
                    Intent intent85 =new Intent();
                    intent85.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent85.putExtra("Number",85);
                    startActivity(intent85);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem086更好的你:
                    Intent intent86 =new Intent();
                    intent86.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent86.putExtra("Number",86);
                    startActivity(intent86);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem087謙卑:
                    Intent intent87 =new Intent();
                    intent87.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent87.putExtra("Number",87);
                    startActivity(intent87);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem088讚美中遇見你:
                    Intent intent88 =new Intent();
                    intent88.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent88.putExtra("Number",88);
                    startActivity(intent88);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem089永遠的依靠:
                    Intent intent89 =new Intent();
                    intent89.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent89.putExtra("Number",89);
                    startActivity(intent89);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.poem090YouRaiseMeUp:
                    Intent intent90 =new Intent();
                    intent90.setClass(menuPoemtry.this,wordPoemtry.class);
                    intent90.putExtra("Number",90);
                    startActivity(intent90);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.btnMenuPoemtryPrevious:
                    finish();
                    break;
            }
        }
    };
}
