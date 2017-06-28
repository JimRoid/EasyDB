package appinfo.com.easyapp.easydblist.screen;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.easyapp.lib.base.fragment.list.BaseList;
import com.easyapp.lib.widget.recyclerView.BaseRecyclerViewAdapter;

import java.util.ArrayList;

import appinfo.com.easyapp.easydblist.BaseValue;
import appinfo.com.easyapp.easydblist.R;
import appinfo.com.easyapp.easydblist.entity.ItemProduct;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by easyapp_jim on 2017/4/25.
 */

public class ListSample extends BaseList<ListSample.ViewHolder, ItemProduct.DataBean.ContentBean> {

    @Override
    protected void init() {
        setFabVisibleHide(true);
        onRefresh();
    }

    @Override
    protected void onLoadMore() {
        setIsNoMore(true);
        ArrayList<ItemProduct.DataBean.ContentBean> arrayList = ItemProduct.DataBean.ContentBean.getAllList(getContext());
        addAll(arrayList);
    }

    @Override
    protected ViewHolder getItemHolder(View view) {
        return new ViewHolder(view);
    }

    @Override
    protected void getBindViewHolder(ViewHolder viewHolder, final ItemProduct.DataBean.ContentBean contentBean) {
        Glide.with(getContext()).load(contentBean.getS_pic()).into(viewHolder.ivPicture);

        viewHolder.tvTitle.setText(contentBean.getName());

        int value = contentBean.getCoin_demand() - contentBean.getCoin_total();
        viewHolder.tvSubTitle.setText(BaseValue.getRedCoins("剩餘", value, "/總需" + contentBean.getCoin_demand() + "金幣"));
        viewHolder.tvCount.setText(BaseValue.getRedCoins("", contentBean.getCount()));

        viewHolder.ivRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contentBean.delete(getContext());
                showToast("移除");
                onRefresh();
//                checkShopCar();
            }
        });

        viewHolder.ivMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contentBean.getCount() > 1) {
                    contentBean.setCount(contentBean.getCount() - 1);
                    contentBean.update(getContext());
                    getAdapter().notifyDataSetChanged();
//                    ComputeCount();
                }
            }
        });

        viewHolder.ivAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contentBean.setCount(contentBean.getCount() + 1);
                contentBean.update(getContext());
                getAdapter().notifyDataSetChanged();
//                ComputeCount();
            }
        });
    }

    @Override
    protected int setGridLayoutSpanCount() {
        return 1;
    }

    @Override
    protected int getRecycleViewHolderLayout() {
        return R.layout.item_wish;
    }

    static class ViewHolder extends BaseRecyclerViewAdapter.ItemHolder {
        @BindView(R.id.iv_picture)
        ImageView ivPicture;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_sub_title)
        TextView tvSubTitle;
        @BindView(R.id.iv_minus)
        ImageView ivMinus;
        @BindView(R.id.tv_count)
        TextView tvCount;
        @BindView(R.id.iv_add)
        ImageView ivAdd;
        @BindView(R.id.iv_remove)
        ImageView ivRemove;
        @BindView(R.id.content)
        LinearLayout content;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}

