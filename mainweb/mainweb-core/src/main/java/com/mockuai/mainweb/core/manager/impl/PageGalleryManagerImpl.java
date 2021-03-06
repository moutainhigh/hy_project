package com.mockuai.mainweb.core.manager.impl;

import com.mockuai.mainweb.common.constant.ResponseCode;
import com.mockuai.mainweb.core.dao.PageGalleryDAO;
import com.mockuai.mainweb.core.domain.PageGalleryDO;
import com.mockuai.mainweb.core.exception.MainWebException;
import com.mockuai.mainweb.core.manager.PageGalleryManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2016/9/21.
 */
@Service
public class PageGalleryManagerImpl implements PageGalleryManager {

    @Resource
    private PageGalleryDAO pageGalleryDAO;

    @Override
    public void addPageGallery(PageGalleryDO pageGalleryDO) throws MainWebException {
        try {
            pageGalleryDAO.addPageGallery(pageGalleryDO);
        } catch (SQLException e) {
            throw  new MainWebException(ResponseCode.SYS_E_DB_INSERT,  e);
        }
    }

    @Override
    public void deletePageGallery(Long pageId) throws MainWebException {
        try {
            pageGalleryDAO.deletePageGallery(pageId);
        } catch (SQLException e) {
            throw  new MainWebException(ResponseCode.SYS_E_DB_INSERT,  e);
        }
    }

    @Override
    public List<PageGalleryDO> queryPageGallery(Long blockId) throws MainWebException {
        try {
            return pageGalleryDAO.queryPageGallery(blockId);
        } catch (SQLException e) {
            throw  new MainWebException(ResponseCode.SYS_E_DB_QUERY,  e);
        }
    }
}
