package Lab10;

import java.util.Date;

abstract public class GeometricObject {
            private String color;
            private boolean filled;
            private Date dateCreated;
            
            protected GeometricObject() {
            	this.color="Blue";
            	this.filled=false;
            	this.dateCreated = new Date();
            }
            protected GeometricObject(String color,boolean filled) {
            	this.color=color;
            	this.filled=filled;
            	this.dateCreated = new Date();
            }
			public String getColor() {
				return color;
			}
			public boolean isFilled() {
				return filled;
			}
			public Date getDateCreated() {
				return dateCreated;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public void setFilled(boolean filled) {
				this.filled = filled;
			}
			public void setDateCreated(Date dateCreated) {
				this.dateCreated = dateCreated;
			}
			public abstract double getArea();
			public abstract double getPerimeter();
			@Override
			public String toString() {
				return "GeometricObject [color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + "]";
			}

            
}
