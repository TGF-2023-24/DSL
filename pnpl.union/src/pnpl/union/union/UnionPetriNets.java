package pnpl.union.union;

import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

import PetriNets.PetriNet;
import PetriNets.Place;
import PetriNets.Transition;

public class UnionPetriNets {

	private Copier cp = new Copier();
	
	// The petrinets will unify in the second one.
	public void unionPetriNets (PetriNet pn1, PetriNet pn2) {
		PetriNet petriNet =(PetriNet) cp.copy(pn1);
		cp.copyReferences();
		unionPlaces(petriNet, pn2);
		unionTransistions(petriNet, pn2);
		unionArcs(petriNet, pn2);
		cp.clear();
//		pn2.getUPetriNets().add(pn1);
	}
	
	// In this case they will unify places
	private void unionPlaces(PetriNet pn1, PetriNet pn2) {

		Set<String> pn2NamesPlaces = pn2.getPlaces().stream().map(Place::getName).collect(Collectors.toSet());
		
		pn2.getPlaces().addAll(pn1.getPlaces().stream().filter(x -> !pn2NamesPlaces.contains(x.getName()))
				.collect(Collectors.toList()));

		return;

	}

	// In this case they will unify transitions
	private void unionTransistions(PetriNet pn1, PetriNet pn2) {
		
		Set<String> pn2NamesTrans = pn2.getTrans().stream().map(Transition::getName).collect(Collectors.toSet());
		
		pn2.getTrans().addAll(pn1.getTrans().stream().filter(x -> !pn2NamesTrans.contains(x.getName()))
				.collect(Collectors.toList()));

		return;
	}

	//adding arcs from pn1 to pn2 and updating the references of them	
	private void unionArcs(PetriNet pn1, PetriNet pn2) {
		
		pn2.getArcs().addAll(pn1.getArcs());
		
		for(Place pn1Place : pn1.getPlaces()) {
			for(Place pn2Place: pn2.getPlaces()) {
				if(pn1Place.getName().equals(pn2Place.getName())) {
					pn2Place.getInputs().addAll(pn1Place.getInputs());
					pn2Place.getOutputs().addAll(pn1Place.getOutputs());
				}
			}
		}

		for(Transition pn1Trans : pn1.getTrans()) {
			for(Transition pn2Trans: pn2.getTrans()) {
				if(pn1Trans.getName().equals(pn2Trans.getName())) {
					pn2Trans.getInputs().addAll(pn1Trans.getInputs());
					pn2Trans.getOutputs().addAll(pn1Trans.getOutputs());
				}
			}
		}		
		return;
		
	}	
}
