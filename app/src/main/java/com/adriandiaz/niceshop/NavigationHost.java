package com.adriandiaz.niceshop;

import androidx.fragment.app.Fragment;
/*
*  un host(decidir que pantalla se va mostrar segun el evento de navegacion)
* */
public interface NavigationHost {
    /*
    *   Disparador de navegacion hacia un fragmento especifico
    * */
    void navigateTo(Fragment fragment, boolean addToBackstack);
}