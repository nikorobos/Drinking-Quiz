package com.sisixa.drinkingquiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.sql.BatchUpdateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn21 = (Button) findViewById(R.id.button21);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonReveil();
            }
        });



    }


    int score = 0;

    boolean a = false;
    boolean b = false;
    boolean c = false;
    boolean d = false;
    boolean e = false;
    boolean f = false;
    boolean g = false;
    boolean h = false;
    boolean i = false;
    boolean j = false;
    boolean k = false;
    boolean l = false;
    boolean m = false;
    boolean n = false;
    boolean o = false;
    boolean p = false;
    boolean q = false;
    boolean r = false;
    boolean s = false;
    boolean t = false;




    public void choiceCLicked(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4);

        Button b = (Button) findViewById(R.id.button);
        if (rb3.isChecked()) {
            b.setVisibility(View.VISIBLE);




        } else if (rb1.isChecked() || rb2.isChecked() || rb4.isChecked()) {
            b.setVisibility(View.VISIBLE);
            a = true;


        }
    }

    public void buttonNext(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3);
        if(rb3.isChecked()){
            score = score + 1;
            a=false;
        }
        Button btn = (Button) findViewById(R.id.button);


        TextView text = (TextView) findViewById(R.id.textView);
        TextView text2 = (TextView) findViewById(R.id.textView2);
        text.setVisibility(View.INVISIBLE);
        text2.setVisibility(View.VISIBLE);

        RadioGroup rb = (RadioGroup) findViewById(R.id.RadioGroup);
        RadioGroup rb2 = (RadioGroup) findViewById(R.id.RadioGroup2);
        rb.setVisibility(View.INVISIBLE);
        rb2.setVisibility(View.VISIBLE);

        ImageView img = (ImageView) findViewById(R.id.imageView);
        ImageView img2 = (ImageView) findViewById(R.id.imageView2);
        img.setVisibility(View.INVISIBLE);
        img2.setVisibility(View.VISIBLE);


        btn.setVisibility(View.INVISIBLE);


    }


    //-----------------------------------------------------------------------------------//


    public void choiceCLicked2(View view) {
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_2);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_2);

        Button btn = (Button) findViewById(R.id.button2);
        if (rb1.isChecked()) {
            btn.setVisibility(View.VISIBLE);


        } else {
            btn.setVisibility(View.VISIBLE);
            b = true;

        }
    }

    public void buttonNext2(View view) {
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_2);
        if(rb1.isChecked()){
            score = score + 1;
            b=false;
        }
        Button btn = (Button) findViewById(R.id.button2);


        TextView text3 = (TextView) findViewById(R.id.textView3);
        TextView text2 = (TextView) findViewById(R.id.textView2);
        text2.setVisibility(View.INVISIBLE);
        text3.setVisibility(View.VISIBLE);

        RadioGroup rb3 = (RadioGroup) findViewById(R.id.RadioGroup3);
        RadioGroup rb2 = (RadioGroup) findViewById(R.id.RadioGroup2);
        rb2.setVisibility(View.INVISIBLE);
        rb3.setVisibility(View.VISIBLE);

        ImageView img3 = (ImageView) findViewById(R.id.imageView3);
        ImageView img2 = (ImageView) findViewById(R.id.imageView2);
        img2.setVisibility(View.INVISIBLE);
        img3.setVisibility(View.VISIBLE);


        btn.setVisibility(View.INVISIBLE);
    }


    //-----------------------------------------------------------------------------------//


    public void choiceCLicked3(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_3);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_3);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_3);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_3);
        Button b = (Button) findViewById(R.id.button3);
        if (rb2.isChecked()) {
            b.setVisibility(View.VISIBLE);


        } else if (rb1.isChecked() || rb3.isChecked() || rb4.isChecked()) {
            b.setVisibility(View.VISIBLE);
            c = true;

        }
    }

    public void buttonNext3(View view) {
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_3);
        if(rb2.isChecked()){
            score = score + 1;
            c=false;
        }
        Button btn = (Button) findViewById(R.id.button3);


        TextView text3 = (TextView) findViewById(R.id.textView3);
        TextView text4 = (TextView) findViewById(R.id.textView4);
        text3.setVisibility(View.INVISIBLE);
        text4.setVisibility(View.VISIBLE);

        RadioGroup rb3 = (RadioGroup) findViewById(R.id.RadioGroup3);
        RadioGroup rb4 = (RadioGroup) findViewById(R.id.RadioGroup4);
        rb3.setVisibility(View.INVISIBLE);
        rb4.setVisibility(View.VISIBLE);

        ImageView img3 = (ImageView) findViewById(R.id.imageView3);
        ImageView img4 = (ImageView) findViewById(R.id.imageView4);
        img3.setVisibility(View.INVISIBLE);
        img4.setVisibility(View.VISIBLE);


        btn.setVisibility(View.INVISIBLE);
    }


    //-----------------------------------------------------------------------------------//

    public void choiceCLicked4(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_4);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_4);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_4);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_4);
        Button b = (Button) findViewById(R.id.button4);
        if (rb4.isChecked()) {
            b.setVisibility(View.VISIBLE);


        } else if (rb1.isChecked() || rb3.isChecked() || rb2.isChecked()) {
            b.setVisibility(View.VISIBLE);
            d = true;

        }
    }

    public void buttonNext4(View view) {
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_4);
        if(rb4.isChecked()){
            score = score + 1;
            d=false;
        }
        Button btn = (Button) findViewById(R.id.button4);


        TextView text5 = (TextView) findViewById(R.id.textView5);
        TextView text4 = (TextView) findViewById(R.id.textView4);
        text4.setVisibility(View.INVISIBLE);
        text5.setVisibility(View.VISIBLE);

        RadioGroup rg5 = (RadioGroup) findViewById(R.id.RadioGroup5);
        RadioGroup rg4 = (RadioGroup) findViewById(R.id.RadioGroup4);
        rg4.setVisibility(View.INVISIBLE);
        rg5.setVisibility(View.VISIBLE);
        ImageView img5 = (ImageView) findViewById(R.id.imageView5);
        ImageView img4 = (ImageView) findViewById(R.id.imageView4);
        img4.setVisibility(View.INVISIBLE);
        img5.setVisibility(View.VISIBLE);


        btn.setVisibility(View.INVISIBLE);
    }


    //-----------------------------------------------------------------------------------//

    public void choiceCLicked5(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_5);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_5);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_5);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_5);
        Button b = (Button) findViewById(R.id.button5);
        if (rb1.isChecked()) {
            b.setVisibility(View.VISIBLE);


        } else if (rb4.isChecked() || rb3.isChecked() || rb2.isChecked()) {
            b.setVisibility(View.VISIBLE);
            e = true;

        }
    }

    public void buttonNext5(View view) {
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_5);
        if(rb1.isChecked()){
            score = score + 1;
            e=false;
        }
        Button btn = (Button) findViewById(R.id.button5);


        TextView text5 = (TextView) findViewById(R.id.textView5);
        TextView text6 = (TextView) findViewById(R.id.textView6);
        text5.setVisibility(View.INVISIBLE);
        text6.setVisibility(View.VISIBLE);

        RadioGroup rb5 = (RadioGroup) findViewById(R.id.RadioGroup5);
        RadioGroup rb6 = (RadioGroup) findViewById(R.id.RadioGroup6);
        rb5.setVisibility(View.INVISIBLE);
        rb6.setVisibility(View.VISIBLE);

        ImageView img5 = (ImageView) findViewById(R.id.imageView5);
        ImageView img6 = (ImageView) findViewById(R.id.imageView6);
        img5.setVisibility(View.INVISIBLE);
        img6.setVisibility(View.VISIBLE);


        btn.setVisibility(View.INVISIBLE);
    }


    //-----------------------------------------------------------------------------------//

    public void choiceCLicked6(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_6);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_6);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_6);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_6);
        Button b = (Button) findViewById(R.id.button6);
        if (rb1.isChecked()) {
            b.setVisibility(View.VISIBLE);


        } else if (rb4.isChecked() || rb3.isChecked() || rb2.isChecked()) {
            b.setVisibility(View.VISIBLE);
            f = true;

        }
    }

    public void buttonNext6(View view) {
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_6);
        if(rb1.isChecked()){
            score = score + 1;
            f=false;
        }
        Button btn = (Button) findViewById(R.id.button6);


        TextView text7 = (TextView) findViewById(R.id.textView7);
        TextView text6 = (TextView) findViewById(R.id.textView6);
        text6.setVisibility(View.INVISIBLE);
        text7.setVisibility(View.VISIBLE);

        RadioGroup rb7 = (RadioGroup) findViewById(R.id.RadioGroup7);
        RadioGroup rb6 = (RadioGroup) findViewById(R.id.RadioGroup6);
        rb6.setVisibility(View.INVISIBLE);
        rb7.setVisibility(View.VISIBLE);

        ImageView img7 = (ImageView) findViewById(R.id.imageView7);
        ImageView img6 = (ImageView) findViewById(R.id.imageView6);
        img6.setVisibility(View.INVISIBLE);
        img7.setVisibility(View.VISIBLE);


        btn.setVisibility(View.INVISIBLE);
    }


    //-----------------------------------------------------------------------------------//

    public void choiceCLicked7(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_7);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_7);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_7);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_7);
        Button b = (Button) findViewById(R.id.button7);
        if (rb3.isChecked()) {
            b.setVisibility(View.VISIBLE);


        } else if (rb4.isChecked() || rb1.isChecked() || rb2.isChecked()) {
            b.setVisibility(View.VISIBLE);
            g = true;

        }
    }

    public void buttonNext7(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_7);
        if(rb3.isChecked()){
            score = score + 1;
            g=false;
        }
        Button btn = (Button) findViewById(R.id.button7);


        TextView text7 = (TextView) findViewById(R.id.textView7);
        TextView text8 = (TextView) findViewById(R.id.textView8);
        text7.setVisibility(View.INVISIBLE);
        text8.setVisibility(View.VISIBLE);

        RadioGroup rb7 = (RadioGroup) findViewById(R.id.RadioGroup7);
        RadioGroup rb8 = (RadioGroup) findViewById(R.id.RadioGroup8);
        rb7.setVisibility(View.INVISIBLE);
        rb8.setVisibility(View.VISIBLE);

        ImageView img7 = (ImageView) findViewById(R.id.imageView7);
        ImageView img8 = (ImageView) findViewById(R.id.imageView8);
        img7.setVisibility(View.INVISIBLE);
        img8.setVisibility(View.VISIBLE);


        btn.setVisibility(View.INVISIBLE);
    }


    //-----------------------------------------------------------------------------------//


    public void choiceCLicked8(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_8);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_8);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_8);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_8);
        Button b = (Button) findViewById(R.id.button8);
        if (rb1.isChecked()) {
            b.setVisibility(View.VISIBLE);


        } else if (rb4.isChecked() || rb3.isChecked() || rb2.isChecked()) {
            b.setVisibility(View.VISIBLE);
            h = true;

        }
    }

    public void buttonNext8(View view) {
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_8);
        if(rb1.isChecked()){
            score = score + 1;
            h=false;
        }
        Button btn = (Button) findViewById(R.id.button8);


        TextView text9 = (TextView) findViewById(R.id.textView9);
        TextView text8 = (TextView) findViewById(R.id.textView8);
        text8.setVisibility(View.INVISIBLE);
        text9.setVisibility(View.VISIBLE);

        RadioGroup rb9 = (RadioGroup) findViewById(R.id.RadioGroup9);
        RadioGroup rb8 = (RadioGroup) findViewById(R.id.RadioGroup8);
        rb8.setVisibility(View.INVISIBLE);
        rb9.setVisibility(View.VISIBLE);

        ImageView img9 = (ImageView) findViewById(R.id.imageView9);
        ImageView img8 = (ImageView) findViewById(R.id.imageView8);
        img8.setVisibility(View.INVISIBLE);
        img9.setVisibility(View.VISIBLE);


        btn.setVisibility(View.INVISIBLE);
    }


    //-----------------------------------------------------------------------------------//


    public void choiceCLicked9(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_9);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_9);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_9);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_9);
        Button b = (Button) findViewById(R.id.button9);
        if (rb1.isChecked()) {
            b.setVisibility(View.VISIBLE);


        } else if (rb4.isChecked() || rb3.isChecked() || rb2.isChecked()) {
            b.setVisibility(View.VISIBLE);
            i = true;

        }
    }

    public void buttonNext9(View view) {
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_9);
        if(rb1.isChecked()){
            score = score + 1;
            i=false;
        }
        Button btn = (Button) findViewById(R.id.button9);


        TextView text9 = (TextView) findViewById(R.id.textView9);
        TextView text10 = (TextView) findViewById(R.id.textView10);
        text9.setVisibility(View.INVISIBLE);
        text10.setVisibility(View.VISIBLE);

        RadioGroup rb9 = (RadioGroup) findViewById(R.id.RadioGroup9);
        RadioGroup rb10 = (RadioGroup) findViewById(R.id.RadioGroup10);
        rb9.setVisibility(View.INVISIBLE);
        rb10.setVisibility(View.VISIBLE);

        ImageView img9 = (ImageView) findViewById(R.id.imageView9);
        ImageView img10 = (ImageView) findViewById(R.id.imageView10);
        img9.setVisibility(View.INVISIBLE);
        img10.setVisibility(View.VISIBLE);


        btn.setVisibility(View.INVISIBLE);
    }


    //-----------------------------------------------------------------------------------//


    public void choiceCLicked10(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_10);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_10);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_10);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_10);
        Button b = (Button) findViewById(R.id.button10);
        if (rb4.isChecked()) {
            b.setVisibility(View.VISIBLE);


        } else if (rb1.isChecked() || rb3.isChecked() || rb2.isChecked()) {
            b.setVisibility(View.VISIBLE);
            j = true;

        }
    }

    public void buttonNext10(View view) {
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_10);
        if(rb4.isChecked()){
            score = score + 1;
            j=false;
        }
        Button btn = (Button) findViewById(R.id.button10);


        TextView text11 = (TextView) findViewById(R.id.textView11);
        TextView text10 = (TextView) findViewById(R.id.textView10);
        text10.setVisibility(View.INVISIBLE);
        text11.setVisibility(View.VISIBLE);

        RadioGroup rb11 = (RadioGroup) findViewById(R.id.RadioGroup11);
        RadioGroup rb10 = (RadioGroup) findViewById(R.id.RadioGroup10);
        rb10.setVisibility(View.INVISIBLE);
        rb11.setVisibility(View.VISIBLE);

        ImageView img11 = (ImageView) findViewById(R.id.imageView11);
        ImageView img10 = (ImageView) findViewById(R.id.imageView10);
        img10.setVisibility(View.INVISIBLE);
        img11.setVisibility(View.VISIBLE);


        btn.setVisibility(View.INVISIBLE);
    }


    //-----------------------------------------------------------------------------------//

    public void choiceCLicked11(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_11);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_11);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_11);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_11);
        Button b = (Button) findViewById(R.id.button11);
        if (rb2.isChecked()) {
            b.setVisibility(View.VISIBLE);

        } else if (rb1.isChecked() || rb3.isChecked() || rb4.isChecked()) {
            b.setVisibility(View.VISIBLE);
            k = true;

        }
    }

    public void buttonNext11(View view) {
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_11);
        if(rb2.isChecked()){
            score = score + 1;
            k=false;
        }
        Button btn = (Button) findViewById(R.id.button11);


        TextView text11 = (TextView) findViewById(R.id.textView11);
        TextView text12 = (TextView) findViewById(R.id.textView12);
        text11.setVisibility(View.INVISIBLE);
        text12.setVisibility(View.VISIBLE);

        RadioGroup rb11 = (RadioGroup) findViewById(R.id.RadioGroup11);
        RadioGroup rb12 = (RadioGroup) findViewById(R.id.RadioGroup12);
        rb11.setVisibility(View.INVISIBLE);
        rb12.setVisibility(View.VISIBLE);

        ImageView img11 = (ImageView) findViewById(R.id.imageView11);
        ImageView img12 = (ImageView) findViewById(R.id.imageView12);
        img11.setVisibility(View.INVISIBLE);
        img12.setVisibility(View.VISIBLE);


        btn.setVisibility(View.INVISIBLE);
    }


    //-----------------------------------------------------------------------------------//

    public void choiceCLicked12(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_12);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_12);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_12);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_12);
        Button b = (Button) findViewById(R.id.button12);
        if (rb4.isChecked()) {
            b.setVisibility(View.VISIBLE);


        } else if (rb1.isChecked() || rb3.isChecked() || rb2.isChecked()) {
            b.setVisibility(View.VISIBLE);
            l = true;

        }
    }

    public void buttonNext12(View view) {
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_12);
        if(rb4.isChecked()){
            score = score + 1;
            l=false;
        }
        Button btn = (Button) findViewById(R.id.button12);


        TextView text13 = (TextView) findViewById(R.id.textView13);
        TextView text12 = (TextView) findViewById(R.id.textView12);
        text12.setVisibility(View.INVISIBLE);
        text13.setVisibility(View.VISIBLE);

        RadioGroup rb13 = (RadioGroup) findViewById(R.id.RadioGroup13);
        RadioGroup rb12 = (RadioGroup) findViewById(R.id.RadioGroup12);
        rb12.setVisibility(View.INVISIBLE);
        rb13.setVisibility(View.VISIBLE);

        ImageView img13 = (ImageView) findViewById(R.id.imageView13);
        ImageView img12 = (ImageView) findViewById(R.id.imageView12);
        img12.setVisibility(View.INVISIBLE);
        img13.setVisibility(View.VISIBLE);


        btn.setVisibility(View.INVISIBLE);
    }

    //-----------------------------------------------------------------------------------//

    public void choiceCLicked13(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_13);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_13);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_13);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_13);
        Button b = (Button) findViewById(R.id.button13);
        if (rb2.isChecked()) {
            b.setVisibility(View.VISIBLE);

        } else if (rb1.isChecked() || rb3.isChecked() || rb4.isChecked()) {
            b.setVisibility(View.VISIBLE);
            m = true;

        }
    }

    public void buttonNext13(View view) {
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_13);
        if(rb2.isChecked()){
            score = score + 1;
            m=false;
        }
        Button btn = (Button) findViewById(R.id.button13);


        TextView text13 = (TextView) findViewById(R.id.textView13);
        TextView text14 = (TextView) findViewById(R.id.textView14);
        text13.setVisibility(View.INVISIBLE);
        text14.setVisibility(View.VISIBLE);

        RadioGroup rb13 = (RadioGroup) findViewById(R.id.RadioGroup13);
        RadioGroup rb14 = (RadioGroup) findViewById(R.id.RadioGroup14);
        rb13.setVisibility(View.INVISIBLE);
        rb14.setVisibility(View.VISIBLE);

        ImageView img13 = (ImageView) findViewById(R.id.imageView13);
        ImageView img14 = (ImageView) findViewById(R.id.imageView14);
        img13.setVisibility(View.INVISIBLE);
        img14.setVisibility(View.VISIBLE);


        btn.setVisibility(View.INVISIBLE);
    }


//-----------------------------------------------------------------------------------//

    public void choiceCLicked14(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_14);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_14);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_14);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_14);
        Button b = (Button) findViewById(R.id.button14);
        if (rb1.isChecked()) {
            b.setVisibility(View.VISIBLE);


        } else if (rb2.isChecked() || rb3.isChecked() || rb4.isChecked()) {
            b.setVisibility(View.VISIBLE);
            n = true;

        }
    }

    public void buttonNext14(View view) {
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_14);
        if(rb1.isChecked()){
            score = score + 1;
            n=false;
        }
        Button btn = (Button) findViewById(R.id.button14);


        TextView text15 = (TextView) findViewById(R.id.textView15);
        TextView text14 = (TextView) findViewById(R.id.textView14);
        text14.setVisibility(View.INVISIBLE);
        text15.setVisibility(View.VISIBLE);

        RadioGroup rb15 = (RadioGroup) findViewById(R.id.RadioGroup15);
        RadioGroup rb14 = (RadioGroup) findViewById(R.id.RadioGroup14);
        rb14.setVisibility(View.INVISIBLE);
        rb15.setVisibility(View.VISIBLE);

        ImageView img15 = (ImageView) findViewById(R.id.imageView15);
        ImageView img14 = (ImageView) findViewById(R.id.imageView14);
        img14.setVisibility(View.INVISIBLE);
        img15.setVisibility(View.VISIBLE);


        btn.setVisibility(View.INVISIBLE);
    }

    //-----------------------------------------------------------------------------------//

    public void choiceCLicked15(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_15);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_15);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_15);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_15);
        Button b = (Button) findViewById(R.id.button15);
        if (rb3.isChecked()) {
            b.setVisibility(View.VISIBLE);


        } else if (rb1.isChecked() || rb4.isChecked() || rb2.isChecked()) {
            b.setVisibility(View.VISIBLE);
            o = true;

        }
    }

    public void buttonNext15(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_15);
        if(rb3.isChecked()){
            score = score + 1;
            o=false;
        }
        Button btn = (Button) findViewById(R.id.button15);


        TextView text15 = (TextView) findViewById(R.id.textView15);
        TextView text16 = (TextView) findViewById(R.id.textView16);
        text15.setVisibility(View.INVISIBLE);
        text16.setVisibility(View.VISIBLE);

        RadioGroup rb15 = (RadioGroup) findViewById(R.id.RadioGroup15);
        RadioGroup rb16 = (RadioGroup) findViewById(R.id.RadioGroup16);
        rb15.setVisibility(View.INVISIBLE);
        rb16.setVisibility(View.VISIBLE);

        ImageView img15 = (ImageView) findViewById(R.id.imageView15);
        ImageView img16 = (ImageView) findViewById(R.id.imageView16);
        img15.setVisibility(View.INVISIBLE);
        img16.setVisibility(View.VISIBLE);


        btn.setVisibility(View.INVISIBLE);
    }


    //-----------------------------------------------------------------------------------//

    public void choiceCLicked16(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_16);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_16);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_16);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_16);
        Button b = (Button) findViewById(R.id.button16);
        if (rb3.isChecked()) {
            b.setVisibility(View.VISIBLE);


        } else if (rb1.isChecked() || rb4.isChecked() || rb2.isChecked()) {
            b.setVisibility(View.VISIBLE);
            p = true;

        }
    }

    public void buttonNext16(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_16);
        if(rb3.isChecked()){
            score = score + 1;
            p=false;
        }
        Button btn = (Button) findViewById(R.id.button16);


        TextView text17 = (TextView) findViewById(R.id.textView17);
        TextView text16 = (TextView) findViewById(R.id.textView16);
        text16.setVisibility(View.INVISIBLE);
        text17.setVisibility(View.VISIBLE);

        RadioGroup rb17 = (RadioGroup) findViewById(R.id.RadioGroup17);
        RadioGroup rb16 = (RadioGroup) findViewById(R.id.RadioGroup16);
        rb16.setVisibility(View.INVISIBLE);
        rb17.setVisibility(View.VISIBLE);

        ImageView img17 = (ImageView) findViewById(R.id.imageView17);
        ImageView img16 = (ImageView) findViewById(R.id.imageView16);
        img16.setVisibility(View.INVISIBLE);
        img17.setVisibility(View.VISIBLE);


        btn.setVisibility(View.INVISIBLE);
    }


    //-----------------------------------------------------------------------------------//

    public void choiceCLicked17(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_17);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_17);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_17);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_17);
        Button b = (Button) findViewById(R.id.button17);
        if (rb1.isChecked()) {
            b.setVisibility(View.VISIBLE);


        } else if (rb4.isChecked() || rb3.isChecked() || rb2.isChecked()) {
            b.setVisibility(View.VISIBLE);
            q = true;

        }
    }

    public void buttonNext17(View view) {
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_17);
        if(rb1.isChecked()){
            score = score + 1;
            q=false;
        }
        Button btn = (Button) findViewById(R.id.button17);


        TextView text17 = (TextView) findViewById(R.id.textView17);
        TextView text18 = (TextView) findViewById(R.id.textView18);
        text17.setVisibility(View.INVISIBLE);
        text18.setVisibility(View.VISIBLE);

        RadioGroup rb17 = (RadioGroup) findViewById(R.id.RadioGroup17);
        RadioGroup rb18 = (RadioGroup) findViewById(R.id.RadioGroup18);
        rb17.setVisibility(View.INVISIBLE);
        rb18.setVisibility(View.VISIBLE);

        ImageView img17 = (ImageView) findViewById(R.id.imageView17);
        ImageView img18 = (ImageView) findViewById(R.id.imageView18);
        img17.setVisibility(View.INVISIBLE);
        img18.setVisibility(View.VISIBLE);


        btn.setVisibility(View.INVISIBLE);
    }

    //-----------------------------------------------------------------------------------//

    public void choiceCLicked18(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_18);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_18);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_18);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_18);
        Button b = (Button) findViewById(R.id.button18);
        if (rb2.isChecked()) {
            b.setVisibility(View.VISIBLE);



        } else if (rb4.isChecked() || rb3.isChecked() || rb1.isChecked()) {
            b.setVisibility(View.VISIBLE);
            r = true;

        }
    }

    public void buttonNext18(View view) {
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_18);
        if(rb2.isChecked()){
            score = score + 1;
            r=false;
        }
        Button btn = (Button) findViewById(R.id.button18);


        TextView text19 = (TextView) findViewById(R.id.textView19);
        TextView text18 = (TextView) findViewById(R.id.textView18);
        text18.setVisibility(View.INVISIBLE);
        text19.setVisibility(View.VISIBLE);

        RadioGroup rb19 = (RadioGroup) findViewById(R.id.RadioGroup19);
        RadioGroup rb18 = (RadioGroup) findViewById(R.id.RadioGroup18);
        rb18.setVisibility(View.INVISIBLE);
        rb19.setVisibility(View.VISIBLE);

        ImageView img19 = (ImageView) findViewById(R.id.imageView19);
        ImageView img18 = (ImageView) findViewById(R.id.imageView18);
        img18.setVisibility(View.INVISIBLE);
        img19.setVisibility(View.VISIBLE);


        btn.setVisibility(View.INVISIBLE);
    }

    //-----------------------------------------------------------------------------------//

    public void choiceCLicked19(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_19);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_19);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_19);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_19);
        Button b = (Button) findViewById(R.id.button19);
        if (rb1.isChecked()) {
            b.setVisibility(View.VISIBLE);


        } else if (rb4.isChecked() || rb3.isChecked() || rb2.isChecked()) {
            b.setVisibility(View.VISIBLE);
            s = true;

        }
    }

    public void buttonNext19(View view) {
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_19);
        if(rb1.isChecked()){
            score = score + 1;
            s=false;
        }
        Button btn = (Button) findViewById(R.id.button19);


        TextView text19 = (TextView) findViewById(R.id.textView19);
        TextView text20 = (TextView) findViewById(R.id.textView20);
        text19.setVisibility(View.INVISIBLE);
        text20.setVisibility(View.VISIBLE);

        RadioGroup rb19 = (RadioGroup) findViewById(R.id.RadioGroup19);
        RadioGroup rb20 = (RadioGroup) findViewById(R.id.RadioGroup20);
        rb19.setVisibility(View.INVISIBLE);
        rb20.setVisibility(View.VISIBLE);

        ImageView img19 = (ImageView) findViewById(R.id.imageView19);
        ImageView img20 = (ImageView) findViewById(R.id.imageView20);
        img19.setVisibility(View.INVISIBLE);
        img20.setVisibility(View.VISIBLE);


        btn.setVisibility(View.INVISIBLE);
    }

    //-----------------------------------------------------------------------------------//

    public void choiceCLicked20(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_20);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2_20);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1_20);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4_20);
        Button b = (Button) findViewById(R.id.button20);
        if (rb3.isChecked()) {
            b.setVisibility(View.VISIBLE);


        } else if (rb4.isChecked() || rb2.isChecked() || rb1.isChecked()) {
            b.setVisibility(View.VISIBLE);
            t = true;

        }
    }

    public void buttonNext20(View view) {
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3_20);
        if(rb3.isChecked()){
            score = score + 1;
            t=false;

        }
        Button btn = (Button) findViewById(R.id.button20);


        TextView text21 = (TextView) findViewById(R.id.textView21);
        TextView text20 = (TextView) findViewById(R.id.textView20);
        text20.setVisibility(View.INVISIBLE);
        text21.setVisibility(View.VISIBLE);
        text21.setText(getString(R.string.user_score) + score + "/20");

        TextView text22 = (TextView) findViewById(R.id.textView22);
        TextView text23 = (TextView) findViewById(R.id.textView23);

        Button btn21 = (Button) findViewById(R.id.button21);
        Button btn22 = (Button) findViewById(R.id.button22);

        if (score < 10) {
            text22.setVisibility(View.VISIBLE);
            text22.setText(getString(R.string.first_message));
        }

        if (score >= 10 && score <= 15) {
            text22.setVisibility(View.VISIBLE);
            text22.setText(getString(R.string.second_message) + "\n" + getString(R.string.second_message2));
        }

        if (score > 15 && score < 20) {
            text22.setVisibility(View.VISIBLE);
            text22.setText(getString(R.string.third_message) + "\n" + getString(R.string.third_message2));
        }

        if (score == 20) {
            text22.setVisibility(View.VISIBLE);
            text22.setText(getString(R.string.fourth_message));
        }

        if (score < 20) {
            text23.setVisibility(View.VISIBLE);
            btn21.setVisibility(View.VISIBLE);
            btn22.setVisibility(View.VISIBLE);
        } else {
            btn22.setVisibility(View.VISIBLE);
        }

        if (score == 4) {
            text22.setVisibility(View.VISIBLE);
            text22.setText(getString(R.string.hou_message));
        }

        //RadioGroup rb21 = (RadioGroup) findViewById(R.id.RadioGroup21);
        RadioGroup rb20 = (RadioGroup) findViewById(R.id.RadioGroup20);
        rb20.setVisibility(View.INVISIBLE);
        //rb21.setVisibility(View.VISIBLE);

        //ImageView img21=(ImageView) findViewById(R.id.imageView21);
        ImageView img20 = (ImageView) findViewById(R.id.imageView20);
        img20.setVisibility(View.INVISIBLE);
        //img21.setVisibility(View.VISIBLE);


        btn.setVisibility(View.INVISIBLE);
    }

    public void buttonRestart(View view) {

        Button restart = (Button) findViewById(R.id.button22);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.RadioGroup);
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.RadioGroup2);
        if (restart.isClickable()) {
            Intent restartIntent = getBaseContext().getPackageManager()
                    .getLaunchIntentForPackage(getBaseContext().getPackageName());
            restartIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(restartIntent);
            score = 0;


        }
    }

    public void buttonReveil() {
        TextView text21 = (TextView) findViewById(R.id.textView21);


        text21.setVisibility(View.INVISIBLE);


        TextView text22 = (TextView) findViewById(R.id.textView22);
        TextView text23 = (TextView) findViewById(R.id.textView23);
        text22.setVisibility(View.INVISIBLE);
        text23.setVisibility(View.INVISIBLE);

        Button btn21 = (Button) findViewById(R.id.button21);
        Button btn22 = (Button) findViewById(R.id.button22);
        btn21.setVisibility(View.INVISIBLE);
        btn22.setVisibility(View.INVISIBLE);


        ArrayList<String> pin = new ArrayList<String>();


        if (a == true) {

            pin.add(getString(R.string.question_1));
            //   myTextView.setText(Arrays.toString(new String[]{pin[0]}).replace("[","").replace("]","\n\n"));


        } else {
            pin.add("");

        }

        if (b == true) {

            pin.add(getString(R.string.question_2));
            //   myTextView.setText(Arrays.toString(new String[]{pin[0]}).replace("[","").replace("]","\n\n"));


        } else {
            pin.add("");

        }

        if (c == true) {

            pin.add(getString(R.string.question_3));
            //   myTextView.setText(Arrays.toString(new String[]{pin[0]}).replace("[","").replace("]","\n\n"));


        } else {
            pin.add("");

        }

        if (d == true) {

            pin.add(getString(R.string.question_4));
            //   myTextView.setText(Arrays.toString(new String[]{pin[0]}).replace("[","").replace("]","\n\n"));


        } else {
            pin.add("");

        }

        if (e == true) {

            pin.add(getString(R.string.question_5));
            //   myTextView.setText(Arrays.toString(new String[]{pin[0]}).replace("[","").replace("]","\n\n"));


        } else {
            pin.add("");

        }

        if (f == true) {

            pin.add(getString(R.string.question_6));
            //   myTextView.setText(Arrays.toString(new String[]{pin[0]}).replace("[","").replace("]","\n\n"));


        } else {
            pin.add("");

        }

        if (g == true) {

            pin.add(getString(R.string.question_7));
            //   myTextView.setText(Arrays.toString(new String[]{pin[0]}).replace("[","").replace("]","\n\n"));


        } else {
            pin.add("");

        }

        if (h == true) {

            pin.add(getString(R.string.question_8));
            //   myTextView.setText(Arrays.toString(new String[]{pin[0]}).replace("[","").replace("]","\n\n"));


        } else {
            pin.add("");

        }

        if (i == true) {

            pin.add(getString(R.string.question_9));
            //   myTextView.setText(Arrays.toString(new String[]{pin[0]}).replace("[","").replace("]","\n\n"));


        } else {
            pin.add("");

        }

        if (j == true) {

            pin.add(getString(R.string.question_10));
            //   myTextView.setText(Arrays.toString(new String[]{pin[0]}).replace("[","").replace("]","\n\n"));


        } else {
            pin.add("");

        }

        if (k == true) {

            pin.add(getString(R.string.question_11));
            //   myTextView.setText(Arrays.toString(new String[]{pin[0]}).replace("[","").replace("]","\n\n"));


        } else {
            pin.add("");

        }

        if (l == true) {

            pin.add(getString(R.string.question_12));
            //   myTextView.setText(Arrays.toString(new String[]{pin[0]}).replace("[","").replace("]","\n\n"));


        } else {
            pin.add("");

        }

        if (m == true) {

            pin.add(getString(R.string.question_13));
            //   myTextView.setText(Arrays.toString(new String[]{pin[0]}).replace("[","").replace("]","\n\n"));


        } else {
            pin.add("");

        }
        if (n == true) {

            pin.add(getString(R.string.question_14));
            //   myTextView.setText(Arrays.toString(new String[]{pin[0]}).replace("[","").replace("]","\n\n"));


        } else {
            pin.add("");

        }
        if (o == true) {

            pin.add(getString(R.string.question_15));
            //   myTextView.setText(Arrays.toString(new String[]{pin[0]}).replace("[","").replace("]","\n\n"));


        } else {
            pin.add("");

        }

        if (p == true) {

            pin.add(getString(R.string.question_16));
            //   myTextView.setText(Arrays.toString(new String[]{pin[0]}).replace("[","").replace("]","\n\n"));


        } else {
            pin.add("");

        }

        if (q == true) {

            pin.add(getString(R.string.question_17));
            //   myTextView.setText(Arrays.toString(new String[]{pin[0]}).replace("[","").replace("]","\n\n"));


        } else {
            pin.add("");

        }

        if (r == true) {

            pin.add(getString(R.string.question_18));
            //   myTextView.setText(Arrays.toString(new String[]{pin[0]}).replace("[","").replace("]","\n\n"));


        } else {
            pin.add("");

        }

        if (s == true) {

            pin.add(getString(R.string.question_19));
            //   myTextView.setText(Arrays.toString(new String[]{pin[0]}).replace("[","").replace("]","\n\n"));


        } else {
            pin.add("");

        }

        if (t == true) {

            pin.add(getString(R.string.question_20));
            //   myTextView.setText(Arrays.toString(new String[]{pin[0]}).replace("[","").replace("]","\n\n"));


        } else {
            pin.add("");

        }
        for (int i = 0; i <= pin.size(); i++) {
            pin.remove("");
        }


        ArrayAdapter<String> adaptoras = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, pin);
        ListView list = (ListView) findViewById(R.id.myTextView);

        list.setAdapter(adaptoras);


        list.setBackgroundColor(Color.RED);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               final String item = (String) parent.getItemAtPosition(position);

               if (item == getString(R.string.question_1)){
                   ShowMessageDialog(getString(R.string.tip1));
               }

               if(item == getString(R.string.question_2)){
                   ShowMessageDialog(getString(R.string.tip2));
               }
                if(item == getString(R.string.question_3)){
                    ShowMessageDialog(getString(R.string.tip3));
                }
                if(item == getString(R.string.question_4)){
                    ImageDialog1(view);
                }
                if(item == getString(R.string.question_5)){
                    ShowMessageDialog(getString(R.string.tip5));
                }
                if(item == getString(R.string.question_6)){
                    ImageDialog2(view);
                }
                if(item == getString(R.string.question_7)){
                    ShowMessageDialog(getString(R.string.tip7));
                }
                if(item == getString(R.string.question_8)){
                    ShowMessageDialog(getString(R.string.tip8));
                }
                if(item == getString(R.string.question_9)){
                    ShowMessageDialog(getString(R.string.tip9));
                }
                if(item == getString(R.string.question_10)){
                    ShowMessageDialog(getString(R.string.tip10));
                }
                if(item == getString(R.string.question_11)){
                    ShowMessageDialog(getString(R.string.tip11));
                }
                if(item == getString(R.string.question_12)){
                    ImageDialog3(view);
                }
                if(item == getString(R.string.question_13)){
                    ImageDialog4(view);
                }
                if(item == getString(R.string.question_14)){
                    ImageDialog5(view);
                }
                if(item == getString(R.string.question_15)){
                    ShowMessageDialog(getString(R.string.tip15));
                }
                if(item == getString(R.string.question_16)){
                    ImageDialog6(view);
                }
                if(item == getString(R.string.question_17)){
                    ImageDialog7(view);
                }
                if(item == getString(R.string.question_18)){
                    ImageDialog8(view);
                }
                if(item == getString(R.string.question_19)){
                    ShowMessageDialog(getString(R.string.tip19));
                }
                if(item == getString(R.string.question_20)){
                    ShowMessageDialog(getString(R.string.tip20));
                }

            }
        });
    }





    public void ImageDialog1(View view) {
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.carlsberg);
        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).

                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();
    }

       public void ImageDialog2(View view) {
        ImageView image = new ImageView(this);

        image.setImageResource(R.drawable.chart);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).

                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();
    }



    public void ImageDialog3(View view) {
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.x4);
        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).
                        setMessage(getString(R.string.tip12)).
                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();
    }

    public void ImageDialog4(View view) {
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.spirytus);
        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).
                        setMessage(getString(R.string.tip13)).
                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();
    }

    public void ImageDialog5(View view) {
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.riv);
        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).
                        setMessage(getString(R.string.tip14)).
                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();
    }

    public void ImageDialog6(View view) {
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.mcfarlanddd);
        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).

                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();
    }

    public void ImageDialog7(View view) {
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.dddddd);
        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).

                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();
    }

    public void ImageDialog8(View view) {
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.heineken);
        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).

                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();
    }




    public void ShowMessageDialog(String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(str);
        builder.setCancelable(false);
        builder.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void test(String str) {
        ShowMessageDialog("About to start new activity");
    }




}






