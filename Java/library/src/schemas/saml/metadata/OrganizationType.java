
package schemas.saml.metadata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for OrganizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}Extensions" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}OrganizationName" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}OrganizationDisplayName" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}OrganizationURL" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationType", namespace = "urn:oasis:names:tc:SAML:2.0:metadata", propOrder = {
    "extensions",
    "organizationName",
    "organizationDisplayName",
    "organizationURL"
})
public class OrganizationType {

    @XmlElement(name = "Extensions")
    protected ExtensionsType extensions;
    @XmlElement(name = "OrganizationName", required = true)
    protected List<LocalizedNameType> organizationName;
    @XmlElement(name = "OrganizationDisplayName", required = true)
    protected List<LocalizedNameType> organizationDisplayName;
    @XmlElement(name = "OrganizationURL", required = true)
    protected List<LocalizedURIType> organizationURL;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsType }
     *     
     */
    public ExtensionsType getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsType }
     *     
     */
    public void setExtensions(ExtensionsType value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizedNameType }
     * 
     * 
     */
    public List<LocalizedNameType> getOrganizationName() {
        if (organizationName == null) {
            organizationName = new ArrayList<LocalizedNameType>();
        }
        return this.organizationName;
    }

    /**
     * Gets the value of the organizationDisplayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationDisplayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationDisplayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizedNameType }
     * 
     * 
     */
    public List<LocalizedNameType> getOrganizationDisplayName() {
        if (organizationDisplayName == null) {
            organizationDisplayName = new ArrayList<LocalizedNameType>();
        }
        return this.organizationDisplayName;
    }

    /**
     * Gets the value of the organizationURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizedURIType }
     * 
     * 
     */
    public List<LocalizedURIType> getOrganizationURL() {
        if (organizationURL == null) {
            organizationURL = new ArrayList<LocalizedURIType>();
        }
        return this.organizationURL;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
