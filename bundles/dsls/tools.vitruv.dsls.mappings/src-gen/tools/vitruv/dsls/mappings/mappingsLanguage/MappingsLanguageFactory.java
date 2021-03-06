/**
 * generated by Xtext 2.12.0
 */
package tools.vitruv.dsls.mappings.mappingsLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage
 * @generated
 */
public interface MappingsLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MappingsLanguageFactory eINSTANCE = tools.vitruv.dsls.mappings.mappingsLanguage.impl.MappingsLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Mappings File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mappings File</em>'.
   * @generated
   */
  MappingsFile createMappingsFile();

  /**
   * Returns a new object of class '<em>Mappings Segment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mappings Segment</em>'.
   * @generated
   */
  MappingsSegment createMappingsSegment();

  /**
   * Returns a new object of class '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping</em>'.
   * @generated
   */
  Mapping createMapping();

  /**
   * Returns a new object of class '<em>Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependency</em>'.
   * @generated
   */
  Dependency createDependency();

  /**
   * Returns a new object of class '<em>Single Sided Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Sided Condition</em>'.
   * @generated
   */
  SingleSidedCondition createSingleSidedCondition();

  /**
   * Returns a new object of class '<em>Enforceable Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enforceable Condition</em>'.
   * @generated
   */
  EnforceableCondition createEnforceableCondition();

  /**
   * Returns a new object of class '<em>Feature Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Condition</em>'.
   * @generated
   */
  FeatureCondition createFeatureCondition();

  /**
   * Returns a new object of class '<em>Feature Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Reference</em>'.
   * @generated
   */
  FeatureReference createFeatureReference();

  /**
   * Returns a new object of class '<em>Dependent Feature Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependent Feature Reference</em>'.
   * @generated
   */
  DependentFeatureReference createDependentFeatureReference();

  /**
   * Returns a new object of class '<em>Single Value Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Value Condition</em>'.
   * @generated
   */
  SingleValueCondition createSingleValueCondition();

  /**
   * Returns a new object of class '<em>Value Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Condition</em>'.
   * @generated
   */
  ValueCondition createValueCondition();

  /**
   * Returns a new object of class '<em>Value Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Expression</em>'.
   * @generated
   */
  ValueExpression createValueExpression();

  /**
   * Returns a new object of class '<em>Index Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Index Condition</em>'.
   * @generated
   */
  IndexCondition createIndexCondition();

  /**
   * Returns a new object of class '<em>Num Compare Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Num Compare Condition</em>'.
   * @generated
   */
  NumCompareCondition createNumCompareCondition();

  /**
   * Returns a new object of class '<em>Multi Value Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Value Condition</em>'.
   * @generated
   */
  MultiValueCondition createMultiValueCondition();

  /**
   * Returns a new object of class '<em>Element Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Condition</em>'.
   * @generated
   */
  ElementCondition createElementCondition();

  /**
   * Returns a new object of class '<em>Element Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Expression</em>'.
   * @generated
   */
  ElementExpression createElementExpression();

  /**
   * Returns a new object of class '<em>Not Empty Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Empty Condition</em>'.
   * @generated
   */
  NotEmptyCondition createNotEmptyCondition();

  /**
   * Returns a new object of class '<em>Resource Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Condition</em>'.
   * @generated
   */
  ResourceCondition createResourceCondition();

  /**
   * Returns a new object of class '<em>Check And Enforce Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Check And Enforce Condition</em>'.
   * @generated
   */
  CheckAndEnforceCondition createCheckAndEnforceCondition();

  /**
   * Returns a new object of class '<em>Check Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Check Expression</em>'.
   * @generated
   */
  CheckExpression createCheckExpression();

  /**
   * Returns a new object of class '<em>Enforce Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enforce Expression</em>'.
   * @generated
   */
  EnforceExpression createEnforceExpression();

  /**
   * Returns a new object of class '<em>Bidirectionalizable Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bidirectionalizable Condition</em>'.
   * @generated
   */
  BidirectionalizableCondition createBidirectionalizableCondition();

  /**
   * Returns a new object of class '<em>Bidirectionalizable Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bidirectionalizable Expression</em>'.
   * @generated
   */
  BidirectionalizableExpression createBidirectionalizableExpression();

  /**
   * Returns a new object of class '<em>Unidirectional Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unidirectional Expression</em>'.
   * @generated
   */
  UnidirectionalExpression createUnidirectionalExpression();

  /**
   * Returns a new object of class '<em>Bootstrapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bootstrapping</em>'.
   * @generated
   */
  Bootstrapping createBootstrapping();

  /**
   * Returns a new object of class '<em>Code Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Code Block</em>'.
   * @generated
   */
  CodeBlock createCodeBlock();

  /**
   * Returns a new object of class '<em>Documentable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Documentable</em>'.
   * @generated
   */
  Documentable createDocumentable();

  /**
   * Returns a new object of class '<em>Metaclass Feature Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metaclass Feature Reference</em>'.
   * @generated
   */
  MetaclassFeatureReference createMetaclassFeatureReference();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MappingsLanguagePackage getMappingsLanguagePackage();

} //MappingsLanguageFactory
