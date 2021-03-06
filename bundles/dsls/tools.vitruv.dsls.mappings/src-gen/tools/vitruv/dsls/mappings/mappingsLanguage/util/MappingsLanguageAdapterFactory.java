/**
 * generated by Xtext 2.12.0
 */
package tools.vitruv.dsls.mappings.mappingsLanguage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tools.vitruv.dsls.mappings.mappingsLanguage.*;

import tools.vitruv.dsls.mirbase.mirBase.MirBaseFile;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage
 * @generated
 */
public class MappingsLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MappingsLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingsLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MappingsLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingsLanguageSwitch<Adapter> modelSwitch =
    new MappingsLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseMappingsFile(MappingsFile object)
      {
        return createMappingsFileAdapter();
      }
      @Override
      public Adapter caseMappingsSegment(MappingsSegment object)
      {
        return createMappingsSegmentAdapter();
      }
      @Override
      public Adapter caseMapping(Mapping object)
      {
        return createMappingAdapter();
      }
      @Override
      public Adapter caseDependency(Dependency object)
      {
        return createDependencyAdapter();
      }
      @Override
      public Adapter caseSingleSidedCondition(SingleSidedCondition object)
      {
        return createSingleSidedConditionAdapter();
      }
      @Override
      public Adapter caseEnforceableCondition(EnforceableCondition object)
      {
        return createEnforceableConditionAdapter();
      }
      @Override
      public Adapter caseFeatureCondition(FeatureCondition object)
      {
        return createFeatureConditionAdapter();
      }
      @Override
      public Adapter caseFeatureReference(FeatureReference object)
      {
        return createFeatureReferenceAdapter();
      }
      @Override
      public Adapter caseDependentFeatureReference(DependentFeatureReference object)
      {
        return createDependentFeatureReferenceAdapter();
      }
      @Override
      public Adapter caseSingleValueCondition(SingleValueCondition object)
      {
        return createSingleValueConditionAdapter();
      }
      @Override
      public Adapter caseValueCondition(ValueCondition object)
      {
        return createValueConditionAdapter();
      }
      @Override
      public Adapter caseValueExpression(ValueExpression object)
      {
        return createValueExpressionAdapter();
      }
      @Override
      public Adapter caseIndexCondition(IndexCondition object)
      {
        return createIndexConditionAdapter();
      }
      @Override
      public Adapter caseNumCompareCondition(NumCompareCondition object)
      {
        return createNumCompareConditionAdapter();
      }
      @Override
      public Adapter caseMultiValueCondition(MultiValueCondition object)
      {
        return createMultiValueConditionAdapter();
      }
      @Override
      public Adapter caseElementCondition(ElementCondition object)
      {
        return createElementConditionAdapter();
      }
      @Override
      public Adapter caseElementExpression(ElementExpression object)
      {
        return createElementExpressionAdapter();
      }
      @Override
      public Adapter caseNotEmptyCondition(NotEmptyCondition object)
      {
        return createNotEmptyConditionAdapter();
      }
      @Override
      public Adapter caseResourceCondition(ResourceCondition object)
      {
        return createResourceConditionAdapter();
      }
      @Override
      public Adapter caseCheckAndEnforceCondition(CheckAndEnforceCondition object)
      {
        return createCheckAndEnforceConditionAdapter();
      }
      @Override
      public Adapter caseCheckExpression(CheckExpression object)
      {
        return createCheckExpressionAdapter();
      }
      @Override
      public Adapter caseEnforceExpression(EnforceExpression object)
      {
        return createEnforceExpressionAdapter();
      }
      @Override
      public Adapter caseBidirectionalizableCondition(BidirectionalizableCondition object)
      {
        return createBidirectionalizableConditionAdapter();
      }
      @Override
      public Adapter caseBidirectionalizableExpression(BidirectionalizableExpression object)
      {
        return createBidirectionalizableExpressionAdapter();
      }
      @Override
      public Adapter caseUnidirectionalExpression(UnidirectionalExpression object)
      {
        return createUnidirectionalExpressionAdapter();
      }
      @Override
      public Adapter caseBootstrapping(Bootstrapping object)
      {
        return createBootstrappingAdapter();
      }
      @Override
      public Adapter caseCodeBlock(CodeBlock object)
      {
        return createCodeBlockAdapter();
      }
      @Override
      public Adapter caseDocumentable(Documentable object)
      {
        return createDocumentableAdapter();
      }
      @Override
      public Adapter caseMetaclassFeatureReference(MetaclassFeatureReference object)
      {
        return createMetaclassFeatureReferenceAdapter();
      }
      @Override
      public Adapter caseMirBaseFile(MirBaseFile object)
      {
        return createMirBaseFileAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.MappingsFile <em>Mappings File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsFile
   * @generated
   */
  public Adapter createMappingsFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.MappingsSegment <em>Mappings Segment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsSegment
   * @generated
   */
  public Adapter createMappingsSegmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.Mapping
   * @generated
   */
  public Adapter createMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.Dependency
   * @generated
   */
  public Adapter createDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.SingleSidedCondition <em>Single Sided Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.SingleSidedCondition
   * @generated
   */
  public Adapter createSingleSidedConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.EnforceableCondition <em>Enforceable Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.EnforceableCondition
   * @generated
   */
  public Adapter createEnforceableConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.FeatureCondition <em>Feature Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.FeatureCondition
   * @generated
   */
  public Adapter createFeatureConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.FeatureReference <em>Feature Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.FeatureReference
   * @generated
   */
  public Adapter createFeatureReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.DependentFeatureReference <em>Dependent Feature Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.DependentFeatureReference
   * @generated
   */
  public Adapter createDependentFeatureReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.SingleValueCondition <em>Single Value Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.SingleValueCondition
   * @generated
   */
  public Adapter createSingleValueConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.ValueCondition <em>Value Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.ValueCondition
   * @generated
   */
  public Adapter createValueConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.ValueExpression <em>Value Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.ValueExpression
   * @generated
   */
  public Adapter createValueExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.IndexCondition <em>Index Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.IndexCondition
   * @generated
   */
  public Adapter createIndexConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.NumCompareCondition <em>Num Compare Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.NumCompareCondition
   * @generated
   */
  public Adapter createNumCompareConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.MultiValueCondition <em>Multi Value Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.MultiValueCondition
   * @generated
   */
  public Adapter createMultiValueConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.ElementCondition <em>Element Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.ElementCondition
   * @generated
   */
  public Adapter createElementConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.ElementExpression <em>Element Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.ElementExpression
   * @generated
   */
  public Adapter createElementExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.NotEmptyCondition <em>Not Empty Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.NotEmptyCondition
   * @generated
   */
  public Adapter createNotEmptyConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.ResourceCondition <em>Resource Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.ResourceCondition
   * @generated
   */
  public Adapter createResourceConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.CheckAndEnforceCondition <em>Check And Enforce Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.CheckAndEnforceCondition
   * @generated
   */
  public Adapter createCheckAndEnforceConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.CheckExpression <em>Check Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.CheckExpression
   * @generated
   */
  public Adapter createCheckExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.EnforceExpression <em>Enforce Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.EnforceExpression
   * @generated
   */
  public Adapter createEnforceExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.BidirectionalizableCondition <em>Bidirectionalizable Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.BidirectionalizableCondition
   * @generated
   */
  public Adapter createBidirectionalizableConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.BidirectionalizableExpression <em>Bidirectionalizable Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.BidirectionalizableExpression
   * @generated
   */
  public Adapter createBidirectionalizableExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.UnidirectionalExpression <em>Unidirectional Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.UnidirectionalExpression
   * @generated
   */
  public Adapter createUnidirectionalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.Bootstrapping <em>Bootstrapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.Bootstrapping
   * @generated
   */
  public Adapter createBootstrappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.CodeBlock <em>Code Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.CodeBlock
   * @generated
   */
  public Adapter createCodeBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.Documentable <em>Documentable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.Documentable
   * @generated
   */
  public Adapter createDocumentableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mappings.mappingsLanguage.MetaclassFeatureReference <em>Metaclass Feature Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mappings.mappingsLanguage.MetaclassFeatureReference
   * @generated
   */
  public Adapter createMetaclassFeatureReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mirbase.mirBase.MirBaseFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mirbase.mirBase.MirBaseFile
   * @generated
   */
  public Adapter createMirBaseFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MappingsLanguageAdapterFactory
