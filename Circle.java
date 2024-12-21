package Errors;

class Circle{
        public int radius;
        public double area;
        public void setArea() {
            this.area = 3.14 * (this.radius) * (this.radius);
        }
        Circle() {
        }
        Circle(int r) {
            this.radius = r;
        }
    }