$(document).ready(function () {
    hentAlle();
});

function hentAlle() {
    $.get( "/hentAlle", function(kunder) {
        formaterData(kunder);
    });
}

function formaterData(kunder){
    let ut = "<table class='table table-striped'><tr><th>Film</th><th>Antall</th><th>Fornavn</th>" +
        "<th>Etternavn</th><th>Telefonnr</th><th>Epost</th><th></th><th></th></tr>";
    for(const kunde of kunder){
        ut += "<tr><td>"+kunde.filmValg+"</td><td>"+kunde.antall+"</td><td>"+kunde.fornavn+"</td><td>"+kunde.etternavn
            +"</td><td>"+kunde.telefonnr+"</td><td>"+kunde.epost+ "</td>" +
            "<td><button class='btn btn-primary' onclick='idTilEndring("+kunde.id+")'>Endre</button></td>"+
            "<td><button class='btn btn-danger' onclick='slettEn("+kunde.id+")'>Slett</button></td>"+"</tr>";
    }
    ut += "</table>";
    $("#billettene").html(ut);
}

function idTilEndring(id){
    window.location.href = "/endreKunde.html?"+id;
}

function slettEn(id){
    let url = "/slettEn?id="+id;
    $.get(url, function(){
        window.location.href = "/";
    });
}

$("#slettBillettene").click(function(){
    $.get("/slettAlle",function(){
        hentAlle();
    });
});