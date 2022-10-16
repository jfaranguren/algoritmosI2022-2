package model;

public class Controller {

	private Species[] collection;

	public Controller() {

		this.collection = new Species[80];
		testCase();
	}

	public void testCase() {

		Flora myFlora = new Flora("Suculenta", "Cactus notanfeus", true, false, 0.25);

		Fauna myFauna = new Fauna("Raton", "Roedurus quesus", false, 0.5);

		collection[0] = myFlora;
		collection[1] = myFauna;

	}

	public String showSpecies(int selection) {

		String msg = "";

		for (int i = 0; i < collection.length; i++) {

			if (collection[i] != null) {

				switch (selection) {
				case 1:
					msg += "\n" + (i + 1) + ". " + collection[i].getName();
					break;
				case 2:
					if (collection[i] instanceof Fauna) {
						msg += "\n" + (i + 1) + ". " + collection[i].getName();
					}
					break;
				case 3:
					if (collection[i] instanceof Flora) {
						msg += "\n" + (i + 1) + ". " + collection[i].getScientificName();
					}
					break;
				default:
					break;
				}

			}

		}

		if (msg.equals("")) {
			msg = "There are no Species registered yet";
		}

		return msg;

	}

	public boolean editFauna(int characteristicEdit, String newEdit, String specieName) {
		switch (characteristicEdit) {
		case 1: // Name
			for (int i = 0; i < collection.length; i++) {
				if (collection[i].getName().equalsIgnoreCase(specieName)) {
					collection[i].setName(newEdit);
					return true;
				}
			}
			break;

		case 2: // Scientific Name
			for (int i = 0; i < collection.length; i++) {
				if (collection[i].getName().equalsIgnoreCase(specieName)) {
					collection[i].setScientificName(newEdit);
					return true;
				}
			}
			break;

		case 3: // Mygratory
			if (newEdit.equalsIgnoreCase("yes")) {
				for (int i = 0; i < collection.length; i++) {
					if (collection[i].getName().equalsIgnoreCase(specieName)) {

						if (collection[i] instanceof Fauna) {

							((Fauna) collection[i]).setMigratory(true);

						}

					}
				}

			}
			break;

		case 4: // Weight

			for (int i = 0; i < collection.length; i++) {
				if (collection[i].getName().equalsIgnoreCase(specieName)) {

					if (collection[i] instanceof Fauna) {

						((Fauna) collection[i]).setMaxWeigth(Double.parseDouble(newEdit));

					}

				}
			}

			break;
		}
		return false;
	}

	public boolean editFauna(String name, String scientificName, boolean isMigratory, double maxWeigth) {

		for (int i = 0; i < collection.length; i++) {

			if (collection[i] != null) {

				if (name.equals(collection[i].getName())) {

					collection[i].setScientificName(scientificName);

					if (collection[i] instanceof Fauna) {

						((Fauna) collection[i]).setMigratory(isMigratory);
						((Fauna) collection[i]).setMaxWeigth(maxWeigth);

						return true;
					}

				}

			}
		}
		return false;
	}

	public boolean editSpecies(String name, String scientificName, boolean isMigratory, double maxWeight,
			boolean hasFlowers, boolean hasFruits, double maxHeight) {
		{

			for (int i = 0; i < collection.length; i++) {

				if (collection[i] != null) {

					if (name.equals(collection[i].getName())) {

						if (collection[i] instanceof Fauna) {

							((Fauna) collection[i]).setName(scientificName);
							((Fauna) collection[i]).setScientificName(scientificName);
							((Fauna) collection[i]).setMigratory(isMigratory);
							((Fauna) collection[i]).setMaxWeigth(maxWeight);

						} else if (collection[i] instanceof Flora) {

							((Flora) collection[i]).setName(scientificName);
							((Flora) collection[i]).setScientificName(scientificName);
							((Flora) collection[i]).setHasFlowers(hasFlowers);
							((Flora) collection[i]).setHasFruits(hasFruits);
							((Flora) collection[i]).setMaxHeigth(maxHeight);

						}

					}

				}
			}

			return false;

		}

	}

}
