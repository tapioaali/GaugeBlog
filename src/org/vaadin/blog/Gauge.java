package org.vaadin.blog;

import com.vaadin.annotations.JavaScript;
import com.vaadin.ui.AbstractJavaScriptComponent;

@JavaScript({ "gauge.js", "gauge_connector.js" })
public class Gauge extends AbstractJavaScriptComponent {

    public Gauge(String domId) {
        getState().domId = domId;
    }

    public void setValue(int value) {
        getState().value = value;
    }

    @Override
    protected GaugeState getState() {
        return (GaugeState) super.getState();
    }
}
