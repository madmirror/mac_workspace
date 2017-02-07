
$(function(){
	let info = $('#info');

	chrome.storage.sync.get('total', function (items) {
		
		$('#total').text(items.total || 0);
	});


	$('#video').click(function () {
		console.log('downloading video')
		
		chrome.tabs.query({active: true, currentWindow: true}, function (tabs) {
			let url = tabs[0].url;
			let title = tabs[0].title;

			info.text('Downloading ', title);
			$.get('http://yongwang.space:5100/video?url=' + url, function (response) {
				info.text('Download complete -> ', title);
			});
		})
	});

	$('#music').click(function () {
		console.log('downloading music')
		chrome.tabs.query({active: true, currentWindow: true}, function (tabs) {
			let url = tabs[0].url;
			let title = tabs[0].title;

			info.text('Downloading Audio ', title)
		
			$.get('http://yongwang.space:5100/music?url=' + url, function (response) {
				info.text('Download Complte -> ', title);
			});
		})
	});


	// $('#addAmount').click(function () {

	// 	chrome.storage.sync.get('total', function (items) {
	// 		var newTotal = 0;
	// 		if(items.total) {
	// 			newTotal += parseInt(items.total);
	// 		}

	// 		var amount = $('#amount').val();
	// 		if(amount) {
	// 			newTotal += parseInt(amount);
	// 		}

	// 		chrome.storage.sync.set({'total': newTotal});

	// 		$('#total').text(newTotal);
	// 		$('#amount').val('');
			
	// 	});
		

	// });


});