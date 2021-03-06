/**
 * generated by Xtext 2.12.0
 */
package tools.vitruv.dsls.mappings.mappingsLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tools.vitruv.dsls.mappings.mappingsLanguage.ElementCondition#getElementExpression <em>Element Expression</em>}</li>
 * </ul>
 *
 * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage#getElementCondition()
 * @model
 * @generated
 */
public interface ElementCondition extends FeatureCondition
{
  /**
   * Returns the value of the '<em><b>Element Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Expression</em>' containment reference.
   * @see #setElementExpression(ElementExpression)
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage#getElementCondition_ElementExpression()
   * @model containment="true"
   * @generated
   */
  ElementExpression getElementExpression();

  /**
   * Sets the value of the '{@link tools.vitruv.dsls.mappings.mappingsLanguage.ElementCondition#getElementExpression <em>Element Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Expression</em>' containment reference.
   * @see #getElementExpression()
   * @generated
   */
  void setElementExpression(ElementExpression value);

} // ElementCondition
