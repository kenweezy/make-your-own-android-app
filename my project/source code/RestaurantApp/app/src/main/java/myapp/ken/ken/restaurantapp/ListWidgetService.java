package myapp.ken.ken.restaurantapp;

import android.content.Intent;
import android.widget.RemoteViewsService;

public class ListWidgetService extends RemoteViewsService {
  @Override
  public RemoteViewsFactory onGetViewFactory(Intent intent) {
    return(new ListViewsFactory(this.getApplicationContext(),
                                 intent));
  }
}