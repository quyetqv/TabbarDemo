package com.quyetqv.apps.tabbardemo;

/**
 * Created by quyetqv on 31/03/2017.
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by SONU on 31/08/15.
 */
public abstract class DemoViewHolder extends RecyclerView.ViewHolder {


    public TextView title;


    public DemoViewHolder(View view) {
        super(view);


        this.title = (TextView) view.findViewById(R.id.cardTitle);

    }


}