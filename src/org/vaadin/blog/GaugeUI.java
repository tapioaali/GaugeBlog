package org.vaadin.blog;

import java.util.Random;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class GaugeUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout mainLayout = new VerticalLayout();
        mainLayout.setSpacing(true);
        mainLayout.setMargin(true);
        setContent(mainLayout);

        HorizontalLayout gaugeLayout = new HorizontalLayout();
        final Gauge gauge = new Gauge("gauge");
        gaugeLayout.addComponent(gauge);

        final Gauge gauge2 = new Gauge("gauge2");
        gaugeLayout.addComponent(gauge2);

        mainLayout.addComponent(gaugeLayout);

        Button b = new Button("Randomize!", new Button.ClickListener() {

            @Override
            public void buttonClick(ClickEvent event) {
                Random ran = new Random();
                int rand1 = ran.nextInt(100);
                gauge.setValue(rand1);

                int rand2 = ran.nextInt(100);
                gauge2.setValue(rand2);

            }
        });
        mainLayout.addComponent(b);
    }

}