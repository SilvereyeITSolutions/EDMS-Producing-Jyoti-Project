//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.17 at 01:46:14 PM IST 
//


package com.edms.workflowhistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistDetVrblInstUpdateEntityReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistDetVrblInstUpdateEntityReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="histDetVrblInstUpdateEntity" type="{http://edms.com/WorkflowHistory}HistDetVrblInstUpdateEntity"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistDetVrblInstUpdateEntityReturn", propOrder = {
    "histDetVrblInstUpdateEntity"
})
public class HistDetVrblInstUpdateEntityReturn {

    @XmlElement(required = true)
    protected HistDetVrblInstUpdateEntity histDetVrblInstUpdateEntity;

    /**
     * Gets the value of the histDetVrblInstUpdateEntity property.
     * 
     * @return
     *     possible object is
     *     {@link HistDetVrblInstUpdateEntity }
     *     
     */
    public HistDetVrblInstUpdateEntity getHistDetVrblInstUpdateEntity() {
        return histDetVrblInstUpdateEntity;
    }

    /**
     * Sets the value of the histDetVrblInstUpdateEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistDetVrblInstUpdateEntity }
     *     
     */
    public void setHistDetVrblInstUpdateEntity(HistDetVrblInstUpdateEntity value) {
        this.histDetVrblInstUpdateEntity = value;
    }

}
