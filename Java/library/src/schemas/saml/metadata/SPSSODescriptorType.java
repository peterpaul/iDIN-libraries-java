
package schemas.saml.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SPSSODescriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SPSSODescriptorType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:SAML:2.0:metadata}SSODescriptorType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}AssertionConsumerService" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}AttributeConsumingService" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AuthnRequestsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="WantAssertionsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPSSODescriptorType", namespace = "urn:oasis:names:tc:SAML:2.0:metadata", propOrder = {
    "assertionConsumerService",
    "attributeConsumingService"
})
public class SPSSODescriptorType
    extends SSODescriptorType
{

    @XmlElement(name = "AssertionConsumerService", required = true)
    protected List<IndexedEndpointType> assertionConsumerService;
    @XmlElement(name = "AttributeConsumingService")
    protected List<AttributeConsumingServiceType> attributeConsumingService;
    @XmlAttribute(name = "AuthnRequestsSigned")
    protected Boolean authnRequestsSigned;
    @XmlAttribute(name = "WantAssertionsSigned")
    protected Boolean wantAssertionsSigned;

    /**
     * Gets the value of the assertionConsumerService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assertionConsumerService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssertionConsumerService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexedEndpointType }
     * 
     * 
     */
    public List<IndexedEndpointType> getAssertionConsumerService() {
        if (assertionConsumerService == null) {
            assertionConsumerService = new ArrayList<IndexedEndpointType>();
        }
        return this.assertionConsumerService;
    }

    /**
     * Gets the value of the attributeConsumingService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeConsumingService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeConsumingService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeConsumingServiceType }
     * 
     * 
     */
    public List<AttributeConsumingServiceType> getAttributeConsumingService() {
        if (attributeConsumingService == null) {
            attributeConsumingService = new ArrayList<AttributeConsumingServiceType>();
        }
        return this.attributeConsumingService;
    }

    /**
     * Gets the value of the authnRequestsSigned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthnRequestsSigned() {
        return authnRequestsSigned;
    }

    /**
     * Sets the value of the authnRequestsSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthnRequestsSigned(Boolean value) {
        this.authnRequestsSigned = value;
    }

    /**
     * Gets the value of the wantAssertionsSigned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantAssertionsSigned() {
        return wantAssertionsSigned;
    }

    /**
     * Sets the value of the wantAssertionsSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantAssertionsSigned(Boolean value) {
        this.wantAssertionsSigned = value;
    }

}
