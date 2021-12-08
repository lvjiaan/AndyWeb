package cn.lalisa.web.service.Impl;

import cn.lalisa.web.dao.LvjiaanDao;
import cn.lalisa.web.service.LvjiaanService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public List<ResKnowledgeAgency> getResKnowledgeAgencyList() {

        return lvjiaanDao.getResKnowledgeAgencyList();
    }
}
