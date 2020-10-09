package com.example.ass1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ass1.model.IMoveDa;
import com.example.ass1.model.Movies;
import com.example.ass1.model.MoviesFactory;

import java.util.List;

public class MainActivity extends AppCompatActivity {
private Spinner spinner,spinner0,spinner1;
    ImageButton androidImageButton;
    EditText editText;
    EditText editText1;
   EditText editText2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidImageButton = (ImageButton) findViewById(R.id.image_button_android);
editText=findViewById(R.id.edittext) ;
        editText1=findViewById(R.id.edittext) ;
      editText2=findViewById(R.id.edittext) ;



        androidImageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "It works", Toast.LENGTH_LONG).show();
            }
        });

        spinner=findViewById(R.id.spinner0);
        spinner0=findViewById(R.id.spinner1);
        spinner1=findViewById(R.id.spinner2);

        Populatespinner();
        Populatespinner0();
        Populatespinner1();



    }

    private void Populatespinner1() {
        MoviesFactory factory=new MoviesFactory();
        IMoveDa objMovi = factory.getModel();

        String []title=objMovi.Gettitles();
        ArrayAdapter<String> adapter1=new ArrayAdapter(this,android.R.layout.simple_spinner_item,title);
        spinner1.setAdapter(adapter1);
    }

    private void Populatespinner0() {
        MoviesFactory factory=new MoviesFactory();
        IMoveDa objMovi = factory.getModel();

        String [] year=objMovi.Getyear();
        ArrayAdapter<String> adapter1=new ArrayAdapter(this,android.R.layout.simple_spinner_item,year);
        spinner0.setAdapter(adapter1);
    }

    private void Populatespinner() {
        MoviesFactory factory=new MoviesFactory();
        IMoveDa objMovi = factory.getModel();

        String []cats=objMovi.Getcategories();
        ArrayAdapter<String> adapter1=new ArrayAdapter(this,android.R.layout.simple_spinner_item,cats);
        spinner.setAdapter(adapter1);



    }


    public void btnGetMoviesOnClick(View view) {
        MoviesFactory factory= new MoviesFactory();
        IMoveDa objMovies= factory.getModel();
      //  String item1="";
      //  String item2="";
        String item="";

         item =spinner.getSelectedItem().toString();
        List<Movies> Movie=objMovies.getMoviescat(item);

       // item1 =spinner0.getSelectedItem().toString();
     //   List<Movies> Movie1=objMovies.getMoviesyear(item1);

     //   item2 =spinner1.getSelectedItem().toString();
     //   List<Movies> Movie2=objMovies.getMoviesname(item2);

        for (Movies a:Movie){
            item+=a.getName()+" - "+a.getYear()+" - "+a.getCategory()+"\n";
       //     item1+=a.getName()+a.getYear()+a.getCategory()+"\n";
       //     item2+=a.getName()+a.getYear()+a.getCategory()+"\n";
            editText.setText(item);
       //     textview.setText(item1);
       //     textview.setText(item2);


        }

    // Toast.makeText(this,item,Toast.LENGTH_SHORT).show();

    }


    public void btnGetMoviesOnClickyear(View view) {
        MoviesFactory factory= new MoviesFactory();
        IMoveDa objMovies= factory.getModel();

        String item="";

        item =spinner0.getSelectedItem().toString();
        List<Movies> Movie=objMovies.getMoviesyear(item);


        for (Movies a:Movie){
            item+=a.getName()+" - "+a.getYear()+" - "+a.getCategory()+"\n";

            editText1.setText(item);



        }

        // Toast.makeText(this,item,Toast.LENGTH_SHORT).show();

    }

    public void btnGetMoviesOnClickname(View view) {
        MoviesFactory factory= new MoviesFactory();
        IMoveDa objMovies= factory.getModel();

        String item="";

        item =spinner1.getSelectedItem().toString();
        List<Movies> Movie=objMovies.getMoviesname(item);



        for (Movies a:Movie){
            item+=a.getName()+" - "+a.getYear()+" - "+a.getCategory()+"\n";

            editText2.setText(item);


        }

        // Toast.makeText(this,item,Toast.LENGTH_SHORT).show();

    }
}
