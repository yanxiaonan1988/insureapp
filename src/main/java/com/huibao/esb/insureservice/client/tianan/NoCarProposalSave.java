package com.huibao.esb.insureservice.client.tianan;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.4
 * 2015-03-25T14:51:14.493+08:00
 * Generated source version: 2.4.4
 * 
 */
@WebService(targetNamespace = "http://netSale.inters.service.interact.esb.sinosoft.com/", name = "NoCarProposalSave")
@XmlSeeAlso({ObjectFactory.class})
public interface NoCarProposalSave {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "doCarProposalSave", targetNamespace = "http://netSale.inters.service.interact.esb.sinosoft.com/", className = "com.huibao.esb.insureservice.client.tianan.DoCarProposalSave")
    @WebMethod
    @ResponseWrapper(localName = "doCarProposalSaveResponse", targetNamespace = "http://netSale.inters.service.interact.esb.sinosoft.com/", className = "com.huibao.esb.insureservice.client.tianan.DoCarProposalSaveResponse")
    public java.lang.String doCarProposalSave(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
