
package schemas.saml.assertion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AuthnStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthnStatementType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:SAML:2.0:assertion}StatementAbstractType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}SubjectLocality" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}AuthnContext"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AuthnInstant" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="SessionIndex" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SessionNotOnOrAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthnStatementType", propOrder = {
    "subjectLocality",
    "authnContext"
})
public class AuthnStatementType
    extends StatementAbstractType
{

    @XmlElement(name = "SubjectLocality")
    protected SubjectLocalityType subjectLocality;
    @XmlElement(name = "AuthnContext", required = true)
    protected AuthnContextType authnContext;
    @XmlAttribute(name = "AuthnInstant", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authnInstant;
    @XmlAttribute(name = "SessionIndex")
    protected String sessionIndex;
    @XmlAttribute(name = "SessionNotOnOrAfter")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sessionNotOnOrAfter;

    /**
     * Gets the value of the subjectLocality property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectLocalityType }
     *     
     */
    public SubjectLocalityType getSubjectLocality() {
        return subjectLocality;
    }

    /**
     * Sets the value of the subjectLocality property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectLocalityType }
     *     
     */
    public void setSubjectLocality(SubjectLocalityType value) {
        this.subjectLocality = value;
    }

    /**
     * Gets the value of the authnContext property.
     * 
     * @return
     *     possible object is
     *     {@link AuthnContextType }
     *     
     */
    public AuthnContextType getAuthnContext() {
        return authnContext;
    }

    /**
     * Sets the value of the authnContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthnContextType }
     *     
     */
    public void setAuthnContext(AuthnContextType value) {
        this.authnContext = value;
    }

    /**
     * Gets the value of the authnInstant property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthnInstant() {
        return authnInstant;
    }

    /**
     * Sets the value of the authnInstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthnInstant(XMLGregorianCalendar value) {
        this.authnInstant = value;
    }

    /**
     * Gets the value of the sessionIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionIndex() {
        return sessionIndex;
    }

    /**
     * Sets the value of the sessionIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionIndex(String value) {
        this.sessionIndex = value;
    }

    /**
     * Gets the value of the sessionNotOnOrAfter property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSessionNotOnOrAfter() {
        return sessionNotOnOrAfter;
    }

    /**
     * Sets the value of the sessionNotOnOrAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSessionNotOnOrAfter(XMLGregorianCalendar value) {
        this.sessionNotOnOrAfter = value;
    }

}
