package com.tts.equalsdemo;

import java.util.Objects;

public class PointV1 {

    int x;
    int y;

    public PointV1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointV1 p = (PointV1) o;
        return x == p.x &&
                y == p.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
