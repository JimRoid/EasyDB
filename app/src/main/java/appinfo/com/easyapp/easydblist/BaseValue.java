package appinfo.com.easyapp.easydblist;

import android.text.Html;
import android.text.Spanned;

import java.util.concurrent.TimeUnit;

/**
 * Created by easyapp_jim on 2016/7/22.
 */
public class BaseValue {

    public final static String REPLACEMAIN = "com.easyapp.easycoin.REPLACEMAIN";
    public final static String FIRSTDESCRIPTION = "com.easyapp.easycoin.FIRSTDESCRIPTION";

    public final static String BaseShopCar = "com.easyapp.easycoin.BaseShopCar";
    public final static String EasyCoinsNews = "com.easyapp.easycoin.News";
    public final static String PRODUCTLIST = "com.easyapp.easycoin.PRODUCTLIST";
    public final static String PRODUCTLISTVALUEDEFAULT = "首頁";
    public final static String PRODUCTLISTAD = "廣告";
    public final static String LOTTERYDIALOG = "com.easyapp.easycoin.LOTTERYDIALOG";
    public final static String LOTTERYDelivertInformation = "com.easyapp.easycoin.lottery_deliveryInformationIntentFilter";
    public final static String RequestCode = "com.easyapp.easycoin.RequestCode";

    public final static int BaseResult = 7777;
    public final static int BaseLogin = 7788;



    /**
     * 經驗值label
     *
     * @param exp 經驗值
     * @return
     */
    public static String getExpLabel(int exp) {
        String exp_label;
        if (exp <= 100) {
            exp_label = exp + "/100";
        } else if (exp <= 1000) {
            exp_label = exp + "/1000";
        } else if (exp <= 10000) {
            exp_label = exp + "/10000";
        } else if (exp <= 40000) {
            exp_label = exp + "/40000";
        } else {
            exp_label = exp + "";
        }
        return exp_label;
    }

    /**
     * 回傳等級證明
     *
     * @param exp
     * @return
     */
    public static String getLevel(int exp) {
        String label;

        if (exp <= 100) {
            label = "木牌";
        } else if (exp <= 1000) {
            label = "銅牌";
        } else if (exp <= 10000) {
            label = "銀牌";
        } else if (exp <= 40000) {
            label = "金牌";
        } else {
            label = "鑽石";
        }
        return "(" + label + ")";
    }

    /**
     * 改變金幣顏色
     *
     * @param coins 金幣數目
     * @return
     */
    public static Spanned getRedCoins(String start, int coins) {
        return getRedCoins(start, coins, "");
    }

    /**
     * 改變金幣顏色
     *
     * @param coins 金幣數目
     * @return
     */
    public static Spanned getRedCoins(int coins, String end) {
        return getRedCoins("", coins, end);
    }

    /**
     * 改變金幣顏色
     *
     * @param coins 金幣數目
     * @return
     */
    public static Spanned getRedCoins(String start, int coins, String end) {
        return getRedLabel(start, coins + "", end);
    }

    public static Spanned getRedLabel(String start, String center, String end) {
        return Html.fromHtml(start + "<font color='#ff0000'>" + center + "</font>" + end);
    }

    /**
     * 改變幸運號碼藍色
     *
     * @param luck_number 號碼
     * @return
     */
    public static Spanned getBlueLuckNumber(String start, String luck_number) {
        return getBlueLuckNumber(start, luck_number, "");
    }

    /**
     * 改變金幣顏色
     *
     * @param luck_number 號碼
     * @return
     */
    public static Spanned getBlueLuckNumber(String start, String luck_number, String end) {
        return getBlueLabel(start, luck_number, end);
    }

    /**
     * @param start
     * @param center
     * @param end
     * @return
     */
    public static Spanned getBlueLabel(String start, String center, String end) {
        return Html.fromHtml(start + "<font color='#2d85fc'>" + center + "</font>" + end);
    }


    public static int getProgress(int total, int demand) {
        double result = percent(total, demand);
        return (int) Math.ceil(result);
    }


    /**
     * 百分比，至小數點下二位，第三位四捨五入
     * Math.floor 傳回小於引數的最大整數值
     **/
    private static double percent(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
//            throw new ArithmeticException("分母為 0 !!");
            return 0;
        } else {
            double percent = (double) numerator / (double) denominator * 10000;
            percent = Math.floor(percent + 0.5);

            return percent / 100;
        }
    }

    /**
     * Convert a millisecond duration to a string format
     *
     * @param millis A duration to convert to a string form
     * @return A string of the form "X Days Y Hours Z Minutes A Seconds".
     */
    public static String getDurationBreakdown(long millis) {
        if (millis < 0) {
            throw new IllegalArgumentException("Duration must be greater than zero!");
        }

        long days = TimeUnit.MILLISECONDS.toDays(millis);
        millis -= TimeUnit.DAYS.toMillis(days);
        long hours = TimeUnit.MILLISECONDS.toHours(millis);
        millis -= TimeUnit.HOURS.toMillis(hours);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
        millis -= TimeUnit.MINUTES.toMillis(minutes);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis);
        millis -= TimeUnit.MILLISECONDS.toMillis(seconds);
        long micros = TimeUnit.MICROSECONDS.toMicros(millis);

        StringBuilder sb = new StringBuilder(64);
        String value = (hours < 10 ? "0" : "") + hours;
        sb.append(value);
        sb.append(":");
        value = (minutes < 10 ? "0" : "") + minutes;
        sb.append(value);
        sb.append(":");
        value = (seconds < 10 ? "0" : "") + seconds;
        sb.append(value);
        sb.append(":");
        value = "" + micros;
        if (value.length() > 2) {
            value = value.substring(value.length() - 3, value.length() - 1);
        } else {
            value = (micros < 10 ? "0" : "") + micros;
        }

        sb.append(value);
        return (sb.toString());
    }
}