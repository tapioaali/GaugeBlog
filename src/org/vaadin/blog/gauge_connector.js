org_vaadin_blog_Gauge = function () {
	
	var domId = this.getState().domId;
	
	var canvasElement = document.createElement('canvas');
	canvasElement.setAttribute('id', domId);
	this.getElement().appendChild(canvasElement);
	
    var gauge = new Gauge({
        renderTo: domId,
        value: this.getState().value
    });
    gauge.draw();
    
    this.onStateChange = function () {
    	gauge.setValue(this.getState().value);
    };
};

