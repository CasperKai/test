package com.casper.test;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class MainActivity extends AppCompatActivity {
    //按鈕 返回 檢查更新 搜尋
    private Button _btnMenuBackMain, _btnUpdate, _btnFamily, _btnSearch;
    //下載網址
    private String version="1.0.0",download;
    //是否有更新
    private boolean isDownLoad =false;
    //場景名稱
    private String _sceneName="main",_albumName="";

    private ArrayAdapter<String> _menuAdapter;
    private MyAdapter _mainAdapter;

    private ListView _listMain;
    private int[] _arrResID ={R.drawable.albumholy,R.drawable.albumpoetry,
                        R.drawable.album17,R.drawable.album18,R.drawable.album19,R.drawable.album20,R.drawable.album21,
                        R.drawable.albumj2012,R.drawable.albumj2013,R.drawable.albumj2014,R.drawable.albumj2015,
                        R.drawable.albumk1,R.drawable.albumk2,R.drawable.albumk3,R.drawable.albumk4,R.drawable.albumk5,R.drawable.albumk6,R.drawable.albumk7};
    private String[] _arrListTitle = {"聖歌","詩歌本",
                                    "將天敞開","從心合一","這裡有榮耀","新的事將要成就","我要看見",
                                    "為著你的榮耀","亞洲為耶穌","堅強的愛","竭力追求",
                                    "小小的夢想","認識你真好","有一位神","把冷漠變成愛","新造的人","讚美的孩子最喜樂","彩虹"};
    private String[] _arrListSubTitle ={"Holy Song","Poetry\n勤心學苑敬拜讚美系列 [1]",
                                        "Open Heaven\n讚美之泉敬拜讚美系列 [17]","Unity\n讚美之泉敬拜讚美系列 [18]","Glory\n讚美之泉敬拜讚美系列 [19]",
                                        "Made New\n讚美之泉敬拜讚美系列 [20]","I Want to See\n讚美之泉敬拜讚美系列 [21]",
                                        " For Your Glory\n約書亞敬拜專輯 [2012]","Asia For JESUS\n約書亞敬拜專輯 [2013]","Strong Love\n約書亞敬拜專輯 [2014]",
                                        "Passionate Pursuit\n約書亞敬拜專輯 [2015]",
                                        "Little Dream\n讚美之泉兒童敬拜讚美專輯 [1]","It's Good To Know You\n讚美之泉兒童敬拜讚美專輯 [2]",
                                        "There Is A God\n讚美之泉兒童敬拜讚美專輯 [3]","Fill Our Hearts with Love\n讚美之泉兒童敬拜讚美專輯 [4]",
                                        "A New Creation\n讚美之泉兒童敬拜讚美專輯 [5]","I Am Filled With Joy\n讚美之泉兒童敬拜讚美專輯 [6]",
                                        "Rainbow\n讚美之泉兒童敬拜讚美專輯 [7]"};
    private String[] _arrMenuHoly ={"01 勝利者新歌","02 聖美的新歌","03 榮耀的恩賜","04 黑暗裡的勢力","05 復歸的樂園","06 聖苑的恩賜","07 樂園之歌",
                                    "08 青年之歌","09 朝陽之歌","10 我要勇往","11 苦難與新生命","12 我是供物","13 誓約","14 成和勇士之歌",
                                    "15 吹走嘆息吧","16 光輝的祖國","17 復歸的心情","18 來成就神的偉業","19 天的勇士","20 找到的榮光","21歸我背負的十字架",
                                    "22 光是從東方來","23 獻上一切往前進","24 苦難的耶穌","25 聚集成一體","26 統一勇士之歌","27 新伊甸園之歌","28 被召命的我",
                                    "29 我的小羊","30 成和青年進行曲","31 榮耀之日","32 願祢回應","33 寂寞的山谷","34 主臨到","35 主啊願祢來",
                                    "36 農園之歌","37 找到的羊群","38 夢般的旅途","39 主是我的一切","40 我的朋友耶穌","41 飲喝生命水","42 我想到主面前",
                                    "43 吾心所願","44 天的盛宴","45 生活在活泉邊","46 樂園春天之歌","47 主日學兒童之歌","48 趕快回來吧","49 主是我們的牧者",
                                    "50 蒙召的青年們","51 丹心歌","52 出埃及","53 再相會","54 勝利之歌","55 榮耀的主","56 確信的人",
                                    "57 主常在我身邊","58 蒙召前進","59 我的故鄉","60 危險的試煉中","61 珍貴的寶物","62 向迦南前進","63 黑暗的路途上",
                                    "64 我主的家庭","65 所盼望的那一日","66 傳揚吧","67 早晨的小鳥","68 恩惠與奇蹟","69 十字架上的呼求","70 大自然的禮讚",
                                    "71 早晨的讚美","72 與主同生","73 向著十字架","74 儆醒禱告","75 以色列啊歸來吧","76 善的戰爭已成就了","77 青年之樹",
                                    "78 光照亮大地","79 愛鄉歌","80 愛的統一","81 空中的飛鳥","82 由我心而出","83 幸福是什麼","84 光榮的聖戰",
                                    "85 追求美的心","86 春之旅","87 小小的生命","88 生命之樹","89 星光","90 總有一天會明瞭","93 讓我們手拉手",
                                    "94 奉獻歌","95 統一歌","96 歡迎歌"};
    private String[] _arrMenuPoetry ={"01 相信有愛就有奇蹟","02 愛可以再更多一點點","03 為愛合一禱告","04 掌上明珠","05 禱告","06 雲上太陽","07 把冷漠變成愛",
                                "08 讚美之泉", "09 常常喜樂","10 主我跟祢走","11 凡事都能做","12 轉化","13 喜樂泉源","14 煉淨我","15 恩典夠用","16 認定祢",
                                "17 揀選","18 齊為此地呼求","19 看見復興", "20 讓愛走動","21 生命之花","22 我需要有祢在我生命中","23 這一生最美的祝福",
                                "24 奇異恩典","25 勇敢走出去","26 滿有能力","27 不要放棄","28 主禱文", "29 再一次","30 單單只為祢","31 認識祢真好","32 阿爸天父",
                                "33 邁向新的生命","34 恩典之路","35 展開清晨的翅膀","36 最珍貴的角落","37 寶貴十架","38 得釋放","39 我要全心讚美",
                                "40 我們愛讓世界不一樣","41 你愛永不變","42 住在你裡面","43 這世代","44 就是這個時刻","45 主我到你面前","46 何等恩典",
                                "47 永遠","48 賜福與你","49 請改變我","50 不能隔絕神的愛","51 腳步","52 翻轉地球","53 叫我抬起頭的神","54 如果","55 成為神蹟的器皿",
                                "56 豐盛的應許", "57 我要一心稱謝你","58 經歷你的大愛","59 讓愛飛翔","60 你是配得","61 尊貴全能神","62 一生跟隨你","63 救贖的恩典",
                                "64 願讚美充滿","65 求賜復興之火", "66 從破碎到自由","67 我獻上感謝","68 安靜","69 每天的禱告","70 如鷹展翅上騰","71 凡事都有可能",
                                "72 你愛不變","73 神偉大的舞池","74 堅強的愛","75 主你永遠與我同在","76 甦醒","77 差遣我","78 傾聽我的心","79 如果你想知道",
                                "80 讓讚美飛揚","81 新造的人","82 神的孩子","83 幸福","84 活出愛","85 讓我","86 更好的你","87 謙卑","88 讚美中遇見你","89 永遠的依靠",
                                "90 YouRaiseMeUp","91 進入祢愛裡"};
    private String[] _arrMenu17={"01 將天敞開","02 日日夜夜","03 配得頌揚","04 活著為要敬拜祢","05 新耶路撒冷","06 一同起舞","07 十架的愛","08 救贖的恩典",
                                "09 為耶路撒冷祈禱","10 我要順服","11 自由地歌唱","12 就是這個時刻","13 我已得自由","14 同心高舉十架"};
    private String[] _arrMenu18={"01 從心合一","02 深刻的愛","03 回家","04 永遠不分離","05 是祢的愛","06 新的一天","07 齊來讚美","08 我有喜樂","09 聖靈的江河",
                                "10 帶我進入祢的同在","11 願祢降臨","12 禱告的大軍","13 耶和華作了我的高臺","14 天上的家"};
    private String[] _arrMenu19={"01 這裡有榮耀","02 我們歡迎君王降臨","03 極大的聲音","04 更多充滿","05 從這代到那代","06 愛中相遇","07 以馬內利",
                                "08 永恆唯一的盼望","09 主祢的疼","10 謝謝祢","11 大手牽著小手","12 耶和華大能的軍隊","13 我心唯一愛慕","14 順服"};
    private String[] _arrMenu20={"01 給夢想一雙翅膀","02 新的事將要成就","03 新的異象新的方向","04 只要有祢在我左右","05 我們愛戴的王","06 榮耀大君王",
                                "07 安靜","08 奔跑不放棄", "09 能不能","10 醫治我","11 找一個地方","12 全新的生命","13 前來敬拜","14 敬拜讓世界震動",
                                "15 傾倒","16 三百六十五天","17 祢的器皿","18 願祢國度降臨"};
    private String[] _arrMenu21={"01 我要看見","02 每一天我需要祢","03 讓我得見祢的榮面","04 獻上尊榮","05 更深之處","06 近前來","07 行神蹟的神",
                                "08 這是耶和華所定日子","09 這世代要呼求祢","10 在至高之處","11 為愛而生","12 祢必成就美好事"};
    private String[] _arrMenu2012={"01 一切都更新","02 我要全心稱頌我的主","03 和散那","04 為著你的榮耀","05 純潔的心","06 你的愛","07 超乎萬名之名",
                                "08 與你更靠近","09 你是我天父","10 沒有人像你一樣愛我","11 恩典之流","12 求充滿這地"};
    private String[] _arrMenu2013={"01 我自由","02 再做一次","03 打開天門","04 你愛不變","05 天堂的歌","06 你同在如天堂降臨","07 更靠近",
                                "08 超自然能力","09 亞洲為耶穌","10 天父的愛","11 你是配得","12 我聽見主走過來","13 幾千公里"};
    private String[] _arrMenu2014={"01 堅強的愛","02 國度屬於你","03 你聖名","04 SPIRIT BREAK OUT","05 用你雙手擁抱我","06 我要愛慕你","07 神偉大的舞池",
                                "08 甦醒","09 耶穌基督","10 敬拜的心","11 進城曲","12 就是現在"};
    private String[] _arrMenu2015={"01 天父的國度","02 好土","03 直到永遠","04 竭力追求","05 我們敬拜你","06 器皿","07 有一個盼望","08 祂是你的幫助",
                                "09 你的香氣","10 安靜居所"};
    private String[] _arrMenuK1={"01 滿有能力","02 雲上太陽","03 小小的夢想","04 最深愛的主","05 天天讚美","06 主的喜樂是我力量","07 ShakyShkayTime",
                                "08 讚美之泉","09 我要向高山舉目","10 晚安曲"};
    private String[] _arrMenuK2={"01 讓讚美飛揚","02 看見復興","03 認識祢真好","04 我們愛","05 天父的花園","06 耶穌愛你","07 耶穌我愛祢","08 賜福於你",
                                "09 耶和華是我牧者","10 在祢寶座前"};
    private String[] _arrMenuK3={"01 如果你想知道","02 我們是光明之子","03 有一位神","04 求主充滿我","05 親愛的要記得","06 爸爸媽媽的愛","07 祢的慈愛",
                                "08 喔十字架","09 進入豐盛","10 祢的同在","11 彈琴歌唱讚美祢"};
    private String[] _arrMenuK4={"01 讓愛走動","02 何等有福","03 把冷漠變成愛","04 多麼奇妙","05 有人在等你","06 耶穌我的耶穌","07 注目看耶穌",
                                "08 深深愛祢","09 愛可以再更多一點點","10 專心仰望耶穌","11 將天敞開"};
    private String[] _arrMenuK5={"01 新造的人","02 歡呼","03 恩典之路","04 回家","05 相信有愛就有奇蹟","06 齊來讚美","07 耶和華沙龍","08 耶穌的名",
                                "09 歌頌","10 祢的愛長闊高深"};
    private String[] _arrMenuK6={"01 讚美的孩子最喜樂","02 我有喜樂","03 保護我的是耶和華","04 喜樂自由","05 這裡有榮耀","06 震動天地","07 主祢是我力量",
                                "08 何等恩典","09 永遠愛祢","10 愛我願意","11 我已得自由","12 我的家要榮耀主"};
    private String[] _arrMenuK7={"01 彩虹","02 DontWorry","03 耶穌是我的好朋友","04 靠主得勝","05 愛我的天父","06 聖靈的江河","07 新的一天",
                                "08 只要有祢在我左右","09 新的事將要成就","10 我對祢的愛不變","11 我們歡迎君王降臨","12 榮耀的呼召","13 差遣我"};


    // 建立OkHttpClient
    OkHttpClient client = new OkHttpClient().newBuilder().build();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Menu返回鍵
        _btnMenuBackMain=(Button)findViewById(R.id.btn_MenuBackMain);
        _btnMenuBackMain.setVisibility(View.GONE);
        _btnMenuBackMain.setOnClickListener(btnListener);
        // 檢查更新與搜尋與家庭誓盟
        _btnUpdate=(Button)findViewById(R.id.btn_Update);
        _btnUpdate.setOnClickListener(btnListener);
        _btnSearch=(Button)findViewById(R.id.btn_Search);
        _btnSearch.setOnClickListener(btnListener);
        _btnFamily=(Button)findViewById(R.id.btn_Family);
        _btnFamily.setOnClickListener(btnListener);
        // ListView設置
        _listMain=(ListView)findViewById(R.id.list_main);
        _mainAdapter=new MyAdapter(this);
        _listMain.setAdapter(_mainAdapter);
        _listMain.setOnItemClickListener(listItemListener);

        checkVersion();
        checkDownload();

        setTitle("勤心學苑");  //改標題名稱

        //顯示goodSentance   顯示短語和照片
        Intent intentSentance = new Intent();
        intentSentance.setClass(MainActivity.this, goodSentance.class);
        startActivity(intentSentance);

        try {
            Thread.sleep(2000);
            checkInternet();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void checkInternet() {
        ConnectivityManager mConnectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
        //如果未連線的話，mNetworkInfo會等於null
        if (mNetworkInfo != null) {
            if (mNetworkInfo.isConnected()) {
                if (mNetworkInfo.isAvailable()) {
                    if (mNetworkInfo.isConnectedOrConnecting()) {
                        if (!mNetworkInfo.isFailover()) {
                            if(isDownLoad ==true){
                                if(!download.equals("")){
                                    Uri uri = Uri.parse(download);
                                    Intent i = new Intent(Intent.ACTION_VIEW, uri);
                                    startActivity(i);
                                }
                            }
                            else if (!version.equals("1.0.0")) {
                                _btnUpdate.setText("可更新");
                                isDownLoad =true;
                                _btnUpdate.setTextColor(Color.parseColor("#FF0000"));
                            }
                            else {
                                _btnUpdate.setText("無更新");
                                //檢查更新
                                checkVersion();
                                checkDownload();
                            }
                        } else {

                        }
                    }
                }
            }
        }

    }

    public class MyAdapter extends BaseAdapter{
        private LayoutInflater _myInflater;
        public MyAdapter (Context c){
            _myInflater=LayoutInflater.from(c);
        }
        @Override
        public int getCount(){
            return _arrListTitle.length;
        }
        @Override
        public Object getItem(int position){
            return _arrListTitle[position];
        }
        @Override
        public long getItemId(int position){
            return position;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            convertView=_myInflater.inflate(R.layout.style_main,null);
            ImageView imgLogo =(ImageView)convertView.findViewById(R.id.img_Logo);
            TextView txtTitle=(TextView)convertView.findViewById(R.id.txt_mainTitle);
            TextView txtSubTitle=(TextView)convertView.findViewById(R.id.txt_mainSubTitle);
            imgLogo.setImageResource(_arrResID[position]);
            txtTitle.setText(_arrListTitle[position]);
            txtSubTitle.setText(_arrListSubTitle[position]);
            return convertView;
        }
    }
    // ListView Listener
    private ListView.OnItemClickListener listItemListener=new ListView.OnItemClickListener(){
        @Override
                public void onItemClick(AdapterView<?> parent,View view,int position,long id){
            if(_sceneName=="main"){
                checkInternet();
                _sceneName="menu";
                _albumName=parent.getItemAtPosition(position).toString();
                showMenu(parent.getItemAtPosition(position).toString());
                _btnUpdate.setVisibility(View.GONE);
                _btnSearch.setVisibility(View.GONE);
                _btnFamily.setVisibility(View.GONE);
                _btnMenuBackMain.setVisibility(View.VISIBLE);
            }
            else if(_sceneName=="menu"){
                Intent menu=new Intent();
                menu.setClass(MainActivity.this,WordView.class);
                Bundle bundle=new Bundle();
                bundle.putInt("Location",position);
                bundle.putString("AlbumName",_albumName);
                menu.putExtras(bundle);
                startActivity(menu);
            }
        }
    };

    private void showMenu(String albumName){
        switch (albumName){
            case "聖歌":
                _menuAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, _arrMenuHoly);
                break;
            case "詩歌本":
                _menuAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, _arrMenuPoetry);
                break;
            case "將天敞開":
                _menuAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, _arrMenu17);
                break;
            case "從心合一":
                _menuAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, _arrMenu18);
                break;
            case "這裡有榮耀":
                _menuAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, _arrMenu19);
                break;
            case "新的事將要成就":
                _menuAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, _arrMenu20);
                break;
            case "我要看見":
                _menuAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, _arrMenu21);
                break;
            case "為著你的榮耀":
                _menuAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, _arrMenu2012);
                break;
            case "亞洲為耶穌":
                _menuAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, _arrMenu2013);
                break;
            case "堅強的愛":
                _menuAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, _arrMenu2014);
                break;
            case "竭力追求":
                _menuAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, _arrMenu2015);
                break;
            case "小小的夢想":
                _menuAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, _arrMenuK1);
                break;
            case "認識你真好":
                _menuAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, _arrMenuK2);
                break;
            case "有一位神":
                _menuAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, _arrMenuK3);
                break;
            case "把冷漠變成愛":
                _menuAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, _arrMenuK4);
                break;
            case "新造的人":
                _menuAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, _arrMenuK5);
                break;
            case "讚美的孩子最喜樂":
                _menuAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, _arrMenuK6);
                break;
            case "彩虹":
                _menuAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, _arrMenuK7);
                break;
        }
        _listMain.setAdapter(_menuAdapter);
    }

    //檢查更新與取的亂數
    private void checkVersion() {
        // 建立Request，設置連線資訊
        final Request request = new Request.Builder()
                .url("http://chinshin.pancakeapps.com/version.html")
                .build();
        // 建立Call
        Call call = client.newCall(request);
        // 執行Call連線到網址
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                // 連線成功，自response取得連線結果
                String result = response.body().string();
                try {
                    version = new JSONObject(result).getString("version");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Log.d("OkHttp version", version);
            }
            // 連線失敗
            @Override
            public void onFailure(Call call, IOException e) {
            }
        });
    }

    private void checkDownload() {
        // 建立Request，設置連線資訊
        final Request request = new Request.Builder()
                .url("http://chinshin.pancakeapps.com/download.html")
                .build();
        // 建立Call
        Call call = client.newCall(request);
        // 執行Call連線到網址
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                // 連線成功，自response取得連線結果
                String result = response.body().string();
                try {
                    download = new JSONObject(result).getString("download");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Log.d("OkHttp download", download);
            }
            // 連線失敗
            @Override
            public void onFailure(Call call, IOException e) {
            }
        });
    }

    private Button.OnClickListener btnListener = new Button.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_MenuBackMain:
                    if(_sceneName=="menu"){
                        _sceneName="main";
                        _listMain.setAdapter(_mainAdapter);
                        _btnMenuBackMain.setVisibility(View.GONE);
                        _btnUpdate.setVisibility(View.VISIBLE);
                        _btnSearch.setVisibility(View.VISIBLE);
                        _btnFamily.setVisibility(View.VISIBLE);
                    }
                    break;
                case R.id.btn_Update:
                    checkInternet();
                    break;
                case R.id.btn_Family:
                    Intent family=new Intent();
                    family.setClass(MainActivity.this,FamilyArticle.class);
                    startActivity(family);
                    break;
                case R.id.btn_Search:
                    Intent intentSearch = new Intent();
                    intentSearch.setClass(MainActivity.this, Search.class);
                    startActivity(intentSearch);
                    break;
            }
        }
    };

}
