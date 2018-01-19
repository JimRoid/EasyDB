package appinfo.com.easyapp.easydblist;

import android.view.View;

import com.easyapp.lib.base.activity.BaseMainActivity;
import com.easyapp.lib.widget.MenuView;
import com.orhanobut.logger.Logger;

import appinfo.com.easyapp.easydblist.entity.ItemProduct;
import appinfo.com.easyapp.easydblist.entity.UserData;
import appinfo.com.easyapp.easydblist.screen.ListSample;

public class MainActivity extends BaseMainActivity {

    @Override
    protected void initial() {
//        UserData userData = new UserData();
//        userData.setRc("rec");
//        userData.setReason("asdfa");
//        userData.save(MainActivity.this);
        ReplaceFragment(new ListSample());
    }


}
