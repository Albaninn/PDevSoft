const express = require('express');
const userRoutes = require('./routes/UserRoutes');
const productRoutes = require('./routes/ProductRoutes');

const app = express();

app.use(express.json());
app.use(userRoutes);
app.use(productRoutes);

const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
  console.log(`Servidor rodando na porta ${PORT}`);
});
