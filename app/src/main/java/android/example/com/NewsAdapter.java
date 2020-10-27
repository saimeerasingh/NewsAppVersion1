package android.example.com;

import android.app.Activity;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<Article> {

    //Constructor
    public NewsAdapter(Activity context, ArrayList<Article> news) {
        super(context, 0, news);
    }

}