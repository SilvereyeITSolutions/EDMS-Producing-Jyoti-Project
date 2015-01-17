//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.14 at 03:45:09 PM IST 
//


package com.edms.folder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FolderListReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FolderListReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FolderListResult" type="{http://edms.com/Folder}ArrayOfFolders" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderListReturn", propOrder = {
    "success",
    "folderListResult"
})
public class FolderListReturn {

    @XmlElement(name = "Success")
    protected boolean success;
    @XmlElement(name = "FolderListResult")
    protected ArrayOfFolders folderListResult;

    /**
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    /**
     * Gets the value of the folderListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFolders }
     *     
     */
    public ArrayOfFolders getFolderListResult() {
        return folderListResult;
    }

    /**
     * Sets the value of the folderListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFolders }
     *     
     */
    public void setFolderListResult(ArrayOfFolders value) {
        this.folderListResult = value;
    }

}
