package com.modfactory.scenes;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.paint.Paint;

public class NewModScene extends Scene {
    public NewModScene(Parent parent) {
        super(parent);
    }

    public NewModScene(Parent parent, double v, double v1) {
        super(parent, v, v1);
    }

    public NewModScene(Parent parent, Paint paint) {
        super(parent, paint);
    }

    public NewModScene(Parent parent, double v, double v1, Paint paint) {
        super(parent, v, v1, paint);
    }

    public NewModScene(Parent parent, double v, double v1, boolean b) {
        super(parent, v, v1, b);
    }

    public NewModScene(Parent parent, double v, double v1, boolean b, SceneAntialiasing sceneAntialiasing) {
        super(parent, v, v1, b, sceneAntialiasing);
    }
}
