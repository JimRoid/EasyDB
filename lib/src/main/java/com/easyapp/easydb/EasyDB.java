package com.easyapp.easydb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

/**
 * 以 key value 進行資料儲存處理
 * 可儲存成列表
 */
public class EasyDB {
    private final String FIRST = "FIRST";
    private final String USER_UUID = "USER_UUID";
    private final String LOGIN = "LOGIN";
    private final String TOKEN = "TOKEN";
    private SharedPreferences sharedPreferences;

    public EasyDB(Context context) {
        if (context != null) {
            String packageName = context.getPackageName();
            sharedPreferences = context.getSharedPreferences(packageName, Context.MODE_PRIVATE);

            if (isFirst()) {
                GenUUID();
            }
        }
    }

    public void clear() {
        sharedPreferences.edit().clear().apply();
    }

    /**
     * 建立第一次進入的token
     */
    private void GenUUID() {
        sharedPreferences.edit().putString(USER_UUID, RandUUID()).apply();
        sharedPreferences.edit().putBoolean(FIRST, false).apply();
    }


    /**
     * 建立隨機的uuid
     *
     * @return uuid
     */
    public String RandUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public String getUUID() {
        return sharedPreferences.getString(USER_UUID, "");
    }

    /**
     * 記錄登入的token
     *
     * @param token
     */
    public void Login(String token) {
        sharedPreferences.edit().putBoolean(LOGIN, true).apply();
        sharedPreferences.edit().putString(TOKEN, token).apply();
    }

    public void Logout() {
        sharedPreferences.edit().putBoolean(LOGIN, false).apply();
        sharedPreferences.edit().putString(TOKEN, "").apply();
    }


    public String getToken() {
        return sharedPreferences.getString(TOKEN, "");
    }

    public boolean isLogin() {
        return sharedPreferences.getBoolean(LOGIN, false);
    }

    public boolean isFirst() {
        return sharedPreferences.getBoolean(FIRST, true);
    }

    public boolean putString(String key, String value) {
        return sharedPreferences.edit().putString(key, value).commit();
    }

    public boolean putBoolean(String key, boolean value) {
        return sharedPreferences.edit().putBoolean(key, value).commit();
    }

    public boolean putInt(String key, int value) {
        return sharedPreferences.edit().putInt(key, value).commit();
    }

    public boolean putLong(String key, long value) {
        return sharedPreferences.edit().putLong(key, value).commit();
    }

    public boolean putFloat(String key, float value) {
        return sharedPreferences.edit().putFloat(key, value).commit();
    }

    public String getStringValue(String key, String value) {
        return sharedPreferences.getString(key, value);
    }


    public String getStringValue(String key) {
        return getStringValue(key, "");
    }

    public boolean getBooleanValue(String key, boolean value) {
        return sharedPreferences.getBoolean(key, value);
    }

    public boolean getBooleanValue(String key) {
        return getBooleanValue(key, false);
    }

    public int getIntValue(String key, int value) {
        return sharedPreferences.getInt(key, value);
    }

    public int getIntValue(String key) {
        return getIntValue(key, 0);
    }

    public long getLongValue(String key, long value) {
        return sharedPreferences.getLong(key, value);
    }

    public long getLongValue(String key) {
        return getLongValue(key, 0);
    }

    public float getFloatValue(String key, float value) {
        return sharedPreferences.getFloat(key, value);
    }

    public float getFloatValue(String key) {
        return getFloatValue(key, 0f);
    }

    public boolean putList(String key, ArrayList<String> strings) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String[] array = strings.toArray(new String[strings.size()]);
        // the comma like character used below is not a comma it is the SINGLE
        // LOW-9 QUOTATION MARK unicode 201A and unicode 2017 they are used for
        // seprating the items in the list
        editor.putString(key, TextUtils.join("‚‗‚", array));
        return editor.commit();
    }

    public ArrayList<String> getList(String key) {
        String[] split = TextUtils.split(sharedPreferences.getString(key, ""), "‚‗‚");
        ArrayList<String> strings = new ArrayList<>();
        if (split.length > 0) {
            strings.addAll(new ArrayList<>(Arrays.asList(split)));
        }
        return strings;
    }

}