package com.modfactory.scenes;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.paint.Paint;

public class WorkspaceScene extends Scene {
    public WorkspaceScene(Parent parent) {
        super(parent);
    }

    public WorkspaceScene(Parent parent, double v, double v1) {
        super(parent, v, v1);
    }

    public WorkspaceScene(Parent parent, Paint paint) {
        super(parent, paint);
    }

    public WorkspaceScene(Parent parent, double v, double v1, Paint paint) {
        super(parent, v, v1, paint);
    }

    public WorkspaceScene(Parent parent, double v, double v1, boolean b) {
        super(parent, v, v1, b);
    }

    public WorkspaceScene(Parent parent, double v, double v1, boolean b, SceneAntialiasing sceneAntialiasing) {
        super(parent, v, v1, b, sceneAntialiasing);
    }
}
