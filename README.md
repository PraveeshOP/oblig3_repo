Short discription about my program.

It is the program that helps customers order the tickets. I created six files "index.html", "index.js", "registrere.html",
"registrere.js", "endreKunde.html" and "endreKunde.js" for the html and javascrit files. When the clients fill in their 
information and leave some fields blank, the program does not run. The program also stops running if the clients enter 
the wrong phone number and email address. I used regexp to validate phone number and email address.

When all information is correct and the "Kjøp Billet" button is clicked, the program runs function with "show" id which put 
all client information in "kunde" object and pushes the object to the KundeController. Then with the help of KundeRepository
the Database table is created. After the object is pushed it is stored in the Repository and can be retrived when required.

When the client clicks the "Slett Alle Billettene" button, the endpoint "/slettAlle" is executed which removess all the
objects in the List<Kunde> i.e. removes all the tickets.

I also designed the client site with the help of bootstrap using different div's. It is also known as the resposive design 
because it works with all the different kind of devicies such as Mobile, Tablet, Laptop and Computer.

I also created the buttons to edit and delete the single ticket. While editing and deleting the single ticket it also edits 
and delets the ticket in the database.

The link to my youtube video is: https://youtu.be/zyqAp_-8cHY
