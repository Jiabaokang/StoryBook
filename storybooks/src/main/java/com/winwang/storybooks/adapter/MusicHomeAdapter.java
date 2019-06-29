package com.winwang.storybooks.adapter;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.winwang.storybooks.R;
import com.winwang.storybooks.entity.MusicHomeBean;

import java.util.List;

/**
 * Created by WinWang on 2019/6/28
 * Description->
 */
public class MusicHomeAdapter extends BaseQuickAdapter<MusicHomeBean.ListBean, BaseViewHolder> {

    public MusicHomeAdapter(int layoutResId, @Nullable List<MusicHomeBean.ListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MusicHomeBean.ListBean item) {
        ImageView cover = (ImageView) helper.getView(R.id.iv_music_home_box);
        Glide.with(mContext).load(item.getTitleimage()).apply(RequestOptions.bitmapTransform(new RoundedCorners(40))).into(cover);
        helper.setText(R.id.tv_music_home_title, item.getName());
        AssetManager mgr = mContext.getAssets();
        Typeface tf = Typeface.createFromAsset(mgr, "fonts/heilizhi.ttf");
        TextView title = (TextView) helper.getView(R.id.tv_music_home_title);
        title.setTypeface(tf);
    }
}
