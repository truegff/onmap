package ge.lanmaster.onmap.root.client.activity.center;

public interface CenterActivityFactory {
    CenterGuestActivity createCenterGuestActivity(String name);
    CenterClientActivity createCenterClientActivity(String name);
}
