/*
 * generated by Xtext 2.12.0
 */
package tools.vitruv.dsls.mappings.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import tools.vitruv.dsls.mappings.ui.internal.MappingsActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MappingsLanguageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MappingsActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MappingsActivator.getInstance().getInjector(MappingsActivator.TOOLS_VITRUV_DSLS_MAPPINGS_MAPPINGSLANGUAGE);
	}
	
}
