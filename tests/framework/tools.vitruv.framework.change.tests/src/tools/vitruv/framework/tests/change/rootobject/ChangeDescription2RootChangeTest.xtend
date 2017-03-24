package tools.vitruv.framework.tests.change.rootobject

import allElementTypes.AllElementTypesFactory
import allElementTypes.Root
import java.io.File
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.junit.After
import org.junit.Before
import tools.vitruv.framework.tests.change.ChangeDescription2ChangeTransformationTest

import static extension tools.vitruv.framework.tests.change.util.AtomicEChangeAssertHelper.*
import static extension tools.vitruv.framework.tests.change.util.CompoundEChangeAssertHelper.*

class ChangeDescription2RootChangeTest extends ChangeDescription2ChangeTransformationTest{
	var Root rootElement2;
	var protected Resource resource2
	var protected String uri2 =  tempDirPath + "dummyURI2.xmi"
	
	@Before
	def override beforeTest(){
		super.beforeTest
		EcoreUtil.delete(this.rootElement)
		rootElement2 = AllElementTypesFactory.eINSTANCE.createRoot();
		resource2 = resourceSet.createResource(URI.createFileURI(uri2))
	}
	
	@After
	def override afterTest() {
		super.afterTest();
		new File(uri2).delete();
	}
	
	def protected startRecordingOnResourceSet() {
		startRecording(#[resourceSet])
	}
		
	def protected void assertInsertRoot(int index, boolean isCreate, String uri, Resource resource) {
		if (isCreate) {
			changes.claimChange(index).assertCreateAndInsertRootEObject(this.rootElement, uri, resource);
		} else {
			changes.claimChange(index).assertInsertRootEObject(this.rootElement, uri, resource)
		}
	}
	
	def protected void assertInsertRoot2(int index, boolean isCreate, String uri, Resource resource) {
		if (isCreate) {
			changes.claimChange(index).assertCreateAndInsertRootEObject(this.rootElement2, uri, resource);
		} else {
			changes.claimChange(index).assertInsertRootEObject(this.rootElement2, uri, resource)
		}
	}
	
	def protected void assertRemoveRoot(int index, boolean isDelete, String uri, Resource resource) {
		if (isDelete) {
			changes.claimChange(index).assertRemoveAndDeleteRootEObject(this.rootElement, uri, resource)
		} else {
			changes.claimChange(index).assertRemoveRootEObject(this.rootElement, uri, resource)
		}
	}
	
	def protected void assertRemoveRoot2(int index, boolean isDelete, String uri, Resource resource) {
		if (isDelete) {
			changes.claimChange(index).assertRemoveAndDeleteRootEObject(this.rootElement2, uri, resource)
		} else {
			changes.claimChange(index).assertRemoveRootEObject(this.rootElement2, uri, resource)
		}
	}
	
	def protected void insertRootEObjectInResource(Resource resource){
		resource.contents.add(this.rootElement)
	}
	
	def protected void insertRootEObjectInResource2(Resource resource){
		resource.contents.add(this.rootElement2)
	}
}