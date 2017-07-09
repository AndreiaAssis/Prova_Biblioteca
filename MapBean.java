
import org.jboss.weld.bean.proxy.Marker;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;

public class MapBean {
    private MapModel model = new DefaultMapModel();
public MapBean(MapModel MapModel) {
        MapModel = model.addOverlay(new Marker(new LatLng(36.879466, 30.667648), "M1"));
}
public MapModel getModel() { return this.model; }
}
