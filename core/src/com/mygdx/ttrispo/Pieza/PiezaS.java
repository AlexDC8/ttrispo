package com.mygdx.ttrispo.Pieza;

import com.mygdx.ttrispo.Gestores.GestorRecursos;

public class PiezaS extends Pieza{

    public PiezaS(int f, int c) {
        super(f, c);
        tipo = S;
        this.texture = GestorRecursos.get("S.jpg");
        this.imagen = GestorRecursos.get("SCompleta.png");
    }

    public int [][] getPosicionPieza(){
        int [][] r = new int[super.numBlock][4];
        switch (giro){
            case(1):
                r[0][0] = this.fila + 1; // Fila
                r[0][1] = this.columna - 1; // Columna

                r[1][0] = this.fila + 1;
                r[1][1] = this.columna;

                r[2][0] = this.fila;
                r[2][1] = this.columna;

                r[3][0] = this.fila;
                r[3][1] = this.columna + 1;
                break;

            case(2):
                r[0][0] = this.fila - 1; // Fila
                r[0][1] = this.columna; // Columna

                r[1][0] = this.fila;
                r[1][1] = this.columna;

                r[2][0] = this.fila;
                r[2][1] = this.columna + 1;

                r[3][0] = this.fila + 1;
                r[3][1] = this.columna + 1;
                break;

            case(3):
                r[0][0] = this.fila; // Fila
                r[0][1] = this.columna - 1; // Columna

                r[1][0] = this.fila;
                r[1][1] = this.columna;

                r[2][0] = this.fila - 1;
                r[2][1] = this.columna;

                r[3][0] = this.fila - 1;
                r[3][1] = this.columna + 1;
                break;

            case(4):
                r[0][0] = this.fila - 1; // Fila
                r[0][1] = this.columna - 1; // Columna

                r[1][0] = this.fila;
                r[1][1] = this.columna - 1;

                r[2][0] = this.fila;
                r[2][1] = this.columna;

                r[3][0] = this.fila + 1;
                r[3][1] = this.columna;
                break;
        } 
        return r;
    }
}