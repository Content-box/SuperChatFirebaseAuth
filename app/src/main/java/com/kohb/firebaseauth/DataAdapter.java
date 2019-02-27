package com.kohb.firebaseauth;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<ViewHolder> {

    private ArrayList<Message> messages;
    private LayoutInflater inflater;

    public DataAdapter(Context context, ArrayList<Message> messages) {
        this.messages = messages;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_message, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Message message = messages.get(position);

        holder.textViewMessage.setText(message.getText());
        holder.textViewAutor.setText(message.getAutor());
        holder.textViewTime.setText(DateFormat.format("dd-MM-yyyy (HH:mm:ss)", message.getTime()));
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }
}
