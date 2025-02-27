package edu.eci.arsw.blacklistvalidator;

public class VidaHilo extends Thread {

    private int NumHilos;

    public void vidaHilo(int numHilos){
        for(int i=0; i < numHilos; i++){
            VidaHilo vh = new VidaHilo();
            vh.start();
        }
    }

    @Override
    public void run() {
        super.run();
    }
}
