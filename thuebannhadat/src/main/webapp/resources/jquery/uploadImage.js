var totalImage = 0;
var size = 2048000;
var arrayImageName = [];
$(document).ready(function() {

	$("#files").change(function(evt) {
		handleFileSelect(evt);
	});
});

function handleFileSelect(evt) {
	var files = evt.target.files; // FileList object

	// Loop through the FileList and render image files as thumbnails.
	for (var i = 0, f; f = files[i]; i++) {

		// Only process image files.
		if (!f.type.match('image.*')) {
			continue;
		} else if (!checkSize(f.size)) {
			continue;
		}

		checkPixel(f, function(status) {
			if (!status) {
				alert("Kich thuoc toi thieu 300 x 300");
			}
		});

	}
}

function checkSize(sizeFile) {
	if (sizeFile > size) {
		alert("size toi da < 2MB");
		return false;
	}
	return true;
}

function checkPixel(file, callback) {
	var _URL = window.URL || window.webkitURL;
	var img = new Image();

	img.onload = function() {
		if (this.width < 300 || this.height < 300) {
			callback(false);
		} else {
			callback(true);
			//read = blog
//			var reader = new FileReader();
//			// Closure to capture the file information.
//			reader.onload = (function(theFile) {
//				return function(e) {
//					totalImage++;
//					if (checkTotalImage(totalImage)) {
//
//						var name = escape(theFile.name);
//						if (arrayImageName.indexOf(name) < 0) {
//							arrayImageName.push(name);
//							// Render thumbnail.
//							var span = document.createElement('span');
//							span.innerHTML = [ '<img class="thumb" src="',
//									e.target.result, '" title="', name, '"/>' ]
//									.join('');
//							document.getElementById('list').insertBefore(span,
//									null);
//						} else {
//							alert("Anh " + name + " bi trung");
//						}
//					}
//				};
//			})(file);
//
//			// Read in the image file as a data URL.
//			reader.readAsDataURL(file);
			
			// read tmp file
			totalImage++;
			if (checkTotalImage(totalImage)) {
				var name = file.name;
				if (arrayImageName.indexOf(name) < 0) {
					arrayImageName.push(name);
					var tmppath = URL.createObjectURL(file);
					var span = document.createElement('span');
					span.innerHTML = [ '<img class="thumb" src="',
					                   tmppath, '" title="', name, '"/>' ]
							.join('');
					document.getElementById('list').insertBefore(span,
							null);
				} else {
					alert("Anh " + name + " bi trung");
				}
				
			}
			
		}
	};
	img.src = _URL.createObjectURL(file);
}

function checkTotalImage(totalImage) {
	var goiDangTin = 2;
	if ((goiDangTin == 1 && totalImage > 7)
			|| (goiDangTin == 2 && totalImage > 15)) {
		alert("Qua so hinh cho phep dc dang");
		return false;
	}
	return true;
}

function showImage(f) {
	var reader = new FileReader();

	// Closure to capture the file information.
	reader.onload = (function(theFile) {
		return function(e) {
			totalImage++;
			if (checkTotalImage(totalImage)) {
				// Render thumbnail.
				var span = document.createElement('span');
				span.innerHTML = [ '<img class="thumb" src="', e.target.result,
						'" title="', escape(theFile.name), '"/>' ].join('');
				document.getElementById('list').insertBefore(span, null);
			}
		};
	})(f);

	// Read in the image file as a data URL.
	reader.readAsDataURL(f);
}