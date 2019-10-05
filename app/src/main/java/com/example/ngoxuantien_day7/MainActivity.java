package com.example.ngoxuantien_day7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
 Button button1,button2;
 ListView listView;
 RecyclerView recyclerView;
 List<Contact> contactList;
 AdapterContact adapterContact;
 ArrayList<ContactABC> contactABCS=new ArrayList<>();
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.bottom1);
        button2=findViewById(R.id.bottom2);
        listView=findViewById(R.id.listview);
        recyclerView=findViewById(R.id.recyclerview);
        contactList = new ArrayList<>();
        preferences = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        editor = preferences.edit();
        Contact contact1 = new Contact("tien", 5);
        Contact contact2 = new Contact("tien2", 5);
        Contact contact3 = new Contact("tien3", 5);
        Contact contact4 = new Contact("tien4", 5);
        Contact contact5 = new Contact("tien5", 5);
        Contact contact6 = new Contact("tien6", 5);

        contactList.add(contact1);
        contactList.add(contact2);
        contactList.add(contact3);
        contactList.add(contact4);
        contactList.add(contact5);
        contactList.add(contact6);
       ContactABC contact_tien_1 = new ContactABC("trống","tien");
        ContactABC contact_tien_2 = new ContactABC("trống","tien");
        ContactABC contact_tien_3 = new ContactABC("trống","tien");
        ContactABC contact_tien_4 = new ContactABC("trống","tien");
        ContactABC contact_tien_5 = new ContactABC("trống","tien");
        ContactABC contact_tien_6 = new ContactABC("trống","tien");
        contactABCS.add(contact_tien_1);
        contactABCS.add(contact_tien_2);
        contactABCS.add(contact_tien_3);
        contactABCS.add(contact_tien_4);
        contactABCS.add(contact_tien_5);
        contactABCS.add(contact_tien_6);




        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getBaseContext(), 1, RecyclerView.VERTICAL, false);

        adapterContact = new AdapterContact(contactList);

button1.setOnClickListener(new View.OnClickListener() {





    @Override
    public void onClick(View v) {
editor.putString("tienha1","hoa hngfg");
editor.apply();



    }
});
//button2.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//
//    }
//});

        String d=preferences.getString("tienha1","tien");
        if (d.toString().equals("hoa hngfg")){
            CustomAdapter customAdapter = new CustomAdapter(this, R.layout.item_listview, contactABCS);
            listView.setAdapter(customAdapter);
        }






adapterContact.setIonClickContact(new IonClickContact() {
    @Override
    public void onClickName(String name) {
        Toast.makeText(getBaseContext(),name,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClickPhone(int phone) {
        Toast.makeText(getBaseContext(),phone,Toast.LENGTH_SHORT).show();
    }
});
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(adapterContact);
    }
}
