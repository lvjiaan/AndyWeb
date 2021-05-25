package cn.andy.AndyWeb.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Insert;

/**
 * @Describe:
 * @Author：lvja
 * @Date：2021/5/25 9:48
 * @Modifier：
 * @ModefiedDate:
 */
@DS("ms187")
public interface LvjiaanDao {


    @Insert("insert into lvjiaan.dbo.test1(id) values('1')")
    void insert1();

    @Insert("insert into lvjiaan.dbo.test2(id2) values('2')")
    void insert2();
}
