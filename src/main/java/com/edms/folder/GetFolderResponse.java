//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.17 at 01:46:14 PM IST 
//


package com.edms.folder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetFoldersByParentFolder" type="{http://edms.com/Folder}FolderListReturn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getFoldersByParentFolder"
})
@XmlRootElement(name = "getFolderResponse")
public class GetFolderResponse {

    @XmlElement(name = "GetFoldersByParentFolder")
    protected FolderListReturn getFoldersByParentFolder;

    /**
     * Gets the value of the getFoldersByParentFolder property.
     * 
     * @return
     *     possible object is
     *     {@link FolderListReturn }
     *     
     */
    public FolderListReturn getGetFoldersByParentFolder() {
        return getFoldersByParentFolder;
    }

    /**
     * Sets the value of the getFoldersByParentFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderListReturn }
     *     
     */
    public void setGetFoldersByParentFolder(FolderListReturn value) {
        this.getFoldersByParentFolder = value;
    }

}
