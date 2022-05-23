/*
console.log("hey!");

const chk = document.getElementById('chk');
*/
console.log("check => ", chk);

chk.addEventListener('change', () => {
    document.body.classList.toggle('dark');
});
/* contact form */
const submit = document.getElementById('form_button');

submit.addEventListener('click', () => {
    let email = document.getElementById('email').value;
    let name = document.getElementById('name').value;
    let message = document.getElementById('message').value;

    let data = document.getAnimations('email', 'name', 'message');

    alert("Your message was successfully sent:\n" + data.name + "\n" + data.email + "\n" + data.message);

});


