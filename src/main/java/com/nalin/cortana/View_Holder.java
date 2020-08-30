package com.tushar.cortana;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

public class View_Holder extends RecyclerView.ViewHolder {

    ImageView imageView;

    View_Holder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
    }
}
