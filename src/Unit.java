package pkg14b.conqueror;

public class Unit {
    int x = 0, y = 0, pl, health = 0;
    boolean moved = false, alive = true;
    Level gen;
    public Unit(Level gen, int x, int y, int pl, int health){
        this.gen = gen;
        this.pl = pl;
        this.x = x; this.y = y;
        this.health = health;
    }
    public void move(int dir){
        if(!moved&&((gen.t[x][y]!=0&&gen.edge(x,y,1,dir))||(gen.t[x][y]==0&&gen.edge(x,y,3,dir)))){
            moved = true;
            if(gen.t[x][y]!=0){
                switch (dir){
                    case 0:y--;break;case 1:y++;break;
                    case 2:x--;break;case 3:x++;break;
                }
            }
            else{
                switch (dir){
                    case 0:y-=3;break;case 1:y+=3;break;
                    case 2:x-=3;break;case 3:x+=3;break;
                }
            }
            if(gen.u[x][y]!=0/*&&check if unit is not owned by player*/)/*Combat Code*/;
        }
    }
}
