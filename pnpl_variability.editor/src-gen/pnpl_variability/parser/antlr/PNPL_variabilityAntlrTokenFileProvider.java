/*
 * generated by Xtext 2.14.0
 */
package pnpl_variability.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PNPL_variabilityAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("pnpl_variability/parser/antlr/internal/InternalPNPL_variability.tokens");
	}
}