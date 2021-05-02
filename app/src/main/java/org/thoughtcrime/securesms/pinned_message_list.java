package org.thoughtcrime.securesms;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

// Object baru yang akan diterima adapter - Meta Arda Nabila
public class pinned_message_list extends AppCompatActivity {
    String message;

    public pinned_message_list(){
    }

    public pinned_message_list(String message){
        this.message = message;
    }

    public String getPinned_message_list(){
        return message;
    }

    public void setPinned_message_list(String message){
        this.message = message;
    }

    public String toString(){
        return getPinned_message_list();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pinned_message_list);
    }
}