package com.vanshreegarg.recyclerview2;

import android.widget.CheckBox;

public class Items {

    String[] names, description;
    CheckBox checkBox;

    public Items(String[] name, String[] description) {
        this.names = name;
        this.description = description;
      //  this.checkBox = checkBox;
    }

    public String[] getName() {
        return names;
    }

    public void setName(String[] name) {
        this.names = name;
    }

    public String[] getDescription() {
        return description;
    }

    public void setDescription(String[] description) {
        this.description = description;
    }

    public CheckBox getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(CheckBox checkBox) {
        this.checkBox = checkBox;
    }
}