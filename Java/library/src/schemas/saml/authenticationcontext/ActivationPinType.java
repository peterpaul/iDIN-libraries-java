
package schemas.saml.authenticationcontext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivationPinType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivationPinType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}Length" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}Alphabet" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}Generation" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}ActivationLimit" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivationPinType", propOrder = {
    "length",
    "alphabet",
    "generation",
    "activationLimit",
    "extension"
})
public class ActivationPinType {

    @XmlElement(name = "Length")
    protected LengthType length;
    @XmlElement(name = "Alphabet")
    protected AlphabetType alphabet;
    @XmlElement(name = "Generation")
    protected Generation generation;
    @XmlElement(name = "ActivationLimit")
    protected ActivationLimitType activationLimit;
    @XmlElement(name = "Extension")
    protected List<ExtensionType> extension;

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setLength(LengthType value) {
        this.length = value;
    }

    /**
     * Gets the value of the alphabet property.
     * 
     * @return
     *     possible object is
     *     {@link AlphabetType }
     *     
     */
    public AlphabetType getAlphabet() {
        return alphabet;
    }

    /**
     * Sets the value of the alphabet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlphabetType }
     *     
     */
    public void setAlphabet(AlphabetType value) {
        this.alphabet = value;
    }

    /**
     * Gets the value of the generation property.
     * 
     * @return
     *     possible object is
     *     {@link Generation }
     *     
     */
    public Generation getGeneration() {
        return generation;
    }

    /**
     * Sets the value of the generation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Generation }
     *     
     */
    public void setGeneration(Generation value) {
        this.generation = value;
    }

    /**
     * Gets the value of the activationLimit property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationLimitType }
     *     
     */
    public ActivationLimitType getActivationLimit() {
        return activationLimit;
    }

    /**
     * Sets the value of the activationLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationLimitType }
     *     
     */
    public void setActivationLimit(ActivationLimitType value) {
        this.activationLimit = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ExtensionType>();
        }
        return this.extension;
    }

}
