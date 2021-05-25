package cn.andy.AndyWeb.service.Impl;

import cn.andy.AndyWeb.dao.LvjiaanDao;
import cn.andy.AndyWeb.service.LvjiaanService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Describe:
 * @Author：lvja
 * @Date：2021/5/25 9:46
 * @Modifier：
 * @ModefiedDate:
 */
@Service
@Transactional
public class LvjiaanServiceImpl implements LvjiaanService {
    private final LvjiaanDao lvjiaanDao;

    public LvjiaanServiceImpl(LvjiaanDao lvjiaanDao) {
        this.lvjiaanDao = lvjiaanDao;
    }


    @Override
    public void insertTest() {

        lvjiaanDao.insert1();
        lvjiaanDao.insert2();

    }
}