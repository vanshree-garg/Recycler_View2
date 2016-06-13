package com.vanshreegarg.recyclerview2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder>{

    private String[] name;
    private String[] desc;
    Context context;
    CheckBox ck;

    public Adapter(String[] name, String[] desc, CheckBox checkBox, Context context) {
        this.name = name;
        this.desc = desc;
        this.ck = checkBox;
        this.context = context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name, variant;
        CheckBox check;

        public MyViewHolder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.textView1);
            variant = (TextView) itemView.findViewById(R.id.textView2);
            check = (CheckBox) itemView.findViewById(R.id.checkBox);
        }
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row, parent, false);
        MyViewHolder holder = new MyViewHolder(view2);
        return holder;
    }

    // Data is bound to Views
    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {

        holder.name.setText(name[position]);
        holder.variant.setText(desc[position]);

       // holder.check.setOnCheckedChangeListener(null);

       // holder.check.setChecked(ck.isSelected());

        holder.check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    Log.d("ABC", "XYQ");
                    Toast.makeText(context, "Checked", Toast.LENGTH_SHORT).show();
                }

                else {
                    Toast.makeText(context, "Un-checked", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}