/**
 * generated by Xtext 2.15.0
 */
package pnpl_variability.validation;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import pnpl_variability.validation.AbstractPNPL_variabilityValidator;
import variability.Feature;
import variability.Variability;
import variability.VariabilityPackage;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class PNPL_variabilityValidator extends AbstractPNPL_variabilityValidator {
  @Check
  public void checkValidFeature(final Feature feature) {
    boolean valid = false;
    int i = 0;
    try {
      EObject _rootContainer = EcoreUtil2.getRootContainer(feature, true);
      Variability variability = ((Variability) _rootContainer);
      URI vrbfile = feature.eResource().getURI();
      String _string = vrbfile.toString();
      int _lastIndexOf = vrbfile.toString().lastIndexOf("/");
      int _plus = (_lastIndexOf + 1);
      String _substring = _string.substring(0, _plus);
      String _importURI = variability.getFeaturemodel().getImportURI();
      String featuremodel = (_substring + _importURI);
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.parse(featuremodel);
      doc.getDocumentElement().normalize();
      String[] tags = { "feature", "and", "or", "alt" };
      for (final String tag : tags) {
        if ((valid == false)) {
          NodeList features = doc.getElementsByTagName(tag);
          for (i = 0; ((i < features.getLength()) && (valid == false)); i++) {
            boolean _equals = feature.getFeature().equals(features.item(i).getAttributes().getNamedItem("name").getNodeValue());
            if (_equals) {
              valid = true;
            }
          }
        }
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    if ((valid == false)) {
      String _feature = feature.getFeature();
      String _plus_1 = ("Feature \'" + _feature);
      String _plus_2 = (_plus_1 + "\' does not exist");
      this.error(_plus_2, 
        VariabilityPackage.Literals.FEATURE__FEATURE, 
        "invalidFeature");
    }
  }
}