package com.libreria.sevice;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
