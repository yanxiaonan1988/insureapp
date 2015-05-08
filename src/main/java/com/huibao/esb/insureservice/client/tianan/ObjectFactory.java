
package com.huibao.esb.insureservice.client.tianan;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.huibao.esb.insureservice.client.tianan package. 
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

    private final static QName _DoCarProposalSave_QNAME = new QName("http://netSale.inters.service.interact.esb.sinosoft.com/", "doCarProposalSave");
    private final static QName _DoCarProposalSaveResponse_QNAME = new QName("http://netSale.inters.service.interact.esb.sinosoft.com/", "doCarProposalSaveResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.huibao.esb.insureservice.client.tianan
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoCarProposalSaveResponse }
     * 
     */
    public DoCarProposalSaveResponse createDoCarProposalSaveResponse() {
        return new DoCarProposalSaveResponse();
    }

    /**
     * Create an instance of {@link DoCarProposalSave }
     * 
     */
    public DoCarProposalSave createDoCarProposalSave() {
        return new DoCarProposalSave();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoCarProposalSave }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://netSale.inters.service.interact.esb.sinosoft.com/", name = "doCarProposalSave")
    public JAXBElement<DoCarProposalSave> createDoCarProposalSave(DoCarProposalSave value) {
        return new JAXBElement<DoCarProposalSave>(_DoCarProposalSave_QNAME, DoCarProposalSave.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoCarProposalSaveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://netSale.inters.service.interact.esb.sinosoft.com/", name = "doCarProposalSaveResponse")
    public JAXBElement<DoCarProposalSaveResponse> createDoCarProposalSaveResponse(DoCarProposalSaveResponse value) {
        return new JAXBElement<DoCarProposalSaveResponse>(_DoCarProposalSaveResponse_QNAME, DoCarProposalSaveResponse.class, null, value);
    }

}
