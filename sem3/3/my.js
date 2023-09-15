var counter = 0;



function buttonPressed() {
    counter++;
    document.getElementById("someId").innerHTML = "Вы нажали на копку" + counter + "раз";
    document.getElementById("someId").style = "background-color: red; font-size: 50px";
    console.log("some log");
    console.warn("some warn");
    console.error("some error");
}


function mySubmit(){
    element = document.getElementById("someName");
    if (element.value == "Azat") {
        alert("name is Azat");
    }
}

document.getElementById("formId").addEventListener("submit",mySubmit);
