$(document).ready(function () {
    hentAlleKunder();
    hentEnKunde();
});

function hentAlleKunder() {
    $.get("/hentAlle",function(kunder){
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

function hentEnKunde(){
    const id = window.location.search.substring(1);
    const url = "/hentEnKunde?id=" + id;

    $.get(url, function(enKunde){
        $("#id").val(enKunde.id);
        $("#filmValg").val(enKunde.filmValg);
        $("#antall").val(enKunde.antall);
        $("#fornavn").val(enKunde.fornavn);
        $("#etternavn").val(enKunde.etternavn);
        $("#telefonnr").val(enKunde.telefonnr);
        $("#epost").val(enKunde.epost);
    })
}

function endreKunden(){
    const kunde = {
        id : $("#id").val(),
        filmValg : $("#filmValg").val(),
        antall: $("#antall").val(),
        fornavn: $("#fornavn").val(),
        etternavn: $("#etternavn").val(),
        telefonnr: $("#telefonnr").val(),
        epost: $("#epost").val()
    };
    $.post("/endreEnKunde",kunde,function(){
    });

    window.location.href="index.html";
}
