package cn.com.tianyudg.databindingdemo.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import cn.com.tianyudg.databindingdemo.BR;
import cn.com.tianyudg.databindingdemo.R;
import cn.com.tianyudg.databindingdemo.bean.User;
import cn.com.tianyudg.databindingdemo.databinding.ItemRvBinding;

/**
 * Author : WaterFlower.
 * Created on 2017/9/20.
 * Desc :
 */

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.RvViewHolder> {

    private List<User> data = new ArrayList<>();
    private Context context;


    public RvAdapter(Context context) {
        this.context = context;

        for (int i = 0; i < 30; i++) {
            data.add(new User("test", "" + i));
        }
    }

    @Override
    public RvViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemRvBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_rv, parent, false);
        RvViewHolder holder = new RvViewHolder(binding.getRoot());
        holder.setBinding(binding);
        return holder;
    }

    @Override
    public void onBindViewHolder(RvViewHolder holder, int position) {
//        binding.setUser(data == null ? null : data.get(position));
        holder.getBinding().setVariable(BR.user, data.get(position));

    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }


    public static class RvViewHolder extends RecyclerView.ViewHolder {

        private ItemRvBinding binding;

        public ItemRvBinding getBinding() {
            return binding;
        }

        public void setBinding(ItemRvBinding binding) {
            this.binding = binding;
        }

        public RvViewHolder(View itemView) {
            super(itemView);

        }
    }
}
