package android.example.com;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsItemToViewAdapter extends ArrayAdapter<Article> {

    //Constructor
    public NewsItemToViewAdapter(Activity context, ArrayList<Article> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View listitems = view;
        if(null == listitems){
            listitems = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Article currentArticle = getItem(position);
        TextView section = (TextView) listitems.findViewById(R.id.section);
        String sectionArticle = currentArticle.getSection();
        section.setText(sectionArticle);
        return listitems;
    }
}