const submit = document.getElementById('sub');
/*
console.log(submit);
*/
submit.addEventListener('click', () => {
    const admin_username = "admin";
    const admin_password = "admin";

    let username = document.getElementById('username').value;
    let password = document.getElementById('Password').value;

    console.log ("username", username);
    console.log ("password", password);

    if(username === admin_username && password === admin_password) { /* выбираем значение и тип*/
        window.open("./index.html", "_self"); /* чтоб не открывал новое окно*/
    } else {
        alert("Incorrect username or password");
    }
});
