package org.thoughtcrime.securesms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.thoughtcrime.securesms.conversation.ConversationFragment;

import java.util.ArrayList;
import java.util.List;

// New class to display pinned message - Meta Arda Nabila
public class ShowPinnedMessage extends AppCompatActivity {
    private Toolbar                  back_page;
    private List                     messageList        = new ArrayList<pinned_message_list>();
    private MessageAdapter           adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_pinned_message);
        ListView                 listPinnedMessage;

        //back page
        back_page = findViewById(R.id.back_page);
        back_page.setNavigationOnClickListener(unused -> onBackPressed());

        //listView
        listPinnedMessage = findViewById(R.id.listPinnedMessaege);

        messageList = ConversationFragment.getListPinnedMessage();

        adapter = new MessageAdapter(this, android.R.layout.simple_list_item_1, messageList);
        listPinnedMessage.setAdapter(adapter);
    }

}