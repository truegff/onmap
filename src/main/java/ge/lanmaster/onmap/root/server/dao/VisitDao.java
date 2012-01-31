package ge.lanmaster.onmap.root.server.dao;

import com.googlecode.objectify.ObjectifyService;
import ge.lanmaster.onmap.root.client.entity.Visit;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: alexander
 * Date: 1/25/12
 * Time: 7:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class VisitDao {//} extends ObjectifyDao<Visit>{

        private static final Logger LOG = Logger.getLogger(Visit.class.getName());

        static
        {
            ObjectifyService.register(Visit.class);
        }

        public VisitDao()
        {
            //super(Visit.class);
        }
}
