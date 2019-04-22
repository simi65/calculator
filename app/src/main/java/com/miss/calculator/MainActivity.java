package com.miss.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

// todo 1 deklarasi file nyang di buat

public class MainActivity extends AppCompatActivity {
    EditText nilai1, nilai2;
    TextView hasil;
    Button tambah, kali, kurang, slash, hapus;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //todo 2 inisialasi view nyang di buat

        nilai1 = findViewById(R.id.nilai1);
        nilai2 = findViewById(R.id.nilai2);
        hasil  = findViewById(R.id.hasil);
        tambah = findViewById(R.id.tambah);
        kali   = findViewById(R.id.kali);
        kurang = findViewById(R.id.kurang);
        slash   =findViewById(R.id.slash);
        hapus   =findViewById(R.id.hapus);

        //todo 8 atur button untuk masing - masing operator

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "woy isi", Toast.LENGTH_SHORT).show();
                }else {
                    tambah();
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "woy isi", Toast.LENGTH_SHORT).show();
                }else {
                    kali();
                }

            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "woy isi", Toast.LENGTH_SHORT).show();
                }else {
                    kurang();
                }

            }
        });

        slash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "woy isi", Toast.LENGTH_SHORT).show();
                }else {
                    slash();
                }

            }
        });
        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hapus();

            }
        });

    }

    // todo 3 buat method namanya tambah

     void  tambah (){

         // simpan inputan user kedalam variabe
        int angka1 = Integer.parseInt(nilai1.getText() .toString());
        int angka2 = Integer.parseInt(nilai2.getText() .toString());
        //jumlahkan
        int total  = angka1 + angka2;
        hasil.setText (String.valueOf(total));

    }
    // todo 4 buat method namanya kali
     void kali (){

        // simpan inputan user kedalam variabe
         int angka1 = Integer.parseInt(nilai1.getText() .toString());
         int angka2 = Integer.parseInt(nilai2.getText() .toString());
//jumlahkan
         int total  = angka1 * angka2;
         hasil.setText (String.valueOf(total));
    }
    // todo 5 buat method namanya kurang
     void kurang (){
// simpan inputan user kedalam variabe
         int angka1 = Integer.parseInt(nilai1.getText().toString());
         int angka2 = Integer.parseInt(nilai2.getText().toString());
         //jumlahkan
         int total  = angka1 - angka2;
         hasil.setText(String.valueOf(total));
    }
    // todo 6 buat method namanya slash / bagi
     void slash () {
         // simpan inputan user kedalam variabe
         int angka1 = Integer.parseInt(nilai1.getText() .toString());
         int angka2 = Integer.parseInt(nilai2.getText() .toString());
         //jumlahkan
         int total  = angka1 / angka2;
         hasil.setText (String.valueOf(total));

    }
    // todo 7 buat method namanya hapus
     void hapus () {

        nilai1.setText("");
        nilai2.setText("");

    }

}
