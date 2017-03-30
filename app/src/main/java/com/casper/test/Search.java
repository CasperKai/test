package com.casper.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.casper.test.hollySong.wordHollySong;
import com.casper.test.jesus2012.wordJesus2012;
import com.casper.test.jesus2013.wordJesus2013;
import com.casper.test.jesus2014.wordJesus2014;
import com.casper.test.jesus2015.wordJesus2015;
import com.casper.test.kid01.wordKid01;
import com.casper.test.kid02.wordKid02;
import com.casper.test.kid03.wordKid03;
import com.casper.test.kid04.wordKid04;
import com.casper.test.kid05.wordKid05;
import com.casper.test.kid06.wordKid06;
import com.casper.test.kid07.wordKid07;
import com.casper.test.poemtry.wordPoemtry;
import com.casper.test.streamOfPraise17.word17;
import com.casper.test.streamOfPraise18.word18;
import com.casper.test.streamOfPraise19.word19;
import com.casper.test.streamOfPraise20.word20;
import com.casper.test.streamOfPraise21.word21;

public class Search extends AppCompatActivity {
    private EditText inputText;
    private Button btn_search,btn_home;
    private TextView txt01,txt02,txt03,txt04,txt05,txt06,txt07,txt08;


    private int[][] ansSearchInt=new int[9][9];

    //搜尋記錄用
    private String[] record={"0","0","0","0","0","0","0","0","0"};
    //專輯名稱
    private String[] name={"0","聖歌","詩歌本","為著你的榮耀","亞洲為耶穌","堅強的愛","竭力追求",
                            "將天敞開","從心合一","這裡有榮耀","新的事將要成就","我要看見",
                            "小小的夢想","認識祢真好", "有一位神","把冷漠變成愛","新造的人","讚美的孩子最喜樂","彩虹"};
    //第x首
    private String[] number={"0","第一首","第二首","第三首","第四首","第五首","第六首","第七首","第八首","第九首","第十首","第十一首","第十二首",
                            "第十三首","第十四首","第十五首","第十六首","第十七首","第十八首","第十九首","第二十首","第二十一首","第二十二首","第二十三首",
                            "第二十四首","第二十五首","第二十六首","第二十七首","第二十八首","第二十九首","第三十首","第三十一首","第三十二首","第三十三首",
                            "第三十四首","第三十五首","第三十六首","第三十七首","第三十八首","第三十九首","第四十首","第四十一首","第四十二首","第四十三首",
                            "第四十四首","第四十五首","第四十六首","第四十七首","第四十八首","第四十九首","第五十首","第五十一首","第五十二首","第五十三首",
                            "第五十四首","第五十五首","第五十六首","第五十七首","第五十八首","第五十九首","第六十首","第六十一首","第六十二首","第六十三首",
                            "第六十四首","第六十五首","第六十六首","第六十七首","第六十八首","第六十九首","第七十首","第七十一首","第七十二首","第七十三首",
                            "第七十四首","第七十五首","第七十六首","第七十七首","第七十八首","第七十九首","第八十首","第八十一首","第八十二首","第八十三首",
                            "第八十四首","第八十五首","第八十六首","第八十七首","第八十八首","第八十九首","第九十首","第九十一首","第九十二首","第九十三首",
                            "第九十四首","第九十五首","第九十六首","第九十七首","第九十八首","第九十九首","第一百首"};
    //聖歌
    private String[] holly={"0","勝利者新歌","聖美的新歌","榮耀的恩賜","黑暗裡的勢力","復歸的樂園","聖苑的恩賜", "樂園之歌","青年之歌","朝陽之歌",
                            "我要勇往","苦難與新生命","我是供物","誓約", "成和勇士之歌","吹走嘆息吧","光輝的祖國","復歸的心情","來成就神的偉業",
                             "天的勇士", "找到的榮光","歸我背負的十字架","光是從東方來","獻上一切往前進","苦難的耶穌","聚集成一體", "統一勇士之歌",
                            "新伊甸園之歌","被召命的我","我的小羊","成和青年進行曲","榮耀之日", "願祢回應","寂寞的山谷","主臨到","主啊願祢來",
                            "農園之歌","找到的羊群","夢般的旅途", "主是我的一切","我的朋友耶穌","飲喝生命水","我想到主面前","吾心所願","天的盛宴",
                            "生活在活泉邊","樂園春天之歌","主日學兒童之歌","趕快回來吧","主是我們的牧者","蒙召的青年們", "丹心歌","出埃及","再相會",
                            "勝利之歌","榮耀的主","確信的人","主常在我身邊", "蒙召前進","我的故鄉","危險的試煉中","珍貴的寶物","向迦南前進",
                            "黑暗的路途上", "我主的家庭","所盼望的那一日","傳揚吧","早晨的小鳥","恩惠與奇蹟","十字架上的呼求", "大自然的禮讚",
                            "早晨的讚美","與主同生","向著十字架","儆醒禱告","以色列啊歸來吧", "善的爭戰已成就了","青年之樹","光照亮大地","愛鄉歌",
                            "愛的統一","空中的飛鳥", "由我心而出","幸福是什麼","光榮的聖戰","追求美的心","春之旅","小小的生命", "生命之樹","星光",
                            "總有一天會明瞭","x91","x92","讓我們手拉手","奉獻歌","統一歌","歡迎歌"};


    //約書亞-為著你的榮耀  第一首為背景音樂
    private String[] jesus2012={"0","0","一切都更新","我要全心稱頌我的主","和散那","為著你的榮耀","純潔的心","你的愛","超乎萬名之名","與你更靠近","你是我天父","沒有人像你一樣愛我","恩典之流","求充滿這地"};
    //約書亞-亞洲為耶穌
    private String[] jesus2013={"0","我自由","再做一次","打開天門","你愛不變","天堂的歌","你同在如天堂降臨","更靠近","超自然能力","亞洲為耶穌","天父的愛","你是配得","我聽見主走過來","幾千公里"};
    //約書亞-堅強的愛
    private String[] jesus2014={"0","堅強的愛","國度屬於你","你聖名","SPIRIT BREAK OUT","用你雙手擁抱我","我要愛慕你","神偉大的舞池","甦醒","耶穌基督","敬拜的心","進城曲","就是現在"};
    //約書亞-竭力追求
    private String[] jesus2015={"0","天父的國度","好土","直到永遠","竭力追求","我們敬拜你","器皿","有一個盼望","祂是你的幫助","你的香氣","安靜居所"};
    //詩歌本
    private String[] poemtry={"0","01 相信有愛就有奇蹟","02 愛可以再更多一點點","03 為愛合一禱告","04 掌上明珠","05 禱告","06 雲上太陽","07 把冷漠變成愛",
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
            "90 YouRaiseMeUp","x91"};
    //讚美之泉-將天敞開
    private String[] album17={"0","將天敞開","日日夜夜","配得頌揚","活著為要敬拜祢","新耶路撒冷","一同起舞","十架的愛","救贖的恩典","為耶路撒冷祈禱",
                            "我要順服","自由地歌唱","就是這個時刻","我已得自由","同心高舉十架"};
    //讚美之泉-從心合一
    private String[] album18={"0","從心合一","深刻的愛","回家","永遠不分離","是祢的愛","新的一天","齊來讚美","我有喜樂","聖靈的江河","帶我進入祢的同在",
                            "願祢降臨","禱告的大軍","耶和華作了我的高臺","天上的家"};
    //讚美之泉-這裡有榮耀
    private String[] album19={"0","這裡有榮耀","我們歡迎君王降臨","極大的聲音","更多充滿","從這代到那代","愛中相遇","以馬內利","永恆唯一的盼望",
                            "主祢的疼","謝謝祢","大手牽著小手","耶和華大能的軍隊","我心唯一愛慕","順服"};
    //讚美之泉-新的事將要成就
    private String[] album20={"0","給夢想一雙翅膀","新的事將要成就","新的異象新的方向","只要有祢在我左右","我們愛戴的王","榮耀大君王","安靜","奔跑不放棄",
                            "能不能","醫治我","找一個地方","全新的生命","前來敬拜","敬拜讓世界震動","傾倒","三百六十五天","祢的器皿","願祢國度降臨"};
    //讚美之泉-我要看見
    private String[] album21={"0","我要看見","每一天我需要祢","讓我得見祢的榮面","獻上尊榮","更深之處","近前來","行神蹟的神","這是耶和華所定日子",
                            "這世代要呼求祢","在至高之處","為愛而生","祢必成就美好事"};
    //兒童敬拜1-小小的夢'想
    private String[] albumKid1={"0","滿有能力","雲上太陽","小小的夢想","最深愛的主","天天讚美","主的喜樂是我力量","ShakyShkayTime","讚美之泉","我要向高山舉目","晚安曲"};
    //兒童敬拜2-認識祢真好
    private String[] albumKid2={"0","讓讚美飛揚","看見復興","認識祢真好","我們愛","天父的花園","耶穌愛你","耶穌我愛祢","賜福於你","耶和華是我牧者","在祢寶座前"};
    //兒童敬拜3-有一位神
    private String[] albumKid3={"0","如果你想知道","我們是光明之子","有一位神","求主充滿我","親愛的要記得","爸爸媽媽的愛","祢的慈愛","喔十字架","進入豐盛","祢的同在","彈琴歌唱讚美祢"};
    //兒童敬拜4-把冷漠變成愛
    private String[] albumKid4={"0","讓愛走動","何等有福","把冷漠變成愛","多麼奇妙","有人在等你","耶穌我的耶穌","注目看耶穌","深深愛祢","愛可以再更多一點點","專心仰望耶穌","將天敞開"};
    //兒童敬拜5-新造的人
    private String[] albumKid5={"0","新造的人","歡呼","恩典之路","回家","相信有愛就有奇蹟","齊來讚美","耶和華沙龍","耶穌的名","歌頌","祢的愛長闊高深"};
    //兒童敬拜6-讚美的孩子最喜樂
    private String[] albumKid6={"0","讚美的孩子最喜樂","我有喜樂","保護我的是耶和華","喜樂自由","這裡有榮耀","震動天地","主祢是我力量","何等恩典","永遠愛祢","愛我願意","我已得自由","我的家要榮耀主"};
    //兒童敬拜7-彩虹
    private String[] albumKid7={"0","彩虹","DontWorry","耶穌是我的好朋友","靠主得勝","愛我的天父","聖靈的江河","新的一天","只要有祢在我左右","新的事將要成就","我對祢的愛不變","我們歡迎君王降臨","榮耀的呼召","差遣我"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        inputText=(EditText)findViewById(R.id.inputText);
        btn_search =(Button)findViewById(R.id.btnSearch);
        btn_home=(Button)findViewById(R.id.btnSearchPrevious);
        txt01=(TextView)findViewById(R.id.search01);
        txt02=(TextView)findViewById(R.id.search02);
        txt03=(TextView)findViewById(R.id.search03);
        txt04=(TextView)findViewById(R.id.search04);
        txt05=(TextView)findViewById(R.id.search05);
        txt06=(TextView)findViewById(R.id.search06);
        txt07=(TextView)findViewById(R.id.search07);
        txt08=(TextView)findViewById(R.id.search08);

        inputText.setText("");
        btn_search.setOnClickListener(btnListener);
        btn_home.setOnClickListener(btnListener);
        txt01.setOnClickListener(btnListener);
        txt02.setOnClickListener(btnListener);
        txt03.setOnClickListener(btnListener);
        txt04.setOnClickListener(btnListener);
        txt05.setOnClickListener(btnListener);
        txt06.setOnClickListener(btnListener);
        txt07.setOnClickListener(btnListener);
        txt08.setOnClickListener(btnListener);
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btnSearch:
                    txt01.setText("");
                    txt02.setText("");
                    txt03.setText("");
                    txt04.setText("");
                    txt05.setText("");
                    txt06.setText("");
                    txt07.setText("");
                    txt08.setText("");
                    if("".equals(inputText.getText().toString().trim())){
                        break;
                    }
                        //記錄歸零
                        for (int z = 1; z <= 8; z++) {
                            record[z] = "0";
                        }
                        //搜尋 聖歌
                        for (int a = 1; a < holly.length; a++) {
                            int times = holly[a].length() - inputText.getText().toString().length() + 1;
                            for (int aa = 0; aa < times; aa++) {
                                if (inputText.getText().toString().equals(holly[a].subSequence(aa, aa + inputText.getText().toString().length()))) {
                                    show(1, a, holly[a]);
                                    break;
                                }
                            }
                        }
                        //搜尋 詩歌本
                        for (int b = 1; b < poemtry.length; b++) {
                            int times = poemtry[b].length() - inputText.getText().toString().length() + 1;
                            for (int bb = 0; bb < times; bb++) {
                                if (inputText.getText().toString().equals(poemtry[b].subSequence(bb, bb + inputText.getText().toString().length()))) {
                                    show(2, b, poemtry[b]);
                                    break;
                                }
                            }
                        }
                        //搜尋 約書亞-為著你的榮耀
                        for (int c = 1; c < jesus2012.length; c++) {
                            int times = jesus2012[c].length() - inputText.getText().toString().length() + 1;
                            for (int cc = 0; cc < times; cc++) {
                                if (inputText.getText().toString().equals(jesus2012[c].subSequence(cc, cc + inputText.getText().toString().length()))) {
                                    show(3, c, jesus2012[c]);
                                    break;
                                }
                            }
                        }
                        //搜尋 約書亞-亞洲為耶穌
                        for (int c = 1; c < jesus2013.length; c++) {
                            int times = jesus2013[c].length() - inputText.getText().toString().length() + 1;
                            for (int cc = 0; cc < times; cc++) {
                                if (inputText.getText().toString().equals(jesus2013[c].subSequence(cc, cc + inputText.getText().toString().length()))) {
                                    show(4, c, jesus2013[c]);
                                    break;
                                }
                            }
                        }
                        //搜尋 約書亞-堅強的愛
                        for (int c = 1; c < jesus2014.length; c++) {
                            int times = jesus2014[c].length() - inputText.getText().toString().length() + 1;
                            for (int cc = 0; cc < times; cc++) {
                                if (inputText.getText().toString().equals(jesus2014[c].subSequence(cc, cc + inputText.getText().toString().length()))) {
                                    show(5, c, jesus2014[c]);
                                    break;
                                }
                            }
                        }
                        //搜尋 約書亞-竭力追求
                        for (int d = 1; d < jesus2015.length; d++) {
                            int times = jesus2015[d].length() - inputText.getText().toString().length() + 1;
                            for (int cc = 0; cc < times; cc++) {
                                if (inputText.getText().toString().equals(jesus2015[d].subSequence(cc, cc + inputText.getText().toString().length()))) {
                                    show(6, d, jesus2015[d]);
                                    break;
                                }
                            }
                        }
                        //搜尋 讚美之泉-將天敞開
                        for (int g = 1; g < album17.length; g++) {
                            int times = album17[g].length() - inputText.getText().toString().length() + 1;
                            for (int dd = 0; dd < times; dd++) {
                                if (inputText.getText().toString().equals(album17[g].subSequence(dd, dd + inputText.getText().toString().length()))) {
                                    show(7, g, album17[g]);
                                    break;
                                }
                            }
                        }
                        //搜尋 讚美之泉-從心合一
                        for (int f = 1; f < album18.length; f++) {
                            int times = album18[f].length() - inputText.getText().toString().length() + 1;
                            for (int ee = 0; ee < times; ee++) {
                                if (inputText.getText().toString().equals(album18[f].subSequence(ee, ee + inputText.getText().toString().length()))) {
                                    show(8, f, album18[f]);
                                    break;
                                }
                            }
                        }
                        //搜尋 讚美之泉-這裡有榮耀
                        for (int g = 1; g < album19.length; g++) {
                            int times = album19[g].length() - inputText.getText().toString().length() + 1;
                            for (int ff = 0; ff < times; ff++) {
                                if (inputText.getText().toString().equals(album19[g].subSequence(ff, ff + inputText.getText().toString().length()))) {
                                    show(9, g, album19[g]);
                                    break;
                                }
                            }
                        }
                        //搜尋 讚美之泉-新的事將要成就
                        for (int h = 1; h < album20.length; h++) {
                            int times = album20[h].length() - inputText.getText().toString().length() + 1;
                            for (int gg = 0; gg < times; gg++) {
                                if (inputText.getText().toString().equals(album20[h].subSequence(gg, gg + inputText.getText().toString().length()))) {
                                    show(10, h, album20[h]);
                                    break;
                                }
                            }
                        }
                        //搜尋 讚美之泉-我要看見
                        for (int i = 1; i < album21.length; i++) {
                            int times = album21[i].length() - inputText.getText().toString().length() + 1;
                            for (int hh = 0; hh < times; hh++) {
                                if (inputText.getText().toString().equals(album21[i].subSequence(hh, hh + inputText.getText().toString().length()))) {
                                    show(11, i, album21[i]);
                                    break;
                                }
                            }
                        }
                    //搜尋 兒童敬拜1
                    for (int aa = 1; aa < albumKid1.length; aa++) {
                        int times = albumKid1[aa].length() - inputText.getText().toString().length() + 1;
                        for (int hh = 0; hh < times; hh++) {
                            if (inputText.getText().toString().equals(albumKid1[aa].subSequence(hh, hh + inputText.getText().toString().length()))) {
                                show(12, aa, albumKid1[aa]);
                                break;
                            }
                        }
                    }
                    //搜尋 兒童敬拜2
                    for (int bb = 1; bb < albumKid2.length; bb++) {
                        int times = albumKid2[bb].length() - inputText.getText().toString().length() + 1;
                        for (int hh = 0; hh < times; hh++) {
                            if (inputText.getText().toString().equals(albumKid2[bb].subSequence(hh, hh + inputText.getText().toString().length()))) {
                                show(13, bb, albumKid2[bb]);
                                break;
                            }
                        }
                    }
                    //搜尋 兒童敬拜3
                    for (int cc = 1; cc < albumKid3.length; cc++) {
                        int times = albumKid3[cc].length() - inputText.getText().toString().length() + 1;
                        for (int hh = 0; hh < times; hh++) {
                            if (inputText.getText().toString().equals(albumKid3[cc].subSequence(hh, hh + inputText.getText().toString().length()))) {
                                show(14, cc, albumKid3[cc]);
                                break;
                            }
                        }
                    }
                    //搜尋 兒童敬拜4
                    for (int dd = 1; dd < albumKid4.length; dd++) {
                        int times = albumKid4[dd].length() - inputText.getText().toString().length() + 1;
                        for (int hh = 0; hh < times; hh++) {
                            if (inputText.getText().toString().equals(albumKid4[dd].subSequence(hh, hh + inputText.getText().toString().length()))) {
                                show(15, dd, albumKid4[dd]);
                                break;
                            }
                        }
                    }
                    //搜尋 兒童敬拜5
                    for (int ee = 1; ee < albumKid5.length; ee++) {
                        int times = albumKid5[ee].length() - inputText.getText().toString().length() + 1;
                        for (int hh = 0; hh < times; hh++) {
                            if (inputText.getText().toString().equals(albumKid5[ee].subSequence(hh, hh + inputText.getText().toString().length()))) {
                                show(16, ee, albumKid5[ee]);
                                break;
                            }
                        }
                    }
                    //搜尋 兒童敬拜6
                    for (int ff = 1; ff < albumKid6.length; ff++) {
                        int times = albumKid6[ff].length() - inputText.getText().toString().length() + 1;
                        for (int hh = 0; hh < times; hh++) {
                            if (inputText.getText().toString().equals(albumKid6[ff].subSequence(hh, hh + inputText.getText().toString().length()))) {
                                show(17, ff, albumKid6[ff]);
                                break;
                            }
                        }
                    }
                    //搜尋 兒童敬拜7
                    for (int gg = 1; gg < albumKid7.length; gg++) {
                        int times = albumKid7[gg].length() - inputText.getText().toString().length() + 1;
                        for (int hh = 0; hh < times; hh++) {
                            if (inputText.getText().toString().equals(albumKid7[gg].subSequence(hh, hh + inputText.getText().toString().length()))) {
                                show(18, gg, albumKid7[gg]);
                                break;
                            }
                        }
                    }
                    break;
                case R.id.btnSearchPrevious:
                    finish();
                    break;
                case R.id.search01:
                    if("".equals(txt01.getText().toString().trim())){
                        break;
                    }
                    else{
                    Intent intent01=new Intent();
                    if(ansSearchInt[1][1]==1)intent01.setClass(Search.this,wordHollySong.class);
                    else if(ansSearchInt[1][1]==2)intent01.setClass(Search.this,wordPoemtry.class);
                    else if(ansSearchInt[1][1]==3)intent01.setClass(Search.this,wordJesus2012.class);
                    else if(ansSearchInt[1][1]==4)intent01.setClass(Search.this,wordJesus2013.class);
                    else if(ansSearchInt[1][1]==5)intent01.setClass(Search.this,wordJesus2014.class);
                    else if(ansSearchInt[1][1]==6)intent01.setClass(Search.this,wordJesus2015.class);
                    else if(ansSearchInt[1][1]==7)intent01.setClass(Search.this,word17.class);
                    else if(ansSearchInt[1][1]==8)intent01.setClass(Search.this,word18.class);
                    else if(ansSearchInt[1][1]==9)intent01.setClass(Search.this,word19.class);
                    else if(ansSearchInt[1][1]==10)intent01.setClass(Search.this,word20.class);
                    else if(ansSearchInt[1][1]==11)intent01.setClass(Search.this,word21.class);
                    else if(ansSearchInt[1][1]==12)intent01.setClass(Search.this,wordKid01.class);
                    else if(ansSearchInt[1][1]==13)intent01.setClass(Search.this,wordKid02.class);
                    else if(ansSearchInt[1][1]==14)intent01.setClass(Search.this,wordKid03.class);
                    else if(ansSearchInt[1][1]==15)intent01.setClass(Search.this,wordKid04.class);
                    else if(ansSearchInt[1][1]==16)intent01.setClass(Search.this,wordKid05.class);
                    else if(ansSearchInt[1][1]==17)intent01.setClass(Search.this,wordKid06.class);
                    else if(ansSearchInt[1][1]==18)intent01.setClass(Search.this,wordKid07.class);
                    intent01.putExtra("Number",ansSearchInt[1][2]);
                    intent01.putExtra("Search",2);
                    startActivity(intent01);
                    }
                    break;
                case R.id.search02:
                    if("".equals(txt02.getText().toString().trim())){
                        break;
                    }
                    else{
                    Intent intent02=new Intent();
                    if(ansSearchInt[2][1]==1)intent02.setClass(Search.this,wordHollySong.class);
                    else if(ansSearchInt[2][1]==2)intent02.setClass(Search.this,wordPoemtry.class);
                    else if(ansSearchInt[2][1]==3)intent02.setClass(Search.this,wordJesus2012.class);
                    else if(ansSearchInt[2][1]==4)intent02.setClass(Search.this,wordJesus2013.class);
                    else if(ansSearchInt[2][1]==5)intent02.setClass(Search.this,wordJesus2014.class);
                    else if(ansSearchInt[2][1]==6)intent02.setClass(Search.this,wordJesus2015.class);
                    else if(ansSearchInt[2][1]==7)intent02.setClass(Search.this,word17.class);
                    else if(ansSearchInt[2][1]==8)intent02.setClass(Search.this,word18.class);
                    else if(ansSearchInt[2][1]==9)intent02.setClass(Search.this,word19.class);
                    else if(ansSearchInt[2][1]==10)intent02.setClass(Search.this,word20.class);
                    else if(ansSearchInt[2][1]==11)intent02.setClass(Search.this,word21.class);
                    else if(ansSearchInt[2][1]==12)intent02.setClass(Search.this,wordKid01.class);
                    else if(ansSearchInt[2][1]==13)intent02.setClass(Search.this,wordKid02.class);
                    else if(ansSearchInt[2][1]==14)intent02.setClass(Search.this,wordKid03.class);
                    else if(ansSearchInt[2][1]==15)intent02.setClass(Search.this,wordKid04.class);
                    else if(ansSearchInt[2][1]==16)intent02.setClass(Search.this,wordKid05.class);
                    else if(ansSearchInt[2][1]==17)intent02.setClass(Search.this,wordKid06.class);
                    else if(ansSearchInt[2][1]==18)intent02.setClass(Search.this,wordKid07.class);
                    intent02.putExtra("Number",ansSearchInt[2][2]);
                    intent02.putExtra("Search",2);
                    startActivity(intent02);
                    }
                    break;
                case R.id.search03:
                    if("".equals(txt03.getText().toString().trim())){
                        break;
                    }
                    else{
                    Intent intent03=new Intent();
                    if(ansSearchInt[3][1]==1)intent03.setClass(Search.this,wordHollySong.class);
                    else if(ansSearchInt[3][1]==2)intent03.setClass(Search.this,wordPoemtry.class);
                    else if(ansSearchInt[3][1]==3)intent03.setClass(Search.this,wordJesus2012.class);
                    else if(ansSearchInt[3][1]==4)intent03.setClass(Search.this,wordJesus2013.class);
                    else if(ansSearchInt[3][1]==5)intent03.setClass(Search.this,wordJesus2014.class);
                    else if(ansSearchInt[3][1]==6)intent03.setClass(Search.this,wordJesus2015.class);
                    else if(ansSearchInt[3][1]==7)intent03.setClass(Search.this,word17.class);
                    else if(ansSearchInt[3][1]==8)intent03.setClass(Search.this,word18.class);
                    else if(ansSearchInt[3][1]==9)intent03.setClass(Search.this,word19.class);
                    else if(ansSearchInt[3][1]==10)intent03.setClass(Search.this,word20.class);
                    else if(ansSearchInt[3][1]==11)intent03.setClass(Search.this,word21.class);
                    else if(ansSearchInt[3][1]==12)intent03.setClass(Search.this,wordKid01.class);
                    else if(ansSearchInt[3][1]==13)intent03.setClass(Search.this,wordKid02.class);
                    else if(ansSearchInt[3][1]==14)intent03.setClass(Search.this,wordKid03.class);
                    else if(ansSearchInt[3][1]==15)intent03.setClass(Search.this,wordKid04.class);
                    else if(ansSearchInt[3][1]==16)intent03.setClass(Search.this,wordKid05.class);
                    else if(ansSearchInt[3][1]==17)intent03.setClass(Search.this,wordKid06.class);
                    else if(ansSearchInt[3][1]==18)intent03.setClass(Search.this,wordKid07.class);
                    intent03.putExtra("Number",ansSearchInt[3][2]);
                    intent03.putExtra("Search",2);
                    startActivity(intent03);
                    }
                    break;
                case R.id.search04:
                    if("".equals(txt04.getText().toString().trim())){
                        break;
                    }
                    else{
                    Intent intent04=new Intent();
                    if(ansSearchInt[4][1]==1)intent04.setClass(Search.this,wordHollySong.class);
                    else if(ansSearchInt[4][1]==2)intent04.setClass(Search.this,wordPoemtry.class);
                    else if(ansSearchInt[4][1]==3)intent04.setClass(Search.this,wordJesus2012.class);
                    else if(ansSearchInt[4][1]==4)intent04.setClass(Search.this,wordJesus2013.class);
                    else if(ansSearchInt[4][1]==5)intent04.setClass(Search.this,wordJesus2014.class);
                    else if(ansSearchInt[4][1]==6)intent04.setClass(Search.this,wordJesus2015.class);
                    else if(ansSearchInt[4][1]==7)intent04.setClass(Search.this,word17.class);
                    else if(ansSearchInt[4][1]==8)intent04.setClass(Search.this,word18.class);
                    else if(ansSearchInt[4][1]==9)intent04.setClass(Search.this,word19.class);
                    else if(ansSearchInt[4][1]==10)intent04.setClass(Search.this,word20.class);
                    else if(ansSearchInt[4][1]==11)intent04.setClass(Search.this,word21.class);
                    else if(ansSearchInt[4][1]==12)intent04.setClass(Search.this,wordKid01.class);
                    else if(ansSearchInt[4][1]==13)intent04.setClass(Search.this,wordKid02.class);
                    else if(ansSearchInt[4][1]==14)intent04.setClass(Search.this,wordKid03.class);
                    else if(ansSearchInt[4][1]==15)intent04.setClass(Search.this,wordKid04.class);
                    else if(ansSearchInt[4][1]==16)intent04.setClass(Search.this,wordKid05.class);
                    else if(ansSearchInt[4][1]==17)intent04.setClass(Search.this,wordKid06.class);
                    else if(ansSearchInt[4][1]==18)intent04.setClass(Search.this,wordKid07.class);
                    intent04.putExtra("Number",ansSearchInt[4][2]);
                    intent04.putExtra("Search",2);
                    startActivity(intent04);
                    }
                    break;
                case R.id.search05:
                    if("".equals(txt05.getText().toString().trim())){
                        break;
                    }
                    else{
                    Intent intent05=new Intent();
                    if(ansSearchInt[5][1]==1)intent05.setClass(Search.this,wordHollySong.class);
                    else if(ansSearchInt[5][1]==2)intent05.setClass(Search.this,wordPoemtry.class);
                    else if(ansSearchInt[5][1]==3)intent05.setClass(Search.this,wordJesus2012.class);
                    else if(ansSearchInt[5][1]==4)intent05.setClass(Search.this,wordJesus2013.class);
                    else if(ansSearchInt[5][1]==5)intent05.setClass(Search.this,wordJesus2014.class);
                    else if(ansSearchInt[5][1]==6)intent05.setClass(Search.this,wordJesus2015.class);
                    else if(ansSearchInt[5][1]==7)intent05.setClass(Search.this,word17.class);
                    else if(ansSearchInt[5][1]==8)intent05.setClass(Search.this,word18.class);
                    else if(ansSearchInt[5][1]==9)intent05.setClass(Search.this,word19.class);
                    else if(ansSearchInt[5][1]==10)intent05.setClass(Search.this,word20.class);
                    else if(ansSearchInt[5][1]==11)intent05.setClass(Search.this,word21.class);
                    else if(ansSearchInt[5][1]==12)intent05.setClass(Search.this,wordKid01.class);
                    else if(ansSearchInt[5][1]==13)intent05.setClass(Search.this,wordKid02.class);
                    else if(ansSearchInt[5][1]==14)intent05.setClass(Search.this,wordKid03.class);
                    else if(ansSearchInt[5][1]==15)intent05.setClass(Search.this,wordKid04.class);
                    else if(ansSearchInt[5][1]==16)intent05.setClass(Search.this,wordKid05.class);
                    else if(ansSearchInt[5][1]==17)intent05.setClass(Search.this,wordKid06.class);
                    else if(ansSearchInt[5][1]==18)intent05.setClass(Search.this,wordKid07.class);
                    intent05.putExtra("Number",ansSearchInt[5][2]);
                    intent05.putExtra("Search",2);
                    startActivity(intent05);
                    }
                    break;
                case R.id.search06:
                    if("".equals(txt06.getText().toString().trim())){
                        break;
                    }
                    else{
                    Intent intent06=new Intent();
                    if(ansSearchInt[6][1]==1)intent06.setClass(Search.this,wordHollySong.class);
                    else if(ansSearchInt[6][1]==2)intent06.setClass(Search.this,wordPoemtry.class);
                    else if(ansSearchInt[6][1]==3)intent06.setClass(Search.this,wordJesus2012.class);
                    else if(ansSearchInt[6][1]==4)intent06.setClass(Search.this,wordJesus2013.class);
                    else if(ansSearchInt[6][1]==5)intent06.setClass(Search.this,wordJesus2014.class);
                    else if(ansSearchInt[6][1]==6)intent06.setClass(Search.this,wordJesus2015.class);
                    else if(ansSearchInt[6][1]==7)intent06.setClass(Search.this,word17.class);
                    else if(ansSearchInt[6][1]==8)intent06.setClass(Search.this,word18.class);
                    else if(ansSearchInt[6][1]==9)intent06.setClass(Search.this,word19.class);
                    else if(ansSearchInt[6][1]==10)intent06.setClass(Search.this,word20.class);
                    else if(ansSearchInt[6][1]==11)intent06.setClass(Search.this,word21.class);
                    else if(ansSearchInt[6][1]==12)intent06.setClass(Search.this,wordKid01.class);
                    else if(ansSearchInt[6][1]==13)intent06.setClass(Search.this,wordKid02.class);
                    else if(ansSearchInt[6][1]==14)intent06.setClass(Search.this,wordKid03.class);
                    else if(ansSearchInt[6][1]==15)intent06.setClass(Search.this,wordKid04.class);
                    else if(ansSearchInt[6][1]==16)intent06.setClass(Search.this,wordKid05.class);
                    else if(ansSearchInt[6][1]==17)intent06.setClass(Search.this,wordKid06.class);
                    else if(ansSearchInt[6][1]==18)intent06.setClass(Search.this,wordKid07.class);
                    intent06.putExtra("Number",ansSearchInt[6][2]);
                    intent06.putExtra("Search",2);
                    startActivity(intent06);
                    }
                    break;
                case R.id.search07:
                    if("".equals(txt07.getText().toString().trim())){
                        break;
                    }
                    else{
                    Intent intent07=new Intent();
                    if(ansSearchInt[7][1]==1)intent07.setClass(Search.this,wordHollySong.class);
                    else if(ansSearchInt[7][1]==2)intent07.setClass(Search.this,wordPoemtry.class);
                    else if(ansSearchInt[7][1]==3)intent07.setClass(Search.this,wordJesus2012.class);
                    else if(ansSearchInt[7][1]==4)intent07.setClass(Search.this,wordJesus2013.class);
                    else if(ansSearchInt[7][1]==5)intent07.setClass(Search.this,wordJesus2014.class);
                    else if(ansSearchInt[7][1]==6)intent07.setClass(Search.this,wordJesus2015.class);
                    else if(ansSearchInt[7][1]==7)intent07.setClass(Search.this,word17.class);
                    else if(ansSearchInt[7][1]==8)intent07.setClass(Search.this,word18.class);
                    else if(ansSearchInt[7][1]==9)intent07.setClass(Search.this,word19.class);
                    else if(ansSearchInt[7][1]==10)intent07.setClass(Search.this,word20.class);
                    else if(ansSearchInt[7][1]==11)intent07.setClass(Search.this,word21.class);
                    else if(ansSearchInt[7][1]==12)intent07.setClass(Search.this,wordKid01.class);
                    else if(ansSearchInt[7][1]==13)intent07.setClass(Search.this,wordKid02.class);
                    else if(ansSearchInt[7][1]==14)intent07.setClass(Search.this,wordKid03.class);
                    else if(ansSearchInt[7][1]==15)intent07.setClass(Search.this,wordKid04.class);
                    else if(ansSearchInt[7][1]==16)intent07.setClass(Search.this,wordKid05.class);
                    else if(ansSearchInt[7][1]==17)intent07.setClass(Search.this,wordKid06.class);
                    else if(ansSearchInt[7][1]==18)intent07.setClass(Search.this,wordKid07.class);
                    intent07.putExtra("Number",ansSearchInt[7][2]);
                    intent07.putExtra("Search",2);
                    startActivity(intent07);
                    }
                    break;
                case R.id.search08:
                    if("".equals(txt08.getText().toString().trim())){
                        break;
                    }
                    else{
                    Intent intent08=new Intent();
                    if(ansSearchInt[8][1]==1)intent08.setClass(Search.this,wordHollySong.class);
                    else if(ansSearchInt[8][1]==2)intent08.setClass(Search.this,wordPoemtry.class);
                    else if(ansSearchInt[8][1]==3)intent08.setClass(Search.this,wordJesus2012.class);
                    else if(ansSearchInt[8][1]==4)intent08.setClass(Search.this,wordJesus2013.class);
                    else if(ansSearchInt[8][1]==5)intent08.setClass(Search.this,wordJesus2014.class);
                    else if(ansSearchInt[8][1]==6)intent08.setClass(Search.this,wordJesus2015.class);
                    else if(ansSearchInt[8][1]==7)intent08.setClass(Search.this,word17.class);
                    else if(ansSearchInt[8][1]==8)intent08.setClass(Search.this,word18.class);
                    else if(ansSearchInt[8][1]==9)intent08.setClass(Search.this,word19.class);
                    else if(ansSearchInt[8][1]==10)intent08.setClass(Search.this,word20.class);
                    else if(ansSearchInt[8][1]==11)intent08.setClass(Search.this,word21.class);
                    else if(ansSearchInt[8][1]==12)intent08.setClass(Search.this,wordKid01.class);
                    else if(ansSearchInt[8][1]==13)intent08.setClass(Search.this,wordKid02.class);
                    else if(ansSearchInt[8][1]==14)intent08.setClass(Search.this,wordKid03.class);
                    else if(ansSearchInt[8][1]==15)intent08.setClass(Search.this,wordKid04.class);
                    else if(ansSearchInt[8][1]==16)intent08.setClass(Search.this,wordKid05.class);
                    else if(ansSearchInt[8][1]==17)intent08.setClass(Search.this,wordKid06.class);
                    else if(ansSearchInt[8][1]==18)intent08.setClass(Search.this,wordKid07.class);
                    intent08.putExtra("Number",ansSearchInt[8][2]);
                    intent08.putExtra("Search",2);
                    startActivity(intent08);
                    }
                    break;
            }
        }
    };

    private void show(int albumName,int num,String songName){
        if(record[1]!="1"){
            record[1]="1";
            txt01.setText("("+name[albumName]+")"+number[num]+"-"+songName);
            ansSearchInt[1][1]=albumName;
            ansSearchInt[1][2]=num;
        }
        else if(record[2]!="1"){
            record[2]="1";
            txt02.setText("("+name[albumName]+")"+number[num]+"-"+songName);
            ansSearchInt[2][1]=albumName;
            ansSearchInt[2][2]=num;
        }
        else if(record[3]!="1"){
            record[3]="1";
            txt03.setText("("+name[albumName]+")"+number[num]+"-"+songName);
            ansSearchInt[3][1]=albumName;
            ansSearchInt[3][2]=num;
        }
        else if(record[4]!="1"){
            record[4]="1";
            txt04.setText("("+name[albumName]+")"+number[num]+"-"+songName);
            ansSearchInt[4][1]=albumName;
            ansSearchInt[4][2]=num;
        }
        else if(record[5]!="1"){
            record[5]="1";
            txt05.setText("("+name[albumName]+")"+number[num]+"-"+songName);
            ansSearchInt[5][1]=albumName;
            ansSearchInt[5][2]=num;
        }
        else if(record[6]!="1"){
            record[6]="1";
            txt06.setText("("+name[albumName]+")"+number[num]+"-"+songName);
            ansSearchInt[6][1]=albumName;
            ansSearchInt[6][2]=num;
        }
        else if(record[7]!="1"){
            record[7]="1";
            txt07.setText("("+name[albumName]+")"+number[num]+"-"+songName);
            ansSearchInt[7][1]=albumName;
            ansSearchInt[7][2]=num;
        }
        else if(record[8]!="1"){
            record[8]="1";
            txt08.setText("("+name[albumName]+")"+number[num]+"-"+songName);
            ansSearchInt[8][1]=albumName;
            ansSearchInt[8][2]=num;
        }
        else{

        }
    }

}
