/**
 * generated by Xtext 2.12.0
 */
package tools.vitruv.dsls.mappings.mappingsLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tools.vitruv.dsls.mirbase.mirBase.NamedMetaclassReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bootstrapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tools.vitruv.dsls.mappings.mappingsLanguage.Bootstrapping#getName <em>Name</em>}</li>
 *   <li>{@link tools.vitruv.dsls.mappings.mappingsLanguage.Bootstrapping#getParameters <em>Parameters</em>}</li>
 *   <li>{@link tools.vitruv.dsls.mappings.mappingsLanguage.Bootstrapping#getBootstrapConditon <em>Bootstrap Conditon</em>}</li>
 * </ul>
 *
 * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage#getBootstrapping()
 * @model
 * @generated
 */
public interface Bootstrapping extends EObject
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
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage#getBootstrapping_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link tools.vitruv.dsls.mappings.mappingsLanguage.Bootstrapping#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link tools.vitruv.dsls.mirbase.mirBase.NamedMetaclassReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage#getBootstrapping_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<NamedMetaclassReference> getParameters();

  /**
   * Returns the value of the '<em><b>Bootstrap Conditon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bootstrap Conditon</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bootstrap Conditon</em>' containment reference.
   * @see #setBootstrapConditon(SingleSidedCondition)
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage#getBootstrapping_BootstrapConditon()
   * @model containment="true"
   * @generated
   */
  SingleSidedCondition getBootstrapConditon();

  /**
   * Sets the value of the '{@link tools.vitruv.dsls.mappings.mappingsLanguage.Bootstrapping#getBootstrapConditon <em>Bootstrap Conditon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bootstrap Conditon</em>' containment reference.
   * @see #getBootstrapConditon()
   * @generated
   */
  void setBootstrapConditon(SingleSidedCondition value);

} // Bootstrapping
