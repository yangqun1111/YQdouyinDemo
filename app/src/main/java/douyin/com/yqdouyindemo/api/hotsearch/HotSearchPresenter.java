package douyin.com.yqdouyindemo.api.hotsearch;

import douyin.com.yqdouyindemo.utils.OnNetLinsenter;

/**
 * Created by 杨群 on 2018/2/22.
 */

public class HotSearchPresenter {
    private IHotModel model;
    private IHotSearchView view;
    public HotSearchPresenter(IHotSearchView view) {
        this.view = view;
        model=new HotModel();
    }
    public void showHotSearch(){
        model.searchData(new OnNetLinsenter<HotSearchBean>() {
            @Override
            public void callBack(HotSearchBean hotSearchBean) {
                view.IHotSearch(hotSearchBean);
            }
        });
    }
}
