package cn.com.tianyudg.databindingdemo.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import cn.com.tianyudg.databindingdemo.BR;

/**
 * Author : WaterFlower.
 * Created on 2017/9/20.
 * Desc :
 */

public class User extends BaseObservable {
    public String firstName;
    public String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}
