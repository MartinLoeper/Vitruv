package edu.kit.ipd.sdq.vitruvius.framework.mir.testframework.tests;

import org.eclipse.emf.common.util.URI;
import org.junit.After;
import org.junit.Before;

import edu.kit.ipd.sdq.vitruvius.framework.contracts.datatypes.CorrespondenceInstance;
import edu.kit.ipd.sdq.vitruvius.framework.contracts.datatypes.VURI;
import edu.kit.ipd.sdq.vitruvius.framework.metarepository.MetaRepositoryImpl;
import edu.kit.ipd.sdq.vitruvius.framework.mir.testframework.util.MIRTestUtil;
import edu.kit.ipd.sdq.vitruvius.framework.vsum.VSUMImpl;

/**
 * Abstact test class for a mapping generated by MIR.
 * @author Dominik Werle
 */
public abstract class AbstractMIRTestBase {
	private VSUMImpl vsum;
	private MetaRepositoryImpl metaRepository;
	
	/**
	 * Returns the URIs and file extensions of the meta models to load for the test.
	 * @return the URIs and file extensions of the meta models to load for the test
	 */
	protected abstract MIRTestUtil.URIwithExtension[] getMMURIsWithExtensionsToLoad();

	/**
	 * Returns the {@link URI URIs} of the models to load for the test.
	 * @return the {@link URI URIs} of the models to load for the test
	 */
	protected abstract URI[] getURIsToLoad();
	
	protected abstract CorrespondenceInstance getCorrespondenceInstance();
	
	@Before
	/**
	 * @see PCM2JaMoPPTransformationTest#setUpTest()
	 */
	public void setUp() {
		this.metaRepository = MIRTestUtil.createEmptyMetaRepository(getMMURIsWithExtensionsToLoad());
		this.vsum = MIRTestUtil.createEmptyVSUM(metaRepository);
		
		for (URI modelURI : getURIsToLoad()) {
			vsum.getAndLoadModelInstanceOriginal(VURI.getInstance(modelURI));
		}
	}

	@After
	public void tearDown() {
	}
	
	/**
	 * Returns the VSUMImpl for this test.
	 * @return the VSUMImpl for this test
	 */
	protected VSUMImpl getVSUM() {
		return vsum;
	}
}
