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
	
	setupEmailBox();
	blink();
});


function setupEmailBox(){
	$("#email").click(function(){
		//todo
		$("#emailPopUp").toggle();
	});
	$("#emailPopUp").draggable({cancel: ".window-body"});
	
	$("#OKEmailButton, #emailClose").click(function(){
		$("#emailPopUp").hide();
	});
}

function blink(){
	$("#openEyes").toggle();
	$("#closedEyes").toggle();
	
	setTimeout(blink, Math.random() * 2500);
}