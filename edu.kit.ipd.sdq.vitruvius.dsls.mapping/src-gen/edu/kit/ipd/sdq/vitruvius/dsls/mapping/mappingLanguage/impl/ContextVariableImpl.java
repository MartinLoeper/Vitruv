/**
 */
package edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl;

import edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ContextVariable;
import edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.MappingLanguagePackage;
import edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.NamedEClass;
import edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.RequiredMappingPathBase;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ContextVariableImpl#getRequiredMappingPath <em>Required Mapping Path</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ContextVariableImpl#getTargetClass <em>Target Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextVariableImpl extends MinimalEObjectImpl.Container implements ContextVariable
{
  /**
   * The cached value of the '{@link #getRequiredMappingPath() <em>Required Mapping Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredMappingPath()
   * @generated
   * @ordered
   */
  protected RequiredMappingPathBase requiredMappingPath;

  /**
   * The cached value of the '{@link #getTargetClass() <em>Target Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetClass()
   * @generated
   * @ordered
   */
  protected NamedEClass targetClass;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContextVariableImpl()
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
    return MappingLanguagePackage.Literals.CONTEXT_VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredMappingPathBase getRequiredMappingPath()
  {
    return requiredMappingPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequiredMappingPath(RequiredMappingPathBase newRequiredMappingPath, NotificationChain msgs)
  {
    RequiredMappingPathBase oldRequiredMappingPath = requiredMappingPath;
    requiredMappingPath = newRequiredMappingPath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingLanguagePackage.CONTEXT_VARIABLE__REQUIRED_MAPPING_PATH, oldRequiredMappingPath, newRequiredMappingPath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequiredMappingPath(RequiredMappingPathBase newRequiredMappingPath)
  {
    if (newRequiredMappingPath != requiredMappingPath)
    {
      NotificationChain msgs = null;
      if (requiredMappingPath != null)
        msgs = ((InternalEObject)requiredMappingPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingLanguagePackage.CONTEXT_VARIABLE__REQUIRED_MAPPING_PATH, null, msgs);
      if (newRequiredMappingPath != null)
        msgs = ((InternalEObject)newRequiredMappingPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingLanguagePackage.CONTEXT_VARIABLE__REQUIRED_MAPPING_PATH, null, msgs);
      msgs = basicSetRequiredMappingPath(newRequiredMappingPath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingLanguagePackage.CONTEXT_VARIABLE__REQUIRED_MAPPING_PATH, newRequiredMappingPath, newRequiredMappingPath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedEClass getTargetClass()
  {
    if (targetClass != null && targetClass.eIsProxy())
    {
      InternalEObject oldTargetClass = (InternalEObject)targetClass;
      targetClass = (NamedEClass)eResolveProxy(oldTargetClass);
      if (targetClass != oldTargetClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingLanguagePackage.CONTEXT_VARIABLE__TARGET_CLASS, oldTargetClass, targetClass));
      }
    }
    return targetClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedEClass basicGetTargetClass()
  {
    return targetClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetClass(NamedEClass newTargetClass)
  {
    NamedEClass oldTargetClass = targetClass;
    targetClass = newTargetClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingLanguagePackage.CONTEXT_VARIABLE__TARGET_CLASS, oldTargetClass, targetClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MappingLanguagePackage.CONTEXT_VARIABLE__REQUIRED_MAPPING_PATH:
        return basicSetRequiredMappingPath(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MappingLanguagePackage.CONTEXT_VARIABLE__REQUIRED_MAPPING_PATH:
        return getRequiredMappingPath();
      case MappingLanguagePackage.CONTEXT_VARIABLE__TARGET_CLASS:
        if (resolve) return getTargetClass();
        return basicGetTargetClass();
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
      case MappingLanguagePackage.CONTEXT_VARIABLE__REQUIRED_MAPPING_PATH:
        setRequiredMappingPath((RequiredMappingPathBase)newValue);
        return;
      case MappingLanguagePackage.CONTEXT_VARIABLE__TARGET_CLASS:
        setTargetClass((NamedEClass)newValue);
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
      case MappingLanguagePackage.CONTEXT_VARIABLE__REQUIRED_MAPPING_PATH:
        setRequiredMappingPath((RequiredMappingPathBase)null);
        return;
      case MappingLanguagePackage.CONTEXT_VARIABLE__TARGET_CLASS:
        setTargetClass((NamedEClass)null);
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
      case MappingLanguagePackage.CONTEXT_VARIABLE__REQUIRED_MAPPING_PATH:
        return requiredMappingPath != null;
      case MappingLanguagePackage.CONTEXT_VARIABLE__TARGET_CLASS:
        return targetClass != null;
    }
    return super.eIsSet(featureID);
  }

} //ContextVariableImpl
