package com.easyapp.easydb;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * 基本的database model
 */
public abstract class Model implements Serializable {

    public abstract String getListKey();

    /**
     * 唯一值不可操作
     */
    @SerializedName("uniqueId")
    private String uniqueId;

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }


    public String getGson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }


    final public void removeAll(Context context) {
        EasyDB easyDB = new EasyDB(context);
        easyDB.putList(getListKey(), new ArrayList<String>());
    }

    /**
     * 取回所有項目
     *
     * @param context
     * @return
     */
    final public <T extends Model> ArrayList<T> getAll(Context context) {
        EasyDB easyDB = new EasyDB(context);
        ArrayList<String> arrayList = easyDB.getList(getListKey());
        ArrayList<T> items = new ArrayList<>();
        Gson gson = new Gson();

        for (int i = 0; i < arrayList.size(); i++) {
            Class classOfT = getClass();
            T t = gson.fromJson(arrayList.get(i), (Type) classOfT);
            items.add(t);
        }
        return items;
    }


    /**
     * 從list 刪除項目
     *
     * @param context
     */
    public void delete(Context context) {
        EasyDB easyDB = new EasyDB(context);
        ArrayList<String> arrayList = easyDB.getList(getListKey());
        Gson gson = new Gson();
        for (int i = 0; i < arrayList.size(); i++) {
            Model item = gson.fromJson(arrayList.get(i), this.getClass());
            if (item.getUniqueId().equals(this.getUniqueId())) {
                arrayList.remove(i);
                easyDB.putList(getListKey(), arrayList);
            }
        }
    }

    /**
     * 儲存項目到list
     *
     * @param context
     */
    final public void save(Context context) {
        EasyDB easyDB = new EasyDB(context);
        ArrayList<String> arrayList = easyDB.getList(getListKey());
        this.setUniqueId(easyDB.RandUUID());
        arrayList.add(this.getGson());
        easyDB.putList(getListKey(), arrayList);
    }

    /**
     * 更新單一項目儲存到list
     *
     * @param context
     */
    final public void update(Context context) {
        EasyDB easyDB = new EasyDB(context);
        ArrayList<String> arrayList = easyDB.getList(getListKey());
        int position;
        Gson gson = new Gson();
        for (int i = 0; i < arrayList.size(); i++) {
            Model item = gson.fromJson(arrayList.get(i), this.getClass());
            if (item.getUniqueId().equals(this.getUniqueId())) {
                position = i;
                arrayList.set(position, this.getGson());
                easyDB.putList(getListKey(), arrayList);
                return;
            }
        }
    }
}