package com.example.savandoshi.brtsapp;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Fare extends AppCompatActivity {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fare);

        android.support.v7.app.ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#003399")));



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES);
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.atvFrom);
        textView.setAdapter(adapter);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES);
        AutoCompleteTextView textView1 = (AutoCompleteTextView)
                findViewById(R.id.atvTo);
        textView1.setAdapter(adapter1);


        b=(Button) findViewById(R.id.bSearch);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText from = (EditText) findViewById(R.id.atvFrom);
                EditText to = (EditText) findViewById(R.id.atvTo);
                String tempfrom = from.getText().toString();
                String tempto = to.getText().toString();
                int i,j,j1=0,j2=0;
                int count1=0,count2=0;

                for(i=0;i<11;i++)
                {
                    for(j=0;j<Routes[i].length;j++)
                    {
                        if(tempfrom.equals(Routes[i][j]))
                        {
                            count1++;
                            j1=j;
                        }
                        if(tempto.equals(Routes[i][j]))
                        {
                            count2++;
                            j2=j;
                        }
                    }

                    if(j1!=0 && j2!=0)
                    {
                        break;
                    }
                }

                TextView tv=(TextView) findViewById(R.id.tvFare);

                switch(Math.abs(j1-j2))
                {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                        tv.setText("The fare is Rs. 4");
                        break;
                    case 4:
                        tv.setText("The fare is Rs. 7");
                        break;
                    case 5:
                    case 6:
                        tv.setText("The fare is Rs. 8");
                        break;
                    case 7:
                    case 8:
                    case 9:
                        tv.setText("The fare is Rs. 10");
                        break;
                    case 10:
                    case 11:
                        tv.setText("The fare is Rs. 12");
                        break;
                    case 12:
                        tv.setText("The fare is Rs. 14");
                        break;
                    case 13:
                    case 14:
                    case 15:
                        tv.setText("The fare is Rs. 15");
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        tv.setText("The fare is Rs. 19");
                        break;
                    case 20:
                    case 21:
                        tv.setText("The fare is Rs. 20");
                        break;
                    case 22:
                    case 23:
                    case 24:
                        tv.setText("The fare is Rs. 24");
                        break;
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        tv.setText("The fare is Rs. 26");
                        break;
                    case 29:
                        tv.setText("The fare is Rs. 28");
                        break;
                    case 30:
                        tv.setText("The fare is Rs. 30");
                        break;
                    default:
                        tv.setText("The fare is Rs. 32");
                        break;
                }


            }
        });
    }

    private static final String[] COUNTRIES = new String[]
            {"RTO Circle", "Ranip", "Bhavsar Hostel", "Akhbarnagar", "Pragatinagar", "Shastrinagar", "Jay mangal", "Sola Cross Roads",
                    "Valinath Chowk", "Memnagar", "Gujarat University", "Andhjan Mandal(IIM)", "Himmatlal Park", "Shivranjani",
                    "Jhansi Ki Rani", "Nehrunagar", "Manekbaug", "Dharnidhar Derasar", "Anjali", "Chandranagar", "Khodiyarnagar",
                    "Danilimda Cross Roads", "Vaikunthdham Mandir", "Swaminarayan College", "Jawahar Chowk", "Kankaria Lake", "Rambaug",
                    "Maninagar Char Rasta", "Maninagar", "Vasna", "Danilimda Road", "Chhipa Society", "Chandola Lake", "BRTS Workshop",
                    "Kashiram Textiles", "Narol", "Mukesh Industries", "Isanpur", "Ghodasar", "Jashodanagar Cross Roads",
                    "Express Highway Junction", "CTM Cross Roads", "Purvdeep Society", "Jogeshwari Society", "Rabari Colony", "Ramrajya Nagar",
                    "Rameshwar Park", "Geeta Gauri Cinemas", "Soni ni Chali", "Viratnagar", "Bapunagar Approach", "Lilanagar", "Thakkarnagar Approach", "Hiravadi", "Vijay Park", "Krishna Nagar", "Dhanush Dhari Mandir", "Naroda ST Workshop", "Naroda Gam",
                    "N.R.Patel Park", "Rampir no Tekro", "Juna Vadaj", "Gurudwara", "Hanumanpura", "Delhi Darwaja", "Ghuma", "Ghuma Gam",
                    "Bopal", "Bopal Approach", " Ambli Gam", "Swagat Bungalow", "Jayantilal Park", "Ashok Vatika", "Anthariksh Colony",
                    "ISKCON Mandir", "ISKCON Cross Roads", "Ramdevnagar", "ISRO", "Star Bazaar", "Jodhpur Cross Roads", "Ajit Mill",
                    "Grid Station", "Odhav Fire Station", "Vallabh Nagar", "Chhotalal Ni Chali", "Odhav Talav(Gam)", "Bhuyangdev",
                    "Parshwanath Jain Mandir", "Sattadhar", "Sola Bridge", "Science City Approach", "Zundal Circle", "Shiva Shakti Nagar",
                    "Janta Nagar", "Avani Bhavan", "Motera Cross Roads", "Sabarmati Police Station", "Sabarmati Municipal Swimming Pool",
                    "Rathi Apartment", "Sabarmati Power House", "Sarangpur Darwaja", "Karnamukteshwar Mahadev", "Raipur Darwaja",
                    "Astodiya Darwaja", "Astodiya Chakla", "Municipal Corporation Office", "Raikhad Cross Roads", "Lokmanya Tilak Bridge",
                    "Town Hall", "G.C.S.Hospital", "Arvind Mill", "Geening Press", "Naroda Fruit Market", "Memco Cross Roads",
                    "Municipal Corporation North Zone Office", "L Colony", "Panjrapol Cross Roads", "Gulbai Tekra Approach", "L.D. Engineering College",
                    "Town Hall","Naroda"
            };

    private static final String[][] Routes=
            {
                    {
                            "RTO Circle", "Ranip", "Bhavsar Hostel", "Akhbarnagar", "Pragatinagar", "Shastrinagar", "Jay mangal", "Sola Cross Roads",
                            "Valinath Chowk", "Memnagar", "Gujarat University", "Andhjan Mandal(IIM)", "Himmatlal Park", "Shivranjani",
                            "Jhansi Ki Rani", "Nehrunagar", "Manekbaug", "Dharnidhar Derasar", "Anjali", "Chandranagar", "Khodiyarnagar",
                            "Danilimda Cross Roads", "Vaikunthdham Mandir", "Swaminarayan College", "Jawahar Chowk", "Kankaria Lake", "Rambaug",
                            "Maninagar Char Rasta", "Maninagar"},

                    {
                            "Anjali","Chandranagar", "Khodiyarnagar", "Danilimda Cross Roads", "Danilimda Road",
                            "Chhipa Society", "Chandola Lake", "BRTS Workshop", "Kashiram Textiles", "Narol", "Mukesh Industries", "Isanpur", "Ghodasar", "Jashodanagar Cross Roads",
                            "Express Highway", "CTM Cross Roads", "Purvdeep Society", "Jogeshwari Society", "Rabari Colony", "Ramrajya Nagar", "Rameshwar Park",
                            "Geeta Gauri Cinema", "Soni Ni Chali", "Viratnagar", "Bapunagar Approach", "Lilanagar", "Thakkarnagar Approach", "Hiravadi", "Vijay Park",
                            "Krishna Nagar", "Dhanush Dhari Mandir", "Naroda ST Workshop", "Bethak", "Naroda Gam"
                    },

                    {      "RTO Circle","Ranip","Bhavsar Hostel","Akhbarnagar","Pragatinagar","Shastrinagar","Jaymangal","Sola Cross Roads","Valinath Chowk",
                            "Memnagar","(Gujarat) University","Andhjan Mandal (IIM)","Himmatlal Park","Shivranjani","Jhansi Ki Rani","Nehrunagar",
                            "Manekbaug","Dharnidhar Derasar","Anjali (Vasna)","Chandranagar","Khodiyarnagar","Danilimda Cross Roads","Danilimda Road",
                            "Chhipa Society","Chandola Lake","BRTS Workshop","Kashiram Textiles","Narol","Mukesh Industries","Isanpur","Ghodasar",
                            "Jashodanagar Cross Roads","(Ahmedabad-Vadodara) Express Highway Junction","CTM Cross Roads","Purvdeep Society",
                            "Jogeshwari Society","Rabari Colony","Ramrajya Nagar","Rameshwar Park","Geeta Gauri Cinema","Soni Ni Chali",
                            "Viratnagar","Bapunagar Approach","Lilanagar","Thakkarnagar Approach","Hiravadi","Vijay Park","Krishna Nagar",
                            "Dhanush Dhari Mandir","Naroda"},

                    {
                            "RTO Circle", "Ranip", "N.R. Patel Park", "Ramapir No Tekro", "Juna Vadaj", "Gurudwara", "Hanumanpura",
                            "Sarkari Litho Press (Delhi Darwaja)"
                    },

                    {   "Visat Gandhinagar Junction","Motera Cross Roads","Sabarmati Police Station","Sabarmati Municipal Swimming Pool","Rathi Apartment",
                            "Sabarmati Power House","RTO Circle","Ranip","Bhavsar Hostel","Akhbarnagar","Pragatinagar","Shastrinagar","Jaymangal","Sola Cross Roads",
                            "Valinath Chowk","Memnagar","(Gujarat) University","Andhjan Mandal (IIM)","Himmatlal Park","Shivranjani","Jhansi Ki Rani","Nehrunagar","Manekbaug",
                            "Dharnidhar Derasar","Anjali (Vasna)","Chandranagar","Khodiyarnagar","Danilimda Cross Roads","Vaikunthdham Mandir","Swaminarayan College","Jawahar Chowk",
                            "Kankaria Lake","Rambaug","Maninagar Char Rasta","Maninagar","Swaminarayan College","Bhairavnath","Mira Cinema Char Rasta"
                    },

                    {   "RTO Circle","Ranip","Nava Vadaj","Ramapir No Tekro","Juna Vadaj","Gurudwara","Hanumanpura","Sarkari Litho Press","Kalupur Railway Station",
                            "Sarangpur Darwaja","Karnamukteshwar Mahadev","Raipur Darwaja","Astodiya Darwaja","Municipal Corporation Office","Raikhad Cross Roads",
                            "Lokmanya Tilak Bag","Town Hall"
                    },

                    {  "Anjali","Chandranagar","Khodiyarnagar","Danilimda Cross Roads","Vaikunthdham Mandir","Swaminarayan College",
                            "Raipur Darwaja","Karnamukteshwar Mahadev","Sarangpur Darwaja","Kalupur Railway Station"
                    },

                    {  "Sarkari Litho Press","Hanumanpura","Gurudwara","Juna Vadaj","Ramapir No Tekro","Nava Vadaj","Bhavsar Hostel","Akhbarnagar",
                            "Pragatinagar","Shastrinagar","Jaymangal","Parasnagar","Parshwanath Jain Mandir","Bhuyangdev","Sattadhar","Sola Bridge",
                            "Science City Approach"
                    },

                    {  "Ajit Mill","Soni Ni Chali","Grid Station","Odhav Fire Station","Vallabh Nagar","Chhotalal Ni Chali","Morlidhar Society",
                            "Odhav Talav (Gam)","S P Ring Road"
                    },

                    {  "ISKCON Cross Roads","Ramdevnagar","ISRO","Star Bazaar","Jodhpur Cross Roads","Shivranjani","Jhansi Ki Rani","Nehrunagar","Manekbaug",
                            "Dharnidhar Derasar","Anjali (Vasna)","Chandranagar","Khodiyarnagar","Danilimda Cross Roads","Vaikunthdham Mandir","Swaminarayan College",
                            "Jawahar Chowk","Kankaria Lake","Rambaug","Maninagar Char Rasta","Maninagar","Swaminarayan College","Bhairavnath","Mira Cinema Char Rasta"
                    },


                    {
                            "Maninagar","Swaminarayan College", "Jawahar Chowk", "Bhairavnath", "Mira Cinema Char Rasta", "Vaikunthdham Mandir",
                            "Danilimda Cross Roads","Khodiyarnagar","Chandranagar", "Anjali", "Dharnidhar Derasar","Manekbaug", "Nehrunagar",
                            "Jhansi Ki Rani", "Shivranjani","Jodhpur Cross Roads","Star Bazaar","ISRO","Ramdevnagar","ISKCON Cross Roads",
                            "Big Bazzar","Ashoka Vatika","Jayantilal Park","Swagat Bungalow", " Ambli Gam","Bopal Approach"
                    }

            };

}
