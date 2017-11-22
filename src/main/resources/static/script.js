function computerChoice	() {
	var randomNumber = Math.random();

	if (randomNumber <= 0.34) {
		return 'Sten';
	} else if (randomNumber <= 0.67) {
		return 'Påse';
	} else {
		return 'Sax';
	}
}