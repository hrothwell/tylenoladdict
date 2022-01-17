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
	
	$("#aboutAndContacts").draggable({cancel: ".window-body"});
	$(".movieDraggable").draggable();
	setupEmailBox();
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
