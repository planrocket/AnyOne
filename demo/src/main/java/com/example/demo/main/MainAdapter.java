package com.example.demo.main;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.demo.R;
import com.xin.commonfunc.base.adapter.BaseRVAdapter;

import java.util.List;

public class MainAdapter extends BaseRVAdapter<MainFuncBean, MainAdapter.MainContentViewHolder> {


    public MainAdapter(Context context, List<MainFuncBean> list) {
        super(context, list);
    }

    @NonNull
    @Override
    public MainContentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.main_list_item, viewGroup, false);
        return new MainContentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainContentViewHolder mainContentViewHolder, int position) {
        final MainFuncBean data = mList.get(position);
        mainContentViewHolder.tv_title.setText(data.getTitle());
        mainContentViewHolder.tv_target.setText(data.getTargetActivity().getSimpleName());
        mainContentViewHolder.tv_description.setText(data.getDescription());
        mainContentViewHolder.ll_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext, data.getTargetActivity()));
            }
        });
    }


    public static class MainContentViewHolder extends RecyclerView.ViewHolder {

        LinearLayout ll_content;
        TextView tv_title;
        TextView tv_target;
        TextView tv_description;

        public MainContentViewHolder(@NonNull View itemView) {
            super(itemView);
            ll_content = itemView.findViewById(R.id.ll_content);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_target = itemView.findViewById(R.id.tv_target);
            tv_description = itemView.findViewById(R.id.tv_description);
        }
    }
}
