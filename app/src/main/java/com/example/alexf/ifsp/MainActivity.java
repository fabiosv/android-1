package com.example.alexf.ifsp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private static final String[] DISCIPLINAS = new String[]{" * SELECIONE A DISCIPLINA* ","SISTEMAS OPERACIONAIS - SOPI2", "INGLÊS TÉCNICO AVANÇADO - IGTI2","LINGUAGEM DE PROGRAMAÇÃO II - LP2I2",
            "MATEMÁTICA FINANCEIRA - MFII3","BANCO DE DADOS II - BD2I3","LINGUAGEM DE PROGRAMAÇÃO III - LP3I3","ESTRUTURA DE DADOS I - ED1I3",
            "ANÁLISE ORIENTADA A OBJETOS - AOOI3","INTERAÇÃO HUMANO-COMPUTADOR - IHCI3", "ESTATÍSTICA - ESTI4","REDES DE COMPUTADORES - RCOI4",
            "PROGRAMAÇÃO ORIENTADA A OBJETOS - POOI4","ESTRUTURA DE DADOS II - ED2I4","ARQUITETURA DE SOFTWARE - ASWI4",
            "SERVICOS DE REDE - SSRI5","PROJETO DE SISTEMAS I - PS1I5","QUALIDADE DE SOFTWARE - QSWI5","GESTÃO DE PROJETOS - GPRI5","SEGURANÇA DA INFORMAÇÃO - SSII6",
            "PROJETO DE SISTEMAS II - PS2I6","DESENVOLVIMENTO DE SISTEMAS WEB - DSWI6","EMPREENDEDORISMO - EMPI6"
    };

    private static final String[] SEMESTRES=new String[]{
            " * SELECIONE O SEMESTRE ATUAL* ","1º SEMESTRE","2º SEMESTRE","3º SEMESTRE","4º SEMESTRE","5º SEMESTRE","6º SEMESTRE"
    };

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        final Spinner combo=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adp=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,DISCIPLINAS);
        adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo.setAdapter(adp);

        combo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView txtUm=(TextView)findViewById(R.id.txtReq1);
                TextView txtDois=(TextView)findViewById(R.id.txtReq2);
                TextView txtTres=(TextView)findViewById(R.id.txtReq3);
                if (combo.getSelectedItem()=="SISTEMAS OPERACIONAIS - SOPI2"){
                    limpar();
                    txtUm.setText(" * ARQUITETURA DE COMPUTADORES");
                }else if (combo.getSelectedItem()=="INGLÊS TÉCNICO AVANÇADO - IGTI2"){
                    limpar();
                    txtUm.setText(" * INGLÊS TÉCNICO");
                }else if (combo.getSelectedItem()=="LINGUAGEM DE PROGRAMAÇÃO II - LP2I2") {
                    limpar();
                    txtUm.setText(" * ALGORITMOS E PROGRAMAÇÃO");
                    txtDois.setText(" * LINGUAGEM DE PROGRAMAÇÃO");
                }else if (combo.getSelectedItem()=="MATEMÁTICA FINANCEIRA - MFII3") {
                    limpar();
                    txtUm.setText(" * MATEMÁTICA");
                }else if (combo.getSelectedItem()=="BANCO DE DADOS II - BD2I3"){
                    limpar();
                    txtUm.setText(" * BANCO DE DADOS I");
                }else if (combo.getSelectedItem()=="LINGUAGEM DE PROGRAMAÇÃO III - LP3I3"){
                    limpar();
                    txtUm.setText(" * BANCO DE DADOS I");
                    txtDois.setText(" * LINGUAGEM DE PROGRAMAÇÃO II");
                }else if (combo.getSelectedItem()=="ESTRUTURA DE DADOS I - ED1I3"){
                    limpar();
                    txtUm.setText(" * LINGUAGEM DE PROGRAMAÇÃO II");
                }else if (combo.getSelectedItem()=="ANÁLISE ORIENTADA A OBJETOS - AOOI3"){
                    limpar();
                    txtUm.setText(" * ENGENHARIA DE SOFTWARE");
                }else if (combo.getSelectedItem()=="INTERAÇÃO HUMANO-COMPUTADOR - IHCI3"){
                    limpar();
                    txtUm.setText(" * ENGENHARIA DE SOFTWARE");
                }else if (combo.getSelectedItem()=="ESTATÍSTICA - ESTI4"){
                    limpar();
                    txtUm.setText(" * MATEMÁTICA");
                }else if (combo.getSelectedItem()=="REDES DE COMPUTADORES - RCOI4"){
                    limpar();
                    txtUm.setText(" * SISTEMAS OPERACIONAIS");
                }else if (combo.getSelectedItem()=="PROGRAMAÇÃO ORIENTADA A OBJETOS - POOI4") {
                    limpar();
                    txtUm.setText(" * LINGUAGEM DE PROGRAMAÇÃO III");
                    txtDois.setText(" * ANÁLISE ORIENTADA A OBJETOS");
                }else if (combo.getSelectedItem()=="ESTRUTURA DE DADOS II - ED2I4"){
                    limpar();
                    txtUm.setText(" * ESTRUTURA DE DADOS I");
                }else if (combo.getSelectedItem()=="ARQUITETURA DE SOFTWARE - ASWI4"){
                    limpar();
                    txtUm.setText(" * ANÁLISE ORIENTADA A OBJETOS");
                }else if (combo.getSelectedItem()=="SERVICOS DE REDE - SSRI5"){
                    limpar();
                    txtUm.setText(" * REDES DE COMPUTADORES");
                }else if (combo.getSelectedItem()=="PROJETO DE SISTEMAS I - PS1I5") {
                    limpar();
                    txtUm.setText(" * METODOLOGIA DE PESQUISA CIENTÍFICA");
                    txtDois.setText(" * PROGRAMAÇÃO ORIENTADA A OBJETOS");
                    txtTres.setText(" * ARQUITETURA DE SOFTWARE");
                }else if (combo.getSelectedItem()=="QUALIDADE DE SOFTWARE - QSWI5"){
                    limpar();
                    txtUm.setText(" * ANÁLISE ORIENTADA A OBJETOS");
                }else if (combo.getSelectedItem()=="GESTÃO DE PROJETOS - GPRI5") {
                    limpar();
                    txtUm.setText(" * ANÁLISE ORIENTADA A OBJETOS");
                    txtDois.setText(" * INTRODUÇÃO À ADMINISTRAÇÃO");
                }else if (combo.getSelectedItem()=="SEGURANÇA DA INFORMAÇÃO - SSII6"){
                    limpar();
                    txtUm.setText(" * SERVIÇOS DE REDE");
                }else if (combo.getSelectedItem()=="PROJETO DE SISTEMAS II - PS2I6"){
                    limpar();
                    txtUm.setText(" * PROJETO DE SISTEMAS I");
                }else if (combo.getSelectedItem()=="DESENVOLVIMENTO DE SISTEMAS WEB - DSWI6") {
                    limpar();
                    txtUm.setText(" * PROGRAMAÇÃO ORIENTADA A OBJETOS");
                    txtDois.setText(" * DESENVOLVIMENTO WEB");
                }else if (combo.getSelectedItem()=="EMPREENDEDORISMO - EMPI6"){
                    limpar();
                    txtUm.setText(" * INTRODUÇÃO À ADMINISTRAÇÃO");
                }else{
                    limpar();
                }
            }


            public void limpar(){
                TextView txtUm=(TextView)findViewById(R.id.txtReq1);
                TextView txtDois=(TextView)findViewById(R.id.txtReq2);
                TextView txtTres=(TextView)findViewById(R.id.txtReq3);
                txtUm.setText("");
                txtDois.setText("");
                txtTres.setText("");

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Spinner cboSemestre=(Spinner)findViewById(R.id.cboSemestre);
        ArrayAdapter<String> adpSemestre=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,SEMESTRES);
        adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cboSemestre.setAdapter(adpSemestre);


        cboSemestre.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            CheckBox ch1=(CheckBox)findViewById(R.id.chbMateria1);
            CheckBox ch2=(CheckBox)findViewById(R.id.chbMateria2);
            CheckBox ch3=(CheckBox)findViewById(R.id.chbMateria3);
            CheckBox ch4=(CheckBox)findViewById(R.id.chbMateria4);
            CheckBox ch5=(CheckBox)findViewById(R.id.chbMateria5);
            CheckBox ch6=(CheckBox)findViewById(R.id.chbMateria6);
            CheckBox ch7=(CheckBox)findViewById(R.id.chbMateria7);

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (cboSemestre.getSelectedItem()=="1º SEMESTRE"){
                    limpa();
                    ch7.setVisibility(View.VISIBLE);
                    ch1.setText("HCTI1");
                    ch2.setText("INGI1");
                    ch3.setText("CEEI1");
                    ch4.setText("MATI1");
                    ch5.setText("APOI1");
                    ch6.setText("ARQI1");
                    ch7.setText("LP1I1");
                }else if (cboSemestre.getSelectedItem()=="2º SEMESTRE"){
                    limpa();
                    ch1.setText("ADMI2");
                    ch2.setText("BD1I2");
                    ch3.setText("ESWI2");
                    ch4.setText("SOPI2");
                    ch5.setText("LP2I2");
                    ch6.setText("IGTI2");

                }else if (cboSemestre.getSelectedItem()=="3º SEMESTRE"){
                    limpa();
                    ch1.setText("AOOI3");
                    ch2.setText("BD2I3");
                    ch3.setText("IHCI3");
                    ch4.setText("ED1I3");
                    ch5.setText("LP3I3");
                    ch6.setText("MFII3");

                }else if (cboSemestre.getSelectedItem()=="4º SEMESTRE"){
                    limpa();
                    ch1.setText("MPCI4");
                    ch2.setText("ESTI4");
                    ch3.setText("ED2I4");
                    ch4.setText("POOI4");
                    ch5.setText("RCOI4");
                    ch6.setText("ASWI4");

                }else if (cboSemestre.getSelectedItem()=="5º SEMESTRE"){
                    limpa();
                    ch1.setText("GPRI5");
                    ch2.setText("DWEI5");
                    ch3.setText("PS1I5");
                    ch4.setText("QSWI5");
                    ch5.setText("SSRI5");
                    ch6.setText("EL1I5");
                }else if (cboSemestre.getSelectedItem()=="6º SEMESTRE"){
                    limpa();
                    ch1.setText("EMPI6");
                    ch2.setText("TPEI6");
                    ch3.setText("SSII6");
                    ch4.setText("DSWI6");
                    ch5.setText("PS2I6");
                    ch6.setText("EL2I6");
                }else{
                    limpa();
                }
            }

            public void limpa(){
                ch7.setVisibility(View.INVISIBLE);
                ch1.setText("");
                ch2.setText("");
                ch3.setText("");
                ch4.setText("");
                ch5.setText("");
                ch6.setText("");
                ch7.setText("");
                ch1.setChecked(false);
                ch2.setChecked(false);
                ch3.setChecked(false);
                ch4.setChecked(false);
                ch5.setChecked(false);
                ch6.setChecked(false);
                ch7.setChecked(false);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

}


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            Intent sobre= new Intent(MainActivity.this,Sobre.class);
            startActivity(sobre);
            return true;
        }else if (id == R.id.ifsp) {

            Intent ifsp= new Intent(MainActivity.this,Main2Activity.class);
            startActivity(ifsp);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
