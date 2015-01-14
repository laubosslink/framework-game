package games.huit_dragons.modele;

public class Jeton {

    int posX;
    int posY;

    public Jeton(int posX, int posY) {
        super();
        this.posX = posX;
        this.posY = posY;
    }

    public int[] getPos() {
        int[] res = new int[2];
        res[0] = posX;
        res[1] = posY;
        return res;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

}
