package tw.harutsuki.www.anime;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {

    // Splash 畫面顯示時間
    private static int SPLASH_TIME_OUT = 3000; // 3000 毫秒


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            /*
             * 在特定時間內顯示 初始啟動畫面
             * 此處如果對於要顯示 LOGO 有特別用途
             */

            @Override
            public void run() {
                // 此處會在等待時間結束之後被執行一次
                // 啟動 APP 主要 Activity
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);

                // 關閉 SplashScreen Activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }


}