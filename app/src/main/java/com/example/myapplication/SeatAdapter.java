package com.example.myapplication;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

import com.bumptech.glide.Glide;
import com.example.myapplication.model.entity.SeatInfo;

import java.util.ArrayList;
import java.util.List;

public class SeatAdapter extends BaseAdapter
{
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private List<SeatInfo> mData = new ArrayList<>();

    public SeatAdapter(List<SeatInfo> mData, Context context)
    {
        this.mData = mData;
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount()
    {
        return mData.size();
    }

    @Override
    public Object getItem(int position)
    {
        return mData.get(position);
    }

    @Override
    public long getItemId(int i)
    {
        return i;
    }

    static class ViewHolder
    {
        public ImageView imageView;
        public TextView textView;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup)
    {
        ViewHolder holder = null;
        if (view == null)
        {
            view = mLayoutInflater.inflate(R.layout.seat_item, null);
            holder = new ViewHolder();
            holder.imageView = view.findViewById(R.id.iv_grid);
            holder.textView = view.findViewById(R.id.iv_title);
            view.setTag(holder);
        }
        else
            holder = (ViewHolder) view.getTag();

        holder.textView.setText("Seat");
        if (mData.get(position).isTaken_or_not()==true){
            // 不能点的图片
            Glide.with(mContext).load("http://tiebapic.baidu.com/forum/pic/item/dd6f314e251f95ca1d702cd3de177f3e660952b7.jpg").into(holder.imageView);

        }
        else {
            Glide.with(mContext).load("http://tiebapic.baidu.com/forum/pic/item/e9a97dd98d1001e9b6b8aa6aaf0e7bec55e797b0.jpg").into(holder.imageView);
            holder.imageView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    final String[] array3 = new String[]{"Adult Ticket","Older Ticket", "Child Ticket"};
                    AlertDialog.Builder builder3 = new AlertDialog.Builder(mContext);
                    builder3.setTitle("Select ticket type").setSingleChoiceItems(array3, 0, new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i)
                        {
                            ToastUtil.showMsg(mContext, array3[i]);
                            dialogInterface.dismiss();
                            Intent intent = new Intent(mContext,PayActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putInt("Screening_id",mData.get(position).getScreening_id());
                            bundle.putInt("Seat_id",mData.get(position).getSeat_id());
                            bundle.putInt("Type",i);
                            intent.putExtras(bundle);
                            mContext.startActivity(intent);
                        }
                    }).setCancelable(true).show();
//                    Toast.makeText(mContext, "您选择了第" + position + "个座位.", Toast.LENGTH_SHORT).show();

                }
            });
        }

        return view;
    }
}
