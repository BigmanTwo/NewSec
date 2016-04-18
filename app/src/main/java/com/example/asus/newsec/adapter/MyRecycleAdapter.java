package com.example.asus.newsec.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.newsec.R;
import com.example.asus.newsec.bin.NewsTxt;

import java.util.List;

/**
 * Created by Asus on 2016/4/18.
 */
public class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleAdapter.MyViewHolders> {

    private List<NewsTxt> list;
    private Context mContext;

    public MyRecycleAdapter(List<NewsTxt> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    @Override
    public MyViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.news_style,null);
        MyViewHolders holders=new MyViewHolders(view);
        return holders;
    }

    @Override
    public void onBindViewHolder(MyViewHolders holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.textTitle.setText(list.get(position).getTitle());
        holder.textTime.setText(list.get(position).getTime());
        holder.textAdress.setText(list.get(position).getAdress());
        holder.textContent.setText(list.get(position).getContent());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolders extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textTitle,textTime,textAdress,textContent;
        public MyViewHolders(View itemView) {
            super(itemView);
            imageView= (ImageView) itemView.findViewById(R.id.new_image);
            textTitle=(TextView)itemView.findViewById(R.id.text_title_news);
            textTime=(TextView)itemView.findViewById(R.id.time_news);
            textAdress=(TextView)itemView.findViewById(R.id.news_from);
            textContent=(TextView)itemView.findViewById(R.id.text_content);

        }
}

}
