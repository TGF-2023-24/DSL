/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.formatting2;

import RedDePetri.Arco;
import RedDePetri.Lugar;
import RedDePetri.RdP;
import RedDePetri.Transicion;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MyDslGrammarAccess _myDslGrammarAccess;

  protected void _format(final RdP rdP, @Extension final IFormattableDocument document) {
    EList<Transicion> _transiciones = rdP.getTransiciones();
    for (final Transicion transicion : _transiciones) {
      document.<Transicion>format(transicion);
    }
    EList<Lugar> _lugares = rdP.getLugares();
    for (final Lugar lugar : _lugares) {
      document.<Lugar>format(lugar);
    }
    EList<Arco> _arcos = rdP.getArcos();
    for (final Arco arco : _arcos) {
      document.<Arco>format(arco);
    }
  }

  public void format(final Object rdP, final IFormattableDocument document) {
    if (rdP instanceof XtextResource) {
      _format((XtextResource)rdP, document);
      return;
    } else if (rdP instanceof RdP) {
      _format((RdP)rdP, document);
      return;
    } else if (rdP instanceof EObject) {
      _format((EObject)rdP, document);
      return;
    } else if (rdP == null) {
      _format((Void)null, document);
      return;
    } else if (rdP != null) {
      _format(rdP, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(rdP, document).toString());
    }
  }
}
