/*
 * generated by Xtext 2.12.0
 */
package m1ice.ui;

import com.google.inject.Injector;
import m1ice.spotifyRequetor.ui.internal.SpotifyRequetorActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SpotifyRequetorExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SpotifyRequetorActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SpotifyRequetorActivator.getInstance().getInjector(SpotifyRequetorActivator.M1ICE_SPOTIFYREQUETOR);
	}
	
}