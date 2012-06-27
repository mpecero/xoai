//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.13 at 08:24:23 PM WET 
//

package com.lyncode.xoai.common.dataprovider.xml.oaipmh;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListIdentifiersType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ListIdentifiersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://www.openarchives.org/OAI/2.0/}headerType" maxOccurs="unbounded"/>
 *         &lt;element name="resumptionToken" type="{http://www.openarchives.org/OAI/2.0/}resumptionTokenType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListIdentifiersType", propOrder = { "header",
		"resumptionToken" })
public class ListIdentifiersType {

	@XmlElement(required = true)
	protected List<HeaderType> header;
	protected ResumptionTokenType resumptionToken;

	/**
	 * Gets the value of the header property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the header property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getHeader().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link HeaderType }
	 * 
	 * 
	 */
	public List<HeaderType> getHeader() {
		if (header == null) {
			header = new ArrayList<HeaderType>();
		}
		return this.header;
	}

	/**
	 * Gets the value of the resumptionToken property.
	 * 
	 * @return possible object is {@link ResumptionTokenType }
	 * 
	 */
	public ResumptionTokenType getResumptionToken() {
		return resumptionToken;
	}

	/**
	 * Sets the value of the resumptionToken property.
	 * 
	 * @param value
	 *            allowed object is {@link ResumptionTokenType }
	 * 
	 */
	public void setResumptionToken(ResumptionTokenType value) {
		this.resumptionToken = value;
	}

}
