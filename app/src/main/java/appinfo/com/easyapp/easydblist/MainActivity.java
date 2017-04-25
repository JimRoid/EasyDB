package appinfo.com.easyapp.easydblist;

import android.view.View;

import com.easyapp.lib.base.activity.BaseMainActivity;
import com.easyapp.lib.widget.MenuView;

import appinfo.com.easyapp.easydblist.entity.ItemProduct;
import appinfo.com.easyapp.easydblist.screen.ListSample;

public class MainActivity extends BaseMainActivity {

    @Override
    protected void initial() {
        MenuView menuView = new MenuView();
        menuView.Builder(this);
        menuView.setMenuText("新增");
        menuView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ItemProduct.DataBean.ContentBean contentBean = new ItemProduct.DataBean.ContentBean();
                contentBean.setName("asdf");
                contentBean.setS_pic("https://scontent.cdninstagram.com/hphotos-xpt1/t51.2885-15/s640x640/e35/sh0.08/1168430_1445393992434882_664873294_n.jpg");
                contentBean.save(MainActivity.this);
                showToast("新增成功");
            }
        });
        setRight(menuView.getMenu());

        ReplaceFragment(new ListSample());
    }


}
