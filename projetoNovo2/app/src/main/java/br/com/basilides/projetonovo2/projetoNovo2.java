package br.com.basilides.projetonovo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class projetoNovo2 extends AppCompatActivity {

    private Button btnEnviar;
    private TextView txvNomeSenha;
    private EditText txtNome;
    private EditText txtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projeto_novo2);

        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        txvNomeSenha = (TextView) findViewById(R.id.txvNomeSenha);
        txtNome = (EditText) findViewById(R.id.txtNome);
        txtSenha = (EditText) findViewById(R.id.txtSenha);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txvNomeSenha.setText(txtNome.getText()+" - "+ txtSenha.getText());
            }
        });
    }
}
