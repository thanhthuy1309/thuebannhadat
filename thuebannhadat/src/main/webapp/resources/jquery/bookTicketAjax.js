var url;
var stadiumId;
var standId;
var matchId;
var floorId;
var seatValue;
var gateId;
var subSocket;
var socket;
var websocketUrl;
var logged = false;
var customerId = null;
var seatValueOrther;
var arrSeat = [];
var arrSeatOrther = [];

$(function() {
	url = $("#url").val();
	matchId = $("#matchId").val();
	stadiumId = $("#stadiumId").val();
	floorId = $("#floorId").val();
	gateId = $("#gateId").val();
	standId = $("#standId").val();

	socket = $.atmosphere;
	websocketUrl = url + "/websockets";

	var request = {
		url : websocketUrl,
		contentType : "application/json",
		logLevel : 'debug',
		transport : 'websocket',
		fallbackTransport : 'long-polling',
		onMessage : onMessage,
		onOpen : function(response) {
			console.log('Atmosphere onOpen: Atmosphere connected using '
					+ response.transport);
		},
		onReconnect : function(request, response) {
			console.log("Atmosphere onReconnect: Reconnecting");
		},
		onClose : function(response) {
			logged = false;
			console.log('Atmosphere onClose executed');
		},
		onError : function(response) {
			console
					.log('Atmosphere onError: Sorry, but there is some problem with your '
							+ 'socket or the server is down');
		}
	};

	subSocket = socket.subscribe(request);

});

function clickSeat(seat) {
	if (seat.className == 'seatfalse') {
		if (seatValue == null) {
			seatValue = parseInt($("#seatValue").val());
		}

		if (customerId == null) {
			customerId = $('customerId').val();
		}
		var id = seat.id.split('_');
		subSocket.push(jQuery.stringifyJSON({
			matchId : id[0],
			seatId : id[1],
			customerId : customerId,
			seatValue : seatValue,
			arrSeat: arrSeat,
			arrSeatOrther: arrSeatOrther
		}));
	}
}
function onMessage(response) {
	var message = response.responseBody;
	try {
		var json = jQuery.parseJSON(message);
	} catch (e) {
		console.log('This doesn\'t look like a valid JSON: ', message.data);
		return;
	}
	if (!logged) {
		logged = true;
		if (json.status == 'OK') {
			customerId = json.customerId;
			var array = json.mapSeatResver[matchId];
			if (array != undefined) {
				arrSeatOrther = array;
				for (var int = 0; int < array.length; int++) {
					$('#img' + array[int]).attr("src",
							"resources/img/seat_1.png");
				}
			}
		}
	} else {
		if (json.status == 'OK' && !json.flagNew) {
			var me = json.customerId == customerId;
			if (json.stateSeat != true) {
				var id = json.matchId + "_" + json.seatId;
				$('#' + id).removeClass('seatfalse').addClass('seattrue');
				if (me) {
					$('#img' + id).attr("src", "resources/img/seat_5.png");
					arrSeat.push(id);
					checkSelectSeat(id, arrSeat, seatValue);
				} else {
					$('#img' + id).attr("src", "resources/img/seat_1.png");
					seatValueOrther = json.seatValue;
					arrSeatOrther.push(id);
					
					var array = json.arrRemove;
					remove(array);
				}
			}
		}
	}
}

function remove(list) {
	for (var int = 0; int < list.length; int++) {
		$('#img' + list[int]).attr("src", "resources/img/seat_0.png");
	}
}

function checkSelectSeat(seatId, list, seatValueList) {
	for (var int = 0; int < seatValueList; int++) {
		if (list.length > seatValueList) {
			$('#' + list[0]).removeClass('seattrue').addClass('seatfalse');
			$('#img' + list[0]).attr("src", "resources/img/seat_0.png");
			list.splice(0, 1);
		}
	}
}

function checkSeat(list, seatValueList) {
	for (var int = 0; int < seatValueList; int++) {
		if (list.length > seatValueList) {
			list.splice(0, 1);
		}
	}
}

