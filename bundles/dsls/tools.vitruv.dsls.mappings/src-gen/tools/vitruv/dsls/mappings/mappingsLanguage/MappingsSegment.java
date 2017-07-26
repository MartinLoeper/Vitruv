/**
 * generated by Xtext 2.12.0
 */
package tools.vitruv.dsls.mappings.mappingsLanguage;

import org.eclipse.emf.common.util.EList;

import tools.vitruv.dsls.mirbase.mirBase.DomainReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mappings Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tools.vitruv.dsls.mappings.mappingsLanguage.MappingsSegment#getName <em>Name</em>}</li>
 *   <li>{@link tools.vitruv.dsls.mappings.mappingsLanguage.MappingsSegment#getLeftDomain <em>Left Domain</em>}</li>
 *   <li>{@link tools.vitruv.dsls.mappings.mappingsLanguage.MappingsSegment#getRightDomain <em>Right Domain</em>}</li>
 *   <li>{@link tools.vitruv.dsls.mappings.mappingsLanguage.MappingsSegment#getMappings <em>Mappings</em>}</li>
 *   <li>{@link tools.vitruv.dsls.mappings.mappingsLanguage.MappingsSegment#getBootstrapMappings <em>Bootstrap Mappings</em>}</li>
 * </ul>
 *
 * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage#getMappingsSegment()
 * @model
 * @generated
 */
public interface MappingsSegment extends Documentable
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage#getMappingsSegment_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link tools.vitruv.dsls.mappings.mappingsLanguage.MappingsSegment#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Left Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Domain</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Domain</em>' containment reference.
   * @see #setLeftDomain(DomainReference)
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage#getMappingsSegment_LeftDomain()
   * @model containment="true"
   * @generated
   */
  DomainReference getLeftDomain();

  /**
   * Sets the value of the '{@link tools.vitruv.dsls.mappings.mappingsLanguage.MappingsSegment#getLeftDomain <em>Left Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Domain</em>' containment reference.
   * @see #getLeftDomain()
   * @generated
   */
  void setLeftDomain(DomainReference value);

  /**
   * Returns the value of the '<em><b>Right Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Domain</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Domain</em>' containment reference.
   * @see #setRightDomain(DomainReference)
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage#getMappingsSegment_RightDomain()
   * @model containment="true"
   * @generated
   */
  DomainReference getRightDomain();

  /**
   * Sets the value of the '{@link tools.vitruv.dsls.mappings.mappingsLanguage.MappingsSegment#getRightDomain <em>Right Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Domain</em>' containment reference.
   * @see #getRightDomain()
   * @generated
   */
  void setRightDomain(DomainReference value);

  /**
   * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
   * The list contents are of type {@link tools.vitruv.dsls.mappings.mappingsLanguage.Mapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappings</em>' containment reference list.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage#getMappingsSegment_Mappings()
   * @model containment="true"
   * @generated
   */
  EList<Mapping> getMappings();

  /**
   * Returns the value of the '<em><b>Bootstrap Mappings</b></em>' containment reference list.
   * The list contents are of type {@link tools.vitruv.dsls.mappings.mappingsLanguage.BootstrapMapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bootstrap Mappings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bootstrap Mappings</em>' containment reference list.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage#getMappingsSegment_BootstrapMappings()
   * @model containment="true"
   * @generated
   */
  EList<BootstrapMapping> getBootstrapMappings();

} // MappingsSegment
