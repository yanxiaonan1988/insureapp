
package com.huibao.esb.insureservice.client.tiananquery;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.huibao.esb.insureservice.client.tiananquery package. 
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

    private final static QName _DoPolicyQueryDetail_QNAME = new QName("http://netSale.inters.service.interact.esb.sinosoft.com/", "doPolicyQueryDetail");
    private final static QName _DoPolicyQueryDetailResponse_QNAME = new QName("http://netSale.inters.service.interact.esb.sinosoft.com/", "doPolicyQueryDetailResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.huibao.esb.insureservice.client.tiananquery
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoPolicyQueryDetailResponse }
     * 
     */
    public DoPolicyQueryDetailResponse createDoPolicyQueryDetailResponse() {
        return new DoPolicyQueryDetailResponse();
    }

    /**
     * Create an instance of {@link DoPolicyQueryDetail }
     * 
     */
    public DoPolicyQueryDetail createDoPolicyQueryDetail() {
        return new DoPolicyQueryDetail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoPolicyQueryDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://netSale.inters.service.interact.esb.sinosoft.com/", name = "doPolicyQueryDetail")
    public JAXBElement<DoPolicyQueryDetail> createDoPolicyQueryDetail(DoPolicyQueryDetail value) {
        return new JAXBElement<DoPolicyQueryDetail>(_DoPolicyQueryDetail_QNAME, DoPolicyQueryDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoPolicyQueryDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://netSale.inters.service.interact.esb.sinosoft.com/", name = "doPolicyQueryDetailResponse")
    public JAXBElement<DoPolicyQueryDetailResponse> createDoPolicyQueryDetailResponse(DoPolicyQueryDetailResponse value) {
        return new JAXBElement<DoPolicyQueryDetailResponse>(_DoPolicyQueryDetailResponse_QNAME, DoPolicyQueryDetailResponse.class, null, value);
    }

}
