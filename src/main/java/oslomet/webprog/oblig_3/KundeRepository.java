package oslomet.webprog.oblig_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KundeRepository {

    @Autowired
    private JdbcTemplate db;

    public void lagreKunde(Kunde kunde) {
        String sql = "INSERT INTO kunde(filmValg, antall, fornavn, etternavn, telefonnr, epost) VALUES (?, ?, ?, ?, ?, ?)";
        db.update(sql, kunde.getFilmValg(), kunde.getAntall(), kunde.getFornavn(), kunde.getEtternavn(), kunde.getTelefonnr(), kunde.getEpost());
    }

    public List<Kunde> hentAlleKunder() {
        String sql = "SELECT * FROM kunde";
        List<Kunde> alleKunder = db.query(sql, new BeanPropertyRowMapper<>(Kunde.class));
        return alleKunder;
    }

    public void slettAlleKunder() {
        String sql = "DELETE FROM kunde";
        db.update(sql);
    }

    public Kunde hentEnKunde(int id) {
        Object[] param = new Object[1];
        param[0] = id;
        String sql = "SELECT * FROM Kunde WHERE id=?";
        Kunde enKunde = db.queryForObject(sql, param, BeanPropertyRowMapper.newInstance(Kunde.class));
        return enKunde;
    }

    public void endreEnKunde(Kunde kunde){
        String sql = "UPDATE Kunde SET filmValg=?,antall=?,fornavn=?,etternavn=?,telefonnr=?,epost=? where id=?";
        db.update(sql,kunde.getFilmValg(),kunde.getAntall(),kunde.getFornavn(),kunde.getEtternavn(),kunde.getTelefonnr(),kunde.getEpost(),kunde.getId());
    }

    public void slettEn(int id){
        String sql = "DELETE FROM Kunde WHERE id=?;";
        db.update(sql, id);
    }
}
