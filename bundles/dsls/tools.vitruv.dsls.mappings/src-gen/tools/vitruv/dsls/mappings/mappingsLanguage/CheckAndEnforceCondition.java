/**
 * generated by Xtext 2.12.0
 */
package tools.vitruv.dsls.mappings.mappingsLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check And Enforce Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tools.vitruv.dsls.mappings.mappingsLanguage.CheckAndEnforceCondition#getCheckExpression <em>Check Expression</em>}</li>
 *   <li>{@link tools.vitruv.dsls.mappings.mappingsLanguage.CheckAndEnforceCondition#getEnforceExpression <em>Enforce Expression</em>}</li>
 * </ul>
 *
 * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage#getCheckAndEnforceCondition()
 * @model
 * @generated
 */
public interface CheckAndEnforceCondition extends SingleSidedCondition
{
  /**
   * Returns the value of the '<em><b>Check Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Check Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Check Expression</em>' containment reference.
   * @see #setCheckExpression(CheckExpression)
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage#getCheckAndEnforceCondition_CheckExpression()
   * @model containment="true"
   * @generated
   */
  CheckExpression getCheckExpression();

  /**
   * Sets the value of the '{@link tools.vitruv.dsls.mappings.mappingsLanguage.CheckAndEnforceCondition#getCheckExpression <em>Check Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Check Expression</em>' containment reference.
   * @see #getCheckExpression()
   * @generated
   */
  void setCheckExpression(CheckExpression value);

  /**
   * Returns the value of the '<em><b>Enforce Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enforce Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enforce Expression</em>' containment reference.
   * @see #setEnforceExpression(CheckExpression)
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage#getCheckAndEnforceCondition_EnforceExpression()
   * @model containment="true"
   * @generated
   */
  CheckExpression getEnforceExpression();

  /**
   * Sets the value of the '{@link tools.vitruv.dsls.mappings.mappingsLanguage.CheckAndEnforceCondition#getEnforceExpression <em>Enforce Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enforce Expression</em>' containment reference.
   * @see #getEnforceExpression()
   * @generated
   */
  void setEnforceExpression(CheckExpression value);

} // CheckAndEnforceCondition
