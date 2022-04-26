package com.thirstydonkey.fireworks2;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

import com.thirstydonkey.fireworks2.Fireworks.Particle;
import com.thirstydonkey.fireworks2.Fireworks.PublisherBox;

public class Display extends View {

    PublisherBox publisherBox;
    int count = 0;

    public Display(Context ctx) {
        super(ctx);
        System.out.println("Display");
        publisherBox = new PublisherBox();
        publisherBox.Register(new Particle("Name 1" , 300,500));
        publisherBox.Register(new Particle("Name 2" , 350,550));
        publisherBox.Register(new Particle("Name 3" , 400,600));
        publisherBox.Notify("NotifiedDisplay");
    }

    @Override
    public void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        invalidate();
        if(count > 70) {
            publisherBox.Clone("Cloning");
            count = 0;
        }
        ++count;

        publisherBox.Notify("NotifiedDisplay");
        publisherBox.Snapshot("NotifiedDisplay" , canvas);
    }
}
