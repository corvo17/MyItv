package dars17.corvo.example.com.myitv.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import dars17.corvo.example.com.myitv.R;
import dars17.corvo.example.com.myitv.activities.single_page_activity.SInglePageActivity;
import dars17.corvo.example.com.myitv.pojos.all_movies.MoviesItem;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private Context mContext;
    private ArrayList<MoviesItem> list;

    public RecyclerAdapter(ArrayList<MoviesItem> list, Context context) {
        this.list = list;
        this.mContext = context;
    }

    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.recycer_item, parent, false);
        return new RecyclerAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerAdapter.MyViewHolder holder, final int position) {
        Glide.with(mContext).load(list.get(position).getFiles().getPosterUrl()).into(holder.img);
        holder.name.setText(list.get(position).getTitle());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, SInglePageActivity.class);
                intent.putExtra("movie",list.get(position));
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView name;
        CardView cardView;

        MyViewHolder(View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.name);
            cardView = itemView.findViewById(R.id.cardView);

        }
    }


}