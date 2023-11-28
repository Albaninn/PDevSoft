class UserController {
    constructor(UserService) {
      this.userService = UserService;
    }
  
    async register(req, res) {
      try {
        const user = await this.userService.createUser(req.body);
        res.status(201).json(user);
      } catch (error) {
        res.status(400).json({ error: error.message });
      }
    }
  
    // ... outros métodos
  }
  
  module.exports = UserController;
  