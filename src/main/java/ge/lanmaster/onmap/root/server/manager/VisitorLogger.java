package ge.lanmaster.onmap.root.server.manager;

import ge.lanmaster.onmap.root.client.entity.Visit;
import ge.lanmaster.onmap.root.server.DAO;

public class VisitorLogger {
    public VisitorLogger() {
    }

    public void log(Visit visit) {
        DAO<Visit> dao = new DAO<Visit>(Visit.class);
        dao.put(visit);
    }

}
