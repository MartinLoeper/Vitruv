/**
 */
package edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.MappingLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface MappingLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mappingLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.kit.edu/ipd/sdq/vitruvius/dsls/mapping/MappingLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mappingLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MappingLanguagePackage eINSTANCE = edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingFileImpl <em>Mapping File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingFileImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getMappingFile()
   * @generated
   */
  int MAPPING_FILE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FILE__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FILE__MAPPINGS = 1;

  /**
   * The number of structural features of the '<em>Mapping File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ImportImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__NAME = 1;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingImpl <em>Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getMapping()
   * @generated
   */
  int MAPPING = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__NAME = 0;

  /**
   * The feature id for the '<em><b>Requires</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__REQUIRES = 1;

  /**
   * The feature id for the '<em><b>Signature0</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__SIGNATURE0 = 2;

  /**
   * The feature id for the '<em><b>Constraints0</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__CONSTRAINTS0 = 3;

  /**
   * The feature id for the '<em><b>Signature1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__SIGNATURE1 = 4;

  /**
   * The feature id for the '<em><b>Constraints1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__CONSTRAINTS1 = 5;

  /**
   * The feature id for the '<em><b>Constraints Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__CONSTRAINTS_BODY = 6;

  /**
   * The feature id for the '<em><b>Submappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__SUBMAPPINGS = 7;

  /**
   * The number of structural features of the '<em>Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.SignatureImpl <em>Signature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.SignatureImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getSignature()
   * @generated
   */
  int SIGNATURE = 3;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Signature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.NamedEClassImpl <em>Named EClass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.NamedEClassImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getNamedEClass()
   * @generated
   */
  int NAMED_ECLASS = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ECLASS__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ECLASS__NAME = 1;

  /**
   * The number of structural features of the '<em>Named EClass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ECLASS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.RequiredMappingImpl <em>Required Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.RequiredMappingImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getRequiredMapping()
   * @generated
   */
  int REQUIRED_MAPPING = 5;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_MAPPING__MAPPING = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_MAPPING__NAME = 1;

  /**
   * The number of structural features of the '<em>Required Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_MAPPING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintBlockImpl <em>Constraint Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintBlockImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getConstraintBlock()
   * @generated
   */
  int CONSTRAINT_BLOCK = 6;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_BLOCK__EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>Constraint Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintExpressionImpl <em>Constraint Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintExpressionImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getConstraintExpression()
   * @generated
   */
  int CONSTRAINT_EXPRESSION = 7;

  /**
   * The number of structural features of the '<em>Constraint Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.SignatureConstraintBlockImpl <em>Signature Constraint Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.SignatureConstraintBlockImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getSignatureConstraintBlock()
   * @generated
   */
  int SIGNATURE_CONSTRAINT_BLOCK = 8;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_CONSTRAINT_BLOCK__EXPRESSIONS = CONSTRAINT_BLOCK__EXPRESSIONS;

  /**
   * The number of structural features of the '<em>Signature Constraint Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_CONSTRAINT_BLOCK_FEATURE_COUNT = CONSTRAINT_BLOCK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.BodyConstraintBlockImpl <em>Body Constraint Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.BodyConstraintBlockImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getBodyConstraintBlock()
   * @generated
   */
  int BODY_CONSTRAINT_BLOCK = 9;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_CONSTRAINT_BLOCK__EXPRESSIONS = CONSTRAINT_BLOCK__EXPRESSIONS;

  /**
   * The number of structural features of the '<em>Body Constraint Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_CONSTRAINT_BLOCK_FEATURE_COUNT = CONSTRAINT_BLOCK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.FeatureOfContextVariableImpl <em>Feature Of Context Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.FeatureOfContextVariableImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getFeatureOfContextVariable()
   * @generated
   */
  int FEATURE_OF_CONTEXT_VARIABLE = 10;

  /**
   * The feature id for the '<em><b>Context</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_OF_CONTEXT_VARIABLE__CONTEXT = 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_OF_CONTEXT_VARIABLE__FEATURE = 1;

  /**
   * The number of structural features of the '<em>Feature Of Context Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_OF_CONTEXT_VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ContextVariableImpl <em>Context Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ContextVariableImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getContextVariable()
   * @generated
   */
  int CONTEXT_VARIABLE = 11;

  /**
   * The feature id for the '<em><b>Required Mapping Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_VARIABLE__REQUIRED_MAPPING_PATH = 0;

  /**
   * The feature id for the '<em><b>Target Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_VARIABLE__TARGET_CLASS = 1;

  /**
   * The number of structural features of the '<em>Context Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.RequiredMappingPathBaseImpl <em>Required Mapping Path Base</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.RequiredMappingPathBaseImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getRequiredMappingPathBase()
   * @generated
   */
  int REQUIRED_MAPPING_PATH_BASE = 12;

  /**
   * The feature id for the '<em><b>Required Mapping</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_MAPPING_PATH_BASE__REQUIRED_MAPPING = 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_MAPPING_PATH_BASE__TAIL = 1;

  /**
   * The number of structural features of the '<em>Required Mapping Path Base</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_MAPPING_PATH_BASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.RequiredMappingPathTailImpl <em>Required Mapping Path Tail</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.RequiredMappingPathTailImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getRequiredMappingPathTail()
   * @generated
   */
  int REQUIRED_MAPPING_PATH_TAIL = 13;

  /**
   * The feature id for the '<em><b>Required Mapping</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_MAPPING_PATH_TAIL__REQUIRED_MAPPING = 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_MAPPING_PATH_TAIL__TAIL = 1;

  /**
   * The number of structural features of the '<em>Required Mapping Path Tail</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_MAPPING_PATH_TAIL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintLiteralImpl <em>Constraint Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintLiteralImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getConstraintLiteral()
   * @generated
   */
  int CONSTRAINT_LITERAL = 14;

  /**
   * The number of structural features of the '<em>Constraint Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_LITERAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.VariableRefImpl <em>Variable Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.VariableRefImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getVariableRef()
   * @generated
   */
  int VARIABLE_REF = 15;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REF__TARGET = CONSTRAINT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REF_FEATURE_COUNT = CONSTRAINT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.InExpressionImpl <em>In Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.InExpressionImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getInExpression()
   * @generated
   */
  int IN_EXPRESSION = 16;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_EXPRESSION__TARGET = CONSTRAINT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_EXPRESSION__SOURCE = CONSTRAINT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>In Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_EXPRESSION_FEATURE_COUNT = CONSTRAINT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.EqualsLiteralExpressionImpl <em>Equals Literal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.EqualsLiteralExpressionImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getEqualsLiteralExpression()
   * @generated
   */
  int EQUALS_LITERAL_EXPRESSION = 17;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_LITERAL_EXPRESSION__TARGET = CONSTRAINT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_LITERAL_EXPRESSION__VALUE = CONSTRAINT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Equals Literal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_LITERAL_EXPRESSION_FEATURE_COUNT = CONSTRAINT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.AttributeEquivalenceExpressionImpl <em>Attribute Equivalence Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.AttributeEquivalenceExpressionImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getAttributeEquivalenceExpression()
   * @generated
   */
  int ATTRIBUTE_EQUIVALENCE_EXPRESSION = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_EQUIVALENCE_EXPRESSION__LEFT = CONSTRAINT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_EQUIVALENCE_EXPRESSION__RIGHT = CONSTRAINT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attribute Equivalence Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_EQUIVALENCE_EXPRESSION_FEATURE_COUNT = CONSTRAINT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintBooleanLiteralImpl <em>Constraint Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintBooleanLiteralImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getConstraintBooleanLiteral()
   * @generated
   */
  int CONSTRAINT_BOOLEAN_LITERAL = 19;

  /**
   * The feature id for the '<em><b>Is True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_BOOLEAN_LITERAL__IS_TRUE = CONSTRAINT_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constraint Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_BOOLEAN_LITERAL_FEATURE_COUNT = CONSTRAINT_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintNullLiteralImpl <em>Constraint Null Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintNullLiteralImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getConstraintNullLiteral()
   * @generated
   */
  int CONSTRAINT_NULL_LITERAL = 20;

  /**
   * The number of structural features of the '<em>Constraint Null Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_NULL_LITERAL_FEATURE_COUNT = CONSTRAINT_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintNumberLiteralImpl <em>Constraint Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintNumberLiteralImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getConstraintNumberLiteral()
   * @generated
   */
  int CONSTRAINT_NUMBER_LITERAL = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_NUMBER_LITERAL__VALUE = CONSTRAINT_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constraint Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_NUMBER_LITERAL_FEATURE_COUNT = CONSTRAINT_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintStringLiteralImpl <em>Constraint String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintStringLiteralImpl
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getConstraintStringLiteral()
   * @generated
   */
  int CONSTRAINT_STRING_LITERAL = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_STRING_LITERAL__VALUE = CONSTRAINT_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constraint String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_STRING_LITERAL_FEATURE_COUNT = CONSTRAINT_LITERAL_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.MappingFile <em>Mapping File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping File</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.MappingFile
   * @generated
   */
  EClass getMappingFile();

  /**
   * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.MappingFile#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.MappingFile#getImports()
   * @see #getMappingFile()
   * @generated
   */
  EReference getMappingFile_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.MappingFile#getMappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappings</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.MappingFile#getMappings()
   * @see #getMappingFile()
   * @generated
   */
  EReference getMappingFile_Mappings();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Import#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Package</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Import#getPackage()
   * @see #getImport()
   * @generated
   */
  EReference getImport_Package();

  /**
   * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Import#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Import#getName()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_Name();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Mapping
   * @generated
   */
  EClass getMapping();

  /**
   * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Mapping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Mapping#getName()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_Name();

  /**
   * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Mapping#getRequires <em>Requires</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requires</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Mapping#getRequires()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_Requires();

  /**
   * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Mapping#getSignature0 <em>Signature0</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Signature0</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Mapping#getSignature0()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_Signature0();

  /**
   * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Mapping#getConstraints0 <em>Constraints0</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraints0</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Mapping#getConstraints0()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_Constraints0();

  /**
   * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Mapping#getSignature1 <em>Signature1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Signature1</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Mapping#getSignature1()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_Signature1();

  /**
   * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Mapping#getConstraints1 <em>Constraints1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraints1</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Mapping#getConstraints1()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_Constraints1();

  /**
   * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Mapping#getConstraintsBody <em>Constraints Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraints Body</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Mapping#getConstraintsBody()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_ConstraintsBody();

  /**
   * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Mapping#getSubmappings <em>Submappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Submappings</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Mapping#getSubmappings()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_Submappings();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Signature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signature</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Signature
   * @generated
   */
  EClass getSignature();

  /**
   * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Signature#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.Signature#getElements()
   * @see #getSignature()
   * @generated
   */
  EReference getSignature_Elements();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.NamedEClass <em>Named EClass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named EClass</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.NamedEClass
   * @generated
   */
  EClass getNamedEClass();

  /**
   * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.NamedEClass#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.NamedEClass#getType()
   * @see #getNamedEClass()
   * @generated
   */
  EReference getNamedEClass_Type();

  /**
   * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.NamedEClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.NamedEClass#getName()
   * @see #getNamedEClass()
   * @generated
   */
  EAttribute getNamedEClass_Name();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.RequiredMapping <em>Required Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Mapping</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.RequiredMapping
   * @generated
   */
  EClass getRequiredMapping();

  /**
   * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.RequiredMapping#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Mapping</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.RequiredMapping#getMapping()
   * @see #getRequiredMapping()
   * @generated
   */
  EReference getRequiredMapping_Mapping();

  /**
   * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.RequiredMapping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.RequiredMapping#getName()
   * @see #getRequiredMapping()
   * @generated
   */
  EAttribute getRequiredMapping_Name();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintBlock <em>Constraint Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint Block</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintBlock
   * @generated
   */
  EClass getConstraintBlock();

  /**
   * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintBlock#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintBlock#getExpressions()
   * @see #getConstraintBlock()
   * @generated
   */
  EReference getConstraintBlock_Expressions();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintExpression <em>Constraint Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint Expression</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintExpression
   * @generated
   */
  EClass getConstraintExpression();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.SignatureConstraintBlock <em>Signature Constraint Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signature Constraint Block</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.SignatureConstraintBlock
   * @generated
   */
  EClass getSignatureConstraintBlock();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.BodyConstraintBlock <em>Body Constraint Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Constraint Block</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.BodyConstraintBlock
   * @generated
   */
  EClass getBodyConstraintBlock();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.FeatureOfContextVariable <em>Feature Of Context Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Of Context Variable</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.FeatureOfContextVariable
   * @generated
   */
  EClass getFeatureOfContextVariable();

  /**
   * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.FeatureOfContextVariable#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Context</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.FeatureOfContextVariable#getContext()
   * @see #getFeatureOfContextVariable()
   * @generated
   */
  EReference getFeatureOfContextVariable_Context();

  /**
   * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.FeatureOfContextVariable#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.FeatureOfContextVariable#getFeature()
   * @see #getFeatureOfContextVariable()
   * @generated
   */
  EReference getFeatureOfContextVariable_Feature();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ContextVariable <em>Context Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Variable</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ContextVariable
   * @generated
   */
  EClass getContextVariable();

  /**
   * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ContextVariable#getRequiredMappingPath <em>Required Mapping Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Required Mapping Path</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ContextVariable#getRequiredMappingPath()
   * @see #getContextVariable()
   * @generated
   */
  EReference getContextVariable_RequiredMappingPath();

  /**
   * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ContextVariable#getTargetClass <em>Target Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Class</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ContextVariable#getTargetClass()
   * @see #getContextVariable()
   * @generated
   */
  EReference getContextVariable_TargetClass();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.RequiredMappingPathBase <em>Required Mapping Path Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Mapping Path Base</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.RequiredMappingPathBase
   * @generated
   */
  EClass getRequiredMappingPathBase();

  /**
   * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.RequiredMappingPathBase#getRequiredMapping <em>Required Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Required Mapping</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.RequiredMappingPathBase#getRequiredMapping()
   * @see #getRequiredMappingPathBase()
   * @generated
   */
  EReference getRequiredMappingPathBase_RequiredMapping();

  /**
   * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.RequiredMappingPathBase#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tail</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.RequiredMappingPathBase#getTail()
   * @see #getRequiredMappingPathBase()
   * @generated
   */
  EReference getRequiredMappingPathBase_Tail();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.RequiredMappingPathTail <em>Required Mapping Path Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Mapping Path Tail</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.RequiredMappingPathTail
   * @generated
   */
  EClass getRequiredMappingPathTail();

  /**
   * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.RequiredMappingPathTail#getRequiredMapping <em>Required Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Required Mapping</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.RequiredMappingPathTail#getRequiredMapping()
   * @see #getRequiredMappingPathTail()
   * @generated
   */
  EReference getRequiredMappingPathTail_RequiredMapping();

  /**
   * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.RequiredMappingPathTail#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tail</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.RequiredMappingPathTail#getTail()
   * @see #getRequiredMappingPathTail()
   * @generated
   */
  EReference getRequiredMappingPathTail_Tail();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintLiteral <em>Constraint Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint Literal</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintLiteral
   * @generated
   */
  EClass getConstraintLiteral();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.VariableRef <em>Variable Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Ref</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.VariableRef
   * @generated
   */
  EClass getVariableRef();

  /**
   * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.VariableRef#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.VariableRef#getTarget()
   * @see #getVariableRef()
   * @generated
   */
  EReference getVariableRef_Target();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.InExpression <em>In Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Expression</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.InExpression
   * @generated
   */
  EClass getInExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.InExpression#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.InExpression#getTarget()
   * @see #getInExpression()
   * @generated
   */
  EReference getInExpression_Target();

  /**
   * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.InExpression#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.InExpression#getSource()
   * @see #getInExpression()
   * @generated
   */
  EReference getInExpression_Source();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.EqualsLiteralExpression <em>Equals Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equals Literal Expression</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.EqualsLiteralExpression
   * @generated
   */
  EClass getEqualsLiteralExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.EqualsLiteralExpression#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.EqualsLiteralExpression#getTarget()
   * @see #getEqualsLiteralExpression()
   * @generated
   */
  EReference getEqualsLiteralExpression_Target();

  /**
   * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.EqualsLiteralExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.EqualsLiteralExpression#getValue()
   * @see #getEqualsLiteralExpression()
   * @generated
   */
  EReference getEqualsLiteralExpression_Value();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.AttributeEquivalenceExpression <em>Attribute Equivalence Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Equivalence Expression</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.AttributeEquivalenceExpression
   * @generated
   */
  EClass getAttributeEquivalenceExpression();

  /**
   * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.AttributeEquivalenceExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.AttributeEquivalenceExpression#getLeft()
   * @see #getAttributeEquivalenceExpression()
   * @generated
   */
  EReference getAttributeEquivalenceExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.AttributeEquivalenceExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.AttributeEquivalenceExpression#getRight()
   * @see #getAttributeEquivalenceExpression()
   * @generated
   */
  EReference getAttributeEquivalenceExpression_Right();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintBooleanLiteral <em>Constraint Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint Boolean Literal</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintBooleanLiteral
   * @generated
   */
  EClass getConstraintBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintBooleanLiteral#isIsTrue <em>Is True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is True</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintBooleanLiteral#isIsTrue()
   * @see #getConstraintBooleanLiteral()
   * @generated
   */
  EAttribute getConstraintBooleanLiteral_IsTrue();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintNullLiteral <em>Constraint Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint Null Literal</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintNullLiteral
   * @generated
   */
  EClass getConstraintNullLiteral();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintNumberLiteral <em>Constraint Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint Number Literal</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintNumberLiteral
   * @generated
   */
  EClass getConstraintNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintNumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintNumberLiteral#getValue()
   * @see #getConstraintNumberLiteral()
   * @generated
   */
  EAttribute getConstraintNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintStringLiteral <em>Constraint String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint String Literal</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintStringLiteral
   * @generated
   */
  EClass getConstraintStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintStringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.ConstraintStringLiteral#getValue()
   * @see #getConstraintStringLiteral()
   * @generated
   */
  EAttribute getConstraintStringLiteral_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MappingLanguageFactory getMappingLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingFileImpl <em>Mapping File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingFileImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getMappingFile()
     * @generated
     */
    EClass MAPPING_FILE = eINSTANCE.getMappingFile();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_FILE__IMPORTS = eINSTANCE.getMappingFile_Imports();

    /**
     * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_FILE__MAPPINGS = eINSTANCE.getMappingFile_Mappings();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ImportImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT__PACKAGE = eINSTANCE.getImport_Package();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__NAME = eINSTANCE.getImport_Name();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingImpl <em>Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getMapping()
     * @generated
     */
    EClass MAPPING = eINSTANCE.getMapping();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__NAME = eINSTANCE.getMapping_Name();

    /**
     * The meta object literal for the '<em><b>Requires</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__REQUIRES = eINSTANCE.getMapping_Requires();

    /**
     * The meta object literal for the '<em><b>Signature0</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__SIGNATURE0 = eINSTANCE.getMapping_Signature0();

    /**
     * The meta object literal for the '<em><b>Constraints0</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__CONSTRAINTS0 = eINSTANCE.getMapping_Constraints0();

    /**
     * The meta object literal for the '<em><b>Signature1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__SIGNATURE1 = eINSTANCE.getMapping_Signature1();

    /**
     * The meta object literal for the '<em><b>Constraints1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__CONSTRAINTS1 = eINSTANCE.getMapping_Constraints1();

    /**
     * The meta object literal for the '<em><b>Constraints Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__CONSTRAINTS_BODY = eINSTANCE.getMapping_ConstraintsBody();

    /**
     * The meta object literal for the '<em><b>Submappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__SUBMAPPINGS = eINSTANCE.getMapping_Submappings();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.SignatureImpl <em>Signature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.SignatureImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getSignature()
     * @generated
     */
    EClass SIGNATURE = eINSTANCE.getSignature();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNATURE__ELEMENTS = eINSTANCE.getSignature_Elements();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.NamedEClassImpl <em>Named EClass</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.NamedEClassImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getNamedEClass()
     * @generated
     */
    EClass NAMED_ECLASS = eINSTANCE.getNamedEClass();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_ECLASS__TYPE = eINSTANCE.getNamedEClass_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ECLASS__NAME = eINSTANCE.getNamedEClass_Name();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.RequiredMappingImpl <em>Required Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.RequiredMappingImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getRequiredMapping()
     * @generated
     */
    EClass REQUIRED_MAPPING = eINSTANCE.getRequiredMapping();

    /**
     * The meta object literal for the '<em><b>Mapping</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRED_MAPPING__MAPPING = eINSTANCE.getRequiredMapping_Mapping();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRED_MAPPING__NAME = eINSTANCE.getRequiredMapping_Name();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintBlockImpl <em>Constraint Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintBlockImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getConstraintBlock()
     * @generated
     */
    EClass CONSTRAINT_BLOCK = eINSTANCE.getConstraintBlock();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_BLOCK__EXPRESSIONS = eINSTANCE.getConstraintBlock_Expressions();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintExpressionImpl <em>Constraint Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintExpressionImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getConstraintExpression()
     * @generated
     */
    EClass CONSTRAINT_EXPRESSION = eINSTANCE.getConstraintExpression();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.SignatureConstraintBlockImpl <em>Signature Constraint Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.SignatureConstraintBlockImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getSignatureConstraintBlock()
     * @generated
     */
    EClass SIGNATURE_CONSTRAINT_BLOCK = eINSTANCE.getSignatureConstraintBlock();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.BodyConstraintBlockImpl <em>Body Constraint Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.BodyConstraintBlockImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getBodyConstraintBlock()
     * @generated
     */
    EClass BODY_CONSTRAINT_BLOCK = eINSTANCE.getBodyConstraintBlock();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.FeatureOfContextVariableImpl <em>Feature Of Context Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.FeatureOfContextVariableImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getFeatureOfContextVariable()
     * @generated
     */
    EClass FEATURE_OF_CONTEXT_VARIABLE = eINSTANCE.getFeatureOfContextVariable();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_OF_CONTEXT_VARIABLE__CONTEXT = eINSTANCE.getFeatureOfContextVariable_Context();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_OF_CONTEXT_VARIABLE__FEATURE = eINSTANCE.getFeatureOfContextVariable_Feature();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ContextVariableImpl <em>Context Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ContextVariableImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getContextVariable()
     * @generated
     */
    EClass CONTEXT_VARIABLE = eINSTANCE.getContextVariable();

    /**
     * The meta object literal for the '<em><b>Required Mapping Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_VARIABLE__REQUIRED_MAPPING_PATH = eINSTANCE.getContextVariable_RequiredMappingPath();

    /**
     * The meta object literal for the '<em><b>Target Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_VARIABLE__TARGET_CLASS = eINSTANCE.getContextVariable_TargetClass();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.RequiredMappingPathBaseImpl <em>Required Mapping Path Base</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.RequiredMappingPathBaseImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getRequiredMappingPathBase()
     * @generated
     */
    EClass REQUIRED_MAPPING_PATH_BASE = eINSTANCE.getRequiredMappingPathBase();

    /**
     * The meta object literal for the '<em><b>Required Mapping</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRED_MAPPING_PATH_BASE__REQUIRED_MAPPING = eINSTANCE.getRequiredMappingPathBase_RequiredMapping();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRED_MAPPING_PATH_BASE__TAIL = eINSTANCE.getRequiredMappingPathBase_Tail();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.RequiredMappingPathTailImpl <em>Required Mapping Path Tail</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.RequiredMappingPathTailImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getRequiredMappingPathTail()
     * @generated
     */
    EClass REQUIRED_MAPPING_PATH_TAIL = eINSTANCE.getRequiredMappingPathTail();

    /**
     * The meta object literal for the '<em><b>Required Mapping</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRED_MAPPING_PATH_TAIL__REQUIRED_MAPPING = eINSTANCE.getRequiredMappingPathTail_RequiredMapping();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRED_MAPPING_PATH_TAIL__TAIL = eINSTANCE.getRequiredMappingPathTail_Tail();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintLiteralImpl <em>Constraint Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintLiteralImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getConstraintLiteral()
     * @generated
     */
    EClass CONSTRAINT_LITERAL = eINSTANCE.getConstraintLiteral();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.VariableRefImpl <em>Variable Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.VariableRefImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getVariableRef()
     * @generated
     */
    EClass VARIABLE_REF = eINSTANCE.getVariableRef();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_REF__TARGET = eINSTANCE.getVariableRef_Target();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.InExpressionImpl <em>In Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.InExpressionImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getInExpression()
     * @generated
     */
    EClass IN_EXPRESSION = eINSTANCE.getInExpression();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_EXPRESSION__TARGET = eINSTANCE.getInExpression_Target();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_EXPRESSION__SOURCE = eINSTANCE.getInExpression_Source();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.EqualsLiteralExpressionImpl <em>Equals Literal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.EqualsLiteralExpressionImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getEqualsLiteralExpression()
     * @generated
     */
    EClass EQUALS_LITERAL_EXPRESSION = eINSTANCE.getEqualsLiteralExpression();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALS_LITERAL_EXPRESSION__TARGET = eINSTANCE.getEqualsLiteralExpression_Target();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALS_LITERAL_EXPRESSION__VALUE = eINSTANCE.getEqualsLiteralExpression_Value();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.AttributeEquivalenceExpressionImpl <em>Attribute Equivalence Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.AttributeEquivalenceExpressionImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getAttributeEquivalenceExpression()
     * @generated
     */
    EClass ATTRIBUTE_EQUIVALENCE_EXPRESSION = eINSTANCE.getAttributeEquivalenceExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_EQUIVALENCE_EXPRESSION__LEFT = eINSTANCE.getAttributeEquivalenceExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_EQUIVALENCE_EXPRESSION__RIGHT = eINSTANCE.getAttributeEquivalenceExpression_Right();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintBooleanLiteralImpl <em>Constraint Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintBooleanLiteralImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getConstraintBooleanLiteral()
     * @generated
     */
    EClass CONSTRAINT_BOOLEAN_LITERAL = eINSTANCE.getConstraintBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Is True</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT_BOOLEAN_LITERAL__IS_TRUE = eINSTANCE.getConstraintBooleanLiteral_IsTrue();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintNullLiteralImpl <em>Constraint Null Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintNullLiteralImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getConstraintNullLiteral()
     * @generated
     */
    EClass CONSTRAINT_NULL_LITERAL = eINSTANCE.getConstraintNullLiteral();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintNumberLiteralImpl <em>Constraint Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintNumberLiteralImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getConstraintNumberLiteral()
     * @generated
     */
    EClass CONSTRAINT_NUMBER_LITERAL = eINSTANCE.getConstraintNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT_NUMBER_LITERAL__VALUE = eINSTANCE.getConstraintNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintStringLiteralImpl <em>Constraint String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.ConstraintStringLiteralImpl
     * @see edu.kit.ipd.sdq.vitruvius.dsls.mapping.mappingLanguage.impl.MappingLanguagePackageImpl#getConstraintStringLiteral()
     * @generated
     */
    EClass CONSTRAINT_STRING_LITERAL = eINSTANCE.getConstraintStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT_STRING_LITERAL__VALUE = eINSTANCE.getConstraintStringLiteral_Value();

  }

} //MappingLanguagePackage