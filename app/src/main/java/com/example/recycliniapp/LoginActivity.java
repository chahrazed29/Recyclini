package com.example.recycliniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {
    EditText EditTextEmail;
    EditText EditTextPassword;

    Button ButtonLogin;
    InputValidation inputValidation;
    TextView textViewLinkRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


/*

        inputValidation=new InputValidation(this);

        ButtonLogin = (Button) findViewById(R.id.button);
        textViewLinkRegister = (TextView) findViewById(R.id.textInscrire2);

        textViewLinkRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this,IndEntActivity.class);
                startActivity(registerIntent);
                finish();
            }
        });
        EditTextEmail = (EditText) findViewById(R.id.editTextEmail);
        EditTextPassword = (EditText) findViewById(R.id.editTextMdp);

        ButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verification()){
                    String email = EditTextEmail.getText().toString().trim();
                    String password = EditTextPassword.getText().toString().trim();

                    String url="http://"+adresse_ip+"/RecycliniServer/login.php?email="+ email+"&password="+ password ;

                    // start background task
                    new MyAsyncTaskgetNews().execute(url);


                }else{
                    Toast.makeText(LoginActivity.this,"Vérifiez votre Informations",Toast.LENGTH_SHORT).show();
                }
            }
        });

*/


    }
/*
    public boolean verification(){
        if ((!inputValidation.isInputEditTextFilled(EditTextEmail))||(!inputValidation.isInputEditTextEmail(EditTextEmail))||(!inputValidation.isInputEditTextFilled(EditTextPassword))) {
            return false;
        }

        return true ;

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

                String email = EditTextEmail.getText().toString().trim();
                SaveSettings saveSettings= new SaveSettings(getApplicationContext());
                saveSettings.SaveData(email);


                if( json.getString("msg").equalsIgnoreCase("individu")){


                    Intent intent=new Intent(LoginActivity.this,PrincipaleActivity.class);
                    intent.putExtra("EXTRA_SESSION_EMAIL", email);
                    startActivity(intent);
                    finish();
                }else{
                    if( json.getString("msg").equalsIgnoreCase("entreprise")) {


                        Intent intent2 = new Intent(LoginActivity.this, PrincipaleActivity.class);
                        intent2.putExtra("EXTRA_SESSION_EMAIL", email);
                        startActivity(intent2);
                        finish();

                    }else{

                        Toast.makeText(LoginActivity.this,"Vérifiez votre Informations",Toast.LENGTH_SHORT).show();}
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
*/

}