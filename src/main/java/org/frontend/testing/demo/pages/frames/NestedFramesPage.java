package org.frontend.testing.demo.pages.frames;

import net.serenitybdd.screenplay.targets.Target;

public class NestedFramesPage {
    public static final Target FRAME_PARENT = Target.the("Box Parent frame").locatedBy("");
    public static final Target FRAME_CHILD = Target.the("Box Child frame").locatedBy("");

}
