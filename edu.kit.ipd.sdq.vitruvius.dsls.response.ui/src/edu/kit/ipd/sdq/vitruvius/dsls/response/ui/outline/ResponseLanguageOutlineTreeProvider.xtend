/*
 * generated by Xtext 2.9.0
 */
package edu.kit.ipd.sdq.vitruvius.dsls.response.ui.outline

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode
import edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.ResponseFile
import edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.MetamodelImport
import edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.Response
import static extension edu.kit.ipd.sdq.vitruvius.dsls.response.generator.ResponseLanguageGeneratorUtils.*;
import edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.Trigger
import edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.ChangeEvent
import static extension edu.kit.ipd.sdq.vitruvius.dsls.response.helper.EChangeHelper.*;
import edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.CompareBlock
import edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.CodeBlock
import edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.AffectedModel
import edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.Effects
import edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.ResponseLanguagePackage
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode

/**
 * Ouline structure defintion for a response file.
 *
 * @author Heiko Klare
 */
class ResponseLanguageOutlineTreeProvider extends DefaultOutlineTreeProvider {
	protected def void _createChildren(DocumentRootNode root, ResponseFile responseFile) {
		val importsNode = createEStructuralFeatureNode(root, responseFile, 
			ResponseLanguagePackage.Literals.RESPONSE_FILE__METAMODEL_IMPORTS,
			imageDispatcher.invoke(responseFile), "imports", false);
		for (imp : responseFile.metamodelImports) {
			createChildren(importsNode, imp);
		}
		val responsesNode = createEStructuralFeatureNode(root, responseFile, 
			ResponseLanguagePackage.Literals.RESPONSE_FILE__RESPONSES,
			imageDispatcher.invoke(responseFile), "responses", false);
		for (response : responseFile.responses) {
			createChildren(responsesNode, response);
		}
	}
	
	protected def void _createChildren(EStructuralFeatureNode parentNode, MetamodelImport imp) {
		val importNode = createEObjectNode(parentNode, imp);
		createEStructuralFeatureNode(importNode,
			imp, ResponseLanguagePackage.Literals.METAMODEL_IMPORT__PACKAGE,
			imageDispatcher.invoke(imp.package),
			imp.package.name, true);
	}
	
	protected def void _createChildren(EStructuralFeatureNode parentNode, Response response) {
		val responseNode = createEObjectNode(parentNode, response);
		if (response.documentation != null) {
			createEStructuralFeatureNode(responseNode, response,
				ResponseLanguagePackage.Literals.RESPONSE__DOCUMENTATION,
				imageDispatcher.invoke(response.documentation),
				"Documentation", true);
		}
		val triggerNode = createEStructuralFeatureNode(responseNode, response, 
			ResponseLanguagePackage.Literals.RESPONSE__TRIGGER,
			imageDispatcher.invoke(response.trigger), "Trigger", false);
		createChildren(triggerNode, response.trigger);
		val effectsNode = createEStructuralFeatureNode(responseNode, response, 
			ResponseLanguagePackage.Literals.RESPONSE__EFFECTS,
			imageDispatcher.invoke(response.effects), "Effects", false);
		createChildren(effectsNode, response.effects);
	}
	
	protected def void _createChildren(EStructuralFeatureNode parentNode, Trigger trigger) {
		createEObjectNode(parentNode, trigger);
	}
	
	protected def void _createChildren(EStructuralFeatureNode parentNode, ChangeEvent event) {
		createEObjectNode(parentNode, event);
		if (event.feature != null) {
			createEObjectNode(parentNode, event.feature.element);
			if (event.feature.feature != null) {
				createEObjectNode(parentNode, event.feature.feature);
			}
		}
	}
	
	protected def void _createChildren(EStructuralFeatureNode parentNode, Effects effects) {
		if (effects.affectedModel != null) {
			val affectedModelNode = createEStructuralFeatureNode(parentNode, effects, 
				ResponseLanguagePackage.Literals.EFFECTS__AFFECTED_MODEL,
				imageDispatcher.invoke(effects.affectedModel), "Affected model", effects.affectedModel.model == null);
			createChildren(affectedModelNode, effects.affectedModel);
		}
		if (effects.perModelPrecondition != null) {
			createChildren(parentNode, effects.perModelPrecondition);
		}
		createChildren(parentNode, effects.codeBlock);
	}
	
	protected def void _createChildren(EStructuralFeatureNode parentNode, AffectedModel affectedModel) {
		if (affectedModel.model != null) {
			createEObjectNode(parentNode, affectedModel.model);
		}
	}
	
	protected def void _createChildren(EStructuralFeatureNode parentNode, CompareBlock compareBlock) {
		createEObjectNode(parentNode, compareBlock);
	}
	
	protected def void _createChildren(EStructuralFeatureNode parentNode, CodeBlock codeBlock) {
		createEObjectNode(parentNode, codeBlock);
	}
	
	protected def Object _text(MetamodelImport imp) {
		return imp?.name;
	}
	
	protected def Object _text(Response response) {
		if (response.trigger != null) {
			return response.responseName.replace("ResponseTo", "");
		}
		return "No response trigger specified";
	}
	
	protected def Object _text(Trigger trigger) {
		return "There is no outline for this trigger";
	}
	
	protected def Object _text(ChangeEvent event) {
		if (event.feature?.element != null) {
			return event.change.generateEChange(event.feature?.feature?:event.feature?.element)?.name;
		} else {
			return "No changed element specified"
		}
	}
	
	protected def Object _text(CompareBlock compareBlock) {
		return "Per-Model Precondition Block"
	}
	
	protected def Object _text(CodeBlock codeBlock) {
		return "Execution Block"
	}
	
	protected def boolean _isLeaf(CompareBlock compareBlock) {
		return true;
	}
	
	protected def boolean _isLeaf(CodeBlock codeBlock) {
		return true;
	}
	
	protected def boolean _isLeaf(AffectedModel affectedModel) {
		return true;
	}
	
	protected def boolean _isLeaf(ChangeEvent event) {
		return true;
	}
	
}