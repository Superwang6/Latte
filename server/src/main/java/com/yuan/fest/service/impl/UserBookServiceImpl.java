package com.yuan.fest.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yuan.fest.common.SearchParameter;
import com.yuan.fest.entity.User;
import com.yuan.fest.entity.UserBook;
import com.yuan.fest.mapper.UserBookMapper;
import com.yuan.fest.service.IUserBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 王平远
 * @since 2020-07-02
 */
@Service
public class UserBookServiceImpl extends ServiceImpl<UserBookMapper, UserBook> implements IUserBookService {

    @Autowired
    private UserBookMapper userBookMapper;

    @Override
    public IPage<UserBook> queryBookshelfList(UserBook userBook, SearchParameter param) {
        Page<UserBook> userBookPage = param.convertIPage(userBook);
        IPage<UserBook> userBookList = userBookMapper.queryBookshelfList(userBookPage,userBook);
        return userBookList;
    }
}
