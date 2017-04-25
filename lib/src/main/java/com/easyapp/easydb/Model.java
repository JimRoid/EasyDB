package com.easyapp.easydb;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * 基本的database model
 */
public abstract class Model<T extends Model> {

    public abstract String getListKey();


    /**
     * 唯一值不可操作
     */
    @SerializedName("uniqueId")
    private String uniqueId;

    protected String getUniqueId() {
        return uniqueId;
    }

    private void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }


    private String getGson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }


    final public void removeAll(Context context) {
        EasyDB preferenceDB = new EasyDB(context);
        preferenceDB.putList(getListKey(), new ArrayList<String>());
    }

    /**
     * 取回所有項目
     *
     * @param context
     * @return
     */
    final public List getAll(Context context) {
        EasyDB preferenceDB = new EasyDB(context);
        ArrayList<String> arrayList = preferenceDB.getList(getListKey());
        List shopCarItems = new ArrayList<>();
        Gson gson = new Gson();

        for (int i = 0; i < arrayList.size(); i++) {
            shopCarItems.add(gson.fromJson(arrayList.get(i), getClass()));
        }
        return shopCarItems;
    }


    /**
     * 從list 刪除項目
     *
     * @param context
     */
    public void delete(Context context) {
        EasyDB preferenceDB = new EasyDB(context);
        ArrayList<String> arrayList = preferenceDB.getList(getListKey());
        int position = arrayList.indexOf(this.getGson());
        if (position != -1) {
            arrayList.remove(position);
        }
        preferenceDB.putList(getListKey(), arrayList);
    }

    /**
     * 儲存項目到list
     *
     * @param context
     */
    final public void save(Context context) {
        EasyDB preferenceDB = new EasyDB(context);
        ArrayList<String> arrayList = preferenceDB.getList(getListKey());
        this.setUniqueId(preferenceDB.RandUUID());
        arrayList.add(this.getGson());
        preferenceDB.putList(getListKey(), arrayList);
    }

    /**
     * 更新單一項目儲存到list
     *
     * @param context
     */
    final public void update(Context context) {
        EasyDB preferenceDB = new EasyDB(context);
        ArrayList<String> arrayList = preferenceDB.getList(getListKey());
        int position;
        Gson gson = new Gson();
        for (int i = 0; i < arrayList.size(); i++) {
            Model item = gson.fromJson(arrayList.get(i), this.getClass());
            if (item.getUniqueId().equals(this.getUniqueId())) {
                position = i;
                arrayList.set(position, this.getGson());
                preferenceDB.putList(getListKey(), arrayList);
                return;
            }
        }
    }
}