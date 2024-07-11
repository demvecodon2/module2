package ss4.bai_tap;

    public class PhuongTrinh {
        double a, b, c;

        public PhuongTrinh(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getDelta() {
            return this.b * this.b - 4 * this.a * this.c;
        }

        public double getX1() {
            return (-this.b + Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / (2 * this.a);
        }

        public double getX2() {
            return (-this.b - Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / (2 * this.a);
        }

        public String nghiem() {
            double delta = this.getDelta();
            if (this.a == 0) {
                if (this.b != 0) {
                    return "Phương trình có 1 nghiệm " + -this.c / this.b;
                } else if (this.c == 0) {
                    return "Phương trình có vô số nghiệm";
                } else {
                    return "Phương trình vô nghiệm";
                }
            } else if (delta > 0) {
                return "Phương trình có 2 nghiệm phân biệt X1 =  " + getX1() + " và X2 = " + getX2();
            } else if (delta == 0) {
                return "Phương trình có 2 Nghiệm kép X1 = X2 = " + (-this.b / (2 * this.a));
            } else {
                return "Phương trình vô nghiệm";
            }
        }
    }

