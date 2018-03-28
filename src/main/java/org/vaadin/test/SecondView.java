package org.vaadin.test;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class SecondView extends VerticalLayout implements View {

    TextField textField = new TextField("text field");

    public SecondView() {
        addComponent(new Label("second view"));
        addComponent(textField);

    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        textField.focus();
    }
}
