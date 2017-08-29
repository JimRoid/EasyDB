package appinfo.com.easyapp.easydblist.entity;

import com.easyapp.easydb.SingleModel;

/**
 * Created by easyapp_jim on 2017/8/29.
 */

public class UserData extends SingleModel {

    private String rc;
    private String reason;


    @Override
    public String getSingleKey() {
        return "UserData";
    }

    public String getRc() {
        return rc;
    }

    public void setRc(String rc) {
        this.rc = rc;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
