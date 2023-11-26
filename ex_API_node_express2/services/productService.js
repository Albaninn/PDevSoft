// services/productService.js
const Product = require('../models/product');

class ProductService {
  async createProduct(name, category, listPrice) {
    return Product.create({ name, category, listPrice });
  }

  async getProductById(id) {
    return Product.findByPk(id);
  }

  async getAllProducts() {
    return Product.findAll();
  }
}

module.exports = new ProductService();
