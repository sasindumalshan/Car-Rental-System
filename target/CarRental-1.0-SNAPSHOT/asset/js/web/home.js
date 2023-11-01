let home_first_name;
let home_last_name;
let home_mail;
let home_contact;
let home_address_street;
let home_address_lane;
let home_address_city;
let user;
let d_L;
let nic;
let formData = new FormData();


const file_d_f = document.querySelector("#file-d-f")
file_d_f.addEventListener("change", function (event) {
    // URL.createObjectURL(event.target.files[0]);

    console.log($("#file-d-f").filename);
    const reader = new FileReader()
    reader.addEventListener("load", () => {
        document.querySelector("#d-l-f").src = reader.result
    })
    reader.readAsDataURL(this.files[0]);
    // alert(this.file[0])


    // formData.append('d_f_image',this.files[0]);
})

const file_d_b = document.querySelector("#file-d-b")
file_d_b.addEventListener("change", function () {

    const reader = new FileReader()
    reader.addEventListener("load", () => {
        document.querySelector("#d-l-b").src = reader.result
        // console.log(reader.readAsDataURL(reader.result));
    })
    reader.readAsDataURL(this.files[0]);

    // formData.append('d_b_image',this.files[0]);
    //let url = new URL($("##d-l-b").attr("src"));

})

const file_nic_b = document.querySelector("#file-nic-b")
file_nic_b.addEventListener("change", function () {
    const reader = new FileReader()
    reader.addEventListener("load", () => {
        document.querySelector("#nic-b").src = reader.result
    })
    reader.readAsDataURL(this.files[0]);

    //formData.append('c_nic_b_image',this.files[0]);
});

const file_nic_f = document.querySelector("#file-nic-f")
file_nic_f.addEventListener("change", function () {
    const reader = new FileReader()
    reader.addEventListener("load", () => {
        document.querySelector("#nic-f").src = reader.result
    })
    reader.readAsDataURL(this.files[0]);
    // formData.append('c_nic_f_image',this.files[0]);
});


$("#sign-up").click(function () {
    nic = $("#d-l").val();
    formData.append("c_nic", nic);
    formData.append("c_nic_f_image", $('#file-nic-f')[0].files[0]);
    formData.append("c_nic_b_image", $('#file-nic-b')[0].files[0]);
    formData.append("mail", home_mail);
    formData.append("city", home_address_city);
    formData.append("lane", home_address_lane);
    formData.append("street", home_address_street);
    formData.append("d_license", d_L);
    formData.append("d_b_image", $('#file-d-b')[0].files[0]);
    formData.append("d_f_image", $('#file-d-f')[0].files[0]);
    formData.append("role", user);
    formData.append("fistName", home_first_name);
    formData.append("lastName", home_last_name);

    let fd = new FormData($('#sing-up-form-data')[0]);

    $.ajax({
        url: "http://localhost:8080/CarRental_war/user",
        method: "post",
        sync: true,
        data: fd,
        processData: false,
        contentType: false,
        success: function (result) {
            console.log("SUCCESS: ");
            alert("ok  ok ");
            $("#setting-btn").css({'display': 'block', 'visibility': 'visible'});
            $("#user-nic-header").text(result.data);

            $('#signUpUserDetailsFrom').css({'display': 'none', 'visibility': 'hidden'});
            $('#signUpUserDrivingLicenseDetailsFrom').css({'display': 'none', 'visibility': 'hidden'});
            $('#signUpUserNICDetailsFrom').css({'display': 'none', 'visibility': 'hidden'});
            $('#sing-up-form').css({'display': 'none', 'visibility': 'hidden'});
            $('#sign-in-form').css({'display': 'none', 'visibility': 'hidden'});


        },
        error: function (e) {
            console.log("ERROR: ", e);
        },
        done: function (e) {
            console.log("DONE");
        }
    });


});

$("#next-one").click(function () {
    home_first_name = $("#home-first-name").val();
    home_last_name = $("#home-last-name").val();
    home_mail = $("#home-mail").val();
    home_contact = $("#home-contact").val();
    home_address_street = $("#home-address-street").val();
    home_address_lane = $("#home-address-lane").val();
    home_address_city = $("#home-address-city").val();
    let Driver = $('input[name="user1"]:checked').val();
    let customer = $('input[name="user"]:checked').val();
    if (Driver) {
        user = "DRIVER";

    } else if (customer) {
        user = "USER";
    }


});

$("#next-two").click(function () {
    d_L = $("#nic-txt").val();

})


//=======================================
/*

function addCustomer(){

    let name = $('#inputName').val();
    let address = $('#inputAddress').val();
    let email = $('#inputEmail').val();
    let nic = $('#inputNic').val();
    let nicFornt = $('#inputNicFront').val();
    let nicBack = $('#inputNicBack').val();
    let username = $('#inputUsername').val();
    let password = $('#inputPassword').val();


    let customer = {
        customerID:username,
        name:name,
        address:address,
        email:email,
        nicNo:nic,
        frontImage:nicFornt,
        backImage:nicBack,
        username:username,
        user:{
            username:username,
            password:password,
            role:"CUSTOMER"
        }
    }

    $.ajax({
        url : mainLink + 'customer',
        method : "post",
        data : JSON.stringify(customer),
        contentType : 'application/json',
        success:function(){
            console.log("Success")
            saveCustomerImages();
        },
        error : function(){
            console.log("Error")
        }
    });





}


function saveCustomerImages(){
    let formData = new FormData($('#imagesCus')[0]);

    $.ajax({
        url : mainLink + 'customer?customerId=' + "C001",
        method : "post",
        sync:true,
        data : formData,
        processData: false,
        contentType: false,
        success:function(){
            console.log("Image Added Success")
        },
        error : function(){
            console.log("Error")
        }
    });
}*/


// Login function
$("#sign-in-btn").click(function () {
    let formData1 = new FormData($("#sign-in-from")[0]);
    $.ajax({
        url: "http://localhost:8080/CarRental_war/user/checkUser",
        method: "post",
        sync: true,
        data: formData1,
        processData: false,
        contentType: false,
        success: function (result) {
            console.log("SUCCESS: ");
            // alert("ok  ok ");

            $("#user-nic-header").text(result.data);
            $("#setting-btn").css({'display': 'block', 'visibility': 'visible'});

            $('#signUpUserDetailsFrom').css({'display': 'none', 'visibility': 'hidden'});
            $('#signUpUserDrivingLicenseDetailsFrom').css({'display': 'none', 'visibility': 'hidden'});
            $('#signUpUserNICDetailsFrom').css({'display': 'none', 'visibility': 'hidden'});
            $('#sing-up-form').css({'display': 'none', 'visibility': 'hidden'});
            $('#sign-in-form').css({'display': 'none', 'visibility': 'hidden'});


        },
        error: function (e) {
            console.log("ERROR: ", e);
        },
        done: function (e) {
            console.log("DONE");
        }
    });
});

// click home setting btn with fetch data from user function
$("#setting-btn").click(function () {
   /* $("#theme-btn").css({'display': 'block', 'visibility': 'visible'});
    $("#driving-licence-btn").css({'display': 'block', 'visibility': 'visible'});
    $("#nic-btn").css({'display': 'block', 'visibility': 'visible'});
    $("#privacy-btn").css({'display': 'block', 'visibility': 'visible'});

    $("#privacy-label").css({'display': 'block', 'visibility': 'visible'});
    $("#nic-label").css({'display': 'none', 'visibility': 'hidden'});
    $("#driving-licence-label").css({'display': 'none', 'visibility': 'hidden'});
    $("#theme-label").css({'display': 'none', 'visibility': 'hidden'});*/
    $("#setting-btn").css({'display': 'block', 'visibility': 'visible'});
    $.ajax({
        url: "http://localhost:8080/CarRental_war/user/getUser",
        method: "GET",
        dataType:"json",
        data: {"nic":$("#user-nic-header").text()},
        contentType: "application/json",
        success: function (result) {
            if (result.data!=null){
                $("#nic-setting").text(result.data.c_nic);
                $("#setting-home-first-name").val(result.data.fistName);
                $("#setting-home-last-name").val(result.data.lastName);
                $("#setting-home-mail").val(result.data.mail);
                $("#setting-home-contact").val(result.data.contact);
                $("#setting-home-address-street").val(result.data.street);
                $("#setting-home-address-lane").val(result.data.lane);
                $("#setting-home-address-city").val(result.data.city);

                $("#setting-nic-txt").val(result.data.c_nic);
                $("#setting-nic-f").attr("src", "data:image/png;base64," + result.data.c_nic_f_image + " ");
                $("#setting-nic-b").attr("src", "data:image/png;base64," + result.data.c_nic_b_image + " ");

                $("#setting-d-l").val(result.data.d_license);
                $("#setting-d-l-f").attr("src", "data:image/png;base64," + result.data.d_f_image + " ");
                $("#setting-d-l-b").attr("src", "data:image/png;base64," + result.data.d_b_image + " ");

                $("#setting-form").css({'display': 'block', 'visibility': 'visible'});
                $("#privacy-label").css({'display': 'block', 'visibility': 'visible'});
                $("#nic-label").css({'display': 'none', 'visibility': 'hidden'});
                $("#driving-licence-label").css({'display': 'none', 'visibility': 'hidden'});
                $("#theme-label").css({'display': 'none', 'visibility': 'hidden'});
            }else {
              /*  $("#driving-licence-btn").css({'display': 'none', 'visibility': 'hidden'});
                $("#nic-btn").css({'display': 'none', 'visibility': 'hidden'});
                $("#privacy-btn").css({'display': 'none', 'visibility': 'hidden'});

                $("#theme-label").css({'display': 'block', 'visibility': 'visible'});
                $("#privacy-label").css({'display': 'none', 'visibility': 'hidden'});
                $("#nic-label").css({'display': 'none', 'visibility': 'hidden'});*/
                $("#setting-btn").css({'display': 'none', 'visibility': 'hidden'});
            }



        },
        error: function (e) {
            console.log("ERROR: ", e);

        },
        done: function (e) {
            console.log("DONE");
        }
    })
});

// Update user profile data
$("#update-profile").click(function () {
    let update_profile = new FormData($("#setting-UserDetails-from-data")[0]);
    update_profile.append("c_nic",$("#nic-setting").text())
    $.ajax({
        url: "http://localhost:8080/CarRental_war/user/updateUser",
        method: "post",
        sync: true,
        data: update_profile,
        processData: false,
        contentType: false,
        success: function (result) {
            alert("profile updated ");
        },
        error: function (e) {
            console.log("ERROR: ", e);
        },
        done: function (e) {
            console.log("DONE");
        }
    })
});

// Update user diving licence data
$("#update-d-license").click(function () {
    let update_license = new FormData($("#setting-driving-licence-from-data")[0]);
    update_license.append("c_nic",$("#nic-setting").text())
    $.ajax({
        url: "http://localhost:8080/CarRental_war/user/upateUser",
        method: "post",
        sync: true,
        data: update_license,
        processData: false,
        contentType: false,
        success: function (result) {
            alert("diving licence updated ");
        },
        error: function (e) {
            console.log("ERROR: ", e);
        },
        done: function (e) {
            console.log("DONE");
        }
    })
});

// Update user nic data
$("#update-nic").click(function () {
    let update_nic = new FormData($("#setting-nic-label-from-data")[0]);
    // update_nic.append("c_nic",$("#nic-setting").text())

    $.ajax({
        url: "http://localhost:8080/CarRental_war/user/upateUser",
        method: "post",
        sync: true,
        data: update_nic,
        processData: false,
        contentType: false,
        success: function (result) {
            alert("nic updated ");

        },
        error: function (e) {
            console.log("ERROR: ", e);
        },
        done: function (e) {
            console.log("DONE");
        }
    })
});
