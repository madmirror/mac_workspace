$(function(){

	chrome.storage.sync.get('goal', function (items) {
		
		$('#goal').text(items.total || 0);
	});


	$('#save').click(function () {

		chrome.storage.sync.get('goal', function (items) {
			var newTotal = 0;
			var amount = $('#goal').val();
			if(amount) {
				newTotal = parseInt(amount);
			}

			chrome.storage.sync.set({'goal': newTotal});

			$('#goal').val('');
			
		});
		

	});


});