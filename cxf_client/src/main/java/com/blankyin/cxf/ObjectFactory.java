
package com.blankyin.cxf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.blankyin.cxf package. 
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

    private final static QName _GetMapPersonsResponse_QNAME = new QName("http://cxf.blankyin.com/", "getMapPersonsResponse");
    private final static QName _SayHiResponse_QNAME = new QName("http://cxf.blankyin.com/", "sayHiResponse");
    private final static QName _GetListPersons_QNAME = new QName("http://cxf.blankyin.com/", "getListPersons");
    private final static QName _GetListPersonsResponse_QNAME = new QName("http://cxf.blankyin.com/", "getListPersonsResponse");
    private final static QName _GetMapPersons_QNAME = new QName("http://cxf.blankyin.com/", "getMapPersons");
    private final static QName _SayHi_QNAME = new QName("http://cxf.blankyin.com/", "sayHi");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.blankyin.cxf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHiResponse }
     * 
     */
    public SayHiResponse createSayHiResponse() {
        return new SayHiResponse();
    }

    /**
     * Create an instance of {@link GetMapPersonsResponse }
     * 
     */
    public GetMapPersonsResponse createGetMapPersonsResponse() {
        return new GetMapPersonsResponse();
    }

    /**
     * Create an instance of {@link GetListPersons }
     * 
     */
    public GetListPersons createGetListPersons() {
        return new GetListPersons();
    }

    /**
     * Create an instance of {@link GetListPersonsResponse }
     * 
     */
    public GetListPersonsResponse createGetListPersonsResponse() {
        return new GetListPersonsResponse();
    }

    /**
     * Create an instance of {@link SayHi }
     * 
     */
    public SayHi createSayHi() {
        return new SayHi();
    }

    /**
     * Create an instance of {@link GetMapPersons }
     * 
     */
    public GetMapPersons createGetMapPersons() {
        return new GetMapPersons();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link MapConvertor }
     * 
     */
    public MapConvertor createMapConvertor() {
        return new MapConvertor();
    }

    /**
     * Create an instance of {@link MapEntry }
     * 
     */
    public MapEntry createMapEntry() {
        return new MapEntry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMapPersonsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.blankyin.com/", name = "getMapPersonsResponse")
    public JAXBElement<GetMapPersonsResponse> createGetMapPersonsResponse(GetMapPersonsResponse value) {
        return new JAXBElement<GetMapPersonsResponse>(_GetMapPersonsResponse_QNAME, GetMapPersonsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.blankyin.com/", name = "sayHiResponse")
    public JAXBElement<SayHiResponse> createSayHiResponse(SayHiResponse value) {
        return new JAXBElement<SayHiResponse>(_SayHiResponse_QNAME, SayHiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListPersons }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.blankyin.com/", name = "getListPersons")
    public JAXBElement<GetListPersons> createGetListPersons(GetListPersons value) {
        return new JAXBElement<GetListPersons>(_GetListPersons_QNAME, GetListPersons.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListPersonsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.blankyin.com/", name = "getListPersonsResponse")
    public JAXBElement<GetListPersonsResponse> createGetListPersonsResponse(GetListPersonsResponse value) {
        return new JAXBElement<GetListPersonsResponse>(_GetListPersonsResponse_QNAME, GetListPersonsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMapPersons }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.blankyin.com/", name = "getMapPersons")
    public JAXBElement<GetMapPersons> createGetMapPersons(GetMapPersons value) {
        return new JAXBElement<GetMapPersons>(_GetMapPersons_QNAME, GetMapPersons.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.blankyin.com/", name = "sayHi")
    public JAXBElement<SayHi> createSayHi(SayHi value) {
        return new JAXBElement<SayHi>(_SayHi_QNAME, SayHi.class, null, value);
    }

}
