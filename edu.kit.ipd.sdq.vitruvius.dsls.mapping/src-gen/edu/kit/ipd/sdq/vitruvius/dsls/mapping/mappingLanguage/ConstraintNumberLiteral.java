/**
 */
package edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Number Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintNumberLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.MappingLanguagePackage#getConstraintNumberLiteral()
 * @model
 * @generated
 */
public interface ConstraintNumberLiteral extends ConstraintLiteral
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.MappingLanguagePackage#getConstraintNumberLiteral_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintNumberLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // ConstraintNumberLiteral
