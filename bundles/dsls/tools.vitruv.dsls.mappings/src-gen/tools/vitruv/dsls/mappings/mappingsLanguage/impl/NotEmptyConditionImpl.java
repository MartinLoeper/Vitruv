/**
 * generated by Xtext 2.12.0
 */
package tools.vitruv.dsls.mappings.mappingsLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage;
import tools.vitruv.dsls.mappings.mappingsLanguage.NotEmptyCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Empty Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tools.vitruv.dsls.mappings.mappingsLanguage.impl.NotEmptyConditionImpl#isNegated <em>Negated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotEmptyConditionImpl extends FeatureConditionImpl implements NotEmptyCondition
{
  /**
   * The default value of the '{@link #isNegated() <em>Negated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNegated()
   * @generated
   * @ordered
   */
  protected static final boolean NEGATED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNegated() <em>Negated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNegated()
   * @generated
   * @ordered
   */
  protected boolean negated = NEGATED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NotEmptyConditionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MappingsLanguagePackage.Literals.NOT_EMPTY_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNegated()
  {
    return negated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNegated(boolean newNegated)
  {
    boolean oldNegated = negated;
    negated = newNegated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingsLanguagePackage.NOT_EMPTY_CONDITION__NEGATED, oldNegated, negated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MappingsLanguagePackage.NOT_EMPTY_CONDITION__NEGATED:
        return isNegated();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MappingsLanguagePackage.NOT_EMPTY_CONDITION__NEGATED:
        setNegated((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MappingsLanguagePackage.NOT_EMPTY_CONDITION__NEGATED:
        setNegated(NEGATED_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MappingsLanguagePackage.NOT_EMPTY_CONDITION__NEGATED:
        return negated != NEGATED_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (negated: ");
    result.append(negated);
    result.append(')');
    return result.toString();
  }

} //NotEmptyConditionImpl
