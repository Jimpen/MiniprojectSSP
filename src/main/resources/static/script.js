//variabler från html
var bag = document.getElementById("bag");
var rock = document.getElementById("stone");
var scissors = document.getElementById("scissor");
var footer = document.getElementById("footer");
var playerBag = document.getElementById("playerBag");
var playerRock = document.getElementById("playerRock");
var playerScissors = document.getElementById("playerScissors");
var gif = document.getElementById("gif");
var computerRock = document.getElementById("computerRock");
var computerBag = document.getElementById("computerBag");
var computerScissors = document.getElementById("computerScissors");
//
var computerChoice;




function userChoice(){
	var state; //fixa state för vilken bild som ska visas


}

function computerMakeChoice	() {
	var randomNumber = Math.random();

	if (randomNumber <= 0.34) {
	    computerChoice = "rock";
	    computerRock.classList.remove("hidden");

	} else if (randomNumber <= 0.67) {
        computerChoice = "bag";
        computerBag.classList.remove("hidden");

	} else {
        computerChoice = "scissors";
        computerScissors.classList.remove("hidden");

	}
}

function compareChoice(player, computer) {

	if (player === computer) {
		return 'LIKA';
	}
	else if (player === 'rock') {
        if (computer === "scissors") {
            return "You rock!!";
        } else {
            return "Du förlorade";
        }
    }	else if (player === "scissors") {
            if (computer === "rock") {
                return "You sax";
            } else {
                return "Du vann";
            }
        } else if (player === "bag") {
            if (computer === "rock") {
                return "Du vann";
            } else {
                return "Du förlorade";
            }
	}
}

// document.addEventListener("click", function (userChoice) { //remember state, set other states to hidden
//     document.getElementById("stone");
// } );
// document.addEventListener("click", function (userChoice) {
//     document.getElementById("scissor");
// });
// document.addEventListener("click", function (userChoice) {
//     document.getElementById("bag");
// });


bag.addEventListener("click", function(){
    console.log("klicka påse");
    playerBag.classList.remove("hidden");
    gif.classList.add("hidden");
    computerMakeChoice();
    console.log(compareChoice("bag", computerChoice));
});

rock.addEventListener("click", function(){
    playerRock.classList.remove("hidden");
    gif.classList.add("hidden");
    computerMakeChoice();
    console.log(compareChoice("rock", computerChoice));
});

scissors.addEventListener("click", function(){
    playerScissors.classList.remove("hidden");
    gif.classList.add("hidden");
    computerMakeChoice();
    console.log(compareChoice("scissors", computerChoice));
});

footer.addEventListener("click",function () {
    console.log("Vanuscha klickar på foten");
});
