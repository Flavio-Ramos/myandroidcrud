package app.modelo.meusclientes.controller;

import android.content.Context;
import android.util.Log;

import app.modelo.meusclientes.api.AppUtil;
import app.modelo.meusclientes.datasource.AppDataBase;

public class ClienteController extends AppDataBase {

    public ClienteController(Context context) {
        super(context);

        Log.d(AppUtil.TAG, "ClienteController: Conectado");
    }
}