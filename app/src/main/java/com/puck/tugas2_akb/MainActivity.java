package com.puck.tugas2_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*
NIM     : 10117134
Nama    : Adhitya Rizqy Pratama
Kelas   : IF4
Matkul  : Aplikasi Komputasi Bergerak
Tugas   : AKB-Tugas-1


 */
//    16 April 2020, 12.30 WIB : Selesai membuat halaman activity_main
//    16 April 2020, 14.45 WIB : Selesai Membuat halaman activity_main2
//    16 April 2020, 22.00 WIB : Selesai Membuat halaman activity_main3 dan activity_main4
//    Tugas sudah selesai
//    16 April 2020, Membuat apk rilis dan mengirim file ke email. Dan upload ke github

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView view = (TextView)findViewById(R.id.Reg);
        String formattedText = "dosen't have account ? <b>Register</b>";
        // or getString(R.string.htmlFormattedText);
        view.setText(Html.fromHtml(formattedText));
    }

    public void Register(View view){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
}
