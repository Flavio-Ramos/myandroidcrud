package app.modelo.meusclientes.view;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import app.modelo.meusclientes.R;
import app.modelo.meusclientes.controller.ClienteController;
import app.modelo.meusclientes.model.Cliente;


public class ModeloAdicionarClientesFragment extends Fragment {

    View view;

    TextView txtTitulo;

    EditText editxtNomeCompleto, editxtTelefone, editxtEmail;
    EditText editxtCep, editxtLogradouro, editxtNumero;
    EditText editxtBairro, editxtCidade, editxtEstado;

    CheckBox ckbTermoDeUso;

    Button btnSalvar, btnCancelar;

    Cliente novoCliente;
    ClienteController clienteController;

    public ModeloAdicionarClientesFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_adicionar_clientes, container, false);

        iniciarComponentesDeLayout();

        escultarEventosDosBotoes();

        return view;
    }


    /*
     *inicializar os componentes do layout/adicionarclientes
     */
    private void iniciarComponentesDeLayout() {

        txtTitulo = view.findViewById(R.id.txtTitulo);
        txtTitulo.setText(R.string.novoCliente);

        editxtNomeCompleto = view.findViewById(R.id.editxtNomeCompleto);
        editxtTelefone = view.findViewById(R.id.editxtTelefone);
        editxtEmail = view.findViewById(R.id.editxtEmail);
        editxtCep = view.findViewById(R.id.editxtCep);
        editxtLogradouro = view.findViewById(R.id.editxtLogradouro);
        editxtNumero = view.findViewById(R.id.editxtNumero);
        editxtBairro = view.findViewById(R.id.editxtBairro);
        editxtCidade = view.findViewById(R.id.editxtCidade);
        editxtEstado = view.findViewById(R.id.editxtEstado);

        ckbTermoDeUso = view.findViewById(R.id.ckbTermoDeUso);

        btnSalvar = view.findViewById(R.id.btnSalvar);
        btnCancelar = view.findViewById(R.id.btnCancelar);

        novoCliente = new Cliente();
        clienteController = new ClienteController(getContext());
    }

    private void escultarEventosDosBotoes() {
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean isDadosOk = true;
                if (TextUtils.isEmpty(editxtNomeCompleto.getText())) {
                    isDadosOk = false;
                    editxtNomeCompleto.setError("Digite o nome completo....");
                    editxtNomeCompleto.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(editxtTelefone.getText())) {
                    isDadosOk = false;
                    editxtTelefone.setError("Digite o Telefone ....");
                    editxtTelefone.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(editxtEmail.getText())) {
                    isDadosOk = false;
                    editxtEmail.setError("Digite o Email....");
                    editxtEmail.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(editxtCep.getText())) {
                    isDadosOk = false;
                    editxtCep.setError("Digite o Cep....");
                    editxtCep.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(editxtLogradouro.getText())) {
                    isDadosOk = false;
                    editxtLogradouro.setError("Digite o Logradouro....");
                    editxtLogradouro.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(editxtNumero.getText())) {
                    isDadosOk = false;
                    editxtNumero.setError("Digite o Número....");
                    editxtNumero.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(editxtBairro.getText())) {
                    isDadosOk = false;
                    editxtBairro.setError("Informe o Bairro....");
                    editxtBairro.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(editxtCidade.getText())) {
                    isDadosOk = false;
                    editxtCidade.setError("Informe a Cidade....");
                    editxtCidade.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(editxtEstado.getText())) {
                    isDadosOk = false;
                    editxtEstado.setError("Informe o Estado....");
                    editxtEstado.requestFocus();
                    return;
                }

                if (isDadosOk) {
                    novoCliente.setNomeCompleto(editxtNomeCompleto.getText().toString());
                    novoCliente.setTelefone(editxtTelefone.getText().toString());
                    novoCliente.setEmail(editxtEmail.getText().toString());
                    novoCliente.setCep(Integer.parseInt(editxtCep.getText().toString()));
                    novoCliente.setLogradouro(editxtLogradouro.getText().toString());
                    novoCliente.setNumero(editxtNumero.getText().toString());
                    novoCliente.setBairro(editxtBairro.getText().toString());
                    novoCliente.setCidade(editxtCidade.getText().toString());
                    novoCliente.setEstado(editxtEstado.getText().toString());
                    novoCliente.setTermoDeUso(ckbTermoDeUso.isChecked());

                    clienteController.incluir(novoCliente);
                } else {
                    Log.i("log_add_clientes", "onClick: Dados incorretos...");
                }

            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
