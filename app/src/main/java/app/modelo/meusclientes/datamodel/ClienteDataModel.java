package app.modelo.meusclientes.datamodel;

public class ClienteDataModel {
    //Toda Classe Data Model tem esta Estrutura
    //1 - Atributo nome da tabela
    public static final String TABELA = "Cliente";

    //2 -  Atributo um para um com os nomes dos campos
    public static final String ID = "id";//String
    public static final String NOMECOMPLETO = "nomeCompleto";//String
    public static final String TELEFONE = "telefone";//String
    public static final String EMAIL = "email";//String
    public static final String CEP = "cep";//String
    public static final String LOGRADOURO = "logradouro";//String
    public static final String NUMERO = "numero";//int
    public static final String BAIRRO = "bairro";//String
    public static final String CIDADE = "cidade";//String
    public static final String ESTADO = "estado";//String
    public static final String TERMO_DE_USO = "termoDeUso";//int

    //3 - Query para criar a tabela no banco de dados
    public static String queryCriarTabela = "";

    //4 - Metodo para gerar o Script para criar a tabela
    public static String criarTabela(){

        queryCriarTabela += "CREATE TABLE " + TABELA + " ( ";
        queryCriarTabela += ID + " integer primary key autoincrement, ";
        queryCriarTabela += NOMECOMPLETO + " text, ";
        queryCriarTabela += TELEFONE + " text, ";
        queryCriarTabela += EMAIL + " text, ";
        queryCriarTabela += CEP + " text, ";
        queryCriarTabela += LOGRADOURO + " text, ";
        queryCriarTabela += NUMERO + " integer, ";
        queryCriarTabela += BAIRRO + " text, ";
        queryCriarTabela += CIDADE + " text, ";
        queryCriarTabela += ESTADO + " text, ";
        queryCriarTabela += TERMO_DE_USO + " integer ";
        queryCriarTabela += " )";

        return queryCriarTabela;
    }

    //5 - Query de consulta gerais


}
