const user = {};

function getUser(){
    user.login = document.getElementById("ulogin").value;
    user.password = document.getElementById("usenha").value;

    console.log(user);
}