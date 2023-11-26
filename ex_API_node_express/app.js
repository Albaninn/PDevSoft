const express = require('express');
const jwt = require('jsonwebtoken');
const app = express();
const port = 3000;
app.use(express.json());

const users = [
    // Exemplo de usuário
    { id: 1, username: "lukas", password: "qwe123" },
    { id: 2, username: "john", password: "qwe123" }
    // Adicione mais usuários conforme necessário
];

app.post('/login', (req, res) => {
    // Autenticação do usuário
    const { username, password } = req.body;
    const user = users.find(u => u.username === username && u.password === password);

    if (user) {
        // Usuário autenticado
        const token = jwt.sign({ id: user.id }, 'TokenComplicado', { expiresIn: '1h' });
        res.json({ token });
    } else {
        res.status(401).send('Credenciais inválidas');
    }
});

// Middleware para permitir o uso de JSON no corpo das requisições
app.use(express.json());

function authenticateToken(req, res, next) {
     const authHeader = req.headers['authorization'];
     const token = authHeader && authHeader.split(' ')[1];
 
     if (token == null) return res.sendStatus(401);
 
     jwt.verify(token, 'TokenComplicado', (err, user) => {
         if (err) return res.sendStatus(403);
         req.user = user;
         next();
     });
 }

 app.get('/algum-endpoint-protegido', authenticateToken, (req, res) => {
     // Lógica do endpoint
     res.json({ mensagem: 'Você está autenticado!' });
 });

// Rota de teste para verificar se a API está no ar
app.get('/status', (req, res) => {
     res.json({ message: 'API is up and running' });
});

// Rota para receber dados de um cliente e imprimir no console
app.post('/client-data', (req, res) => {
     console.log('Dados do Cliente:', req.body);
     res.json({ message: 'Dados do cliente recebidos com sucesso' });
});

// Rota para receber dados de um cliente e autorizar se a idade for maior que 18 anos
app.post('/authorize', (req, res) => {
     const { name, age } = req.body;

     if (age > 18) {
          res.json({ message: 'Autorizado' });
     } else {
          res.status(401).json({ message: 'Não autorizado' });
     }
 });

app.listen(port, () => {
     console.log(`Servidor rodando na porta ${port}`);
});

// app.js
const productController = require('./controllers/productController');

// Rotas para produtos
app.post('/products', productController.createProduct);
app.get('/products/:id', productController.getProductById);
app.get('/products', productController.getAllProducts);
