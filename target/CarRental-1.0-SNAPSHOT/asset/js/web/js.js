/*
$("#next-one").click(function () {
    $('#signUpUserDetailsFrom').toggleClass("hidden-element");
    $('#signUpUserDetailsFrom').removeClass("unhidden-element");

    $('#signUpUserDrivingLicenseDetailsFrom').removeClass("hidden-element");
    $('#signUpUserDrivingLicenseDetailsFrom').toggleClass("unhidden-element");
});

$("#next-two").click(function () {
    $('#signUpUserDrivingLicenseDetailsFrom').toggleClass("hidden-element");
    $('#signUpUserDrivingLicenseDetailsFrom').removeClass("unhidden-element");

    $('#signUpUserNICDetailsFrom').toggleClass("unhidden-element");
    $('#signUpUserNICDetailsFrom').removeClass("hidden-element");

});
$('#previews-one').click(function () {
    $('#signUpUserDetailsFrom').removeClass('hidden-element');
    $('#signUpUserDetailsFrom').toggleClass('unhidden-element');


    $('#signUpUserDrivingLicenseDetailsFrom').removeClass("unhidden-element");
    $('#signUpUserDrivingLicenseDetailsFrom').toggleClass("hidden-element");


});

$("#previews-two").click(function () {
    $('#signUpUserDrivingLicenseDetailsFrom').removeClass("hidden-element");
    $('#signUpUserDrivingLicenseDetailsFrom').toggleClass("unhidden-element");

    $('#signUpUserNICDetailsFrom').removeClass("unhidden-element");
    $('#signUpUserNICDetailsFrom').toggleClass("hidden-element");


});
$('#sign-close').click(function () {
    $('#signUpUserDetailsFrom').removeClass("unhidden-element");
    $('#signUpUserDrivingLicenseDetailsFrom').removeClass("unhidden-element");
    $('#signUpUserNICDetailsFrom').removeClass("unhidden-element");


    /!*$('#signUpUserDetailsFrom').toggleClass("hidden-element");
    $('#signUpUserDrivingLicenseDetailsFrom').toggleClass("hidden-element");
    $('#signUpUserNICDetailsFrom').toggleClass("hidden-element");*!/


    $('#sing-up-form').toggleClass("hidden-element");
    $('#sing-up-form').removeClass("unhidden-element");


});

$("#sign-in").click(function () {
    $('#sign-in-form').removeClass("hidden-element");
    $('#sign-in-form').toggleClass("unhidden-element");
});

$("#register-here").click(function () {
    $('#sing-up-form').removeClass("hidden-element");
    $('#sing-up-form').toggleClass("unhidden-element");

    $('#sign-in-form').removeClass("unhidden-element");
    $('#sign-in-form').toggleClass("hidden-element");

    $('#signUpUserDetailsFrom').toggleClass("unhidden-element");
    $('#signUpUserDetailsFrom').removeClass("hidden-element");


});
$("#sign-in-close").click(function () {
    $('#sign-in-form').removeClass("unhidden-element");
    $('#sign-in-form').toggleClass("hidden-element");
});
*/

$("#next-one").click(function () {
    $('#signUpUserDetailsFrom').css({'display': 'none', 'visibility': 'hidden'});
 //   $('#signUpUserDetailsFrom').removeClass("unhidden-element");

  //  $('#signUpUserDrivingLicenseDetailsFrom').removeClass("hidden-element");
    $('#signUpUserDrivingLicenseDetailsFrom').css({'display': 'block', 'visibility': 'visible'});
});

$("#next-two").click(function () {
    $('#signUpUserDrivingLicenseDetailsFrom').css({'display': 'none', 'visibility': 'hidden'});
 //   $('#signUpUserDrivingLicenseDetailsFrom').removeClass("unhidden-element");

 //   $('#signUpUserNICDetailsFrom').toggleClass("unhidden-element");
    $('#signUpUserNICDetailsFrom').css({'display': 'block', 'visibility': 'visible'});

});

$('#previews-one').click(function () {
    $('#signUpUserDetailsFrom').css({'display': 'block', 'visibility': 'visible'});
    //$('#signUpUserDetailsFrom').toggleClass('unhidden-element');


   // $('#signUpUserDrivingLicenseDetailsFrom').removeClass("unhidden-element");
    $('#signUpUserDrivingLicenseDetailsFrom').css({'display': 'none', 'visibility': 'hidden'});


});

$("#previews-two").click(function () {
    //$('#signUpUserDrivingLicenseDetailsFrom').removeClass("hidden-element");
    $('#signUpUserDrivingLicenseDetailsFrom').css({'display': 'block', 'visibility': 'visible'});

    $('#signUpUserNICDetailsFrom').css({'display': 'none', 'visibility': 'hidden'});
  //  $('#signUpUserNICDetailsFrom').toggleClass("hidden-element");


});

$('#signUpUserDetailsFrom').css({'display': 'none', 'visibility': 'hidden'});
$('#signUpUserDrivingLicenseDetailsFrom').css({'display': 'none', 'visibility': 'hidden'});
$('#signUpUserNICDetailsFrom').css({'display': 'none', 'visibility': 'hidden'});
$('#sing-up-form').css({'display': 'none', 'visibility': 'hidden'});
$('#sign-in-form').css({'display': 'none', 'visibility': 'hidden'});

$('#sign-close').click(function () {
    $('#signUpUserDetailsFrom').css({'display': 'none', 'visibility': 'hidden'});
    $('#signUpUserDrivingLicenseDetailsFrom').css({'display': 'none', 'visibility': 'hidden'});
    $('#signUpUserNICDetailsFrom').css({'display': 'none', 'visibility': 'hidden'});


    /*$('#signUpUserDetailsFrom').toggleClass("hidden-element");
    $('#signUpUserDrivingLicenseDetailsFrom').toggleClass("hidden-element");
    $('#signUpUserNICDetailsFrom').toggleClass("hidden-element");*/


  //  $('#sing-up-form').toggleClass("hidden-element");
    $('#sing-up-form').css({'display': 'none', 'visibility': 'hidden'});


});

$("#sign-in").click(function () {
  //  $('#sign-in-form').removeClass("hidden-element");
    $('#sign-in-form').css({'display': 'block', 'visibility': 'visible','transaction':'all 0.5 ease'});

});

$("#register-here").click(function () {
    //$('#sing-up-form').removeClass("hidden-element");
    $('#sing-up-form').css({'display': 'block', 'visibility': 'visible'});

    //$('#sign-in-form').removeClass("unhidden-element");
    $('#sign-in-form').css({'display': 'none', 'visibility': 'hidden'});

   // $('#signUpUserDetailsFrom').toggleClass("unhidden-element");
    $('#signUpUserDetailsFrom').css({'display': 'block', 'visibility': 'visible'});


});

$("#sign-in-close").click(function () {
   // $('#sign-in-form').removeClass("unhidden-element");
    $('#sign-in-form').css({'display': 'none', 'visibility': 'hidden'});
});


$("#privacy-btn").click(
    function () {
        $("#theme-label").css({'display': 'none', 'visibility': 'hidden'});
        $("#privacy-label").css({'display': 'block', 'visibility': 'visible'});
        $("#nic-label").css({'display': 'none', 'visibility': 'hidden'});
        $("#driving-licence-label").css({'display': 'none', 'visibility': 'hidden'});
    }
);
$("#theme-btn").click(
    function () {

        $("#theme-label").css({'display': 'block', 'visibility': 'visible'});
        $("#privacy-label").css({'display': 'none', 'visibility': 'hidden'});
        $("#nic-label").css({'display': 'none', 'visibility': 'hidden'});
        $("#driving-licence-label").css({'display': 'none', 'visibility': 'hidden'});
    }
);
$("#nic-btn").click(
    function () {

        $("#theme-label").css({'display': 'none', 'visibility': 'hidden'});
        $("#privacy-label").css({'display': 'none', 'visibility': 'hidden'});
        $("#nic-label").css({'display': 'block', 'visibility': 'visible'});
        $("#driving-licence-label").css({'display': 'none', 'visibility': 'hidden'});
    }
);
$("#driving-licence-btn").click(
    function () {

        $("#theme-label").css({'display': 'none', 'visibility': 'hidden'});
        $("#privacy-label").css({'display': 'none', 'visibility': 'hidden'});
        $("#nic-label").css({'display': 'none', 'visibility': 'hidden'});
        $("#driving-licence-label").css({'display': 'block', 'visibility': 'visible'});
    }
);

$("#setting-btn").click(function () {
  /*  $("#setting-form").css({'display': 'block', 'visibility': 'visible'});
    $("#privacy-label").css({'display': 'block', 'visibility': 'visible'});
    $("#nic-label").css({'display': 'none', 'visibility': 'hidden'});
    $("#driving-licence-label").css({'display': 'none', 'visibility': 'hidden'});
    $("#theme-label").css({'display': 'none', 'visibility': 'hidden'});*/


});

$("#setting-close").click(function () {
    $("#setting-form").css({'display': 'none', 'visibility': 'hidden'});
    $("#theme-label").css({'display': 'none', 'visibility': 'hidden'});
    $("#privacy-label").css({'display': 'none', 'visibility': 'hidden'});
    $("#nic-label").css({'display': 'none', 'visibility': 'hidden'});
    $("#driving-licence-label").css({'display': 'none', 'visibility': 'hidden'});

    /*$("#theme-btn").css({'display': 'none', 'visibility': 'hidden'});
    $("#driving-licence-btn").css({'display': 'none', 'visibility': 'hidden'});
    $("#nic-btn").css({'display': 'none', 'visibility': 'hidden'});
    $("#privacy-btn").css({'display': 'none', 'visibility': 'hidden'});*/

});




$(document).ready(function () {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/CarRental_war/car/getCategory",
        contentType: "application/json",
        dataType: "json",
        success: function (result) {

            for (const c of result.data) {
                $.ajax({
                    type: "GET",
                    url: "http://localhost:8080/CarRental_war/car/getForUi",
                    contentType: "application/json",
                    dataType: "json",
                    data: {"category": c},
                    success: function (result) {
                        console.log("SUCCESS: ");
                        $("#ajax").text(result);
                        // displayUsernamError(result);
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


        },
        error: function (e) {
            console.log("ERROR: ", e);
            // displayUsernamError(e);
        },
        done: function (e) {
            console.log("DONE");
        }
    });

    getCars();

    // $("#cars:nth-last-child(1)").append("<h1>ok</h1>");
    function getCars() {

        $.ajax({
            type: "GET",
            url: "http://localhost:8080/CarRental_war/car/getCategory",
            contentType: "application/json",
            dataType: "json",
            success: function (result) {


                for (const c of result.data) {

                    let carContainerBox = $("#cars").append("<div class=\"w-100\"></div>").children();

                    // set Car Category
                    carContainerBox.last().append("<div class=\"border-1 w-100 d-flex flex-row justify-content-between align-items-center mt-5 mb-5\">" +
                        "                <span class=\"filter-main-font-1\">" + c + "</span>" +
                        "                <a><span class=\"filter-main-font-2\">View All</span></a>" +
                        "            </div>");

                    let carCollection = carContainerBox.last().append("<div class=\"position-relative w-100\"></div>").children();


                    // set shadow
                    carCollection.last().append("<div class=\"position-absolute h-100 shadow-car-box\"></div>");
                    // set OverFlow Container
                    let overFlowContainer = carCollection.last().append("<div class=\"overflow-auto w-100 sc \"></div>").children();
                    // set Flex Container
                    let flexContainer = overFlowContainer.last().append(" <div class=\"d-flex flex-row gap-2 p-2 w-fit-to-content \"></div>").children();


                    $.ajax({
                        type: "GET",
                        url: "http://localhost:8080/CarRental_war/car/getForUi",
                        contentType: "application/json",
                        dataType: "json",
                        data: {"category": c},
                        success: function (result) {

                            var car = result.data;

                            console.log(car);
                            console.log(car[0].brand);

                            for (var carElement of car) {
                                flexContainer.append("<div class=\"home-rent-box d-flex flex-column justify-content-start align-items-center flex-wrap p-3 gap-1\">\n" +
                                    "   <form  action=rent.html \ >\n" +
                                    "                                <div class=\"w-100\">\n" +
                                    "                                    <span class=\"d-block rent-box-txt-bold\">" + carElement.brand + "</span>\n" +
                                    "                                    <label for='nameCarCode'  id='" + carElement.carCode + "' class=\"rent-box-txt txt-span-code\">" + carElement.carCode + "</label>\n" +
                                    "                                </div>\n" +
                                    "                                <div class=\"w-100 d-flex flex-wrap justify-content-center align-items-start\" >\n" +
                                    // "                                    <img class=\"w-75\" src=\"asset/image/purepng.com-range-rover-evoque-orange-carcarvehicletransportland-rover-961524660616fid5x.png\">\n" +
                                    "                                    <img style='height: 124px' src='data:image/png;base64," + carElement.carImg.images_font + "'>\n" +
                                    // <img th:src="@{'data:image/jpeg;base64,'+${contentImage}}">
                                    "                                </div>\n" +
                                    "                                <div class=\"w-100 d-flex flex-row flex-wrap gap-2 justify-content-start align-items-start\" >\n" +
                                    "                                    <div>\n" +
                                    "                                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"14\" height=\"14\" viewBox=\"0 0 14 14\" fill=\"none\">\n" +
                                    "                                            <path d=\"M13.0316 5.44246L11.865 4.85913C11.6491 4.75413 11.3808 4.83579 11.2758 5.05163C11.165 5.27329 11.2525 5.53579 11.4683 5.64079L12.3958 6.10163V8.89579L10.2083 8.90163V2.91663C10.2083 1.74996 9.42663 1.16663 8.45829 1.16663H3.79163C2.82329 1.16663 2.04163 1.74996 2.04163 2.91663V12.3958H1.16663C0.927459 12.3958 0.729126 12.5941 0.729126 12.8333C0.729126 13.0725 0.927459 13.2708 1.16663 13.2708H11.0833C11.3225 13.2708 11.5208 13.0725 11.5208 12.8333C11.5208 12.5941 11.3225 12.3958 11.0833 12.3958H10.2083V9.77663L12.8333 9.77079C13.0783 9.77079 13.2708 9.57246 13.2708 9.33329V5.83329C13.2708 5.66996 13.1775 5.51829 13.0316 5.44246ZM3.49996 4.01913C3.49996 3.20829 3.99579 2.91663 4.60246 2.91663H7.65329C8.25413 2.91663 8.74996 3.20829 8.74996 4.01913V4.73663C8.74996 5.54163 8.25413 5.83329 7.64746 5.83329H4.60246C3.99579 5.83329 3.49996 5.54163 3.49996 4.73079V4.01913ZM3.79163 7.14579H5.54163C5.78079 7.14579 5.97913 7.34413 5.97913 7.58329C5.97913 7.82246 5.78079 8.02079 5.54163 8.02079H3.79163C3.55246 8.02079 3.35413 7.82246 3.35413 7.58329C3.35413 7.34413 3.55246 7.14579 3.79163 7.14579Z\" fill=\"#90A3BF\"/>\n" +
                                    "                                        </svg>\n" +
                                    "                                        <span class=\"rent-box-txt\">" + carElement.fuel_type + "</span>\n" +
                                    "                                    </div>\n" +
                                    "                                    <div>\n" +
                                    "                                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"14\" height=\"14\" viewBox=\"0 0 14 14\" fill=\"none\">\n" +
                                    "                                            <path d=\"M7 1C3.688 1 1 3.688 1 7C1 10.312 3.688 13 7 13C10.312 13 13 10.312 13 7C13 3.688 10.318 1 7 1Z\" fill=\"#90A3BF\"/>\n" +
                                    "                                            <rect x=\"2\" y=\"2\" width=\"10\" height=\"10\" rx=\"5\" fill=\"white\"/>\n" +
                                    "                                            <path d=\"M7 3C4.792 3 3 4.792 3 7C3 9.208 4.792 11 7 11C9.208 11 11 9.208 11 7C11 4.792 9.212 3 7 3Z\" fill=\"#90A3BF\"/>\n" +
                                    "                                            <rect x=\"8\" y=\"6\" width=\"4\" height=\"2\" fill=\"#90A3BF\"/>\n" +
                                    "                                            <rect x=\"2\" y=\"6\" width=\"4\" height=\"2\" fill=\"#90A3BF\"/>\n" +
                                    "                                            <rect x=\"6\" y=\"8\" width=\"2\" height=\"4\" fill=\"#90A3BF\"/>\n" +
                                    "                                            <rect x=\"4\" y=\"4\" width=\"6\" height=\"6\" rx=\"3\" fill=\"white\"/>\n" +
                                    "                                        </svg>\n" +
                                    "                                        <span class=\"rent-box-txt\">" + carElement.transmission_type + "</span>\n" +
                                    "                                    </div>\n" +
                                    "                                    <div>\n" +
                                    "                                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"14\" height=\"14\" viewBox=\"0 0 14 14\" fill=\"none\">\n" +
                                    "                                            <path d=\"M5.24996 1.16663C3.72163 1.16663 2.47913 2.40913 2.47913 3.93746C2.47913 5.43663 3.65163 6.64996 5.17996 6.70246C5.22663 6.69663 5.27329 6.69663 5.30829 6.70246C5.31996 6.70246 5.32579 6.70246 5.33746 6.70246C5.34329 6.70246 5.34329 6.70246 5.34913 6.70246C6.84246 6.64996 8.01496 5.43663 8.02079 3.93746C8.02079 2.40913 6.77829 1.16663 5.24996 1.16663Z\" fill=\"#90A3BF\"/>\n" +
                                    "                                            <path d=\"M8.21331 8.25418C6.58581 7.16918 3.93164 7.16918 2.29248 8.25418C1.55164 8.75001 1.14331 9.42085 1.14331 10.1383C1.14331 10.8558 1.55164 11.5208 2.28664 12.0108C3.10331 12.5592 4.17664 12.8333 5.24998 12.8333C6.32331 12.8333 7.39664 12.5592 8.21331 12.0108C8.94831 11.515 9.35664 10.85 9.35664 10.1267C9.35081 9.40918 8.94831 8.74418 8.21331 8.25418Z\" fill=\"#90A3BF\"/>\n" +
                                    "                                            <path d=\"M11.6608 4.28168C11.7542 5.41335 10.9492 6.40502 9.835 6.53918C9.82917 6.53918 9.82917 6.53918 9.82334 6.53918H9.80583C9.77083 6.53918 9.73583 6.53918 9.70667 6.55085C9.14083 6.58002 8.62167 6.39918 8.23083 6.06668C8.83167 5.53002 9.17584 4.72502 9.10584 3.85002C9.065 3.37752 8.90167 2.94585 8.65667 2.57835C8.87834 2.46752 9.135 2.39752 9.3975 2.37418C10.5408 2.27502 11.5617 3.12668 11.6608 4.28168Z\" fill=\"#90A3BF\"/>\n" +
                                    "                                            <path d=\"M12.8276 9.67745C12.7809 10.2433 12.4192 10.7333 11.8126 11.0658C11.2292 11.3866 10.4942 11.5383 9.76506 11.5208C10.1851 11.1416 10.4301 10.6691 10.4767 10.1674C10.5351 9.44411 10.1909 8.74995 9.50256 8.19578C9.11172 7.88661 8.65672 7.64161 8.16089 7.46078C9.45006 7.08745 11.0717 7.33828 12.0692 8.14328C12.6059 8.57495 12.8801 9.11745 12.8276 9.67745Z\" fill=\"#90A3BF\"/>\n" +
                                    "                                        </svg>\n" +
                                    "                                        <span class=\"rent-box-txt\">" + carElement.no_of_passengers + " People</span>\n" +
                                    "                                    </div>\n" +
                                    "                                </div>\n" +
                                    "                                <div class=\"w-100 d-flex flex-wrap justify-content-between p-2 flex-row align-items-center\">\n" +
                                    "                                    <span class=\"rent-box-txt-bold\">LKR " + carElement.cp_id.daily_rate + "/<span class=\"rent-box-txt\"> day</span></span>\n" +

                                        "                                    <button   id='btn" + carElement.carCode + "' onclick='rentNowACarForSendDataRentPage($(\"#" + carElement.carCode + "\").text())'  type='submit' class=\"rent-home-btn p-1 border-0 dd r-btn\">\n" +
                                        "                                        Rental Now\n" +
                                        "                                    </button>    \n" +
                                    "                                     </form>\n" +


                                    "                                </div>\n" +
                                    "                            </div>");

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


            },
            error: function (e) {
                console.log("ERROR: ", e);
            },
            done: function (e) {
                console.log("DONE");
            }
        });
    }
});

$(".dd").click(function () {
    console.log("sdsdsddsdsdsd");
    alert("sdsdsd")
})

$("#home-search-bar-btn").click(function () {
    $(".search-txt-filed").focus();
})

/*
function rentNowACarForSendDataRentPage(carCodeTextValue) {
   // alert(carCodeTextValue);
    //$("#rentPage-renting-car-name").text(carCodeTextValue)
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/CarRental_war/car/goToRent",
        success: function (result) {

            console.log("ok")
           // window.history.replaceState(undefined,"ok", "http://localhost:8080/CarRental_war/rent.html");
           /!* console.log(result)
            $.ajax({
                type: "GET",
                url: "http://localhost:8080/CarRental_war/rent.html",
                success: function (result) {
                    window.history.pushState("object or string", "Title", "/rent.html");

                },
                error: function (e) {
                    console.log("ERROR: ", e);
                },
                done: function (e) {
                    console.log("DONE");
                }
            });*!/
        },
        error: function (e) {
            console.log("ERROR: ", e);
        },
        done: function (e) {
            console.log("DONE");
        }
    });
}*/
