$(function() {
    //console.log( "ready!" );
	
	// AJAX
	// Assign handlers immediately after making the request,
	// and remember the jqXHR object for this request
	var header = {'Content-Type' : 'application/json',
			'Authorization' : 'Bearer '+Cookies.get('food-jwt-token')};
	
	var jqxhr = $.ajax({
		url: '/allProducts',
		headers: header
	}).done(function(data) {
		
		for(i=0; i<data.length;i++) {
		// prepare card to display for every product
		var $product = $('<div/>',{
		    'class':'card mb-3'
		})
		.append(
				$('<img/>', {
					id: '',
					src: "data:image/png;base64,"+data[i].stock.image,
					alt: 'image'
				})
		)
		.append(
				$('<div/>', {
					'class':'card-body'
				})
				.append(
						$('<h5>', {
							'class':'card-title float-right',
							'text':data[i].pricePerUnit
						})
				)
				.append(
						$('<h5>', {
							'class':'card-title',
							'text':data[i].stock.name
						})
				)
				.append(
						$('<h5>', {
							'class':'card-title float-right',
							'text':data[i].quantity
						})
				)
				.append(
						$('<p/>', {
							'class':'card-text',
							'text':data[i].stock.desc
						})
				)
				.append(
						$('<a/>', {
							'class':'btn btn-primary btn-sm',
							'href':'#',
							'text':"Add To Cart",
							'onclick': 'addToCart('+ data[i].productId +')'
						})
				)
				.append(
						$('<p/>', {
							'class':'card-text float-right',
							'text': '2 in cart'
						})
				)
				.append(
						$('<span/>', {
							'text': data[i].productId,
							'hidden': 'hidden'
						})
				)
		);
		$('.product-container').append($product);
		}
		
	}).fail(function(response) {
		// case of token expired
		if(response.status == 403 || response.status == 401) {
			window.location.href = "/page/loginPage";
		}
	}).always(function() {});
	
});

function addToCart(productId) {
	
}