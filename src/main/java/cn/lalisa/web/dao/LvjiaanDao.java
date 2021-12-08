package cn.lalisa.web.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Describe:
 * @Author：lvja
 * @Date：2021/5/25 9:48
 * @Modifier：
 * @ModefiedDate:
 */
@DS("ms210")
public interface LvjiaanDao {


    @Insert("insert into lvjiaan.dbo.test1(id) values('1')")
    void insert1();

    @Insert("insert into lvjiaan.dbo.test2(id2) values('2')")
    void insert2();


    @Select("SELECT top 1 app_service_organization_code appServiceOrganizationCode,app_type appType,city_code cityCode,cname,country_code countryCode,grade_level gradeLevel,plat_code platCode,product_content productContent," +
            "product_label productLabel,product_main_Img productMainImg,product_price productPrice,product_status productStatus,province_code provinceCode,syn_status synStatus FROM SwapData.CSJ.t_knowledge_agency")
    List<ResKnowledgeAgency> getResKnowledgeAgencyList();
}
