package douyin.com.yqdouyindemo.api.searchbanner;

import android.util.Log;

import douyin.com.yqdouyindemo.api.API;
import douyin.com.yqdouyindemo.api.ApiService;
import douyin.com.yqdouyindemo.api.RetrofitUtils;
import douyin.com.yqdouyindemo.utils.OnNetLinsenter;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 杨群 on 2018/2/22.
 */

public class SearchModel implements ISearchModel{
    @Override
    public void searchData(final OnNetLinsenter<BannerPicBean> bannerPicBeanOnNetLinsenter) {
        final ApiService apiService= RetrofitUtils.getInstance()
                .getApiService(API.API_HOST,ApiService.class);
        Observable<BannerPicBean> params=apiService.videobean();
       params.subscribeOn(Schedulers.io())
               .observeOn(AndroidSchedulers.mainThread())
               .subscribe(new Observer<BannerPicBean>() {
                   @Override
                   public void onSubscribe(Disposable d) {

                   }

                   @Override
                   public void onNext(BannerPicBean bannerPicBean) {

                       bannerPicBeanOnNetLinsenter.callBack(bannerPicBean);
                       Log.i("xxxxx", bannerPicBean.toString());
                   }

                   @Override
                   public void onError(Throwable e) {
                       Log.i("x", e.getMessage());
                   }

                   @Override
                   public void onComplete() {

                   }
               });
    }
}
