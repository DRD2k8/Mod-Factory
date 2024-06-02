package com.modfactory.scenes;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.paint.Paint;

public class PreferencesScene extends Scene {
    public PreferencesScene(Parent parent) {
        super(parent);
    }

    public PreferencesScene(Parent parent, double v, double v1) {
        super(parent, v, v1);
    }

    public PreferencesScene(Parent parent, Paint paint) {
        super(parent, paint);
    }

    public PreferencesScene(Parent parent, double v, double v1, Paint paint) {
        super(parent, v, v1, paint);
    }

    public PreferencesScene(Parent parent, double v, double v1, boolean b) {
        super(parent, v, v1, b);
    }

    public PreferencesScene(Parent parent, double v, double v1, boolean b, SceneAntialiasing sceneAntialiasing) {
        super(parent, v, v1, b, sceneAntialiasing);
    }
}
