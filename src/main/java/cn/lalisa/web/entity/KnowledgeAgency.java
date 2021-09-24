
package cn.lalisa.web.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>knowledgeAgency complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="knowledgeAgency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resKnowledgeAgency" type="{http://webservice.web.csjsite.baosight.com/}resKnowledgeAgency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "knowledgeAgency", propOrder = {
    "resKnowledgeAgency"
})
public class KnowledgeAgency {

    protected ResKnowledgeAgency resKnowledgeAgency;

    /**
     * ��ȡresKnowledgeAgency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResKnowledgeAgency }
     *     
     */
    public ResKnowledgeAgency getResKnowledgeAgency() {
        return resKnowledgeAgency;
    }

    /**
     * ����resKnowledgeAgency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResKnowledgeAgency }
     *     
     */
    public void setResKnowledgeAgency(ResKnowledgeAgency value) {
        this.resKnowledgeAgency = value;
    }

}
