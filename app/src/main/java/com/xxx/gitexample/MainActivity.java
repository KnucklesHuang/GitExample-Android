package com.xxx.gitexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String test = "測試";
    int xxx = 1234;

    void testMaster() {
        Log.d("test","測試 master 功能");
    }

    void testBranch() {
        Log.d("test","測試分支功能");
    }

    void testPush() {
        Log.d("test","測試用push上傳程式");
    }

    void testNewUserPush() {
        Log.d("test","測試用另一個使用者上傳程式");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
