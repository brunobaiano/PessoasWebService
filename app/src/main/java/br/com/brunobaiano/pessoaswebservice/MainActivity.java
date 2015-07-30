package br.com.brunobaiano.pessoaswebservice;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.rest.RestService;

import java.util.ArrayList;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

   @ViewById
    ListView listView;

    @RestService
    EventClient eventClient;

    @AfterViews
    public void popularLista()
    {
        ArrayList<Pessoa> pessoas = eventClient.consultarPessoas();


        listView.setAdapter(new ArrayAdapter<Pessoa>(this, R.layout.simple_list_item_1, pessoas));
    }

}
