package com.mygdx.ttrispo.Pantalla;

public class PiezaL {

    public static final int T = 1; //¿ actualizar estos valores ya que es otra pieza?
    public static final int I = 2;
    public static final int VACIA = 0;

    protected int f,c, numBlock;
    private int giro = 1; // ¿Deberia llamarse orientacion la variable o postura ?
    private int tipo;

    public PiezaL(int f,int c) {
        this.f = f;
        this.c = c;
        tipo = Pieza.T;
        this.numBlock = 4;
    }

    protected int [][] getPosicionPieza(){ // ¿Deberia llamarse giroPiezaLDerecha el metodo?
        int [][] r = new int[numBlock][2]; // Cada fila del array representa las coordenadas de uno de los bloques que forman la pieza
        switch (giro){
            case(1):
                // 0º -> 90º  (orientacion 1 a orientacion 2)
                r[0][0] = this.f - 1; // Fila
                r[0][1] = this.c + 1; // Columna

                r[1][0] = this.f;
                r[1][1] = this.c;

                r[2][0] = this.f + 1;
                r[2][1] = this.c - 1;

                r[3][0] = this.f + 2;
                r[3][1] = this.c;
                //giro = 2; // ¿Actualizar la nueva "orientacion" de la pieza?
                break;

            case(2): // 90º -> 180º  (orientacion 2 a orientacion 3)
                r[0][0] = this.f + 1; // Fila
                r[0][1] = this.c + 1 ; // Columna

                r[1][0] = this.f;
                r[1][1] = this.c;

                r[2][0] = this.f - 1;
                r[2][1] = this.c - 1;

                r[3][0] = this.f;
                r[3][1] = this.c - 2;
               // giro = 3; // ¿Actualizar la nueva "orientacion" de la pieza?
                break;
            case(3): // 180º -> 270º  (orientacion 3 a orientacion 4)
                r[0][0] = this.f + 1 ; // Fila
                r[0][1] = this.c - 1 ; // Columna

                r[1][0] = this.f;
                r[1][1] = this.c;

                r[2][0] = this.f - 1;
                r[2][1] = this.c + 1;

                r[3][0] = this.f - 2;
                r[3][1] = this.c;
               // giro = 4; // ¿Actualizar la nueva "orientacion" de la pieza?
                break;
            case(4): // 270º -> 0º  (orientacion 4 a orientacion 1)
                r[0][0] = this.f - 1; // Fila
                r[0][1] = this.c - 1; // Columna

                r[1][0] = this.f;
                r[1][1] = this.c;

                r[2][0] = this.f + 1;
                r[2][1] = this.c + 1;

                r[3][0] = this.f;
                r[3][1] = this.c + 2;
               // giro = 1; // ¿Actualizar la nueva "orientacion" de la pieza?
                break;
        }
        return r;
    }

    public int [][] getPosicionAbajo(){
        int [][] r = this.getPosicionPieza();
        for (int i = 0; i < r.length; i++) {
            r[i][0]++;
        }
        return r;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getTipo() {
        return this.tipo;
    }
}