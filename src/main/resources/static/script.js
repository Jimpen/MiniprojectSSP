

function userChoice(){
    document.addEventListener("click", function () {
		document.getElementById("stone");
    } );
    document.addEventListener("click", function () {
		document.getElementById("scissor");
    });
    document.addEventListener("click", function () {
    	document.getElementById("bag");

    } );
}

function computerChoice	() {
	var randomNumber = Math.random();

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
		return 'LIKA';
	}
	else if (spelare === sten) {
        if (dator === sax) {
            return message(spelare, dator, true);
        } else {
            return message(spelare, dator, false);
        }
    }	else if (spelare === sax) {
            if (dator === sten) {
                return message (spelare, dator, false);
            } else {
                return message (spelare, dator, true);
            }
        } else if (spelare === påse) {
            if (dator === sten) {
                return message (spelare, dator, true);
            } else {
                return message (spelare, dator, false);
            }
	}
}
