package com.xin.commonfunc.base.adapter;

/**
 * Created by tang on 2016/11/23.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * 适用于Recycview的adaper
 */
public abstract class BaseRVAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    private final List<T> mList;
    private final Context mContext;

    public BaseRVAdapter(Context context) {
        this(context, null);
    }

    public BaseRVAdapter(Context context, List<T> list) {
        mContext = context;
        if (list == null) {
            mList = new ArrayList<>();
        } else {
            mList = list;
        }
    }


    @Override
    public int getItemCount() {
        return mList.size();
    }

    /**
     * 获取对应的context
     *
     * @return
     */
    public Context getContext() {
        return mContext;
    }


    /**
     * 在当前集合末尾添加一组元素
     *
     * @return
     */
    public List<T> getData() {
        return mList;
    }


    public void setDataList(List<T> list) {
        mList.clear();
        mList.addAll(list);
        notifyDataSetChanged();
    }


    /**
     * 在当前集合末尾添加一个元素
     *
     * @param itemData
     */
    public void addData(T itemData) {
        if (mList.add(itemData)) {
            notifyItemInserted(mList.size());
        }
    }


    /**
     * 在当前集合指定位置添加 一个元素
     *
     * @param position
     */
    public void addData(int position, T data) {
        if (0 <= position && position < mList.size()) {
            mList.add(position, data);
            notifyItemInserted(position);
        } else {
            throw new ArrayIndexOutOfBoundsException("inserted position most greater than 0 and less than data size");
        }
    }


    /**
     * 在当前集合指定位置添加 一组元素
     */
    public void addData(int position, List<T> data) {
        if (0 <= position && position < mList.size()) {
            mList.addAll(position, data);
            notifyItemRangeInserted(position, data.size());
        } else {
            throw new ArrayIndexOutOfBoundsException("inserted position most greater than 0 and less than data size");
        }
    }


    /**
     * 在当前集合末尾添加 一组元素
     *
     * @param newData
     */
    public void addData(List<T> newData) {
        mList.addAll(newData);
        notifyItemRangeInserted(mList.size() - newData.size() + 1, newData.size());
    }


    /**
     * 移除当前集合指定位置的一个元素
     *
     * @param position
     */
    public void remove(int position) {
        if (mList.size() > 0) {
            mList.remove(position);
            notifyItemRemoved(position);
        }
    }

    /**
     * 清空当前集合
     */
    public void clearList() {
        mList.clear();
        notifyDataSetChanged();
    }


}
