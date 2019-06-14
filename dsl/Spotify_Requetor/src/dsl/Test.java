package dsl;
import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import spotify_Requetor.Artist;
import spotify_Requetor.CommandManager;
import spotify_Requetor.Spotify_RequetorFactory;
import spotify_Requetor.Spotify_RequetorPackage;
import spotify_Requetor.Track;
import spotify_Requetor.impl.Spotify_RequetorFactoryImpl;

public class Test {


	public static void main(String[] args){
		// Initialize the model
				Spotify_RequetorPackage.eINSTANCE.eClass();

				// Retrieve the default factory singleton
				Spotify_RequetorFactory factory = new Spotify_RequetorFactoryImpl();

				CommandManager cm = factory.createCommandManager();

				Artist a = factory.createArtist();
				a.setName("David Guetta");
				Track t = factory.createTrack();
				t.setName("Titanium");
				Track t2 = factory.createTrack();
				t2.setName("Titanium2");
				Track t3 = factory.createTrack();
				t3.setName("Titanium3");
				a.getTracks().add(t);
				a.getTracks().add(t2);
				a.getTracks().add(t3);
				
				cm.getRequest().add(a);
				cm.getRequest().add(t);
				cm.getRequest().add(t2);
				cm.getRequest().add(t3);
				
				// Obtain a new resource set
				ResourceSet resSet = new ResourceSetImpl();

				// Register the default resource factory -- only needed for stand-alone!
				resSet.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

				URI fileURI = URI.createFileURI(new File(cm.getToken() + ".xmi").getAbsolutePath());
				System.out.println(fileURI);

				// create a resource
				Resource resource = resSet.createResource(fileURI);
				// Get the first model element and cast it to the right type, in my
				// example everything is hierarchical included in this first node
				resource.getContents().add(cm);
				
				// now save the content.
				try {
					resource.save(Collections.EMPTY_MAP);
				} catch (IOException e) {
					e.printStackTrace();
				}
	}

}
