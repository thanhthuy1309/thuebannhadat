<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		var text = "";
		$('#search_ward').find('option').each(function() {
			if ($(this).val() != 0) {
				text += '"' + $(this).text() + '",';
			}
		});
		console.log(text);
	});
</script>
</head>
<body>

<select id="search_ward" name="w" class="js-example-basic-single select2-hidden-accessible" tabindex="-1" aria-hidden="true"><option value="0">Chọn phường/xã</option><option value="3753">Bảo Hòa</option><option value="3754">Gia Ray</option><option value="3755">Lang Minh</option><option value="3756">Suối Cao</option><option value="3757">Suối Cát</option><option value="3758">Xuân Bắc</option><option value="3759">Xuân Định</option><option value="3760">Xuân Hiệp</option><option value="3761">Xuân Hòa</option><option value="3762">Xuân Hưng</option><option value="3763">Xuân Phú</option><option value="3764">Xuân Tâm</option><option value="3765">Xuân Thành</option><option value="3766">Xuân Thọ</option><option value="3767">Xuân Trường</option></select>