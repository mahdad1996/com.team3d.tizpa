package com.team3d;

public class mul {
    int [][] multi =new int[5][5];
    public mul(){
        multi[0][0] = 1;
        multi[0][1] = 2;
        multi[0][2] = 2;
        multi[0][3] = 4;
        multi[0][4] = 3;
        //
        multi[1][0] = 2;
        multi[1][1] = 1;
        multi[1][2] = 4;
        multi[1][3] = 2;
        multi[1][4] = 3;
        //
        multi[2][0] = 3;
        multi[2][1] = 5;
        multi[2][2] = 1;
        multi[2][3] = 3;
        multi[2][4] = 1;
        //
        multi[3][0] = 4;
        multi[3][1] = 3;
        multi[3][2] = 3;
        multi[3][3] = 1;
        multi[3][4] = 2;
        //
        multi[4][0] = 3;
        multi[4][1] = 3;
        multi[4][2] = 2;
        multi[4][3] = 2;
        multi[4][4] = 1;

    }

    public int getAreaRate(int from,int to){
        int x=0;
        for(int i=0;i<multi.length;++i){
            for (int j=0;j<multi[i].length;++j){
                 if(multi[i][j] == multi[from][to])
                     return multi[i][j];
            }
        }

        return x;
    }
}
