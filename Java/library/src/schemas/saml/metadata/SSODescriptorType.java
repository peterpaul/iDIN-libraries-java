
package schemas.saml.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SSODescriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SSODescriptorType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:SAML:2.0:metadata}RoleDescriptorType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}ArtifactResolutionService" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}SingleLogoutService" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}ManageNameIDService" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}NameIDFormat" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSODescriptorType", namespace = "urn:oasis:names:tc:SAML:2.0:metadata", propOrder = {
    "artifactResolutionService",
    "singleLogoutService",
    "manageNameIDService",
    "nameIDFormat"
})
@XmlSeeAlso({
    SPSSODescriptorType.class,
    IDPSSODescriptorType.class
})
public abstract class SSODescriptorType
    extends RoleDescriptorType
{

    @XmlElement(name = "ArtifactResolutionService")
    protected List<IndexedEndpointType> artifactResolutionService;
    @XmlElement(name = "SingleLogoutService")
    protected List<EndpointType> singleLogoutService;
    @XmlElement(name = "ManageNameIDService")
    protected List<EndpointType> manageNameIDService;
    @XmlElement(name = "NameIDFormat")
    @XmlSchemaType(name = "anyURI")
    protected List<String> nameIDFormat;

    /**
     * Gets the value of the artifactResolutionService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artifactResolutionService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtifactResolutionService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexedEndpointType }
     * 
     * 
     */
    public List<IndexedEndpointType> getArtifactResolutionService() {
        if (artifactResolutionService == null) {
            artifactResolutionService = new ArrayList<IndexedEndpointType>();
        }
        return this.artifactResolutionService;
    }

    /**
     * Gets the value of the singleLogoutService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the singleLogoutService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSingleLogoutService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndpointType }
     * 
     * 
     */
    public List<EndpointType> getSingleLogoutService() {
        if (singleLogoutService == null) {
            singleLogoutService = new ArrayList<EndpointType>();
        }
        return this.singleLogoutService;
    }

    /**
     * Gets the value of the manageNameIDService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manageNameIDService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManageNameIDService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndpointType }
     * 
     * 
     */
    public List<EndpointType> getManageNameIDService() {
        if (manageNameIDService == null) {
            manageNameIDService = new ArrayList<EndpointType>();
        }
        return this.manageNameIDService;
    }

    /**
     * Gets the value of the nameIDFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameIDFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameIDFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNameIDFormat() {
        if (nameIDFormat == null) {
            nameIDFormat = new ArrayList<String>();
        }
        return this.nameIDFormat;
    }

}
