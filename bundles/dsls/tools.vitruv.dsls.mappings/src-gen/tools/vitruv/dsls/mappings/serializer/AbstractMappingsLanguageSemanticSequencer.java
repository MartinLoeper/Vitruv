/*
 * generated by Xtext 2.12.0
 */
package tools.vitruv.dsls.mappings.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmInnerTypeReference;
import org.eclipse.xtext.common.types.JvmLowerBound;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XListLiteral;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XPostfixOperation;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSetLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;
import org.eclipse.xtext.xtype.XtypePackage;
import tools.vitruv.dsls.mappings.mappingsLanguage.BootstrapMapping;
import tools.vitruv.dsls.mappings.mappingsLanguage.CodeBlock;
import tools.vitruv.dsls.mappings.mappingsLanguage.Condition;
import tools.vitruv.dsls.mappings.mappingsLanguage.Dependency;
import tools.vitruv.dsls.mappings.mappingsLanguage.DependentFeatureReference;
import tools.vitruv.dsls.mappings.mappingsLanguage.EnforceableCondition;
import tools.vitruv.dsls.mappings.mappingsLanguage.FeatureCondition;
import tools.vitruv.dsls.mappings.mappingsLanguage.Mapping;
import tools.vitruv.dsls.mappings.mappingsLanguage.MappingsFile;
import tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage;
import tools.vitruv.dsls.mappings.mappingsLanguage.MappingsSegment;
import tools.vitruv.dsls.mappings.mappingsLanguage.MetaclassFeatureReference;
import tools.vitruv.dsls.mappings.mappingsLanguage.SingleSidedCondition;
import tools.vitruv.dsls.mappings.mappingsLanguage.SingleValueCondition;
import tools.vitruv.dsls.mappings.services.MappingsLanguageGrammarAccess;
import tools.vitruv.dsls.mirbase.mirBase.DomainReference;
import tools.vitruv.dsls.mirbase.mirBase.DummyEntryRule;
import tools.vitruv.dsls.mirbase.mirBase.MetaclassEAttributeReference;
import tools.vitruv.dsls.mirbase.mirBase.MetaclassEReferenceReference;
import tools.vitruv.dsls.mirbase.mirBase.MetaclassReference;
import tools.vitruv.dsls.mirbase.mirBase.MetamodelImport;
import tools.vitruv.dsls.mirbase.mirBase.MetamodelReference;
import tools.vitruv.dsls.mirbase.mirBase.MirBasePackage;
import tools.vitruv.dsls.mirbase.mirBase.NamedJavaElement;
import tools.vitruv.dsls.mirbase.mirBase.NamedMetaclassReference;
import tools.vitruv.dsls.mirbase.serializer.MirBaseSemanticSequencer;

@SuppressWarnings("all")
public abstract class AbstractMappingsLanguageSemanticSequencer extends MirBaseSemanticSequencer {

	@Inject
	private MappingsLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MappingsLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MappingsLanguagePackage.BOOTSTRAP_MAPPING:
				sequence_BootstrapMapping(context, (BootstrapMapping) semanticObject); 
				return; 
			case MappingsLanguagePackage.CODE_BLOCK:
				sequence_BidirectionalizableExpression_CheckExpression_ElementExpression_EnforceExpression_UnidirectionalExpression_ValueExpression(context, (CodeBlock) semanticObject); 
				return; 
			case MappingsLanguagePackage.CONDITION:
				sequence_BidirectionalizableCondition(context, (Condition) semanticObject); 
				return; 
			case MappingsLanguagePackage.DEPENDENCY:
				sequence_Dependency(context, (Dependency) semanticObject); 
				return; 
			case MappingsLanguagePackage.DEPENDENT_FEATURE_REFERENCE:
				sequence_DependentFeatureReference(context, (DependentFeatureReference) semanticObject); 
				return; 
			case MappingsLanguagePackage.ENFORCEABLE_CONDITION:
				sequence_ResourceCondition(context, (EnforceableCondition) semanticObject); 
				return; 
			case MappingsLanguagePackage.FEATURE_CONDITION:
				if (rule == grammarAccess.getElementConditionRule()) {
					sequence_ElementCondition(context, (FeatureCondition) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSingleSidedConditionRule()
						|| rule == grammarAccess.getEnforceableConditionRule()
						|| rule == grammarAccess.getFeatureConditionRule()) {
					sequence_ElementCondition_FeatureCondition_MultiValueCondition_NotEmptyCondition(context, (FeatureCondition) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMultiValueConditionRule()) {
					sequence_MultiValueCondition(context, (FeatureCondition) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNotEmptyConditionRule()) {
					sequence_NotEmptyCondition(context, (FeatureCondition) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getValueConditionRule()) {
					sequence_ValueCondition(context, (FeatureCondition) semanticObject); 
					return; 
				}
				else break;
			case MappingsLanguagePackage.MAPPING:
				sequence_Mapping(context, (Mapping) semanticObject); 
				return; 
			case MappingsLanguagePackage.MAPPINGS_FILE:
				sequence_MappingsFile_MirBaseFile(context, (MappingsFile) semanticObject); 
				return; 
			case MappingsLanguagePackage.MAPPINGS_SEGMENT:
				sequence_Documentable_MappingsSegment(context, (MappingsSegment) semanticObject); 
				return; 
			case MappingsLanguagePackage.METACLASS_FEATURE_REFERENCE:
				sequence_FeatureReference(context, (MetaclassFeatureReference) semanticObject); 
				return; 
			case MappingsLanguagePackage.SINGLE_SIDED_CONDITION:
				sequence_CheckAndEnforceCondition(context, (SingleSidedCondition) semanticObject); 
				return; 
			case MappingsLanguagePackage.SINGLE_VALUE_CONDITION:
				if (rule == grammarAccess.getSingleSidedConditionRule()
						|| rule == grammarAccess.getEnforceableConditionRule()
						|| rule == grammarAccess.getFeatureConditionRule()) {
					sequence_FeatureCondition_IndexCondition_NumCompareCondition(context, (SingleValueCondition) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSingleValueConditionRule()) {
					sequence_IndexCondition_NumCompareCondition(context, (SingleValueCondition) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getIndexConditionRule()) {
					sequence_IndexCondition(context, (SingleValueCondition) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNumCompareConditionRule()) {
					sequence_NumCompareCondition(context, (SingleValueCondition) semanticObject); 
					return; 
				}
				else break;
			}
		else if (epackage == MirBasePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MirBasePackage.DOMAIN_REFERENCE:
				sequence_DomainReference(context, (DomainReference) semanticObject); 
				return; 
			case MirBasePackage.DUMMY_ENTRY_RULE:
				sequence_MirBaseFile(context, (DummyEntryRule) semanticObject); 
				return; 
			case MirBasePackage.METACLASS_EATTRIBUTE_REFERENCE:
				sequence_MetaclassEAttributeReference_MetaclassReference(context, (MetaclassEAttributeReference) semanticObject); 
				return; 
			case MirBasePackage.METACLASS_EREFERENCE_REFERENCE:
				sequence_MetaclassEReferenceReference_MetaclassReference(context, (MetaclassEReferenceReference) semanticObject); 
				return; 
			case MirBasePackage.METACLASS_FEATURE_REFERENCE:
				sequence_MetaclassFeatureReference_MetaclassReference(context, (tools.vitruv.dsls.mirbase.mirBase.MetaclassFeatureReference) semanticObject); 
				return; 
			case MirBasePackage.METACLASS_REFERENCE:
				sequence_MetaclassReference(context, (MetaclassReference) semanticObject); 
				return; 
			case MirBasePackage.METAMODEL_IMPORT:
				sequence_MetamodelImport(context, (MetamodelImport) semanticObject); 
				return; 
			case MirBasePackage.METAMODEL_REFERENCE:
				sequence_MetamodelReference(context, (MetamodelReference) semanticObject); 
				return; 
			case MirBasePackage.NAMED_JAVA_ELEMENT:
				sequence_NamedJavaElement(context, (NamedJavaElement) semanticObject); 
				return; 
			case MirBasePackage.NAMED_METACLASS_REFERENCE:
				if (rule == grammarAccess.getClassicallyNamedModelElementRule()) {
					sequence_ClassicallyNamedModelElement_MetaclassReference(context, (NamedMetaclassReference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNamedMetaclassReferenceRule()) {
					sequence_MetaclassReference_NamedMetaclassReference(context, (NamedMetaclassReference) semanticObject); 
					return; 
				}
				else break;
			}
		else if (epackage == TypesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TypesPackage.JVM_FORMAL_PARAMETER:
				if (rule == grammarAccess.getFullJvmFormalParameterRule()) {
					sequence_FullJvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmFormalParameterRule()) {
					sequence_JvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE:
				sequence_JvmTypeReference(context, (JvmGenericArrayTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_INNER_TYPE_REFERENCE:
				sequence_JvmParameterizedTypeReference(context, (JvmInnerTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_LOWER_BOUND:
				if (rule == grammarAccess.getJvmLowerBoundAndedRule()) {
					sequence_JvmLowerBoundAnded(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmLowerBoundRule()) {
					sequence_JvmLowerBound(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_PARAMETERIZED_TYPE_REFERENCE:
				if (action == grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0()) {
					sequence_JvmParameterizedTypeReference_JvmInnerTypeReference_1_4_0_0_0(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmTypeReferenceRule()
						|| action == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()
						|| rule == grammarAccess.getJvmParameterizedTypeReferenceRule()
						|| rule == grammarAccess.getJvmArgumentTypeReferenceRule()) {
					sequence_JvmParameterizedTypeReference(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_TYPE_PARAMETER:
				sequence_JvmTypeParameter(context, (JvmTypeParameter) semanticObject); 
				return; 
			case TypesPackage.JVM_UPPER_BOUND:
				if (rule == grammarAccess.getJvmUpperBoundAndedRule()) {
					sequence_JvmUpperBoundAnded(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmUpperBoundRule()) {
					sequence_JvmUpperBound(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_WILDCARD_TYPE_REFERENCE:
				sequence_JvmWildcardTypeReference(context, (JvmWildcardTypeReference) semanticObject); 
				return; 
			}
		else if (epackage == XbasePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XbasePackage.XASSIGNMENT:
				sequence_XAssignment_XMemberFeatureCall(context, (XAssignment) semanticObject); 
				return; 
			case XbasePackage.XBASIC_FOR_LOOP_EXPRESSION:
				sequence_XBasicForLoopExpression(context, (XBasicForLoopExpression) semanticObject); 
				return; 
			case XbasePackage.XBINARY_OPERATION:
				sequence_XAdditiveExpression_XAndExpression_XAssignment_XEqualityExpression_XMultiplicativeExpression_XOrExpression_XOtherOperatorExpression_XRelationalExpression(context, (XBinaryOperation) semanticObject); 
				return; 
			case XbasePackage.XBLOCK_EXPRESSION:
				if (rule == grammarAccess.getXExpressionRule()
						|| rule == grammarAccess.getXAssignmentRule()
						|| action == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOrExpressionRule()
						|| action == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAndExpressionRule()
						|| action == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXEqualityExpressionRule()
						|| action == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXRelationalExpressionRule()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOtherOperatorExpressionRule()
						|| action == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAdditiveExpressionRule()
						|| action == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXMultiplicativeExpressionRule()
						|| action == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXUnaryOperationRule()
						|| rule == grammarAccess.getXCastedExpressionRule()
						|| action == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0()
						|| rule == grammarAccess.getXPostfixOperationRule()
						|| action == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0()
						|| rule == grammarAccess.getXMemberFeatureCallRule()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0()
						|| rule == grammarAccess.getXPrimaryExpressionRule()
						|| rule == grammarAccess.getXParenthesizedExpressionRule()
						|| rule == grammarAccess.getXBlockExpressionRule()
						|| rule == grammarAccess.getXExpressionOrVarDeclarationRule()) {
					sequence_XBlockExpression(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXExpressionInClosureRule()) {
					sequence_XExpressionInClosure(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBOOLEAN_LITERAL:
				sequence_XBooleanLiteral(context, (XBooleanLiteral) semanticObject); 
				return; 
			case XbasePackage.XCASE_PART:
				sequence_XCasePart(context, (XCasePart) semanticObject); 
				return; 
			case XbasePackage.XCASTED_EXPRESSION:
				sequence_XCastedExpression(context, (XCastedExpression) semanticObject); 
				return; 
			case XbasePackage.XCATCH_CLAUSE:
				sequence_XCatchClause(context, (XCatchClause) semanticObject); 
				return; 
			case XbasePackage.XCLOSURE:
				if (rule == grammarAccess.getXExpressionRule()
						|| rule == grammarAccess.getXAssignmentRule()
						|| action == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOrExpressionRule()
						|| action == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAndExpressionRule()
						|| action == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXEqualityExpressionRule()
						|| action == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXRelationalExpressionRule()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOtherOperatorExpressionRule()
						|| action == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAdditiveExpressionRule()
						|| action == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXMultiplicativeExpressionRule()
						|| action == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXUnaryOperationRule()
						|| rule == grammarAccess.getXCastedExpressionRule()
						|| action == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0()
						|| rule == grammarAccess.getXPostfixOperationRule()
						|| action == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0()
						|| rule == grammarAccess.getXMemberFeatureCallRule()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0()
						|| rule == grammarAccess.getXPrimaryExpressionRule()
						|| rule == grammarAccess.getXLiteralRule()
						|| rule == grammarAccess.getXClosureRule()
						|| rule == grammarAccess.getXParenthesizedExpressionRule()
						|| rule == grammarAccess.getXExpressionOrVarDeclarationRule()) {
					sequence_XClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXShortClosureRule()) {
					sequence_XShortClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCONSTRUCTOR_CALL:
				sequence_XConstructorCall(context, (XConstructorCall) semanticObject); 
				return; 
			case XbasePackage.XDO_WHILE_EXPRESSION:
				sequence_XDoWhileExpression(context, (XDoWhileExpression) semanticObject); 
				return; 
			case XbasePackage.XFEATURE_CALL:
				sequence_XFeatureCall(context, (XFeatureCall) semanticObject); 
				return; 
			case XbasePackage.XFOR_LOOP_EXPRESSION:
				sequence_XForLoopExpression(context, (XForLoopExpression) semanticObject); 
				return; 
			case XbasePackage.XIF_EXPRESSION:
				sequence_XIfExpression(context, (XIfExpression) semanticObject); 
				return; 
			case XbasePackage.XINSTANCE_OF_EXPRESSION:
				sequence_XRelationalExpression(context, (XInstanceOfExpression) semanticObject); 
				return; 
			case XbasePackage.XLIST_LITERAL:
				sequence_XListLiteral(context, (XListLiteral) semanticObject); 
				return; 
			case XbasePackage.XMEMBER_FEATURE_CALL:
				sequence_XMemberFeatureCall(context, (XMemberFeatureCall) semanticObject); 
				return; 
			case XbasePackage.XNULL_LITERAL:
				sequence_XNullLiteral(context, (XNullLiteral) semanticObject); 
				return; 
			case XbasePackage.XNUMBER_LITERAL:
				sequence_XNumberLiteral(context, (XNumberLiteral) semanticObject); 
				return; 
			case XbasePackage.XPOSTFIX_OPERATION:
				sequence_XPostfixOperation(context, (XPostfixOperation) semanticObject); 
				return; 
			case XbasePackage.XRETURN_EXPRESSION:
				sequence_XReturnExpression(context, (XReturnExpression) semanticObject); 
				return; 
			case XbasePackage.XSET_LITERAL:
				sequence_XSetLiteral(context, (XSetLiteral) semanticObject); 
				return; 
			case XbasePackage.XSTRING_LITERAL:
				sequence_XStringLiteral(context, (XStringLiteral) semanticObject); 
				return; 
			case XbasePackage.XSWITCH_EXPRESSION:
				sequence_XSwitchExpression(context, (XSwitchExpression) semanticObject); 
				return; 
			case XbasePackage.XSYNCHRONIZED_EXPRESSION:
				sequence_XSynchronizedExpression(context, (XSynchronizedExpression) semanticObject); 
				return; 
			case XbasePackage.XTHROW_EXPRESSION:
				sequence_XThrowExpression(context, (XThrowExpression) semanticObject); 
				return; 
			case XbasePackage.XTRY_CATCH_FINALLY_EXPRESSION:
				sequence_XTryCatchFinallyExpression(context, (XTryCatchFinallyExpression) semanticObject); 
				return; 
			case XbasePackage.XTYPE_LITERAL:
				sequence_XTypeLiteral(context, (XTypeLiteral) semanticObject); 
				return; 
			case XbasePackage.XUNARY_OPERATION:
				sequence_XUnaryOperation(context, (XUnaryOperation) semanticObject); 
				return; 
			case XbasePackage.XVARIABLE_DECLARATION:
				sequence_XVariableDeclaration(context, (XVariableDeclaration) semanticObject); 
				return; 
			case XbasePackage.XWHILE_EXPRESSION:
				sequence_XWhileExpression(context, (XWhileExpression) semanticObject); 
				return; 
			}
		else if (epackage == XtypePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XtypePackage.XFUNCTION_TYPE_REF:
				sequence_XFunctionTypeRef(context, (XFunctionTypeRef) semanticObject); 
				return; 
			case XtypePackage.XIMPORT_DECLARATION:
				sequence_XImportDeclaration(context, (XImportDeclaration) semanticObject); 
				return; 
			case XtypePackage.XIMPORT_SECTION:
				sequence_XImportSection(context, (XImportSection) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     BidirectionalizableCondition returns Condition
	 *
	 * Constraint:
	 *     (
	 *         featureToBeAssigned=MetaclassFeatureReference 
	 *         bidirectionalizableExpression=BidirectionalizableExpression 
	 *         featureToBeUpdated=MetaclassFeatureReference?
	 *     )
	 */
	protected void sequence_BidirectionalizableCondition(ISerializationContext context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ValueExpression returns CodeBlock
	 *     ElementExpression returns CodeBlock
	 *     CheckExpression returns CodeBlock
	 *     EnforceExpression returns CodeBlock
	 *     BidirectionalizableExpression returns CodeBlock
	 *     UnidirectionalExpression returns CodeBlock
	 *
	 * Constraint:
	 *     {CodeBlock}
	 */
	protected void sequence_BidirectionalizableExpression_CheckExpression_ElementExpression_EnforceExpression_UnidirectionalExpression_ValueExpression(ISerializationContext context, CodeBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BootstrapMapping returns BootstrapMapping
	 *
	 * Constraint:
	 *     (name=ValidID parameters+=ClassicallyNamedModelElement+ bootstrapConditon=SingleSidedCondition?)
	 */
	protected void sequence_BootstrapMapping(ISerializationContext context, BootstrapMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SingleSidedCondition returns SingleSidedCondition
	 *     CheckAndEnforceCondition returns SingleSidedCondition
	 *
	 * Constraint:
	 *     (checkExpression=CheckExpression enforceExpression=CheckExpression)
	 */
	protected void sequence_CheckAndEnforceCondition(ISerializationContext context, SingleSidedCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingsLanguagePackage.Literals.SINGLE_SIDED_CONDITION__CHECK_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingsLanguagePackage.Literals.SINGLE_SIDED_CONDITION__CHECK_EXPRESSION));
			if (transientValues.isValueTransient(semanticObject, MappingsLanguagePackage.Literals.SINGLE_SIDED_CONDITION__ENFORCE_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingsLanguagePackage.Literals.SINGLE_SIDED_CONDITION__ENFORCE_EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCheckAndEnforceConditionAccess().getCheckExpressionCheckExpressionParserRuleCall_1_0(), semanticObject.getCheckExpression());
		feeder.accept(grammarAccess.getCheckAndEnforceConditionAccess().getEnforceExpressionCheckExpressionParserRuleCall_3_0(), semanticObject.getEnforceExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Dependency returns Dependency
	 *
	 * Constraint:
	 *     (mapping=[Mapping|ID] shortName=ValidID)
	 */
	protected void sequence_Dependency(ISerializationContext context, Dependency semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingsLanguagePackage.Literals.DEPENDENCY__MAPPING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingsLanguagePackage.Literals.DEPENDENCY__MAPPING));
			if (transientValues.isValueTransient(semanticObject, MappingsLanguagePackage.Literals.DEPENDENCY__SHORT_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingsLanguagePackage.Literals.DEPENDENCY__SHORT_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDependencyAccess().getMappingMappingIDTerminalRuleCall_0_0_1(), semanticObject.eGet(MappingsLanguagePackage.Literals.DEPENDENCY__MAPPING, false));
		feeder.accept(grammarAccess.getDependencyAccess().getShortNameValidIDParserRuleCall_1_0(), semanticObject.getShortName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FeatureReference returns DependentFeatureReference
	 *     DependentFeatureReference returns DependentFeatureReference
	 *
	 * Constraint:
	 *     (dependeeShortName=[Dependency|ValidID] dependeeFeature=MetaclassFeatureReference)
	 */
	protected void sequence_DependentFeatureReference(ISerializationContext context, DependentFeatureReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingsLanguagePackage.Literals.DEPENDENT_FEATURE_REFERENCE__DEPENDEE_SHORT_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingsLanguagePackage.Literals.DEPENDENT_FEATURE_REFERENCE__DEPENDEE_SHORT_NAME));
			if (transientValues.isValueTransient(semanticObject, MappingsLanguagePackage.Literals.DEPENDENT_FEATURE_REFERENCE__DEPENDEE_FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingsLanguagePackage.Literals.DEPENDENT_FEATURE_REFERENCE__DEPENDEE_FEATURE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDependentFeatureReferenceAccess().getDependeeShortNameDependencyValidIDParserRuleCall_0_0_1(), semanticObject.eGet(MappingsLanguagePackage.Literals.DEPENDENT_FEATURE_REFERENCE__DEPENDEE_SHORT_NAME, false));
		feeder.accept(grammarAccess.getDependentFeatureReferenceAccess().getDependeeFeatureMetaclassFeatureReferenceParserRuleCall_2_0(), semanticObject.getDependeeFeature());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MappingsSegment returns MappingsSegment
	 *
	 * Constraint:
	 *     (
	 *         documentation=ML_COMMENT? 
	 *         name=ValidID 
	 *         leftDomain=DomainReference 
	 *         rightDomain=DomainReference 
	 *         (mappings+=Mapping | bootstrapMappings+=BootstrapMapping)*
	 *     )
	 */
	protected void sequence_Documentable_MappingsSegment(ISerializationContext context, MappingsSegment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ElementCondition returns FeatureCondition
	 *
	 * Constraint:
	 *     elementExpression=ElementExpression
	 */
	protected void sequence_ElementCondition(ISerializationContext context, FeatureCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingsLanguagePackage.Literals.ENFORCEABLE_CONDITION__ELEMENT_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingsLanguagePackage.Literals.ENFORCEABLE_CONDITION__ELEMENT_EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElementConditionAccess().getElementExpressionElementExpressionParserRuleCall_0_0(), semanticObject.getElementExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SingleSidedCondition returns FeatureCondition
	 *     EnforceableCondition returns FeatureCondition
	 *     FeatureCondition returns FeatureCondition
	 *
	 * Constraint:
	 *     (
	 *         ((negated?='not' operator=MultiValueConditionOperator) | elementExpression=ElementExpression | negated?='not') 
	 *         feature=MetaclassFeatureReference
	 *     )
	 */
	protected void sequence_ElementCondition_FeatureCondition_MultiValueCondition_NotEmptyCondition(ISerializationContext context, FeatureCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SingleSidedCondition returns SingleValueCondition
	 *     EnforceableCondition returns SingleValueCondition
	 *     FeatureCondition returns SingleValueCondition
	 *
	 * Constraint:
	 *     (((negated?='not' indexValueExpression=ValueExpression) | operator=NumCompareOperator) feature=MetaclassFeatureReference)
	 */
	protected void sequence_FeatureCondition_IndexCondition_NumCompareCondition(ISerializationContext context, SingleValueCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureReference returns MetaclassFeatureReference
	 *
	 * Constraint:
	 *     {MetaclassFeatureReference}
	 */
	protected void sequence_FeatureReference(ISerializationContext context, MetaclassFeatureReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SingleValueCondition returns SingleValueCondition
	 *
	 * Constraint:
	 *     ((negated?='not' indexValueExpression=ValueExpression) | operator=NumCompareOperator)
	 */
	protected void sequence_IndexCondition_NumCompareCondition(ISerializationContext context, SingleValueCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IndexCondition returns SingleValueCondition
	 *
	 * Constraint:
	 *     (negated?='not' indexValueExpression=ValueExpression)
	 */
	protected void sequence_IndexCondition(ISerializationContext context, SingleValueCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingsLanguagePackage.Literals.SINGLE_VALUE_CONDITION__NEGATED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingsLanguagePackage.Literals.SINGLE_VALUE_CONDITION__NEGATED));
			if (transientValues.isValueTransient(semanticObject, MappingsLanguagePackage.Literals.SINGLE_VALUE_CONDITION__INDEX_VALUE_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingsLanguagePackage.Literals.SINGLE_VALUE_CONDITION__INDEX_VALUE_EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIndexConditionAccess().getNegatedNotKeyword_0_0(), semanticObject.isNegated());
		feeder.accept(grammarAccess.getIndexConditionAccess().getIndexValueExpressionValueExpressionParserRuleCall_2_0(), semanticObject.getIndexValueExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Mapping returns Mapping
	 *
	 * Constraint:
	 *     (
	 *         name=ValidID 
	 *         dependencies+=Dependency? 
	 *         leftParameters+=ClassicallyNamedModelElement+ 
	 *         leftConditions+=SingleSidedCondition* 
	 *         rightParameters+=ClassicallyNamedModelElement+ 
	 *         rightConditions+=SingleSidedCondition* 
	 *         bidirectionalizableConditions+=BidirectionalizableCondition* 
	 *         (forwardExecutionExpression=UnidirectionalExpression backwardExecutionExpression=UnidirectionalExpression)?
	 *     )
	 */
	protected void sequence_Mapping(ISerializationContext context, Mapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MappingsFile returns MappingsFile
	 *
	 * Constraint:
	 *     (namespaceImports=XImportSection? metamodelImports+=MetamodelImport* mappingsSegments+=MappingsSegment+)
	 */
	protected void sequence_MappingsFile_MirBaseFile(ISerializationContext context, MappingsFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MultiValueCondition returns FeatureCondition
	 *
	 * Constraint:
	 *     (negated?='not' operator=MultiValueConditionOperator)
	 */
	protected void sequence_MultiValueCondition(ISerializationContext context, FeatureCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingsLanguagePackage.Literals.FEATURE_CONDITION__NEGATED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingsLanguagePackage.Literals.FEATURE_CONDITION__NEGATED));
			if (transientValues.isValueTransient(semanticObject, MappingsLanguagePackage.Literals.FEATURE_CONDITION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingsLanguagePackage.Literals.FEATURE_CONDITION__OPERATOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiValueConditionAccess().getNegatedNotKeyword_0_0(), semanticObject.isNegated());
		feeder.accept(grammarAccess.getMultiValueConditionAccess().getOperatorMultiValueConditionOperatorEnumRuleCall_1_0(), semanticObject.getOperator());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NotEmptyCondition returns FeatureCondition
	 *
	 * Constraint:
	 *     negated?='not'
	 */
	protected void sequence_NotEmptyCondition(ISerializationContext context, FeatureCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingsLanguagePackage.Literals.FEATURE_CONDITION__NEGATED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingsLanguagePackage.Literals.FEATURE_CONDITION__NEGATED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotEmptyConditionAccess().getNegatedNotKeyword_0_0(), semanticObject.isNegated());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NumCompareCondition returns SingleValueCondition
	 *
	 * Constraint:
	 *     operator=NumCompareOperator
	 */
	protected void sequence_NumCompareCondition(ISerializationContext context, SingleValueCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingsLanguagePackage.Literals.SINGLE_VALUE_CONDITION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingsLanguagePackage.Literals.SINGLE_VALUE_CONDITION__OPERATOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumCompareConditionAccess().getOperatorNumCompareOperatorEnumRuleCall_0(), semanticObject.getOperator());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SingleSidedCondition returns EnforceableCondition
	 *     EnforceableCondition returns EnforceableCondition
	 *     ResourceCondition returns EnforceableCondition
	 *
	 * Constraint:
	 *     (elementExpression=ElementExpression pathExpression=ElementExpression? path=STRING)
	 */
	protected void sequence_ResourceCondition(ISerializationContext context, EnforceableCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ValueCondition returns FeatureCondition
	 *
	 * Constraint:
	 *     valueExpression=ValueExpression
	 */
	protected void sequence_ValueCondition(ISerializationContext context, FeatureCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingsLanguagePackage.Literals.FEATURE_CONDITION__VALUE_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingsLanguagePackage.Literals.FEATURE_CONDITION__VALUE_EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getValueConditionAccess().getValueExpressionValueExpressionParserRuleCall_0(), semanticObject.getValueExpression());
		feeder.finish();
	}
	
	
}
