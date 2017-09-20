package cn.com.tianyudg.databindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import cn.com.tianyudg.databindingdemo.adapter.RvAdapter_II;
import cn.com.tianyudg.databindingdemo.bean.User;
import cn.com.tianyudg.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        setContentView(R.layout.activity_main);
        User user = new User("Test", "user");
        binding.setUser(user);

        binding.rv.setLayoutManager(new LinearLayoutManager(this));
        binding.rv.setAdapter(new RvAdapter_II(this));

    }
}
