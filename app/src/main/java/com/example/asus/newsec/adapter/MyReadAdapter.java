package com.example.asus.newsec.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.newsec.R;
import com.example.asus.newsec.bin.ReadTypeOne;
import com.example.asus.newsec.bin.ReadTypeTwo;
import com.example.asus.newsec.bin.Type;

import java.util.List;

/**
 * Created by Asus on 2016/4/19.
 */
public class MyReadAdapter extends BaseAdapter {
    private List<Type>  list;
    private Context mContext;
    public static final int FIRSTTYPE=0;
    public static final int SECENDTYPE=1;

    public MyReadAdapter(List<Type> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolderOne viewHolderOne=null;
        ViewHolderTwo viewHolderTwo=null;
        int type=list.get(position).getType();
        if(convertView==null){
            viewHolderOne=new ViewHolderOne();
            viewHolderTwo=new ViewHolderTwo();
            switch(type){
                case FIRSTTYPE:
                    convertView= LayoutInflater.from(mContext).inflate(R.layout.readlist_style1,null);
                    viewHolderOne.image=(ImageView)convertView.findViewById(R.id.read_image1);
                    viewHolderOne.text_title=(TextView)convertView.findViewById(R.id.read_textview1_1);
                    viewHolderOne.text_adress=(TextView)convertView.findViewById(R.id.read_textview1_2);
                    convertView.setTag(viewHolderOne);
                    break;
                case SECENDTYPE:
                    convertView=LayoutInflater.from(mContext).inflate(R.layout.readlist_style2,null);
                    viewHolderTwo.image1=(ImageView)convertView.findViewById(R.id.read_image2_1);
                    viewHolderTwo.image2=(ImageView)convertView.findViewById(R.id.read_image2_2);
                    viewHolderTwo.image3=(ImageView)convertView.findViewById(R.id.read_image2_3);
                    viewHolderTwo.text_title=(TextView)convertView.findViewById(R.id.read_text2);
                    convertView.setTag(viewHolderTwo);
                    break;
            }
        }else {
            switch(type){
                case FIRSTTYPE:
                    viewHolderOne= (ViewHolderOne) convertView.getTag();
                    break;
                case SECENDTYPE:
                    viewHolderTwo=(ViewHolderTwo)convertView.getTag();
                    break;

            }
        }
        switch(type){
            case FIRSTTYPE:
                ReadTypeOne readTypeOne= (ReadTypeOne) list.get(position);
                viewHolderOne.image.setImageResource(readTypeOne.getImage());
                viewHolderOne.text_title.setText(readTypeOne.getTitle());
                viewHolderOne.text_adress.setText(readTypeOne.getAdress());
                break;
            case SECENDTYPE:
                ReadTypeTwo readTypeTwo=(ReadTypeTwo)list.get(position);
                viewHolderTwo.image1.setImageResource(readTypeTwo.getImage1());
                viewHolderTwo.image2.setImageResource(readTypeTwo.getImage2());
                viewHolderTwo.image3.setImageResource(readTypeTwo.getImage3());
                viewHolderTwo.text_title.setText(readTypeTwo.getTitleSec());
                break;
        }
        return convertView;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        return list.get(position).getType();
    }
    class ViewHolderOne{
        private ImageView image;
        private TextView text_title;
        private TextView text_adress;
    }
    class ViewHolderTwo{
        private ImageView image1;
        private ImageView image2;
        private ImageView image3;
        private TextView text_title;
    }
}
