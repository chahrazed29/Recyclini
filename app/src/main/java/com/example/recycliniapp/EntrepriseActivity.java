package com.example.recycliniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class EntrepriseActivity extends AppCompatActivity {
    ImageView backbutton;
    EditText etUsername,etNRC,etEmail,etPassword;
    Button button;
   // InputValidation inputValidation;
    //private static final String adresse_ip=PrincipaleActivity.adresse_ip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entreprise);
     //   inputValidation=new InputValidation(this);
        backbutton=findViewById(R.id.backbtn2);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(EntrepriseActivity.this,PerEntActivity.class);
                startActivity(intent);
            }
        });


        etUsername = (EditText) findViewById(R.id.editText8);
        etNRC = (EditText) findViewById(R.id.editText10);
        etEmail = (EditText) findViewById(R.id.editText11);
        etPassword = (EditText) findViewById(R.id.editText13);

    }
/*

    public void buloginckic(View view) {

        if (verification()) {
            String username="";

            try {

                username = URLEncoder.encode(etUsername.getText().toString(), "UTF-8");


            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            // send user name and password over the http
            String url="http://"+adresse_ip+"//RecycliniServer/registerentreprise.php?username="+ username +"&numrc="+etNRC.getText().toString()+"&email="+ etEmail.getText().toString()+"&password="+ etPassword.getText().toString();

            // start background task
            new MyAsyncTaskgetNews().execute(url);
        }else{
            Toast.makeText(EntrepriseActivity.this, "Vérifiez votre Informations", Toast.LENGTH_SHORT).show();
        }


    }

    // get news from server
    public class MyAsyncTaskgetNews extends AsyncTask<String, String, String> {
        @Override
        protected void onPreExecute() {
            //before works
        }
        @Override
        protected String  doInBackground(String... params) {
            // TODO Auto-generated method stub
            try {
                String NewsData;
                //define the url we have to connect with
                URL url = new URL(params[0]);
                //make connect with url and send request
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                //waiting for 7000ms for response
                urlConnection.setConnectTimeout(7000);//set timeout to 5 seconds

                try {
                    //getting the response data
                    InputStream in = new BufferedInputStream(urlConnection.getInputStream());
                    //convert the stream to string
                    NewsData = ConvertInputToStringNoChange(in);
                    //send to display data
                    publishProgress(NewsData);
                } finally {
                    //end connection
                    urlConnection.disconnect();
                }

            }catch (Exception ex){}
            return null;
        }
        protected void onProgressUpdate(String... progress) {

            try {
                JSONObject json=new JSONObject(progress[0]);
                Toast.makeText(getApplicationContext(),json.getString("msg"),Toast.LENGTH_LONG).show();

                if (json.getString("msg").equalsIgnoreCase("Compte crée")){
                    Intent intent=new Intent(EntrepriseActivity.this,LoginActivity.class);
                    startActivity(intent);
                    finish();
                }

            } catch (Exception ex) {
            }


        }

        protected void onPostExecute(String  result2){


        }




    }

    // this method convert any stream to string
    public static String ConvertInputToStringNoChange(InputStream inputStream) {

        BufferedReader bureader=new BufferedReader( new InputStreamReader(inputStream));
        String line ;
        String linereultcal="";

        try{
            while((line=bureader.readLine())!=null) {

                linereultcal+=line;

            }
            inputStream.close();


        }catch (Exception ex){}

        return linereultcal;
    }


    public boolean verification(){
        if ((!inputValidation.isInputEditTextFilled(etUsername))||(!inputValidation.isInputEditTextFilled(etNRC))||(!inputValidation.isInputEditTextFilled(etEmail))||(!inputValidation.isInputEditTextEmail(etEmail))||(!inputValidation.isInputEditTextFilled(etPassword))) {
            return false;
        }

        return true ;

    }*/

}