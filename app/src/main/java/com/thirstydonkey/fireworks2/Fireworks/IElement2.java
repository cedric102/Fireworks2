package com.thirstydonkey.fireworks2.Fireworks;

public interface IElement2 {
    class Coord {
        class Position {
            int x;
            int y;
        }
        class Speed {
            int x;
            int y;
        }
        Position position;
        Speed speed;

        Coord() {
            position = new Position();
            speed = new Speed();
        }
        Coord(Coord coord) {
            position = new Position();
            speed = new Speed();
            position.x = coord.position.x;
            position.y = coord.position.y;
            speed.x = coord.speed.x;
            speed.y = coord.speed.y;
        }
    }

    Coord GetCoord();
    void SetCoord(Coord coord);

    void Notified(String str);
    void Update();
    String Snapshot();

    IElement2 Clone();
    IElement2 Clone(String str);
}
