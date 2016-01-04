package edu.kit.ipd.sdq.vitruvius.dsls.response.generator

import edu.kit.ipd.sdq.vitruvius.framework.contracts.datatypes.TransformationResult
import edu.kit.ipd.sdq.vitruvius.dsls.response.responseLanguage.Event
import edu.kit.ipd.sdq.vitruvius.framework.meta.change.EChange

public interface ResponseRealization {//<T extends Event> {
	public def TransformationResult applyEvent(EChange event);
}
