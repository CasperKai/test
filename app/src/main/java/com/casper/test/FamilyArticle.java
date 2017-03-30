package com.casper.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class FamilyArticle extends AppCompatActivity {

    private int _week =1;
    private Button _btnBack,_btnPrevious,_btnNext;
    private TextView _txtFamily;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_article);

        _btnBack=(Button)findViewById(R.id.btnFamilyBack);
        _btnPrevious=(Button)findViewById(R.id.btnFamilyPrevious);
        _btnNext=(Button)findViewById(R.id.btnFamilyNext);
        _txtFamily=(TextView)findViewById(R.id.textFamily);

        _btnBack.setOnClickListener(btnListener);
        _btnPrevious.setOnClickListener(btnListener);
        _btnNext.setOnClickListener(btnListener);
        _txtFamily.setOnTouchListener(new ZoomListenter());

        Calendar today = new GregorianCalendar();
        _week =today.get(Calendar.DAY_OF_WEEK);
        _week-=1;
        changeTxt();

    }

    private void changeTxt() {
        switch (_week){
            case 0:
                _txtFamily.setText("\n七、身為天一國的主人，我的家庭謹誓以真愛為中心，通過與本然血統連結之為別人而活的生活，建立一個心情文化世界。");
                _week=7;
                break;
            case 1:
                _txtFamily.setText("\n一、身為天一國的主人，我的家庭謹誓以真愛為中心，復歸本然的故鄉，建立本然創造理想之地上天國與天上天國。");
                break;
            case 2:
                _txtFamily.setText("\n二、身為天一國的主人，我的家庭謹誓以真愛為中心，侍奉天父母與真父母，成為天宙之代表性家庭及中心家庭，並成為家庭的孝子、國家的忠臣、世界的聖人及天宙的聖子之家庭。");
                break;
            case 3:
                _txtFamily.setText("\n三、身為天一國的主人，我的家庭謹誓以真愛為中心，完成四大心情圈、三大王權及皇族圈。");
                break;
            case 4:
                _txtFamily.setText("\n四、身為天一國的主人，我的家庭謹誓以真愛為中心，建立天父母的創造理想之天宙大家庭，成就自由、和平、統一與幸福之世界。");
                break;
            case 5:
                _txtFamily.setText("\n五、身為天一國的主人，我的家庭謹誓以真愛為中心，每日向著主體性天上世界與對象性地上世界的統一，促進前進性的發展。");
                break;
            case 6:
                _txtFamily.setText("\n六、身為天一國的主人，我的家庭謹誓以真愛為中心，成為天父母及真父母的代身家庭，推動天運，並成為能將天的祝福連結到四周的家庭。");
                break;
            case 7:
                _txtFamily.setText("\n七、身為天一國的主人，我的家庭謹誓以真愛為中心，通過與本然血統連結之為別人而活的生活，建立一個心情文化世界。");
                break;
            case 8:
                _txtFamily.setText("\n八、身為天一國的主人，我的家庭謹誓以真愛為中心，迎接天一國時代，通過絕對的信仰、絕對的愛與絕對的服從，成就神、人、愛一體的理想，並完成地上天國與天上天國的解放圈與釋放圈。");
                break;
        }
    }

    private Button.OnClickListener btnListener = new Button.OnClickListener(){
        public void  onClick(View v){
            switch (v.getId()){
                case R.id.btnFamilyBack:
                    finish();
                    break;
                case R.id.btnFamilyPrevious:
                    _week-=1;
                    if(_week==0) _week=8;
                    changeTxt();
                    break;
                case R.id.btnFamilyNext:
                    _week+=1;
                    if(_week==9) _week=1;
                    changeTxt();
                    break;
            }
        }
    };

}
