function computerChoice	() {
	var randomNumber = Math.random();

	if (randomNumber <= 0.34) {
		return 'Sten'; //Show img = "sten" hide class = "images"
	} else if (randomNumber <= 0.67) {
		return 'Påse'; //Show img = "bag" hide class = "images"
	} else {
		return 'Sax'; //Show img = "scissor" hide class = "images"
	}
}

   
  