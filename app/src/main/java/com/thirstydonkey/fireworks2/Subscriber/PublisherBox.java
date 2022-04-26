package com.thirstydonkey.fireworks2.Subscriber;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.thirstydonkey.fireworks2.Prototype.Prototype;

import java.util.ArrayList;

public class PublisherBox {
    private ArrayList<IElement> subscriberList;
    public PublisherBox() {
        subscriberList = new ArrayList<>();
    }
    public void Add() {
        subscriberList.add(new Subscrib("Box"));
    }
    public void Register(IElement Elem) {
        subscriberList.add(Elem);
    }
    public void DeRegister(IElement Elem) {
        subscriberList.remove(Elem);
    }
    public void Notify(String str) {
        for(IElement elem : subscriberList) {
            elem.Notified(str);
            elem.Update();
        }
    }
    public void Snapshot(String str , Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        for(IElement elem : subscriberList) {
            canvas.drawCircle((float)(((Prototype) elem).GetX()),((Prototype) elem).GetY(),20, paint);
        }
    }

}
