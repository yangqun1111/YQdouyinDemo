package douyin.com.yqdouyindemo.api.searchbanner;

import douyin.com.yqdouyindemo.utils.OnNetLinsenter;

/**
 * Created by 杨群 on 2018/2/22.
 */

public class SearchPersenter {
    private ISearchModel model;
    private ISearchView view;
    public SearchPersenter(ISearchView view) {
        this.view = view;
        model=new SearchModel();
    }
    public void showSearch(){
        model.searchData(new OnNetLinsenter<BannerPicBean>() {
            @Override
            public void callBack(BannerPicBean bannerPicBean) {
                view.searchShowBanner(bannerPicBean);
            }
        });
    }
}
