package douyin.com.yqdouyindemo.api.searchbanner;

import java.util.List;

/**
 * Created by 杨群 on 2018/2/22.
 */

public class BannerPicBean {


    /**
     * status_code : 0
     * banner : [{"width":1080,"banner_url":{"url_list":["https://p3.pstatp.com/obj/66fc0002693e8e452089","https://pb9.pstatp.com/obj/66fc0002693e8e452089","https://pb3.pstatp.com/obj/66fc0002693e8e452089"],"uri":"66fc0002693e8e452089"},"title":"介绍一下，这是我的家乡","bid":"1136","schema":"aweme://challenge/detail/1592174664969219","height":518},{"width":1080,"banner_url":{"url_list":["https://p1.pstatp.com/obj/573b00027992d9665a44","https://pb3.pstatp.com/obj/573b00027992d9665a44","https://pb3.pstatp.com/obj/573b00027992d9665a44"],"uri":"573b00027992d9665a44"},"title":"抖音社区公约","bid":"1028","schema":"https://www.amemv.com/aweme/in_app/activity/pic/?img=douyinanquanjingshi%202_a65c87d6bd780f329270831894039d7d","height":518},{"width":1080,"banner_url":{"url_list":["https://p3.pstatp.com/obj/6701000251aff2835343","https://pb9.pstatp.com/obj/6701000251aff2835343","https://pb3.pstatp.com/obj/6701000251aff2835343"],"uri":"6701000251aff2835343"},"title":"音乐人12.25","bid":"1055","schema":"aweme://user/profile/76049764781","height":518},{"width":1080,"banner_url":{"url_list":["https://p3.pstatp.com/obj/383e00044b4cc3518d2d","https://pb9.pstatp.com/obj/383e00044b4cc3518d2d","https://pb3.pstatp.com/obj/383e00044b4cc3518d2d"],"uri":"383e00044b4cc3518d2d"},"title":"抖音拍摄指南","bid":"496","schema":"aweme://challenge/detail/1568518039001089","height":518},{"width":1080,"banner_url":{"url_list":["https://p3.pstatp.com/obj/42a30007b8ae7b956804","https://pb9.pstatp.com/obj/42a30007b8ae7b956804","https://pb3.pstatp.com/obj/42a30007b8ae7b956804"],"uri":"42a30007b8ae7b956804"},"title":"入坑必读","bid":"249","schema":"https://www.amemv.com/aweme/in_app/activity/pic/?img=rukengbidu1_a1e6a198833de081c780e1b683f84e3e","height":518}]
     * extra : {"logid":"201802221405370100080782346558DC","now":1519279537675,"fatal_item_ids":[]}
     */

    private int status_code;
    private ExtraBean extra;
    private List<BannerBean> banner;

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public ExtraBean getExtra() {
        return extra;
    }

    public void setExtra(ExtraBean extra) {
        this.extra = extra;
    }

    public List<BannerBean> getBanner() {
        return banner;
    }

    public void setBanner(List<BannerBean> banner) {
        this.banner = banner;
    }

    public static class ExtraBean {
        /**
         * logid : 201802221405370100080782346558DC
         * now : 1519279537675
         * fatal_item_ids : []
         */

        private String logid;
        private long now;
        private List<?> fatal_item_ids;

        public String getLogid() {
            return logid;
        }

        public void setLogid(String logid) {
            this.logid = logid;
        }

        public long getNow() {
            return now;
        }

        public void setNow(long now) {
            this.now = now;
        }

        public List<?> getFatal_item_ids() {
            return fatal_item_ids;
        }

        public void setFatal_item_ids(List<?> fatal_item_ids) {
            this.fatal_item_ids = fatal_item_ids;
        }
    }

    public static class BannerBean {
        /**
         * width : 1080
         * banner_url : {"url_list":["https://p3.pstatp.com/obj/66fc0002693e8e452089","https://pb9.pstatp.com/obj/66fc0002693e8e452089","https://pb3.pstatp.com/obj/66fc0002693e8e452089"],"uri":"66fc0002693e8e452089"}
         * title : 介绍一下，这是我的家乡
         * bid : 1136
         * schema : aweme://challenge/detail/1592174664969219
         * height : 518
         */

        private int width;
        private BannerUrlBean banner_url;
        private String title;
        private String bid;
        private String schema;
        private int height;

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public BannerUrlBean getBanner_url() {
            return banner_url;
        }

        public void setBanner_url(BannerUrlBean banner_url) {
            this.banner_url = banner_url;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getBid() {
            return bid;
        }

        public void setBid(String bid) {
            this.bid = bid;
        }

        public String getSchema() {
            return schema;
        }

        public void setSchema(String schema) {
            this.schema = schema;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public static class BannerUrlBean {
            /**
             * url_list : ["https://p3.pstatp.com/obj/66fc0002693e8e452089","https://pb9.pstatp.com/obj/66fc0002693e8e452089","https://pb3.pstatp.com/obj/66fc0002693e8e452089"]
             * uri : 66fc0002693e8e452089
             */

            private String uri;
            private List<String> url_list;

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public List<String> getUrl_list() {
                return url_list;
            }

            public void setUrl_list(List<String> url_list) {
                this.url_list = url_list;
            }
        }
    }
}
