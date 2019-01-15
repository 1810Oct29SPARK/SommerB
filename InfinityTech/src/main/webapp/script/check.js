 /**
 * 
 */
let employee = {};
function createNode(element) {
    return document.createElement(element);
}
function append(parent, el) {
  return parent.appendChild(el);
}
window.onload = function(){
    populateUser();
}
function populateUser(){
    // send a GET request to localhost:7001/InfinityTech/session
    fetch("http://localhost:7001/InfinityTech/session")
    .then(function(response){
        return response.json();
    }).then(function(data){
        console.log(data);
        // check whether there is a valid user returned
        // define behavior for no user returned
        if (data.session === null){
            window.location = "http://localhost:7001/InfinityTech/login";
        } else {
            // define behavior for user returned
            employee = data;
            document.getElementById("id").innerText = "Employee ID: " + employee.id;
            document.getElementById("firstname").innerText = "First Name: " + employee.firstname;
            document.getElementById("lastname").innerText = "Last Name: " + employee.lastname;
            document.getElementById("email").innerText = "Email: " + employee.email;
        }
    });
    
}