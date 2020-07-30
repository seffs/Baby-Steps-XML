//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.10 at 12:46:46 AM CEST 
//


package com.jaxb.generated;

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
 *         &lt;element ref="{http://it-checks.de/rechnungen/XML}ANREDE" minOccurs="0"/>
 *         &lt;element ref="{http://it-checks.de/rechnungen/XML}UNTERNEHMENSNAME"/>
 *         &lt;element ref="{http://it-checks.de/rechnungen/XML}ADDRESSE"/>
 *         &lt;element ref="{http://it-checks.de/rechnungen/XML}PLZ_ORT"/>
 *         &lt;element ref="{http://it-checks.de/rechnungen/XML}TELEFONNUMMER1"/>
 *         &lt;element ref="{http://it-checks.de/rechnungen/XML}TELEFONNUMMER2" minOccurs="0"/>
 *         &lt;element ref="{http://it-checks.de/rechnungen/XML}EMAIL" minOccurs="0"/>
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
    "anrede",
    "unternehmensname",
    "addresse",
    "plzort",
    "telefonnummer1",
    "telefonnummer2",
    "email"
})
@XmlRootElement(name = "UNTERNEHMENDANTEN")
public class UNTERNEHMENDANTEN {

    @XmlElement(name = "ANREDE")
    protected String anrede;
    @XmlElement(name = "UNTERNEHMENSNAME", required = true)
    protected String unternehmensname;
    @XmlElement(name = "ADDRESSE", required = true)
    protected String addresse;
    @XmlElement(name = "PLZ_ORT", required = true)
    protected String plzort;
    @XmlElement(name = "TELEFONNUMMER1", required = true)
    protected String telefonnummer1;
    @XmlElement(name = "TELEFONNUMMER2")
    protected String telefonnummer2;
    @XmlElement(name = "EMAIL")
    protected String email;

    /**
     * Gets the value of the anrede property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANREDE() {
        return anrede;
    }

    /**
     * Sets the value of the anrede property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANREDE(String value) {
        this.anrede = value;
    }

    /**
     * Gets the value of the unternehmensname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNTERNEHMENSNAME() {
        return unternehmensname;
    }

    /**
     * Sets the value of the unternehmensname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNTERNEHMENSNAME(String value) {
        this.unternehmensname = value;
    }

    /**
     * Gets the value of the addresse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDRESSE() {
        return addresse;
    }

    /**
     * Sets the value of the addresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDRESSE(String value) {
        this.addresse = value;
    }

    /**
     * Gets the value of the plzort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLZORT() {
        return plzort;
    }

    /**
     * Sets the value of the plzort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLZORT(String value) {
        this.plzort = value;
    }

    /**
     * Gets the value of the telefonnummer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEFONNUMMER1() {
        return telefonnummer1;
    }

    /**
     * Sets the value of the telefonnummer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEFONNUMMER1(String value) {
        this.telefonnummer1 = value;
    }

    /**
     * Gets the value of the telefonnummer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEFONNUMMER2() {
        return telefonnummer2;
    }

    /**
     * Sets the value of the telefonnummer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEFONNUMMER2(String value) {
        this.telefonnummer2 = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAIL() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAIL(String value) {
        this.email = value;
    }

}