package cn.com.tianyudg.databindingdemo.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import cn.com.tianyudg.databindingdemo.R;
import cn.com.tianyudg.databindingdemo.bean.User;
import cn.com.tianyudg.databindingdemo.databinding.ItemRvBinding;

/**
 * Author : WaterFlower.
 * Created on 2017/9/20.
 * Desc :
 */

public class RvAdapter_II extends RecyclerView.Adapter<RvAdapter_II.RvViewHolder> {

    private List<User> data = new ArrayList<>();
    private Context context;


    public RvAdapter_II(Context context) {
        this.context = context;

        for (int i = 0; i < 30; i++) {
            data.add(new User("test_II", "" + i));
        }
    }

    @Override
    public RvViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_rv, parent, false);
        return new RvViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RvViewHolder holder, int position) {
        holder.setUser(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }


    public static class RvViewHolder extends RecyclerView.ViewHolder {

        public ItemRvBinding binding;

        public RvViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);

        }

        public void setUser(User user) {
            binding.setUser(user);
        }

    }
}
