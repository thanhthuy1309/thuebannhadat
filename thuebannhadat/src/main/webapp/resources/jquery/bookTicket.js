var url;
var stadiumId;
var standId;
var floorId;
var seatValue = 1;
var gateId;

$(function() {
	url = $("#url").val();
	changeSeat();
});

function chooseStand(standIdValue, stadiumIdValue) {
	stadiumId = stadiumIdValue;
	standId = standIdValue;
	changeColor(".stand", "#stand" + standId);
	$.ajax({
		url : url + "/selectStand",
		data : {
			"standId" : standId,
			"stadiumId" : stadiumId
		},
		type : "GET",
		contentType : "application/json; charset=UTF-8",
		beforeSend : function(xhr) {
			xhr.setRequestHeader("Accept", "application/json; charset=UTF-8");
			xhr.setRequestHeader("Content-Type", "application/json; charset=UTF-8");
		},
		success : function(response1) {
			var response = $.parseJSON(response1);
			// Check if status OK
			var htmlContent = "";
			if (response.status == "OK") {
				var floors = response.result;
				for (var i = 0; i < floors.length; i++) {
					htmlContent += '<p class="floor" id="floor'
							+ floors[i].floorId + '" onclick="chooseFloor('
							+ floors[i].stadiumId + ',' + floors[i].standId
							+ ',' + floors[i].floorId + ')">'
							+ floors[i].floorName + '</p>';
				}
				var standName = $('#stand' + standId).text();
				$('#standId').val(standId);
				$('#standName').html(standName);
			} else {
				htmlContent += "<p>Không có dữ liệu</p>";
			}
			$('.col_floor').html(htmlContent);
		}
	});
}

function chooseFloor(stadiumIdValue, standIdValue, floorIdValue) {
	stadiumId = stadiumIdValue;
	standId = standIdValue;
	floorId = floorIdValue
	changeColor(".floor", "#floor" + floorId);
	$.ajax({
		url : url + "/selectFloor",
		data : {
			"standId" : standId,
			"stadiumId" : stadiumId,
			"floorId" : floorId
		},
		type : "GET",
		contentType : "application/json; charset=utf-8",
		beforeSend : function(xhr) {
			xhr.setRequestHeader("Accept", "application/json");
			xhr.setRequestHeader("Content-Type", "application/json");
		},
		success : function(response1) {
			var response = $.parseJSON(response1);
			// Check if status OK
			var htmlContent = "";
			if (response.status == "OK") {
				var gates = response.result;
				for (var i = 0; i < gates.length; i++) {
					htmlContent += '<p class="gate" id="gate' + gates[i].gateId
							+ '" onclick="chooseGate(' + gates[i].gateId
							+ ')">' + gates[i].gateName + '</p>';
				}
				var floorName = $('#floor' + floorId).text();
				$('#floorId').val(floorId);
				$('#floorName').html(floorName);
			} else {
				htmlContent += "<p>Không có dữ liệu</p>";
			}
			$('.col_gate').html(htmlContent);
		}
	});
}

function chooseGate(gateIdValue) {
	gateId = gateIdValue;
	changeColor(".gate", "#gate" + gateId)
	var gateName = $('#gate' + gateId).text();
	$('#gateId').val(gateId);
	$('#gateName').html(gateName);
}

function changeSeat() {
	seatValue = $('#seatSelect').val();
	$('#seatValue').val(seatValue);
	$('#seatValueName').html(seatValue + " ghế");
}

function changeColor(value1, value2) {
	$(value1).css('color', '#000000');
	$(value2).css('color', '#f44336');
}

