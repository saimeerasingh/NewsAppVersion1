package android.example.com;

import android.app.LoaderManager;
import android.content.Loader;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<ArrayList<Article>> {

    private NewsAdapter newsAdapter;
    private TextView emptyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newsAdapter = new NewsAdapter(this, new ArrayList<Article>());
        ListView newsView = findViewById(R.id.list);
        newsView.setAdapter(newsAdapter);
        emptyView = (TextView) findViewById(R.id.empty_view);
        newsView.setEmptyView(emptyView);
    }

    @Override
    public Loader<ArrayList<Article>> onCreateLoader(int i, Bundle bundle) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<ArrayList<Article>> loader, ArrayList<Article> articles) {

    }

    @Override
    public void onLoaderReset(Loader<ArrayList<Article>> loader) {

    }
}