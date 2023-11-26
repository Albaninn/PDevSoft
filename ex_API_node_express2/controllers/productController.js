// controllers/productController.js
const productService = require('../services/productService');

class ProductController {
  async createProduct(req, res) {
    const { name, category, listPrice } = req.body;

    try {
      const newProduct = await productService.createProduct(name, category, listPrice);
      res.status(201).json(newProduct);
    } catch (error) {
      console.error('Erro ao criar produto:', error);
      res.status(500).json({ error: 'Erro ao criar produto.' });
    }
  }

  async getProductById(req, res) {
    const { id } = req.params;

    try {
      const product = await productService.getProductById(id);
      res.status(200).json(product);
    } catch (error) {
      console.error('Erro ao buscar produto:', error);
      res.status(500).json({ error: 'Erro ao buscar produto.' });
    }
  }

  async getAllProducts(req, res) {
    try {
      const products = await productService.getAllProducts();
      res.status(200).json(products);
    } catch (error) {
      console.error('Erro ao buscar produtos:', error);
      res.status(500).json({ error: 'Erro ao buscar produtos.' });
    }
  }
}

module.exports = new ProductController();
