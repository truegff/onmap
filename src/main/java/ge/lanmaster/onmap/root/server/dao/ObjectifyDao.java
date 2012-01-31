package ge.lanmaster.onmap.root.server.dao;

import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.util.DAOBase;
import ge.lanmaster.onmap.root.client.entity.Visit;

public class ObjectifyDao extends DAOBase
{
    static {
        ObjectifyService.register(Visit.class);
    }

//    /** Your DAO can have your own useful methods */
//    public MyThing getOrCreateMyThing(long id)
//    {
//        MyThing found = ofy().find(clazz, id);
//        if (found == null)
//            return new MyThing(id);
//        else
//            return found;
//    }
}