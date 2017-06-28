package appinfo.com.easyapp.easydblist.entity;

import android.content.Context;

import com.easyapp.easydb.Model;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 商品詳情
 */
public class ItemProduct implements Serializable {


    /**
     * status : 200
     * message : 搜尋成功
     * uid : 4
     * data : {"total":1,"content":[{"number":1,"p_id":"14b25c0e-4412-11e6-b4e9-04011089","p_name":"家樂福禮券 1000","period":"10000001","coin_total":"500","p_picture":["http://139.59.246.193/treasure/data/production/iphone-7-releasing-soon-iphone-pro.png","http://139.59.246.193/treasure/data/production/iphone-7-releasing-soon-iphone-pro.png"],"is_finish_bid":"1","p_coin_demand":"500","lottery_time":"2016/07/21 10:28:30.226","winner_avatar":"http://139.59.246.193/treasure/data/users/5f1d81d3-4526-11e6-b4e9-04011089.png","winner_name":"StellaTest","winner_exp":"426","winner_ip":null,"winner_coin_point":16,"is_bid":false,"bid_total_coin_point":0,"bid_info":[],"biders_count":9,"lottery_result":{"lottery_number":"200","a_number":"10073580466","b_number":"570676","bingo_period":"105040967","bid_count":"500","a_number_biders":[{"bid_time":"2016-07-26 23:56:36:969","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:36:976","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:37:391","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:37:404","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:37:969","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:37:985","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:38:402","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:38:409","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:38:767","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"},{"bid_time":"2016-07-27 00:09:38:033","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:38:776","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-27 00:09:36:419","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"}]}}]}
     */

    @SerializedName("status")
    private int status;
    @SerializedName("message")
    private String message;
    @SerializedName("uid")
    private String uid;
    /**
     * total : 1
     * content : [{"number":1,"p_id":"14b25c0e-4412-11e6-b4e9-04011089","p_name":"家樂福禮券 1000","period":"10000001","coin_total":"500","p_picture":["http://139.59.246.193/treasure/data/production/iphone-7-releasing-soon-iphone-pro.png","http://139.59.246.193/treasure/data/production/iphone-7-releasing-soon-iphone-pro.png"],"is_finish_bid":"1","p_coin_demand":"500","lottery_time":"2016/07/21 10:28:30.226","winner_avatar":"http://139.59.246.193/treasure/data/users/5f1d81d3-4526-11e6-b4e9-04011089.png","winner_name":"StellaTest","winner_exp":"426","winner_ip":null,"winner_coin_point":16,"is_bid":false,"bid_total_coin_point":0,"bid_info":[],"biders_count":9,"lottery_result":{"lottery_number":"200","a_number":"10073580466","b_number":"570676","bingo_period":"105040967","bid_count":"500","a_number_biders":[{"bid_time":"2016-07-26 23:56:36:969","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:36:976","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:37:391","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:37:404","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:37:969","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:37:985","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:38:402","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:38:409","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:38:767","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"},{"bid_time":"2016-07-27 00:09:38:033","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:38:776","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-27 00:09:36:419","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"}]}}]
     */

    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Serializable{
        @SerializedName("total")
        private int total;
        /**
         * number : 1
         * p_id : 14b25c0e-4412-11e6-b4e9-04011089
         * p_name : 家樂福禮券 1000
         * period : 10000001
         * coin_total : 500
         * p_picture : ["http://139.59.246.193/treasure/data/production/iphone-7-releasing-soon-iphone-pro.png","http://139.59.246.193/treasure/data/production/iphone-7-releasing-soon-iphone-pro.png"]
         * is_finish_bid : 1
         * p_coin_demand : 500
         * lottery_time : 2016/07/21 10:28:30.226
         * winner_avatar : http://139.59.246.193/treasure/data/users/5f1d81d3-4526-11e6-b4e9-04011089.png
         * winner_name : StellaTest
         * winner_exp : 426
         * winner_ip : null
         * winner_coin_point : 16
         * is_bid : false
         * bid_total_coin_point : 0
         * bid_info : []
         * biders_count : 9
         * lottery_result : {"lottery_number":"200","a_number":"10073580466","b_number":"570676","bingo_period":"105040967","bid_count":"500","a_number_biders":[{"bid_time":"2016-07-26 23:56:36:969","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:36:976","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:37:391","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:37:404","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:37:969","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:37:985","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:38:402","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:38:409","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:38:767","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"},{"bid_time":"2016-07-27 00:09:38:033","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:38:776","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-27 00:09:36:419","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"}]}
         */

        private List<ContentBean> content;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<ContentBean> getContent() {
            return content;
        }

        public void setContent(List<ContentBean> content) {
            this.content = content;
        }

        public static class ContentBean extends Model implements Serializable{
            @SerializedName("number")
            private int number;
            @SerializedName("p_id")
            private String p_id;
            @SerializedName("name")
            private String name;
            @SerializedName("p_name")
            private String p_name;
            @SerializedName("s_pic")
            private String s_pic;
            @SerializedName("period")
            private String period;
            @SerializedName("is_main")
            private String is_main;
            @SerializedName("coin_total")
            private int coin_total;
            @SerializedName("coin_point")
            private int coin_point = 0;
            @SerializedName("is_finish_bid")
            private int is_finish_bid;
            @SerializedName("p_coin_demand")
            private int p_coin_demand;
            @SerializedName("coin_demand")
            private int coin_demand;
            @SerializedName("lottery_time")
            private String lottery_time;
            @SerializedName("lottery_number")
            private String lottery_number;
            @SerializedName("winner_avatar")
            private String winner_avatar;
            @SerializedName("winner_name")
            private String winner_name;
            @SerializedName("winner_exp")
            private int winner_exp;
            @SerializedName("winner_ip")
            private String winner_ip;
            @SerializedName("winner_coin_point")
            private int winner_coin_point;
            @SerializedName("is_bid")
            private boolean is_bid;
            @SerializedName("type")
            private String type;
            @SerializedName("bid_total_coin_point")
            private int bid_total_coin_point;
            @SerializedName("biders_count")
            private int biders_count;
            @SerializedName("status")
            private int status;
            @SerializedName("bid_coin_point")
            private int bid_coin_point;
            @SerializedName("count")
            private int count = 5;
            @SerializedName("disabled")
            private int disabled;

            /**
             * lottery_number : 200
             * a_number : 10073580466
             * b_number : 570676
             * bingo_period : 105040967
             * bid_count : 500
             * a_number_biders : [{"bid_time":"2016-07-26 23:56:36:969","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:36:976","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:37:391","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:37:404","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:37:969","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:37:985","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:38:402","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:38:409","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:38:767","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"},{"bid_time":"2016-07-27 00:09:38:033","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-26 23:56:38:776","u_name":"StellaTest","p_name":"【 ARTBOX 】超次元29吋輕量PC鏡面鋁框行李箱 ART802-29玫瑰金","p_period":"10000001"},{"bid_time":"2016-07-27 00:09:36:419","u_name":"StellaTest","p_name":"家樂福禮券 1000","p_period":"10000001"}]
             */

            public static ArrayList<ContentBean> getAllList(Context context) {
                ContentBean bean = new ContentBean();
                return bean.getAll(context);
            }

            @Override
            public String getListKey() {
                return "list";
            }

            public boolean isExist(Context context) {
                List<ContentBean> beanList = getAll(context);
                for (int i = 0; i < beanList.size(); i++) {
                    ContentBean bean = beanList.get(i);
                    if (bean.getP_id().equals(getP_id())) {
                        return true;
                    }
                }
                return false;
            }

            public void setDisabled(int disabled) {
                this.disabled = disabled;
            }

            public int getDisabled() {
                return disabled;
            }

            private LotteryResultBean lottery_result;
            private List<String> p_picture;
            private List<?> bid_info;

            public int getBid_coin_point() {
                return bid_coin_point;
            }

            public void setBid_coin_point(int bid_coin_point) {
                this.bid_coin_point = bid_coin_point;
            }

            public String getLottery_number() {
                return lottery_number;
            }

            public void setLottery_number(String lottery_number) {
                this.lottery_number = lottery_number;
            }

            public String getIs_main() {
                return is_main;
            }

            public int getCoin_demand() {
                return coin_demand;
            }

            public String getName() {
                return name;
            }

            public String getS_pic() {
                return s_pic;
            }

            public void setCoin_demand(int coin_demand) {
                this.coin_demand = coin_demand;
            }

            public void setIs_main(String is_main) {
                this.is_main = is_main;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setS_pic(String s_pic) {
                this.s_pic = s_pic;
            }

            public boolean is_bid() {
                return is_bid;
            }

            public int getCoin_point() {
                return coin_point;
            }

            public void setCoin_point(int coin_point) {
                this.coin_point = coin_point;
            }

            public int getCount() {
                return count;
            }

            public int getStatus() {
                return status;
            }

            public String getType() {
                return type;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public void setType(String type) {
                this.type = type;
            }

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            public String getP_id() {
                return p_id;
            }

            public void setP_id(String p_id) {
                this.p_id = p_id;
            }

            public String getP_name() {
                return p_name;
            }

            public void setP_name(String p_name) {
                this.p_name = p_name;
            }

            public String getPeriod() {
                return period;
            }

            public void setPeriod(String period) {
                this.period = period;
            }

            public int getCoin_total() {
                return coin_total;
            }

            public void setCoin_total(int coin_total) {
                this.coin_total = coin_total;
            }

            public int getIs_finish_bid() {
                return is_finish_bid;
            }

            public void setIs_finish_bid(int is_finish_bid) {
                this.is_finish_bid = is_finish_bid;
            }

            public int getP_coin_demand() {
                return p_coin_demand;
            }

            public void setP_coin_demand(int p_coin_demand) {
                this.p_coin_demand = p_coin_demand;
            }

            public String getLottery_time() {
                return lottery_time;
            }

            public void setLottery_time(String lottery_time) {
                this.lottery_time = lottery_time;
            }

            public String getWinner_avatar() {
                return winner_avatar;
            }

            public void setWinner_avatar(String winner_avatar) {
                this.winner_avatar = winner_avatar;
            }

            public String getWinner_name() {
                return winner_name;
            }

            public void setWinner_name(String winner_name) {
                this.winner_name = winner_name;
            }

            public int getWinner_exp() {
                return winner_exp;
            }

            public void setWinner_exp(int winner_exp) {
                this.winner_exp = winner_exp;
            }

            public String getWinner_ip() {
                return winner_ip;
            }

            public void setWinner_ip(String winner_ip) {
                this.winner_ip = winner_ip;
            }

            public int getWinner_coin_point() {
                return winner_coin_point;
            }

            public void setWinner_coin_point(int winner_coin_point) {
                this.winner_coin_point = winner_coin_point;
            }

            public boolean isIs_bid() {
                return is_bid;
            }

            public void setIs_bid(boolean is_bid) {
                this.is_bid = is_bid;
            }

            public int getBid_total_coin_point() {
                return bid_total_coin_point;
            }

            public void setBid_total_coin_point(int bid_total_coin_point) {
                this.bid_total_coin_point = bid_total_coin_point;
            }

            public int getBiders_count() {
                return biders_count;
            }

            public void setBiders_count(int biders_count) {
                this.biders_count = biders_count;
            }

            public LotteryResultBean getLottery_result() {
                return lottery_result;
            }

            public void setLottery_result(LotteryResultBean lottery_result) {
                this.lottery_result = lottery_result;
            }

            public List<String> getP_picture() {
                return p_picture;
            }

            public void setP_picture(List<String> p_picture) {
                this.p_picture = p_picture;
            }

            public List<?> getBid_info() {
                return bid_info;
            }

            public void setBid_info(List<?> bid_info) {
                this.bid_info = bid_info;
            }

            public static class LotteryResultBean implements Serializable {
                @SerializedName("lottery_number")
                private String lottery_number;
                @SerializedName("a_number")
                private String a_number;
                @SerializedName("b_number")
                private String b_number;
                @SerializedName("bingo_period")
                private String bingo_period;
                @SerializedName("bid_count")
                private String bid_count;
                /**
                 * bid_time : 2016-07-26 23:56:36:969
                 * u_name : StellaTest
                 * p_name : 家樂福禮券 1000
                 * p_period : 10000001
                 */

                private List<ANumberBidersBean> a_number_biders;

                public String getLottery_number() {
                    return lottery_number;
                }

                public void setLottery_number(String lottery_number) {
                    this.lottery_number = lottery_number;
                }

                public String getA_number() {
                    return a_number;
                }

                public void setA_number(String a_number) {
                    this.a_number = a_number;
                }

                public String getB_number() {
                    return b_number;
                }

                public void setB_number(String b_number) {
                    this.b_number = b_number;
                }

                public String getBingo_period() {
                    return bingo_period;
                }

                public void setBingo_period(String bingo_period) {
                    this.bingo_period = bingo_period;
                }

                public String getBid_count() {
                    return bid_count;
                }

                public void setBid_count(String bid_count) {
                    this.bid_count = bid_count;
                }

                public List<ANumberBidersBean> getA_number_biders() {
                    return a_number_biders;
                }

                public void setA_number_biders(List<ANumberBidersBean> a_number_biders) {
                    this.a_number_biders = a_number_biders;
                }

                public static class ANumberBidersBean implements Serializable{
                    @SerializedName("bid_time")
                    private String bid_time;
                    @SerializedName("u_name")
                    private String u_name;
                    @SerializedName("p_name")
                    private String p_name;
                    @SerializedName("p_period")
                    private String p_period;

                    public String getBid_time() {
                        return bid_time;
                    }

                    public void setBid_time(String bid_time) {
                        this.bid_time = bid_time;
                    }

                    public String getU_name() {
                        return u_name;
                    }

                    public void setU_name(String u_name) {
                        this.u_name = u_name;
                    }

                    public String getP_name() {
                        return p_name;
                    }

                    public void setP_name(String p_name) {
                        this.p_name = p_name;
                    }

                    public String getP_period() {
                        return p_period;
                    }

                    public void setP_period(String p_period) {
                        this.p_period = p_period;
                    }
                }
            }
        }
    }
}

