package com.example.myapplication.tuan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class T31Adapter extends BaseAdapter {
    private ArrayList<T31Contact> ls;
    private Context context;

    public T31Adapter(ArrayList<T31Contact> ls, Context context) {
        this.ls = ls;
        this.context= context;
    }

    @Override
    public int getCount() {
        return ls.size();
    }

    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewAX vax;
        if(convertView==null) {
            vax=new ViewAX();
            convertView= LayoutInflater.from(context).inflate(R.layout.tuan31_listview_item,null);
             vax.img_hinh=convertView.findViewById(R.id.t31ItemHinh);
             vax.tv_ten=convertView.findViewById(R.id.t31ItemTen);
             vax.tv_tuoi=convertView.findViewById(R.id.t31ItemTuoi);

             convertView.setTag(vax);
        }
        else {
            vax=(ViewAX) convertView.getTag();
        }
        vax.img_hinh.setImageResource(ls.get(position).getHinh());
        vax.tv_ten.setText(ls.get(position).getTen());
        vax.tv_tuoi.setText(ls.get(position).getTuoi());
        return convertView;
    }
    class ViewDN img_hinh;
    TextView tv_ten, tv_tuoi;
    }
}
