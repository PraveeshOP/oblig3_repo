package oslomet.webprog.oblig_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class KundeController {

    @Autowired
    KundeRepository rep;

    @PostMapping("/lagre")
    public void lagreKunde(Kunde innKunde) {
        rep.lagreKunde(innKunde);
    }

    @GetMapping("/hentAlle")
    public List<Kunde> hentAlle() {
        return rep.hentAlleKunder();
    }

    @GetMapping("/slettAlle")
    public void slettAlleKunde() {
        rep.slettAlleKunder();
    }

    @GetMapping("/hentEnKunde")
    public Kunde hentEnKunde(int id){
        return rep.hentEnKunde(id);
    }

    @PostMapping("/endreEnKunde")
    public void endreEnKunde(Kunde kunde){
        rep.endreEnKunde(kunde);
    }

    @GetMapping("/slettEn")
    public void slettEn(int id){
        rep.slettEn(id);
    }

}
