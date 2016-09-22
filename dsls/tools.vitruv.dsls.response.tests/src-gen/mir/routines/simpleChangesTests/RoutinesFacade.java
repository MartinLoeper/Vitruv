package mir.routines.simpleChangesTests;

import allElementTypes.NonRoot;
import allElementTypes.NonRootObjectContainerHelper;
import allElementTypes.Root;
import tools.vitruv.extensions.dslsruntime.response.AbstractEffectsFacade;
import tools.vitruv.extensions.dslsruntime.response.ResponseExecutionState;
import tools.vitruv.extensions.dslsruntime.response.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RoutinesFacade extends AbstractEffectsFacade {
  public RoutinesFacade(final ResponseExecutionState responseExecutionState, final CallHierarchyHaving calledBy) {
    super(responseExecutionState, calledBy);
  }
  
  public void callReplaceSingleValuedEAttribute(final Root root, final Integer value) {
    mir.routines.simpleChangesTests.ReplaceSingleValuedEAttributeEffect effect = new mir.routines.simpleChangesTests.ReplaceSingleValuedEAttributeEffect(this.executionState, calledBy,
    	root, value);
    effect.applyRoutine();
  }
  
  public void callReplaceNonRootId(final NonRoot nonRoot, final String value) {
    mir.routines.simpleChangesTests.ReplaceNonRootIdEffect effect = new mir.routines.simpleChangesTests.ReplaceNonRootIdEffect(this.executionState, calledBy,
    	nonRoot, value);
    effect.applyRoutine();
  }
  
  public void callInsertNonRoot(final Root root, final NonRoot insertedNonRoot) {
    mir.routines.simpleChangesTests.InsertNonRootEffect effect = new mir.routines.simpleChangesTests.InsertNonRootEffect(this.executionState, calledBy,
    	root, insertedNonRoot);
    effect.applyRoutine();
  }
  
  public void callRemoveNonRoot(final NonRoot removedNonRoot) {
    mir.routines.simpleChangesTests.RemoveNonRootEffect effect = new mir.routines.simpleChangesTests.RemoveNonRootEffect(this.executionState, calledBy,
    	removedNonRoot);
    effect.applyRoutine();
  }
  
  public void callDeleteNonRootEObjectSingle(final NonRoot containedObject) {
    mir.routines.simpleChangesTests.DeleteNonRootEObjectSingleEffect effect = new mir.routines.simpleChangesTests.DeleteNonRootEObjectSingleEffect(this.executionState, calledBy,
    	containedObject);
    effect.applyRoutine();
  }
  
  public void callCreateNonRootEObjectSingle(final Root sourceRoot, final NonRoot containedObject) {
    mir.routines.simpleChangesTests.CreateNonRootEObjectSingleEffect effect = new mir.routines.simpleChangesTests.CreateNonRootEObjectSingleEffect(this.executionState, calledBy,
    	sourceRoot, containedObject);
    effect.applyRoutine();
  }
  
  public void callReplaceSingleValuedNonContainmentReference(final Root root, final NonRoot newReferencedElement) {
    mir.routines.simpleChangesTests.ReplaceSingleValuedNonContainmentReferenceEffect effect = new mir.routines.simpleChangesTests.ReplaceSingleValuedNonContainmentReferenceEffect(this.executionState, calledBy,
    	root, newReferencedElement);
    effect.applyRoutine();
  }
  
  public void callInsertEAttribute(final Root root, final Integer attributeValue) {
    mir.routines.simpleChangesTests.InsertEAttributeEffect effect = new mir.routines.simpleChangesTests.InsertEAttributeEffect(this.executionState, calledBy,
    	root, attributeValue);
    effect.applyRoutine();
  }
  
  public void callRemoveEAttribute(final Root root, final Integer removedAttributeValue) {
    mir.routines.simpleChangesTests.RemoveEAttributeEffect effect = new mir.routines.simpleChangesTests.RemoveEAttributeEffect(this.executionState, calledBy,
    	root, removedAttributeValue);
    effect.applyRoutine();
  }
  
  public void callInsertNonContainmentReference(final Root root, final NonRoot insertedNonRoot) {
    mir.routines.simpleChangesTests.InsertNonContainmentReferenceEffect effect = new mir.routines.simpleChangesTests.InsertNonContainmentReferenceEffect(this.executionState, calledBy,
    	root, insertedNonRoot);
    effect.applyRoutine();
  }
  
  public void callRemoveNonContainmentReference(final Root root, final NonRoot removedNonRoot) {
    mir.routines.simpleChangesTests.RemoveNonContainmentReferenceEffect effect = new mir.routines.simpleChangesTests.RemoveNonContainmentReferenceEffect(this.executionState, calledBy,
    	root, removedNonRoot);
    effect.applyRoutine();
  }
  
  public void callCreateRoot(final Root root) {
    mir.routines.simpleChangesTests.CreateRootEffect effect = new mir.routines.simpleChangesTests.CreateRootEffect(this.executionState, calledBy,
    	root);
    effect.applyRoutine();
  }
  
  public void callDeleteRoot(final Root root) {
    mir.routines.simpleChangesTests.DeleteRootEffect effect = new mir.routines.simpleChangesTests.DeleteRootEffect(this.executionState, calledBy,
    	root);
    effect.applyRoutine();
  }
  
  public void callCreateNonRootObjectContainer(final Root root, final NonRootObjectContainerHelper nonRootObjectContainer) {
    mir.routines.simpleChangesTests.CreateNonRootObjectContainerEffect effect = new mir.routines.simpleChangesTests.CreateNonRootObjectContainerEffect(this.executionState, calledBy,
    	root, nonRootObjectContainer);
    effect.applyRoutine();
  }
  
  public void callCreateNonRootInContainer(final NonRootObjectContainerHelper container, final NonRoot insertedNonRoot) {
    mir.routines.simpleChangesTests.CreateNonRootInContainerEffect effect = new mir.routines.simpleChangesTests.CreateNonRootInContainerEffect(this.executionState, calledBy,
    	container, insertedNonRoot);
    effect.applyRoutine();
  }
}
