package com.app.mapandroom.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.mapandroom.R;
import com.app.mapandroom.database.Location;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder> {

    private static final String TAG = HistoryAdapter.class.getSimpleName();
    private Context context;
    private List<Location> historyList;

    public HistoryAdapter(Context context, List<Location> historyList) {
        this.context = context;
        this.historyList = historyList;
    }

    @NonNull
    @Override
    public HistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_history_list
                , parent, false);
        return new HistoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final HistoryViewHolder holder, final int position) {
        holder.txtAddress.setText(historyList.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return historyList.size();
    }

    public static class HistoryViewHolder extends RecyclerView.ViewHolder {
        private TextView txtAddress;

        public HistoryViewHolder(View itemView) {
            super(itemView);
            txtAddress = itemView.findViewById(R.id.txtAddress);
        }
    }
}
