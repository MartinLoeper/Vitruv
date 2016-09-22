package mir.responses.responsesAllElementTypesToAllElementTypes.simpleChangesTests;

import allElementTypes.NonRootObjectContainerHelper;
import allElementTypes.Root;
import mir.routines.simpleChangesTests.RoutinesFacade;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import tools.vitruv.extensions.dslsruntime.response.AbstractEffectRealization;
import tools.vitruv.extensions.dslsruntime.response.AbstractResponseRealization;
import tools.vitruv.extensions.dslsruntime.response.ResponseExecutionState;
import tools.vitruv.extensions.dslsruntime.response.structure.CallHierarchyHaving;
import tools.vitruv.framework.change.echange.EChange;
import tools.vitruv.framework.change.echange.feature.reference.ReplaceSingleValuedEReference;
import tools.vitruv.framework.userinteraction.UserInteracting;

@SuppressWarnings("all")
class HelperResponseForNonRootObjectContainerInitializationResponse extends AbstractResponseRealization {
  public HelperResponseForNonRootObjectContainerInitializationResponse(final UserInteracting userInteracting) {
    super(userInteracting);
  }
  
  private boolean checkTriggerPrecondition(final ReplaceSingleValuedEReference<Root, NonRootObjectContainerHelper> change) {
    boolean _isToNonDefaultValue = change.isToNonDefaultValue();
    return _isToNonDefaultValue;
  }
  
  public static Class<? extends EChange> getExpectedChangeType() {
    return ReplaceSingleValuedEReference.class;
  }
  
  private boolean checkChangeProperties(final ReplaceSingleValuedEReference<Root, NonRootObjectContainerHelper> change) {
    EObject changedElement = change.getAffectedEObject();
    // Check model element type
    if (!(changedElement instanceof Root)) {
    	return false;
    }
    
    // Check feature
    if (!change.getAffectedFeature().getName().equals("nonRootObjectContainerHelper")) {
    	return false;
    }
    return true;
  }
  
  public boolean checkPrecondition(final EChange change) {
    if (!(change instanceof ReplaceSingleValuedEReference<?, ?>)) {
    	return false;
    }
    ReplaceSingleValuedEReference typedChange = (ReplaceSingleValuedEReference)change;
    if (!checkChangeProperties(typedChange)) {
    	return false;
    }
    if (!checkTriggerPrecondition(typedChange)) {
    	return false;
    }
    getLogger().debug("Passed precondition check of response " + this.getClass().getName());
    return true;
  }
  
  public void executeResponse(final EChange change) {
    ReplaceSingleValuedEReference<Root, NonRootObjectContainerHelper> typedChange = (ReplaceSingleValuedEReference<Root, NonRootObjectContainerHelper>)change;
    new mir.responses.responsesAllElementTypesToAllElementTypes.simpleChangesTests.HelperResponseForNonRootObjectContainerInitializationResponse.CallRoutinesUserExecution(this.executionState, this).executeUserOperations(typedChange);
  }
  
  private static class CallRoutinesUserExecution extends AbstractEffectRealization.UserExecution {
    @Extension
    private RoutinesFacade effectFacade;
    
    public CallRoutinesUserExecution(final ResponseExecutionState responseExecutionState, final CallHierarchyHaving calledBy) {
      super(responseExecutionState);
      this.effectFacade = new mir.routines.simpleChangesTests.RoutinesFacade(responseExecutionState, calledBy);
    }
    
    private void executeUserOperations(final ReplaceSingleValuedEReference<Root, NonRootObjectContainerHelper> change) {
      Root _affectedEObject = change.getAffectedEObject();
      NonRootObjectContainerHelper _newValue = change.getNewValue();
      this.effectFacade.callCreateNonRootObjectContainer(_affectedEObject, _newValue);
    }
  }
}
