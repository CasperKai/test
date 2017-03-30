package com.casper.test.hollySong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.casper.test.R;

public class menuHollySong extends AppCompatActivity {
    private Button btn01,btn02,btn03,btn04,btn05,btn06,btn07,btn08,btn09,btn10;
    private Button btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20;
    private Button btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30;
    private Button btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,btn39,btn40;
    private Button btn41,btn42,btn43,btn44,btn45,btn46,btn47,btn48,btn49,btn50;
    private Button btn51,btn52,btn53,btn54,btn55,btn56,btn57,btn58,btn59,btn60;
    private Button btn61,btn62,btn63,btn64,btn65,btn66,btn67,btn68,btn69,btn70;
    private Button btn71,btn72,btn73,btn74,btn75,btn76,btn77,btn78,btn79,btn80;
    private Button btn81,btn82,btn83,btn84,btn85,btn86,btn87,btn88,btn89,btn90;
    private Button btn93,btn94,btn95,btn96;
    private Button _btnBack;
    public static menuHollySong instance=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_holly_song);
        setTitle("統一聖歌");
        instance=this;

        _btnBack=(Button)findViewById(R.id.btnMenuHollyPrevious);
        btn01=(Button)findViewById(R.id.holly01勝利者新歌);
        btn02=(Button)findViewById(R.id.holly02聖美的新歌);
        btn03=(Button)findViewById(R.id.holly03榮耀的恩賜);
        btn04=(Button)findViewById(R.id.holly04黑暗裡的勢力);
        btn05=(Button)findViewById(R.id.holly05復歸的樂園);
        btn06=(Button)findViewById(R.id.holly06聖苑的恩賜);
        btn07=(Button)findViewById(R.id.holly07樂園之歌);
        btn08=(Button)findViewById(R.id.holly08青年之歌);
        btn09=(Button)findViewById(R.id.holly09朝陽之歌);
        btn10=(Button)findViewById(R.id.holly10我要勇往);
        btn11=(Button)findViewById(R.id.holly11苦難與新生命);
        btn12=(Button)findViewById(R.id.holly12我是供物);
        btn13=(Button)findViewById(R.id.holly13誓約);
        btn14=(Button)findViewById(R.id.holly14成和勇士之歌);
        btn15=(Button)findViewById(R.id.holly15吹走嘆息吧);
        btn16=(Button)findViewById(R.id.holly16光輝的祖國);
        btn17=(Button)findViewById(R.id.holly17復歸的心情);
        btn18=(Button)findViewById(R.id.holly18來成就神的偉業);
        btn19=(Button)findViewById(R.id.holly19天的勇士);
        btn20=(Button)findViewById(R.id.holly20找到的榮光);
        btn21=(Button)findViewById(R.id.holly21歸我背負的十字架);
        btn22=(Button)findViewById(R.id.holly22光是從東方來);
        btn23=(Button)findViewById(R.id.holly23獻上一切往前進);
        btn24=(Button)findViewById(R.id.holly24苦難的耶穌);
        btn25=(Button)findViewById(R.id.holly25聚集成一體);
        btn26=(Button)findViewById(R.id.holly26統一勇士之歌);
        btn27=(Button)findViewById(R.id.holly27新伊甸園之歌);
        btn28=(Button)findViewById(R.id.holly28被召命的我);
        btn29=(Button)findViewById(R.id.holly29我的小羊);
        btn30=(Button)findViewById(R.id.holly30成和青年進行曲);
        btn31=(Button)findViewById(R.id.holly31榮耀之日);
        btn32=(Button)findViewById(R.id.holly32願祢回應);
        btn33=(Button)findViewById(R.id.holly33寂寞的山谷);
        btn34=(Button)findViewById(R.id.holly34主臨到);
        btn35=(Button)findViewById(R.id.holly35主啊願祢來);
        btn36=(Button)findViewById(R.id.holly36農園之歌);
        btn37=(Button)findViewById(R.id.holly37找到的羊群);
        btn38=(Button)findViewById(R.id.holly38夢般的旅途);
        btn39=(Button)findViewById(R.id.holly39主是我的一切);
        btn40=(Button)findViewById(R.id.holly40我的朋友耶穌);
        btn41=(Button)findViewById(R.id.holly41飲喝生命水);
        btn42=(Button)findViewById(R.id.holly42我想到主面前);
        btn43=(Button)findViewById(R.id.holly43吾心所願);
        btn44=(Button)findViewById(R.id.holly44天的盛宴);
        btn45=(Button)findViewById(R.id.holly45生活在活泉邊);
        btn46=(Button)findViewById(R.id.holly46樂園春天之歌);
        btn47=(Button)findViewById(R.id.holly47主日學兒童之歌);
        btn48=(Button)findViewById(R.id.holly48趕快回來吧);
        btn49=(Button)findViewById(R.id.holly49主是我們的牧者);
        btn50=(Button)findViewById(R.id.holly50蒙召的青年們);
        btn51=(Button)findViewById(R.id.holly51丹心歌);
        btn52=(Button)findViewById(R.id.holly52出埃及);
        btn53=(Button)findViewById(R.id.holly53再相會);
        btn54=(Button)findViewById(R.id.holly54勝利之歌);
        btn55=(Button)findViewById(R.id.holly55榮耀的主);
        btn56=(Button)findViewById(R.id.holly56確信的人);
        btn57=(Button)findViewById(R.id.holly57主常在我身邊);
        btn58=(Button)findViewById(R.id.holly58蒙召前進);
        btn59=(Button)findViewById(R.id.holly59我的故鄉);
        btn60=(Button)findViewById(R.id.holly60危險的試煉中);
        btn61=(Button)findViewById(R.id.holly61珍貴的寶物);
        btn62=(Button)findViewById(R.id.holly62向迦南前進);
        btn63=(Button)findViewById(R.id.holly63黑暗的路途上);
        btn64=(Button)findViewById(R.id.holly64我主的家庭);
        btn65=(Button)findViewById(R.id.holly65所盼望的那一日);
        btn66=(Button)findViewById(R.id.holly66傳揚吧);
        btn67=(Button)findViewById(R.id.holly67早晨的小鳥);
        btn68=(Button)findViewById(R.id.holly68恩惠與奇蹟);
        btn69=(Button)findViewById(R.id.holly69十字架上的呼求);
        btn70=(Button)findViewById(R.id.holly70大自然的禮讚);
        btn71=(Button)findViewById(R.id.holly71早晨的讚美);
        btn72=(Button)findViewById(R.id.holly72與主同生);
        btn73=(Button)findViewById(R.id.holly73向著十字架);
        btn74=(Button)findViewById(R.id.holly74儆醒禱告);
        btn75=(Button)findViewById(R.id.holly75以色列啊歸來吧);
        btn76=(Button)findViewById(R.id.holly76善的戰爭已成就了);
        btn77=(Button)findViewById(R.id.holly77青年之樹);
        btn78=(Button)findViewById(R.id.holly78光照亮大地);
        btn79=(Button)findViewById(R.id.holly79愛鄉歌);
        btn80=(Button)findViewById(R.id.holly80愛的統一);
        btn81=(Button)findViewById(R.id.holly81空中的飛鳥);
        btn82=(Button)findViewById(R.id.holly82由我心而出);
        btn83=(Button)findViewById(R.id.holly83幸福是什麼);
        btn84=(Button)findViewById(R.id.holly84光榮的聖戰);
        btn85=(Button)findViewById(R.id.holly85追求美的心);
        btn86=(Button)findViewById(R.id.holly86春之旅);
        btn87=(Button)findViewById(R.id.holly87小小的生命);
        btn88=(Button)findViewById(R.id.holly88生命之樹);
        btn89=(Button)findViewById(R.id.holly89星光);
        btn90=(Button)findViewById(R.id.holly90總有一天會明瞭);
        btn93=(Button)findViewById(R.id.holly93讓我們手拉手);
        btn94=(Button)findViewById(R.id.holly94奉獻歌);
        btn95=(Button)findViewById(R.id.holly95統一歌);
        btn96=(Button)findViewById(R.id.holly96歡迎歌);

        _btnBack.setOnClickListener(btnListener);
        btn01.setOnClickListener(btnListener);
        btn02.setOnClickListener(btnListener);
        btn03.setOnClickListener(btnListener);
        btn04.setOnClickListener(btnListener);
        btn05.setOnClickListener(btnListener);
        btn06.setOnClickListener(btnListener);
        btn07.setOnClickListener(btnListener);
        btn08.setOnClickListener(btnListener);
        btn09.setOnClickListener(btnListener);
        btn10.setOnClickListener(btnListener);
        btn11.setOnClickListener(btnListener);
        btn12.setOnClickListener(btnListener);
        btn13.setOnClickListener(btnListener);
        btn14.setOnClickListener(btnListener);
        btn15.setOnClickListener(btnListener);
        btn16.setOnClickListener(btnListener);
        btn17.setOnClickListener(btnListener);
        btn18.setOnClickListener(btnListener);
        btn19.setOnClickListener(btnListener);
        btn20.setOnClickListener(btnListener);
        btn21.setOnClickListener(btnListener);
        btn22.setOnClickListener(btnListener);
        btn23.setOnClickListener(btnListener);
        btn24.setOnClickListener(btnListener);
        btn25.setOnClickListener(btnListener);
        btn26.setOnClickListener(btnListener);
        btn27.setOnClickListener(btnListener);
        btn28.setOnClickListener(btnListener);
        btn29.setOnClickListener(btnListener);
        btn30.setOnClickListener(btnListener);
        btn31.setOnClickListener(btnListener);
        btn32.setOnClickListener(btnListener);
        btn33.setOnClickListener(btnListener);
        btn34.setOnClickListener(btnListener);
        btn35.setOnClickListener(btnListener);
        btn36.setOnClickListener(btnListener);
        btn37.setOnClickListener(btnListener);
        btn38.setOnClickListener(btnListener);
        btn39.setOnClickListener(btnListener);
        btn40.setOnClickListener(btnListener);
        btn41.setOnClickListener(btnListener);
        btn42.setOnClickListener(btnListener);
        btn43.setOnClickListener(btnListener);
        btn44.setOnClickListener(btnListener);
        btn45.setOnClickListener(btnListener);
        btn46.setOnClickListener(btnListener);
        btn47.setOnClickListener(btnListener);
        btn48.setOnClickListener(btnListener);
        btn49.setOnClickListener(btnListener);
        btn50.setOnClickListener(btnListener);
        btn51.setOnClickListener(btnListener);
        btn52.setOnClickListener(btnListener);
        btn53.setOnClickListener(btnListener);
        btn54.setOnClickListener(btnListener);
        btn55.setOnClickListener(btnListener);
        btn56.setOnClickListener(btnListener);
        btn57.setOnClickListener(btnListener);
        btn58.setOnClickListener(btnListener);
        btn59.setOnClickListener(btnListener);
        btn60.setOnClickListener(btnListener);
        btn61.setOnClickListener(btnListener);
        btn62.setOnClickListener(btnListener);
        btn63.setOnClickListener(btnListener);
        btn64.setOnClickListener(btnListener);
        btn65.setOnClickListener(btnListener);
        btn66.setOnClickListener(btnListener);
        btn67.setOnClickListener(btnListener);
        btn68.setOnClickListener(btnListener);
        btn69.setOnClickListener(btnListener);
        btn70.setOnClickListener(btnListener);
        btn71.setOnClickListener(btnListener);
        btn72.setOnClickListener(btnListener);
        btn73.setOnClickListener(btnListener);
        btn74.setOnClickListener(btnListener);
        btn75.setOnClickListener(btnListener);
        btn76.setOnClickListener(btnListener);
        btn77.setOnClickListener(btnListener);
        btn78.setOnClickListener(btnListener);
        btn79.setOnClickListener(btnListener);
        btn80.setOnClickListener(btnListener);
        btn81.setOnClickListener(btnListener);
        btn82.setOnClickListener(btnListener);
        btn83.setOnClickListener(btnListener);
        btn84.setOnClickListener(btnListener);
        btn85.setOnClickListener(btnListener);
        btn86.setOnClickListener(btnListener);
        btn87.setOnClickListener(btnListener);
        btn88.setOnClickListener(btnListener);
        btn89.setOnClickListener(btnListener);
        btn90.setOnClickListener(btnListener);
        btn93.setOnClickListener(btnListener);
        btn94.setOnClickListener(btnListener);
        btn95.setOnClickListener(btnListener);
        btn96.setOnClickListener(btnListener);

    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.holly01勝利者新歌:
                    Intent intent =new Intent();
                    intent.setClass(menuHollySong.this,wordHollySong.class);
                    intent.putExtra("Number",1);
                    startActivity(intent);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly02聖美的新歌:
                    Intent intent2 =new Intent();
                    intent2.setClass(menuHollySong.this,wordHollySong.class);
                    intent2.putExtra("Number",2);
                    startActivity(intent2);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly03榮耀的恩賜:
                    Intent intent3 =new Intent();
                    intent3.setClass(menuHollySong.this,wordHollySong.class);
                    intent3.putExtra("Number",3);
                    startActivity(intent3);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly04黑暗裡的勢力:
                    Intent intent4 =new Intent();
                    intent4.setClass(menuHollySong.this,wordHollySong.class);
                    intent4.putExtra("Number",4);
                    startActivity(intent4);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly05復歸的樂園:
                    Intent intent5 =new Intent();
                    intent5.setClass(menuHollySong.this,wordHollySong.class);
                    intent5.putExtra("Number",5);
                    startActivity(intent5);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly06聖苑的恩賜:
                    Intent intent6 =new Intent();
                    intent6.setClass(menuHollySong.this,wordHollySong.class);
                    intent6.putExtra("Number",6);
                    startActivity(intent6);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly07樂園之歌:
                    Intent intent7 =new Intent();
                    intent7.setClass(menuHollySong.this,wordHollySong.class);
                    intent7.putExtra("Number",7);
                    startActivity(intent7);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly08青年之歌:
                    Intent intent8 =new Intent();
                    intent8.setClass(menuHollySong.this,wordHollySong.class);
                    intent8.putExtra("Number",8);
                    startActivity(intent8);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly09朝陽之歌:
                    Intent intent9 =new Intent();
                    intent9.setClass(menuHollySong.this,wordHollySong.class);
                    intent9.putExtra("Number",9);
                    startActivity(intent9);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly10我要勇往:
                    Intent intent10 =new Intent();
                    intent10.setClass(menuHollySong.this,wordHollySong.class);
                    intent10.putExtra("Number",10);
                    startActivity(intent10);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly11苦難與新生命:
                    Intent intent11 =new Intent();
                    intent11.setClass(menuHollySong.this,wordHollySong.class);
                    intent11.putExtra("Number",11);
                    startActivity(intent11);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly12我是供物:
                    Intent intent12 =new Intent();
                    intent12.setClass(menuHollySong.this,wordHollySong.class);
                    intent12.putExtra("Number",12);
                    startActivity(intent12);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly13誓約:
                    Intent intent13 =new Intent();
                    intent13.setClass(menuHollySong.this,wordHollySong.class);
                    intent13.putExtra("Number",13);
                    startActivity(intent13);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly14成和勇士之歌:
                    Intent intent14 =new Intent();
                    intent14.setClass(menuHollySong.this,wordHollySong.class);
                    intent14.putExtra("Number",14);
                    startActivity(intent14);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly15吹走嘆息吧:
                    Intent intent15 =new Intent();
                    intent15.setClass(menuHollySong.this,wordHollySong.class);
                    intent15.putExtra("Number",15);
                    startActivity(intent15);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly16光輝的祖國:
                    Intent intent16 =new Intent();
                    intent16.setClass(menuHollySong.this,wordHollySong.class);
                    intent16.putExtra("Number",16);
                    startActivity(intent16);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly17復歸的心情:
                    Intent intent17 =new Intent();
                    intent17.setClass(menuHollySong.this,wordHollySong.class);
                    intent17.putExtra("Number",17);
                    startActivity(intent17);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly18來成就神的偉業:
                    Intent intent18 =new Intent();
                    intent18.setClass(menuHollySong.this,wordHollySong.class);
                    intent18.putExtra("Number",18);
                    startActivity(intent18);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly19天的勇士:
                    Intent intent19 =new Intent();
                    intent19.setClass(menuHollySong.this,wordHollySong.class);
                    intent19.putExtra("Number",19);
                    startActivity(intent19);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly20找到的榮光:
                    Intent intent20 =new Intent();
                    intent20.setClass(menuHollySong.this,wordHollySong.class);
                    intent20.putExtra("Number",20);
                    startActivity(intent20);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly21歸我背負的十字架:
                    Intent intent21 =new Intent();
                    intent21.setClass(menuHollySong.this,wordHollySong.class);
                    intent21.putExtra("Number",21);
                    startActivity(intent21);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly22光是從東方來:
                    Intent intent22 =new Intent();
                    intent22.setClass(menuHollySong.this,wordHollySong.class);
                    intent22.putExtra("Number",22);
                    startActivity(intent22);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly23獻上一切往前進:
                    Intent intent23 =new Intent();
                    intent23.setClass(menuHollySong.this,wordHollySong.class);
                    intent23.putExtra("Number",23);
                    startActivity(intent23);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly24苦難的耶穌:
                    Intent intent24 =new Intent();
                    intent24.setClass(menuHollySong.this,wordHollySong.class);
                    intent24.putExtra("Number",24);
                    startActivity(intent24);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly25聚集成一體:
                    Intent intent25 =new Intent();
                    intent25.setClass(menuHollySong.this,wordHollySong.class);
                    intent25.putExtra("Number",25);
                    startActivity(intent25);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly26統一勇士之歌:
                    Intent intent26 =new Intent();
                    intent26.setClass(menuHollySong.this,wordHollySong.class);
                    intent26.putExtra("Number",26);
                    startActivity(intent26);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly27新伊甸園之歌:
                    Intent intent27 =new Intent();
                    intent27.setClass(menuHollySong.this,wordHollySong.class);
                    intent27.putExtra("Number",27);
                    startActivity(intent27);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly28被召命的我:
                    Intent intent28 =new Intent();
                    intent28.setClass(menuHollySong.this,wordHollySong.class);
                    intent28.putExtra("Number",28);
                    startActivity(intent28);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly29我的小羊:
                    Intent intent29 =new Intent();
                    intent29.setClass(menuHollySong.this,wordHollySong.class);
                    intent29.putExtra("Number",29);
                    startActivity(intent29);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly30成和青年進行曲:
                    Intent intent30 =new Intent();
                    intent30.setClass(menuHollySong.this,wordHollySong.class);
                    intent30.putExtra("Number",30);
                    startActivity(intent30);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly31榮耀之日:
                    Intent intent31 =new Intent();
                    intent31.setClass(menuHollySong.this,wordHollySong.class);
                    intent31.putExtra("Number",31);
                    startActivity(intent31);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly32願祢回應:
                    Intent intent32 =new Intent();
                    intent32.setClass(menuHollySong.this,wordHollySong.class);
                    intent32.putExtra("Number",32);
                    startActivity(intent32);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly33寂寞的山谷:
                    Intent intent33 =new Intent();
                    intent33.setClass(menuHollySong.this,wordHollySong.class);
                    intent33.putExtra("Number",33);
                    startActivity(intent33);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly34主臨到:
                    Intent intent34 =new Intent();
                    intent34.setClass(menuHollySong.this,wordHollySong.class);
                    intent34.putExtra("Number",34);
                    startActivity(intent34);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly35主啊願祢來:
                    Intent intent35 =new Intent();
                    intent35.setClass(menuHollySong.this,wordHollySong.class);
                    intent35.putExtra("Number",35);
                    startActivity(intent35);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly36農園之歌:
                    Intent intent36 =new Intent();
                    intent36.setClass(menuHollySong.this,wordHollySong.class);
                    intent36.putExtra("Number",36);
                    startActivity(intent36);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly37找到的羊群:
                    Intent intent37 =new Intent();
                    intent37.setClass(menuHollySong.this,wordHollySong.class);
                    intent37.putExtra("Number",37);
                    startActivity(intent37);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly38夢般的旅途:
                    Intent intent38 =new Intent();
                    intent38.setClass(menuHollySong.this,wordHollySong.class);
                    intent38.putExtra("Number",38);
                    startActivity(intent38);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly39主是我的一切:
                    Intent intent39 =new Intent();
                    intent39.setClass(menuHollySong.this,wordHollySong.class);
                    intent39.putExtra("Number",39);
                    startActivity(intent39);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly40我的朋友耶穌:
                    Intent intent40 =new Intent();
                    intent40.setClass(menuHollySong.this,wordHollySong.class);
                    intent40.putExtra("Number",40);
                    startActivity(intent40);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly41飲喝生命水:
                    Intent intent41 =new Intent();
                    intent41.setClass(menuHollySong.this,wordHollySong.class);
                    intent41.putExtra("Number",41);
                    startActivity(intent41);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly42我想到主面前:
                    Intent intent42 =new Intent();
                    intent42.setClass(menuHollySong.this,wordHollySong.class);
                    intent42.putExtra("Number",42);
                    startActivity(intent42);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly43吾心所願:
                    Intent intent43 =new Intent();
                    intent43.setClass(menuHollySong.this,wordHollySong.class);
                    intent43.putExtra("Number",43);
                    startActivity(intent43);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly44天的盛宴:
                    Intent intent44 =new Intent();
                    intent44.setClass(menuHollySong.this,wordHollySong.class);
                    intent44.putExtra("Number",44);
                    startActivity(intent44);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly45生活在活泉邊:
                    Intent intent45 =new Intent();
                    intent45.setClass(menuHollySong.this,wordHollySong.class);
                    intent45.putExtra("Number",45);
                    startActivity(intent45);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly46樂園春天之歌:
                    Intent intent46 =new Intent();
                    intent46.setClass(menuHollySong.this,wordHollySong.class);
                    intent46.putExtra("Number",46);
                    startActivity(intent46);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly47主日學兒童之歌:
                    Intent intent47 =new Intent();
                    intent47.setClass(menuHollySong.this,wordHollySong.class);
                    intent47.putExtra("Number",47);
                    startActivity(intent47);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly48趕快回來吧:
                    Intent intent48 =new Intent();
                    intent48.setClass(menuHollySong.this,wordHollySong.class);
                    intent48.putExtra("Number",48);
                    startActivity(intent48);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly49主是我們的牧者:
                    Intent intent49 =new Intent();
                    intent49.setClass(menuHollySong.this,wordHollySong.class);
                    intent49.putExtra("Number",49);
                    startActivity(intent49);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly50蒙召的青年們:
                    Intent intent50 =new Intent();
                    intent50.setClass(menuHollySong.this,wordHollySong.class);
                    intent50.putExtra("Number",50);
                    startActivity(intent50);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly51丹心歌:
                    Intent intent51 =new Intent();
                    intent51.setClass(menuHollySong.this,wordHollySong.class);
                    intent51.putExtra("Number",51);
                    startActivity(intent51);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly52出埃及:
                    Intent intent52 =new Intent();
                    intent52.setClass(menuHollySong.this,wordHollySong.class);
                    intent52.putExtra("Number",52);
                    startActivity(intent52);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly53再相會:
                    Intent intent53 =new Intent();
                    intent53.setClass(menuHollySong.this,wordHollySong.class);
                    intent53.putExtra("Number",53);
                    startActivity(intent53);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly54勝利之歌:
                    Intent intent54 =new Intent();
                    intent54.setClass(menuHollySong.this,wordHollySong.class);
                    intent54.putExtra("Number",54);
                    startActivity(intent54);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly55榮耀的主:
                    Intent intent55 =new Intent();
                    intent55.setClass(menuHollySong.this,wordHollySong.class);
                    intent55.putExtra("Number",55);
                    startActivity(intent55);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly56確信的人:
                    Intent intent56 =new Intent();
                    intent56.setClass(menuHollySong.this,wordHollySong.class);
                    intent56.putExtra("Number",56);
                    startActivity(intent56);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly57主常在我身邊:
                    Intent intent57 =new Intent();
                    intent57.setClass(menuHollySong.this,wordHollySong.class);
                    intent57.putExtra("Number",57);
                    startActivity(intent57);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly58蒙召前進:
                    Intent intent58 =new Intent();
                    intent58.setClass(menuHollySong.this,wordHollySong.class);
                    intent58.putExtra("Number",58);
                    startActivity(intent58);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly59我的故鄉:
                    Intent intent59 =new Intent();
                    intent59.setClass(menuHollySong.this,wordHollySong.class);
                    intent59.putExtra("Number",59);
                    startActivity(intent59);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly60危險的試煉中:
                    Intent intent60 =new Intent();
                    intent60.setClass(menuHollySong.this,wordHollySong.class);
                    intent60.putExtra("Number",60);
                    startActivity(intent60);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly61珍貴的寶物:
                    Intent intent61 =new Intent();
                    intent61.setClass(menuHollySong.this,wordHollySong.class);
                    intent61.putExtra("Number",61);
                    startActivity(intent61);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly62向迦南前進:
                    Intent intent62 =new Intent();
                    intent62.setClass(menuHollySong.this,wordHollySong.class);
                    intent62.putExtra("Number",62);
                    startActivity(intent62);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly63黑暗的路途上:
                    Intent intent63 =new Intent();
                    intent63.setClass(menuHollySong.this,wordHollySong.class);
                    intent63.putExtra("Number",63);
                    startActivity(intent63);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly64我主的家庭:
                    Intent intent64 =new Intent();
                    intent64.setClass(menuHollySong.this,wordHollySong.class);
                    intent64.putExtra("Number",64);
                    startActivity(intent64);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly65所盼望的那一日:
                    Intent intent65 =new Intent();
                    intent65.setClass(menuHollySong.this,wordHollySong.class);
                    intent65.putExtra("Number",65);
                    startActivity(intent65);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly66傳揚吧:
                    Intent intent66 =new Intent();
                    intent66.setClass(menuHollySong.this,wordHollySong.class);
                    intent66.putExtra("Number",66);
                    startActivity(intent66);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly67早晨的小鳥:
                    Intent intent67 =new Intent();
                    intent67.setClass(menuHollySong.this,wordHollySong.class);
                    intent67.putExtra("Number",67);
                    startActivity(intent67);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly68恩惠與奇蹟:
                    Intent intent68 =new Intent();
                    intent68.setClass(menuHollySong.this,wordHollySong.class);
                    intent68.putExtra("Number",68);
                    startActivity(intent68);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly69十字架上的呼求:
                    Intent intent69 =new Intent();
                    intent69.setClass(menuHollySong.this,wordHollySong.class);
                    intent69.putExtra("Number",69);
                    startActivity(intent69);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly70大自然的禮讚:
                    Intent intent70 =new Intent();
                    intent70.setClass(menuHollySong.this,wordHollySong.class);
                    intent70.putExtra("Number",70);
                    startActivity(intent70);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly71早晨的讚美:
                    Intent intent71 =new Intent();
                    intent71.setClass(menuHollySong.this,wordHollySong.class);
                    intent71.putExtra("Number",71);
                    startActivity(intent71);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly72與主同生:
                    Intent intent72 =new Intent();
                    intent72.setClass(menuHollySong.this,wordHollySong.class);
                    intent72.putExtra("Number",72);
                    startActivity(intent72);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly73向著十字架:
                    Intent intent73 =new Intent();
                    intent73.setClass(menuHollySong.this,wordHollySong.class);
                    intent73.putExtra("Number",73);
                    startActivity(intent73);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly74儆醒禱告:
                    Intent intent74 =new Intent();
                    intent74.setClass(menuHollySong.this,wordHollySong.class);
                    intent74.putExtra("Number",74);
                    startActivity(intent74);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly75以色列啊歸來吧:
                    Intent intent75 =new Intent();
                    intent75.setClass(menuHollySong.this,wordHollySong.class);
                    intent75.putExtra("Number",75);
                    startActivity(intent75);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly76善的戰爭已成就了:
                    Intent intent76 =new Intent();
                    intent76.setClass(menuHollySong.this,wordHollySong.class);
                    intent76.putExtra("Number",76);
                    startActivity(intent76);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly77青年之樹:
                    Intent intent77 =new Intent();
                    intent77.setClass(menuHollySong.this,wordHollySong.class);
                    intent77.putExtra("Number",77);
                    startActivity(intent77);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly78光照亮大地:
                    Intent intent78 =new Intent();
                    intent78.setClass(menuHollySong.this,wordHollySong.class);
                    intent78.putExtra("Number",78);
                    startActivity(intent78);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly79愛鄉歌:
                    Intent intent79 =new Intent();
                    intent79.setClass(menuHollySong.this,wordHollySong.class);
                    intent79.putExtra("Number",79);
                    startActivity(intent79);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly80愛的統一:
                    Intent intent80 =new Intent();
                    intent80.setClass(menuHollySong.this,wordHollySong.class);
                    intent80.putExtra("Number",80);
                    startActivity(intent80);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly81空中的飛鳥:
                    Intent intent81 =new Intent();
                    intent81.setClass(menuHollySong.this,wordHollySong.class);
                    intent81.putExtra("Number",81);
                    startActivity(intent81);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly82由我心而出:
                    Intent intent82 =new Intent();
                    intent82.setClass(menuHollySong.this,wordHollySong.class);
                    intent82.putExtra("Number",82);
                    startActivity(intent82);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly83幸福是什麼:
                    Intent intent83 =new Intent();
                    intent83.setClass(menuHollySong.this,wordHollySong.class);
                    intent83.putExtra("Number",83);
                    startActivity(intent83);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly84光榮的聖戰:
                    Intent intent84 =new Intent();
                    intent84.setClass(menuHollySong.this,wordHollySong.class);
                    intent84.putExtra("Number",84);
                    startActivity(intent84);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly85追求美的心:
                    Intent intent85 =new Intent();
                    intent85.setClass(menuHollySong.this,wordHollySong.class);
                    intent85.putExtra("Number",85);
                    startActivity(intent85);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly86春之旅:
                    Intent intent86 =new Intent();
                    intent86.setClass(menuHollySong.this,wordHollySong.class);
                    intent86.putExtra("Number",86);
                    startActivity(intent86);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly87小小的生命:
                    Intent intent87 =new Intent();
                    intent87.setClass(menuHollySong.this,wordHollySong.class);
                    intent87.putExtra("Number",87);
                    startActivity(intent87);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly88生命之樹:
                    Intent intent88 =new Intent();
                    intent88.setClass(menuHollySong.this,wordHollySong.class);
                    intent88.putExtra("Number",88);
                    startActivity(intent88);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly89星光:
                    Intent intent89 =new Intent();
                    intent89.setClass(menuHollySong.this,wordHollySong.class);
                    intent89.putExtra("Number",89);
                    startActivity(intent89);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly90總有一天會明瞭:
                    Intent intent90 =new Intent();
                    intent90.setClass(menuHollySong.this,wordHollySong.class);
                    intent90.putExtra("Number",90);
                    startActivity(intent90);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly93讓我們手拉手:
                    Intent intent93 =new Intent();
                    intent93.setClass(menuHollySong.this,wordHollySong.class);
                    intent93.putExtra("Number",93);
                    startActivity(intent93);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly94奉獻歌:
                    Intent intent94 =new Intent();
                    intent94.setClass(menuHollySong.this,wordHollySong.class);
                    intent94.putExtra("Number",94);
                    startActivity(intent94);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly95統一歌:
                    Intent intent95 =new Intent();
                    intent95.setClass(menuHollySong.this,wordHollySong.class);
                    intent95.putExtra("Number",95);
                    startActivity(intent95);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.holly96歡迎歌:
                    Intent intent96 =new Intent();
                    intent96.setClass(menuHollySong.this,wordHollySong.class);
                    intent96.putExtra("Number",96);
                    startActivity(intent96);
                    //setTitle("將天敞開");  //改標題名稱
                    break;
                case R.id.btnMenuHollyPrevious:
                    finish();
                    break;
            }
        }
    };
}
