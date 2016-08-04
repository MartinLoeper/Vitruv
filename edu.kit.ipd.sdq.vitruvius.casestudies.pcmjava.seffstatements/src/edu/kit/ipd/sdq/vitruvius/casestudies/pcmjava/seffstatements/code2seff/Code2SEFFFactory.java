package edu.kit.ipd.sdq.vitruvius.casestudies.pcmjava.seffstatements.code2seff;

import org.palladiosimulator.pcm.repository.BasicComponent;
import org.somox.gast2seff.visitors.AbstractFunctionClassificationStrategy;
import org.somox.gast2seff.visitors.InterfaceOfExternalCallFinding;
import org.somox.gast2seff.visitors.ResourceDemandingBehaviourForClassMethodFinding;

import edu.kit.ipd.sdq.vitruvius.framework.contracts.datatypes.CorrespondenceInstance;
import edu.kit.ipd.sdq.vitruvius.framework.contracts.meta.correspondence.Correspondence;

public interface Code2SEFFFactory {

    BasicComponentFinding createBasicComponentFinding();

    InterfaceOfExternalCallFinding createInterfaceOfExternalCallFinding(
            CorrespondenceInstance<Correspondence> correspondenceInstance, BasicComponent basicComponent);

    ResourceDemandingBehaviourForClassMethodFinding createResourceDemandingBehaviourForClassMethodFinding(
            CorrespondenceInstance<Correspondence> correspondenceInstance);

    AbstractFunctionClassificationStrategy createAbstractFunctionClassificationStrategy(
            BasicComponentFinding basicComponentFinding, CorrespondenceInstance<Correspondence> correspondenceInstance,
            BasicComponent basicComponent);
}