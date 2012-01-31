package ge.lanmaster.onmap.root.server;

import ge.lanmaster.onmap.root.client.entity.Visit;

/**
 * Created by IntelliJ IDEA.
 * User: alexander
 * Date: 1/25/12
 * Time: 7:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class VisitorLogger{
    public VisitorLogger() {
    }
                                         
    public void log(Visit visit) {
        DAO dao = new DAO<Visit>(Visit.class);
        dao.put(visit);
    }

}
