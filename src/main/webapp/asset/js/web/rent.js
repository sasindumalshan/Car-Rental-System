
var dataCarD;
$(document).ready(function () {
f()
    function f() {
        //alert(localStorage.getItem("carCode"))

      //  console.log(localStorage.getItem("carCode"))
    }



    $.ajax({
        type: "GET",
        url: "http://localhost:8080/CarRental_war/rent",
        contentType: "application/json",
        dataType: "json",
        data:{"carCode":localStorage.getItem("carCode")},
        success: function (result) {
            console.log(result.data)
             dataCarD = result;
            $("#car-rent-from-car-detail-carCode").text(result.data.carCode);
            $("#rentPage-renting-car-name").text(result.data.brand);
            $("#car-rent-from-car-detail-name").text(result.data.brand);
            $("#car-rent-from-car-detail-type").text(result.data.type);
            $("#car-rent-from-car-detail-capacity").text(result.data.no_of_passengers);
            $("#car-rent-from-car-detail-steering").text(result.data.transmission_type);
            $("#car-rent-from-car-detail-gasoline").text(result.data.fuel_type);
            $("#car-rent-from-car-detail-days").text(result.data.cp_id.daily_rate);
            $("#car-rent-from-car-detail-monthly").text(result.data.cp_id.Monthly_rate);
            $("#car-rent-from-car-day-for-free-km").text(result.data.cp_id.Day_for_free_Km);
            $("#car-rent-from-car-km-for").text(result.data.cp_id.month_for_Rate_km);
            $("#car-rent-from-km-for-charge").text(result.data.cp_id.price_for_extra_km);

            $("#car-rent-from-car-detail-primary-image").attr("src","data:image/png;base64," + result.data.carImg.images_font +" ");
            $("#car-rent-from-car-detail-images_font").attr("src","data:image/png;base64," + result.data.carImg.images_font + "");
            $("#car-rent-from-car-detail-images_side").attr("src","data:image/png;base64," + result.data.carImg.images_side + "");
            $("#car-rent-from-car-detail-images_back").attr("src","data:image/png;base64," + result.data.carImg.images_back + "");
            $("#car-rent-from-car-detail-images_interior").attr("src","data:image/png;base64," + result.data.carImg.images_interior + "");

        },
        error: function (e) {
            console.log("ERROR: ", e);
            // displayUsernamError(e);
        },
        done: function (e) {
            console.log("DONE");
        }
    });
});

$(".car-rent-from-car-detail-rentNowBtn").click(function () {

});
$("#car-rent-from-car-detail-images_font").click(function () {
    $("#car-rent-from-car-detail-primary-image").attr("src","data:image/png;base64," + dataCarD.data.carImg.images_font + "");
});

$("#car-rent-from-car-detail-images_side").click(function () {
    $("#car-rent-from-car-detail-primary-image").attr("src","data:image/png;base64," + dataCarD.data.carImg.images_side + "");
});
$("#car-rent-from-car-detail-images_back").click(function () {
    $("#car-rent-from-car-detail-primary-image").attr("src","data:image/png;base64," + dataCarD.data.carImg.images_back + "");
});
$("#car-rent-from-car-detail-images_interior").click(function () {
    $("#car-rent-from-car-detail-primary-image").attr("src","data:image/png;base64," + dataCarD.data.carImg.images_interior + "");
});


$("#rent-car-to-request").click(function () {

   var car={
            "carCode": $("#car-rent-from-car-detail-carCode").text(),

            }
})

