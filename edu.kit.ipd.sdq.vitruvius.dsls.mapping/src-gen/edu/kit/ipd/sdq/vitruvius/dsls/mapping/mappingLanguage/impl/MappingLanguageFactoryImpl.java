/**
 */
package edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl;

import edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingLanguageFactoryImpl extends EFactoryImpl implements MappingLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MappingLanguageFactory init()
  {
    try
    {
      MappingLanguageFactory theMappingLanguageFactory = (MappingLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(MappingLanguagePackage.eNS_URI);
      if (theMappingLanguageFactory != null)
      {
        return theMappingLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MappingLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MappingLanguagePackage.MAPPING_FILE: return createMappingFile();
      case MappingLanguagePackage.IMPORT: return createImport();
      case MappingLanguagePackage.MAPPING: return createMapping();
      case MappingLanguagePackage.SIGNATURE: return createSignature();
      case MappingLanguagePackage.NAMED_ECLASS: return createNamedEClass();
      case MappingLanguagePackage.REQUIRED_MAPPING: return createRequiredMapping();
      case MappingLanguagePackage.CONSTRAINT_BLOCK: return createConstraintBlock();
      case MappingLanguagePackage.CONSTRAINT_EXPRESSION: return createConstraintExpression();
      case MappingLanguagePackage.SIGNATURE_CONSTRAINT_BLOCK: return createSignatureConstraintBlock();
      case MappingLanguagePackage.BODY_CONSTRAINT_BLOCK: return createBodyConstraintBlock();
      case MappingLanguagePackage.FEATURE_OF_CONTEXT_VARIABLE: return createFeatureOfContextVariable();
      case MappingLanguagePackage.CONTEXT_VARIABLE: return createContextVariable();
      case MappingLanguagePackage.REQUIRED_MAPPING_PATH_BASE: return createRequiredMappingPathBase();
      case MappingLanguagePackage.REQUIRED_MAPPING_PATH_TAIL: return createRequiredMappingPathTail();
      case MappingLanguagePackage.CONSTRAINT_LITERAL: return createConstraintLiteral();
      case MappingLanguagePackage.VARIABLE_REF: return createVariableRef();
      case MappingLanguagePackage.IN_EXPRESSION: return createInExpression();
      case MappingLanguagePackage.EQUALS_LITERAL_EXPRESSION: return createEqualsLiteralExpression();
      case MappingLanguagePackage.ATTRIBUTE_EQUIVALENCE_EXPRESSION: return createAttributeEquivalenceExpression();
      case MappingLanguagePackage.CONSTRAINT_BOOLEAN_LITERAL: return createConstraintBooleanLiteral();
      case MappingLanguagePackage.CONSTRAINT_NULL_LITERAL: return createConstraintNullLiteral();
      case MappingLanguagePackage.CONSTRAINT_NUMBER_LITERAL: return createConstraintNumberLiteral();
      case MappingLanguagePackage.CONSTRAINT_STRING_LITERAL: return createConstraintStringLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingFile createMappingFile()
  {
    MappingFileImpl mappingFile = new MappingFileImpl();
    return mappingFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping createMapping()
  {
    MappingImpl mapping = new MappingImpl();
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signature createSignature()
  {
    SignatureImpl signature = new SignatureImpl();
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedEClass createNamedEClass()
  {
    NamedEClassImpl namedEClass = new NamedEClassImpl();
    return namedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredMapping createRequiredMapping()
  {
    RequiredMappingImpl requiredMapping = new RequiredMappingImpl();
    return requiredMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintBlock createConstraintBlock()
  {
    ConstraintBlockImpl constraintBlock = new ConstraintBlockImpl();
    return constraintBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintExpression createConstraintExpression()
  {
    ConstraintExpressionImpl constraintExpression = new ConstraintExpressionImpl();
    return constraintExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignatureConstraintBlock createSignatureConstraintBlock()
  {
    SignatureConstraintBlockImpl signatureConstraintBlock = new SignatureConstraintBlockImpl();
    return signatureConstraintBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyConstraintBlock createBodyConstraintBlock()
  {
    BodyConstraintBlockImpl bodyConstraintBlock = new BodyConstraintBlockImpl();
    return bodyConstraintBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureOfContextVariable createFeatureOfContextVariable()
  {
    FeatureOfContextVariableImpl featureOfContextVariable = new FeatureOfContextVariableImpl();
    return featureOfContextVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextVariable createContextVariable()
  {
    ContextVariableImpl contextVariable = new ContextVariableImpl();
    return contextVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredMappingPathBase createRequiredMappingPathBase()
  {
    RequiredMappingPathBaseImpl requiredMappingPathBase = new RequiredMappingPathBaseImpl();
    return requiredMappingPathBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredMappingPathTail createRequiredMappingPathTail()
  {
    RequiredMappingPathTailImpl requiredMappingPathTail = new RequiredMappingPathTailImpl();
    return requiredMappingPathTail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintLiteral createConstraintLiteral()
  {
    ConstraintLiteralImpl constraintLiteral = new ConstraintLiteralImpl();
    return constraintLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableRef createVariableRef()
  {
    VariableRefImpl variableRef = new VariableRefImpl();
    return variableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InExpression createInExpression()
  {
    InExpressionImpl inExpression = new InExpressionImpl();
    return inExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqualsLiteralExpression createEqualsLiteralExpression()
  {
    EqualsLiteralExpressionImpl equalsLiteralExpression = new EqualsLiteralExpressionImpl();
    return equalsLiteralExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeEquivalenceExpression createAttributeEquivalenceExpression()
  {
    AttributeEquivalenceExpressionImpl attributeEquivalenceExpression = new AttributeEquivalenceExpressionImpl();
    return attributeEquivalenceExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintBooleanLiteral createConstraintBooleanLiteral()
  {
    ConstraintBooleanLiteralImpl constraintBooleanLiteral = new ConstraintBooleanLiteralImpl();
    return constraintBooleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintNullLiteral createConstraintNullLiteral()
  {
    ConstraintNullLiteralImpl constraintNullLiteral = new ConstraintNullLiteralImpl();
    return constraintNullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintNumberLiteral createConstraintNumberLiteral()
  {
    ConstraintNumberLiteralImpl constraintNumberLiteral = new ConstraintNumberLiteralImpl();
    return constraintNumberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintStringLiteral createConstraintStringLiteral()
  {
    ConstraintStringLiteralImpl constraintStringLiteral = new ConstraintStringLiteralImpl();
    return constraintStringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingLanguagePackage getMappingLanguagePackage()
  {
    return (MappingLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MappingLanguagePackage getPackage()
  {
    return MappingLanguagePackage.eINSTANCE;
  }

} //MappingLanguageFactoryImpl
