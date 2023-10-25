package pnpl.union.union;

import java.util.ArrayList;

import PetriNets.PetriNet;
import variability.Variability;

public class UnionVariability {

	private String fmodelName;
	private String petriNetName;
	private PetriNet petriNet;

	public UnionVariability(PetriNet pn) {
		this.petriNet = pn;
	}

	public boolean featureModelChecker(ArrayList<Variability> varList) {
		fmodelName = varList.get(0).getFeaturemodel().getImportURI();
		for (Variability v : varList) {
			if (!v.getFeaturemodel().getImportURI().equals(fmodelName)) {
				// TODO mostrar mensaje de error
				return false;
			}
		}
		return true;
	}

	public void unionVariability(ArrayList<Variability> varList) {
		for (Variability var : varList) {
			if (!var.equals(varList.get(0))) {
				varList.get(0).getPresencecondition().addAll(var.getPresencecondition());
			}
		}
	}

	public String getFmodel() {
		return fmodelName;
	}

	public void setFmodel(String fmodel) {
		this.fmodelName = fmodel;
	}

	public String getPetriNetName() {
		return petriNetName;
	}

	public void setPetriNetName(String petriNetName) {
		this.petriNetName = petriNetName;
	}

	public PetriNet getPetriNet() {
		return petriNet;
	}

	public void setPetriNet(PetriNet petriNet) {
		this.petriNet = petriNet;
	}
}
