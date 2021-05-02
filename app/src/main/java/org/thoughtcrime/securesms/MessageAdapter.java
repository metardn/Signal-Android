package org.thoughtcrime.securesms;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.HashMap;
import java.util.List;

// New class for listView Adapter - Meta Arda Nabila
public class MessageAdapter extends ArrayAdapter<pinned_message_list>{
    Context context;
    int textViewResourceId;
    HashMap<pinned_message_list, Integer> hashMap = new HashMap<pinned_message_list, Integer>();

    public MessageAdapter(@NonNull Context context, int textViewResourceId,
                          List<pinned_message_list> message) {
        super(context, textViewResourceId, message);
        this.context = context;
        this.textViewResourceId = textViewResourceId;
        for (int i = 0; i < message.size(); ++i) {
            hashMap.put(message.get(i), i);
        }
    }

    @Override
    public long getItemId(int position) {
        pinned_message_list item = getItem(position);
        return hashMap.get(item);
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public void add(pinned_message_list message) {
        hashMap.put(message, hashMap.size());
        this.notifyDataSetChanged();
    }
}
