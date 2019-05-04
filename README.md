
**一、 实验内容：**


        本实验通过自定义WebView加载URL来验证隐式Intent 的使用。
        
        
        实验包含两个应用：
        
        
          第一个应用：获取URL地址并启动隐式Intent的调用。
         
         
          第二个应用：自定义WebView来加载URL


         （这个是第一个应用）
         
         
**二、主要代码：**


```
package com.example.lenovo.androidtest5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.t);
    }
    public void onClick(View view){
        Intent intent=new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("url","http://www.baidu.com");
        startActivity(intent);
    }
}
```
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/t"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:text="http://www.baidu.com" />

    <Button
        android:id="@+id/b"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:text="浏览该网页"
        android:onClick="onClick" />
</LinearLayout>
```
**AndroidMainfest.xml中添加了：**
```
<uses-permission android:name="android.permission.INTERNET"/>
```
```
<intent-filter>
    <action android:name="android.intent.action.VIEW" />
    <category android:name="android.intent.category.DEFAULT" />
</intent-filter>
```

**三、实验结果截图：**

![image](https://github.com/TheEndofAbyss/Intent/blob/master/image/5.1.png)

![image](https://github.com/TheEndofAbyss/Intent/blob/master/image/5.1.png)

![image](https://github.com/TheEndofAbyss/Intent/blob/master/image/5.1.png)

