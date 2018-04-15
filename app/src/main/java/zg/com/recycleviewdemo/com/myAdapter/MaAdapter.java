package zg.com.recycleviewdemo.com.myAdapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import zg.com.recycleviewdemo.R;

/**
 * Created by ZG on 2018/4/15.
 */

public class MaAdapter extends RecyclerView.Adapter<MaAdapter.MyHolderView>{
    List<String> list = new ArrayList<>();
    public MaAdapter(List<String> list){
        this.list=list;
    }
    @Override
    public MyHolderView onCreateViewHolder(ViewGroup parent,int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        MyHolderView holderView = new MyHolderView(view);
        return holderView;
    }
    @Override
    public void onBindViewHolder(final MyHolderView holder,final int position){
        String text = list.get(position);
        holder.textShow.setText(text);
        View itemView = holder.itemView;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyHolderView extends RecyclerView.ViewHolder{
        TextView textShow;
        public MyHolderView(View itemView){
            super(itemView);
            textShow = itemView.findViewById(R.id.textShow);
        }

    }
}
