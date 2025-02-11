package com.company.command;

import java.awt.*;

public class DrawCommand implements Command, Cloneable {
    private Drawable drawable;
    private Point point;

    public DrawCommand(Drawable drawable, Point point) {
        this.drawable = drawable;
        this.point = point;
    }

    @Override
    public void execute() {
        drawable.draw(point.x, point.y);
    }
}
