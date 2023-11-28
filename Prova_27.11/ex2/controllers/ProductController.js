class ProductController {
    constructor(ProductService) {
      this.productService = ProductService;
    }
  
    async createProduct(req, res) {
      try {
        const product = await this.productService.createProduct(req.body);
        res.status(201).json(product);
      } catch (error) {
        res.status(400).json({ error: error.message });
      }
    }
  
    // ... outros métodos
  }
  
  module.exports = ProductController;
  