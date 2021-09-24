
package cn.lalisa.web.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>knowledgeAccountList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="knowledgeAccountList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resKnowledgeAccountList" type="{http://webservice.web.csjsite.baosight.com/}resKnowledgeAccount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "knowledgeAccountList", propOrder = {
    "resKnowledgeAccountList"
})
public class KnowledgeAccountList {

    protected List<ResKnowledgeAccount> resKnowledgeAccountList;

    /**
     * Gets the value of the resKnowledgeAccountList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resKnowledgeAccountList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResKnowledgeAccountList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResKnowledgeAccount }
     * 
     * 
     */
    public List<ResKnowledgeAccount> getResKnowledgeAccountList() {
        if (resKnowledgeAccountList == null) {
            resKnowledgeAccountList = new ArrayList<ResKnowledgeAccount>();
        }
        return this.resKnowledgeAccountList;
    }

}
