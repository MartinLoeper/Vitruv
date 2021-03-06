package mir.routines.personsToFamilies;

import edu.kit.ipd.sdq.metamodels.families.Family;
import edu.kit.ipd.sdq.metamodels.families.Member;
import edu.kit.ipd.sdq.metamodels.persons.Person;
import java.io.IOException;
import mir.routines.personsToFamilies.RoutinesFacade;
import org.eclipse.emf.ecore.EObject;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class ChangeNamesRoutine extends AbstractRepairRoutineRealization {
  private RoutinesFacade actionsFacade;
  
  private ChangeNamesRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceFamily(final Person person) {
      return person;
    }
    
    public EObject getElement1(final Person person, final Family family, final Member member) {
      return family;
    }
    
    public void update0Element(final Person person, final Family family, final Member member) {
      family.setLastName(person.getFullName().split(" ")[1]);
    }
    
    public EObject getCorrepondenceSourceMember(final Person person, final Family family) {
      return person;
    }
    
    public EObject getElement2(final Person person, final Family family, final Member member) {
      return member;
    }
    
    public void update1Element(final Person person, final Family family, final Member member) {
      member.setFirstName(person.getFullName().split(" ")[0]);
    }
  }
  
  public ChangeNamesRoutine(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Person person) {
    super(reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.personsToFamilies.ChangeNamesRoutine.ActionUserExecution(getExecutionState(), this);
    this.actionsFacade = new mir.routines.personsToFamilies.RoutinesFacade(getExecutionState(), this);
    this.person = person;
  }
  
  private Person person;
  
  protected boolean executeRoutine() throws IOException {
    getLogger().debug("Called routine ChangeNamesRoutine with input:");
    getLogger().debug("   person: " + this.person);
    
    edu.kit.ipd.sdq.metamodels.families.Family family = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceFamily(person), // correspondence source supplier
    	edu.kit.ipd.sdq.metamodels.families.Family.class,
    	(edu.kit.ipd.sdq.metamodels.families.Family _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (family == null) {
    	return false;
    }
    registerObjectUnderModification(family);
    edu.kit.ipd.sdq.metamodels.families.Member member = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceMember(person, family), // correspondence source supplier
    	edu.kit.ipd.sdq.metamodels.families.Member.class,
    	(edu.kit.ipd.sdq.metamodels.families.Member _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (member == null) {
    	return false;
    }
    registerObjectUnderModification(member);
    // val updatedElement userExecution.getElement1(person, family, member);
    userExecution.update0Element(person, family, member);
    
    // val updatedElement userExecution.getElement2(person, family, member);
    userExecution.update1Element(person, family, member);
    
    postprocessElements();
    
    return true;
  }
}
