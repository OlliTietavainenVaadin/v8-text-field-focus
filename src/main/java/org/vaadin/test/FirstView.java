package org.vaadin.test;

import com.vaadin.navigator.View;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public class FirstView extends VerticalLayout implements View {

    public FirstView() {
        addComponent(new Label("first view, open and close window to navigate to second view"));

        Window window = new Window();
        window.setWidth("300px");
        window.setHeight("300px");
        window.addCloseListener(e -> UI.getCurrent().getNavigator().navigateTo("secondview"));
        VerticalLayout windowContent = new VerticalLayout();
        windowContent.addComponent(new Label("in window"));
        window.setContent(windowContent);


        Button button = new Button("Open window", e -> UI.getCurrent().addWindow(window));
        addComponent(button);
    }
}
