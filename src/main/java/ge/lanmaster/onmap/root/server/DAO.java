package ge.lanmaster.onmap.root.server;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.util.DAOBase;
import ge.lanmaster.onmap.root.client.entity.Car;
import ge.lanmaster.onmap.root.client.entity.Visit;

/**
 * Created by IntelliJ IDEA.
 * User: alexander
 * Date: 1/29/12
 * Time: 6:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class DAO<T> extends DAOBase {

    private Class<T> clazz;

    static {
        ObjectifyService.register(Visit.class);
        ObjectifyService.register(Car.class);
    }

    public DAO(Class<T> clazz) {
        this.clazz = clazz;
    }


    public T getOrCreate(Long id) {
        Objectify ofy = ObjectifyService.begin();
        T found = ofy.find(clazz, id);

        if (found == null) {
            try {
                found = clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return found;
    }

    public T getOrCreate(String id) {
        Objectify ofy = ObjectifyService.begin();
        T found = ofy.find(clazz, id);

        if (found == null) {
            try {
                found = clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return found;
    }

    public Key<T> put(T thing) {
        Objectify ofy = ObjectifyService.begin();
        Key<T> key = ofy.put(thing);
        return key;
    }

}
