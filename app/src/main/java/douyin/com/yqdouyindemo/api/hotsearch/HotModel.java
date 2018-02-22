package douyin.com.yqdouyindemo.api.hotsearch;

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

public class HotModel implements IHotModel {
    @Override
    public void searchData(final OnNetLinsenter<HotSearchBean> hotSearchBeanOnNetLinsenter) {
        final ApiService apiService = RetrofitUtils.getInstance()
                .getApiService(API.API_HOST, ApiService.class);
        Observable<HotSearchBean> params = apiService.hotSearchBean();
        params.subscribeOn(Schedulers.io())//指定IO做耗时操作
                .observeOn(AndroidSchedulers.mainThread())//指定更新UI在主线程
                .subscribe(new Observer<HotSearchBean>() {

                    @Override
                    public void onError(Throwable e) {//失败
                        Log.i("x", e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }


                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(HotSearchBean hotSearchBean) {
                        Log.i("xxx", hotSearchBean+"");
                        hotSearchBeanOnNetLinsenter.callBack(hotSearchBean);
                    }
                });
    }
}
