/**
 * generated by Xtext 2.12.0
 */
package tools.vitruv.dsls.mappings.mappingsLanguage;

import tools.vitruv.dsls.mirbase.mirBase.MetaclassFeatureReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependent Feature Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tools.vitruv.dsls.mappings.mappingsLanguage.DependentFeatureReference#getDependeeShortName <em>Dependee Short Name</em>}</li>
 *   <li>{@link tools.vitruv.dsls.mappings.mappingsLanguage.DependentFeatureReference#getDependeeFeature <em>Dependee Feature</em>}</li>
 * </ul>
 *
 * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage#getDependentFeatureReference()
 * @model
 * @generated
 */
public interface DependentFeatureReference extends FeatureReference
{
  /**
   * Returns the value of the '<em><b>Dependee Short Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependee Short Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependee Short Name</em>' reference.
   * @see #setDependeeShortName(Dependency)
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage#getDependentFeatureReference_DependeeShortName()
   * @model
   * @generated
   */
  Dependency getDependeeShortName();

  /**
   * Sets the value of the '{@link tools.vitruv.dsls.mappings.mappingsLanguage.DependentFeatureReference#getDependeeShortName <em>Dependee Short Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dependee Short Name</em>' reference.
   * @see #getDependeeShortName()
   * @generated
   */
  void setDependeeShortName(Dependency value);

  /**
   * Returns the value of the '<em><b>Dependee Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependee Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependee Feature</em>' containment reference.
   * @see #setDependeeFeature(MetaclassFeatureReference)
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage#getDependentFeatureReference_DependeeFeature()
   * @model containment="true"
   * @generated
   */
  MetaclassFeatureReference getDependeeFeature();

  /**
   * Sets the value of the '{@link tools.vitruv.dsls.mappings.mappingsLanguage.DependentFeatureReference#getDependeeFeature <em>Dependee Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dependee Feature</em>' containment reference.
   * @see #getDependeeFeature()
   * @generated
   */
  void setDependeeFeature(MetaclassFeatureReference value);

} // DependentFeatureReference
