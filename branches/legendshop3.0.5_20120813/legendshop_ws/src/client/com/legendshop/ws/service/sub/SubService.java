package com.legendshop.ws.service.sub;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2012-08-06T22:58:21.397+08:00
 * Generated source version: 2.6.1
 * 
 */
@WebService(targetNamespace = "http://sub.service.ws.legendshop.com", name = "subService")
@XmlSeeAlso({ObjectFactory.class})
public interface SubService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "exportOrderService", targetNamespace = "http://sub.service.ws.legendshop.com", className = "com.legendshop.ws.service.sub.ExportOrderService")
    @WebMethod
    @ResponseWrapper(localName = "exportOrderServiceResponse", targetNamespace = "http://sub.service.ws.legendshop.com", className = "com.legendshop.ws.service.sub.ExportOrderServiceResponse")
    public java.lang.String exportOrderService(
        @WebParam(name = "sub", targetNamespace = "")
        com.legendshop.ws.service.sub.Sub sub
    );
}