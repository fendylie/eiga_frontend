package com.example.eiga_frontend.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.recyclerview.widget.RecyclerView;

import com.example.eiga_frontend.R;
import com.example.eiga_frontend.model.ModelTrailer;

import java.util.List;



public class TrailerAdapter extends RecyclerView.Adapter<TrailerAdapter.ViewHolder> {

    private List<ModelTrailer> items;
    private Context mContext;

    public TrailerAdapter(Context context, List<ModelTrailer> items) {
        this.mContext = context;
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_trailer, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ModelTrailer data = items.get(position);

        holder.btnTrailer.setText(data.getType());
        holder.btnTrailer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=" + data.getKey()));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    //Class Holder
    class ViewHolder extends RecyclerView.ViewHolder {

        public Button btnTrailer;

        public ViewHolder(View itemView) {
            super(itemView);
            btnTrailer = itemView.findViewById(R.id.btnTrailer);
        }
    }

}
