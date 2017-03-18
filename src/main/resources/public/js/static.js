//Services Get
function hk_services_get()
{
//	alert("123");
    $.ajax({
        dataType: "json",
        async: false,
        type: "GET",
        url: '/api/v1/services',
        success: function(response) {
            //alert('1');
            var obj = response;
            var $grouplist = $('.fh5co-sub-menu');
            for (var i = 0; i < obj.length; i++) {
                $('<li>' + '<a>' + obj[i].sr_DESCRIPTION + '</a>' + '</li>').appendTo($grouplist);
             }

        }
    });

}
