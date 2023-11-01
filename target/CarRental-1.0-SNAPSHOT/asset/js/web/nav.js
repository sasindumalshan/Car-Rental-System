function rentNowACarForSendDataRentPage(carCodeTextValue) {
    //$("#rentPage-renting-car-name").text(carCodeTextValue)
   /* $.ajax({
        type: "GET",
        url: "http://localhost:8080/CarRental_war/car/goToRent",
        success: function (result) {




            let cookieEnabled = navigator.cookieEnabled;

            /!*$(document).ready(carCodeTextValue,function () {
                $("#rentPage-renting-car-name").text(carCodeTextValue)
                alert(carCodeTextValue)

            });*!/
             var dataFromHome = {
                 "role": "User",
                 "carCode": carCodeTextValue
             }
            // let forward = window.forward();
            // console.log(forward);
            // window.history.replaceState(dataFromHome,"ok", "http://localhost:8080/CarRental_war/rmmment.html"+"carCode="+carCodeTextValue);
             //window.history.forward();
            // $("#rentPage-renting-car-name").text(carCodeTextValue)
            //console.log(cookieEnabled);
          // location.reload();


        },
        error: function (e) {
            console.log("ERROR: ", e);
        },
        done: function (e) {
            console.log("DONE");
        }
    });*/

    localStorage.setItem("carCode",carCodeTextValue);

}