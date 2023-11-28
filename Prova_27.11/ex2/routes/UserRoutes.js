const express = require('express');
const UserController = require('../controllers/UserController');
const UserService = require('../services/UserService');
const UserModel = require('../models').User;

const router = express.Router();
const userController = new UserController(new UserService(UserModel));

router.post('/api/usuarios/registrar', (req, res) => userController.register(req, res));

module.exports = router;
