class ProductService {
    constructor(ProductModel) {
      this.Product = ProductModel;
    }
  
    async createProduct(productData) {
      const product = await this.Product.create(productData);
      return product;
    }
  
    // ... outros métodos
  }
  
  module.exports = ProductService;
  