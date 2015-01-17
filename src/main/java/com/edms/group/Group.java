//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.14 at 03:45:09 PM IST 
//


package com.edms.group;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noOfMembers" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modificationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memberList" type="{http://edms.com/group}membersList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group", propOrder = {
    "groupName",
    "noOfMembers",
    "creationDate",
    "modificationDate",
    "memberList"
})
public class Group {

    @XmlElement(name = "GroupName")
    protected String groupName;
    @XmlElement(required = true)
    protected BigInteger noOfMembers;
    @XmlElement(required = true)
    protected String creationDate;
    @XmlElement(required = true)
    protected String modificationDate;
    @XmlElement(required = true)
    protected MembersList memberList;

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the noOfMembers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoOfMembers() {
        return noOfMembers;
    }

    /**
     * Sets the value of the noOfMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoOfMembers(BigInteger value) {
        this.noOfMembers = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDate(String value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the modificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationDate() {
        return modificationDate;
    }

    /**
     * Sets the value of the modificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationDate(String value) {
        this.modificationDate = value;
    }

    /**
     * Gets the value of the memberList property.
     * 
     * @return
     *     possible object is
     *     {@link MembersList }
     *     
     */
    public MembersList getMemberList() {
        return memberList;
    }

    /**
     * Sets the value of the memberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembersList }
     *     
     */
    public void setMemberList(MembersList value) {
        this.memberList = value;
    }

}
