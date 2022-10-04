function myFunction(){
    var x = document.getElementById("board-add");
    if (x.style.display === "none"){
        x.style.display = "block";
    }else{
        x.style.display = "none";
    }
}

function dlrow(){
    var x = document.getElementById("board-dlt");
    if (x.style.display === "none"){
        x.style.display = "block";
    }else{
        x.style.display = "none";
    }
}
function cancel(){
    var x = document.getElementById("board-add");
    if (x.style.display === "block"){
        x.style.display = "none";
    }else{
        x.style.display = "block";
    }
}