package douyin.com.yqdouyindemo.api.hotsearch;

import douyin.com.yqdouyindemo.utils.OnNetLinsenter;

/**
 * Created by 杨群 on 2018/2/22.
 */

public interface IHotModel {
    void searchData(OnNetLinsenter<HotSearchBean> hotSearchBeanOnNetLinsenter);
}
