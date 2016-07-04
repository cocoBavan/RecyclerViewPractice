package com.ariyalion.recyclerviewpractise;

import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/**
 * Created by bavan on 14/06/16.
 */
public final class LoadingViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        FrameLayout frameLayout =
                (FrameLayout) LayoutInflater.from(
                        parent.getContext()).inflate(
                        R.layout.recyclerview_loadingview, new FrameLayout(parent.getContext()), false);

        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.gravity = Gravity.CENTER;
        lp.setMargins(0, 0, 0, 0);
        frameLayout.setLayoutParams(lp);
        return new RecyclerView.ViewHolder(frameLayout) {
        };
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

}

