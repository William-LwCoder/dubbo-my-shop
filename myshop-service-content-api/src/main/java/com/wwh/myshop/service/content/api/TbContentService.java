package com.wwh.myshop.service.content.api;

import com.wwh.myshop.commons.domain.TbContent;
import com.github.pagehelper.PageInfo;

public interface TbContentService {
    /**
     * 分页查询
     * @param start
     * @param length
     * @param tbContent
     * @return
     */
    PageInfo<TbContent> page(int start, int length, TbContent tbContent);
}
