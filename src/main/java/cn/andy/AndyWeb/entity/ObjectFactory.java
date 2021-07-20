
package cn.andy.AndyWeb.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.baosight.csjsite.TestWsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _KnowledgeAgency_QNAME = new QName("http://webservice.web.csjsite.baosight.com/", "knowledgeAgency");
    private final static QName _KnowledgeAgencyResponse_QNAME = new QName("http://webservice.web.csjsite.baosight.com/", "knowledgeAgencyResponse");
    private final static QName _BatchKnowledgeAgencyResponse_QNAME = new QName("http://webservice.web.csjsite.baosight.com/", "batchKnowledgeAgencyResponse");
    private final static QName _BatchKnowledgeAgency_QNAME = new QName("http://webservice.web.csjsite.baosight.com/", "batchKnowledgeAgency");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.baosight.csjsite.TestWsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BatchKnowledgeAgency }
     * 
     */
    public BatchKnowledgeAgency createBatchKnowledgeAgency() {
        return new BatchKnowledgeAgency();
    }

    /**
     * Create an instance of {@link BatchKnowledgeAgencyResponse }
     * 
     */
    public BatchKnowledgeAgencyResponse createBatchKnowledgeAgencyResponse() {
        return new BatchKnowledgeAgencyResponse();
    }

    /**
     * Create an instance of {@link KnowledgeAgency }
     * 
     */
    public KnowledgeAgency createKnowledgeAgency() {
        return new KnowledgeAgency();
    }

    /**
     * Create an instance of {@link KnowledgeAgencyResponse }
     * 
     */
    public KnowledgeAgencyResponse createKnowledgeAgencyResponse() {
        return new KnowledgeAgencyResponse();
    }

    /**
     * Create an instance of {@link ResKnowledgeAgency }
     * 
     */
    public ResKnowledgeAgency createResKnowledgeAgency() {
        return new ResKnowledgeAgency();
    }

    /**
     * Create an instance of {@link FailMessage }
     * 
     */
    public FailMessage createFailMessage() {
        return new FailMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KnowledgeAgency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.web.csjsite.baosight.com/", name = "knowledgeAgency")
    public JAXBElement<KnowledgeAgency> createKnowledgeAgency(KnowledgeAgency value) {
        return new JAXBElement<KnowledgeAgency>(_KnowledgeAgency_QNAME, KnowledgeAgency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KnowledgeAgencyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.web.csjsite.baosight.com/", name = "knowledgeAgencyResponse")
    public JAXBElement<KnowledgeAgencyResponse> createKnowledgeAgencyResponse(KnowledgeAgencyResponse value) {
        return new JAXBElement<KnowledgeAgencyResponse>(_KnowledgeAgencyResponse_QNAME, KnowledgeAgencyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchKnowledgeAgencyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.web.csjsite.baosight.com/", name = "batchKnowledgeAgencyResponse")
    public JAXBElement<BatchKnowledgeAgencyResponse> createBatchKnowledgeAgencyResponse(BatchKnowledgeAgencyResponse value) {
        return new JAXBElement<BatchKnowledgeAgencyResponse>(_BatchKnowledgeAgencyResponse_QNAME, BatchKnowledgeAgencyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchKnowledgeAgency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.web.csjsite.baosight.com/", name = "batchKnowledgeAgency")
    public JAXBElement<BatchKnowledgeAgency> createBatchKnowledgeAgency(BatchKnowledgeAgency value) {
        return new JAXBElement<BatchKnowledgeAgency>(_BatchKnowledgeAgency_QNAME, BatchKnowledgeAgency.class, null, value);
    }

}
