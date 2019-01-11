
package schemas.saml.metadata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * <p>Java class for EntityDescriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityDescriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}Extensions" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}RoleDescriptor"/>
 *             &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}IDPSSODescriptor"/>
 *             &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}SPSSODescriptor"/>
 *             &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}AuthnAuthorityDescriptor"/>
 *             &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}AttributeAuthorityDescriptor"/>
 *             &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}PDPDescriptor"/>
 *           &lt;/choice>
 *           &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}AffiliationDescriptor"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}Organization" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}ContactPerson" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}AdditionalMetadataLocation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="entityID" use="required" type="{urn:oasis:names:tc:SAML:2.0:metadata}entityIDType" />
 *       &lt;attribute name="validUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="cacheDuration" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityDescriptorType", namespace = "urn:oasis:names:tc:SAML:2.0:metadata", propOrder = {
    "signature",
    "extensions",
    "roleDescriptorOrIDPSSODescriptorOrSPSSODescriptor",
    "affiliationDescriptor",
    "organization",
    "contactPerson",
    "additionalMetadataLocation"
})
public class EntityDescriptorType {

    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;
    @XmlElement(name = "Extensions")
    protected ExtensionsType extensions;
    @XmlElements({
        @XmlElement(name = "IDPSSODescriptor", type = IDPSSODescriptorType.class),
        @XmlElement(name = "SPSSODescriptor", type = SPSSODescriptorType.class),
        @XmlElement(name = "RoleDescriptor"),
        @XmlElement(name = "AuthnAuthorityDescriptor", type = AuthnAuthorityDescriptorType.class),
        @XmlElement(name = "AttributeAuthorityDescriptor", type = AttributeAuthorityDescriptorType.class),
        @XmlElement(name = "PDPDescriptor", type = PDPDescriptorType.class)
    })
    protected List<RoleDescriptorType> roleDescriptorOrIDPSSODescriptorOrSPSSODescriptor;
    @XmlElement(name = "AffiliationDescriptor")
    protected AffiliationDescriptorType affiliationDescriptor;
    @XmlElement(name = "Organization")
    protected OrganizationType organization;
    @XmlElement(name = "ContactPerson")
    protected List<ContactType> contactPerson;
    @XmlElement(name = "AdditionalMetadataLocation")
    protected List<AdditionalMetadataLocationType> additionalMetadataLocation;
    @XmlAttribute(required = true)
    protected String entityID;
    @XmlAttribute
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validUntil;
    @XmlAttribute
    protected Duration cacheDuration;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

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
     * Gets the value of the roleDescriptorOrIDPSSODescriptorOrSPSSODescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleDescriptorOrIDPSSODescriptorOrSPSSODescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleDescriptorOrIDPSSODescriptorOrSPSSODescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDPSSODescriptorType }
     * {@link SPSSODescriptorType }
     * {@link RoleDescriptorType }
     * {@link AuthnAuthorityDescriptorType }
     * {@link AttributeAuthorityDescriptorType }
     * {@link PDPDescriptorType }
     * 
     * 
     */
    public List<RoleDescriptorType> getRoleDescriptorOrIDPSSODescriptorOrSPSSODescriptor() {
        if (roleDescriptorOrIDPSSODescriptorOrSPSSODescriptor == null) {
            roleDescriptorOrIDPSSODescriptorOrSPSSODescriptor = new ArrayList<RoleDescriptorType>();
        }
        return this.roleDescriptorOrIDPSSODescriptorOrSPSSODescriptor;
    }

    /**
     * Gets the value of the affiliationDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link AffiliationDescriptorType }
     *     
     */
    public AffiliationDescriptorType getAffiliationDescriptor() {
        return affiliationDescriptor;
    }

    /**
     * Sets the value of the affiliationDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliationDescriptorType }
     *     
     */
    public void setAffiliationDescriptor(AffiliationDescriptorType value) {
        this.affiliationDescriptor = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationType }
     *     
     */
    public OrganizationType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationType }
     *     
     */
    public void setOrganization(OrganizationType value) {
        this.organization = value;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactType }
     * 
     * 
     */
    public List<ContactType> getContactPerson() {
        if (contactPerson == null) {
            contactPerson = new ArrayList<ContactType>();
        }
        return this.contactPerson;
    }

    /**
     * Gets the value of the additionalMetadataLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalMetadataLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalMetadataLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalMetadataLocationType }
     * 
     * 
     */
    public List<AdditionalMetadataLocationType> getAdditionalMetadataLocation() {
        if (additionalMetadataLocation == null) {
            additionalMetadataLocation = new ArrayList<AdditionalMetadataLocationType>();
        }
        return this.additionalMetadataLocation;
    }

    /**
     * Gets the value of the entityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityID() {
        return entityID;
    }

    /**
     * Sets the value of the entityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityID(String value) {
        this.entityID = value;
    }

    /**
     * Gets the value of the validUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidUntil() {
        return validUntil;
    }

    /**
     * Sets the value of the validUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidUntil(XMLGregorianCalendar value) {
        this.validUntil = value;
    }

    /**
     * Gets the value of the cacheDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getCacheDuration() {
        return cacheDuration;
    }

    /**
     * Sets the value of the cacheDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setCacheDuration(Duration value) {
        this.cacheDuration = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
