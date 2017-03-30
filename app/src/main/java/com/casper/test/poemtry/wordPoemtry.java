package com.casper.test.poemtry;

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

public class wordPoemtry extends AppCompatActivity {
    private Button _btnPrevious,_btnHome,_btnFamily;
    private TextView textPoem;
    private ImageView btnPoemtryImage;
    private int number=0,vWidth=120,vHeight=60;
    private String[] strUrl={"https://www.youtube.com/watch?v=e_efJu4ds2k", "https://www.youtube.com/watch?v=uynIK1FzJYI",
                            "https://www.youtube.com/watch?v=bBwlodLdr6s", "https://www.youtube.com/watch?v=dYcSL1PAhkk",
                            "https://www.youtube.com/watch?v=fxiabfQtYSI", "https://www.youtube.com/watch?v=FnjEZHJQLZ8",
                            "https://www.youtube.com/watch?v=EcmiCWMk2z4", "https://www.youtube.com/watch?v=D_PKVbtvWL0",
                            "https://www.youtube.com/watch?v=22DGzAhIgA8", "https://www.youtube.com/watch?v=p88cvLzVgCQ",
                            "https://www.youtube.com/watch?v=SW1uUq8EibA", "https://www.youtube.com/watch?v=Ye1HwOZn_g4",
                            "https://www.youtube.com/watch?v=fbVfrT0dC-0", "https://www.youtube.com/watch?v=oWI_KNZiO6E",
                            "https://www.youtube.com/watch?v=vYiodNJcFN4", "https://www.youtube.com/watch?v=gROdEkLmv-c",
                            "https://www.youtube.com/watch?v=Ia3KOKLrXkc", "https://www.youtube.com/watch?v=DM5rvDpvodE",
                            "https://www.youtube.com/watch?v=i-ki1AngKyg", "https://www.youtube.com/watch?v=sa_Xq4sOKfw",
                            "https://www.youtube.com/watch?v=eC0U6mcj1KM", "https://www.youtube.com/watch?v=RqKFUBm_EC4",
                            "https://www.youtube.com/watch?v=6c95Jv_qgdI", "https://www.youtube.com/watch?v=b5Iw0njiKdI",
                            "https://www.youtube.com/watch?v=NCYd3FTaJRw", "https://www.youtube.com/watch?v=ZEmtjiWRCaQ",
                            "https://www.youtube.com/watch?v=2EFGw0rOZJE", "https://www.youtube.com/watch?v=vMiVrMaS3TM&list=PLA6Zakhvitg4UIIPvIvyHDX4uwxCpExKL",
                            "https://www.youtube.com/watch?v=_Ucqemhnhn4", "https://www.youtube.com/watch?v=450ft33doHc",
                            "https://www.youtube.com/watch?v=37DMiYepaK8", "https://www.youtube.com/watch?v=xQNpbW_lJIw",
                            "https://www.youtube.com/watch?v=0s6V2HFd7SI", "https://www.youtube.com/watch?v=0Q444bzsehU",
                            "https://www.youtube.com/watch?v=Zv23BJ_xql0", "https://www.youtube.com/watch?v=c-vsMHnIe8M",
                            "https://www.youtube.com/watch?v=tglTyo85OtY", "https://www.youtube.com/watch?v=mSrFg0qrLWY",
                            "https://www.youtube.com/watch?v=3dFOkYRGPUs", "https://www.youtube.com/watch?v=EAFxeqGJxtk",
                            "https://www.youtube.com/watch?v=7jfK_nZAI_0", "https://www.youtube.com/watch?v=SwOo8sFZQA8",
                            "https://www.youtube.com/watch?v=h3AD9FEOnPU", "https://www.youtube.com/watch?v=8xGdaxTpAYA",
                            "https://www.youtube.com/watch?v=PP_KS553vzw", "https://www.youtube.com/watch?v=-ZfJUkExWIg",
                            "https://www.youtube.com/watch?v=z0qi0eRwuxY", "https://www.youtube.com/watch?v=LIUhEC6MX70",
                            "https://www.youtube.com/watch?v=uvQNt8jacSQ", "https://www.youtube.com/watch?v=jHDAIgkUDQ0",
                            "https://www.youtube.com/watch?v=e3rjGMB1F5g", "https://www.youtube.com/watch?v=nOG3gLLoVMw",
                            "https://www.youtube.com/watch?v=GuJuLqDPRMw", "https://www.youtube.com/watch?v=NHPQMEPmZzI",
                            "https://www.youtube.com/watch?v=cO_BGMDEh9U","https://www.youtube.com/watch?v=u0hRVmoYvhQ",
                            "https://www.youtube.com/watch?v=KmkBu1723H0", "https://www.youtube.com/watch?v=-1-EFfEHYC4",
                            "https://www.youtube.com/watch?v=s2SePCDC2jg", "https://www.youtube.com/watch?v=5vH8eTQVwUE",
                            "https://www.youtube.com/watch?v=mMKj3pKYWGY", "https://www.youtube.com/watch?v=hIzUVGU9qyM",
                            "https://www.youtube.com/watch?v=0xTwulBUWoI", "https://www.youtube.com/watch?v=pjVm3XgffxA",
                            "https://www.youtube.com/watch?v=aNdHBTtwi8I", "https://www.youtube.com/watch?v=DGKKkll7Ito",
                            "https://www.youtube.com/watch?v=8Dx-KIxznFk","https://www.youtube.com/watch?v=-dQELbDA7wU",
                            "https://www.youtube.com/watch?v=QTK9olv2-ZE","https://www.youtube.com/watch?v=mFbmgTlIYG8",
                            "https://www.youtube.com/watch?v=y_KVO5EgLPM","https://www.youtube.com/watch?v=Pin90DY2g0w",
                            "https://www.youtube.com/watch?v=9qTZCLy93cs","https://www.youtube.com/watch?v=ckr5YeN7hKk",
                            "https://www.youtube.com/watch?v=kdLgQHYC_nk","https://www.youtube.com/watch?v=DvrTD_3zO1M",
                            "https://www.youtube.com/watch?v=T-MQk4qJwps","https://www.youtube.com/watch?v=o9nW7EXn8ds",
                            "https://www.youtube.com/watch?v=_xPPRWsc4kU","https://www.youtube.com/watch?v=UDgisiDCWAk",
                            "https://www.youtube.com/watch?v=fEVVhP7olsM","https://www.youtube.com/watch?v=1djhFMBttfI",
                            "https://www.youtube.com/watch?v=6jUXuM5V0F8","https://www.youtube.com/watch?v=E4yr-OMR3f4",
                            "https://www.youtube.com/watch?v=RtVYqQpHxNM","https://youtu.be/luUsg7WjSAA",
                            "https://www.youtube.com/watch?v=0SdM-qwvxi8","https://www.youtube.com/watch?v=FXn8pbY3q0U",
                            "https://www.youtube.com/watch?v=JDgpdgHIfNA","https://www.youtube.com/watch?v=JzW4m1iMsaQ",
                            "x91"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_poemtry);

        _btnHome=(Button)findViewById(R.id.btnPoemtryHome);
        _btnHome.setOnClickListener(btnListener);
        _btnPrevious=(Button)findViewById(R.id.btnPoemtryPrevious);
        _btnPrevious.setOnClickListener(btnListener);
        textPoem =(TextView)findViewById(R.id.textViewPoem);
        textPoem.setOnTouchListener(new ZoomListenter());
        btnPoemtryImage =(ImageView) findViewById(R.id.btnPoemtryView);
        btnPoemtryImage.setImageResource(R.drawable.youtube);
        btnPoemtryImage.getLayoutParams().width=vWidth;
        btnPoemtryImage.getLayoutParams().height=vHeight;
        btnPoemtryImage.setOnClickListener(btnListener);

        _btnFamily=(Button)findViewById(R.id.btnPoemtryFamily) ;
        _btnFamily.setOnClickListener(btnListener);

        _btnHome.setEnabled(true);
        Intent intent = getIntent();
        number = intent.getIntExtra("Number", 1);
        int ser=intent.getIntExtra("Search",1);
        if(ser==2){
            _btnHome.setEnabled(false);
        }
        if(number==1){
            textPoem.setText("黑夜將過去 未來不再遲疑\n牽起我的手 你給我勇氣\n曙光漸顯明 點亮前方路\n我展翅高飛 你給我信心\n\n只要相信 相信就有奇蹟\n揮動信心的翅膀 隨著夢想起飛\n\n相信有愛 就有奇蹟\n不要輕言放棄 只要打開眼睛\n手牽手一起 就不孤寂\n相信有愛 就有奇蹟\n雖然逆著風 你給我勇氣\n飛往那佳美之地\n只要相信 相信就有奇蹟\n揮動信心的翅膀 隨著夢想起飛");
        }
        else if(number==2){
            textPoem.setText("我可以擁有全世界 卻沒有愛\n我可以明白所有事 卻還是空白\n我可以用信心移山 卻還是孤單\n這世界沒有了愛 一切仍是黑白\n\n不要埋藏在心裡 把愛說出來\n不要默默在一旁 把愛活出來\n\n喔愛 可以再更多一點點\n不怕被傷害 把靈魂鎖起來\n\n愛 可以再更多一點點\n從天父來的愛 把懼怕挪開\n發現幸福在轉角與你相遇\n一瞬間 這世界變得好美");
        }
        else if(number==3){
            textPoem.setText("主啊　求祢憐憫醫治這地\n所有紛爭仇恨遠離這地方\n求主的愛醫治一切的傷口\n祢是醫治者　祢是真愛的源頭\n\n主啊　求祢赦免我們一切軟弱\n賜我們一顆謙卑愛人的心\n求主的愛　撫平一切的傷痕\n我們仰望祢　祢是和平的君王\n\n遵行主教導我們彼此相愛\n只有愛能使我們合而為一\n心連心　手牽手　我們同心禱告\n願真愛充滿每一個角落");
        }
        else if(number==4){
            textPoem.setText("我看見上帝的印記\n我聽見上帝的旨意\n我願意俯伏敬拜祢\n我願意歌舞頌揚祢\n一切都是祢的美意\n從此不再有心無力\n求主賜下流奶與蜜\n引領我至迦南美地\n\n主啊  我是祢的掌上明珠\n大海裡沉睡的珍珠\n雖然經過流淚之谷\n在曠野裡得蒙救贖\n\n主啊  我是祢的掌上明珠\n大海裡甦醒的珍珠\n我願用盡我的全部\n誠心所願  單單順服");
        }
        else if(number==5){
            textPoem.setText("禱告 因為我渺小\n禱告 因為我知道我需要\n明瞭祢心意對我們重要\n禱告 已假裝不了\n禱告 因為祢的愛我們需要\n祢關懷 我走過的祢都明白\n\n有些事我只想要對祢說\n因祢比任何人都愛我\n痛苦從眼中流下 我知道祢為我擦\n在早晨我也要來對祢說\n真父母今天我為祢活\n所需要的力量 祢天天賜給我\n祢恩典夠我用");
        }
        else if(number==6){
            textPoem.setText("無論是住在美麗的高山\n或是躺臥在\n陰暗的幽谷\n當你抬起頭你將會發現\n主已為你我而預備\n\n雲上太陽祂總不改變\n雖然小雨灑在臉上\n雲上太陽 祂總不改變\n哈 祂總不改變");
        }
        else if(number==7){
            textPoem.setText("你的眼是否被太多美麗的事物迷惑\n你的心是否被太多紛雜的世俗綁鎖\n分些關懷給角落中受傷的靈魂\n分些愛給那些不起眼的面孔\n\n以基督的心為心　以祂的眼看世界\n你身邊的人需要你我把冷漠變成愛\n以基督的心為心　以祂的眼看世界\n這世界需要你我把冷漠變成愛");
        }
        else if(number==8){
            textPoem.setText("從天父而來的愛和恩典\n把我們冰冷的心溶解\n讓我們獻出每個音符\n把它化為讚美之泉\n\n讓我們張開口  舉起手\n向永生之主稱謝\n使讚美之泉流入\n每個人的心間");
        }
        else if(number==9){
            textPoem.setText("常常喜樂 向主高歌 不論環境如何\n高山或低谷主都看顧 相信就能蒙福\n常常禱告 耐心等候 主做事有定時\n流淚撒種必歡呼收割 相信就有喜樂\n\n下垂的手再一次舉起來 封閉的心再一次敞開\n拋開一切憂慮 放下一切重擔\n來到主的面前我喜樂滿懷\n\n冰冷的心被主愛來溫暖 乾渴的靈被主愛充滿\n主是我的力量 主是我的高台\n死陰幽谷一路有天父陪伴\n他永不離開");
        }
        else if(number==10){
            textPoem.setText("主祢跟我走 往普天下走\n天涯海角緊緊抓住我\n主我跟祢走 往普天下走\n死蔭幽谷緊緊跟祢走\n因祢是 萬王之王 萬主之主\n有你跟著我 我還怕什麼\n因祢已 戰勝死亡 得勝君王\n這信心的路我永不回頭\n\n開起我的眼 信心的雙眼\n看那天使天軍在身邊\n塑造我的心 謙卑地聆聽\n祢的話語深植在我心\n因祢是 萬王之王 萬主之主\n有你跟著我 我還怕什麼\n因祢已 戰勝死亡 得勝君王\n這信心的路我永不回頭");
        }
        else if(number==11){
            textPoem.setText("信是未曾看見　依然仰望十架\n信是完全交託　深知主已掌權\n\n我靠著那加給我力量的　凡事都能做\n或風浪或低谷　主平安在我心\n我靠著那加給我力量的　凡事都能做\n行在主的旨意　我凡事都能做");
        }
        else if(number==12){
            textPoem.setText("放下世界的冠冕　單單為主發光\n舉起得勝的旌旗　這世代要為主興起\n轉化我的心　轉化我生命\n照亮黑暗的地方\n我的生命　要滿有異象\n分別為聖　活出大使命\n\n轉化我的心　轉化我生命\n主我願意 尋求你旨意\n轉化這世代　轉化這國家\n願這地百姓在愛中合一");
        }
        else if(number==13){
            textPoem.setText("祢是我喜樂泉源　祢使我歡欣跳躍\n祢使我自由飛翔　不再被罪惡綑綁\n祢是我永生盼望　祢愛有無比力量\n從今時直到永遠　祢應許不會改變\n\n祢的寶血  有能力能醫治一切的傷口\n祢的復活  能改變一切的咒詛成為祝福\n我們要高舉祢聖名  祢配得所有最大的讚美\n我們要用全心和全意  來敬拜祢\n我們要歡迎祢來臨  願祢來設立寶座在這裡\n我們要張開口  不停讚美祢");
        }
        else if(number==14){
            textPoem.setText("煉淨我  使我更像祢\n吸引我  使我更愛祢\n所有夢想和驕傲都放在祢腳前\n我要完全順服\n\n獻上生命  完全為祢用\n放下自己  願祢得榮耀\n全心跟隨  活出祢呼召\n\n父神我只願為祢活");
        }
        else if(number==15){
            textPoem.setText("停下來回頭看一看　祂的恩典一路相伴\n閉上眼用心去感覺　祂的愛從不曾離開\n抬起頭你將會發現　烏雲背後還是有藍天\n張開手迎向每一天　祂的恩典一定夠用\n\n你日子如何　力量也如何\n他應許永遠不會改變\n要相信不論明天將如何　祂恩典一定夠用\n每一次跌倒　站起來更剛強\n每腳步走得更有力量\n要相信不論明天將如何　祂恩典一定夠用");
        }
        else if(number==16){
            textPoem.setText("我要專心仰賴祢\n" + "不倚靠自己的聰明\n" + "在所行的事都要認定祢\n" + "\n" + "我要專心跟隨祢\n" + "不倚靠自己的能力\n" + "在所行的路祢必指引\n" + "\n" + "將祢的話語繫在頸項上　刻在心版上\n" + "主啊我站立敬畏祢\n" + "祢是道路真理和生命\n" + "走近祢心意\n" + "獻上一切主啊我尊榮祢\n");
        }
        else if(number==17){
            textPoem.setText("祢十字架的大能\n" + "重價贖回我靈魂\n" + "祢恩典使我被揀選\n" + "教我生命果子長存\n" + "\n" + "求主用我來贏得更多靈魂\n" + "堅固我　潔淨我\n" + "委身作祢門徒　求主差遣我去傳揚祢的愛\n" + "以愛擁抱城市　建立合一教會\n" + "賜我信心宣告\n" + "在祢凡事都能\n" + "哦主　在祢凡事都能\n");
        }
        else if(number==18){
            textPoem.setText("聖靈的烈火　來焚燒這地　燒盡一切過犯與不義\n" + "聖靈的烈火　來煉淨這地　使萬民聖潔都回轉向祢\n" + "復興的風　要吹遍全地　這片土地必然要得救\n" + "\n" + "勇敢站立　齊為此地呼求\n" + "心連心　高舉敬拜雙手\n" + "主願祢從天上垂聽醫治這地　\n" + "願我們的國家回轉向祢\n" + "\n" + "勇敢宣告　齊為此地呼求　\n" + "心連心　高舉敬拜雙手\n" + "主求祢　仰起祢的臉　光照我們\n" + "願屬祢的子民　定意跟隨祢\n" + "我們縱然失信　你仍是可信　\n" + "天父我們屬你　祢是我的神\n");
        }
        else if(number==19){
            textPoem.setText("我們是你的百姓\n" + "主祢是我們的神\n" + "用讚美打開城門\n" + "來預備祢救恩的道路\n" + "\n" + "呼喊吧　神的百姓　呼喊吧\n" + "耶和華已將這城交給我們\n" + "讓讚美的聲音不停息　如同大水淹沒仇敵\n" + "\n" + "呼喊吧　神的百姓　呼喊吧\n" + "耶和華已將這城交給我們\n" + "讓禱告的聲音不歇息　直到我們看見復興\n");
        }
        else if(number==20){
            textPoem.setText("走過傷心  走過淚水  \n" + "讓每一顆心  再次飛起來\n" + "用你的心  伸出你手  \n" + "讓每個靈魂  再次活過來\n" + "\n" + "讓愛走動  讓你的愛化成希望的種子\n" + "隨風揚起  編織美麗的夢\n" + "讓愛走動  讓你的愛\n" + "讓你的愛化成溫暖的擁抱\n" + "綻放陽光  編織神所造的夢\n");
        }
        else if(number==21){
            textPoem.setText("生命之花  萌芽自熊熊的火焰\n" + "在艱難中昇華  困苦中綻放\n" + "生命之花  含包着重重的考驗\n" + "在忍耐中伸展  失敗中成長\n" + "\n" + "讓我像那傲雪的寒梅  不停流露出生命芬芳\n" + "迎刺骨寒風茫茫飛雪  依然屹立  越冷越香\n" + "因我深知我信的是誰  我信的是造天地的主\n" + "有公義冠冕為我存留  直到那日他必與我同在\n" + "\n" + "苦難是祝福的一種包裝\n" + "試煉是成聖的橋梁\n");
        }
        else if(number==22){
            textPoem.setText("哦主　求祢保守我的心我的意念\n" + "使我能夠遵行祢旨意\n" + "我願將祢話語身藏在我心\n" + "作路上的光　成為我腳前的燈\n" + "\n" + "哦主　求祢堅固我信心我的力量\n" + "使我得以勇敢向前行\n" + "因我知道有時我仍會軟弱\n" + "求祢帶領我　使我不會再退縮\n" + "\n" + "我需要有祢在我生命中\n" + "好讓我一生能學祢的樣式\n" + "使我能成為祢所喜悅的兒女\n" + "使我的生命能夠彰顯祢榮耀\n");
        }
        else if(number==23){
            textPoem.setText("這一生最美的祝福\n" + "在無數的黑夜裡　我用星星畫出你\n" + "你的恩典如晨星　讓我真實的見到你\n" + "在我的歌聲裡　我用音符讚美你　\n" + "你的美好是我今生頌揚的　\n" + "\n" + "這一生最美的祝福　就是能認識真父母\n" + "這一生最美的祝福　就是能信靠真父母\n" + "走在高山深谷　祂會伴我同行\n" + "我知道　這是最美的祝福\n");
        }
        else if(number==24){
            textPoem.setText("奇異恩典　何等甘甜　我罪已得赦免\n" + "前我失喪　今被尋回　瞎眼今得看見\n" + "如此恩典　使我敬畏　使我心得安慰\n" + "初信之時　既蒙恩惠　真是何等寶貴\n" + "\n" + "許多危險　試煉網羅　我已安然經過\n" + "靠主恩典　安全不怕　更引導我歸家\n" + "將來禧年　聖徒歡聚　恩光愛誼千年\n" + "喜樂頌讚　在父座前　深望那日快現\n");
        }
        else if(number==25){
            textPoem.setText("我並不完美也並不特別\n" + "而祢卻是為我捨棄生命的主\n" + "我時常軟弱也許會迷惑\n" + "但祢是道路真理和生命\n" + "\n" + "主祢要往哪裡走我就跟祢走\n" + "領我走到世界盡頭\n" + "一生不再回頭\n" + "讓世界聽到我們敬拜我們的禱告\n" + "讓復興從我們開始將主愛帶到人群中\n" + "\n" + "縱然有許多的問題 我也不放棄\n" + "祢大能賜給我勇氣 我會 勇敢走出去\n");
        }
        else if(number==26){
            textPoem.setText("我的盼望　就在天父懷抱裡　\n" + "在祢裡面　滿有平安 \n" + "生命泉源　就在天父懷抱裡　\n" + "有主在我裡面活著 \n" + "\n" + "我宣告在我裡面的　比世上一切更有能力 \n" + "我不屬這世界　我高舉天父的名 \n" + "我宣告在我裡面有　活水湧流滿有能力 \n" + "有天父在我裡面活著　我勇敢站立 \n" + "\n" + "有主在我裡面　沒有懼怕　能戰勝仇敵 \n" + "有主在我裡面　沒有懼怕　還得勝有餘\n");
        }
        else if(number==27){
            textPoem.setText("當你孤單的時候　不要氣餒 \n" + "當你在十字路口　不要徘徊 \n" + "當你難過的時候　擦乾淚水 \n" + "當失望的時候　不要放棄　不要放棄 \n" + "\n" + "大聲唱　哈利路亞　歡喜快樂吧　勇敢往前踏 \n" + "大聲唱　哈利路亞　活出神放在　心中的藍圖和盼望 \n" + "\n" + "張大眼睛看 神要開路啦 \n" + "打開心胸吧 神要擴張啦 \n" + "張大眼睛看 神要開路啦 \n" + "大聲宣告吧 神要擴張啦 \n" + "\n" + "緊緊抓住祂 就會有希望 \n" + "所以不要放棄 不要放棄 不要放棄啊！\n");
        }
        else if(number==28){
            textPoem.setText("我們在天上的父  願人都尊祢的名為聖\n" + "願祢的國度降臨\n" + "願祢的旨意行在地上 同行在天上\n" + "\n" + "我們日用的飲  今日賜給我們\n" + "免我們所欠的債\n" + "如同我們免了人的債(哈利路亞)\n" + "\n" + "不叫我們遇見試探\n" + "救我們脫離兇惡\n" + "因為國度、權柄和榮耀\n" + "全是祢的 直到永遠\n" + "\n" + "我要一生一世尋求 在主殿中瞻仰榮美\n" + "因為國度、權柄和榮耀\n" + "全是祢的 直到永遠\n");
        }
        else if(number==29){
            textPoem.setText("再一次　點燃我的心　不讓冷漠來佔據\n" + "我的愛不再漠不關心　我的敬拜充滿熱情\n" + "再一次　賜給我信心　我要看見祢神蹟\n" + "病得醫治　瞎眼得看見　我渴慕更多見到祢\n" + "\n" + "我們要　我們要　我們要主祢的恩膏\n" + "看神蹟　看奇妙作為　我們要見祢的榮耀\n" + "我們要　我們要　我們要主祢的恩膏\n" + "用信心　看神蹟奇事　全地要見祢的榮耀\n" + "\n" + "再一次　再一次　再一次觸摸我的靈\n" + "讓敬拜　衝破雲霄　如祢信實上達穹蒼\n" + "再一次　再一次　再一次獻上我生命\n" + "我的心　不停為祢燃燒　我一生單為祢而活\n");
        }
        else if(number==30){
            textPoem.setText("主　給我一個夢　\n" + "敬拜的聲音如大水澎湃　高舉的雙手充滿在這地\n" + "主　給我一個夢\n" + "年輕的靈魂活著只為你　每個夢想只是為祢\n" + "\n" + "主　給我一個夢\n" + "禱告的聲音如馨香之祭　呼求耶和華的晝夜不停息\n" + "主　給我一個夢\n" + "執政掌權者高舉主的名　萬膝跪拜回轉向祢\n" + "\n" + "今天我選擇跟隨祢　潔淨我做聖潔的器皿\n" + "面對困難　也不氣餒　因賞賜是祢　收取也是祢\n" + "今天我選擇跟隨祢　只願祢榮耀充滿這地\n" + "祢行大事　不可測度　每個夢想單單只為祢\n");
        }
        else if(number==31){
            textPoem.setText("如同朝露中的小草　藍天中的小鳥\n" + "整顆心被幸福圍繞\n" + "哦我慈愛的天父　認識祢真好\n" + "祢賜的福份別處找不著\n" + "\n" + "祢使我拋開一切煩惱\n" + "喜樂充滿在心頭燃燒\n" + "認識祢真好　認識祢真好\n" + "今生今世我不再尋找\n" + "\n" + "哦主啊　認識祢真好　認識祢真好\n" + "只願分分秒秒　在祢慈愛的懷抱\n");
        }
        else if(number==32){
            textPoem.setText("天父祢滿有憐憫　滿有慈愛饒恕得恩典\n" + "醫治釋放我的心　慈愛雙手緊緊擁抱我\n" + "天父祢滿有慈愛　靠近一切尋求祢的兒女\n" + "我的心何等渴慕祢　回轉像小孩子親近祢\n" + "阿爸天父　阿爸天父\n" + "從我心深處呼求祢名字\n" + "打開心門　領受祢大愛　祢是最愛我的阿爸父\n" + "\t\n" + "阿爸天父　阿爸天父\n" + "從我心深處呼叫祢阿爸\n" + "高舉雙手　領受祢應許　阿爸天父我真愛祢\n" + "阿爸天父　阿爸天父\n");
        }
        else if(number==33){
            textPoem.setText("在這黑暗的時代　我活在其中\n" + "在繁忙的生活　我迷失了方向\n" + "多麼迷漫的生命　我不願走下去\n" + "懇求憐憫的天父　引領我歸向祢\n" + "\n" + "我邁向新的生命　以往將成為過去\n" + "祢要親自與我同在　成為我生命的主宰\n" + "我邁入新的生命　以往已成為過去\n" + "祢已親自與我同在　賜平安喜樂　跟隨我\n");
        }
        else if(number==34){
            textPoem.setText("祢是我的主　引我走正義路\n" + "高山或低谷　都是祢在保護\n" + "萬人中唯獨　祢愛我認識我\n" + "永遠不變的應許\n" + "這一生　都是祝福\n" + "\n" + "一步又一步　這是恩典之路\n" + "祢愛　祢手　將我緊緊抓住\n" + "一步又一步　這是盼望之路\n" + "祢愛　祢手　牽引我走這人生路\n");
        }
        else if(number==35){
            textPoem.setText("主耶和華  祢已經鑒察了我\n" + "我坐下  我起來  祢都已曉得\n" + "我行路  我躺臥  祢都細察\n" + "祢也深知我一切所行\n" + "\n" + "我舌頭上的話  祢沒有一句不知道\n" + "祢在我前後環繞著我　按手在我身上\n" + "這樣的奇妙  是我不能測透\n" + "祢的至高祢的尊貴  是我永遠不能所及\n" + "\n" + "我可以往哪裡去躲避祢的靈\n" + "我可以往哪裡去逃  可躲避祢的面\n" + "我若展開清晨的翅膀飛到地極  就在那裡\n" + "祢的雙手也必引導我\n");
        }
        else if(number==36){
            textPoem.setText("謝謝你燦爛笑容  照亮我的天空\n" + "謝謝你分享心情  把我放在你心中\n" + "夜裡有時會寒冷  你我生根同暖土\n" + "友情是最亮的星  我的生命從此美麗\n" + "\n" + "當你被花朵包圍盡情歡欣\n" + "我帶春風使你舞其中\n" + "當你正走在坎坷路\n" + "我會伴你在左右\n" + "一起向藍天歡呼  像白雲招手\n" + "我們要一起笑一起哭\n" + "千萬人中有個人懂我\n" + "你有最珍貴的角落\n");
        }
        else if(number==37){
            textPoem.setText("真父母　我感謝祢  祢的身體　為我而捨\n" + "帶我出黑暗　進入光明國度\n" + "使我再次能看見\n" + "\n" + "真父母我感謝祢  祢的寶血　為我而流\n" + "寶貴十架上　醫治恩典湧流\n" + "使我完全得自由\n" + "\n" + "寶貴十架的大能賜我生命\n" + "真父母我俯伏敬拜祢\n" + "寶貴十架的救恩  是祢所立的約\n" + "祢的愛永遠不會改變\n");
        }
        else if(number==38){
            textPoem.setText("主　祢已釋放我  我的喜樂無法隱藏\n" + "為我帶上冠冕穿上彩色衣裳  我已經不一樣\n" + "\n" + "主　祢已釋放我  我的喜樂無法隱藏\n" + "為我帶上冠冕穿上彩色衣裳  我已經不一樣\n" + "我已得潔淨  得醫治  我已得釋放\n" + "\n" + "東離西有多麼的遠  祢使我過犯離我多遠\n" + "祢已饒恕我  我也饒恕自己\n" + "進入祢豐盛的恩典\n" + "祢已為我披上讚美衣  祢喜樂就在我的心理\n" + "我已得赦免  可以歡歡喜喜\n" + "到祢的面前  讚美\n");
        }
        else if(number==39){
            textPoem.setText("全心感謝　全心讚美　進入你的院 \n" + "全心頌讚　獻上為祭　是嘴唇的果子\n" + "在祢裡面　一無掛慮　喜樂滿溢 \n" + "常常感謝　不住禱告　盼望在於祢\n" + "\n" + "我要全心讚美　跳舞頌揚祢名　\n" + "在祢殿中一日勝過在世上千日\n" + "我要全心讚美　讚美還要讚美不停　\n" + "義人棚裡歡呼聲永不息\n");
        }
        else if(number==40){
            textPoem.setText("你和我是天父愛的創造 \n" + "每個人有最美的夢想\n" + "一路上彼此照亮  扶持擁抱 \n" + "我們的愛讓世界不一樣\n" + "\n" + "我們愛  因神先愛我們\n" + "雖你我不一樣 \n" + "我們一路唱  走往祝福的方向\n" + "\n" + "我們愛  因神先愛我們\n" + "心再堅強也不要獨自飛翔 \n" + "只要微笑  只要原諒\n" + "有你愛的地方就是天堂\n");
        }
        else if(number==41){
            textPoem.setText("祢流出寶血 洗淨我污穢\n" + "將我的生命贖回\n" + "祢為了我的罪 犧牲永不悔\n" + "顯明你極大恩惠\n" + "\n" + "我深深體會 你愛的寶貴\n" + "獻上自己永追隨\n" + "或傷心或氣餒 或生離或死別\n" + "願剛強壯膽永遠不後退\n" + "\n" + "哦 祢愛永不變 從今直到永遠\n" + "深深澆灌我心田\n" + "或天旋或地轉 經滄海歷桑田\n" + "都不能叫我與祢愛隔絕\n");
        }
        else if(number==42){
            textPoem.setText("在乾旱無水之地我渴慕你\n" + "在曠野無人之處我尋求你\n" + "得救在乎歸回安息\n" + "得力在乎平靜安穩\n" + "我等候你  如鷹展翅上騰(x2)\n" + "\n" + "住在你裡面  住在你裡面\n" + "如同枝子與葡萄樹緊緊相連\n" + "住在你裡面  住在你裡面\n" + "領受生命活水泉源永不枯竭\n");
        }
        else if(number==43){
            textPoem.setText("看哪猶大獅子已得勝 眾聖徒預備朝見祂\n" + "少年人看異象 老年人要做異夢 \n" + "因為神的復興將來到\n" + "\n" + "聽到錫安的號角響起 萬國萬民都要顫抖\n" + "耶和華日子將到 光明將除去黑暗\n" + "因為神的復興將來到 \n" + "我們要看到神的榮耀\n" + "\n" + "這世代 我們用敬拜爭戰\n" + "我們用禱告改變世界\n" + "這世代 \n" + "聖靈要更新澆灌我們\n" + "這世代\n" + "是天父世代\n");
        }
        else if(number==44){
            textPoem.setText("神已揀選我們  神已預備我們\n" + "帶著神的愛  宣告盼望在這世代\n" + "領受這大使命  側耳謙卑聆聽\n" + "跟隨祂腳步  將福音傳到世界地極\n" + "\n" + "就是這個時刻  帶著主愛走遍世界各地\n" + "我們所踏之地  萬民都要歸向祢\n" + "就是這個時刻  帶著主光照亮黑暗之地\n" + "大聲宣告天父是主  萬國都敬拜祢\n" + "\n" + "就是這個時刻   不再遲疑\n" + "就是這個時刻   勇敢前去\n" + "就是這個時刻   不再遲疑\n" + "就是這個時刻   勇敢前去\n" + "以生命見證   天父祂活著\n");
        }
        else if(number==45){
            textPoem.setText("主我到你面前  因你豐盛恩典\n" + "我一切所有都出于你\n" + "每當我跌入痛苦深淵\n" + "你的信實是我唯一冠冕\n" + "\n" + "主我到你面前  因你慈容笑臉\n" + "在你光中我得着安慰\n" + "挫折中學習謙卑  破碎中得以完全\n" + "是你的愛將我贖回\n" + "\n" + "是你的愛叫我不再埋怨\n" + "相信一切你都為我預備\n" + "你的信實叫我不再懼怕黑夜\n" + "你的慈愛照耀每個明天\n");
        }
        else if(number==46){
            textPoem.setText("以真誠的心 降服在你面前\n" + "開我心眼使我看見\n" + "以感恩的心 領受生命活水\n" + "從你而來的溫柔謙卑\n" + "\n" + "何等恩典 你竟然在乎我\n" + "何等恩典 你寶血為我流\n" + "何等恩典 你以尊貴榮耀為我冠冕\n" + "我的嘴必充滿讚美\n" + "\n" + "你已挪去 我所有枷鎖\n" + "你已挪去 我所有重擔\n" + "你已挪去 我所有傷悲\n" + "你的名配 得所有頌讚\n");
        }
        else if(number==47){
            textPoem.setText("祢將永遠放在我裡面\n" + "祢創造我  為了永遠\n" + "當我迷途祢來尋找我\n" + "祢救贖我  為了永遠\n" + "\n" + "永遠祢是愛  無限的愛\n" + "永遠我要住在祢裡面\n" + "永遠祢是愛  不變的愛\n" + "永遠祢也住在我裡面\n" + "\n" + "祢將祢的聖靈賜給我\n" + "祢妝扮我  為了永遠\n" + "當我把我的手交給祢\n" + "祢塑造我  為了永遠\n");
        }
        else if(number==48){
            textPoem.setText("願主的恩惠慈愛與你同在 \n" + "願主的靈時時圍繞\n" + "\n" + "恩典降下 賜福與你 \n" + "平安喜樂天天充滿你x2\n" + "\n" + "賜福與你 賜福與你 \n" + "平安喜樂天天充滿你\n" + "賜福與你 賜福與你 \n" + "平安喜樂天天充滿你\n");
        }
        else if(number==49){
            textPoem.setText("真父母請改變我 使我生命由軟弱變剛強\n" + "真父母請改變我 使我生命由悲情轉為喜樂\n" + "改變我眼睛所見 從世界轉回你身上\n" + "不看一切只定睛於你\n" + "\n" + "真父母我感謝你  在我身上所動之工\n" + "使我全人都屬於你  活著不再是自己\n" + "真父母請改變我  使我願讓你將我全剝奪\n" + "真父母請改變我  使我認識你寶貴不再錯過\n");
        }
        else if(number==50){
            textPoem.setText("山不能 海不能 \n" + "不能隔絕神的愛\n" + "風不能 雨不能 \n" + "不能隔絕神的愛 都不能\n" + "\n" + "危險不能 疾病不能 \n" + "不能隔絕神的愛\n" + "危險不能 逼迫不能 \n" + "不能隔絕神的愛 都不能\n" + "\n" + "都不能隔絕 都不能隔絕 都不能隔絕神的愛\n" + "都不能隔絕 都不能隔絕 都不能隔絕神的愛\n");
        }
        else if(number==51){
            textPoem.setText("祢的腳步帶著我的腳步\n" + "一步一步都有祝福\n" + "每個腳步我要緊緊跟隨\n" + "走在蒙福的道路\n" + "\n" + "求給我更多的勇氣，給我更多的信心\n" + "讓我勇敢踏出跟隨祢的腳步\n" + "跟祢行在水面上，跟祢走在曠野地\n" + "曲曲折折我也不在乎\n" + "\n" + "我只要更多信靠祢，只要更多順服祢\n" + "凡是出於祢的我就默然不語\n" + "就算經過黑暗谷，就算遇到暴風雨\n" + "在祢手中都將變成祝福\n");
        }
        else if(number==52){
            textPoem.setText("眼光放得更遠 走向神給的路線\n" + "遵行祂的教導 一天比一天更好\n" + "回應神的呼召 看見世界的需要\n" + "感受天父的愛 我勇敢跳起來\n" + "\n" + "我要靠著聖靈翻轉地球 Wo Oh!\n" + "背起十架走入人群中 向黑暗權勢宣告\n" + "I’m not afraid!  因為天父祂已經得勝\n" + "\n" + "同心合一禱告 聖靈的火來焚燒\n" + "渴望復興來到 要見證神的榮耀 (x2)\n" + "天父的恩典是夠我用 (x4)\n");
        }
        else if(number==53){
            textPoem.setText("耶和華是我的主  必不致動搖\n" + "有耶和華的幫助\n" + "還要懼誰呢\n" + "\n" + "耶和華是我牧者  必不致缺乏\n" + "有耶和華做我旌旗\n" + "必全然得勝\n" + "\n" + "耶和華是我四圍的盾牌  是我的榮耀\n" + "又是叫我抬起頭的神\n" + "一宿雖然有哭泣\n" + "早晨我們必歡呼\n" + "你是我的磐石我的幫助\n");
        }
        else if(number==54){
            textPoem.setText("如果我的存在只像劃過夜空的流星\n" + "為什麼我總夢想永恆\n" + "如果我的出現只是一個意外的巧合\n" + "為什麼我渴望被愛\n" + "誰能聽見我，聽見我，我內心深處的吶喊\n" + "誰能告訴我，告訴我，到哪裡去尋找真愛(2X)\n" + "請告訴我\n" + "\n" + "如果你的存在只像劃過夜空的流星\n" + "我不會為你苦苦等待\n" + "如果你的出現只是一個意外的巧合\n" + "我不會用性命來換\n" + "你可了解我，了解我，我因思念你心破碎\n" + "你可知道我，知道我，我對你的愛永不變 \n" + "\n" + "誰能聽見我 (可了解我) 聽見我 (了解我)\n" + "我內心深處的吶喊 (為你心破碎)\n" + "誰能告訴我 (可知道我) 告訴我 (知道我)\n" + "到哪裡去尋找真愛 (對你愛不變) \n" + "\n" + "如果我的生命不是一顆短暫的流星\n");
        }
        else if(number==55){
            textPoem.setText("真父母　祢召我出黑暗\n" + "入奇妙光明　賞賜獨特的位份\n" + "在基督裡　我是新造的人\n" + "祢看為寶貴　獻上帝祢所用\n" + "\n" + "讓我成為　祢神蹟的器皿\n" + "被揀選族類　君尊的祭司\n" + "聖潔的國度　屬神的子民\n" + "來宣揚真父母　彰顯神的榮耀\n" + "\n" + "讓我成為　祢神蹟的器皿\n" + "以信心的眼睛　看見新的盼望\n" + "用祢的大能　和愛來充滿我\n" + "我要傳揚主的愛　讓世界更美好\n");
        }
        else if(number==56){
            textPoem.setText("你仰臉保守你所愛的  你護庇永遠不離不棄\n" + "你將我從淤泥裡捧起  放我在你的手心\n" + "\n" + "我憑著信心領取  你豐盛的應許\n" + "世界也不能奪去  神美好的旨意\n" + "\n" + "我憑著信心領取  你恩典永不止息\n" + "看見美好應許成就  榮耀全都歸於你\n" + "\n" + "我等候主我相信  你愛我永不放棄\n" + "世界也不能奪去  神美好的旨意\n" + "我等候主我相信  你旨意高過我的\n" + "看見美好應許成就  我全心全意敬拜你\n");
        }
        else if(number==57){
            textPoem.setText("我要一心稱謝你\n" + "在諸神面前稱頌你\n" + "我要向你的聖殿下拜\n" + "為你慈愛和誠實稱讚你名(x2)\n" + "\n" + "我要歌頌耶和華作為 \n" + "你慈愛永遠長存\n" + "我雖行在困苦患難中\n" + "你應許必將我救活\n" + "\n" + "我要歌頌耶和華作為\n" + "因你名大有榮耀\n" + "我呼求時你必應允我\n" + "鼓勵我使我心裡有能力\n" + "你必成全關乎我的事\n"+"你必不離棄你手所創造的");
        }
        else if(number==58){
            textPoem.setText("主求你為我 造清潔的心\n" + "使我得見你\n" + "使我裡面重新 有正直的靈\n" + "活的更像你\n" + "你憐憫的容面 看顧我的笑臉\n" + "你有無條件的愛 你有無條件的愛\n" + "\n" + "我安靜的依偎 在你的身邊\n" + "我渴慕你的同在 等候著你喔聖靈\n" + "居住在我心\n" + "\n" + "每天的每一秒 輕閉我雙眼\n" + "很難相信你會如何帶領我\n" + "帶領我 經歷你的大愛\n");
        }
        else if(number==59){
            textPoem.setText("謝謝你的愛 每個溫暖微笑\n" + "謝謝你的愛 每個緊緊擁抱\n" + "堅定的鼓勵 賜我向前的勇氣\n"+"一起追逐夢想不放棄\n" + "謝謝你的愛 每個溫暖微笑\n" + "謝謝你的愛 每個緊緊擁抱，\n" + "堅定的鼓勵 賜我向前的勇氣\n"+"我相信生命充滿奇蹟\n" + "\n" + "讓愛飛翔 這裡就有希望\n" + "讓愛飛翔 這裡就有力量\n" + "讓愛飛翔 乘著夢想一起去翱翔\n" + "溫暖每顆心 將這世界照亮\n" + "\n" + "用這份愛去關懷 去看和去明白\n" + "用這份愛去分享 讓世界不一樣\n" + "讓這份深深感動 停留我們心中\n" + "因為愛使生命再次燦爛\n");
        }
        else if(number==60){
            textPoem.setText("聖哉聖哉全地唱 昔在今在以後永在\n" + "聖哉聖哉全能神 永遠在寶座上\n" + "\n" + "你是配得 配得 配得尊崇和讚美\n" + "你是配得 配得 萬物敬拜你\n" + "你是聖潔 聖潔 聖潔榮光在全地\n" + "你是聖潔 聖潔 以聖潔妝飾敬拜你\n" + "\n" + "願尊貴 榮耀 權柄和能力\n" + "都歸全能神\n" + "願各族 各方 萬國和萬邦\n" + "敬拜神羔羊\n");
        }
        else if(number==61){
            textPoem.setText("全能真神你掌權 你的慈愛永遠長存\n" + "萬民都來尊崇你聖名 世上萬有屬於你\n" + "你的慈愛永遠長存 榮耀的名直存到永遠\n" + "\n" + "哈利路亞 尊貴全能神 天地萬有都會滅沒\n" + "唯有你永遠不改變 哈利路亞 聖潔全能神\n" + "無一人能與你相比 所有榮耀都歸於你\n" + "\n" + "宣告你國度降臨 你旨意成全這地\n" + "興起你所選子民 高舉你榮耀的名\n");
        }
        else if(number==62){
            textPoem.setText("求賜給我清潔的心 緊緊跟隨你\n" + "我渴慕更深愛你 因你已先愛我\n" + "\n" + "跟隨你的腳步 活出你對我呼召\n" + "每一天帶領我 更多親近你\n" + "\n" + "我願這一生更像你 求與我同行\n" + "喔主！引導我生命 賜給我甜美的靈\n" + "能合乎你心意 一生跟隨你\n" + "\n" + "我唯一渴慕 依偎你同在\n");
        }
        else if(number==63){
            textPoem.setText("每當我 拿起這餅 我記念祢 親愛耶穌\n" + "十架上 祢換回我生命 使我回到 天父面前\n" + "\n" + "每當我 拿起這杯 我感謝祢 我的耶穌\n" + "祢寶血 洗淨我的罪 使我永遠 與罪隔離\n" + "\n" + "謝謝祢為我死在十架上\n" + "破碎的生命得以完全\n" + "我感恩 我敬拜 得醫治 得自由\n" + "都因祢那救贖的恩典\n" + "\n" + "永遠與罪隔離\n" + "永遠與罪隔離\n" + "被贖教會 洗得清潔\n" + "永遠與罪隔離\n");
        }
        else if(number==64){
            textPoem.setText("願讚美充滿每個家 願喜樂充滿我心\n" + "願萬物都尊崇耶穌 讓我們獻上祈求\n" + "\n" + "從高山上 直到山谷\n" + "頌揚讚美 獻給你\n" + "從天降下 直到萬民\n" + "讓這歌聲 傳千里\n" + "\n" + "願主真光照亮黑暗 讓我們屈膝敬拜\n" + "願主榮耀充滿全地 讓我們同聲宣揚\n" + "哈利路亞 哈利路亞\n" + "哈利路亞 哈利路亞\n");
        }
        else if(number==65){
            textPoem.setText("求主賜下復興之火\n" + "求主賜下聖靈火焰\n" + "燃燒教會能得無窮力量\n" + "在這黑暗時代能作祢光輝\n" + "化解冷漠 重燃愛祢的心\n" + "盼主賜下復興之火\n");
        }
        else if(number==66){
            textPoem.setText("我渴望更多得著祢　乾渴的心再次滿溢\n" + "我渴望更多經歷祢　除去軟弱　重新站立\n" + "今天我要遇見祢　我的生命不再停留\n" + "誠實面對自己　接受釋放與更新\n" + "\n" + "從破碎到自由　經歷醫治和真平安\n" + "寶血所立的約　承擔羞辱換來喜樂\n" + "從破碎到自由　重新連結在主愛裡\n" + "極至的愛和恩典　領取祝福再前行");
        }
        else if(number==67){
            textPoem.setText("我獻上感謝 因祢的恩典滿溢\n" + "謙卑祢面前 萬世皆屬於祢\n" + "\n" + "我獻上感謝 因爭戰在於祢\n" + "只願不斷感謝 定睛仰望祢\n" + "\n" + "我感謝祢 耶穌 稱頌祢聖名\n" + "祢的慈愛存到永遠\n" + "\n" + "我感謝祢 耶穌 因祢本為神\n" + "祢的信實直到萬代\n" + "\n" + "要以感謝進入祢的門\n" + "要以讚美進入祢的院\n" + "要以感謝進入祢的門\n" + "要以讚美進入祢的院\n");
        }
        else if(number==68){
            textPoem.setText("蔵我在翅膀蔭下\n" + "遮蓋我在你大能手中\n" + "\n" + "當大海翻騰 暴風上空\n" + "父你仍作王 在洪水中\n" + "我要安靜 知你是神\n" + "\n" + "我靈安息 在基督裏\n" + "你大能 使我安然信靠\n" + "\n" + "當大海翻騰 波濤洶湧\n" + "我與你展翅 暴風上空\n" + "父尔仍作王 在共水中\n" + "我要安靜 知你是神");
        }
        else if(number==69){
            textPoem.setText("主　我心愛祢　我渴望活在祢的懷裡\n" + "每天與祢同在　享受祢的大愛\n" + "\n" + "醫治我受傷的心靈　改變我原有的生命\n" + "引導我當走的路　今天的服事求祢托住\n" + "\n" + "哦～主啊　求祢改變我　心思意念願祢來雕琢\n" + "使我能更加像祢　帶著耶穌的香氣\n" + "\n" + "哦～主啊　求祢吸引我　帶我進入祢聖潔居所\n" + "讓我今天為祢活　完全獻上為活祭　奉獻一生跟隨祢");
        }
        else if(number==70){
            textPoem.setText("神已聽見我的呼求　祂也明白我的渴望\n" + "放下重擔脫去一切纏累\n" + "恢復神造我的榮美形象\n" + "\n" + "永在的神　創造萬物的主\n" + "祂的智慧無法測度\n" + "疲乏的祂賜能力　軟弱的祂加力量\n" + "等候耶和華必從新得力\n" + "\n" + "如鷹展翅上騰　翱翔在神的國度裡\n" + "飛越所有艱難和風暴\n" + "單單注視　祢榮耀寶座\n" + "\n" + "如鷹展翅上騰　翱翔在神的國度裡\n" + "領受聖靈恩膏和大能\n" + "活出美好　自由的風采");
        }
        else if(number==71){
            textPoem.setText("我活著不是憑眼見\n" + "我活著不是憑感覺\n" + "我深知主祢與我同在\n" + "在祢絕對沒有難成事\n" + "\n" + "有祢我能成就一切\n" + "能成就一切\n" + "因祢賜我力量\n" + "凡事都有可能\n" + "有祢瞎眼能看見\n" + "生命能改變\n" + "我憑信心而活\n" + "凡事都有可能\n" + "\n" + "我相信 我相信\n" + "我相信 我相信 天父");
        }
        else if(number==72){
            textPoem.setText("超過我所面對的高山\n勝過死亡陰間的挑戰\n跨過所有變動和艱難\n 你愛不變 存到永遠\n" + "\n" + "你愛不失敗 永不放棄\n永遠不會離開\n" + "\n" + "你的愛一直都在追趕著我\n" + "滲透我靈魂超過所想所求\n" + "我永遠不再害怕孤單承受\n" + "你愛不變 存到永遠\n" + "\n" + "或生或死\n" + "我深知我都隱藏在你愛的大能中 \n" + "我得赦免\n" + "再沒有任何事能讓我與你愛隔絕");
        }
        else if(number==73){
            textPoem.setText("我要回到一開始 當你找到我\n" + "我要回到你的心 我降服於你\n" + "讓我 獻上一切所有\n" + "\n" + "我要回到一開始 你釋放我自由\n" + "我要感受你心 讓心跳合一\n" + "讓我 獻上一切所有\n" + "\n" + "你永不停止愛我 不管離你有多遠\n" + "你永不會放棄我 整個天國宣告\n" + "未來從此開始\n" + "\n" + "I feel alive\n" + "I come alive\n" + "I am alive\n" + "On God's great dance floor");
        }
        else if(number==74){
            textPoem.setText("無論或死或生或天使\n" + "執政掌權現在或將來\n" + "或高處低處任何受造物\n" + "都不能將我與 你 愛隔絕\n" + "\n" + "Oh oh oh...Oh oh oh...\n" + "\n" + "主你的愛情 刻在我心版上\n" + "眾水不能熄滅 海不能淹沒\n" + "主你的愛情 堅強勝過死亡\n" + "都不能將我與 你 愛隔絕\n" + "\n" + "我知道故事結局\n" + "我終將從曠野出來\n" + "是靠著我心所愛\n" + "\n" + "你愛最高 你愛最寬廣\n" + "你愛最深 你愛無止盡\n" + "\n" + "It is Your strong love\n" + "Your strong love");
        }
        else if(number==75){
            textPoem.setText("危難臨到我信靠你\n" + "深知你必領我度過\n" + "你信實為我堅持到最後\n" + "\n" + "當暴風雨向我靠近\n" + "有你同在我不至畏懼\n" + "你是我的牧者我所倚靠\n" + "\n" + "每個夜 每一天\n" + "我知你永遠在身邊\n" + "\n" + "主你永遠與我同在\n" + "在你裡面沒有改變\n" + "你的堅定從昨日到今日\n" + "一直到永遠\n" + "\n" + "靠你豐盛應許站立\n" + "我的未來在你手中\n" + "堅固磐石 全能真神\n" + "我敬拜你");
        }
        else if(number==76){
            textPoem.setText("黎明之際 盼望興起\n" + "我仰望你 宣告你名\n" + "讓我與你 心跳合一\n" + "就在這裡 與你同行\n" + "\n" + "在我眼中有火 被你點燃\n" + "不羈的愛 燃燒起來\n" + "永恆的光 街頭綻放\n" + "你突破黑夜衝出來\n" + "\n" + "你的愛一直都在\n" + "永遠不會離開\n" + "為了我 而存在\n" + "要點燃這個世代\n" + "\n" + "你讓我甦醒 讓我甦醒\n" + "你的愛充滿我心\n" + "你的愛 你的愛 你的愛\n" + "到永遠 (我知道)");
        }
        else if(number==77){
            textPoem.setText("主告訴我如何獻上我的生命\n 帶希望入人群中\n" + "主告訴我如何付上我的關懷\n 將溫暖帶入世界\n" + "我看到靈魂中的憂傷\n 孤獨中人的心在角落顫抖\n" + "差遣我 差遣我\n我願付出我所有\n" + "差遣我到需要你的人群中\n" + "充滿我 充滿我\n用你愛來充滿我\n" + "再一次緊握他們的手");
        }
        else if(number==78){
            textPoem.setText("當我悲傷難挨\n訴不盡最深的悲哀\n親愛主 哦  我的主\n懇求祢傾聽我的心\n當我希望滿懷\n道不出最美的期待\n親愛主 哦  我的主\n求祢傾聽我的心\n\n求祢聆聽我每一個心跳\n那是我最真誠最渴慕的祈禱\n求祢聆聽我每一個心跳\n告訴我  祢什麼都明瞭");
        }
        else if(number==79){
            textPoem.setText("如果你想知道 愛在哪裡\n愛就在你我的周圍\n" + "如果你想知道愛在哪裡\n愛就在每個笑面上\n" + "\n" + "如果你想知道 愛在哪裡\n愛就在成長生命中\n" + "如果你想知道愛在哪裡\n愛就在父母的心裡\n" + "\n" + "愛在哪裡 愛在哪裡 愛就在神的愛子裡\n" + "愛從何來 愛從何來 愛它是從神而來");
        }
        else if(number==80){
            textPoem.setText("在這美麗的時刻 我們相聚在一起\n" + "神的愛擁抱我們 神的靈充滿這地\n" + "當稱謝進入他的門 當讚美進入他的院\n" + "擊鼓跳舞揚聲歡呼 凡有氣息都要讚美他\n\n" + "讓讚美從四處響起 讓音符在空中飛舞\n" + "讓我們的心靈向神敞開\n" + "讓讚美從四處響起 讓音符在空中飛舞\n" + "讓我們的心向神敞開");
        }
        else if(number==81){
            textPoem.setText("飛越時空的領域 聆聽靈魂的吶喊 \n" + "穿過天之涯 越過地之極\n" + "卸下飄泊的心情 奔向永恆的生命 \n" + "真理在我心 哦 真愛在我心\n" + "將展開嶄新的航行 主的權能將是我雙翼\n" + "\n" + "看哪 看哪 一切都更新\n" + "聽哪 聽哪 天使為我歡呼\n" + "真理帶我進入那自由之地\n" + "從今天起 從此刻起\n我是新造 我是新造的人");
        }
        else if(number==82){
            textPoem.setText("神的孩子不要沮喪 舉目向上望 \n" + "神在天上不分晝夜　時時看顧你 \n" + "雖遇艱難雖有愁苦　仍在祂手裡 \n" + "祂必叫萬事互相效力　使你福杯滿溢\n\n" + "不要看環璄不看自己　凡專心倚靠祂的必重新得力 \n" + "每個禱告神都垂聽　千萬別放棄 \n" + "永遠不要忘記　你要忠心走到底 \n" + "\n" + "不要看環境不看自己　凡耐心等候祂的必如鷹遨遊天際 \n" + "神的孩子在主愛中　得享祂安息 \n" + "永遠不要忘記　你是神所愛孩子");
        }
        else if(number==83){
            textPoem.setText("想像中有一個幸福天地\n" + "分分秒秒踩在雲端裡\n" + "好像幸福只存在 童話故事裡\n" + "自從天父進入我的生命\n" + "心中眼睛被主愛開啟\n" + "看見幸福的天地 就在我心裡\n" + "它並不是遙不可及 也不需要完美主義\n" + "它是真實而簡單地 活在主愛裡\n" + "\n幸福是珍惜現在擁有的 感謝上帝供應\n" + "幸福是分享自己領受的 叫別人得利益\n" + "幸福是相信聖經所寫的 每句都是真理\n" + "幸福是卸下重擔給上帝 因祂必看顧你");
        }
        else if(number==84){
            textPoem.setText("有一份愛 從天而來\n" + "比山高 比海深\n" + "測不透 摸不著\n" + "卻看得見\n" + "\n" + "因為有你 因為有我\n" + "甘心給 用心愛\n" + "把心中這一份愛活出來\n" + "\n" + "天父的愛激勵我\n" + "敞開我的生命\n" + "讓自己成為別人祝福\n" + "\n" + "天父的愛點燃我\n" + "心中熊熊愛火\n" + "我們一起向世界活出愛");
        }
        else if(number==85){
            textPoem.setText("你用重價救贖我 使我脫離罪惡河\n" + "叫我這不配的人憑信得救\n" + "你賜聖靈幫助我 使我勝過老舊我\n" + "祈求恩主領我邁向屬靈高峰\n" + "\n讓我讚美非僅美詞 讓我敬拜非僅方式\n" + "讓我服事非靠雙手 而禱告非僅用口\n" + "讓我愛人不要虛假 讓我待人由心而發\n" + "讓我學習順服 以聖潔為裝飾");
        }
        else if(number==86){
            textPoem.setText("生命總有傷痛的記憶\n" + "有些事情總不想再被提起\n" + "但神輕聲說 放下過去 讓心重新飛翔\n" + "你是否願意\n\n" + "人生總有煎熬的苦境\n" + "人總有不想被看見的自己\n" + "就算最黑的夜 他也依然 陪在你的身旁\n" + "永不改變\n\n" + "讓上帝給你一雙翅膀 帶著你的夢飛翔\n" + "就放開過去的自己 做全新的你\n" + "神必定要在你身上 成就更好的事情\n" + "讓神在生命中掌權\n\n" + "讓上帝給你一個臂膀 讓你安心依靠\n" + "他是最最瞭解你 連頭髮也數算清楚\n" + "一宿雖或會有哭泣 早晨必轉為歡呼\n" + "因為神愛你 因為神愛你\n他愛看你變的更美好");
        }
        else if(number==87){
            textPoem.setText("我需要謙卑 需要謙卑\n求使我謙卑 才能到主面前 \n" + "主使我謙卑 求主使我謙卑\n我需要謙卑 才能到祢面前\n\n喔主 求祢來破碎我的驕傲\n讓我重新想起祢的憐憫\n" + "求除去我心中自大的痕跡\n使我清醒謙卑跟隨祢 \n" + "\n" + "謙卑我心 進入我生命\n拿去我面具 真實與祢相遇 \n" + "求煉淨我心 使我更像祢\n求悅納我心 我謙卑呼求祢 \n" + "我需要謙卑 需要謙卑\n求使我謙卑 才能到主面前 \n" + "主使我謙卑 求主使我謙卑\n我需要謙卑 我謙卑呼求祢");
        }
        else if(number==88){
            textPoem.setText("我知道主你在這裡 我渴望親眼看見你\n" + "因你以讚美為寶座 故我來讚美你\n" + "\n" + "讚美中渴望遇見你 渴望摸著你心意\n" + "讚美中世界都褪色 榮耀單單歸你");
        }
        else if(number==89){
            textPoem.setText("每當我面對風浪 祢總在我身旁\n" + "生命福份與我分享 更深地渴望\n" + "每當有困境阻擋 祢旨意不搖晃\n" + "使我心中滿有平安 充滿無限希望\n" + "\n" + "祢是我永遠的依靠 堅守信心來宣告\n" + "我真實經歷祢全能的力量\n" + "唯有祢是我永遠的依靠\n" + "堅守信心來宣告 當我來全心敬拜\n" + "神蹟就在不遠前方");
        }
        else if(number==90){
            textPoem.setText("When I am down and, oh my soul, so weary\n當我靈魂疲倦沮喪的時候\nWhen troubles come and my heart burdened be\n當我內心背負困難重擔\nThen, I am still and wait here in the silence\n而我會在平靜安穩中等候\nUntil you come and sit awhile with me\n直待你來，輕坐身旁陪伴\nYou raise me up, so I can stand on mountains\n你鼓舞了我，能站於群巒山崗\nYou raise me up, to walk on stormy seas\n你鼓舞了我，能經狂風巨浪\nI am strong, when I am on your shoulders\n站你肩頭，使我能壯膽剛強\nYou raise me up… To more than I can be\n你鼓舞了我，能超越我自己\n\nYou raise me up, so I can stand on mountains\n你鼓舞了我，能站於群巒山崗\nYou raise me up, to walk on stormy seas\n你鼓舞了我，能經狂風巨浪\nI am strong, when I am on your shoulders\n站你肩頭，使我能壯膽剛強\nYou raise me up… To more than I can be\n你鼓舞了我，能超越我自己\n");
        }
    }

    private Button.OnClickListener btnListener=new Button.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btnPoemtryView:
                    Uri uri= Uri.parse(strUrl[number-1]);
                    Intent i=new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(i);
                    break;
                case R.id.btnPoemtryPrevious:
                    finish();
                    break;
                case R.id.btnPoemtryFamily:
                    Intent family=new Intent();
                    family.setClass(wordPoemtry.this, FamilyArticle.class);
                    startActivity(family);
                    break;
                case R.id.btnPoemtryHome:
                    finish();
                    menuPoemtry.instance.finish();
                    break;
            }
        }
    };

}
