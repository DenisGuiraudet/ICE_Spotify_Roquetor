/*
 * generated by Xtext 2.12.0
 */
package m1ice.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import spotify_Requetor.CommandManager

@RunWith(XtextRunner)
@InjectWith(SpotifyRequetorInjectorProvider)
class SpotifyRequetorParsingTest {
	@Inject
	ParseHelper<CommandManager> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
