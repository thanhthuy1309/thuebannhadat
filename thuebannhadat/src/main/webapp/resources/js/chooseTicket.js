var url;
var stadiumId;
var standId;
var floorId;
var seatValue = '1';
var gateId;

$(function() {
	url = $("#url").val();
});

function chooseStand(standIdValue, stadiumIdValue) {
	stadiumId = stadiumIdValue;
	standId = standIdValue;
	var data = {}
	data["standId"] = standId;
	data["stadiumId"] = stadiumId;
	$.ajax({
		url : url + "/selectStand",
		data : JSON.stringify(data),
		type : "POST",
		contentType : "application/json; charset=UTF-8",
		beforeSend : function(xhr) {
			xhr.setRequestHeader("Accept", "application/json; charset=UTF-8");
			xhr.setRequestHeader("Content-Type", "application/json; charset=UTF-8");
		},
		success : function(response1) {
			var response = $.parseJSON(response1);
			// Check if status OK
			var htmlFloors = "";
			var htmlGates = "";
			
			$('#divlstFloor').empty();
			$('#divlstGate').empty();
			
			if (response.status == "OK") {
				var floors = response.result;
				for (var i = 0; i < floors.length; i++) {
					htmlFloors += '<div class="funkyradio-danger">';
					if (i == 0) {
						htmlFloors += '<input type="radio" checked name="radio2" id="tang' + floors[i].floorId + '"';
						htmlFloors += ' onclick="chooseFloor('
							+ floors[i].stadiumId + ',' + floors[i].standId
							+ ',' + floors[i].floorId + ')"/>';
						$('.floor_match').html(floors[i].floorName);
						$('#floorId').val(floors[i].floorId);
					} else {
						htmlFloors += '<input type="radio" name="radio2" id="tang' + floors[i].floorId + '"';
						htmlFloors += ' onclick="chooseFloor('
							+ floors[i].stadiumId + ',' + floors[i].standId
							+ ',' + floors[i].floorId + ')"/>';
					}
					htmlFloors += '<label for="tang' + floors[i].floorId + '"' + 'id="floor' + floors[i].floorId + '">' + floors[i].floorName + '</label>';
					htmlFloors += '</div>';
				}
				
				var gates = response.listGate;
				if (gates != null) {
					htmlGates += '<select class="number_chair" onchange="changeGate()" id="seatGate">';
					for (var i = 0; i < gates.length; i++) {
						htmlGates += '<option value="' + gates[i].gateId + '" >' + gates[i].gateName + '</option>';
						if (i == 0) {
							$('#gateId').val(gates[i].gateId);
							$('.window_match').html(gates[i].gateName);
						}
					}
					htmlGates += '</select>';
				}
				var standName = $('#stand' + standId).text();
				$('#standId').val(standId);
				$('.kd_match').html(standName);
				
				changeSeat('1');
				
			} else {
				htmlFloors += "<p>Không có dữ liệu</p>";
				htmlGates += "<p>Không có dữ liệu</p>";
			}
			$('#divlstFloor').append(htmlFloors);
			$('#divlstGate').append(htmlGates);
		}
	});
}

function chooseFloor(stadiumIdValue, standIdValue, floorIdValue) {
	stadiumId = stadiumIdValue;
	standId = standIdValue;
	floorId = floorIdValue;
	var data = {}
	data["standId"] = standId;
	data["stadiumId"] = stadiumId;
	data["floorId"] = floorId;
	$.ajax({
		url : url + "/selectFloor",
		data : JSON.stringify(data),
		type : "POST",
		contentType : "application/json; charset=utf-8",
		beforeSend : function(xhr) {
			xhr.setRequestHeader("Accept", "application/json");
			xhr.setRequestHeader("Content-Type", "application/json");
		},
		success : function(response1) {
			var response = $.parseJSON(response1);
			// Check if status OK
			var htmlGates = "";
			$('#divlstGate').empty();
			if (response.status == "OK") {
				var gates = response.result;
				htmlGates += '<select class="number_chair" onchange="changeGate()" id="seatGate">';
				for (var i = 0; i < gates.length; i++) {
					htmlGates += '<option value="' + gates[i].gateId + '" >' + gates[i].gateName + '</option>';
					if (i == 0) {
						$('#gateId').val(gates[i].gateId);
						$('.window_match').html(gates[i].gateName);
					}
				}
				htmlGates += '</select>';
				var floorName = $('#floor' + floorId).text();
				$('#floorId').val(floorId);
				$('.floor_match').html(floorName);
				
				changeSeat('1');
			} else {
				htmlContent += "<p>Không có dữ liệu</p>";
			}
			$('#divlstGate').append(htmlGates);
		}
	});
}

function changeSeat(value) {
	if (value != null) {
		seatValue = value;
	} else {
		seatValue = $('#seatSelect').val();
	}
	$('#seatSelect').val(seatValue);
	$('#seatValue').val(seatValue);
	$('.chair_match').html($('#seatSelect').val() + " ghế");
}

function changeGate() {
	gateValue = $('#seatGate').val();
	var data = {}
	data["gateId"] = gateValue;
	$.ajax({
		url : url + "/changeGate",
		data : JSON.stringify(data),
		type : "POST",
		contentType : "application/json; charset=utf-8",
		beforeSend : function(xhr) {
			xhr.setRequestHeader("Accept", "application/json");
			xhr.setRequestHeader("Content-Type", "application/json");
		},
		success : function(response1) {
			var response = $.parseJSON(response1);
			// Check if status OK
			if (response.status == "OK") {
				var gate = response.result;
				if (gate.length > 0) {
					$('#gateId').val(gate[0].gateId);
					$('.window_match').html(gate[0].gateName);
				}
			}
			changeSeat('1');
		}
	});
}
