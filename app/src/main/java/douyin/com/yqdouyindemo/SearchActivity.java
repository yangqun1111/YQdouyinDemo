package douyin.com.yqdouyindemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import douyin.com.yqdouyindemo.api.hotsearch.HotSearchBean;
import douyin.com.yqdouyindemo.api.hotsearch.HotSearchPresenter;
import douyin.com.yqdouyindemo.api.hotsearch.IHotSearchView;
import douyin.com.yqdouyindemo.api.searchbanner.BannerPicBean;
import douyin.com.yqdouyindemo.api.searchbanner.ISearchView;
import douyin.com.yqdouyindemo.api.searchbanner.SearchPersenter;
import douyin.com.yqdouyindemo.utils.Imagebanner;
import douyin.com.yqdouyindemo.utils.ObservableScrollView;

public class SearchActivity extends AppCompatActivity implements ISearchView,IHotSearchView {
    //图片的地址和title的集合
    private List<String> mListImage;

    private EditText mNameEt;
    private LinearLayout mNestToolBarLl;
    private RecyclerView mRecyclerviewSearch;
    private Banner mBanners;
    private RecyclerView mRvtwoSearch;
    private ObservableScrollView mScro;
    private SearchPersenter searchPersenter;
     private HotSearchPresenter hotSearchPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initView();
        searchPersenter =new SearchPersenter(this);
        searchPersenter.showSearch();
         new HotSearchPresenter(this);

    }

    @Override
    public void searchShowBanner(BannerPicBean bannerPicBean) {
        getbanner(bannerPicBean);
    }

    private void initView() {

        mNameEt = (EditText) findViewById(R.id.et_name);

        mBanners=findViewById(R.id.Dybanners);
        mNestToolBarLl = (LinearLayout) findViewById(R.id.ll_nest_toolBar);
        mRecyclerviewSearch = (RecyclerView) findViewById(R.id.search_recyclerview);
         mBanners=findViewById(R.id.Dybanners);
        mRvtwoSearch = (RecyclerView) findViewById(R.id.search_rvtwo);
        mScro = (ObservableScrollView) findViewById(R.id.scro);
    }

    private void getbanner(BannerPicBean bannerPicBean) {
          final List<BannerPicBean.BannerBean> banners=bannerPicBean.getBanner() ;
        Log.i("eeeee",banners.toString());
        //加载图片的方法
        this.mBanners.setImageLoader(new Imagebanner());
        mListImage = new ArrayList<>();
        for (int i = 0; i < banners.size(); i++) {
            mListImage.add(banners.get(i).getBanner_url().getUri());
        }
        //设置Banner图片集合
        this.mBanners.setImages(mListImage);
//切换的时间
        this.mBanners.setDelayTime(2000);
//启动banner
        this.mBanners.start();
    }
   //热搜显示
    @Override
    public void IHotSearch(HotSearchBean hotSearchBean) {

    }
}
