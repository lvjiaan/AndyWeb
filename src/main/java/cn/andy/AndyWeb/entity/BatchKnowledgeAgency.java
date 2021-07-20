
package cn.andy.AndyWeb.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>batchKnowledgeAgency complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="batchKnowledgeAgency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resKnowledgeAgency" type="{http://webservice.web.csjsite.baosight.com/}resKnowledgeAgency" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "batchKnowledgeAgency", propOrder = {
    "resKnowledgeAgency"
})
public class BatchKnowledgeAgency {

    protected List<ResKnowledgeAgency> resKnowledgeAgency;

    /**
     * Gets the value of the resKnowledgeAgency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resKnowledgeAgency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResKnowledgeAgency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResKnowledgeAgency }
     * 
     * 
     */
    public List<ResKnowledgeAgency> getResKnowledgeAgency() {
        if (resKnowledgeAgency == null) {
            resKnowledgeAgency = new ArrayList<ResKnowledgeAgency>();
        }
        return this.resKnowledgeAgency;
    }

}
