package com.kohb.firebaseauth;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder{

    TextView textViewMessage;
    TextView textViewAutor;
    TextView textViewTime;

    public ViewHolder(View itemView) {
        super(itemView);
        textViewMessage = itemView.findViewById(R.id.message_text);
        textViewAutor = itemView.findViewById(R.id.autor_text);
        textViewTime = itemView.findViewById(R.id.time_text);
    }
}
