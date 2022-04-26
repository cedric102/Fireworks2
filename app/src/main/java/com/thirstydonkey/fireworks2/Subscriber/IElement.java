package com.thirstydonkey.fireworks2.Subscriber;

public interface IElement {
    void Notified(String str);
    void Update();
    String Snapshot();
}
