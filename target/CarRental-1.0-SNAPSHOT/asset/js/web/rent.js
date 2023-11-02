var bookig=[];
var dataCarD;
function removeBooking(bId) {

}
function setBookings() {
    $("#tbl-col-group").children().remove();
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/CarRental_war/booking/getbooking",
        contentType: "application/json",
        dataType: "json",
        data: {"nic": localStorage.getItem("nic")},
        success: function (result) {
            console.log(result.data)

            for (const b in result.data) {
                $("#tbl-col-group").append("<div id='b" + b.booking_id + "' class=\"d-flex flex-row justify-content-center align-items-center  p-2  rounded-3 my-column\" >\n" +
                    "                                <span class=\"rent-box-txt-bold flex-grow-1\">" + b.booking_id + "</span>\n" +
                    "                                <span class=\" flex-grow-1\">" + b.nic + "</span>\n" +
                    "                                <span class=\" flex-grow-1\">" + b.carCount + " </span>\n" +
                    "                                <span class=\" flex-grow-1\">" + b.date + " </span>\n" +
                    "                                <span class=\" flex-grow-1\">" + b.time + " </span>\n" +
                    "                                <span class=\" flex-grow-1\">" + b.booking_payment + " </span>\n" +
                    "                                <span class=\" flex-grow-1\">" + b.net_payment + " </span>\n" +
                    "                                <span class=\"rent-box-txt-bold flex-grow-1\" style=\"color: #6fdb8e\">" + b.status + " </span>\n" +
                    "                            </div>");
                    let s = "#b"+b.booking_id;
                let text = $('s:nth-child(1)').text();
                if (b.status == "pending") {
                    $("#b"+b.booking_id +"").append(
                        "                                <button onclick='removeBooking(text)' type=\"submit\" class=\"border-0 p-1 rounded-circle bg-danger\">\n" +
                        "                                    <i class=\"fa-regular fa-circle-xmark m-1\" style=\"color: #ffffff;\"></i>\n" +
                        "                                </button>\n" +
                        "");
                }
            }


        },
        error: function (e) {
            console.log("ERROR: ", e);
            // displayUsernamError(e);
        },
        done: function (e) {
            console.log("DONE");
        }
    });
}

$(document).ready(function () {
    setBookings();
f()
    function f() {
        //alert(localStorage.getItem("carCode"))
        $("#user-nic-header").text( localStorage.getItem("nic"));
        // $(".rent-1").css({'display': 'none', 'visibility': 'hidden'});
        setRentData();
        if (bookig.length>0){
            $(".rent-2").css({'display': 'block', 'visibility': 'visible'});
            $("#booking-count").text(bookig.length);
            $("#car-booking-counting").text(bookig.length);
        }else {
             $(".rent-2").css({'display': 'none', 'visibility': 'hidden'});
        }
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
            $(".rent-1").css({'display': 'block', 'visibility': 'visible'});
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



let startDate = document.getElementById('startDate')
let endDate = document.getElementById('endDate')
let startDateVal
let endDateVal

startDate.addEventListener('change',(e)=>{
    startDateVal = e.target.value
    calcTotalRent(startDateVal,endDateVal);
})
function calcTotalRent(startDateVal,endDateVal) {
    if (startDateVal!=null&&endDateVal!=null){
        let number = datediff(parseDate(startDateVal), parseDate(endDateVal));
        const getMonth=parseInt(number)/30;
        const getDate=parseInt(number)%30;
        const monthly = parseFloat(getMonth).toFixed(0) * parseFloat($("#car-rent-from-car-detail-monthly").text()) ;
        const daly =parseFloat(getDate).toFixed(0) * parseFloat($("#car-rent-from-car-detail-days").text() );
        // console.log(parseFloat(monthly))
        // console.log(parseFloat(daly))
        $("#Total-rent").text(parseFloat((parseFloat (monthly))+(parseFloat(daly))).toFixed(2))
        // alert(number);
        //alert(number);
        if (parseFloat( $("#Total-rent").text())>0){
            $("#rent-car-to-request").prop('disabled', false);
            $("#rent-car-to-request").css('opacity', "100%");
        }
        }else {
        $("#rent-car-to-request").prop('disabled', true);
        $("#rent-car-to-request").css('opacity', "50%");
        }

    }
endDate.addEventListener('change',(e)=>{
     endDateVal = e.target.value
    calcTotalRent(startDateVal,endDateVal)


});
function datediff(first, second) {
    return Math.round((second - first) / (1000 * 60 * 60 * 24));
}
function parseDate(str) {
    console.log(str)
    var mdy = str.split("-");
    return new Date(mdy[0], mdy[1], mdy[2]);
};



$("#rent-car-to-request").click(function () {

    console.log(parseFloat( $("#Total-rent").text())>0)
    if (parseFloat( $("#Total-rent").text())>0){
        $("#rent-car-to-request").prop('disabled', false);
        $("#rent-car-to-request").css('opacity', "100%");
        var car={
            "carCode": $("#car-rent-from-car-detail-carCode").text(),
            "carRentPrice":parseFloat( $("#Total-rent").text()),
            "start":startDateVal,
            "endDate":endDateVal
        }

        bookig.push(car);
        $("#booking-count").text(bookig.length);
        $("#car-booking-counting").text(bookig.length);
        console.log(bookig);
        $(".rent-2").css({'display': 'block', 'visibility': 'visible'});
        setTotalAndBookinCount();


    }else {
        $("#rent-car-to-request").prop('disabled', true);
        $("#rent-car-to-request").css('opacity', "50%");
    }


});

function setTotalAndBookinCount() {
    let tot=0;
    for (const b of bookig) {

        const num1=parseFloat(b.carRentPrice).toFixed(2);
        const num2=parseFloat(tot).toFixed(2);
        const daly =(parseFloat(num1)+parseFloat(num2)).toFixed(2);
        tot=daly;
        console.log(tot);
    }

    $("#booking-total-rentFrom").text(tot);
}

function setRentData() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/CarRental_war/user/getUser",
        contentType: "application/json",
        dataType: "json",
        data:{"nic":localStorage.getItem("nic")},
        success: function (result) {
            alert(result.data.fistName+" "+result.data.lastName)
            $("#name-requestFrom").text(result.data.fistName+" "+result.data.lastName);
            $("#dLicense-requestFrom").text(result.data.d_license);
            $("#nic-requestFrom").text(result.data.c_nic);
            $("#address-requestFrom").text(result.data.street+","+result.data.lane+","+result.data.city);

            $("#car-booking-counting").text(bookig.length);

            setTotalAndBookinCount();
            },
        error: function (e) {
            console.log("ERROR: ", e);
        },
        done: function (e) {
            console.log("DONE");
        }
    });
}


$("#request-to-booking").click(function () {
    $.ajax({
        type: "POST",
        url: "http://localhost:8080/CarRental_war/booking/bookingReqvest",
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(bookig),
        success: function (result) {
            alert("fuck")
            bookig=[];
        },
        error: function (e) {
            console.log("ERROR: ", e);
        },
        done: function (e) {
            console.log("DONE");
        }
    });
})

