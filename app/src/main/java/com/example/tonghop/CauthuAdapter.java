package com.example.tonghop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CauthuAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Cauthu> cauthuList;

    public CauthuAdapter(Context context, int layout, List<Cauthu> cauthuList) {
        this.context = context;
        this.layout = layout;
        this.cauthuList = cauthuList;
    }

    @Override
    public int getCount() {
        return cauthuList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private  class ViewHolder{
        ImageView imgHinh, imgCo;
        TextView txtTen, txtMota, txtNoidung;

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(layout, null);
            holder = new ViewHolder();


            holder.txtTen = (TextView) view.findViewById(R.id.textviewTen);
            holder.txtMota = (TextView) view.findViewById(R.id.textviewMota);
            holder.imgHinh = (ImageView) view.findViewById(R.id.imageviewHinh);
            holder.imgCo = (ImageView) view.findViewById(R.id.imageviewCo);
            view.setTag(holder);
        }else{
            holder =(ViewHolder) view.getTag();
        }

        Cauthu cauthu = cauthuList.get(i);

        holder.txtTen.setText(cauthu.getTen());
        holder.txtMota.setText(cauthu.getMota());
        holder.imgHinh.setImageResource(cauthu.getHinh());
        holder.imgCo.setImageResource(cauthu.getCo());

        return view;
    }
}
