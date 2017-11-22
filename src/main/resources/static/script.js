function computerChoice	() {
	var randomNumber = Math.random();

	if (randomNumber <= 0.34) {
		//return 'Sten'; //Show img = "sten" hide class = "images"
        feedbackElem: document.getElementById("stone")
	} else if (randomNumber <= 0.67) {
		//return 'Påse'; //Show img = "bag" hide class = "images"
        feedbackElem: document.getElementById("bag")
	} else {
		//return 'Sax'; //Show img = "scissor" hide class = "images"
        feedbackElem: document.getElementById("scissor")
        resetElem.classList.add("hidden");
	}
}

function playerChoice() {
	addEventListener()
}
  