package Stream.StreamAPI.Lession18.HW_14.MyHW.Task01;

public class Product{
        private final String typeOfProduct;
        private final int priceOfProduct;

        public Product(String typeOfProduct, int priceOfProduct) {
            this.typeOfProduct = typeOfProduct;
            this.priceOfProduct = priceOfProduct;
        }

        public String getTypeOfProduct() {
            return typeOfProduct;
        }

        public int getPriceOfProduct() {
            return priceOfProduct;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "typeOfProduct='" + typeOfProduct + '\'' +
                    ", priceOfProduct=" + priceOfProduct +
                    '}';
        }

}

