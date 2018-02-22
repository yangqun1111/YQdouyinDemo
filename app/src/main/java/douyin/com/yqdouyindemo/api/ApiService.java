package douyin.com.yqdouyindemo.api;

import douyin.com.yqdouyindemo.api.hotsearch.HotSearchBean;
import douyin.com.yqdouyindemo.api.searchbanner.BannerPicBean;
import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by 杨群 on 2018/2/22.
 */

public interface ApiService {
//轮播图
@GET("aweme/v1/find/?aid=1128")
Observable<BannerPicBean> videobean();
//热搜
@GET("aweme/v1/hot/search/")
Observable<HotSearchBean> hotSearchBean();
}
