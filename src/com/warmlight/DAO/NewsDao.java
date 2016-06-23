package com.warmlight.DAO;

import com.warmlight.model.NewsEntity;
import com.warmlight.utils.DataWrapper;

import java.util.List;

/**
 * Created by Administrator on 2016/6/23.
 */
public interface NewsDao {
    boolean saveNews(NewsEntity news);
    DataWrapper<List<NewsEntity>> getNewsList(Integer pageSize,Integer pageIndex);
}
