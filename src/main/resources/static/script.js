

function userChoice(){
    document.getElementsById("computerStone").classList.remove("display");

}

function computerChoice	() {
	var randomNumber = Math.random();
    var dator;

	if (randomNumber <= 0.34) {
		document.getElementById("stone")//return <img src="stone.jpg">; //Show img = "sten" hide class = "images"


	} else if (randomNumber <= 0.67) {
        document.getElementById("bag")//return <img src="bag.jpg">; //Show img = "bag" hide class = "images"


	} else {
        document.getElementById("scissor")//return <img src="scissor.jpg">; //Show img = "scissor" hide class = "images"

	}
}

function compareChoice(spelare, dator) {

	if (spelare === dator) {
		return message = 'LIKA';
	}
	else if (spelare === sten) {
        if (dator === sax) {
            return message(spelare, dator, true); //spelare vinner
        } else {
            return message(spelare, dator, false); //dator vinner
        }
    }	else if (spelare === sax) {
            if (dator === sten) {
                return message (spelare, dator, false); //dator vinner
            } else {
                return message (spelare, dator, true); //spelare vinner
            }
        } else if (spelare === påse) {
            if (dator === sten) {
                return message (spelare, dator, true); //spelare vinner
            } else {
                return message (spelare, dator, false); //dator vinner
            }
	}
}

document.addEventListener("click", function (userChoice) { //remember state, set other states to hidden
    document.getElementById("stone");
    console.log("kör")

} );
document.addEventListener("click", function (userChoice) {
    document.getElementById("scissor");
});
document.addEventListener("click", function (userChoice) {
    document.getElementById("bag");
});