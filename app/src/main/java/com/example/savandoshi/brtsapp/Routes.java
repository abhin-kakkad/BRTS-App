package com.example.savandoshi.brtsapp;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class Routes extends AppCompatActivity {

    String[] r1 = {
            "RTO Circle", "Ranip", "Bhavsar Hostel", "Akhbarnagar", "Pragatinagar", "Shastrinagar", "Jay mangal", "Sola Cross Roads",
            "Valinath Chowk", "Memnagar", "Gujarat University", "Andhjan Mandal(IIM)", "Himmatlal Park", "Shivranjani",
            "Jhansi Ki Rani", "Nehrunagar", "Manekbaug", "Dharnidhar Derasar", "Anjali", "Chandranagar", "Khodiyarnagar",
            "Danilimda Cross Roads", "Vaikunthdham Mandir", "Swaminarayan College", "Jawahar Chowk", "Kankaria Lake", "Rambaug",
            "Maninagar Char Rasta", "Maninagar"};

    String[] r2= {
            "Anjali","Chandranagar", "Khodiyarnagar", "Danilimda Cross Roads", "Danilimda Road",
            "Chhipa Society", "Chandola Lake", "BRTS Workshop", "Kashiram Textiles", "Narol", "Mukesh Industries", "Isanpur", "Ghodasar", "Jashodanagar Cross Roads",
            "Express Highway", "CTM Cross Roads", "Purvdeep Society", "Jogeshwari Society", "Rabari Colony", "Ramrajya Nagar", "Rameshwar Park",
            "Geeta Gauri Cinema", "Soni Ni Chali", "Viratnagar", "Bapunagar Approach", "Lilanagar", "Thakkarnagar Approach", "Hiravadi", "Vijay Park",
            "Krishna Nagar", "Dhanush Dhari Mandir", "Naroda ST Workshop", "Bethak", "Naroda Gam"};

    String[] r3={      "RTO Circle","Ranip","Bhavsar Hostel","Akhbarnagar","Pragatinagar","Shastrinagar","Jaymangal","Sola Cross Roads","Valinath Chowk",
            "Memnagar","(Gujarat) University","Andhjan Mandal (IIM)","Himmatlal Park","Shivranjani","Jhansi Ki Rani","Nehrunagar",
            "Manekbaug","Dharnidhar Derasar","Anjali (Vasna)","Chandranagar","Khodiyarnagar","Danilimda Cross Roads","Danilimda Road",
            "Chhipa Society","Chandola Lake","BRTS Workshop","Kashiram Textiles","Narol","Mukesh Industries","Isanpur","Ghodasar",
            "Jashodanagar Cross Roads","(Ahmedabad-Vadodara) Express Highway Junction","CTM Cross Roads","Purvdeep Society",
            "Jogeshwari Society","Rabari Colony","Ramrajya Nagar","Rameshwar Park","Geeta Gauri Cinema","Soni Ni Chali",
            "Viratnagar","Bapunagar Approach","Lilanagar","Thakkarnagar Approach","Hiravadi","Vijay Park","Krishna Nagar",
            "Dhanush Dhari Mandir","Naroda"};

    String[] r4= {
            "RTO Circle", "Ranip", "N.R. Patel Park", "Ramapir No Tekro", "Juna Vadaj", "Gurudwara", "Hanumanpura",
            "Sarkari Litho Press (Delhi Darwaja)"
    };

    String[] r8= {   "Visat Gandhinagar Junction","Motera Cross Roads","Sabarmati Police Station","Sabarmati Municipal Swimming Pool","Rathi Apartment",
            "Sabarmati Power House","RTO Circle","Ranip","Bhavsar Hostel","Akhbarnagar","Pragatinagar","Shastrinagar","Jaymangal","Sola Cross Roads",
            "Valinath Chowk","Memnagar","(Gujarat) University","Andhjan Mandal (IIM)","Himmatlal Park","Shivranjani","Jhansi Ki Rani","Nehrunagar","Manekbaug",
            "Dharnidhar Derasar","Anjali (Vasna)","Chandranagar","Khodiyarnagar","Danilimda Cross Roads","Vaikunthdham Mandir","Swaminarayan College","Jawahar Chowk",
            "Kankaria Lake","Rambaug","Maninagar Char Rasta","Maninagar","Swaminarayan College","Bhairavnath","Mira Cinema Char Rasta"
    };

    String[] r9={   "RTO Circle","Ranip","Nava Vadaj","Ramapir No Tekro","Juna Vadaj","Gurudwara","Hanumanpura","Sarkari Litho Press","Kalupur Railway Station",
            "Sarangpur Darwaja","Karnamukteshwar Mahadev","Raipur Darwaja","Astodiya Darwaja","Municipal Corporation Office","Raikhad Cross Roads",
            "Lokmanya Tilak Bag","Town Hall"
    };

    String[] r10={  "Anjali","Chandranagar","Khodiyarnagar","Danilimda Cross Roads","Vaikunthdham Mandir","Swaminarayan College",
            "Raipur Darwaja","Karnamukteshwar Mahadev","Sarangpur Darwaja","Kalupur Railway Station"
    };

    String[] r7= {  "Sarkari Litho Press","Hanumanpura","Gurudwara","Juna Vadaj","Ramapir No Tekro","Nava Vadaj","Bhavsar Hostel","Akhbarnagar",
            "Pragatinagar","Shastrinagar","Jaymangal","Parasnagar","Parshwanath Jain Mandir","Bhuyangdev","Sattadhar","Sola Bridge",
            "Science City Approach"};

    String[] r6={  "Ajit Mill","Soni Ni Chali","Grid Station","Odhav Fire Station","Vallabh Nagar","Chhotalal Ni Chali","Morlidhar Society",
            "Odhav Talav (Gam)","S P Ring Road"
    };

    String[] r5={  "ISKCON Cross Roads","Ramdevnagar","ISRO","Star Bazaar","Jodhpur Cross Roads","Shivranjani","Jhansi Ki Rani","Nehrunagar","Manekbaug",
            "Dharnidhar Derasar","Anjali (Vasna)","Chandranagar","Khodiyarnagar","Danilimda Cross Roads","Vaikunthdham Mandir","Swaminarayan College",
            "Jawahar Chowk","Kankaria Lake","Rambaug","Maninagar Char Rasta","Maninagar","Swaminarayan College","Bhairavnath","Mira Cinema Char Rasta"};

    String[] r11= {
            "Maninagar","Swaminarayan College", "Jawahar Chowk", "Bhairavnath", "Mira Cinema Char Rasta", "Vaikunthdham Mandir",
            "Danilimda Cross Roads","Khodiyarnagar","Chandranagar", "Anjali", "Dharnidhar Derasar","Manekbaug", "Nehrunagar",
            "Jhansi Ki Rani", "Shivranjani","Jodhpur Cross Roads","Star Bazaar","ISRO","Ramdevnagar","ISKCON Cross Roads",
            "Big Bazzar","Ashoka Vatika","Jayantilal Park","Swagat Bungalow", " Ambli Gam","Bopal Approach"};



    ListView lv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routes);
        lv=(ListView)findViewById(R.id.lvName);

        android.support.v7.app.ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#003399")));



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        int str1=getIntent().getExtras().getInt("ABC");

        Log.d("Routes", "Abhin Check:" + str1);

        if(str1==0) {
            ArrayAdapter<CharSequence> adapter;
            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, r1);
            lv.setAdapter(adapter);
        }

        else if(str1==1) {
            ArrayAdapter<CharSequence> adapter;
            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, r2);
            lv.setAdapter(adapter);
        }

        else if(str1==2) {
            ArrayAdapter<CharSequence> adapter;
            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, r3);
            lv.setAdapter(adapter);
        }

        else if(str1==3) {
            ArrayAdapter<CharSequence> adapter;
            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, r4);
            lv.setAdapter(adapter);
        }
        else if(str1==4) {
            ArrayAdapter<CharSequence> adapter;
            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, r5);
            lv.setAdapter(adapter);
        }
        else if(str1==5) {
            ArrayAdapter<CharSequence> adapter;
            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, r6);
            lv.setAdapter(adapter);
        }
        else if(str1==6) {
            ArrayAdapter<CharSequence> adapter;
            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, r7);
            lv.setAdapter(adapter);
        }
        else if(str1==7) {
            ArrayAdapter<CharSequence> adapter;
            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, r8);
            lv.setAdapter(adapter);
        }
        else if(str1==8) {
            ArrayAdapter<CharSequence> adapter;
            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, r9);
            lv.setAdapter(adapter);
        }
        else if(str1==9) {
            ArrayAdapter<CharSequence> adapter;
            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, r10);
            lv.setAdapter(adapter);
        }
        else if(str1==10) {
            ArrayAdapter<CharSequence> adapter;
            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, r11);
            lv.setAdapter(adapter);
        }


    }



}
