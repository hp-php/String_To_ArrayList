package com.example.demosrtingtoarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //String[] strings = new String[]{"1", "2"};
    String num = "1,2,3,4,A,B,C,D";
    //  List<String> stringList = new ArrayList<String>(Arrays.asList(strings));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // String arrayList = " ";
//        List<String> list = Arrays.asList(strings);
//        Log.e("List Array",list);



        String str[] = num.split(",");
        List<String> al = new ArrayList<String>();
        al = Arrays.asList(str);
        for (String s : al) {
            Log.e("Array List",s);
            Log.d("Array List",s);


        }
    }
}