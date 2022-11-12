package com.app.farhangeaasfiya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import databases.Dictionary;
import databases.DictionaryDatabase;

public class AddWordActivity extends AppCompatActivity {
    String etAddWord, etAddMeaning, etAddPronounciationEng, etAddOrigin, etAddType, etAddWazn, etAddMeaningEng, etAddMuhavra, etAddPlural, etAddSynonym, etAddAntonym, etAddComposite, etAddRhymings, etAddPronounciationUrd;
    Button btnSubmitWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);


        etAddWord = ((EditText)findViewById(R.id.etAddWord)).getText().toString();
        etAddPronounciationUrd = ((EditText)findViewById(R.id.etAddPronounciationUrd)).getText().toString();
        etAddMeaning = ((EditText)findViewById(R.id.etAddMeaning)).getText().toString();
        etAddOrigin = ((EditText)findViewById(R.id.etAddOrigin)).getText().toString();
        etAddType = ((EditText)findViewById(R.id.etAddType)).getText().toString();
        etAddWazn = ((EditText)findViewById(R.id.etAddWazn)).getText().toString();
        etAddPronounciationEng = ((EditText)findViewById(R.id.etAddPronounciationEng)).getText().toString();
        etAddMeaningEng = ((EditText)findViewById(R.id.etAddEnglishMeaning)).getText().toString();
        etAddMuhavra = ((EditText)findViewById(R.id.etAddMuhavra)).getText().toString();
        etAddPlural = ((EditText)findViewById(R.id.etAddPlural)).getText().toString();
        etAddSynonym = ((EditText)findViewById(R.id.etAddSynonym)).getText().toString();
        etAddAntonym = ((EditText)findViewById(R.id.etAddAntonym)).getText().toString();
        etAddComposite = ((EditText)findViewById(R.id.etAddComposite)).getText().toString();
        etAddRhymings = ((EditText)findViewById(R.id.etAddRhyming)).getText().toString();

        btnSubmitWord = findViewById(R.id.btnSubmitWord);
        btnSubmitWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new BgThreadForAddWord().start();
            }
        });




    }


    //BackGround thread for adding new words in dictionary
    class BgThreadForAddWord extends Thread {

        public void run(){

            super.run();

            DictionaryDatabase appDb = DictionaryDatabase.getInstance(getApplicationContext());
            Dictionary dictionary = new Dictionary(etAddWord, etAddPronounciationUrd,
                    etAddMeaning, etAddOrigin, etAddType, etAddWazn, etAddPronounciationEng,
                    etAddMeaningEng, etAddMuhavra, etAddPlural, etAddSynonym, etAddAntonym,
                    etAddComposite, etAddRhymings );
            appDb.dictionaryDao().insertDictionary(dictionary);

            // feedback for word added
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(getApplicationContext(), etAddPronounciationEng.toUpperCase()+" added to dictionary", Toast.LENGTH_SHORT).show();

                }
            });




             //clear current texts on screen
             ((EditText)findViewById(R.id.etAddWord)).setText("");
             ((EditText)findViewById(R.id.etAddPronounciationUrd)).setText("");
             ((EditText)findViewById(R.id.etAddMeaning)).setText("");
             ((EditText)findViewById(R.id.etAddOrigin)).setText("");
             ((EditText)findViewById(R.id.etAddType)).setText("");
             ((EditText)findViewById(R.id.etAddWazn)).setText("");
             ((EditText)findViewById(R.id.etAddPronounciationEng)).setText("");
             ((EditText)findViewById(R.id.etAddEnglishMeaning)).setText("");
             ((EditText)findViewById(R.id.etAddMuhavra)).setText("");
             ((EditText)findViewById(R.id.etAddPlural)).setText("");
             ((EditText)findViewById(R.id.etAddSynonym)).setText("");
             ((EditText)findViewById(R.id.etAddAntonym)).setText("");
             ((EditText)findViewById(R.id.etAddComposite)).setText("");
             ((EditText)findViewById(R.id.etAddRhyming)).setText("");




        }

    }

















}