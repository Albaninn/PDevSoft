const express = require('express');
const ProductController = require('../controllers/ProductController');
const ProductService = require('../services/ProductService');
const ProductModel = require('../models').Product;

const router = express.Router();
const productController = new ProductController(new ProductService(ProductModel));

router.post('/api/produtos', (req, res) => productController.createProduct(req, res));

module.exports = router;
