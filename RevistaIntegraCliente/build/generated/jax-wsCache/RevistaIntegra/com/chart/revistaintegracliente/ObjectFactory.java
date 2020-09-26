
package com.chart.revistaintegracliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chart.revistaintegracliente package. 
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

    private final static QName _PesquisarDepartamento_QNAME = new QName("http://revistaintegra.cha.com/", "pesquisarDepartamento");
    private final static QName _PesquisarDepartamentoResponse_QNAME = new QName("http://revistaintegra.cha.com/", "pesquisarDepartamentoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chart.revistaintegracliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PesquisarDepartamento }
     * 
     */
    public PesquisarDepartamento createPesquisarDepartamento() {
        return new PesquisarDepartamento();
    }

    /**
     * Create an instance of {@link PesquisarDepartamentoResponse }
     * 
     */
    public PesquisarDepartamentoResponse createPesquisarDepartamentoResponse() {
        return new PesquisarDepartamentoResponse();
    }

    /**
     * Create an instance of {@link Departamento }
     * 
     */
    public Departamento createDepartamento() {
        return new Departamento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarDepartamento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://revistaintegra.cha.com/", name = "pesquisarDepartamento")
    public JAXBElement<PesquisarDepartamento> createPesquisarDepartamento(PesquisarDepartamento value) {
        return new JAXBElement<PesquisarDepartamento>(_PesquisarDepartamento_QNAME, PesquisarDepartamento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarDepartamentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://revistaintegra.cha.com/", name = "pesquisarDepartamentoResponse")
    public JAXBElement<PesquisarDepartamentoResponse> createPesquisarDepartamentoResponse(PesquisarDepartamentoResponse value) {
        return new JAXBElement<PesquisarDepartamentoResponse>(_PesquisarDepartamentoResponse_QNAME, PesquisarDepartamentoResponse.class, null, value);
    }

}
