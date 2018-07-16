/**
 * Created by admin on 2018/3/20.
 */

$(document).ready(function(){
    var area = areaClass;
    area.init("{% static 'slf/json/area.json' %}");
    $("#s_province").change(function () {
        area.change(1);
    });
    $("#s_city").change(function () {
        area.change(2);
    });
   $('#submit').click(function () {
    var appname = $('#appname').val();
    var province = $("#s_province").val();
    if(!province){
        layer.msg('请至少选一个省份！');
        return false;
    }
    var city = $("#s_city").val();
    var county = $("#s_county").val();
    var info_type = $('#info_type').val();
    $.ajax({
            'url': "{% url 'administrator:crawl_run' %}",
            'type': 'POST',
            'data': {
                'name':appname,
                'type': info_type,
                'province': province,
                'city': city,
                'county': county
            },
            'success': function (result) {
                if (result['success']) {
                    console.log(result['success'])
                } else {
                    layer.alert('失败');
                }
            }
        });
})
});