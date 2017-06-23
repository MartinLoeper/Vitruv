package tools.vitruv.framework.change.echange.util

import org.eclipse.emf.common.command.BasicCommandStack
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain
import org.eclipse.emf.edit.domain.EditingDomain
import org.eclipse.emf.edit.provider.ComposedAdapterFactory

/**
 * Static utility class for the EChange package and subpackages.
 */
class EChangeUtil {
	/**
	 * Wrapper method for {@link EcoreUtil.resolve} which is null-safe.
	 * @param proxy The EObject which should be resolved.
	 * @param resourceSet The resource set which contains the resource with
	 * 		the concrete EObject of the proxy.
	 * @return The resolved EObject:: If resolving the proxy fails, the proxy object itself.
	 */
	static def resolveProxy(EObject proxy, ResourceSet resourceSet) {
		if (proxy !== null && resourceSet !== null)
			EcoreUtil::resolve(proxy, resourceSet)
		else
			proxy
	}

	/**
	 * Get the editing domain of the an object. If the object has no
	 * editing domain, it returns a new {@code AdapterFactoryEditingDomain}.
	 * @param object The EObject.
	 * @return The editing domain of the object.
	 */
	static def EditingDomain getEditingDomain(EObject object) {
		val ed = AdapterFactoryEditingDomain::getEditingDomainFor(object)
		if (ed === null)
			new AdapterFactoryEditingDomain(new ComposedAdapterFactory, new BasicCommandStack)
		else
			ed
	}
}