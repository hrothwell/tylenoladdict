/**
 * 
 */

$(document).ready(function(){
	$("#videoListContainer").slick({
		arrows: false
	});
	
	$("#next").click(function(){
		$("#videoListContainer").slick("next");
	});
	
	$("#prev").click(function(){
		$("#videoListContainer").slick("prev");
	});
	
	setupEmailButton();
	blink();
});


function setupEmailButton(){
	$("#email").click(function(){
		//todo
		$("#emailPopUp").toggle();
	});
}

function blink(){
	$("#openEyes").toggle();
	$("#closedEyes").toggle();
	
	setTimeout(blink, Math.random() * 2500);
}