package ge.lanmaster.onmap.root.client.activity.north;

public interface NorthActivityFactory {
    NorthClientActivity createNorthClientActivity(String name);
    NorthGuestActivity createNorthGuestActivity(String name);
}
