var areaClass = {
	area: '',
	path: '',
	init: function (path) {
		this.path = path;
		this.getJson();
    },
	getJson: function () {
		$.getJSON(this.path, function (result) {
			areaClass.area = result;
            areaClass.display(1);
        });
    },
	change: function (level) {
		var pv = $("#s_province").val();
		var cv = $("#s_city").val();
		if (level == 1) {
            $("#s_city").empty();
            this.display(2, pv, cv);
        }
        $("#s_county").empty();
		this.display(3, pv, cv);
    },
	display: function (level, p, c) {
		if (level == 1) {
			var dom = '<option value="">省份</option>';
			for (var i in this.area) {
				dom += '<option value="'+i+'">'+i+'</option>';
			}
			$("#s_province").append(dom);
		} else if (level == 2) {
			var dom = '<option value="">地级市</option>';
			for (var i in this.area[p]) {
				dom += '<option value="'+i+'">'+i+'</option>';
			}
			$("#s_city").append(dom);
		} else {
			var dom = '<option value="">区/县</option>';
			for (var i in this.area[p][c]) {
				dom += '<option value="'+this.area[p][c][i]+'">'+this.area[p][c][i]+'</option>';
			}
			$("#s_county").append(dom);
		}
    }
};